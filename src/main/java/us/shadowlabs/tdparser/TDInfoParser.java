package us.shadowlabs.tdparser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.apache.commons.cli.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import us.shadowlabs.tdparser.antlr.TeradataLexer;
import us.shadowlabs.tdparser.antlr.TeradataParser;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 8/21/2016.
 */
public class TDInfoParser {
    private static final Logger logger = LogManager.getLogger(TDInfoParser.class);
    private String sql;
    private String logDate;
    private String queryId;
    private String defaultDatabase;
    private List<ObjectTracker.ObjectInfo> colList;
    private List<ObjectTracker.ObjectInfo> tblList;
    private List<ColumnDataStore.ColumnRecord> colRecord;
    private ObjectTracker tracker;
    private boolean parseSuccess;

    public TDInfoParser(String logDate,String queryId,String defaultDatabase,String sql) {
        this.logDate = logDate;
        this.queryId = queryId;
        this.defaultDatabase = defaultDatabase;
        this.sql = sql;
        parse();
    }

    private boolean parse() {
        boolean success = false;
        try {
            ANTLRInputStream input = new ANTLRInputStream(new StringReader(sql));

            TeradataLexer lexer = new TeradataLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TeradataParser parser = new TeradataParser(tokens);
            TeradataTreeListener ls = new TeradataTreeListener();
            parser.addParseListener(ls);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            parser.parse();
            //System.out.println(ls);

            tracker = ls.getTracker();

            tracker.addDefaultDatabaseToTables(defaultDatabase);

            colList = ls.getResolvedColumns();
            tblList = ls.getTables();
            colRecord = new ArrayList<>();

            for (ObjectTracker.ObjectInfo tbl : tblList) {
                colRecord.addAll(ColumnDataStore.getColumns(tbl.getDatabaseName(),tbl.getTableName()));
            }
            success = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return success;
    }

    public boolean success() {
        return parseSuccess;
    }

    public ObjectTracker getTracker() {
        return tracker;
    }

    public List<ObjectTracker.ObjectInfo> getColumns() {
        resolveColumns();
        return colList;
    }

    private void resolveColumns() {
        for (ObjectTracker.ObjectInfo col : colList) {
            if (col.getTableName() != null && col.getDatabaseName() != null)
                break;
            for (ColumnDataStore.ColumnRecord tbl : colRecord) {
                if (col.getColumnName().equalsIgnoreCase(tbl.getColumnName())) {
                    col.setDatabaseName(tbl.getDatabaseName());
                    col.setTableName(tbl.getTableName());
                }
            }
        }
    }

    public static class ThrowingErrorListener extends BaseErrorListener {

        public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                throws ParseCancellationException {
            throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
        }
    }
}