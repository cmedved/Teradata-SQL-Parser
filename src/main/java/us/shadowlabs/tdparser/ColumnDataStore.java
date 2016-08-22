package us.shadowlabs.tdparser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 8/20/2016.
 */
public class ColumnDataStore {
    private static final Logger logger = LogManager.getLogger(ColumnDataStore.class);
    private static ColumnDataStore instance;
    private Connection localDb;

    private ColumnDataStore() throws SQLException {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        localDb = DriverManager.getConnection("jdbc:h2:./db/columndb", "sa", "");
    }

    private static ColumnDataStore getDataStore() throws SQLException {
        if (instance == null) {
            instance = new ColumnDataStore();
        }
        return instance;
    }

    public static void loadDataStore(String jdbcUrl,String user,String password) {
        try {
            Class.forName("com.teradata.jdbc.TeraDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            ColumnDataStore ds = getDataStore();
            Statement st = ds.localDb.createStatement();
            st.executeUpdate(SQL_DROP_TBL);
            st.close();
            st = ds.localDb.createStatement();
            st.executeUpdate(SQL_CREATE_TBL);
            st.close();

            Connection tdConnection = DriverManager.getConnection(jdbcUrl, user, password);
            Statement stmt = tdConnection.createStatement();
            ResultSet rs = stmt.executeQuery(SQL_TD_FETCH_COLUMNS);
            PreparedStatement ldStmt = ds.localDb.prepareStatement(SQL_INS_COLUMNS);
            int i = 0;
            while (rs.next()) {
                i++;
                String databaseName = rs.getString("DatabaseName");
                String tableName = rs.getString("TableName");
                String columnName = rs.getString("ColumnName");
                ldStmt.clearParameters();
                ldStmt.setString(1, databaseName);
                ldStmt.setString(2, tableName);
                ldStmt.setString(3, columnName);
                ldStmt.executeUpdate();
            }
            logger.debug("Loaded "+i+" rows from the database.");
            stmt.close();
            ldStmt.close();
            tdConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<ColumnRecord> getColumns(String databaseName,String tableName) {
        List<ColumnRecord> records = new ArrayList<>();
        try {
            ColumnDataStore ds = getDataStore();
            PreparedStatement stmt = ds.localDb.prepareStatement(SQL_FETCH_COLUMNS);
            stmt.setString(1,databaseName);
            stmt.setString(2,tableName);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                records.add(new ColumnRecord(databaseName,tableName,rs.getString("ColumnName")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return records;
    }

    private static final String SQL_DROP_TBL = "DROP TABLE IF EXISTS ColumnInfo;";
    private static final String SQL_CREATE_TBL = "CREATE TABLE ColumnInfo ( DatabaseName VARCHAR(128), TableName VARCHAR(128), ColumnName VARCHAR(128));";
    private static final String SQL_FETCH_COLUMNS = "SELECT ColumnName FROM ColumnInfo WHERE DatabaseName = ? AND TableName = ?;";
    private static final String SQL_INS_COLUMNS = "INSERT INTO ColumnInfo(DatabaseName,TableName,ColumnName) VALUES (?, ?, ?);";
    private static final String SQL_TD_FETCH_COLUMNS = "SELECT DatabaseName,TableName,ColumnName FROM DBC.ColumnsV;";

    public static class ColumnRecord {
        private String databaseName;
        private String tableName;
        private String columnName;

        public ColumnRecord(String databaseName, String tableName, String columnName) {
            this.databaseName = databaseName;
            this.tableName = tableName;
            this.columnName = columnName;
        }

        public String getDatabaseName() {
            return databaseName;
        }

        public String getTableName() {
            return tableName;
        }

        public String getColumnName() {
            return columnName;
        }
    }
}
