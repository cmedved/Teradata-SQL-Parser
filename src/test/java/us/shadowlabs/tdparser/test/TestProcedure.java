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
        runTest(sql);
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
        runTest(sql);
    }

    @Test
    public void testProcedureWithLabelledBlock() {
        String sql =
                "CREATE PROCEDURE myProc\n" +
                    "XYZ1: BEGIN\n" +
                        "INSERT INTO TheTable (ALPHA, BETA, 'Gamma');\n" +
                    "END XYZ1;\n";
        runTest(sql);
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
        runTest(sql);
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
            runTest(sql);
        } catch (ParseCancellationException ex) {
            Assert.assertTrue(ex.getMessage().toString().contains("extraneous input 'DECLARE'"));
            throw ex;
        }
    }

    /*TODO: readd :SQLSTATE instead of A_SQLSTATE once variable usage added to INSERT statements */
    @Test
    public void testComplexProcedure() {
        String sql = loadSqlFromFile("test_procedure.sql");
        runTest(sql);
    }

    @Test
    public void testPerformanceOfParser() {
        String sql = loadSqlFromFile("test_procedure.sql");
        int repeatCount = 5000;
        long startTime = System.currentTimeMillis();
        for (int i=0; i<repeatCount; i++){
            runTest(sql);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        int numLines = repeatCount * sql.split("\r\n|\r|\n").length;
        System.out.format("Time taken to parse %,d lines: %d millis", numLines, totalTime);
    }

    private String loadSqlFromFile(String filename) {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(filename);
        InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        return reader.lines().collect(Collectors.joining("\n"));
    }

    private void runTest(String sql) {
        TDInfoParser parser = new TDInfoParser(sql);
        parser.parse();
    }
}