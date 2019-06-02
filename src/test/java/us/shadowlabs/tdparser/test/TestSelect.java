package us.shadowlabs.tdparser.test;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.*;
import us.shadowlabs.tdparser.TDInfoParser;

/**
 * Created by Chris on 8/22/2016.
 */
public class TestSelect {
    private static final Logger logger = LogManager.getLogger(TestSelect.class);

    @Test
    public void testBasicSelect() {
        logger.info(""); logger.info("Starting basic select test.");
        String sql = "SELECT logtbl.LogDate,logtbl.QueryId FROM PDCRINFO.DBQLogTbl_Hst logtbl WHERE logtbl.LogDate = CURRENT_DATE-1;";
        runTest(sql);
    }

    @Test
    public void testDerivedSelect() {
        int i = 1;
        logger.info(""); logger.info("Starting derived select test: "+i++);
        String sql = "SELECT logtbl.LogDate,logtbl.QueryId,sqltbl.SqlTextInfo FROM PDCRINFO.DBQLogTbl_Hst logtbl INNER JOIN " +
                "(SELECT sqltbl.LogDate,sqltbl.QueryId,sqltbl.SqlTextInfo FROM PDCRINFO.DBQLSqlTbl_Hst sqltbl ) sqltbl " +
                "ON logtbl.LogDate = sqltbl.LogDate AND logtbl.QueryId = sqltbl.QueryId WHERE logtbl.LogDate = CURRENT_DATE-1;";

        runTest(sql);

        logger.info(""); logger.info("Starting derived select test: "+i++);
        sql = "SELECT logtbl.LogDate,logtbl.QueryId,sqltbl.SqlTextInfo FROM PDCRINFO.DBQLogTbl_Hst logtbl INNER JOIN " +
                "(SELECT sqltbl.LogDate,sqltbl.QueryId,SqlTextInfo FROM PDCRINFO.DBQLSqlTbl_Hst sqltbl ) sqltbl " +
                "ON logtbl.LogDate = sqltbl.LogDate AND logtbl.QueryId = sqltbl.QueryId WHERE logtbl.LogDate = CURRENT_DATE-1;";
        runTest(sql);

        logger.info(""); logger.info("Starting derived select test: "+i++);
        sql = "SELECT logtbl.LogDate AS LogDate,logtbl.QueryId,SqlTextInfo FROM PDCRINFO.DBQLogTbl_Hst logtbl INNER JOIN " +
                "(SELECT sqltbl.LogDate,sqltbl.QueryId,SqlTextInfo FROM PDCRINFO.DBQLSqlTbl_Hst sqltbl ) sqltbl " +
                "ON logtbl.LogDate = sqltbl.LogDate AND logtbl.QueryId = sqltbl.QueryId WHERE logtbl.LogDate = CURRENT_DATE-1;";
        runTest(sql);
    }

    @Test
    public void testNestedColExpression() {
        int i = 1;
        logger.info(""); logger.info("Starting nested col expr select test: "+i++);
        String sql = "SELECT a.ColumnOne,c.ColumnOne FROM SYSDBA.TestA a, (SELECT b.ColumnOne+b.ColumnTwo AS ColumnOne FROM SYSDBA.TestB b) c;";
        runTest(sql);
    }

    @Test
    public void testFunction() {
        int i=1;
        logger.info(""); logger.info("Starting function select test: "+i++);
        String sql = "SELECT a.col1,a.col2,CAST(a.col3 AS CHAR(9)) Col3 FROM SYSDBA.TestA a;";
        runTest(sql);

        logger.info(""); logger.info("Starting function select test: "+i++);
        sql = "SELECT a.col1,SUM( a.col2 + a.col3 ) Col3 FROM SYSDBA.TestA a;";
        runTest(sql);

        logger.info(""); logger.info("Starting function select test: "+i++);
        sql = "SELECT a.col1,SUM(CAST( a.col2 AS INTEGER) + a.col3 ) Col3 FROM SYSDBA.TestA a;";
        runTest(sql);
    }

    @Test
    public void testSelectSample() {
        String sql = "SELECT abc FROM def SAMPLE 10;";
        runTest(sql);
    }

    @Test
    public void testSelectStar() {
        int i=1;
        logger.info(""); logger.info("Starting select * test: "+i++);
        String sql = "SELECT a.* FROM SYSDBA.TestA a;";
        runTest(sql);

        logger.info(""); logger.info("Starting select * test: "+i++);
        sql = "SELECT * FROM SYSDBA.TestA a;";
        runTest(sql);

        logger.info(""); logger.info("Starting select * test: "+i++);
        sql = "SELECT a.* FROM SYSDBA.TestA a INNER JOIN SYSDBA.TestB b on a.ColumnOne = b.ColumnOne;";
        runTest(sql);

        logger.info(""); logger.info("Starting select * test: "+i++);
        sql = "SELECT a.*,b.ColumnOne FROM SYSDBA.TestA a INNER JOIN SYSDBA.TestB b on a.ColumnOne = b.ColumnOne;";
        runTest(sql);

        logger.info(""); logger.info("Starting select * test: "+i++);
        sql = "SELECT a.*,b.* FROM SYSDBA.TestA a INNER JOIN SYSDBA.TestB b on a.ColumnOne = b.ColumnOne;";
        runTest(sql);

        logger.info(""); logger.info("Starting select * test: "+i++);
        sql = "SELECT * FROM SYSDBA.TestA a INNER JOIN SYSDBA.TestB b on a.ColumnOne = b.ColumnOne;";
        runTest(sql);

        logger.info(""); logger.info("Starting select * test: "+i++);
        sql = "SELECT * FROM SYSDBA.TestA a INNER JOIN (SELECT b.ColumnOne,b.ColumnTwo,b.ColumnThree FROM SYSDBA.TestB b) c on a.ColumnOne = c.ColumnOne;";
        runTest(sql);

        logger.info(""); logger.info("Starting select * test: "+i++);
        sql = "SELECT * FROM SYSDBA.TestA a INNER JOIN (SELECT b.* FROM SYSDBA.TestB b) c on a.ColumnOne = c.ColumnOne;";
        runTest(sql);

        logger.info(""); logger.info("Starting select * test: "+i++);
        sql = "SELECT * FROM SYSDBA.TestA a INNER JOIN (SELECT * FROM SYSDBA.TestB b) c on a.ColumnOne = c.ColumnOne;";
        runTest(sql);
    }

    @Test
    public void testCaseStatement() {
        int i=1;
        logger.info(""); logger.info("Starting case statement test: "+i++);
        String sql = "SELECT CASE WHEN a.ColumnOne = 1 THEN a.ColumnOne ELSE a.ColumnTwo END As ColumnOne FROM SYSDBA.TestA a;";
        runTest(sql);

        logger.info(""); logger.info("Starting case statement test: "+i++);
        sql = "SELECT CASE WHEN a.ColumnOne = 1 THEN a.ColumnOne WHEN 1=2 THEN b.ColumnOne ELSE a.ColumnTwo END As ColumnOne FROM SYSDBA.TestA a, SYSDBA.TestB b;";
        runTest(sql);
    }

    @Test
    public void testSelfJoin() {
        int i=1;
        logger.info(""); logger.info("Starting self join test: "+i++);
        String sql = "SELECT * FROM SYSDBA.TestA a;";
        runTest(sql);
    }

    @Test
    public void testDefaultDatabase() {
        int i=1;
        logger.info(""); logger.info("Starting default database test: "+i++);
        String sql = "SELECT * FROM TestA a;";
        runTest(sql);

        logger.info(""); logger.info("Starting default database test: "+i++);
        sql = "SELECT ColumnOne,ColumnTwo,ColumnThree FROM TestA a;";
        runTest(sql);

        logger.info(""); logger.info("Starting default database test: "+i++);
        sql = "SELECT a.ColumnOne,a.ColumnTwo,a.ColumnThree FROM SYSDBA.TestB b,TestA a;";
        runTest(sql);
    }

    @Test (expected = ParseCancellationException.class)
    public void testFailingSelectStatement() {
        String sql = "SELECT SELECT * FROM TestA a";
        runTest(sql);
    }

    private void runTest(String sql) {
        TDInfoParser parser = new TDInfoParser(sql);
        parser.parse();
    }
}