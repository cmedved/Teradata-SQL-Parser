2016-08-21~123456789012345678~SYSDBA~SELECT logtbl.LogDate,logtbl.QueryID
    ,logtbl.numofActiveAmps
    ,logtbl.QueryText
    ,logtbl.AMPCPUTime
    ,sqltbl.SqlTextInfo
    ,objtbl.ObjectTableName
FROM PDCRINFO.DBQLogTbl_Hst logtbl
INNER JOIN PDCRINFO.DBQLObjTbl_Hst objtbl
ON objtbl.logdate = logtbl.logdate
    AND objtbl.queryid = logtbl.queryid
INNER JOIN PDCRINFO.DBQLSqlTbl_Hst sqltbl
ON logtbl.LogDate = sqltbl.LogDate
    AND logtbl.QueryId = sqltbl.QueryId
where logtbl.logdate BETWEEN CURRENT_DATE-30 AND CURRENT_DATE
order by logtbl.logdate;

2016-08-21~123456789012345679~SYSDBA~SELECT logtbl.Lodate,qry.QueryID,logtbl.QueryText
FROM PDCRINFO.DBQLogTbl_Hst logtbl
INNER JOIN (
    SELECT DISTINCT tbl.QueryId FROM TestDB.TestTbl tbl
    WHERE QueryId > 0
) qry
ON logtbl.QueryId = qry.QueryId;

2016-08-21~123456789012345670~SYSDBA~SELECT *
FROM PDCRINFO.DBQLogTbl_Hst logtbl
WHERE queryid IN (
SELECT DISTINCT QueryId FROM TestDB.TestTbl
    WHERE QueryId > 0
);
