package us.shadowlabs.tdparser.test;

import org.junit.Test;
import us.shadowlabs.tdparser.TDInfoParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class TestComments {

    @Test
    public void testCommentParsing() {
        String sql = TestUtil.loadSqlFromFile(this,"test_comments.sql");
        TestUtil.runTest(sql);
    }


}
