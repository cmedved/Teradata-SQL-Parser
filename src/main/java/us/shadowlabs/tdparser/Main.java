package us.shadowlabs.tdparser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.cli.*;
import us.shadowlabs.tdparser.antlr.TeradataLexer;
import us.shadowlabs.tdparser.antlr.TeradataParser;

import java.io.*;
import java.util.Scanner;

/**
 * This is just a simple little class to get some information that I want.
 * @author Christopher Medved
 */
public class Main {
    public static void main (String args[]) throws IOException {
        String inFile = null;
        String outFile = null;
        String sqlDir = null;

        Options options = buildOptions();
        HelpFormatter formatter = new HelpFormatter();
        try {
            CommandLineParser parser = new DefaultParser();
            CommandLine cmd = parser.parse(options, args);
            inFile = cmd.getOptionValue("i");
            outFile = cmd.getOptionValue("o");
            sqlDir = cmd.getOptionValue("c");

        } catch (ParseException e) {
            formatter.printHelp(" ", options);
            System.exit(1);
        }

        PrintWriter pw = new PrintWriter(new FileWriter(outFile));

        ColumnDataStore.loadDataStore("jdbc:h2:./db/columndb;AUTO_SERVER=TRUE","sa","");
        Scanner s = new Scanner(new FileInputStream(inFile));
        s.useDelimiter(";;?\r?\n");
        while (s.hasNext()) {
            String line = s.next();
            String[] infoList = line.split("~");
            String logDate = infoList[0];
            String queryId = infoList[1];
            String defaultDatabase = infoList[2];
            String sql = infoList[3];
            TDInfoParser parser = new TDInfoParser(logDate,queryId,defaultDatabase,sql);
            for (ObjectTracker.ObjectInfo info : parser.getColumns()) {
                pw.println(logDate+"~"+queryId+"~"+defaultDatabase+"~"+info.getDatabaseName()+"~"+info.getTableName()+"~"+info.getColumnName());
            }
        }
        pw.close();
        s.close();
    }

    private static Options buildOptions() {
        Options options = new Options();
        options.addOption(Option.builder("i").longOpt("input").argName("input-file").hasArg().required().desc("Input file containing sql.").build());
        options.addOption(Option.builder("o").longOpt("output").argName("output-file").hasArg().required().desc("Output file containing column names.").build());
        options.addOption(Option.builder("c").longOpt("cols").argName("columns").hasArg().required().desc("Directory containing column mappings.").build());
        return options;
    }
}































