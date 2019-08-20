package us.shadowlabs.tdparser;
import org.apache.commons.cli.*;

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
        String columnDb = null;

        Options options = buildOptions();
        HelpFormatter formatter = new HelpFormatter();
        try {
            CommandLineParser parser = new DefaultParser();
            CommandLine cmd = parser.parse(options, args);
            inFile = cmd.getOptionValue("i");
            outFile = cmd.getOptionValue("o");
            columnDb = cmd.getOptionValue("l");
        } catch (ParseException e) {
            formatter.printHelp(" ", options);
            System.exit(1);
        }

        PrintWriter pw = new PrintWriter(new FileWriter(outFile));

        if (columnDb != null) {
            Console console = System.console();
            if (console == null) {
                System.err.println("Could not get console to fetch credentials.");
                System.exit(1);
            }
            System.out.println("Please enter credentials for "+columnDb+"...");
            String userName = console.readLine("User Name: ");
            char[] password = console.readPassword("Password: ");
            String logmech = console.readLine("Logmech (TD2 or LDAP): ");
            ColumnDataStore.loadDataStore("jdbc:teradata://"+columnDb+"/LOGMECH="+logmech, userName, String.valueOf(password));
        }
        Scanner s = new Scanner(new FileInputStream(inFile));
        s.useDelimiter(";;?\r?\n");
        int failCount = 0;
        int processCount = 0;
        while (s.hasNext()) {
            processCount++;
        }
        pw.close();
        s.close();
        System.out.println("Processed "+processCount+" queries.");
        System.out.println("Successful: "+(processCount-failCount));
        System.out.println("Failed: "+failCount);
        System.out.println("Success Rate: "+((processCount-failCount)*1.0/processCount)* 100 + " %");
    }

    private static Options buildOptions() {
        Options options = new Options();
        options.addOption(Option.builder("i").longOpt("input").argName("input-file").hasArg().required().desc("Input file containing sql.").build());
        options.addOption(Option.builder("o").longOpt("output").argName("output-file").hasArg().required().desc("Output file containing column names.").build());
        options.addOption(Option.builder("l").longOpt("load-columns").hasArg().argName("database").desc("Load the columns from the specified Teradata database.").build());
        return options;
    }
}































