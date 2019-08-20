package us.shadowlabs.tdparser.test;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.*;
import us.shadowlabs.tdparser.TDInfoParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

/**
 * Created by Chris on 8/22/2016.
 */
public class TestProcedure {

    @Test
    public void testBasicProcedure() {
        String sql =
                "CREATE PROCEDURE myProc\n" +
                    "BEGIN\n" +
                        "SELECT * FROM SYSDBA.TestA a;\n" +
                    "END;";
        TestUtil.runTest(sql);
    }

    @Test
    public void testProcedureWithNestedBlockStatements() {
        String sql =
                "CREATE PROCEDURE myProc\n" +
                    "BEGIN\n" +
                        "SELECT * FROM SYSDBA.TestA a;\n" +
                        "BEGIN\n" +
                            "SELECT * FROM SYSDBA.TestB;\n" +
                        "END;\n" +
                    "END;";
        TestUtil.runTest(sql);
    }

    @Test
    public void testProcedureWithLabelledBlock() {
        String sql =
                "CREATE PROCEDURE myProc\n" +
                    "XYZ1: BEGIN\n" +
                        "INSERT INTO TheTable (ALPHA, BETA, 'Gamma');\n" +
                    "END XYZ1;\n";
        TestUtil.runTest(sql);
    }


    @Test
    public void testProcedureWithDeclare() {
        String sql =
                "CREATE PROCEDURE myProc\n" +
                    "BEGIN\n" +
                        "DECLARE item INTEGER;\n" +
                        "DECLARE price DECIMAL(8,2);\n" +
                        "SELECT * FROM SYSDBA.TestA a;\n" +
                        "BEGIN\n" +
                            "SELECT * FROM SYSDBA.TestB;\n" +
                        "END;\n" +
                    "END;";
        TestUtil.runTest(sql);
    }

    @Test (expected = ParseCancellationException.class)
    public void testBlockStatementWithDeclareIncorrectlyPlaced() {
        String sql =
                "CREATE PROCEDURE myProc\n" +
                    "BEGIN\n" +
                        "SELECT * FROM SYSDBA.TestA a;\n" +
                        "DECLARE item INTEGER;\n" +
                        "DECLARE price DECIMAL(8,2);\n" +
                        "BEGIN\n" +
                            "SELECT * FROM SYSDBA.TestB;\n" +
                        "END;\n" +
                    "END;";
        try {
            TestUtil.runTest(sql);
        } catch (ParseCancellationException ex) {
            Assert.assertTrue(ex.getMessage().toString().contains("extraneous input 'DECLARE'"));
            throw ex;
        }
    }

    /*TODO: readd :SQLSTATE instead of A_SQLSTATE once variable usage added to INSERT statements */
    @Test
    public void testComplexProcedure() {
        String sql = TestUtil.loadSqlFromFile(this, "test_procedure.sql");
        TestUtil.runTest(sql);
    }

    @Test
    public void testPerformanceOfParser() {
        String sql = TestUtil.loadSqlFromFile(this, "test_procedure.sql");
        int repeatCount = 0;
        long startTime = System.currentTimeMillis();
        for (int i=0; i<repeatCount; i++){
            TestUtil.runTest(sql);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        int numLines = repeatCount * sql.split("\r\n|\r|\n").length;
        System.out.format("Time taken to parse %,d lines: %d millis", numLines, totalTime);
    }

    @Test
    public void testCommentParsing() {
        String sql = TestUtil.loadSqlFromFile(this, "test_comments.sql");
        TestUtil.runTest(sql);
    }
}