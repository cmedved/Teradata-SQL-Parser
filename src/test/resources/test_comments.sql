/*a*/select /*a*/*/*a*/ from/*a*/ abc-- some ;comment/*a*//*a*/
where /*a*/ abc.x/*a*/ in/*a*/(/*a*/'1'/*a*/,/*a*/'2'/*a*/,/*a*/'3'/*a*/,/*a*/'4'/*a*/) --hi/*a*/
group /*a*/ by /*a*/ 1 /*a*/, /*a*/2 /*a*/, /*a*/3 /*a*//*a*/
having  /*a*/ abc.x  /*a*/= /*a*/23 /*a*/; /*a*//*a*/
/*a*/
-- some logging comments/*a*/
--SET SOME_VAR='some_val' FOR TRANSACTION;/*a*/
SELECT/*a*/TOP/*a*/10000/*a*/
/*a*//*a*/b.B as "a",/*a*/
/*a*//*a*/SUM/*a*/(case/*a*/when/*a*/table1.date_col/*a*/=/*a*/'2019-06-03'/*a*/then/*a*/(a.valcol/*a*/*/*a*/-1)/*a*/else/*a*/0/*a*/end/*a*/)/*a*/AS/*a*/"column_1"/*a*/
FROM/*a*/schemaname.table1/*a*/AS/*a*/a/*a*/
INNER/*a*/JOIN/*a*/schemaname.tablename/*a*/AS/*a*/b/*a*/
	ON/*a*/a.id/*a*/=/*a*/b.ID/*a*/
	AND/*a*/b.s/*a*/<=/*a*/'2'/*a*/
FULL OUTER JOIN s2.t2 AS c
  ON a.id = c.id
	OR/*a*/b.s/*a*/>/*a*/'5'/*a*/
WHERE/*a*/(a.date_col/*a*/IN/*a*/('2019-06-03',/*a*/'2019-05-31')/*a*/AND/*a*/(a.date_col/*a*/=/*a*/('2019-06-03')))
/*a*/GROUP/*a*/BY/*a*/1/*a*/
/*a*/HAVING/*a*/a.A/*a*/=/*a*/'somevalue'/*a*/
/*a*/ORDER/*a*/BY/*a*/1/*a*/DESC/*a*/NULLS/*a*/LAST/*a*/;/*a*/

/*a*/CREATE/*a*/PROCEDURE/*a*/AddBranch/*a*/(/*a*/
/*a*/OUT/*a*/oBranchId/*a*/INTEGER,/*a*/
/*a*/IN/*a*/iBranchName/*a*/CHAR(15),/*a*/
/*a*/IN/*a*/iBankCode/*a*/INTEGER,/*a*/
/*a*/IN/*a*/iStreet/*a*/VARCHAR(30),/*a*/
/*a*/IN/*a*/iCity/*a*/VARCHAR(30),/*a*/
/*a*/IN/*a*/iState/*a*/VARCHAR(30),/*a*/
/*a*/IN/*a*/iZip/*a*/INTEGER/*a*/
/*a*/)/*a*//*a*/
Lmain:/*a*/BEGIN/*a*/
 -- Lmain is the label for the main compound statement/*a*/
/*a*/
 -- Local variable declarations follow/*a*/
/*a*/DECLARE/*a*/hMessage/*a*/CHAR(50)/*a*/DEFAULT/*a*/
/*a*/'Error: Database Operation ...';/*a*/
/*a*/DECLARE/*a*/hNextBranchId/*a*/INTEGER;/*a*/
/*a*/DECLARE/*a*/hAccountNumber/*a*/INTEGER/*a*/DEFAULT/*a*/10;/*a*/
/*a*/DECLARE/*a*/hBalance/*a*/INTEGER;/*a*/
/*a*/
/*a*/-- Condition Handler Declarations/*a*/
/*a*/DECLARE/*a*/CONTINUE/*a*/HANDLER/*a*/FOR/*a*/SQLSTATE/*a*/'21000'/*a*/
/*a*/
 -- Label compound statements within handlers as HCS1 etc./*a*/
/*a*/HCS1:/*a*/BEGIN/*a*/
/*a*//*a*//*a*/INSERT/*a*/INTO/*a*/Proc_Error_Tbl/*a*/
/*a*//*a*//*a*/(A_SQLSTATE,/*a*/CURRENT_TIMESTAMP,/*a*/'AddBranch',/*a*/hMessage);/*a*/
/*a*/END/*a*/HCS1;/*a*/
/*a*/DECLARE/*a*/CONTINUE/*a*/HANDLER/*a*/FOR/*a*/SQLSTATE/*a*/'42000'/*a*/
/*a*/HCS2:/*a*/BEGIN/*a*/
/*a*//*a*//*a*/SET/*a*/hMessage/*a*/=/*a*/'Table Not Found ... '/*a*/;/*a*//*a*/
/*a*//*a*//*a*/INSERT/*a*/INTO/*a*/Proc_Error_Tbl/*a*/
/*a*//*a*//*a*/(A_SQLSTATE,/*a*/CURRENT_TIMESTAMP,/*a*/'AddBranch',/*a*/hMessage);/*a*/
/*a*/END/*a*/HCS2;/*a*/
/*a*/-- Get next branch-id from tBranchId table/*a*/
/*a*/CALL/*a*/GetNextBranchId/*a*/(hNextBranchId);/*a*/
/*a*/-- Add new branch to tBranch table/*a*/
/*a*/INSERT/*a*/INTO/*a*/tBranch/*a*/(/*a*/BranchId,/*a*/BankId,/*a*/BranchName,/*a*/Street,/*a*/
/*a*/City,/*a*/State,/*a*/Zip)/*a*/
/*a*/VALUES/*a*/(/*a*/hNextBranchId,/*a*/iBankId,/*a*/iBranchName,/*a*/iStreet,/*a*/iCity,/*a*/
iState,/*a*/iZip);/*a*/
/*a*/--/*a*/Assign/*a*/branch/*a*/number to the output parameter;/*a*/
 -- the value is returned to the calling procedure/*a*/
/*a*/SET/*a*/oBranchId/*a*/=/*a*/hNextBranchId;/*a*/
/*a*/--/*a*/Insert/*a*/the branch number and name in tDummy table/*a*/
/*a*/INSERT/*a*/INTO/*a*/tDummy/*a*/VALUES(hNextBranchId,/*a*/iBranchName);/*a*/
/*a*/--/*a*/Insert/*a*/account numbers pertaining to the current branch/*a*/
/*a*/SELECT/*a*/max(AccountNumber)/*a*/hAccountNumber/*a*/FROM/*a*/tAccounts;/*a*/
/*a*/WHILE/*a*/(hAccountNumber/*a*/<=/*a*/1000)/*a*/
/*a*/DO/*a*/
/*a*//*a*//*a*/INSERT/*a*/INTO/*a*/tAccounts/*a*/(BranchId,/*a*/AccountNumber)/*a*/
/*a*//*a*//*a*/VALUES/*a*/(/*a*/hNextBranchId,/*a*/hAccountNumber);/*a*/
/*a*/  -- Advance to next account number/*a*/
/*a*//*a*//*a*/SET/*a*/hAccountNumber/*a*/=/*a*/hAccountNumber/*a*/+/*a*/1;/*a*/
/*a*/END/*a*/WHILE;/*a*/
/*a*/
 -- Update balance in each account of the current branch-id/*a*/
/*a*/SET/*a*/hAccountNumber/*a*/=/*a*/1;/*a*/
/*a*/L1:/*a*/LOOP/*a*/
/*a*//*a*//*a*/UPDATE/*a*/tAccounts/*a*/SET/*a*/Balance/*a*/=/*a*/100000/*a*/
/*a*//*a*//*a*/WHERE/*a*/BranchId/*a*/=/*a*/hNextBranchId/*a*/AND/*a*/
/*a*//*a*//*a*/AccountNumber/*a*/=/*a*/hAccountNumber;/*a*/
   -- Generate account number/*a*/
/*a*//*a*//*a*/SET/*a*/hAccountNumber/*a*/=/*a*/hAccountNumber/*a*/+/*a*/1;/*a*/
   -- Check if through with all the accounts/*a*/
/*a*//*a*//*a*/IF/*a*/(hAccountNumber/*a*/>/*a*/1000)/*a*/THEN/*a*/
/*a*//*a*//*a*//*a*/LEAVE/*a*/L1;/*a*/
/*a*//*a*//*a*/END/*a*/IF;/*a*/
/*a*/END/*a*/LOOP/*a*/L1;/*a*/
/*a*/-- Update Interest for each account of the current branch-id/*a*/
/*a*/FOR/*a*/fAccount/*a*/AS/*a*/cAccount/*a*/CURSOR/*a*/FOR/*a*/
 -- since Account is a reserved word/*a*/
/*a*/SELECT/*a*/Balance/*a*/AS/*a*/aBalance/*a*/FROM/*a*/tAccounts/*a*/
/*a*/WHERE/*a*/BranchId/*a*/=/*a*/hNextBranchId/*a*/
/*a*/DO/*a*/
 -- Update interest for each account/*a*/
/*a*//*a*//*a*/UPDATE/*a*/tAccounts/*a*/SET/*a*/Interest/*a*/=/*a*/fAccount.aBalance/*a*/*/*a*/0.10;/*a*/
--    WHERE CURRENT OF cAccount; -- TODO: grammar for CURRENT OF/*a*/
/*a*/END/*a*/FOR;/*a*/
 -- Inner nested compound statement begins/*a*/
/*a*/Lnest:/*a*/BEGIN/*a*/
/*a*//*a*/ -- local variable declarations in inner compound statement/*a*/
/*a*//*a*//*a*/DECLARE/*a*/Account_Number,/*a*/counter/*a*/INTEGER;/*a*/
/*a*//*a*//*a*/DECLARE/*a*/Acc_Balance/*a*/DECIMAL/*a*/(10,2);/*a*/
   -- cursor declaration in inner compound statement/*a*/
/*a*//*a*//*a*/DECLARE/*a*/acc_cur/*a*/CURSOR/*a*/FOR/*a*/
/*a*//*a*//*a*/SELECT/*a*/AccountCode,/*a*/Balance/*a*/FROM/*a*/tAccounts/*a*/
/*a*//*a*//*a*/ORDER/*a*/BY/*a*/AccountNumber;/*a*/
/*a*/  -- condition handler declarations in inner compound statement/*a*/
/*a*//*a*//*a*/DECLARE/*a*/CONTINUE/*a*/HANDLER/*a*/FOR/*a*/NOT/*a*/FOUND/*a*/
/*a*//*a*//*a*/HCS3:/*a*/BEGIN/*a*/
/*a*//*a*//*a*//*a*//*a*/DECLARE/*a*/h_Message/*a*/VARCHAR(50);/*a*/
/*a*//*a*//*a*//*a*//*a*/DECLARE/*a*/EXIT/*a*/HANDLER/*a*/FOR/*a*/SQLWARNING/*a*/
/*a*//*a*//*a*//*a*//*a*/HCS4:/*a*/BEGIN/*a*/
/*a*//*a*//*a*//*a*//*a*//*a*//*a*/SET/*a*/h_Message/*a*/=/*a*/'Requested sample is larger than table rows';/*a*/
/*a*//*a*//*a*//*a*//*a*//*a*//*a*/INSERT/*a*/INTO/*a*/Proc_Error_Tbl/*a*/(A_SQLSTATE,/*a*/
/*a*//*a*//*a*//*a*//*a*//*a*//*a*/CURRENT_TIMESTAMP,/*a*/'AddBranch',/*a*/h_Message);/*a*/
/*a*//*a*//*a*//*a*//*a*/END/*a*/HCS4;/*a*/
/*a*/
/*a*//*a*//*a*//*a*//*a*/SET/*a*/h_Message/*a*/=/*a*/'Data not Found ...';/*a*/
 /*a*//*a*//*a*//*a*/INSERT/*a*/INTO/*a*/Proc_Error_Tbl/*a*/(A_SQLSTATE,/*a*/
/*a*//*a*//*a*//*a*//*a*/CURRENT_TIMESTAMP,/*a*/'AddBranch',/*a*/h_Message);/*a*/
/*a*//*a*//*a*//*a*//*a*/SELECT/*a*/COUNT(*)/*a*/FROM/*a*/Proc_Error_Tbl/*a*/
/*a*//*a*//*a*//*a*//*a*/SAMPLE/*a*/10;/*a*/
     -- Raises a warning. This is a condition raised by/*a*/
     -- a handler action statement. This is handled./*a*/
/*a*//*a*//*a*/END/*a*/HCS3;/*a*/
--    DELETE FROM tDummy1; -- TODO: grammar for DELETE statement/*a*/
   -- Raises “no data found” warning/*a*/
/*a*//*a*//*a*/OPEN/*a*/acc_cur;/*a*/
/*a*//*a*//*a*/L2:/*a*/REPEAT/*a*/
/*a*//*a*//*a*//*a*//*a*/BEGIN/*a*/
/*a*//*a*//*a*//*a*//*a*//*a*//*a*/FETCH/*a*/acc_cur/*a*/INTO/*a*/Account_code,/*a*/Acc_Balance;/*a*/
/*a*//*a*//*a*//*a*//*a*//*a*//*a*/CASE/*a*/
/*a*//*a*//*a*//*a*//*a*//*a*//*a*/WHEN/*a*/(Account_code/*a*/<=/*a*/1000)/*a*/THEN/*a*/
/*a*//*a*//*a*//*a*//*a*//*a*//*a*//*a*//*a*/INSERT/*a*/INTO/*a*/dummy1/*a*/(Account_code,/*a*/Acc_Balance)/*a*/;/*a*/
/*a*//*a*//*a*//*a*//*a*//*a*//*a*//*a*//*a*/ELSE/*a*/
/*a*//*a*//*a*//*a*//*a*//*a*//*a*//*a*//*a*/LEAVE/*a*/L3;/*a*/
/*a*//*a*//*a*//*a*//*a*//*a*//*a*/END/*a*/CASE;/*a*/
/*a*//*a*//*a*//*a*//*a*/END;/*a*/
/*a*//*a*//*a*//*a*//*a*/UNTIL/*a*/(SQLCODE/*a*/=/*a*/0)/*a*/
/*a*//*a*//*a*/END/*a*/REPEAT/*a*/L2;/*a*/
/*a*//*a*//*a*/CLOSE/*a*/acc_cur;/*a*/
/*a*/END/*a*/Lnest;/*a*/--- end of inner nested block./*a*/
END/*a*/Lmain;/*a*/-- This comment is part of stored procedure body/*a*/
-- End-of-Create-Procedure./*a*/

/*a*/ SET/*a*/ someattr='someval'/*a*/ FOR/*a*/ TRANSACTION/*a*/ ;/*a*/

/*a*/ SEL/*a*/ DISTINCT/*a*/ ID/*a*/ FROM/*a*/ TABLEA/*a*/ SAMPLE/*a*/ 10/*a*/ ;/*a*/ 

/*a*/ INSERT/*a*/ INTO/*a*/ schema1.table1/*a*/ (/*a*/ c1/*a*/ ,/*a*/ c2/*a*/ ,/*a*/ c3/*a*/ )/*a*/ select/*a*/ */*a*/ from/*a*/ tab1/*a*/ where/*a*/ x/*a*/ =/*a*/ d/*a*/ ;/*a*/

/*a*/ INS/*a*/ schema1.table1/*a*/ (/*a*/ c1,/*a*/ c2/*a*/) /*a*/ VALUES/*a*/ (/*a*/ v1/*a*/ ,/*a*/ v2/*a*/ )/*a*/ ;/*a*/



