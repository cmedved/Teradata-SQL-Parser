 /*
   Copyright 2016 Christopher Medved

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
grammar Teradata;

parse
 : ( sql_stmt_list | error ) EOF
 ;

error
 : UNEXPECTED_CHAR
   {
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
   }
 ;

 sql_stmt_list
 :  (sql_stmt ';')+
 ;

 sql_stmt
 : select_stmt
 | insert_stmt
 ;

 select_stmt
 : /*(K_WITH K_RECURSIVE query_name (OPEN_PAR column_list CLOSE_PAR)? K_AS
    seed_stmt (K_UNION K_ALL (recursive_stmt|seed_stmt))*) select_expr
    TODO: Implement recursion...*/
  K_WITH query_name (OPEN_PAR column_list CLOSE_PAR)? K_AS OPEN_PAR select_expr CLOSE_PAR select_expr
 | select_expr
 ;

 select_expr
 : (K_SELECT | K_SEL) (((K_DISTINCT|K_ALL|normalize_expr) ((table_name DOT STAR DOT K_ALL)|(column_name DOT K_ALL))?)|top_expr)?
    select_list
    from_clause?
    from_with_expr?
    where_clause?
    (K_GROUP K_BY group_by_list)?
    having_qualify_expr?
    /* TODO: sample_expr? */
    /* TODO: expand_expr? */
    (K_ORDER K_BY order_by_list (K_ASC|K_DESC)? (K_NULLS K_FIRST| K_NULLS K_LAST)?)?
 ;

insert_stmt
 : (K_INSERT|K_INS) K_INTO? table_name
 ;

insert_sub_expr
 : K_VALUES? OPEN_PAR expr_list CLOSE_PAR
 | OPEN_PAR column_list CLOSE_PAR K_VALUES OPEN_PAR expr_list CLOSE_PAR
 | column_list? subquery insert_logging_errors?
 | K_DEFAULT K_VALUES
 ;

insert_logging_errors /* Not sure if NUMERIC_LITERAL is correct */
 : K_LOGGING K_ALL? K_ERRORS (K_WITH (K_NO K_LIMIT|K_LIMIT K_OF NUMERIC_LITERAL))?
 ;

top_expr
 : K_TOP (INTEGER|DECIMAL) K_PERCENT? (K_WITH K_TIES)?
 ;

having_qualify_expr
 : having_expr
 | qualify_expr
 | having_expr qualify_expr
 | qualify_expr having_expr
 ;

 select_list
 : STAR
 | select_list_expr (COMMA select_list_expr)*
 ;

 select_list_expr
 : ( (expr (K_AS? expr_alias_name)?) | table_name DOT STAR)
 ;


/* Had to modify this pretty extensively from the SQL guide... the syntax diagram didn't really match up
   with the actual grammar. */
 from_clause
 : K_FROM from_expr
 ;

 from_expr
 : from_table_expr from_join_expr*
 ;

 as_of
 : K_AS K_OF (date_expr|timestamp_expr)?
 | K_VALIDTIME K_AS K_OF (date_expr|timestamp_expr)? K_AND K_TRANSACTIONTIME K_AS K_OF (date_expr|timestamp_expr)?
 | K_TRANSACTIONTIME K_AS K_OF (date_expr|timestamp_expr)? K_AND K_VALIDTIME K_AS K_OF (date_expr|timestamp_expr)?
 ;

 from_table_expr
 : from_single_expr
 | from_derived_expr
 | from_tablefunc_expr
 ;

 from_single_expr
 : table_name as_of? (K_AS? correlation_name)?
 ;

 from_join_expr
 : (K_INNER|(K_LEFT|K_RIGHT|K_FULL)K_OUTER?) K_JOIN from_table_expr as_of? K_ON search_condition
 | K_CROSS K_JOIN from_table_expr
 | COMMA from_table_expr
 ;

 from_derived_expr
 : OPEN_PAR subquery CLOSE_PAR K_AS? derived_table_name (OPEN_PAR column_list CLOSE_PAR)?
 ;

 from_tablefunc_expr
 : K_TABLE OPEN_PAR function_name OPEN_PAR expr_list? CLOSE_PAR CLOSE_PAR
    /* TODO: Implement the rest of derived tables! */
    K_AS? derived_table_name (OPEN_PAR column_list CLOSE_PAR)?
 ;

 from_with_expr
 : K_WITH expr_list (K_BY expr (K_ASC|K_DESC)? (',' expr (K_ASC|K_DESC)?)*)?
 ;

 normalize_expr
 : K_NORMALIZE
 | K_NORMALIZE K_ON K_MEETS K_OR K_OVERLAPS
 | K_NORMALIZE K_ON K_OVERLAPS (K_OR K_MEETS)?
 ;

 where_clause
 : K_WHERE search_condition
 ;

 having_expr
 : K_HAVING conditional_expr
 ;

 qualify_expr
 : K_QUALIFY search_condition
 ;

 sample_expr
 :
 ;

 expand_expr
 :
 ;

 group_by_list
 : group_by_val (COMMA group_by_val)*
 ;

 group_by_val
 : ordinary_grouping_set
 | empty_grouping_set
 | rollup_list
 | cube_list
 | grouping_sets_specification
 ;

 order_by_list
 :  order_by_val (COMMA order_by_val)*
 ;

 order_by_val
 : expr
 | column_name
 | column_alias
 | column_position
 ;

 seed_stmt
 : (K_SELECT | K_SEL) (K_DISTINCT|K_ALL)? select_list
    K_FROM from_single_expr | from_join_expr | from_derived_expr
    K_WHERE search_condition /* doc says it has to have WHERE? */
    (K_GROUP K_BY group_by_list)?
    having_qualify_expr?
    (K_ORDER K_BY order_by_list (K_ASC|K_DESC)?)?
 ;

 /*recursive_stmt
 : (K_SELECT | K_SEL) (K_DISTINCT|K_ALL)? select_list
 ;*/


 expr
 : literal_value
 | column_name
 | unary_operator expr
 | expr '||' expr
 | expr ( '*' | '/' | '%' ) expr
 | expr ( '+' | '-' ) expr
 | expr ( '<' | '<=' | '>' | '>=' ) expr
 | expr ( '=' | '==' | '!=' | '<>' | K_IS | K_IS K_NOT | K_IN | K_LIKE ) expr
 | expr K_AND expr
 | expr K_OR expr
 | function_name '(' ( K_DISTINCT? expr ( ',' expr )* | '*' )? ')'
 | '(' expr ')'
 | K_CAST '(' expr K_AS type_name ')'
 | expr K_NOT? K_LIKE  expr ( K_ESCAPE expr )?
 | expr ( K_IS K_NULL | K_IS K_NOT K_NULL | K_NOT K_NULL )
 | expr K_IS K_NOT? expr
 | expr K_NOT? K_BETWEEN expr K_AND expr
 | expr K_NOT? K_IN ( OPEN_PAR ( subquery
                          | expr ( ',' expr )*
                          )
                      CLOSE_PAR
                    | ( database_name '.' )? table_name )
 /*| ( ( K_NOT )? K_EXISTS )? '(' select_stmt ')' */
 | K_CASE expr? ( K_WHEN expr K_THEN expr )+ ( K_ELSE expr )? K_END
 ;

expr_list
 : expr (',' expr)*
 ;

 ordinary_grouping_set
  : column_name
  | column_position
  | expr
  ;

 empty_grouping_set
  : OPEN_PAR CLOSE_PAR
  ;

 rollup_list
  :
  ;

 cube_list
  :
  ;

 grouping_sets_specification
  :
  ;

 column_position
  : INTEGER
  ;

 subquery
  : select_expr
  ;

 search_condition
  : expr
  ;

 conditional_expr
  : expr
  ;

 column_list
  : column_name (',' column_name)*
  ;

 signed_number
  : ( '+' | '-' )? NUMERIC_LITERAL
  ;

 literal_value
  : NUMERIC_LITERAL
  | STRING_LITERAL
  | K_NULL
  | K_CURRENT_TIME
  | K_CURRENT_DATE
  | K_CURRENT_TIMESTAMP
  | date_expr
  | time_expr
  | timestamp_expr
  ;

 unary_operator
  : '-'
  | '+'
  | '~'
  | K_NOT
  ;

 column_alias
  : IDENTIFIER
  ;

 query_name
  : IDENTIFIER
  ;

 expr_alias_name
  : IDENTIFIER
  ;

 joined_table
  : table_name
  ;

 single_table_expr
  : table_name
  ;

 derived_table_name
  : table_name
  ;

 date_expr
  : K_DATE? STRING_LITERAL
  | K_DATE
  ;

 timestamp_expr
  : K_TIMESTAMP? STRING_LITERAL
  ;

 time_expr
  : K_TIME? STRING_LITERAL
  ;

  date_timestamp_expr
  : timestamp_expr
  | date_expr
  ;

 keyword
  :K_ABORT
  | K_CONVERT_TABLE_HEADER
  | K_FOUND
  | K_MAX
  | K_QUALIFIED
  | K_STATEMENT
  | K_ABORTSESSION
  | K_CORR
  | K_FREESPACE
  | K_MAXIMUM
  | K_QUALIFY
  | K_STATISTICS
  | K_ABS
  | K_COS
  | K_FROM
  | K_MCHARACTERS
  | K_QUANTILE
  | K_STDDEV_POP
  | K_ACCESS_LOCK
  | K_COSH
  | K_FULL
  | K_MDIFF
  | K_RADIANS
  | K_STDDEV_SAMP
  | K_ACCOUNT
  | K_COUNT
  | K_FUNCTION
  | K_MERGE
  | K_RANDOM
  | K_STEPINFO
  | K_ACOS
  | K_COVAR_POP
  | K_GE
  | K_MIN
  | K_RANGE_N
  | K_STRING_CS
  | K_ACOSH
  | K_COVAR_SAMP
  | K_GENERATED
  | K_MINDEX
  | K_RANK
  | K_SUBSCRIBER
  | K_ADD
  | K_CREATE
  | K_GIVE
  | K_MINIMUM
  | K_REAL
  | K_SUBSTR
  | K_ADD_MONTHS
  | K_CROSS
  | K_GO
  | K_MINUS
  | K_REFERENCES
  | K_SUBSTRING
  | K_ADMIN
  | K_CS
  | K_GOTO
  | K_MINUTE
  | K_REFERENCING
  | K_SUM
  | K_AFTER
  | K_CSUM
  | K_GRANT
  | K_MLINREG
  | K_REGR_AVGX
  | K_SUMMARY
  | K_AGGREGATE
  | K_CT
  | K_GRAPHIC
  | K_MLOAD
  | K_REGR_AVGY
  | K_SUSPEND
  | K_ALIAS
  | K_CURRENT
  | K_GROUP
  | K_MOD
  | K_REGR_COUNT
  | K_TABLE
  | K_ALL
  | K_CURRENT_DATE
  | K_GT
  | K_MODE
  | K_REGR_INTERCEPT
  | K_TAN
  | K_ALTER
  | K_CURRENT_TIME
  | K_HANDLER
  | K_MODIFY
  | K_REGR_R2
  | K_TANH
  | K_AMP
  | K_CURRENT_TIMESTAMP
  | K_HASH
  | K_MONITOR
  | K_REGR_SLOPE
  | K_TBL_CS
  | K_AND
  | K_CURSOR
  | K_HASHAMP
  | K_MONRESOURCE
  | K_REGR_SXX
  | K_TEMPORARY
  | K_ANSIDATE
  | K_CV
  | K_HASHBAKAMP
  | K_MONSESSION
  | K_REGR_SXY
  | K_TERMINATE
  | K_ANY
  | K_CYCLE
  | K_HASHBUCKET
  | K_MONTH
  | K_REGR_SYY
  | K_THEN
  | K_AS
  | K_DATABASE
  | K_HASHROW
  | K_MSUBSTR
  | K_RELEASE
  | K_THRESHOLD
  | K_ASC
  | K_DATABLOCKSIZE
  | K_HAVING
  | K_MSUM
  | K_RENAME
  | K_TIME
  | K_ASIN
  | K_DATE
  | K_HELP
  | K_MULTISET
  | K_REPEAT
  | K_TIMESTAMP
  | K_ASINH
  | K_DATEFORM
  | K_HOUR
  | K_NAMED
  | K_REPLACE
  | K_TIMEZONE_HOUR
  | K_AT
  | K_DAY
  | K_IDENTITY
  | K_NATURAL
  | K_REPLICATION
  | K_TIMEZONE_MINUTE
  | K_ATAN
  | K_DEC
  | K_IF
  | K_NE
  | K_REPOVERRIDE
  | K_TITLE
  | K_ATAN2
  | K_DECIMAL
  | K_IMMEDIATE
  | K_NEW
  | K_REQUEST
  | K_TO
  | K_ATANH
  | K_DECLARE
  | K_IN
  | K_NEW_TABLE
  | K_RESTART
  | K_TRACE
  | K_ATOMIC
  | K_DEFAULT
  | K_INCONSISTENT
  | K_NEXT
  | K_RESTORE
  | K_TRAILING
  | K_AUTHORIZATION
  | K_DEGREES
  | K_INDEX
  | K_NO
  | K_RESUME
  | K_TRANSACTION
  | K_AVE
  | K_DEL
  | K_INDICATOR
  | K_NONE
  | K_RET
  | K_TRANSLATE
  | K_AVERAGE
  | K_DELETE
  | K_INITIATE
  | K_NOT
  | K_RETRIEVE
  | K_TRANSLATE_CHK
  | K_AVG
  | K_DESC
  | K_INNER
  | K_NOWAIT
  | K_RETURNS
  | K_TRIGGER
  | K_BEFORE
  | K_DESCRIPTOR
  | K_INOUT
  | K_NULL
  | K_REVALIDATE
  | K_TRIM
  | K_BEGIN
  | K_DETERMINISTIC
  | K_INPUT
  | K_NULLIF
  | K_REVOKE
  | K_TYPE
  | K_BETWEEN
  | K_DIAGNOSTIC
  | K_INS
  | K_NULLIFZERO
  | K_RIGHT
  | K_UC
  | K_BLOB
  | K_DISABLED
  | K_INSERT
  | K_NUMERIC
  | K_RIGHTS
  | K_UNDEFINED
  | K_BOTH
  | K_DISTINCT
  | K_INSTEAD
  | K_OBJECTS
  | K_ROLE
  | K_UNDO
  | K_BT
  | K_DO
  | K_INT
  | K_OCTET_LENGTH
  | K_ROLLBACK
  | K_UNION
  | K_BUT
  | K_DOUBLE
  | K_INTEGER
  | K_OF
  | K_ROLLFORWARD
  | K_UNIQUE
  | K_BY
  | K_DROP
  | K_INTEGERDATE
  | K_OFF
  | K_ROW
  | K_UNTIL
  | K_BYTE
  | K_DUAL
  | K_INTERSECT
  | K_OLD
  | K_ROWID
  | K_UPD
  | K_BYTEINT
  | K_DUMP
  | K_INTERVAL
  | K_OLD_TABLE
  | K_ROWS
  | K_UPDATE
  | K_BYTES
  | K_EACH
  | K_INTO
  | K_ON
  | K_ROW_NUMBER
  | K_UPPER
  | K_CALL
  | K_ECHO
  | K_IS
  | K_ONLY
  | K_SAMPLE
  | K_UPPERCASE
  | K_CASE
  | K_ELSE
  | K_ITERATE
  | K_OPEN
  | K_SAMPLEID
  | K_USER
  | K_CASESPECIFIC
  | K_ELSEIF
  | K_JOIN
  | K_OPTION
  | K_SCROLL
  | K_USING
  | K_CASE_N
  | K_ENABLED
  | K_JOURNAL
  | K_OR
  | K_SECOND
  | K_VALUE
  | K_CAST
  | K_END
  | K_KEY
  | K_ORDER
  | K_SEL
  | K_VALUES
  | K_CD
  | K_EQ
  | K_KURTOSIS
  | K_OUT
  | K_SELECT
  | K_VARBYTE
  | K_CHAR
  | K_ERROR
  | K_LANGUAGE
  | K_OUTER
  | K_SESSION
  | K_VARCHAR
  | K_CHAR2HEXINT
  | K_ERRORFILES
  | K_LE
  | K_OVER
  | K_SET
  | K_VARGRAPHIC
  | K_CHARACTER
  | K_ERRORTABLES
  | K_LEADING
  | K_OVERLAPS
  | K_SETRESRATE
  | K_VARYING
  | K_CHARACTERS
  | K_ESCAPE
  | K_LEAVE
  | K_OVERRIDE
  | K_SETSESSRATE
  | K_VAR_POP
  | K_CHARACTER_LENGTH
  | K_ET
  | K_LEFT
  | K_PARAMETER
  | K_SHOW
  | K_VAR_SAMP
  | K_CHARS
  | K_EXCEPT
  | K_LIKE
  | K_PASSWORD
  | K_SIMPLE
  | K_VIEW
  | K_CHAR_LENGTH
  | K_EXEC
  | K_LIMIT
  | K_PERCENT
  | K_SIN
  | K_VOLATILE
  | K_CHECK
  | K_EXECUTE
  | K_LN
  | K_PERCENT_RANK
  | K_SINH
  | K_WAIT
  | K_CHECKPOINT
  | K_EXISTS
  | K_LOADING
  | K_PERM
  | K_SKEW
  | K_WHEN
  | K_CLASS
  | K_EXIT
  | K_LOCAL
  | K_PERMANENT
  | K_SMALLINT
  | K_WHERE
  | K_CLOSE
  | K_EXP
  | K_LOCATOR
  | K_POSITION
  | K_SOME
  | K_WHILE
  | K_CLUSTER
  | K_EXPLAIN
  | K_LOCK
  | K_PRECISION
  | K_SOUNDEX
  | K_WIDTH_BUCKET
  | K_CM
  | K_EXTERNAL
  | K_LOCKING
  | K_PREPARE
  | K_SPECIFIC
  | K_WITH
  | K_COALESCE
  | K_EXTRACT
  | K_LOG
  | K_PRESERVE
  | K_SPOOL
  | K_WITHOUT
  | K_COLLATION
  | K_FALLBACK
  | K_LOGGING
  | K_PRIMARY
  | K_SQL
  | K_WORK
  | K_COLLECT
  | K_FASTEXPORT
  | K_LOGON
  | K_PRIVATE
  | K_SQLEXCEPTION
  | K_YEAR
  | K_COLUMN
  | K_FETCH
  | K_LONG
  | K_PRIVILEGES
  | K_SQLTEXT
  | K_ZEROIFNULL
  | K_COMMENT
  | K_FIRST
  | K_LOOP
  | K_PROCEDURE
  | K_SQLWARNING
  | K_ZONE
  | K_COMMIT
  | K_FLOAT
  | K_LOWER
  | K_PROFILE
  | K_SQRT
  | K_COMPRESS
  | K_FOR
  | K_LT
  | K_PROPORTIONAL
  | K_SS
  | K_CONSTRAINT
  | K_FOREIGN
  | K_MACRO
  | K_PROTECTION
  | K_START
  | K_CONTINUE
  | K_FORMAT
  | K_MAVG
  | K_PUBLIC
  | K_STARTUP
  | K_TOP
  | K_TIES
  | K_VALIDTIME
  | K_TRANSACTIONTIME
  | K_BIGINT
;

SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';
COMMA : ',';
ASSIGN : '=';
STAR : '*';
PLUS : '+';
MINUS : '-';
TILDE : '~';
PIPE2 : '||';
DIV : '/';
MOD : '%';
LT2 : '<<';
GT2 : '>>';
AMP : '&';
PIPE : '|';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '==';
NOT_EQ1 : '!=';
NOT_EQ2 : '<>';

K_ABORT : A B O R T;
K_CONVERT_TABLE_HEADER : C O N V E R T '_' T A B L E '_' H E A D E R;
K_FOUND : F O U N D;
K_MAX : M A X;
K_QUALIFIED : Q U A L I F I E D;
K_STATEMENT : S T A T E M E N T;
K_ABORTSESSION : A B O R T S E S S I O N;
K_CORR : C O R R;
K_FREESPACE : F R E E S P A C E;
K_MAXIMUM : M A X I M U M;
K_QUALIFY : Q U A L I F Y;
K_STATISTICS : S T A T I S T I C S;
K_ABS : A B S;
K_COS : C O S;
K_FROM : F R O M;
K_MCHARACTERS : M C H A R A C T E R S;
K_QUANTILE : Q U A N T I L E;
K_STDDEV_POP : S T D D E V '_' P O P;
K_ACCESS_LOCK : A C C E S S '_' L O C K;
K_COSH : C O S H;
K_FULL : F U L L;
K_MDIFF : M D I F F;
K_RADIANS : R A D I A N S;
K_STDDEV_SAMP : S T D D E V '_' S A M P;
K_ACCOUNT : A C C O U N T;
K_COUNT : C O U N T;
K_FUNCTION : F U N C T I O N;
K_MERGE : M E R G E;
K_RANDOM : R A N D O M;
K_STEPINFO : S T E P I N F O;
K_ACOS : A C O S;
K_COVAR_POP : C O V A R '_' P O P;
K_GE : G E;
K_MIN : M I N;
K_RANGE_N : R A N G E '_' N;
K_STRING_CS : S T R I N G '_' C S;
K_ACOSH : A C O S H;
K_COVAR_SAMP : C O V A R '_' S A M P;
K_GENERATED : G E N E R A T E D;
K_MINDEX : M I N D E X;
K_RANK : R A N K;
K_SUBSCRIBER : S U B S C R I B E R;
K_ADD : A D D;
K_CREATE : C R E A T E;
K_GIVE : G I V E;
K_MINIMUM : M I N I M U M;
K_REAL : R E A L;
K_SUBSTR : S U B S T R;
K_ADD_MONTHS : A D D '_' M O N T H S;
K_CROSS : C R O S S;
K_GO : G O;
K_MINUS : M I N U S;
K_REFERENCES : R E F E R E N C E S;
K_SUBSTRING : S U B S T R I N G;
K_ADMIN : A D M I N;
K_CS : C S;
K_GOTO : G O T O;
K_MINUTE : M I N U T E;
K_REFERENCING : R E F E R E N C I N G;
K_SUM : S U M;
K_AFTER : A F T E R;
K_CSUM : C S U M;
K_GRANT : G R A N T;
K_MLINREG : M L I N R E G;
K_REGR_AVGX : R E G R '_' A V G X;
K_SUMMARY : S U M M A R Y;
K_AGGREGATE : A G G R E G A T E;
K_CT : C T;
K_GRAPHIC : G R A P H I C;
K_MLOAD : M L O A D;
K_REGR_AVGY : R E G R '_' A V G Y;
K_SUSPEND : S U S P E N D;
K_ALIAS : A L I A S;
K_CURRENT : C U R R E N T;
K_GROUP : G R O U P;
K_MOD : M O D;
K_REGR_COUNT : R E G R '_' C O U N T;
K_TABLE : T A B L E;
K_ALL : A L L;
K_CURRENT_DATE : C U R R E N T '_' D A T E;
K_GT : G T;
K_MODE : M O D E;
K_REGR_INTERCEPT : R E G R '_' I N T E R C E P T;
K_TAN : T A N;
K_ALTER : A L T E R;
K_CURRENT_TIME : C U R R E N T '_' T I M E;
K_HANDLER : H A N D L E R;
K_MODIFY : M O D I F Y;
K_REGR_R2 : R E G R '_' R '2';
K_TANH : T A N H;
K_AMP : A M P;
K_CURRENT_TIMESTAMP : C U R R E N T '_' T I M E S T A M P;
K_HASH : H A S H;
K_MONITOR : M O N I T O R;
K_REGR_SLOPE : R E G R '_' S L O P E;
K_TBL_CS : T B L '_' C S;
K_AND : A N D;
K_CURSOR : C U R S O R;
K_HASHAMP : H A S H A M P;
K_MONRESOURCE : M O N R E S O U R C E;
K_REGR_SXX : R E G R '_' S X X;
K_TEMPORARY : T E M P O R A R Y;
K_ANSIDATE : A N S I D A T E;
K_CV : C V;
K_HASHBAKAMP : H A S H B A K A M P;
K_MONSESSION : M O N S E S S I O N;
K_REGR_SXY : R E G R '_' S X Y;
K_TERMINATE : T E R M I N A T E;
K_ANY : A N Y;
K_CYCLE : C Y C L E;
K_HASHBUCKET : H A S H B U C K E T;
K_MONTH : M O N T H;
K_REGR_SYY : R E G R '_' S Y Y;
K_THEN : T H E N;
K_AS : A S;
K_DATABASE : D A T A B A S E;
K_HASHROW : H A S H R O W;
K_MSUBSTR : M S U B S T R;
K_RELEASE : R E L E A S E;
K_THRESHOLD : T H R E S H O L D;
K_ASC : A S C;
K_DATABLOCKSIZE : D A T A B L O C K S I Z E;
K_HAVING : H A V I N G;
K_MSUM : M S U M;
K_RENAME : R E N A M E;
K_TIME : T I M E;
K_ASIN : A S I N;
K_DATE : D A T E;
K_HELP : H E L P;
K_MULTISET : M U L T I S E T;
K_REPEAT : R E P E A T;
K_TIMESTAMP : T I M E S T A M P;
K_ASINH : A S I N H;
K_DATEFORM : D A T E F O R M;
K_HOUR : H O U R;
K_NAMED : N A M E D;
K_REPLACE : R E P L A C E;
K_TIMEZONE_HOUR : T I M E Z O N E '_' H O U R;
K_AT : A T;
K_DAY : D A Y;
K_IDENTITY : I D E N T I T Y;
K_NATURAL : N A T U R A L;
K_REPLICATION : R E P L I C A T I O N;
K_TIMEZONE_MINUTE : T I M E Z O N E '_' M I N U T E;
K_ATAN : A T A N;
K_DEC : D E C;
K_IF : I F;
K_NE : N E;
K_REPOVERRIDE : R E P O V E R R I D E;
K_TITLE : T I T L E;
K_ATAN2 : A T A N '2';
K_DECIMAL : D E C I M A L;
K_IMMEDIATE : I M M E D I A T E;
K_NEW : N E W;
K_REQUEST : R E Q U E S T;
K_TO : T O;
K_ATANH : A T A N H;
K_DECLARE : D E C L A R E;
K_IN : I N;
K_NEW_TABLE : N E W '_' T A B L E;
K_RESTART : R E S T A R T;
K_TRACE : T R A C E;
K_ATOMIC : A T O M I C;
K_DEFAULT : D E F A U L T;
K_INCONSISTENT : I N C O N S I S T E N T;
K_NEXT : N E X T;
K_RESTORE : R E S T O R E;
K_TRAILING : T R A I L I N G;
K_AUTHORIZATION : A U T H O R I Z A T I O N;
K_DEGREES : D E G R E E S;
K_INDEX : I N D E X;
K_NO : N O;
K_RESUME : R E S U M E;
K_TRANSACTION : T R A N S A C T I O N;
K_AVE : A V E;
K_DEL : D E L;
K_INDICATOR : I N D I C A T O R;
K_NONE : N O N E;
K_RET : R E T;
K_TRANSLATE : T R A N S L A T E;
K_AVERAGE : A V E R A G E;
K_DELETE : D E L E T E;
K_INITIATE : I N I T I A T E;
K_NOT : N O T;
K_RETRIEVE : R E T R I E V E;
K_TRANSLATE_CHK : T R A N S L A T E '_' C H K;
K_AVG : A V G;
K_DESC : D E S C;
K_INNER : I N N E R;
K_NOWAIT : N O W A I T;
K_RETURNS : R E T U R N S;
K_TRIGGER : T R I G G E R;
K_BEFORE : B E F O R E;
K_DESCRIPTOR : D E S C R I P T O R;
K_INOUT : I N O U T;
K_NULL : N U L L;
K_REVALIDATE : R E V A L I D A T E;
K_TRIM : T R I M;
K_BEGIN : B E G I N;
K_DETERMINISTIC : D E T E R M I N I S T I C;
K_INPUT : I N P U T;
K_NULLIF : N U L L I F;
K_REVOKE : R E V O K E;
K_TYPE : T Y P E;
K_BETWEEN : B E T W E E N;
K_DIAGNOSTIC : D I A G N O S T I C;
K_INS : I N S;
K_NULLIFZERO : N U L L I F Z E R O;
K_RIGHT : R I G H T;
K_UC : U C;
K_BLOB : B L O B;
K_DISABLED : D I S A B L E D;
K_INSERT : I N S E R T;
K_NUMERIC : N U M E R I C;
K_RIGHTS : R I G H T S;
K_UNDEFINED : U N D E F I N E D;
K_BOTH : B O T H;
K_DISTINCT : D I S T I N C T;
K_INSTEAD : I N S T E A D;
K_OBJECTS : O B J E C T S;
K_ROLE : R O L E;
K_UNDO : U N D O;
K_BT : B T;
K_DO : D O;
K_INT : I N T;
K_OCTET_LENGTH : O C T E T '_' L E N G T H;
K_ROLLBACK : R O L L B A C K;
K_UNION : U N I O N;
K_BUT : B U T;
K_DOUBLE : D O U B L E;
K_INTEGER : I N T E G E R;
K_OF : O F;
K_ROLLFORWARD : R O L L F O R W A R D;
K_UNIQUE : U N I Q U E;
K_BY : B Y;
K_DROP : D R O P;
K_INTEGERDATE : I N T E G E R D A T E;
K_OFF : O F F;
K_ROW : R O W;
K_UNTIL : U N T I L;
K_BYTE : B Y T E;
K_DUAL : D U A L;
K_INTERSECT : I N T E R S E C T;
K_OLD : O L D;
K_ROWID : R O W I D;
K_UPD : U P D;
K_BYTEINT : B Y T E I N T;
K_DUMP : D U M P;
K_INTERVAL : I N T E R V A L;
K_OLD_TABLE : O L D '_' T A B L E;
K_ROWS : R O W S;
K_UPDATE : U P D A T E;
K_BYTES : B Y T E S;
K_EACH : E A C H;
K_INTO : I N T O;
K_ON : O N;
K_ROW_NUMBER : R O W '_' N U M B E R;
K_UPPER : U P P E R;
K_CALL : C A L L;
K_ECHO : E C H O;
K_IS : I S;
K_ONLY : O N L Y;
K_SAMPLE : S A M P L E;
K_UPPERCASE : U P P E R C A S E;
K_CASE : C A S E;
K_ELSE : E L S E;
K_ITERATE : I T E R A T E;
K_OPEN : O P E N;
K_SAMPLEID : S A M P L E I D;
K_USER : U S E R;
K_CASESPECIFIC : C A S E S P E C I F I C;
K_ELSEIF : E L S E I F;
K_JOIN : J O I N;
K_OPTION : O P T I O N;
K_SCROLL : S C R O L L;
K_USING : U S I N G;
K_CASE_N : C A S E '_' N;
K_ENABLED : E N A B L E D;
K_JOURNAL : J O U R N A L;
K_OR : O R;
K_SECOND : S E C O N D;
K_VALUE : V A L U E;
K_CAST : C A S T;
K_END : E N D;
K_KEY : K E Y;
K_ORDER : O R D E R;
K_SEL : S E L;
K_VALUES : V A L U E S;
K_CD : C D;
K_EQ : E Q;
K_KURTOSIS : K U R T O S I S;
K_OUT : O U T;
K_SELECT : S E L E C T;
K_VARBYTE : V A R B Y T E;
K_CHAR : C H A R;
K_ERROR : E R R O R;
K_LANGUAGE : L A N G U A G E;
K_OUTER : O U T E R;
K_SESSION : S E S S I O N;
K_VARCHAR : V A R C H A R;
K_CHAR2HEXINT : C H A R '2' H E X I N T;
K_ERRORFILES : E R R O R F I L E S;
K_LE : L E;
K_OVER : O V E R;
K_SET : S E T;
K_VARGRAPHIC : V A R G R A P H I C;
K_CHARACTER : C H A R A C T E R;
K_ERRORTABLES : E R R O R T A B L E S;
K_LEADING : L E A D I N G;
K_OVERLAPS : O V E R L A P S;
K_SETRESRATE : S E T R E S R A T E;
K_VARYING : V A R Y I N G;
K_CHARACTERS : C H A R A C T E R S;
K_ESCAPE : E S C A P E;
K_LEAVE : L E A V E;
K_OVERRIDE : O V E R R I D E;
K_SETSESSRATE : S E T S E S S R A T E;
K_VAR_POP : V A R '_' P O P;
K_CHARACTER_LENGTH : C H A R A C T E R '_' L E N G T H;
K_ET : E T;
K_LEFT : L E F T;
K_PARAMETER : P A R A M E T E R;
K_SHOW : S H O W;
K_VAR_SAMP : V A R '_' S A M P;
K_CHARS : C H A R S;
K_EXCEPT : E X C E P T;
K_LIKE : L I K E;
K_PASSWORD : P A S S W O R D;
K_SIMPLE : S I M P L E;
K_VIEW : V I E W;
K_CHAR_LENGTH : C H A R '_' L E N G T H;
K_EXEC : E X E C;
K_LIMIT : L I M I T;
K_PERCENT : P E R C E N T;
K_SIN : S I N;
K_VOLATILE : V O L A T I L E;
K_CHECK : C H E C K;
K_EXECUTE : E X E C U T E;
K_LN : L N;
K_PERCENT_RANK : P E R C E N T '_' R A N K;
K_SINH : S I N H;
K_WAIT : W A I T;
K_CHECKPOINT : C H E C K P O I N T;
K_EXISTS : E X I S T S;
K_LOADING : L O A D I N G;
K_PERM : P E R M;
K_SKEW : S K E W;
K_WHEN : W H E N;
K_CLASS : C L A S S;
K_EXIT : E X I T;
K_LOCAL : L O C A L;
K_PERMANENT : P E R M A N E N T;
K_SMALLINT : S M A L L I N T;
K_WHERE : W H E R E;
K_CLOSE : C L O S E;
K_EXP : E X P;
K_LOCATOR : L O C A T O R;
K_POSITION : P O S I T I O N;
K_SOME : S O M E;
K_WHILE : W H I L E;
K_CLUSTER : C L U S T E R;
K_EXPLAIN : E X P L A I N;
K_LOCK : L O C K;
K_PRECISION : P R E C I S I O N;
K_SOUNDEX : S O U N D E X;
K_WIDTH_BUCKET : W I D T H '_' B U C K E T;
K_CM : C M;
K_EXTERNAL : E X T E R N A L;
K_LOCKING : L O C K I N G;
K_PREPARE : P R E P A R E;
K_SPECIFIC : S P E C I F I C;
K_WITH : W I T H;
K_COALESCE : C O A L E S C E;
K_EXTRACT : E X T R A C T;
K_LOG : L O G;
K_PRESERVE : P R E S E R V E;
K_SPOOL : S P O O L;
K_WITHOUT : W I T H O U T;
K_COLLATION : C O L L A T I O N;
K_FALLBACK : F A L L B A C K;
K_LOGGING : L O G G I N G;
K_PRIMARY : P R I M A R Y;
K_SQL : S Q L;
K_WORK : W O R K;
K_COLLECT : C O L L E C T;
K_FASTEXPORT : F A S T E X P O R T;
K_LOGON : L O G O N;
K_PRIVATE : P R I V A T E;
K_SQLEXCEPTION : S Q L E X C E P T I O N;
K_YEAR : Y E A R;
K_COLUMN : C O L U M N;
K_FETCH : F E T C H;
K_LONG : L O N G;
K_PRIVILEGES : P R I V I L E G E S;
K_SQLTEXT : S Q L T E X T;
K_ZEROIFNULL : Z E R O I F N U L L;
K_COMMENT : C O M M E N T;
K_FIRST : F I R S T;
K_LOOP : L O O P;
K_PROCEDURE : P R O C E D U R E;
K_SQLWARNING : S Q L W A R N I N G;
K_ZONE : Z O N E;
K_COMMIT : C O M M I T;
K_FLOAT : F L O A T;
K_LOWER : L O W E R;
K_PROFILE : P R O F I L E;
K_SQRT : S Q R T;
K_COMPRESS : C O M P R E S S;
K_FOR : F O R;
K_LT : L T;
K_PROPORTIONAL : P R O P O R T I O N A L;
K_SS : S S;
K_CONSTRAINT : C O N S T R A I N T;
K_FOREIGN : F O R E I G N;
K_MACRO : M A C R O;
K_PROTECTION : P R O T E C T I O N;
K_START : S T A R T;
K_CONTINUE : C O N T I N U E;
K_FORMAT : F O R M A T;
K_MAVG : M A V G;
K_PUBLIC : P U B L I C;
K_STARTUP : S T A R T U P ;
K_TOP : T O P;
K_TIES : T I E S;
K_VALIDTIME : V A L I D T I M E;
K_TRANSACTIONTIME : T R A N S A C T I O N T I M E;
K_BIGINT : B I G I N T;
K_NORMALIZE : N O R M A L I Z E;
K_MEETS : M E E T S;
K_LAST : L A S T;
K_NULLS : N U L L S;
K_ERRORS : E R R O R S;

name
 : any_name
 ;

function_name
 : IDENTIFIER
 ;

database_name
 : IDENTIFIER
 ;

table_name
 : (database_name DOT)? IDENTIFIER
 ;

column_name
 : (table_name DOT)? IDENTIFIER
 ;

correlation_name
 : IDENTIFIER
 ;

type_name
 : types (OPEN_PAR (STRING_LITERAL|INTEGER|',')+ CLOSE_PAR)?
 ;

types
 : K_DATE | K_TIME | K_TIMESTAMP | K_INTEGER | K_DEC | K_DECIMAL | K_CHAR | K_CHARACTER | K_VARCHAR
 | K_FLOAT | K_INT | K_SMALLINT | K_BIGINT | K_BLOB | K_VARBYTE | K_BYTE | K_BYTEINT | K_NUMERIC | K_DOUBLE | K_CURSOR
 ;

any_name
 : IDENTIFIER
 | keyword
 | STRING_LITERAL
 | '(' any_name ')'
 ;

NUMERIC_LITERAL
 : INTEGER
 | DECIMAL
 | SCIENTIFIC
 ;

INTEGER
 : [0-9]+
 ;

DECIMAL
 : [0-9] '.' [0-9]*
 ;

SCIENTIFIC
 : [0-9] E [0-9]+
 ;

IDENTIFIER
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
 | '[' ~']'* ']'
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;


SINGLE_LINE_COMMENT
 : '--' ~[\r\n]* -> channel(HIDDEN)
 ;

MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;
 
fragment DIGIT : [0-9];
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];