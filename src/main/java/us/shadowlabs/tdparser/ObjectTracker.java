package us.shadowlabs.tdparser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 8/19/2016.
 */
public class ObjectTracker {
    private static final Logger logger = LogManager.getLogger(ObjectTracker.class);
    private ScopeTable rootScope;
    private ScopeTable currentScope;

    public ObjectTracker() {
        rootScope = new ScopeTable();
        currentScope = rootScope;
    }

    public void addObject(String databaseName,String tableName,String columnName,String aliasName) {
        currentScope.addObjectInfo(new ObjectInfo(databaseName,tableName,columnName,aliasName));
    }

    public void enterScope() {
        currentScope = currentScope.enterScope();
    }

    public void exitScope(String scopeAlias) {
        currentScope = currentScope.exitScope(scopeAlias);
    }

    public void addDefaultDatabaseToTables(String defaultDatabase) {
        addDefaultDatabaseToTables(defaultDatabase,rootScope);
    }

    private void addDefaultDatabaseToTables(String defaultDatabase,ScopeTable scope) {
        for (ObjectInfo info : scope.objectInfoList) {
            if (info.columnName == null && info.tableName != null && info.databaseName == null) {
                info.databaseName = defaultDatabase;
            }
        }
        for (ScopeTable subScope : scope.subScopes) {
            addDefaultDatabaseToTables(defaultDatabase,subScope);
        }
    }

    public List<ObjectInfo> resolveTableAlias(String columnName,String tableAlias) {
        logger.trace("Starting to look for column: "+columnName+" with table alias: "+tableAlias);
        return resolveTableAlias(columnName,tableAlias,rootScope);
    }

    private List<ObjectInfo> resolveTableAlias(String columnName,String tableAlias,ScopeTable scope) {
        List<ObjectInfo> result = new ArrayList<>();
        logger.trace("Looking for column: "+columnName+" tableAlias: "+tableAlias+" scope name: "+scope.scopeAlias);
        if (columnName.equals("*")) {
            result.addAll(getStarColumns(tableAlias,scope));
            return result;
        }
        if (tableAlias == null) {
            ObjectInfo foundObj = checkObjectsForColumn(columnName,scope);
            if (foundObj != null) {
                result.add(foundObj);
                return result; // direct col reference, we're done.
            }
            result.addAll(checkSubScopesForColumn(columnName,scope));
            return result;
            //todo: don't continue
        }
        ObjectInfo tableInfo = scope.getObjectFromTableAlias(tableAlias);
        if (tableInfo != null) {
            result.add(new ObjectInfo(tableInfo.databaseName,tableInfo.tableName,columnName,null));
            return result; // Resolved column directly to table via alias - done.
        } else {
            result.addAll(checkSubScopesForColumn(columnName,scope));
            return result;
        }
    }

    private List<ObjectInfo> checkSubScopesForColumn(String colName,ScopeTable theScope) {
        List<ObjectInfo> results = new ArrayList<>();
        logger.trace("Checking subscopes for column: "+colName);
        List<ObjectInfo> foundCols;
        for (ScopeTable scopeTable : theScope.subScopes) {
            foundCols = scopeTable.getObjectFromColumnAlias(colName);
            for (ObjectInfo foundCol : foundCols) {
                results.addAll(resolveTableAlias(foundCol.columnName,foundCol.tableName,scopeTable));
            }
            if (results.size() > 0) return results;
            ObjectInfo foundCol = scopeTable.getObjectFromColumnName(colName);
            if (foundCol != null) return resolveTableAlias(foundCol.getColumnName(),foundCol.getTableName(),scopeTable);
        }
        logger.trace("Did not find column referenced in subscopes.");
        return results;
    }

    private ObjectInfo checkObjectsForColumn(String colName,ScopeTable theScope) {
        logger.trace("Checking db info for column: "+colName);
        for (ObjectInfo info : theScope.objectInfoList) {
            if (info.columnName == null) {
                // todo: default db?
                logger.trace("Getting columns for "+info.getDatabaseName()+"."+info.getTableName());
                List<ColumnDataStore.ColumnRecord> cols = ColumnDataStore.getColumns(info.getDatabaseName(),info.getTableName());
                for (ColumnDataStore.ColumnRecord col : cols) {
                    if (col.getColumnName().equalsIgnoreCase(colName)) {
                        logger.info("Found db record for column.");
                        return new ObjectInfo(col.getDatabaseName(),col.getTableName(),col.getColumnName(),null);
                    }
                }
            }
        }
        logger.info("Did not find db record for column.");
        return null;
    }

    private List<ObjectInfo> getStarColumns(String tableName,ScopeTable scope) {
        logger.trace("Resolving star columns for: "+tableName+".*");
        List<ObjectInfo> result = new ArrayList<>();
        if (tableName == null) {
            for (ObjectInfo obj : scope.objectInfoList) {
                if (obj.columnName == null) {
                    List<ColumnDataStore.ColumnRecord> records = ColumnDataStore.getColumns(obj.databaseName,obj.tableName);
                    for (ColumnDataStore.ColumnRecord rec : records) {
                        result.add(new ObjectInfo(rec.getDatabaseName(),rec.getTableName(),rec.getColumnName(),null));
                    }
                }
            }
            for (ScopeTable subScope : scope.subScopes) {
                if (subScope.scopeAlias != null) {
                    for (ObjectInfo info : subScope.objectInfoList) {
                        if (info.getColumnName() != null) {
                            result.addAll(resolveTableAlias(info.columnName,info.tableName,subScope));
                        }
                    }
                }
            }
        }
        else {
            ObjectInfo tbl = scope.getObjectFromTableAlias(tableName);
            if (tbl != null) {
                logger.trace("Adding all of the columns from table: "+tbl.getTableName());
                List<ColumnDataStore.ColumnRecord> records = ColumnDataStore.getColumns(tbl.databaseName,tbl.tableName);
                for (ColumnDataStore.ColumnRecord rec : records) {
                    result.add(new ObjectInfo(rec.getDatabaseName(),rec.getTableName(),rec.getColumnName(),null));
                }
            }
            else {
                for (ScopeTable subScope : scope.subScopes) {
                    if (subScope.scopeAlias != null && subScope.scopeAlias.equalsIgnoreCase(tableName)) {
                        logger.trace("Adding all columns from subscope: " + subScope.scopeAlias);
                        for (ObjectInfo info : subScope.objectInfoList) {
                            if (info.getColumnName() != null) {
                                result.addAll(resolveTableAlias(info.columnName, info.tableName, subScope));
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public List<ObjectInfo> getRootColumns() {
        List<ObjectInfo> objList = new ArrayList<>();
        for (ObjectInfo obj : rootScope.objectInfoList) {
            if (obj.columnName != null) {
                objList.add(obj);
            }
        }
        return objList;
    }

    public List<ObjectInfo> getRootTables() {
        List<ObjectInfo> objTbl = new ArrayList<>();
        for (ObjectInfo obj : rootScope.objectInfoList) {
            if (obj.columnName == null) {
                objTbl.add(obj);
            }
        }
        return objTbl;
    }

    public String toString() {
        return rootScope.toString();
    }

    public static class ScopeTable {
        private int level = 0;
        private ScopeTable parent;
        private List<ScopeTable> subScopes;
        private String scopeAlias;
        private List<ObjectInfo> objectInfoList;

        public ScopeTable() {
            this.subScopes = new ArrayList<>();
            this.objectInfoList = new ArrayList<>();
            this.level = 0;
        }

        public ScopeTable(ScopeTable parentScope) {
            this.subScopes = new ArrayList<>();
            this.objectInfoList = new ArrayList<>();
            this.parent = parentScope;
            this.level = parentScope.level + 1;
        }

        public ScopeTable enterScope() {
            ScopeTable subScope = new ScopeTable(this);
            subScopes.add(subScope);
            return subScope;
        }

        public ScopeTable exitScope(String name) {
            this.scopeAlias = name;
            return parent;
        }

        public ScopeTable getNamedScope(String name) {
            for (ScopeTable scope : subScopes) {
                if (scope.scopeAlias != null && scope.scopeAlias.equalsIgnoreCase(name))
                    return scope;
            }
            return null;
        }

        public void addObjectInfo(ObjectInfo info) {
            objectInfoList.add(info);
        }

        public ObjectInfo getObjectFromTableAlias(String alias) {
            ScopeTable scope = this;
            for (ObjectInfo obj : objectInfoList) {
                if (obj.aliasName != null && obj.aliasName.equalsIgnoreCase(alias) && obj.columnName == null)
                    return obj;
            }
            while (scope.parent != null) {
                scope = parent;
                for (ObjectInfo obj : objectInfoList) {
                    if (obj.aliasName != null && obj.aliasName.equalsIgnoreCase(alias) && obj.columnName == null)
                        return obj;
                }
            }
            return null;
        }

        public List<ObjectInfo> getObjectFromColumnAlias(String alias) {
            List<ObjectInfo> result = new ArrayList<>();
            for (ObjectInfo obj : objectInfoList) {
                if (obj.aliasName != null && obj.aliasName.equalsIgnoreCase(alias) && obj.columnName != null)
                    result.add(obj);
            }
            return result;
        }

        public ObjectInfo getObjectFromColumnName(String name) {
            for (ObjectInfo obj : objectInfoList) {
                if (obj.columnName != null && obj.columnName.equalsIgnoreCase(name) && obj.columnName != null)
                    return obj;
            }
            return null;
        }

        public String toString() {
            final String border = "-------------------------------------------------------------------";
            final String levelBuffer = getLevelBuffer();
            StringBuffer buffer = new StringBuffer(levelBuffer).append(border).append(" scope name: ").append(scopeAlias).append(System.lineSeparator());
            for (ObjectInfo obj : objectInfoList) {
                buffer.append(levelBuffer).append(obj).append(System.lineSeparator());
            }
            buffer.append(levelBuffer).append(border).append(System.lineSeparator());
            for (ScopeTable subTable : subScopes) {
                buffer.append(subTable).append(System.lineSeparator());
            }
            return buffer.toString();
        }

        private String getLevelBuffer() {
            String result = "";
            int level = this.level;
            while (level-- > 0) {
                result += "   ";
            }
            return result;
        }
    }
    public static class ObjectInfo {
        private String databaseName;
        private String tableName;
        private String columnName;
        private String aliasName;

        public ObjectInfo(String databaseName, String tableName, String columnName, String aliasName) {
            this.databaseName = databaseName;
            this.tableName = tableName;
            this.columnName = columnName;
            this.aliasName = aliasName;
        }

        public String getDatabaseName() {
            return databaseName;
        }

        public void setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
        }

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public String getColumnName() {
            return columnName;
        }

        public void setColumnName(String columnName) {
            this.columnName = columnName;
        }

        public String getAliasName() {
            return aliasName;
        }

        public void setAliasName(String aliasName) {
            this.aliasName = aliasName;
        }

        @Override
        public String toString() {
            return "ObjectInfo{" +
                    "databaseName='" + databaseName + '\'' +
                    ", tableName='" + tableName + '\'' +
                    ", columnName='" + columnName + '\'' +
                    ", aliasName='" + aliasName + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ObjectInfo that = (ObjectInfo) o;

            if (databaseName != null ? !databaseName.equals(that.databaseName) : that.databaseName != null)
                return false;
            if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
            if (columnName != null ? !columnName.equals(that.columnName) : that.columnName != null) return false;
            return aliasName != null ? aliasName.equals(that.aliasName) : that.aliasName == null;

        }

        @Override
        public int hashCode() {
            int result = databaseName != null ? databaseName.hashCode() : 0;
            result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
            result = 31 * result + (columnName != null ? columnName.hashCode() : 0);
            result = 31 * result + (aliasName != null ? aliasName.hashCode() : 0);
            return result;
        }
    }
}
