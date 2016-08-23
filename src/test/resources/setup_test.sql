DROP SCHEMA IF EXISTS DBC;
CREATE SCHEMA DBC;

CREATE TABLE DBC.COLUMNSV
(
    DatabaseName VARCHAR(128),
    TableName VARCHAR(128),
    ColumnName VARCHAR(128)
);

INSERT INTO DBC.COLUMNSV(DatabaseName,TableName,ColumnName) VALUES ('PDCRINFO','DBQLSqlTbl_Hst','SqlTextInfo');
INSERT INTO DBC.COLUMNSV(DatabaseName,TableName,ColumnName) VALUES ('SYSDBA','TestA','ColumnOne');
INSERT INTO DBC.COLUMNSV(DatabaseName,TableName,ColumnName) VALUES ('SYSDBA','TestA','ColumnTwo');
INSERT INTO DBC.COLUMNSV(DatabaseName,TableName,ColumnName) VALUES ('SYSDBA','TestA','ColumnThree');
INSERT INTO DBC.COLUMNSV(DatabaseName,TableName,ColumnName) VALUES ('SYSDBA','TestB','ColumnOne');
INSERT INTO DBC.COLUMNSV(DatabaseName,TableName,ColumnName) VALUES ('SYSDBA','TestB','ColumnTwo');
INSERT INTO DBC.COLUMNSV(DatabaseName,TableName,ColumnName) VALUES ('SYSDBA','TestB','ColumnThree');