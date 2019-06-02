package us.shadowlabs.tdparser.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.*;
import us.shadowlabs.tdparser.TDInfoParser;

/**
 * Created by Chris on 8/23/2016.
 */
public class TestInsert {
    private static final Logger logger = LogManager.getLogger(TestSelect.class);

    @Test
    public void testBasicInsert() {
        logger.info(""); logger.info("Starting basic insert test.");
        String sql = "INSERT INTO SYSDBA.SomeTbl SELECT logtbl.LogDate,logtbl.QueryId FROM PDCRINFO.DBQLogTbl_Hst logtbl WHERE logtbl.LogDate = CURRENT_DATE-1;";
        runTest(sql);
    }

    private void runTest(String sql) {
        TDInfoParser parser = new TDInfoParser(sql);
        parser.parse();
    }
}
