package us.shadowlabs.tdparser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import us.shadowlabs.tdparser.antlr.TeradataLexer;
import us.shadowlabs.tdparser.antlr.TeradataParser;

/**
 * Created by Chris on 8/21/2016.
 */
public class TDInfoParser {
    private String sql;

    public TDInfoParser(String sql) {
        this.sql = sql;
    }

    public void parse() {
        try {
            CharStream input = CharStreams.fromString(sql);

            TeradataLexer lexer = new TeradataLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TeradataParser parser = new TeradataParser(tokens);
            TeradataTreeListener ls = new TeradataTreeListener();
            parser.addParseListener(ls);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            parser.parse();

        } catch (RecognitionException | NullPointerException | StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            throw e;
        }
    }


    public static class ThrowingErrorListener extends BaseErrorListener {

        private static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                throws ParseCancellationException {
            throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
        }
    }
}