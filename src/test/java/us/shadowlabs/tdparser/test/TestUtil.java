package us.shadowlabs.tdparser.test;

import us.shadowlabs.tdparser.TDInfoParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

class TestUtil {

    static String loadSqlFromFile(Object obj, String filename) {
        ClassLoader classLoader = obj.getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(filename);
        InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        return reader.lines().collect(Collectors.joining("\n"));
    }

    static void runTest(String sql) {
        TDInfoParser parser = new TDInfoParser(sql);
        parser.parse();
    }

}
