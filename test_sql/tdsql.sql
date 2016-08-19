SELECT *
FROM PDCRINFO.DBQLogTbl_Hst logtbl
INNER JOIN PDCRINFO.DBQLObjTbl_Hst objtbl
ON objtbl.logdate = logtbl.logdate
    AND objtbl.queryid = logtbl.queryid
INNER JOIN PDCRINFO.DBQLSqlTbl_Hst sqltbl
ON logtbl.LogDate = sqltbl.LogDate
    AND logtbl.QueryId = sqltbl.QueryId
where logtbl.logdate BETWEEN CURRENT_DATE-30 AND CURRENT_DATE
order by logtbl.logdate;

SELECT *
FROM PDCRINFO.DBQLogTbl_Hst logtbl
INNER JOIN (
    SELECT DISTINCT QueryId FROM TestDB.TestTbl
    WHERE QueryId > 0
) qry
ON logtbl.QueryId = qry.QueryId;

SELECT *
FROM PDCRINFO.DBQLogTbl_Hst logtbl
WHERE queryid IN (
SELECT DISTINCT QueryId FROM TestDB.TestTbl
    WHERE QueryId > 0
);