package us.shadowlabs.tdparser.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.h2.tools.RunScript;
import org.junit.*;
import us.shadowlabs.tdparser.ColumnDataStore;
import us.shadowlabs.tdparser.ObjectTracker;
import us.shadowlabs.tdparser.TDInfoParser;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 8/22/2016.
 */
public class TestSelect {
    private static final Logger logger = LogManager.getLogger(TestSelect.class);
    private static String jdbcUrl = "jdbc:h2:./db/columndbtest;AUTO_SERVER=TRUE";
    private static Connection localCon;

    @BeforeClass
    public static void initClass() throws SQLException {
        localCon = DriverManager.getConnection(jdbcUrl,"sa","");
    }

    @AfterClass
    public static void cleanupClass() throws SQLException {
        localCon.close();
    }

    @Before
    public void init() throws SQLException {
        InputStreamReader ir = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("setup_test.sql"));
        RunScript.execute(localCon,ir);
        ColumnDataStore.loadDataStore(jdbcUrl,"sa","");
    }

    @After
    public void cleanup() throws SQLException {
        InputStreamReader ir = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("cleanup_test.sql"));
        RunScript.execute(localCon,ir);
    }

    @Test
    public void testBasicSelect() {
        logger.info(""); logger.info("Starting basic select test.");
        String sql = "SELECT logtbl.LogDate,logtbl.QueryId FROM PDCRINFO.DBQLogTbl_Hst logtbl WHERE logtbl.LogDate = CURRENT_DATE-1;";
        List<ObjectTracker.ObjectInfo> expectedList = new ArrayList<>();
        expectedList.add(new ObjectTracker.ObjectInfo("PDCRINFO","DBQLogTbl_Hst","LogDate",null));
        expectedList.add(new ObjectTracker.ObjectInfo("PDCRINFO","DBQLogTbl_Hst","QueryId",null));
        runTest(expectedList,sql,"SYSDBA");
    }

    @Test
    public void testDerivedSelect() {
        int i = 1;
        logger.info(""); logger.info("Starting derived select test: "+i++);
        String sql = "SELECT logtbl.LogDate,logtbl.QueryId,sqltbl.SqlTextInfo FROM PDCRINFO.DBQLogTbl_Hst logtbl INNER JOIN " +
                "(SELECT sqltbl.LogDate,sqltbl.QueryId,sqltbl.SqlTextInfo FROM PDCRINFO.DBQLSqlTbl_Hst sqltbl ) sqltbl " +
                "ON logtbl.LogDate = sqltbl.LogDate AND logtbl.QueryId = sqltbl.QueryId WHERE logtbl.LogDate = CURRENT_DATE-1;";
        List<ObjectTracker.ObjectInfo> expectedList = new ArrayList<>();
        expectedList.add(new ObjectTracker.ObjectInfo("PDCRINFO","DBQLogTbl_Hst","LogDate",null));
        expectedList.add(new ObjectTracker.ObjectInfo("PDCRINFO","DBQLogTbl_Hst","QueryId",null));
        expectedList.add(new ObjectTracker.ObjectInfo("PDCRINFO","DBQLSqlTbl_Hst","SqlTextInfo",null));
        runTest(expectedList,sql,"SYSDBA");

        logger.info(""); logger.info("Starting derived select test: "+i++);
        sql = "SELECT logtbl.LogDate,logtbl.QueryId,sqltbl.SqlTextInfo FROM PDCRINFO.DBQLogTbl_Hst logtbl INNER JOIN " +
                "(SELECT sqltbl.LogDate,sqltbl.QueryId,SqlTextInfo FROM PDCRINFO.DBQLSqlTbl_Hst sqltbl ) sqltbl " +
                "ON logtbl.LogDate = sqltbl.LogDate AND logtbl.QueryId = sqltbl.QueryId WHERE logtbl.LogDate = CURRENT_DATE-1;";
        runTest(expectedList,sql,"SYSDBA");

        logger.info(""); logger.info("Starting derived select test: "+i++);
        sql = "SELECT logtbl.LogDate AS LogDate,logtbl.QueryId,SqlTextInfo FROM PDCRINFO.DBQLogTbl_Hst logtbl INNER JOIN " +
                "(SELECT sqltbl.LogDate,sqltbl.QueryId,SqlTextInfo FROM PDCRINFO.DBQLSqlTbl_Hst sqltbl ) sqltbl " +
                "ON logtbl.LogDate = sqltbl.LogDate AND logtbl.QueryId = sqltbl.QueryId WHERE logtbl.LogDate = CURRENT_DATE-1;";
        runTest(expectedList,sql,"SYSDBA");
    }

    @Test
    public void testNestedColExpression() {
        int i = 1;
        logger.info(""); logger.info("Starting nested col expr select test: "+i++);
        String sql = "SELECT a.ColumnOne,c.ColumnOne FROM SYSDBA.TestA a, (SELECT b.ColumnOne+b.ColumnTwo AS ColumnOne FROM SYSDBA.TestB b) c;";
        List<ObjectTracker.ObjectInfo> expectedList = new ArrayList<>();
        expectedList.add(new ObjectTracker.ObjectInfo("SYSDBA","TestA","ColumnOne",null));
        expectedList.add(new ObjectTracker.ObjectInfo("SYSDBA","TestB","ColumnOne",null));
        expectedList.add(new ObjectTracker.ObjectInfo("SYSDBA","TestB","ColumnTwo",null));
        runTest(expectedList,sql,"SYSDBA");
    }

    @Test
    public void testSelectStar() {

    }

    @Test
    public void testDefaultDatabase() {

    }

    private void runTest(List<ObjectTracker.ObjectInfo> expectedList,String sql,String defaultDatabase) {
        String logDate = "2016-08-22";
        String queryId = "123456789012345678";
        TDInfoParser parser = new TDInfoParser(logDate,queryId,defaultDatabase,sql);
        List<ObjectTracker.ObjectInfo> infoList = parser.getColumns();
        logger.info("Checking if got expected columns...");
        for (ObjectTracker.ObjectInfo expected : expectedList) {
            boolean found = false;
            for (ObjectTracker.ObjectInfo actual : infoList) {
                found = found || expected.equals(actual);
            }
            if (!found) {
                logger.info("Column Results ----------------------------");
                for (ObjectTracker.ObjectInfo col : infoList) {
                    logger.info(col);
                }
                logger.info("\n"+parser.getTracker());
            }
            logger.info("Got column? "+found+ " | "+expected);
            Assert.assertTrue("Test failed - did not get column: "+expected,found);
        }

        logger.info("Checking to make sure we didn't get more than the expected columns.");
        for (ObjectTracker.ObjectInfo actual : infoList) {
            boolean found = false;
            for (ObjectTracker.ObjectInfo expected : expectedList) {
                found = found || expected.equals(actual);
            }
            Assert.assertTrue("Test failed - did not get column (extra column identified): "+actual,found);
        }
    }
}