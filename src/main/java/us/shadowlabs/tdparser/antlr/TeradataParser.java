// Generated from src\main\java\u005Cus\shadowlabs\tdparser\antlr\Teradata.G4 by ANTLR 4.5.3
package us.shadowlabs.tdparser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TeradataParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, K_ABORT=25, 
		K_CONVERT_TABLE_HEADER=26, K_FOUND=27, K_MAX=28, K_QUALIFIED=29, K_STATEMENT=30, 
		K_ABORTSESSION=31, K_CORR=32, K_FREESPACE=33, K_MAXIMUM=34, K_QUALIFY=35, 
		K_STATISTICS=36, K_ABS=37, K_COS=38, K_FROM=39, K_MCHARACTERS=40, K_QUANTILE=41, 
		K_STDDEV_POP=42, K_ACCESS_LOCK=43, K_COSH=44, K_FULL=45, K_MDIFF=46, K_RADIANS=47, 
		K_STDDEV_SAMP=48, K_ACCOUNT=49, K_COUNT=50, K_FUNCTION=51, K_MERGE=52, 
		K_RANDOM=53, K_STEPINFO=54, K_ACOS=55, K_COVAR_POP=56, K_GE=57, K_MIN=58, 
		K_RANGE_N=59, K_STRING_CS=60, K_ACOSH=61, K_COVAR_SAMP=62, K_GENERATED=63, 
		K_MINDEX=64, K_RANK=65, K_SUBSCRIBER=66, K_ADD=67, K_CREATE=68, K_GIVE=69, 
		K_MINIMUM=70, K_REAL=71, K_SUBSTR=72, K_ADD_MONTHS=73, K_CROSS=74, K_GO=75, 
		K_MINUS=76, K_REFERENCES=77, K_SUBSTRING=78, K_ADMIN=79, K_CS=80, K_GOTO=81, 
		K_MINUTE=82, K_REFERENCING=83, K_SUM=84, K_AFTER=85, K_CSUM=86, K_GRANT=87, 
		K_MLINREG=88, K_REGR_AVGX=89, K_SUMMARY=90, K_AGGREGATE=91, K_CT=92, K_GRAPHIC=93, 
		K_MLOAD=94, K_REGR_AVGY=95, K_SUSPEND=96, K_ALIAS=97, K_CURRENT=98, K_GROUP=99, 
		K_MOD=100, K_REGR_COUNT=101, K_TABLE=102, K_ALL=103, K_CURRENT_DATE=104, 
		K_GT=105, K_MODE=106, K_REGR_INTERCEPT=107, K_TAN=108, K_ALTER=109, K_CURRENT_TIME=110, 
		K_HANDLER=111, K_MODIFY=112, K_REGR_R2=113, K_TANH=114, K_AMP=115, K_CURRENT_TIMESTAMP=116, 
		K_HASH=117, K_MONITOR=118, K_REGR_SLOPE=119, K_TBL_CS=120, K_AND=121, 
		K_CURSOR=122, K_HASHAMP=123, K_MONRESOURCE=124, K_REGR_SXX=125, K_TEMPORARY=126, 
		K_ANSIDATE=127, K_CV=128, K_HASHBAKAMP=129, K_MONSESSION=130, K_REGR_SXY=131, 
		K_TERMINATE=132, K_ANY=133, K_CYCLE=134, K_HASHBUCKET=135, K_MONTH=136, 
		K_REGR_SYY=137, K_THEN=138, K_AS=139, K_DATABASE=140, K_HASHROW=141, K_MSUBSTR=142, 
		K_RELEASE=143, K_THRESHOLD=144, K_ASC=145, K_DATABLOCKSIZE=146, K_HAVING=147, 
		K_MSUM=148, K_RENAME=149, K_TIME=150, K_ASIN=151, K_DATE=152, K_HELP=153, 
		K_MULTISET=154, K_REPEAT=155, K_TIMESTAMP=156, K_ASINH=157, K_DATEFORM=158, 
		K_HOUR=159, K_NAMED=160, K_REPLACE=161, K_TIMEZONE_HOUR=162, K_AT=163, 
		K_DAY=164, K_IDENTITY=165, K_NATURAL=166, K_REPLICATION=167, K_TIMEZONE_MINUTE=168, 
		K_ATAN=169, K_DEC=170, K_IF=171, K_NE=172, K_REPOVERRIDE=173, K_TITLE=174, 
		K_ATAN2=175, K_DECIMAL=176, K_IMMEDIATE=177, K_NEW=178, K_REQUEST=179, 
		K_TO=180, K_ATANH=181, K_DECLARE=182, K_IN=183, K_NEW_TABLE=184, K_RESTART=185, 
		K_TRACE=186, K_ATOMIC=187, K_DEFAULT=188, K_INCONSISTENT=189, K_NEXT=190, 
		K_RESTORE=191, K_TRAILING=192, K_AUTHORIZATION=193, K_DEGREES=194, K_INDEX=195, 
		K_NO=196, K_RESUME=197, K_TRANSACTION=198, K_AVE=199, K_DEL=200, K_INDICATOR=201, 
		K_NONE=202, K_RET=203, K_TRANSLATE=204, K_AVERAGE=205, K_DELETE=206, K_INITIATE=207, 
		K_NOT=208, K_RETRIEVE=209, K_TRANSLATE_CHK=210, K_AVG=211, K_DESC=212, 
		K_INNER=213, K_NOWAIT=214, K_RETURNS=215, K_TRIGGER=216, K_BEFORE=217, 
		K_DESCRIPTOR=218, K_INOUT=219, K_NULL=220, K_REVALIDATE=221, K_TRIM=222, 
		K_BEGIN=223, K_DETERMINISTIC=224, K_INPUT=225, K_NULLIF=226, K_REVOKE=227, 
		K_TYPE=228, K_BETWEEN=229, K_DIAGNOSTIC=230, K_INS=231, K_NULLIFZERO=232, 
		K_RIGHT=233, K_UC=234, K_BLOB=235, K_DISABLED=236, K_INSERT=237, K_NUMERIC=238, 
		K_RIGHTS=239, K_UNDEFINED=240, K_BOTH=241, K_DISTINCT=242, K_INSTEAD=243, 
		K_OBJECTS=244, K_ROLE=245, K_UNDO=246, K_BT=247, K_DO=248, K_INT=249, 
		K_OCTET_LENGTH=250, K_ROLLBACK=251, K_UNION=252, K_BUT=253, K_DOUBLE=254, 
		K_INTEGER=255, K_OF=256, K_ROLLFORWARD=257, K_UNIQUE=258, K_BY=259, K_DROP=260, 
		K_INTEGERDATE=261, K_OFF=262, K_ROW=263, K_UNTIL=264, K_BYTE=265, K_DUAL=266, 
		K_INTERSECT=267, K_OLD=268, K_ROWID=269, K_UPD=270, K_BYTEINT=271, K_DUMP=272, 
		K_INTERVAL=273, K_OLD_TABLE=274, K_ROWS=275, K_UPDATE=276, K_BYTES=277, 
		K_EACH=278, K_INTO=279, K_ON=280, K_ROW_NUMBER=281, K_UPPER=282, K_CALL=283, 
		K_ECHO=284, K_IS=285, K_ONLY=286, K_SAMPLE=287, K_UPPERCASE=288, K_CASE=289, 
		K_ELSE=290, K_ITERATE=291, K_OPEN=292, K_SAMPLEID=293, K_USER=294, K_CASESPECIFIC=295, 
		K_ELSEIF=296, K_JOIN=297, K_OPTION=298, K_SCROLL=299, K_USING=300, K_CASE_N=301, 
		K_ENABLED=302, K_JOURNAL=303, K_OR=304, K_SECOND=305, K_VALUE=306, K_CAST=307, 
		K_END=308, K_KEY=309, K_ORDER=310, K_SEL=311, K_VALUES=312, K_CD=313, 
		K_EQ=314, K_KURTOSIS=315, K_OUT=316, K_SELECT=317, K_VARBYTE=318, K_CHAR=319, 
		K_ERROR=320, K_LANGUAGE=321, K_OUTER=322, K_SESSION=323, K_VARCHAR=324, 
		K_CHAR2HEXINT=325, K_ERRORFILES=326, K_LE=327, K_OVER=328, K_SET=329, 
		K_VARGRAPHIC=330, K_CHARACTER=331, K_ERRORTABLES=332, K_LEADING=333, K_OVERLAPS=334, 
		K_SETRESRATE=335, K_VARYING=336, K_CHARACTERS=337, K_ESCAPE=338, K_LEAVE=339, 
		K_OVERRIDE=340, K_SETSESSRATE=341, K_VAR_POP=342, K_CHARACTER_LENGTH=343, 
		K_ET=344, K_LEFT=345, K_PARAMETER=346, K_SHOW=347, K_VAR_SAMP=348, K_CHARS=349, 
		K_EXCEPT=350, K_LIKE=351, K_PASSWORD=352, K_SIMPLE=353, K_VIEW=354, K_CHAR_LENGTH=355, 
		K_EXEC=356, K_LIMIT=357, K_PERCENT=358, K_SIN=359, K_VOLATILE=360, K_CHECK=361, 
		K_EXECUTE=362, K_LN=363, K_PERCENT_RANK=364, K_SINH=365, K_WAIT=366, K_CHECKPOINT=367, 
		K_EXISTS=368, K_LOADING=369, K_PERM=370, K_SKEW=371, K_WHEN=372, K_CLASS=373, 
		K_EXIT=374, K_LOCAL=375, K_PERMANENT=376, K_SMALLINT=377, K_WHERE=378, 
		K_CLOSE=379, K_EXP=380, K_LOCATOR=381, K_POSITION=382, K_SOME=383, K_WHILE=384, 
		K_CLUSTER=385, K_EXPLAIN=386, K_LOCK=387, K_PRECISION=388, K_SOUNDEX=389, 
		K_WIDTH_BUCKET=390, K_CM=391, K_EXTERNAL=392, K_LOCKING=393, K_PREPARE=394, 
		K_SPECIFIC=395, K_WITH=396, K_COALESCE=397, K_EXTRACT=398, K_LOG=399, 
		K_PRESERVE=400, K_SPOOL=401, K_WITHOUT=402, K_COLLATION=403, K_FALLBACK=404, 
		K_LOGGING=405, K_PRIMARY=406, K_SQL=407, K_WORK=408, K_COLLECT=409, K_FASTEXPORT=410, 
		K_LOGON=411, K_PRIVATE=412, K_SQLEXCEPTION=413, K_YEAR=414, K_COLUMN=415, 
		K_FETCH=416, K_LONG=417, K_PRIVILEGES=418, K_SQLTEXT=419, K_ZEROIFNULL=420, 
		K_COMMENT=421, K_FIRST=422, K_LOOP=423, K_PROCEDURE=424, K_SQLWARNING=425, 
		K_ZONE=426, K_COMMIT=427, K_FLOAT=428, K_LOWER=429, K_PROFILE=430, K_SQRT=431, 
		K_COMPRESS=432, K_FOR=433, K_LT=434, K_PROPORTIONAL=435, K_SS=436, K_CONSTRAINT=437, 
		K_FOREIGN=438, K_MACRO=439, K_PROTECTION=440, K_START=441, K_CONTINUE=442, 
		K_FORMAT=443, K_MAVG=444, K_PUBLIC=445, K_STARTUP=446, K_TOP=447, K_TIES=448, 
		K_VALIDTIME=449, K_TRANSACTIONTIME=450, K_BIGINT=451, K_NORMALIZE=452, 
		K_MEETS=453, K_LAST=454, K_NULLS=455, K_ERRORS=456, NUMERIC_LITERAL=457, 
		INTEGER=458, DECIMAL=459, SCIENTIFIC=460, IDENTIFIER=461, STRING_LITERAL=462, 
		SINGLE_LINE_COMMENT=463, MULTILINE_COMMENT=464, SPACES=465, UNEXPECTED_CHAR=466;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_select_stmt = 4, RULE_select_expr = 5, RULE_insert_stmt = 6, RULE_insert_sub_expr = 7, 
		RULE_insert_logging_errors = 8, RULE_top_expr = 9, RULE_having_qualify_expr = 10, 
		RULE_select_list = 11, RULE_select_list_expr = 12, RULE_from_clause = 13, 
		RULE_from_expr = 14, RULE_as_of = 15, RULE_from_table_expr = 16, RULE_from_single_expr = 17, 
		RULE_from_join_expr = 18, RULE_from_derived_expr = 19, RULE_from_tablefunc_expr = 20, 
		RULE_from_with_expr = 21, RULE_normalize_expr = 22, RULE_where_clause = 23, 
		RULE_having_expr = 24, RULE_qualify_expr = 25, RULE_sample_expr = 26, 
		RULE_expand_expr = 27, RULE_group_by_list = 28, RULE_group_by_val = 29, 
		RULE_order_by_list = 30, RULE_order_by_val = 31, RULE_seed_stmt = 32, 
		RULE_expr = 33, RULE_expr_list = 34, RULE_ordinary_grouping_set = 35, 
		RULE_empty_grouping_set = 36, RULE_rollup_list = 37, RULE_cube_list = 38, 
		RULE_grouping_sets_specification = 39, RULE_column_position = 40, RULE_subquery = 41, 
		RULE_search_condition = 42, RULE_conditional_expr = 43, RULE_column_list = 44, 
		RULE_signed_number = 45, RULE_literal_value = 46, RULE_unary_operator = 47, 
		RULE_column_alias = 48, RULE_query_name = 49, RULE_expr_alias_name = 50, 
		RULE_joined_table = 51, RULE_single_table_expr = 52, RULE_derived_table_name = 53, 
		RULE_date_expr = 54, RULE_timestamp_expr = 55, RULE_time_expr = 56, RULE_date_timestamp_expr = 57, 
		RULE_keyword = 58, RULE_name = 59, RULE_function_name = 60, RULE_database_name = 61, 
		RULE_table_name = 62, RULE_column_name = 63, RULE_correlation_name = 64, 
		RULE_type_name = 65, RULE_types = 66, RULE_any_name = 67;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "select_stmt", "select_expr", 
		"insert_stmt", "insert_sub_expr", "insert_logging_errors", "top_expr", 
		"having_qualify_expr", "select_list", "select_list_expr", "from_clause", 
		"from_expr", "as_of", "from_table_expr", "from_single_expr", "from_join_expr", 
		"from_derived_expr", "from_tablefunc_expr", "from_with_expr", "normalize_expr", 
		"where_clause", "having_expr", "qualify_expr", "sample_expr", "expand_expr", 
		"group_by_list", "group_by_val", "order_by_list", "order_by_val", "seed_stmt", 
		"expr", "expr_list", "ordinary_grouping_set", "empty_grouping_set", "rollup_list", 
		"cube_list", "grouping_sets_specification", "column_position", "subquery", 
		"search_condition", "conditional_expr", "column_list", "signed_number", 
		"literal_value", "unary_operator", "column_alias", "query_name", "expr_alias_name", 
		"joined_table", "single_table_expr", "derived_table_name", "date_expr", 
		"timestamp_expr", "time_expr", "date_timestamp_expr", "keyword", "name", 
		"function_name", "database_name", "table_name", "column_name", "correlation_name", 
		"type_name", "types", "any_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", 
		"'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
		"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
		"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", 
		"K_CONVERT_TABLE_HEADER", "K_FOUND", "K_MAX", "K_QUALIFIED", "K_STATEMENT", 
		"K_ABORTSESSION", "K_CORR", "K_FREESPACE", "K_MAXIMUM", "K_QUALIFY", "K_STATISTICS", 
		"K_ABS", "K_COS", "K_FROM", "K_MCHARACTERS", "K_QUANTILE", "K_STDDEV_POP", 
		"K_ACCESS_LOCK", "K_COSH", "K_FULL", "K_MDIFF", "K_RADIANS", "K_STDDEV_SAMP", 
		"K_ACCOUNT", "K_COUNT", "K_FUNCTION", "K_MERGE", "K_RANDOM", "K_STEPINFO", 
		"K_ACOS", "K_COVAR_POP", "K_GE", "K_MIN", "K_RANGE_N", "K_STRING_CS", 
		"K_ACOSH", "K_COVAR_SAMP", "K_GENERATED", "K_MINDEX", "K_RANK", "K_SUBSCRIBER", 
		"K_ADD", "K_CREATE", "K_GIVE", "K_MINIMUM", "K_REAL", "K_SUBSTR", "K_ADD_MONTHS", 
		"K_CROSS", "K_GO", "K_MINUS", "K_REFERENCES", "K_SUBSTRING", "K_ADMIN", 
		"K_CS", "K_GOTO", "K_MINUTE", "K_REFERENCING", "K_SUM", "K_AFTER", "K_CSUM", 
		"K_GRANT", "K_MLINREG", "K_REGR_AVGX", "K_SUMMARY", "K_AGGREGATE", "K_CT", 
		"K_GRAPHIC", "K_MLOAD", "K_REGR_AVGY", "K_SUSPEND", "K_ALIAS", "K_CURRENT", 
		"K_GROUP", "K_MOD", "K_REGR_COUNT", "K_TABLE", "K_ALL", "K_CURRENT_DATE", 
		"K_GT", "K_MODE", "K_REGR_INTERCEPT", "K_TAN", "K_ALTER", "K_CURRENT_TIME", 
		"K_HANDLER", "K_MODIFY", "K_REGR_R2", "K_TANH", "K_AMP", "K_CURRENT_TIMESTAMP", 
		"K_HASH", "K_MONITOR", "K_REGR_SLOPE", "K_TBL_CS", "K_AND", "K_CURSOR", 
		"K_HASHAMP", "K_MONRESOURCE", "K_REGR_SXX", "K_TEMPORARY", "K_ANSIDATE", 
		"K_CV", "K_HASHBAKAMP", "K_MONSESSION", "K_REGR_SXY", "K_TERMINATE", "K_ANY", 
		"K_CYCLE", "K_HASHBUCKET", "K_MONTH", "K_REGR_SYY", "K_THEN", "K_AS", 
		"K_DATABASE", "K_HASHROW", "K_MSUBSTR", "K_RELEASE", "K_THRESHOLD", "K_ASC", 
		"K_DATABLOCKSIZE", "K_HAVING", "K_MSUM", "K_RENAME", "K_TIME", "K_ASIN", 
		"K_DATE", "K_HELP", "K_MULTISET", "K_REPEAT", "K_TIMESTAMP", "K_ASINH", 
		"K_DATEFORM", "K_HOUR", "K_NAMED", "K_REPLACE", "K_TIMEZONE_HOUR", "K_AT", 
		"K_DAY", "K_IDENTITY", "K_NATURAL", "K_REPLICATION", "K_TIMEZONE_MINUTE", 
		"K_ATAN", "K_DEC", "K_IF", "K_NE", "K_REPOVERRIDE", "K_TITLE", "K_ATAN2", 
		"K_DECIMAL", "K_IMMEDIATE", "K_NEW", "K_REQUEST", "K_TO", "K_ATANH", "K_DECLARE", 
		"K_IN", "K_NEW_TABLE", "K_RESTART", "K_TRACE", "K_ATOMIC", "K_DEFAULT", 
		"K_INCONSISTENT", "K_NEXT", "K_RESTORE", "K_TRAILING", "K_AUTHORIZATION", 
		"K_DEGREES", "K_INDEX", "K_NO", "K_RESUME", "K_TRANSACTION", "K_AVE", 
		"K_DEL", "K_INDICATOR", "K_NONE", "K_RET", "K_TRANSLATE", "K_AVERAGE", 
		"K_DELETE", "K_INITIATE", "K_NOT", "K_RETRIEVE", "K_TRANSLATE_CHK", "K_AVG", 
		"K_DESC", "K_INNER", "K_NOWAIT", "K_RETURNS", "K_TRIGGER", "K_BEFORE", 
		"K_DESCRIPTOR", "K_INOUT", "K_NULL", "K_REVALIDATE", "K_TRIM", "K_BEGIN", 
		"K_DETERMINISTIC", "K_INPUT", "K_NULLIF", "K_REVOKE", "K_TYPE", "K_BETWEEN", 
		"K_DIAGNOSTIC", "K_INS", "K_NULLIFZERO", "K_RIGHT", "K_UC", "K_BLOB", 
		"K_DISABLED", "K_INSERT", "K_NUMERIC", "K_RIGHTS", "K_UNDEFINED", "K_BOTH", 
		"K_DISTINCT", "K_INSTEAD", "K_OBJECTS", "K_ROLE", "K_UNDO", "K_BT", "K_DO", 
		"K_INT", "K_OCTET_LENGTH", "K_ROLLBACK", "K_UNION", "K_BUT", "K_DOUBLE", 
		"K_INTEGER", "K_OF", "K_ROLLFORWARD", "K_UNIQUE", "K_BY", "K_DROP", "K_INTEGERDATE", 
		"K_OFF", "K_ROW", "K_UNTIL", "K_BYTE", "K_DUAL", "K_INTERSECT", "K_OLD", 
		"K_ROWID", "K_UPD", "K_BYTEINT", "K_DUMP", "K_INTERVAL", "K_OLD_TABLE", 
		"K_ROWS", "K_UPDATE", "K_BYTES", "K_EACH", "K_INTO", "K_ON", "K_ROW_NUMBER", 
		"K_UPPER", "K_CALL", "K_ECHO", "K_IS", "K_ONLY", "K_SAMPLE", "K_UPPERCASE", 
		"K_CASE", "K_ELSE", "K_ITERATE", "K_OPEN", "K_SAMPLEID", "K_USER", "K_CASESPECIFIC", 
		"K_ELSEIF", "K_JOIN", "K_OPTION", "K_SCROLL", "K_USING", "K_CASE_N", "K_ENABLED", 
		"K_JOURNAL", "K_OR", "K_SECOND", "K_VALUE", "K_CAST", "K_END", "K_KEY", 
		"K_ORDER", "K_SEL", "K_VALUES", "K_CD", "K_EQ", "K_KURTOSIS", "K_OUT", 
		"K_SELECT", "K_VARBYTE", "K_CHAR", "K_ERROR", "K_LANGUAGE", "K_OUTER", 
		"K_SESSION", "K_VARCHAR", "K_CHAR2HEXINT", "K_ERRORFILES", "K_LE", "K_OVER", 
		"K_SET", "K_VARGRAPHIC", "K_CHARACTER", "K_ERRORTABLES", "K_LEADING", 
		"K_OVERLAPS", "K_SETRESRATE", "K_VARYING", "K_CHARACTERS", "K_ESCAPE", 
		"K_LEAVE", "K_OVERRIDE", "K_SETSESSRATE", "K_VAR_POP", "K_CHARACTER_LENGTH", 
		"K_ET", "K_LEFT", "K_PARAMETER", "K_SHOW", "K_VAR_SAMP", "K_CHARS", "K_EXCEPT", 
		"K_LIKE", "K_PASSWORD", "K_SIMPLE", "K_VIEW", "K_CHAR_LENGTH", "K_EXEC", 
		"K_LIMIT", "K_PERCENT", "K_SIN", "K_VOLATILE", "K_CHECK", "K_EXECUTE", 
		"K_LN", "K_PERCENT_RANK", "K_SINH", "K_WAIT", "K_CHECKPOINT", "K_EXISTS", 
		"K_LOADING", "K_PERM", "K_SKEW", "K_WHEN", "K_CLASS", "K_EXIT", "K_LOCAL", 
		"K_PERMANENT", "K_SMALLINT", "K_WHERE", "K_CLOSE", "K_EXP", "K_LOCATOR", 
		"K_POSITION", "K_SOME", "K_WHILE", "K_CLUSTER", "K_EXPLAIN", "K_LOCK", 
		"K_PRECISION", "K_SOUNDEX", "K_WIDTH_BUCKET", "K_CM", "K_EXTERNAL", "K_LOCKING", 
		"K_PREPARE", "K_SPECIFIC", "K_WITH", "K_COALESCE", "K_EXTRACT", "K_LOG", 
		"K_PRESERVE", "K_SPOOL", "K_WITHOUT", "K_COLLATION", "K_FALLBACK", "K_LOGGING", 
		"K_PRIMARY", "K_SQL", "K_WORK", "K_COLLECT", "K_FASTEXPORT", "K_LOGON", 
		"K_PRIVATE", "K_SQLEXCEPTION", "K_YEAR", "K_COLUMN", "K_FETCH", "K_LONG", 
		"K_PRIVILEGES", "K_SQLTEXT", "K_ZEROIFNULL", "K_COMMENT", "K_FIRST", "K_LOOP", 
		"K_PROCEDURE", "K_SQLWARNING", "K_ZONE", "K_COMMIT", "K_FLOAT", "K_LOWER", 
		"K_PROFILE", "K_SQRT", "K_COMPRESS", "K_FOR", "K_LT", "K_PROPORTIONAL", 
		"K_SS", "K_CONSTRAINT", "K_FOREIGN", "K_MACRO", "K_PROTECTION", "K_START", 
		"K_CONTINUE", "K_FORMAT", "K_MAVG", "K_PUBLIC", "K_STARTUP", "K_TOP", 
		"K_TIES", "K_VALIDTIME", "K_TRANSACTIONTIME", "K_BIGINT", "K_NORMALIZE", 
		"K_MEETS", "K_LAST", "K_NULLS", "K_ERRORS", "NUMERIC_LITERAL", "INTEGER", 
		"DECIMAL", "SCIENTIFIC", "IDENTIFIER", "STRING_LITERAL", "SINGLE_LINE_COMMENT", 
		"MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Teradata.G4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TeradataParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TeradataParser.EOF, 0); }
		public Sql_stmt_listContext sql_stmt_list() {
			return getRuleContext(Sql_stmt_listContext.class,0);
		}
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			switch (_input.LA(1)) {
			case K_INS:
			case K_INSERT:
			case K_SEL:
			case K_SELECT:
			case K_WITH:
				{
				setState(136);
				sql_stmt_list();
				}
				break;
			case UNEXPECTED_CHAR:
				{
				setState(137);
				error();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(140);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(TeradataParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				sql_stmt();
				setState(146);
				match(SCOL);
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_INS || _la==K_INSERT || _la==K_SEL || _la==K_SELECT || _la==K_WITH );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		try {
			setState(154);
			switch (_input.LA(1)) {
			case K_SEL:
			case K_SELECT:
			case K_WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				select_stmt();
				}
				break;
			case K_INS:
			case K_INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				insert_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(TeradataParser.K_WITH, 0); }
		public Query_nameContext query_name() {
			return getRuleContext(Query_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(TeradataParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(TeradataParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(TeradataParser.OPEN_PAR, i);
		}
		public List<Select_exprContext> select_expr() {
			return getRuleContexts(Select_exprContext.class);
		}
		public Select_exprContext select_expr(int i) {
			return getRuleContext(Select_exprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(TeradataParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(TeradataParser.CLOSE_PAR, i);
		}
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_select_stmt);
		int _la;
		try {
			setState(171);
			switch (_input.LA(1)) {
			case K_WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(K_WITH);
				setState(157);
				query_name();
				setState(162);
				_la = _input.LA(1);
				if (_la==OPEN_PAR) {
					{
					setState(158);
					match(OPEN_PAR);
					setState(159);
					column_list();
					setState(160);
					match(CLOSE_PAR);
					}
				}

				setState(164);
				match(K_AS);
				setState(165);
				match(OPEN_PAR);
				setState(166);
				select_expr();
				setState(167);
				match(CLOSE_PAR);
				setState(168);
				select_expr();
				}
				break;
			case K_SEL:
			case K_SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				select_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_exprContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode K_SELECT() { return getToken(TeradataParser.K_SELECT, 0); }
		public TerminalNode K_SEL() { return getToken(TeradataParser.K_SEL, 0); }
		public Top_exprContext top_expr() {
			return getRuleContext(Top_exprContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public From_with_exprContext from_with_expr() {
			return getRuleContext(From_with_exprContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode K_GROUP() { return getToken(TeradataParser.K_GROUP, 0); }
		public List<TerminalNode> K_BY() { return getTokens(TeradataParser.K_BY); }
		public TerminalNode K_BY(int i) {
			return getToken(TeradataParser.K_BY, i);
		}
		public Group_by_listContext group_by_list() {
			return getRuleContext(Group_by_listContext.class,0);
		}
		public Having_qualify_exprContext having_qualify_expr() {
			return getRuleContext(Having_qualify_exprContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(TeradataParser.K_ORDER, 0); }
		public Order_by_listContext order_by_list() {
			return getRuleContext(Order_by_listContext.class,0);
		}
		public TerminalNode K_NULLS() { return getToken(TeradataParser.K_NULLS, 0); }
		public TerminalNode K_FIRST() { return getToken(TeradataParser.K_FIRST, 0); }
		public TerminalNode K_LAST() { return getToken(TeradataParser.K_LAST, 0); }
		public TerminalNode K_DISTINCT() { return getToken(TeradataParser.K_DISTINCT, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(TeradataParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(TeradataParser.K_ALL, i);
		}
		public Normalize_exprContext normalize_expr() {
			return getRuleContext(Normalize_exprContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(TeradataParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(TeradataParser.K_DESC, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(TeradataParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TeradataParser.DOT, i);
		}
		public TerminalNode STAR() { return getToken(TeradataParser.STAR, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Select_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterSelect_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitSelect_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitSelect_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_exprContext select_expr() throws RecognitionException {
		Select_exprContext _localctx = new Select_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_select_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==K_SEL || _la==K_SELECT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(192);
			switch (_input.LA(1)) {
			case K_ALL:
			case K_DISTINCT:
			case K_NORMALIZE:
				{
				{
				setState(177);
				switch (_input.LA(1)) {
				case K_DISTINCT:
					{
					setState(174);
					match(K_DISTINCT);
					}
					break;
				case K_ALL:
					{
					setState(175);
					match(K_ALL);
					}
					break;
				case K_NORMALIZE:
					{
					setState(176);
					normalize_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					{
					setState(179);
					table_name();
					setState(180);
					match(DOT);
					setState(181);
					match(STAR);
					setState(182);
					match(DOT);
					setState(183);
					match(K_ALL);
					}
					}
					break;
				case 2:
					{
					{
					setState(185);
					column_name();
					setState(186);
					match(DOT);
					setState(187);
					match(K_ALL);
					}
					}
					break;
				}
				}
				}
				break;
			case K_TOP:
				{
				setState(191);
				top_expr();
				}
				break;
			case OPEN_PAR:
			case STAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_TIME:
			case K_DATE:
			case K_TIMESTAMP:
			case K_NOT:
			case K_NULL:
			case K_CASE:
			case K_CAST:
			case NUMERIC_LITERAL:
			case IDENTIFIER:
			case STRING_LITERAL:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(194);
			select_list();
			setState(196);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(195);
				from_clause();
				}
			}

			setState(199);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(198);
				from_with_expr();
				}
			}

			setState(202);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(201);
				where_clause();
				}
			}

			setState(207);
			_la = _input.LA(1);
			if (_la==K_GROUP) {
				{
				setState(204);
				match(K_GROUP);
				setState(205);
				match(K_BY);
				setState(206);
				group_by_list();
				}
			}

			setState(210);
			_la = _input.LA(1);
			if (_la==K_QUALIFY || _la==K_HAVING) {
				{
				setState(209);
				having_qualify_expr();
				}
			}

			setState(224);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(212);
				match(K_ORDER);
				setState(213);
				match(K_BY);
				setState(214);
				order_by_list();
				setState(216);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(215);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(218);
					match(K_NULLS);
					setState(219);
					match(K_FIRST);
					}
					break;
				case 2:
					{
					setState(220);
					match(K_NULLS);
					setState(221);
					match(K_LAST);
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(TeradataParser.K_INSERT, 0); }
		public TerminalNode K_INS() { return getToken(TeradataParser.K_INS, 0); }
		public TerminalNode K_INTO() { return getToken(TeradataParser.K_INTO, 0); }
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !(_la==K_INS || _la==K_INSERT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(228);
			_la = _input.LA(1);
			if (_la==K_INTO) {
				{
				setState(227);
				match(K_INTO);
				}
			}

			setState(230);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_sub_exprContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_PAR() { return getTokens(TeradataParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(TeradataParser.OPEN_PAR, i);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(TeradataParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(TeradataParser.CLOSE_PAR, i);
		}
		public TerminalNode K_VALUES() { return getToken(TeradataParser.K_VALUES, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Insert_logging_errorsContext insert_logging_errors() {
			return getRuleContext(Insert_logging_errorsContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(TeradataParser.K_DEFAULT, 0); }
		public Insert_sub_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_sub_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterInsert_sub_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitInsert_sub_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitInsert_sub_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_sub_exprContext insert_sub_expr() throws RecognitionException {
		Insert_sub_exprContext _localctx = new Insert_sub_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_insert_sub_expr);
		int _la;
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				_la = _input.LA(1);
				if (_la==K_VALUES) {
					{
					setState(232);
					match(K_VALUES);
					}
				}

				setState(235);
				match(OPEN_PAR);
				setState(236);
				expr_list();
				setState(237);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(OPEN_PAR);
				setState(240);
				column_list();
				setState(241);
				match(CLOSE_PAR);
				setState(242);
				match(K_VALUES);
				setState(243);
				match(OPEN_PAR);
				setState(244);
				expr_list();
				setState(245);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(247);
					column_list();
					}
				}

				setState(250);
				subquery();
				setState(252);
				_la = _input.LA(1);
				if (_la==K_LOGGING) {
					{
					setState(251);
					insert_logging_errors();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				match(K_DEFAULT);
				setState(255);
				match(K_VALUES);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_logging_errorsContext extends ParserRuleContext {
		public TerminalNode K_LOGGING() { return getToken(TeradataParser.K_LOGGING, 0); }
		public TerminalNode K_ERRORS() { return getToken(TeradataParser.K_ERRORS, 0); }
		public TerminalNode K_ALL() { return getToken(TeradataParser.K_ALL, 0); }
		public TerminalNode K_WITH() { return getToken(TeradataParser.K_WITH, 0); }
		public TerminalNode K_NO() { return getToken(TeradataParser.K_NO, 0); }
		public TerminalNode K_LIMIT() { return getToken(TeradataParser.K_LIMIT, 0); }
		public TerminalNode K_OF() { return getToken(TeradataParser.K_OF, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(TeradataParser.NUMERIC_LITERAL, 0); }
		public Insert_logging_errorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_logging_errors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterInsert_logging_errors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitInsert_logging_errors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitInsert_logging_errors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_logging_errorsContext insert_logging_errors() throws RecognitionException {
		Insert_logging_errorsContext _localctx = new Insert_logging_errorsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insert_logging_errors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(K_LOGGING);
			setState(260);
			_la = _input.LA(1);
			if (_la==K_ALL) {
				{
				setState(259);
				match(K_ALL);
				}
			}

			setState(262);
			match(K_ERRORS);
			setState(271);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(263);
				match(K_WITH);
				setState(269);
				switch (_input.LA(1)) {
				case K_NO:
					{
					setState(264);
					match(K_NO);
					setState(265);
					match(K_LIMIT);
					}
					break;
				case K_LIMIT:
					{
					setState(266);
					match(K_LIMIT);
					setState(267);
					match(K_OF);
					setState(268);
					match(NUMERIC_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Top_exprContext extends ParserRuleContext {
		public TerminalNode K_TOP() { return getToken(TeradataParser.K_TOP, 0); }
		public TerminalNode INTEGER() { return getToken(TeradataParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(TeradataParser.DECIMAL, 0); }
		public TerminalNode K_PERCENT() { return getToken(TeradataParser.K_PERCENT, 0); }
		public TerminalNode K_WITH() { return getToken(TeradataParser.K_WITH, 0); }
		public TerminalNode K_TIES() { return getToken(TeradataParser.K_TIES, 0); }
		public Top_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterTop_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitTop_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitTop_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_exprContext top_expr() throws RecognitionException {
		Top_exprContext _localctx = new Top_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_top_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(K_TOP);
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(276);
			_la = _input.LA(1);
			if (_la==K_PERCENT) {
				{
				setState(275);
				match(K_PERCENT);
				}
			}

			setState(280);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(278);
				match(K_WITH);
				setState(279);
				match(K_TIES);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_qualify_exprContext extends ParserRuleContext {
		public Having_exprContext having_expr() {
			return getRuleContext(Having_exprContext.class,0);
		}
		public Qualify_exprContext qualify_expr() {
			return getRuleContext(Qualify_exprContext.class,0);
		}
		public Having_qualify_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_qualify_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterHaving_qualify_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitHaving_qualify_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitHaving_qualify_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_qualify_exprContext having_qualify_expr() throws RecognitionException {
		Having_qualify_exprContext _localctx = new Having_qualify_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_having_qualify_expr);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				having_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				qualify_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				having_expr();
				setState(285);
				qualify_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				qualify_expr();
				setState(288);
				having_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(TeradataParser.STAR, 0); }
		public List<Select_list_exprContext> select_list_expr() {
			return getRuleContexts(Select_list_exprContext.class);
		}
		public Select_list_exprContext select_list_expr(int i) {
			return getRuleContext(Select_list_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TeradataParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TeradataParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_select_list);
		int _la;
		try {
			setState(301);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(STAR);
				}
				break;
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_TIME:
			case K_DATE:
			case K_TIMESTAMP:
			case K_NOT:
			case K_NULL:
			case K_CASE:
			case K_CAST:
			case NUMERIC_LITERAL:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				select_list_expr();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(294);
					match(COMMA);
					setState(295);
					select_list_expr();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_exprContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TeradataParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(TeradataParser.STAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_alias_nameContext expr_alias_name() {
			return getRuleContext(Expr_alias_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(TeradataParser.K_AS, 0); }
		public Select_list_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterSelect_list_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitSelect_list_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitSelect_list_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_exprContext select_list_expr() throws RecognitionException {
		Select_list_exprContext _localctx = new Select_list_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_select_list_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				{
				setState(303);
				expr(0);
				setState(308);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER) {
					{
					setState(305);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(304);
						match(K_AS);
						}
					}

					setState(307);
					expr_alias_name();
					}
				}

				}
				}
				break;
			case 2:
				{
				setState(310);
				table_name();
				setState(311);
				match(DOT);
				setState(312);
				match(STAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(TeradataParser.K_FROM, 0); }
		public From_exprContext from_expr() {
			return getRuleContext(From_exprContext.class,0);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(K_FROM);
			setState(317);
			from_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_exprContext extends ParserRuleContext {
		public From_table_exprContext from_table_expr() {
			return getRuleContext(From_table_exprContext.class,0);
		}
		public List<From_join_exprContext> from_join_expr() {
			return getRuleContexts(From_join_exprContext.class);
		}
		public From_join_exprContext from_join_expr(int i) {
			return getRuleContext(From_join_exprContext.class,i);
		}
		public From_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterFrom_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitFrom_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitFrom_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_exprContext from_expr() throws RecognitionException {
		From_exprContext _localctx = new From_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_from_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			from_table_expr();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_FULL || _la==K_CROSS || _la==K_INNER || _la==K_RIGHT || _la==K_LEFT) {
				{
				{
				setState(320);
				from_join_expr();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class As_ofContext extends ParserRuleContext {
		public List<TerminalNode> K_AS() { return getTokens(TeradataParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(TeradataParser.K_AS, i);
		}
		public List<TerminalNode> K_OF() { return getTokens(TeradataParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(TeradataParser.K_OF, i);
		}
		public List<Date_exprContext> date_expr() {
			return getRuleContexts(Date_exprContext.class);
		}
		public Date_exprContext date_expr(int i) {
			return getRuleContext(Date_exprContext.class,i);
		}
		public List<Timestamp_exprContext> timestamp_expr() {
			return getRuleContexts(Timestamp_exprContext.class);
		}
		public Timestamp_exprContext timestamp_expr(int i) {
			return getRuleContext(Timestamp_exprContext.class,i);
		}
		public TerminalNode K_VALIDTIME() { return getToken(TeradataParser.K_VALIDTIME, 0); }
		public TerminalNode K_AND() { return getToken(TeradataParser.K_AND, 0); }
		public TerminalNode K_TRANSACTIONTIME() { return getToken(TeradataParser.K_TRANSACTIONTIME, 0); }
		public As_ofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterAs_of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitAs_of(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitAs_of(this);
			else return visitor.visitChildren(this);
		}
	}

	public final As_ofContext as_of() throws RecognitionException {
		As_ofContext _localctx = new As_ofContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_as_of);
		try {
			setState(362);
			switch (_input.LA(1)) {
			case K_AS:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(K_AS);
				setState(327);
				match(K_OF);
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(328);
					date_expr();
					}
					break;
				case 2:
					{
					setState(329);
					timestamp_expr();
					}
					break;
				}
				}
				break;
			case K_VALIDTIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(K_VALIDTIME);
				setState(333);
				match(K_AS);
				setState(334);
				match(K_OF);
				setState(337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(335);
					date_expr();
					}
					break;
				case 2:
					{
					setState(336);
					timestamp_expr();
					}
					break;
				}
				setState(339);
				match(K_AND);
				setState(340);
				match(K_TRANSACTIONTIME);
				setState(341);
				match(K_AS);
				setState(342);
				match(K_OF);
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(343);
					date_expr();
					}
					break;
				case 2:
					{
					setState(344);
					timestamp_expr();
					}
					break;
				}
				}
				break;
			case K_TRANSACTIONTIME:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				match(K_TRANSACTIONTIME);
				setState(348);
				match(K_AS);
				setState(349);
				match(K_OF);
				setState(352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(350);
					date_expr();
					}
					break;
				case 2:
					{
					setState(351);
					timestamp_expr();
					}
					break;
				}
				setState(354);
				match(K_AND);
				setState(355);
				match(K_VALIDTIME);
				setState(356);
				match(K_AS);
				setState(357);
				match(K_OF);
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(358);
					date_expr();
					}
					break;
				case 2:
					{
					setState(359);
					timestamp_expr();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_exprContext extends ParserRuleContext {
		public From_single_exprContext from_single_expr() {
			return getRuleContext(From_single_exprContext.class,0);
		}
		public From_derived_exprContext from_derived_expr() {
			return getRuleContext(From_derived_exprContext.class,0);
		}
		public From_tablefunc_exprContext from_tablefunc_expr() {
			return getRuleContext(From_tablefunc_exprContext.class,0);
		}
		public From_table_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterFrom_table_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitFrom_table_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitFrom_table_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_exprContext from_table_expr() throws RecognitionException {
		From_table_exprContext _localctx = new From_table_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_from_table_expr);
		try {
			setState(367);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				from_single_expr();
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				from_derived_expr();
				}
				break;
			case K_TABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				from_tablefunc_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_single_exprContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public As_ofContext as_of() {
			return getRuleContext(As_ofContext.class,0);
		}
		public Correlation_nameContext correlation_name() {
			return getRuleContext(Correlation_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(TeradataParser.K_AS, 0); }
		public From_single_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_single_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterFrom_single_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitFrom_single_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitFrom_single_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_single_exprContext from_single_expr() throws RecognitionException {
		From_single_exprContext _localctx = new From_single_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_from_single_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			table_name();
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(370);
				as_of();
				}
				break;
			}
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(374);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(373);
					match(K_AS);
					}
				}

				setState(376);
				correlation_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_exprContext extends ParserRuleContext {
		public TerminalNode K_JOIN() { return getToken(TeradataParser.K_JOIN, 0); }
		public From_table_exprContext from_table_expr() {
			return getRuleContext(From_table_exprContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(TeradataParser.K_ON, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode K_INNER() { return getToken(TeradataParser.K_INNER, 0); }
		public TerminalNode K_LEFT() { return getToken(TeradataParser.K_LEFT, 0); }
		public TerminalNode K_RIGHT() { return getToken(TeradataParser.K_RIGHT, 0); }
		public TerminalNode K_FULL() { return getToken(TeradataParser.K_FULL, 0); }
		public As_ofContext as_of() {
			return getRuleContext(As_ofContext.class,0);
		}
		public TerminalNode K_OUTER() { return getToken(TeradataParser.K_OUTER, 0); }
		public TerminalNode K_CROSS() { return getToken(TeradataParser.K_CROSS, 0); }
		public TerminalNode COMMA() { return getToken(TeradataParser.COMMA, 0); }
		public From_join_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterFrom_join_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitFrom_join_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitFrom_join_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_exprContext from_join_expr() throws RecognitionException {
		From_join_exprContext _localctx = new From_join_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_from_join_expr);
		int _la;
		try {
			setState(399);
			switch (_input.LA(1)) {
			case K_FULL:
			case K_INNER:
			case K_RIGHT:
			case K_LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				switch (_input.LA(1)) {
				case K_INNER:
					{
					setState(379);
					match(K_INNER);
					}
					break;
				case K_FULL:
				case K_RIGHT:
				case K_LEFT:
					{
					setState(380);
					_la = _input.LA(1);
					if ( !(_la==K_FULL || _la==K_RIGHT || _la==K_LEFT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(382);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(381);
						match(K_OUTER);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(386);
				match(K_JOIN);
				setState(387);
				from_table_expr();
				setState(389);
				_la = _input.LA(1);
				if (_la==K_AS || _la==K_VALIDTIME || _la==K_TRANSACTIONTIME) {
					{
					setState(388);
					as_of();
					}
				}

				setState(391);
				match(K_ON);
				setState(392);
				search_condition();
				}
				break;
			case K_CROSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(K_CROSS);
				setState(395);
				match(K_JOIN);
				setState(396);
				from_table_expr();
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				match(COMMA);
				setState(398);
				from_table_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_derived_exprContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_PAR() { return getTokens(TeradataParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(TeradataParser.OPEN_PAR, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(TeradataParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(TeradataParser.CLOSE_PAR, i);
		}
		public Derived_table_nameContext derived_table_name() {
			return getRuleContext(Derived_table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(TeradataParser.K_AS, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public From_derived_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_derived_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterFrom_derived_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitFrom_derived_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitFrom_derived_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_derived_exprContext from_derived_expr() throws RecognitionException {
		From_derived_exprContext _localctx = new From_derived_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_from_derived_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(OPEN_PAR);
			setState(402);
			subquery();
			setState(403);
			match(CLOSE_PAR);
			setState(405);
			_la = _input.LA(1);
			if (_la==K_AS) {
				{
				setState(404);
				match(K_AS);
				}
			}

			setState(407);
			derived_table_name();
			setState(412);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(408);
				match(OPEN_PAR);
				setState(409);
				column_list();
				setState(410);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_tablefunc_exprContext extends ParserRuleContext {
		public TerminalNode K_TABLE() { return getToken(TeradataParser.K_TABLE, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(TeradataParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(TeradataParser.OPEN_PAR, i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(TeradataParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(TeradataParser.CLOSE_PAR, i);
		}
		public Derived_table_nameContext derived_table_name() {
			return getRuleContext(Derived_table_nameContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(TeradataParser.K_AS, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public From_tablefunc_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_tablefunc_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterFrom_tablefunc_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitFrom_tablefunc_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitFrom_tablefunc_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_tablefunc_exprContext from_tablefunc_expr() throws RecognitionException {
		From_tablefunc_exprContext _localctx = new From_tablefunc_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_from_tablefunc_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(K_TABLE);
			setState(415);
			match(OPEN_PAR);
			setState(416);
			function_name();
			setState(417);
			match(OPEN_PAR);
			setState(419);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (K_CURRENT_DATE - 104)) | (1L << (K_CURRENT_TIME - 104)) | (1L << (K_CURRENT_TIMESTAMP - 104)) | (1L << (K_TIME - 104)) | (1L << (K_DATE - 104)) | (1L << (K_TIMESTAMP - 104)))) != 0) || _la==K_NOT || _la==K_NULL || _la==K_CASE || _la==K_CAST || ((((_la - 457)) & ~0x3f) == 0 && ((1L << (_la - 457)) & ((1L << (NUMERIC_LITERAL - 457)) | (1L << (IDENTIFIER - 457)) | (1L << (STRING_LITERAL - 457)))) != 0)) {
				{
				setState(418);
				expr_list();
				}
			}

			setState(421);
			match(CLOSE_PAR);
			setState(422);
			match(CLOSE_PAR);
			setState(424);
			_la = _input.LA(1);
			if (_la==K_AS) {
				{
				setState(423);
				match(K_AS);
				}
			}

			setState(426);
			derived_table_name();
			setState(431);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(427);
				match(OPEN_PAR);
				setState(428);
				column_list();
				setState(429);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_with_exprContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(TeradataParser.K_WITH, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode K_BY() { return getToken(TeradataParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_ASC() { return getTokens(TeradataParser.K_ASC); }
		public TerminalNode K_ASC(int i) {
			return getToken(TeradataParser.K_ASC, i);
		}
		public List<TerminalNode> K_DESC() { return getTokens(TeradataParser.K_DESC); }
		public TerminalNode K_DESC(int i) {
			return getToken(TeradataParser.K_DESC, i);
		}
		public From_with_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_with_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterFrom_with_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitFrom_with_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitFrom_with_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_with_exprContext from_with_expr() throws RecognitionException {
		From_with_exprContext _localctx = new From_with_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_from_with_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(K_WITH);
			setState(434);
			expr_list();
			setState(450);
			_la = _input.LA(1);
			if (_la==K_BY) {
				{
				setState(435);
				match(K_BY);
				setState(436);
				expr(0);
				setState(438);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(437);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(440);
					match(COMMA);
					setState(441);
					expr(0);
					setState(443);
					_la = _input.LA(1);
					if (_la==K_ASC || _la==K_DESC) {
						{
						setState(442);
						_la = _input.LA(1);
						if ( !(_la==K_ASC || _la==K_DESC) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
					}

					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Normalize_exprContext extends ParserRuleContext {
		public TerminalNode K_NORMALIZE() { return getToken(TeradataParser.K_NORMALIZE, 0); }
		public TerminalNode K_ON() { return getToken(TeradataParser.K_ON, 0); }
		public TerminalNode K_MEETS() { return getToken(TeradataParser.K_MEETS, 0); }
		public TerminalNode K_OR() { return getToken(TeradataParser.K_OR, 0); }
		public TerminalNode K_OVERLAPS() { return getToken(TeradataParser.K_OVERLAPS, 0); }
		public Normalize_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalize_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterNormalize_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitNormalize_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitNormalize_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Normalize_exprContext normalize_expr() throws RecognitionException {
		Normalize_exprContext _localctx = new Normalize_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_normalize_expr);
		int _la;
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(K_NORMALIZE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(K_NORMALIZE);
				setState(454);
				match(K_ON);
				setState(455);
				match(K_MEETS);
				setState(456);
				match(K_OR);
				setState(457);
				match(K_OVERLAPS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				match(K_NORMALIZE);
				setState(459);
				match(K_ON);
				setState(460);
				match(K_OVERLAPS);
				setState(463);
				_la = _input.LA(1);
				if (_la==K_OR) {
					{
					setState(461);
					match(K_OR);
					setState(462);
					match(K_MEETS);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(TeradataParser.K_WHERE, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(K_WHERE);
			setState(468);
			search_condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_exprContext extends ParserRuleContext {
		public TerminalNode K_HAVING() { return getToken(TeradataParser.K_HAVING, 0); }
		public Conditional_exprContext conditional_expr() {
			return getRuleContext(Conditional_exprContext.class,0);
		}
		public Having_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterHaving_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitHaving_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitHaving_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_exprContext having_expr() throws RecognitionException {
		Having_exprContext _localctx = new Having_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_having_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(K_HAVING);
			setState(471);
			conditional_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualify_exprContext extends ParserRuleContext {
		public TerminalNode K_QUALIFY() { return getToken(TeradataParser.K_QUALIFY, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Qualify_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualify_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterQualify_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitQualify_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitQualify_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualify_exprContext qualify_expr() throws RecognitionException {
		Qualify_exprContext _localctx = new Qualify_exprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_qualify_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(K_QUALIFY);
			setState(474);
			search_condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sample_exprContext extends ParserRuleContext {
		public Sample_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterSample_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitSample_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitSample_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sample_exprContext sample_expr() throws RecognitionException {
		Sample_exprContext _localctx = new Sample_exprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sample_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expand_exprContext extends ParserRuleContext {
		public Expand_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expand_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterExpand_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitExpand_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitExpand_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expand_exprContext expand_expr() throws RecognitionException {
		Expand_exprContext _localctx = new Expand_exprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expand_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_listContext extends ParserRuleContext {
		public List<Group_by_valContext> group_by_val() {
			return getRuleContexts(Group_by_valContext.class);
		}
		public Group_by_valContext group_by_val(int i) {
			return getRuleContext(Group_by_valContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TeradataParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TeradataParser.COMMA, i);
		}
		public Group_by_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterGroup_by_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitGroup_by_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitGroup_by_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_listContext group_by_list() throws RecognitionException {
		Group_by_listContext _localctx = new Group_by_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_group_by_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			group_by_val();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(481);
				match(COMMA);
				setState(482);
				group_by_val();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_valContext extends ParserRuleContext {
		public Ordinary_grouping_setContext ordinary_grouping_set() {
			return getRuleContext(Ordinary_grouping_setContext.class,0);
		}
		public Empty_grouping_setContext empty_grouping_set() {
			return getRuleContext(Empty_grouping_setContext.class,0);
		}
		public Rollup_listContext rollup_list() {
			return getRuleContext(Rollup_listContext.class,0);
		}
		public Cube_listContext cube_list() {
			return getRuleContext(Cube_listContext.class,0);
		}
		public Grouping_sets_specificationContext grouping_sets_specification() {
			return getRuleContext(Grouping_sets_specificationContext.class,0);
		}
		public Group_by_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterGroup_by_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitGroup_by_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitGroup_by_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_valContext group_by_val() throws RecognitionException {
		Group_by_valContext _localctx = new Group_by_valContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_group_by_val);
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				ordinary_grouping_set();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				empty_grouping_set();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				rollup_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				cube_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(492);
				grouping_sets_specification();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_listContext extends ParserRuleContext {
		public List<Order_by_valContext> order_by_val() {
			return getRuleContexts(Order_by_valContext.class);
		}
		public Order_by_valContext order_by_val(int i) {
			return getRuleContext(Order_by_valContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TeradataParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TeradataParser.COMMA, i);
		}
		public Order_by_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterOrder_by_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitOrder_by_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitOrder_by_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_listContext order_by_list() throws RecognitionException {
		Order_by_listContext _localctx = new Order_by_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_order_by_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			order_by_val();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(496);
				match(COMMA);
				setState(497);
				order_by_val();
				}
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_valContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public Column_positionContext column_position() {
			return getRuleContext(Column_positionContext.class,0);
		}
		public Order_by_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterOrder_by_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitOrder_by_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitOrder_by_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_valContext order_by_val() throws RecognitionException {
		Order_by_valContext _localctx = new Order_by_valContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_order_by_val);
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				column_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				column_alias();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(506);
				column_position();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Seed_stmtContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode K_FROM() { return getToken(TeradataParser.K_FROM, 0); }
		public From_single_exprContext from_single_expr() {
			return getRuleContext(From_single_exprContext.class,0);
		}
		public TerminalNode K_SELECT() { return getToken(TeradataParser.K_SELECT, 0); }
		public TerminalNode K_SEL() { return getToken(TeradataParser.K_SEL, 0); }
		public TerminalNode K_DISTINCT() { return getToken(TeradataParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(TeradataParser.K_ALL, 0); }
		public From_join_exprContext from_join_expr() {
			return getRuleContext(From_join_exprContext.class,0);
		}
		public From_derived_exprContext from_derived_expr() {
			return getRuleContext(From_derived_exprContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(TeradataParser.K_WHERE, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode K_GROUP() { return getToken(TeradataParser.K_GROUP, 0); }
		public List<TerminalNode> K_BY() { return getTokens(TeradataParser.K_BY); }
		public TerminalNode K_BY(int i) {
			return getToken(TeradataParser.K_BY, i);
		}
		public Group_by_listContext group_by_list() {
			return getRuleContext(Group_by_listContext.class,0);
		}
		public Having_qualify_exprContext having_qualify_expr() {
			return getRuleContext(Having_qualify_exprContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(TeradataParser.K_ORDER, 0); }
		public Order_by_listContext order_by_list() {
			return getRuleContext(Order_by_listContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(TeradataParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(TeradataParser.K_DESC, 0); }
		public Seed_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seed_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterSeed_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitSeed_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitSeed_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Seed_stmtContext seed_stmt() throws RecognitionException {
		Seed_stmtContext _localctx = new Seed_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_seed_stmt);
		int _la;
		try {
			setState(537);
			switch (_input.LA(1)) {
			case K_SEL:
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				_la = _input.LA(1);
				if ( !(_la==K_SEL || _la==K_SELECT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(511);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(510);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(513);
				select_list();
				setState(514);
				match(K_FROM);
				setState(515);
				from_single_expr();
				}
				break;
			case COMMA:
			case K_FULL:
			case K_CROSS:
			case K_INNER:
			case K_RIGHT:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				from_join_expr();
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
				from_derived_expr();
				setState(519);
				match(K_WHERE);
				setState(520);
				search_condition();
				setState(524);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(521);
					match(K_GROUP);
					setState(522);
					match(K_BY);
					setState(523);
					group_by_list();
					}
				}

				setState(527);
				_la = _input.LA(1);
				if (_la==K_QUALIFY || _la==K_HAVING) {
					{
					setState(526);
					having_qualify_expr();
					}
				}

				setState(535);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(529);
					match(K_ORDER);
					setState(530);
					match(K_BY);
					setState(531);
					order_by_list();
					setState(533);
					_la = _input.LA(1);
					if (_la==K_ASC || _la==K_DESC) {
						{
						setState(532);
						_la = _input.LA(1);
						if ( !(_la==K_ASC || _la==K_DESC) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
					}

					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(TeradataParser.K_DISTINCT, 0); }
		public TerminalNode K_CAST() { return getToken(TeradataParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(TeradataParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode K_CASE() { return getToken(TeradataParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(TeradataParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(TeradataParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(TeradataParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(TeradataParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(TeradataParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(TeradataParser.K_ELSE, 0); }
		public TerminalNode K_IS() { return getToken(TeradataParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(TeradataParser.K_NOT, 0); }
		public TerminalNode K_IN() { return getToken(TeradataParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(TeradataParser.K_LIKE, 0); }
		public TerminalNode K_AND() { return getToken(TeradataParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(TeradataParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(TeradataParser.K_BETWEEN, 0); }
		public TerminalNode K_ESCAPE() { return getToken(TeradataParser.K_ESCAPE, 0); }
		public TerminalNode K_NULL() { return getToken(TeradataParser.K_NULL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(TeradataParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(TeradataParser.CLOSE_PAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(540);
				literal_value();
				}
				break;
			case 2:
				{
				setState(541);
				column_name();
				}
				break;
			case 3:
				{
				setState(542);
				unary_operator();
				setState(543);
				expr(17);
				}
				break;
			case 4:
				{
				setState(545);
				function_name();
				setState(546);
				match(OPEN_PAR);
				setState(559);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_TIME:
				case K_DATE:
				case K_TIMESTAMP:
				case K_NOT:
				case K_NULL:
				case K_DISTINCT:
				case K_CASE:
				case K_CAST:
				case NUMERIC_LITERAL:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(548);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(547);
						match(K_DISTINCT);
						}
					}

					setState(550);
					expr(0);
					setState(555);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(551);
						match(COMMA);
						setState(552);
						expr(0);
						}
						}
						setState(557);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(558);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(561);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(563);
				match(OPEN_PAR);
				setState(564);
				expr(0);
				setState(565);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(567);
				match(K_CAST);
				setState(568);
				match(OPEN_PAR);
				setState(569);
				expr(0);
				setState(570);
				match(K_AS);
				setState(571);
				type_name();
				setState(572);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(574);
				match(K_CASE);
				setState(576);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (K_CURRENT_DATE - 104)) | (1L << (K_CURRENT_TIME - 104)) | (1L << (K_CURRENT_TIMESTAMP - 104)) | (1L << (K_TIME - 104)) | (1L << (K_DATE - 104)) | (1L << (K_TIMESTAMP - 104)))) != 0) || _la==K_NOT || _la==K_NULL || _la==K_CASE || _la==K_CAST || ((((_la - 457)) & ~0x3f) == 0 && ((1L << (_la - 457)) & ((1L << (NUMERIC_LITERAL - 457)) | (1L << (IDENTIFIER - 457)) | (1L << (STRING_LITERAL - 457)))) != 0)) {
					{
					setState(575);
					expr(0);
					}
				}

				setState(583); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(578);
					match(K_WHEN);
					setState(579);
					expr(0);
					setState(580);
					match(K_THEN);
					setState(581);
					expr(0);
					}
					}
					setState(585); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(589);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(587);
					match(K_ELSE);
					setState(588);
					expr(0);
					}
				}

				setState(591);
				match(K_END);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(688);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(595);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(596);
						match(PIPE2);
						setState(597);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(598);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(599);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(600);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(601);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(602);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(603);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(604);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(605);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(606);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(607);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(617);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
						case 1:
							{
							setState(608);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(609);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(610);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(611);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(612);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(613);
							match(K_IS);
							setState(614);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(615);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(616);
							match(K_LIKE);
							}
							break;
						}
						setState(619);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(620);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(621);
						match(K_AND);
						setState(622);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(623);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(624);
						match(K_OR);
						setState(625);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(626);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(627);
						match(K_IS);
						setState(629);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
						case 1:
							{
							setState(628);
							match(K_NOT);
							}
							break;
						}
						setState(631);
						expr(5);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(632);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(634);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(633);
							match(K_NOT);
							}
						}

						setState(636);
						match(K_BETWEEN);
						setState(637);
						expr(0);
						setState(638);
						match(K_AND);
						setState(639);
						expr(4);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(641);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(643);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(642);
							match(K_NOT);
							}
						}

						setState(645);
						match(K_LIKE);
						setState(646);
						expr(0);
						setState(649);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
						case 1:
							{
							setState(647);
							match(K_ESCAPE);
							setState(648);
							expr(0);
							}
							break;
						}
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(651);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(659);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
						case 1:
							{
							setState(652);
							match(K_IS);
							setState(653);
							match(K_NULL);
							}
							break;
						case 2:
							{
							setState(654);
							match(K_IS);
							setState(655);
							match(K_NOT);
							setState(656);
							match(K_NULL);
							}
							break;
						case 3:
							{
							setState(657);
							match(K_NOT);
							setState(658);
							match(K_NULL);
							}
							break;
						}
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(661);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(663);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(662);
							match(K_NOT);
							}
						}

						setState(665);
						match(K_IN);
						setState(686);
						switch (_input.LA(1)) {
						case OPEN_PAR:
							{
							setState(666);
							match(OPEN_PAR);
							setState(676);
							switch (_input.LA(1)) {
							case K_SEL:
							case K_SELECT:
								{
								setState(667);
								subquery();
								}
								break;
							case OPEN_PAR:
							case PLUS:
							case MINUS:
							case TILDE:
							case K_CURRENT_DATE:
							case K_CURRENT_TIME:
							case K_CURRENT_TIMESTAMP:
							case K_TIME:
							case K_DATE:
							case K_TIMESTAMP:
							case K_NOT:
							case K_NULL:
							case K_CASE:
							case K_CAST:
							case NUMERIC_LITERAL:
							case IDENTIFIER:
							case STRING_LITERAL:
								{
								setState(668);
								expr(0);
								setState(673);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(669);
									match(COMMA);
									setState(670);
									expr(0);
									}
									}
									setState(675);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(678);
							match(CLOSE_PAR);
							}
							break;
						case IDENTIFIER:
							{
							setState(683);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
							case 1:
								{
								setState(680);
								database_name();
								setState(681);
								match(DOT);
								}
								break;
							}
							setState(685);
							table_name();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitExpr_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			expr(0);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(694);
				match(COMMA);
				setState(695);
				expr(0);
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordinary_grouping_setContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Column_positionContext column_position() {
			return getRuleContext(Column_positionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ordinary_grouping_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinary_grouping_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterOrdinary_grouping_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitOrdinary_grouping_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitOrdinary_grouping_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordinary_grouping_setContext ordinary_grouping_set() throws RecognitionException {
		Ordinary_grouping_setContext _localctx = new Ordinary_grouping_setContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ordinary_grouping_set);
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				column_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				column_position();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(703);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Empty_grouping_setContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(TeradataParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(TeradataParser.CLOSE_PAR, 0); }
		public Empty_grouping_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_grouping_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterEmpty_grouping_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitEmpty_grouping_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitEmpty_grouping_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_grouping_setContext empty_grouping_set() throws RecognitionException {
		Empty_grouping_setContext _localctx = new Empty_grouping_setContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_empty_grouping_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(OPEN_PAR);
			setState(707);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollup_listContext extends ParserRuleContext {
		public Rollup_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollup_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterRollup_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitRollup_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitRollup_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollup_listContext rollup_list() throws RecognitionException {
		Rollup_listContext _localctx = new Rollup_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_rollup_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cube_listContext extends ParserRuleContext {
		public Cube_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cube_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterCube_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitCube_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitCube_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cube_listContext cube_list() throws RecognitionException {
		Cube_listContext _localctx = new Cube_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cube_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_sets_specificationContext extends ParserRuleContext {
		public Grouping_sets_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_sets_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterGrouping_sets_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitGrouping_sets_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitGrouping_sets_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_sets_specificationContext grouping_sets_specification() throws RecognitionException {
		Grouping_sets_specificationContext _localctx = new Grouping_sets_specificationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_grouping_sets_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_positionContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TeradataParser.INTEGER, 0); }
		public Column_positionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterColumn_position(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitColumn_position(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitColumn_position(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_positionContext column_position() throws RecognitionException {
		Column_positionContext _localctx = new Column_positionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_column_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public Select_exprContext select_expr() {
			return getRuleContext(Select_exprContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			select_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_conditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Search_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterSearch_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitSearch_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitSearch_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_conditionContext search_condition() throws RecognitionException {
		Search_conditionContext _localctx = new Search_conditionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_search_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Conditional_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterConditional_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitConditional_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitConditional_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_exprContext conditional_expr() throws RecognitionException {
		Conditional_exprContext _localctx = new Conditional_exprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_conditional_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_listContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterColumn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitColumn_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitColumn_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			column_name();
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(724);
				match(COMMA);
				setState(725);
				column_name();
				}
				}
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(TeradataParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(731);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(734);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(TeradataParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TeradataParser.STRING_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(TeradataParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(TeradataParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(TeradataParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(TeradataParser.K_CURRENT_TIMESTAMP, 0); }
		public Date_exprContext date_expr() {
			return getRuleContext(Date_exprContext.class,0);
		}
		public Time_exprContext time_expr() {
			return getRuleContext(Time_exprContext.class,0);
		}
		public Timestamp_exprContext timestamp_expr() {
			return getRuleContext(Timestamp_exprContext.class,0);
		}
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_literal_value);
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				match(NUMERIC_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(738);
				match(K_NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(739);
				match(K_CURRENT_TIME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(740);
				match(K_CURRENT_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(741);
				match(K_CURRENT_TIMESTAMP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(742);
				date_expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(743);
				time_expr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(744);
				timestamp_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(TeradataParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TeradataParser.IDENTIFIER, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TeradataParser.IDENTIFIER, 0); }
		public Query_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterQuery_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitQuery_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitQuery_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_nameContext query_name() throws RecognitionException {
		Query_nameContext _localctx = new Query_nameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_query_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_alias_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TeradataParser.IDENTIFIER, 0); }
		public Expr_alias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_alias_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterExpr_alias_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitExpr_alias_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitExpr_alias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_alias_nameContext expr_alias_name() throws RecognitionException {
		Expr_alias_nameContext _localctx = new Expr_alias_nameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expr_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Joined_tableContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Joined_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joined_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterJoined_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitJoined_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitJoined_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Joined_tableContext joined_table() throws RecognitionException {
		Joined_tableContext _localctx = new Joined_tableContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_joined_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_table_exprContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Single_table_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_table_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterSingle_table_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitSingle_table_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitSingle_table_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_table_exprContext single_table_expr() throws RecognitionException {
		Single_table_exprContext _localctx = new Single_table_exprContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_single_table_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Derived_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterDerived_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitDerived_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitDerived_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Derived_table_nameContext derived_table_name() throws RecognitionException {
		Derived_table_nameContext _localctx = new Derived_table_nameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_derived_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_exprContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(TeradataParser.STRING_LITERAL, 0); }
		public TerminalNode K_DATE() { return getToken(TeradataParser.K_DATE, 0); }
		public Date_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterDate_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitDate_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitDate_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_exprContext date_expr() throws RecognitionException {
		Date_exprContext _localctx = new Date_exprContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_date_expr);
		int _la;
		try {
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				_la = _input.LA(1);
				if (_la==K_DATE) {
					{
					setState(761);
					match(K_DATE);
					}
				}

				setState(764);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				match(K_DATE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_exprContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(TeradataParser.STRING_LITERAL, 0); }
		public TerminalNode K_TIMESTAMP() { return getToken(TeradataParser.K_TIMESTAMP, 0); }
		public Timestamp_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterTimestamp_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitTimestamp_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitTimestamp_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_exprContext timestamp_expr() throws RecognitionException {
		Timestamp_exprContext _localctx = new Timestamp_exprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_timestamp_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_la = _input.LA(1);
			if (_la==K_TIMESTAMP) {
				{
				setState(768);
				match(K_TIMESTAMP);
				}
			}

			setState(771);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_exprContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(TeradataParser.STRING_LITERAL, 0); }
		public TerminalNode K_TIME() { return getToken(TeradataParser.K_TIME, 0); }
		public Time_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterTime_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitTime_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitTime_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_exprContext time_expr() throws RecognitionException {
		Time_exprContext _localctx = new Time_exprContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_time_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			_la = _input.LA(1);
			if (_la==K_TIME) {
				{
				setState(773);
				match(K_TIME);
				}
			}

			setState(776);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_timestamp_exprContext extends ParserRuleContext {
		public Timestamp_exprContext timestamp_expr() {
			return getRuleContext(Timestamp_exprContext.class,0);
		}
		public Date_exprContext date_expr() {
			return getRuleContext(Date_exprContext.class,0);
		}
		public Date_timestamp_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_timestamp_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterDate_timestamp_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitDate_timestamp_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitDate_timestamp_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_timestamp_exprContext date_timestamp_expr() throws RecognitionException {
		Date_timestamp_exprContext _localctx = new Date_timestamp_exprContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_date_timestamp_expr);
		try {
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				timestamp_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				date_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(TeradataParser.K_ABORT, 0); }
		public TerminalNode K_CONVERT_TABLE_HEADER() { return getToken(TeradataParser.K_CONVERT_TABLE_HEADER, 0); }
		public TerminalNode K_FOUND() { return getToken(TeradataParser.K_FOUND, 0); }
		public TerminalNode K_MAX() { return getToken(TeradataParser.K_MAX, 0); }
		public TerminalNode K_QUALIFIED() { return getToken(TeradataParser.K_QUALIFIED, 0); }
		public TerminalNode K_STATEMENT() { return getToken(TeradataParser.K_STATEMENT, 0); }
		public TerminalNode K_ABORTSESSION() { return getToken(TeradataParser.K_ABORTSESSION, 0); }
		public TerminalNode K_CORR() { return getToken(TeradataParser.K_CORR, 0); }
		public TerminalNode K_FREESPACE() { return getToken(TeradataParser.K_FREESPACE, 0); }
		public TerminalNode K_MAXIMUM() { return getToken(TeradataParser.K_MAXIMUM, 0); }
		public TerminalNode K_QUALIFY() { return getToken(TeradataParser.K_QUALIFY, 0); }
		public TerminalNode K_STATISTICS() { return getToken(TeradataParser.K_STATISTICS, 0); }
		public TerminalNode K_ABS() { return getToken(TeradataParser.K_ABS, 0); }
		public TerminalNode K_COS() { return getToken(TeradataParser.K_COS, 0); }
		public TerminalNode K_FROM() { return getToken(TeradataParser.K_FROM, 0); }
		public TerminalNode K_MCHARACTERS() { return getToken(TeradataParser.K_MCHARACTERS, 0); }
		public TerminalNode K_QUANTILE() { return getToken(TeradataParser.K_QUANTILE, 0); }
		public TerminalNode K_STDDEV_POP() { return getToken(TeradataParser.K_STDDEV_POP, 0); }
		public TerminalNode K_ACCESS_LOCK() { return getToken(TeradataParser.K_ACCESS_LOCK, 0); }
		public TerminalNode K_COSH() { return getToken(TeradataParser.K_COSH, 0); }
		public TerminalNode K_FULL() { return getToken(TeradataParser.K_FULL, 0); }
		public TerminalNode K_MDIFF() { return getToken(TeradataParser.K_MDIFF, 0); }
		public TerminalNode K_RADIANS() { return getToken(TeradataParser.K_RADIANS, 0); }
		public TerminalNode K_STDDEV_SAMP() { return getToken(TeradataParser.K_STDDEV_SAMP, 0); }
		public TerminalNode K_ACCOUNT() { return getToken(TeradataParser.K_ACCOUNT, 0); }
		public TerminalNode K_COUNT() { return getToken(TeradataParser.K_COUNT, 0); }
		public TerminalNode K_FUNCTION() { return getToken(TeradataParser.K_FUNCTION, 0); }
		public TerminalNode K_MERGE() { return getToken(TeradataParser.K_MERGE, 0); }
		public TerminalNode K_RANDOM() { return getToken(TeradataParser.K_RANDOM, 0); }
		public TerminalNode K_STEPINFO() { return getToken(TeradataParser.K_STEPINFO, 0); }
		public TerminalNode K_ACOS() { return getToken(TeradataParser.K_ACOS, 0); }
		public TerminalNode K_COVAR_POP() { return getToken(TeradataParser.K_COVAR_POP, 0); }
		public TerminalNode K_GE() { return getToken(TeradataParser.K_GE, 0); }
		public TerminalNode K_MIN() { return getToken(TeradataParser.K_MIN, 0); }
		public TerminalNode K_RANGE_N() { return getToken(TeradataParser.K_RANGE_N, 0); }
		public TerminalNode K_STRING_CS() { return getToken(TeradataParser.K_STRING_CS, 0); }
		public TerminalNode K_ACOSH() { return getToken(TeradataParser.K_ACOSH, 0); }
		public TerminalNode K_COVAR_SAMP() { return getToken(TeradataParser.K_COVAR_SAMP, 0); }
		public TerminalNode K_GENERATED() { return getToken(TeradataParser.K_GENERATED, 0); }
		public TerminalNode K_MINDEX() { return getToken(TeradataParser.K_MINDEX, 0); }
		public TerminalNode K_RANK() { return getToken(TeradataParser.K_RANK, 0); }
		public TerminalNode K_SUBSCRIBER() { return getToken(TeradataParser.K_SUBSCRIBER, 0); }
		public TerminalNode K_ADD() { return getToken(TeradataParser.K_ADD, 0); }
		public TerminalNode K_CREATE() { return getToken(TeradataParser.K_CREATE, 0); }
		public TerminalNode K_GIVE() { return getToken(TeradataParser.K_GIVE, 0); }
		public TerminalNode K_MINIMUM() { return getToken(TeradataParser.K_MINIMUM, 0); }
		public TerminalNode K_REAL() { return getToken(TeradataParser.K_REAL, 0); }
		public TerminalNode K_SUBSTR() { return getToken(TeradataParser.K_SUBSTR, 0); }
		public TerminalNode K_ADD_MONTHS() { return getToken(TeradataParser.K_ADD_MONTHS, 0); }
		public TerminalNode K_CROSS() { return getToken(TeradataParser.K_CROSS, 0); }
		public TerminalNode K_GO() { return getToken(TeradataParser.K_GO, 0); }
		public TerminalNode K_MINUS() { return getToken(TeradataParser.K_MINUS, 0); }
		public TerminalNode K_REFERENCES() { return getToken(TeradataParser.K_REFERENCES, 0); }
		public TerminalNode K_SUBSTRING() { return getToken(TeradataParser.K_SUBSTRING, 0); }
		public TerminalNode K_ADMIN() { return getToken(TeradataParser.K_ADMIN, 0); }
		public TerminalNode K_CS() { return getToken(TeradataParser.K_CS, 0); }
		public TerminalNode K_GOTO() { return getToken(TeradataParser.K_GOTO, 0); }
		public TerminalNode K_MINUTE() { return getToken(TeradataParser.K_MINUTE, 0); }
		public TerminalNode K_REFERENCING() { return getToken(TeradataParser.K_REFERENCING, 0); }
		public TerminalNode K_SUM() { return getToken(TeradataParser.K_SUM, 0); }
		public TerminalNode K_AFTER() { return getToken(TeradataParser.K_AFTER, 0); }
		public TerminalNode K_CSUM() { return getToken(TeradataParser.K_CSUM, 0); }
		public TerminalNode K_GRANT() { return getToken(TeradataParser.K_GRANT, 0); }
		public TerminalNode K_MLINREG() { return getToken(TeradataParser.K_MLINREG, 0); }
		public TerminalNode K_REGR_AVGX() { return getToken(TeradataParser.K_REGR_AVGX, 0); }
		public TerminalNode K_SUMMARY() { return getToken(TeradataParser.K_SUMMARY, 0); }
		public TerminalNode K_AGGREGATE() { return getToken(TeradataParser.K_AGGREGATE, 0); }
		public TerminalNode K_CT() { return getToken(TeradataParser.K_CT, 0); }
		public TerminalNode K_GRAPHIC() { return getToken(TeradataParser.K_GRAPHIC, 0); }
		public TerminalNode K_MLOAD() { return getToken(TeradataParser.K_MLOAD, 0); }
		public TerminalNode K_REGR_AVGY() { return getToken(TeradataParser.K_REGR_AVGY, 0); }
		public TerminalNode K_SUSPEND() { return getToken(TeradataParser.K_SUSPEND, 0); }
		public TerminalNode K_ALIAS() { return getToken(TeradataParser.K_ALIAS, 0); }
		public TerminalNode K_CURRENT() { return getToken(TeradataParser.K_CURRENT, 0); }
		public TerminalNode K_GROUP() { return getToken(TeradataParser.K_GROUP, 0); }
		public TerminalNode K_MOD() { return getToken(TeradataParser.K_MOD, 0); }
		public TerminalNode K_REGR_COUNT() { return getToken(TeradataParser.K_REGR_COUNT, 0); }
		public TerminalNode K_TABLE() { return getToken(TeradataParser.K_TABLE, 0); }
		public TerminalNode K_ALL() { return getToken(TeradataParser.K_ALL, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(TeradataParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_GT() { return getToken(TeradataParser.K_GT, 0); }
		public TerminalNode K_MODE() { return getToken(TeradataParser.K_MODE, 0); }
		public TerminalNode K_REGR_INTERCEPT() { return getToken(TeradataParser.K_REGR_INTERCEPT, 0); }
		public TerminalNode K_TAN() { return getToken(TeradataParser.K_TAN, 0); }
		public TerminalNode K_ALTER() { return getToken(TeradataParser.K_ALTER, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(TeradataParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_HANDLER() { return getToken(TeradataParser.K_HANDLER, 0); }
		public TerminalNode K_MODIFY() { return getToken(TeradataParser.K_MODIFY, 0); }
		public TerminalNode K_REGR_R2() { return getToken(TeradataParser.K_REGR_R2, 0); }
		public TerminalNode K_TANH() { return getToken(TeradataParser.K_TANH, 0); }
		public TerminalNode K_AMP() { return getToken(TeradataParser.K_AMP, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(TeradataParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_HASH() { return getToken(TeradataParser.K_HASH, 0); }
		public TerminalNode K_MONITOR() { return getToken(TeradataParser.K_MONITOR, 0); }
		public TerminalNode K_REGR_SLOPE() { return getToken(TeradataParser.K_REGR_SLOPE, 0); }
		public TerminalNode K_TBL_CS() { return getToken(TeradataParser.K_TBL_CS, 0); }
		public TerminalNode K_AND() { return getToken(TeradataParser.K_AND, 0); }
		public TerminalNode K_CURSOR() { return getToken(TeradataParser.K_CURSOR, 0); }
		public TerminalNode K_HASHAMP() { return getToken(TeradataParser.K_HASHAMP, 0); }
		public TerminalNode K_MONRESOURCE() { return getToken(TeradataParser.K_MONRESOURCE, 0); }
		public TerminalNode K_REGR_SXX() { return getToken(TeradataParser.K_REGR_SXX, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(TeradataParser.K_TEMPORARY, 0); }
		public TerminalNode K_ANSIDATE() { return getToken(TeradataParser.K_ANSIDATE, 0); }
		public TerminalNode K_CV() { return getToken(TeradataParser.K_CV, 0); }
		public TerminalNode K_HASHBAKAMP() { return getToken(TeradataParser.K_HASHBAKAMP, 0); }
		public TerminalNode K_MONSESSION() { return getToken(TeradataParser.K_MONSESSION, 0); }
		public TerminalNode K_REGR_SXY() { return getToken(TeradataParser.K_REGR_SXY, 0); }
		public TerminalNode K_TERMINATE() { return getToken(TeradataParser.K_TERMINATE, 0); }
		public TerminalNode K_ANY() { return getToken(TeradataParser.K_ANY, 0); }
		public TerminalNode K_CYCLE() { return getToken(TeradataParser.K_CYCLE, 0); }
		public TerminalNode K_HASHBUCKET() { return getToken(TeradataParser.K_HASHBUCKET, 0); }
		public TerminalNode K_MONTH() { return getToken(TeradataParser.K_MONTH, 0); }
		public TerminalNode K_REGR_SYY() { return getToken(TeradataParser.K_REGR_SYY, 0); }
		public TerminalNode K_THEN() { return getToken(TeradataParser.K_THEN, 0); }
		public TerminalNode K_AS() { return getToken(TeradataParser.K_AS, 0); }
		public TerminalNode K_DATABASE() { return getToken(TeradataParser.K_DATABASE, 0); }
		public TerminalNode K_HASHROW() { return getToken(TeradataParser.K_HASHROW, 0); }
		public TerminalNode K_MSUBSTR() { return getToken(TeradataParser.K_MSUBSTR, 0); }
		public TerminalNode K_RELEASE() { return getToken(TeradataParser.K_RELEASE, 0); }
		public TerminalNode K_THRESHOLD() { return getToken(TeradataParser.K_THRESHOLD, 0); }
		public TerminalNode K_ASC() { return getToken(TeradataParser.K_ASC, 0); }
		public TerminalNode K_DATABLOCKSIZE() { return getToken(TeradataParser.K_DATABLOCKSIZE, 0); }
		public TerminalNode K_HAVING() { return getToken(TeradataParser.K_HAVING, 0); }
		public TerminalNode K_MSUM() { return getToken(TeradataParser.K_MSUM, 0); }
		public TerminalNode K_RENAME() { return getToken(TeradataParser.K_RENAME, 0); }
		public TerminalNode K_TIME() { return getToken(TeradataParser.K_TIME, 0); }
		public TerminalNode K_ASIN() { return getToken(TeradataParser.K_ASIN, 0); }
		public TerminalNode K_DATE() { return getToken(TeradataParser.K_DATE, 0); }
		public TerminalNode K_HELP() { return getToken(TeradataParser.K_HELP, 0); }
		public TerminalNode K_MULTISET() { return getToken(TeradataParser.K_MULTISET, 0); }
		public TerminalNode K_REPEAT() { return getToken(TeradataParser.K_REPEAT, 0); }
		public TerminalNode K_TIMESTAMP() { return getToken(TeradataParser.K_TIMESTAMP, 0); }
		public TerminalNode K_ASINH() { return getToken(TeradataParser.K_ASINH, 0); }
		public TerminalNode K_DATEFORM() { return getToken(TeradataParser.K_DATEFORM, 0); }
		public TerminalNode K_HOUR() { return getToken(TeradataParser.K_HOUR, 0); }
		public TerminalNode K_NAMED() { return getToken(TeradataParser.K_NAMED, 0); }
		public TerminalNode K_REPLACE() { return getToken(TeradataParser.K_REPLACE, 0); }
		public TerminalNode K_TIMEZONE_HOUR() { return getToken(TeradataParser.K_TIMEZONE_HOUR, 0); }
		public TerminalNode K_AT() { return getToken(TeradataParser.K_AT, 0); }
		public TerminalNode K_DAY() { return getToken(TeradataParser.K_DAY, 0); }
		public TerminalNode K_IDENTITY() { return getToken(TeradataParser.K_IDENTITY, 0); }
		public TerminalNode K_NATURAL() { return getToken(TeradataParser.K_NATURAL, 0); }
		public TerminalNode K_REPLICATION() { return getToken(TeradataParser.K_REPLICATION, 0); }
		public TerminalNode K_TIMEZONE_MINUTE() { return getToken(TeradataParser.K_TIMEZONE_MINUTE, 0); }
		public TerminalNode K_ATAN() { return getToken(TeradataParser.K_ATAN, 0); }
		public TerminalNode K_DEC() { return getToken(TeradataParser.K_DEC, 0); }
		public TerminalNode K_IF() { return getToken(TeradataParser.K_IF, 0); }
		public TerminalNode K_NE() { return getToken(TeradataParser.K_NE, 0); }
		public TerminalNode K_REPOVERRIDE() { return getToken(TeradataParser.K_REPOVERRIDE, 0); }
		public TerminalNode K_TITLE() { return getToken(TeradataParser.K_TITLE, 0); }
		public TerminalNode K_ATAN2() { return getToken(TeradataParser.K_ATAN2, 0); }
		public TerminalNode K_DECIMAL() { return getToken(TeradataParser.K_DECIMAL, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(TeradataParser.K_IMMEDIATE, 0); }
		public TerminalNode K_NEW() { return getToken(TeradataParser.K_NEW, 0); }
		public TerminalNode K_REQUEST() { return getToken(TeradataParser.K_REQUEST, 0); }
		public TerminalNode K_TO() { return getToken(TeradataParser.K_TO, 0); }
		public TerminalNode K_ATANH() { return getToken(TeradataParser.K_ATANH, 0); }
		public TerminalNode K_DECLARE() { return getToken(TeradataParser.K_DECLARE, 0); }
		public TerminalNode K_IN() { return getToken(TeradataParser.K_IN, 0); }
		public TerminalNode K_NEW_TABLE() { return getToken(TeradataParser.K_NEW_TABLE, 0); }
		public TerminalNode K_RESTART() { return getToken(TeradataParser.K_RESTART, 0); }
		public TerminalNode K_TRACE() { return getToken(TeradataParser.K_TRACE, 0); }
		public TerminalNode K_ATOMIC() { return getToken(TeradataParser.K_ATOMIC, 0); }
		public TerminalNode K_DEFAULT() { return getToken(TeradataParser.K_DEFAULT, 0); }
		public TerminalNode K_INCONSISTENT() { return getToken(TeradataParser.K_INCONSISTENT, 0); }
		public TerminalNode K_NEXT() { return getToken(TeradataParser.K_NEXT, 0); }
		public TerminalNode K_RESTORE() { return getToken(TeradataParser.K_RESTORE, 0); }
		public TerminalNode K_TRAILING() { return getToken(TeradataParser.K_TRAILING, 0); }
		public TerminalNode K_AUTHORIZATION() { return getToken(TeradataParser.K_AUTHORIZATION, 0); }
		public TerminalNode K_DEGREES() { return getToken(TeradataParser.K_DEGREES, 0); }
		public TerminalNode K_INDEX() { return getToken(TeradataParser.K_INDEX, 0); }
		public TerminalNode K_NO() { return getToken(TeradataParser.K_NO, 0); }
		public TerminalNode K_RESUME() { return getToken(TeradataParser.K_RESUME, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(TeradataParser.K_TRANSACTION, 0); }
		public TerminalNode K_AVE() { return getToken(TeradataParser.K_AVE, 0); }
		public TerminalNode K_DEL() { return getToken(TeradataParser.K_DEL, 0); }
		public TerminalNode K_INDICATOR() { return getToken(TeradataParser.K_INDICATOR, 0); }
		public TerminalNode K_NONE() { return getToken(TeradataParser.K_NONE, 0); }
		public TerminalNode K_RET() { return getToken(TeradataParser.K_RET, 0); }
		public TerminalNode K_TRANSLATE() { return getToken(TeradataParser.K_TRANSLATE, 0); }
		public TerminalNode K_AVERAGE() { return getToken(TeradataParser.K_AVERAGE, 0); }
		public TerminalNode K_DELETE() { return getToken(TeradataParser.K_DELETE, 0); }
		public TerminalNode K_INITIATE() { return getToken(TeradataParser.K_INITIATE, 0); }
		public TerminalNode K_NOT() { return getToken(TeradataParser.K_NOT, 0); }
		public TerminalNode K_RETRIEVE() { return getToken(TeradataParser.K_RETRIEVE, 0); }
		public TerminalNode K_TRANSLATE_CHK() { return getToken(TeradataParser.K_TRANSLATE_CHK, 0); }
		public TerminalNode K_AVG() { return getToken(TeradataParser.K_AVG, 0); }
		public TerminalNode K_DESC() { return getToken(TeradataParser.K_DESC, 0); }
		public TerminalNode K_INNER() { return getToken(TeradataParser.K_INNER, 0); }
		public TerminalNode K_NOWAIT() { return getToken(TeradataParser.K_NOWAIT, 0); }
		public TerminalNode K_RETURNS() { return getToken(TeradataParser.K_RETURNS, 0); }
		public TerminalNode K_TRIGGER() { return getToken(TeradataParser.K_TRIGGER, 0); }
		public TerminalNode K_BEFORE() { return getToken(TeradataParser.K_BEFORE, 0); }
		public TerminalNode K_DESCRIPTOR() { return getToken(TeradataParser.K_DESCRIPTOR, 0); }
		public TerminalNode K_INOUT() { return getToken(TeradataParser.K_INOUT, 0); }
		public TerminalNode K_NULL() { return getToken(TeradataParser.K_NULL, 0); }
		public TerminalNode K_REVALIDATE() { return getToken(TeradataParser.K_REVALIDATE, 0); }
		public TerminalNode K_TRIM() { return getToken(TeradataParser.K_TRIM, 0); }
		public TerminalNode K_BEGIN() { return getToken(TeradataParser.K_BEGIN, 0); }
		public TerminalNode K_DETERMINISTIC() { return getToken(TeradataParser.K_DETERMINISTIC, 0); }
		public TerminalNode K_INPUT() { return getToken(TeradataParser.K_INPUT, 0); }
		public TerminalNode K_NULLIF() { return getToken(TeradataParser.K_NULLIF, 0); }
		public TerminalNode K_REVOKE() { return getToken(TeradataParser.K_REVOKE, 0); }
		public TerminalNode K_TYPE() { return getToken(TeradataParser.K_TYPE, 0); }
		public TerminalNode K_BETWEEN() { return getToken(TeradataParser.K_BETWEEN, 0); }
		public TerminalNode K_DIAGNOSTIC() { return getToken(TeradataParser.K_DIAGNOSTIC, 0); }
		public TerminalNode K_INS() { return getToken(TeradataParser.K_INS, 0); }
		public TerminalNode K_NULLIFZERO() { return getToken(TeradataParser.K_NULLIFZERO, 0); }
		public TerminalNode K_RIGHT() { return getToken(TeradataParser.K_RIGHT, 0); }
		public TerminalNode K_UC() { return getToken(TeradataParser.K_UC, 0); }
		public TerminalNode K_BLOB() { return getToken(TeradataParser.K_BLOB, 0); }
		public TerminalNode K_DISABLED() { return getToken(TeradataParser.K_DISABLED, 0); }
		public TerminalNode K_INSERT() { return getToken(TeradataParser.K_INSERT, 0); }
		public TerminalNode K_NUMERIC() { return getToken(TeradataParser.K_NUMERIC, 0); }
		public TerminalNode K_RIGHTS() { return getToken(TeradataParser.K_RIGHTS, 0); }
		public TerminalNode K_UNDEFINED() { return getToken(TeradataParser.K_UNDEFINED, 0); }
		public TerminalNode K_BOTH() { return getToken(TeradataParser.K_BOTH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(TeradataParser.K_DISTINCT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(TeradataParser.K_INSTEAD, 0); }
		public TerminalNode K_OBJECTS() { return getToken(TeradataParser.K_OBJECTS, 0); }
		public TerminalNode K_ROLE() { return getToken(TeradataParser.K_ROLE, 0); }
		public TerminalNode K_UNDO() { return getToken(TeradataParser.K_UNDO, 0); }
		public TerminalNode K_BT() { return getToken(TeradataParser.K_BT, 0); }
		public TerminalNode K_DO() { return getToken(TeradataParser.K_DO, 0); }
		public TerminalNode K_INT() { return getToken(TeradataParser.K_INT, 0); }
		public TerminalNode K_OCTET_LENGTH() { return getToken(TeradataParser.K_OCTET_LENGTH, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(TeradataParser.K_ROLLBACK, 0); }
		public TerminalNode K_UNION() { return getToken(TeradataParser.K_UNION, 0); }
		public TerminalNode K_BUT() { return getToken(TeradataParser.K_BUT, 0); }
		public TerminalNode K_DOUBLE() { return getToken(TeradataParser.K_DOUBLE, 0); }
		public TerminalNode K_INTEGER() { return getToken(TeradataParser.K_INTEGER, 0); }
		public TerminalNode K_OF() { return getToken(TeradataParser.K_OF, 0); }
		public TerminalNode K_ROLLFORWARD() { return getToken(TeradataParser.K_ROLLFORWARD, 0); }
		public TerminalNode K_UNIQUE() { return getToken(TeradataParser.K_UNIQUE, 0); }
		public TerminalNode K_BY() { return getToken(TeradataParser.K_BY, 0); }
		public TerminalNode K_DROP() { return getToken(TeradataParser.K_DROP, 0); }
		public TerminalNode K_INTEGERDATE() { return getToken(TeradataParser.K_INTEGERDATE, 0); }
		public TerminalNode K_OFF() { return getToken(TeradataParser.K_OFF, 0); }
		public TerminalNode K_ROW() { return getToken(TeradataParser.K_ROW, 0); }
		public TerminalNode K_UNTIL() { return getToken(TeradataParser.K_UNTIL, 0); }
		public TerminalNode K_BYTE() { return getToken(TeradataParser.K_BYTE, 0); }
		public TerminalNode K_DUAL() { return getToken(TeradataParser.K_DUAL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(TeradataParser.K_INTERSECT, 0); }
		public TerminalNode K_OLD() { return getToken(TeradataParser.K_OLD, 0); }
		public TerminalNode K_ROWID() { return getToken(TeradataParser.K_ROWID, 0); }
		public TerminalNode K_UPD() { return getToken(TeradataParser.K_UPD, 0); }
		public TerminalNode K_BYTEINT() { return getToken(TeradataParser.K_BYTEINT, 0); }
		public TerminalNode K_DUMP() { return getToken(TeradataParser.K_DUMP, 0); }
		public TerminalNode K_INTERVAL() { return getToken(TeradataParser.K_INTERVAL, 0); }
		public TerminalNode K_OLD_TABLE() { return getToken(TeradataParser.K_OLD_TABLE, 0); }
		public TerminalNode K_ROWS() { return getToken(TeradataParser.K_ROWS, 0); }
		public TerminalNode K_UPDATE() { return getToken(TeradataParser.K_UPDATE, 0); }
		public TerminalNode K_BYTES() { return getToken(TeradataParser.K_BYTES, 0); }
		public TerminalNode K_EACH() { return getToken(TeradataParser.K_EACH, 0); }
		public TerminalNode K_INTO() { return getToken(TeradataParser.K_INTO, 0); }
		public TerminalNode K_ON() { return getToken(TeradataParser.K_ON, 0); }
		public TerminalNode K_ROW_NUMBER() { return getToken(TeradataParser.K_ROW_NUMBER, 0); }
		public TerminalNode K_UPPER() { return getToken(TeradataParser.K_UPPER, 0); }
		public TerminalNode K_CALL() { return getToken(TeradataParser.K_CALL, 0); }
		public TerminalNode K_ECHO() { return getToken(TeradataParser.K_ECHO, 0); }
		public TerminalNode K_IS() { return getToken(TeradataParser.K_IS, 0); }
		public TerminalNode K_ONLY() { return getToken(TeradataParser.K_ONLY, 0); }
		public TerminalNode K_SAMPLE() { return getToken(TeradataParser.K_SAMPLE, 0); }
		public TerminalNode K_UPPERCASE() { return getToken(TeradataParser.K_UPPERCASE, 0); }
		public TerminalNode K_CASE() { return getToken(TeradataParser.K_CASE, 0); }
		public TerminalNode K_ELSE() { return getToken(TeradataParser.K_ELSE, 0); }
		public TerminalNode K_ITERATE() { return getToken(TeradataParser.K_ITERATE, 0); }
		public TerminalNode K_OPEN() { return getToken(TeradataParser.K_OPEN, 0); }
		public TerminalNode K_SAMPLEID() { return getToken(TeradataParser.K_SAMPLEID, 0); }
		public TerminalNode K_USER() { return getToken(TeradataParser.K_USER, 0); }
		public TerminalNode K_CASESPECIFIC() { return getToken(TeradataParser.K_CASESPECIFIC, 0); }
		public TerminalNode K_ELSEIF() { return getToken(TeradataParser.K_ELSEIF, 0); }
		public TerminalNode K_JOIN() { return getToken(TeradataParser.K_JOIN, 0); }
		public TerminalNode K_OPTION() { return getToken(TeradataParser.K_OPTION, 0); }
		public TerminalNode K_SCROLL() { return getToken(TeradataParser.K_SCROLL, 0); }
		public TerminalNode K_USING() { return getToken(TeradataParser.K_USING, 0); }
		public TerminalNode K_CASE_N() { return getToken(TeradataParser.K_CASE_N, 0); }
		public TerminalNode K_ENABLED() { return getToken(TeradataParser.K_ENABLED, 0); }
		public TerminalNode K_JOURNAL() { return getToken(TeradataParser.K_JOURNAL, 0); }
		public TerminalNode K_OR() { return getToken(TeradataParser.K_OR, 0); }
		public TerminalNode K_SECOND() { return getToken(TeradataParser.K_SECOND, 0); }
		public TerminalNode K_VALUE() { return getToken(TeradataParser.K_VALUE, 0); }
		public TerminalNode K_CAST() { return getToken(TeradataParser.K_CAST, 0); }
		public TerminalNode K_END() { return getToken(TeradataParser.K_END, 0); }
		public TerminalNode K_KEY() { return getToken(TeradataParser.K_KEY, 0); }
		public TerminalNode K_ORDER() { return getToken(TeradataParser.K_ORDER, 0); }
		public TerminalNode K_SEL() { return getToken(TeradataParser.K_SEL, 0); }
		public TerminalNode K_VALUES() { return getToken(TeradataParser.K_VALUES, 0); }
		public TerminalNode K_CD() { return getToken(TeradataParser.K_CD, 0); }
		public TerminalNode K_EQ() { return getToken(TeradataParser.K_EQ, 0); }
		public TerminalNode K_KURTOSIS() { return getToken(TeradataParser.K_KURTOSIS, 0); }
		public TerminalNode K_OUT() { return getToken(TeradataParser.K_OUT, 0); }
		public TerminalNode K_SELECT() { return getToken(TeradataParser.K_SELECT, 0); }
		public TerminalNode K_VARBYTE() { return getToken(TeradataParser.K_VARBYTE, 0); }
		public TerminalNode K_CHAR() { return getToken(TeradataParser.K_CHAR, 0); }
		public TerminalNode K_ERROR() { return getToken(TeradataParser.K_ERROR, 0); }
		public TerminalNode K_LANGUAGE() { return getToken(TeradataParser.K_LANGUAGE, 0); }
		public TerminalNode K_OUTER() { return getToken(TeradataParser.K_OUTER, 0); }
		public TerminalNode K_SESSION() { return getToken(TeradataParser.K_SESSION, 0); }
		public TerminalNode K_VARCHAR() { return getToken(TeradataParser.K_VARCHAR, 0); }
		public TerminalNode K_CHAR2HEXINT() { return getToken(TeradataParser.K_CHAR2HEXINT, 0); }
		public TerminalNode K_ERRORFILES() { return getToken(TeradataParser.K_ERRORFILES, 0); }
		public TerminalNode K_LE() { return getToken(TeradataParser.K_LE, 0); }
		public TerminalNode K_OVER() { return getToken(TeradataParser.K_OVER, 0); }
		public TerminalNode K_SET() { return getToken(TeradataParser.K_SET, 0); }
		public TerminalNode K_VARGRAPHIC() { return getToken(TeradataParser.K_VARGRAPHIC, 0); }
		public TerminalNode K_CHARACTER() { return getToken(TeradataParser.K_CHARACTER, 0); }
		public TerminalNode K_ERRORTABLES() { return getToken(TeradataParser.K_ERRORTABLES, 0); }
		public TerminalNode K_LEADING() { return getToken(TeradataParser.K_LEADING, 0); }
		public TerminalNode K_OVERLAPS() { return getToken(TeradataParser.K_OVERLAPS, 0); }
		public TerminalNode K_SETRESRATE() { return getToken(TeradataParser.K_SETRESRATE, 0); }
		public TerminalNode K_VARYING() { return getToken(TeradataParser.K_VARYING, 0); }
		public TerminalNode K_CHARACTERS() { return getToken(TeradataParser.K_CHARACTERS, 0); }
		public TerminalNode K_ESCAPE() { return getToken(TeradataParser.K_ESCAPE, 0); }
		public TerminalNode K_LEAVE() { return getToken(TeradataParser.K_LEAVE, 0); }
		public TerminalNode K_OVERRIDE() { return getToken(TeradataParser.K_OVERRIDE, 0); }
		public TerminalNode K_SETSESSRATE() { return getToken(TeradataParser.K_SETSESSRATE, 0); }
		public TerminalNode K_VAR_POP() { return getToken(TeradataParser.K_VAR_POP, 0); }
		public TerminalNode K_CHARACTER_LENGTH() { return getToken(TeradataParser.K_CHARACTER_LENGTH, 0); }
		public TerminalNode K_ET() { return getToken(TeradataParser.K_ET, 0); }
		public TerminalNode K_LEFT() { return getToken(TeradataParser.K_LEFT, 0); }
		public TerminalNode K_PARAMETER() { return getToken(TeradataParser.K_PARAMETER, 0); }
		public TerminalNode K_SHOW() { return getToken(TeradataParser.K_SHOW, 0); }
		public TerminalNode K_VAR_SAMP() { return getToken(TeradataParser.K_VAR_SAMP, 0); }
		public TerminalNode K_CHARS() { return getToken(TeradataParser.K_CHARS, 0); }
		public TerminalNode K_EXCEPT() { return getToken(TeradataParser.K_EXCEPT, 0); }
		public TerminalNode K_LIKE() { return getToken(TeradataParser.K_LIKE, 0); }
		public TerminalNode K_PASSWORD() { return getToken(TeradataParser.K_PASSWORD, 0); }
		public TerminalNode K_SIMPLE() { return getToken(TeradataParser.K_SIMPLE, 0); }
		public TerminalNode K_VIEW() { return getToken(TeradataParser.K_VIEW, 0); }
		public TerminalNode K_CHAR_LENGTH() { return getToken(TeradataParser.K_CHAR_LENGTH, 0); }
		public TerminalNode K_EXEC() { return getToken(TeradataParser.K_EXEC, 0); }
		public TerminalNode K_LIMIT() { return getToken(TeradataParser.K_LIMIT, 0); }
		public TerminalNode K_PERCENT() { return getToken(TeradataParser.K_PERCENT, 0); }
		public TerminalNode K_SIN() { return getToken(TeradataParser.K_SIN, 0); }
		public TerminalNode K_VOLATILE() { return getToken(TeradataParser.K_VOLATILE, 0); }
		public TerminalNode K_CHECK() { return getToken(TeradataParser.K_CHECK, 0); }
		public TerminalNode K_EXECUTE() { return getToken(TeradataParser.K_EXECUTE, 0); }
		public TerminalNode K_LN() { return getToken(TeradataParser.K_LN, 0); }
		public TerminalNode K_PERCENT_RANK() { return getToken(TeradataParser.K_PERCENT_RANK, 0); }
		public TerminalNode K_SINH() { return getToken(TeradataParser.K_SINH, 0); }
		public TerminalNode K_WAIT() { return getToken(TeradataParser.K_WAIT, 0); }
		public TerminalNode K_CHECKPOINT() { return getToken(TeradataParser.K_CHECKPOINT, 0); }
		public TerminalNode K_EXISTS() { return getToken(TeradataParser.K_EXISTS, 0); }
		public TerminalNode K_LOADING() { return getToken(TeradataParser.K_LOADING, 0); }
		public TerminalNode K_PERM() { return getToken(TeradataParser.K_PERM, 0); }
		public TerminalNode K_SKEW() { return getToken(TeradataParser.K_SKEW, 0); }
		public TerminalNode K_WHEN() { return getToken(TeradataParser.K_WHEN, 0); }
		public TerminalNode K_CLASS() { return getToken(TeradataParser.K_CLASS, 0); }
		public TerminalNode K_EXIT() { return getToken(TeradataParser.K_EXIT, 0); }
		public TerminalNode K_LOCAL() { return getToken(TeradataParser.K_LOCAL, 0); }
		public TerminalNode K_PERMANENT() { return getToken(TeradataParser.K_PERMANENT, 0); }
		public TerminalNode K_SMALLINT() { return getToken(TeradataParser.K_SMALLINT, 0); }
		public TerminalNode K_WHERE() { return getToken(TeradataParser.K_WHERE, 0); }
		public TerminalNode K_CLOSE() { return getToken(TeradataParser.K_CLOSE, 0); }
		public TerminalNode K_EXP() { return getToken(TeradataParser.K_EXP, 0); }
		public TerminalNode K_LOCATOR() { return getToken(TeradataParser.K_LOCATOR, 0); }
		public TerminalNode K_POSITION() { return getToken(TeradataParser.K_POSITION, 0); }
		public TerminalNode K_SOME() { return getToken(TeradataParser.K_SOME, 0); }
		public TerminalNode K_WHILE() { return getToken(TeradataParser.K_WHILE, 0); }
		public TerminalNode K_CLUSTER() { return getToken(TeradataParser.K_CLUSTER, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(TeradataParser.K_EXPLAIN, 0); }
		public TerminalNode K_LOCK() { return getToken(TeradataParser.K_LOCK, 0); }
		public TerminalNode K_PRECISION() { return getToken(TeradataParser.K_PRECISION, 0); }
		public TerminalNode K_SOUNDEX() { return getToken(TeradataParser.K_SOUNDEX, 0); }
		public TerminalNode K_WIDTH_BUCKET() { return getToken(TeradataParser.K_WIDTH_BUCKET, 0); }
		public TerminalNode K_CM() { return getToken(TeradataParser.K_CM, 0); }
		public TerminalNode K_EXTERNAL() { return getToken(TeradataParser.K_EXTERNAL, 0); }
		public TerminalNode K_LOCKING() { return getToken(TeradataParser.K_LOCKING, 0); }
		public TerminalNode K_PREPARE() { return getToken(TeradataParser.K_PREPARE, 0); }
		public TerminalNode K_SPECIFIC() { return getToken(TeradataParser.K_SPECIFIC, 0); }
		public TerminalNode K_WITH() { return getToken(TeradataParser.K_WITH, 0); }
		public TerminalNode K_COALESCE() { return getToken(TeradataParser.K_COALESCE, 0); }
		public TerminalNode K_EXTRACT() { return getToken(TeradataParser.K_EXTRACT, 0); }
		public TerminalNode K_LOG() { return getToken(TeradataParser.K_LOG, 0); }
		public TerminalNode K_PRESERVE() { return getToken(TeradataParser.K_PRESERVE, 0); }
		public TerminalNode K_SPOOL() { return getToken(TeradataParser.K_SPOOL, 0); }
		public TerminalNode K_WITHOUT() { return getToken(TeradataParser.K_WITHOUT, 0); }
		public TerminalNode K_COLLATION() { return getToken(TeradataParser.K_COLLATION, 0); }
		public TerminalNode K_FALLBACK() { return getToken(TeradataParser.K_FALLBACK, 0); }
		public TerminalNode K_LOGGING() { return getToken(TeradataParser.K_LOGGING, 0); }
		public TerminalNode K_PRIMARY() { return getToken(TeradataParser.K_PRIMARY, 0); }
		public TerminalNode K_SQL() { return getToken(TeradataParser.K_SQL, 0); }
		public TerminalNode K_WORK() { return getToken(TeradataParser.K_WORK, 0); }
		public TerminalNode K_COLLECT() { return getToken(TeradataParser.K_COLLECT, 0); }
		public TerminalNode K_FASTEXPORT() { return getToken(TeradataParser.K_FASTEXPORT, 0); }
		public TerminalNode K_LOGON() { return getToken(TeradataParser.K_LOGON, 0); }
		public TerminalNode K_PRIVATE() { return getToken(TeradataParser.K_PRIVATE, 0); }
		public TerminalNode K_SQLEXCEPTION() { return getToken(TeradataParser.K_SQLEXCEPTION, 0); }
		public TerminalNode K_YEAR() { return getToken(TeradataParser.K_YEAR, 0); }
		public TerminalNode K_COLUMN() { return getToken(TeradataParser.K_COLUMN, 0); }
		public TerminalNode K_FETCH() { return getToken(TeradataParser.K_FETCH, 0); }
		public TerminalNode K_LONG() { return getToken(TeradataParser.K_LONG, 0); }
		public TerminalNode K_PRIVILEGES() { return getToken(TeradataParser.K_PRIVILEGES, 0); }
		public TerminalNode K_SQLTEXT() { return getToken(TeradataParser.K_SQLTEXT, 0); }
		public TerminalNode K_ZEROIFNULL() { return getToken(TeradataParser.K_ZEROIFNULL, 0); }
		public TerminalNode K_COMMENT() { return getToken(TeradataParser.K_COMMENT, 0); }
		public TerminalNode K_FIRST() { return getToken(TeradataParser.K_FIRST, 0); }
		public TerminalNode K_LOOP() { return getToken(TeradataParser.K_LOOP, 0); }
		public TerminalNode K_PROCEDURE() { return getToken(TeradataParser.K_PROCEDURE, 0); }
		public TerminalNode K_SQLWARNING() { return getToken(TeradataParser.K_SQLWARNING, 0); }
		public TerminalNode K_ZONE() { return getToken(TeradataParser.K_ZONE, 0); }
		public TerminalNode K_COMMIT() { return getToken(TeradataParser.K_COMMIT, 0); }
		public TerminalNode K_FLOAT() { return getToken(TeradataParser.K_FLOAT, 0); }
		public TerminalNode K_LOWER() { return getToken(TeradataParser.K_LOWER, 0); }
		public TerminalNode K_PROFILE() { return getToken(TeradataParser.K_PROFILE, 0); }
		public TerminalNode K_SQRT() { return getToken(TeradataParser.K_SQRT, 0); }
		public TerminalNode K_COMPRESS() { return getToken(TeradataParser.K_COMPRESS, 0); }
		public TerminalNode K_FOR() { return getToken(TeradataParser.K_FOR, 0); }
		public TerminalNode K_LT() { return getToken(TeradataParser.K_LT, 0); }
		public TerminalNode K_PROPORTIONAL() { return getToken(TeradataParser.K_PROPORTIONAL, 0); }
		public TerminalNode K_SS() { return getToken(TeradataParser.K_SS, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(TeradataParser.K_CONSTRAINT, 0); }
		public TerminalNode K_FOREIGN() { return getToken(TeradataParser.K_FOREIGN, 0); }
		public TerminalNode K_MACRO() { return getToken(TeradataParser.K_MACRO, 0); }
		public TerminalNode K_PROTECTION() { return getToken(TeradataParser.K_PROTECTION, 0); }
		public TerminalNode K_START() { return getToken(TeradataParser.K_START, 0); }
		public TerminalNode K_CONTINUE() { return getToken(TeradataParser.K_CONTINUE, 0); }
		public TerminalNode K_FORMAT() { return getToken(TeradataParser.K_FORMAT, 0); }
		public TerminalNode K_MAVG() { return getToken(TeradataParser.K_MAVG, 0); }
		public TerminalNode K_PUBLIC() { return getToken(TeradataParser.K_PUBLIC, 0); }
		public TerminalNode K_STARTUP() { return getToken(TeradataParser.K_STARTUP, 0); }
		public TerminalNode K_TOP() { return getToken(TeradataParser.K_TOP, 0); }
		public TerminalNode K_TIES() { return getToken(TeradataParser.K_TIES, 0); }
		public TerminalNode K_VALIDTIME() { return getToken(TeradataParser.K_VALIDTIME, 0); }
		public TerminalNode K_TRANSACTIONTIME() { return getToken(TeradataParser.K_TRANSACTIONTIME, 0); }
		public TerminalNode K_BIGINT() { return getToken(TeradataParser.K_BIGINT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (K_ABORT - 25)) | (1L << (K_CONVERT_TABLE_HEADER - 25)) | (1L << (K_FOUND - 25)) | (1L << (K_MAX - 25)) | (1L << (K_QUALIFIED - 25)) | (1L << (K_STATEMENT - 25)) | (1L << (K_ABORTSESSION - 25)) | (1L << (K_CORR - 25)) | (1L << (K_FREESPACE - 25)) | (1L << (K_MAXIMUM - 25)) | (1L << (K_QUALIFY - 25)) | (1L << (K_STATISTICS - 25)) | (1L << (K_ABS - 25)) | (1L << (K_COS - 25)) | (1L << (K_FROM - 25)) | (1L << (K_MCHARACTERS - 25)) | (1L << (K_QUANTILE - 25)) | (1L << (K_STDDEV_POP - 25)) | (1L << (K_ACCESS_LOCK - 25)) | (1L << (K_COSH - 25)) | (1L << (K_FULL - 25)) | (1L << (K_MDIFF - 25)) | (1L << (K_RADIANS - 25)) | (1L << (K_STDDEV_SAMP - 25)) | (1L << (K_ACCOUNT - 25)) | (1L << (K_COUNT - 25)) | (1L << (K_FUNCTION - 25)) | (1L << (K_MERGE - 25)) | (1L << (K_RANDOM - 25)) | (1L << (K_STEPINFO - 25)) | (1L << (K_ACOS - 25)) | (1L << (K_COVAR_POP - 25)) | (1L << (K_GE - 25)) | (1L << (K_MIN - 25)) | (1L << (K_RANGE_N - 25)) | (1L << (K_STRING_CS - 25)) | (1L << (K_ACOSH - 25)) | (1L << (K_COVAR_SAMP - 25)) | (1L << (K_GENERATED - 25)) | (1L << (K_MINDEX - 25)) | (1L << (K_RANK - 25)) | (1L << (K_SUBSCRIBER - 25)) | (1L << (K_ADD - 25)) | (1L << (K_CREATE - 25)) | (1L << (K_GIVE - 25)) | (1L << (K_MINIMUM - 25)) | (1L << (K_REAL - 25)) | (1L << (K_SUBSTR - 25)) | (1L << (K_ADD_MONTHS - 25)) | (1L << (K_CROSS - 25)) | (1L << (K_GO - 25)) | (1L << (K_MINUS - 25)) | (1L << (K_REFERENCES - 25)) | (1L << (K_SUBSTRING - 25)) | (1L << (K_ADMIN - 25)) | (1L << (K_CS - 25)) | (1L << (K_GOTO - 25)) | (1L << (K_MINUTE - 25)) | (1L << (K_REFERENCING - 25)) | (1L << (K_SUM - 25)) | (1L << (K_AFTER - 25)) | (1L << (K_CSUM - 25)) | (1L << (K_GRANT - 25)) | (1L << (K_MLINREG - 25)))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_REGR_AVGX - 89)) | (1L << (K_SUMMARY - 89)) | (1L << (K_AGGREGATE - 89)) | (1L << (K_CT - 89)) | (1L << (K_GRAPHIC - 89)) | (1L << (K_MLOAD - 89)) | (1L << (K_REGR_AVGY - 89)) | (1L << (K_SUSPEND - 89)) | (1L << (K_ALIAS - 89)) | (1L << (K_CURRENT - 89)) | (1L << (K_GROUP - 89)) | (1L << (K_MOD - 89)) | (1L << (K_REGR_COUNT - 89)) | (1L << (K_TABLE - 89)) | (1L << (K_ALL - 89)) | (1L << (K_CURRENT_DATE - 89)) | (1L << (K_GT - 89)) | (1L << (K_MODE - 89)) | (1L << (K_REGR_INTERCEPT - 89)) | (1L << (K_TAN - 89)) | (1L << (K_ALTER - 89)) | (1L << (K_CURRENT_TIME - 89)) | (1L << (K_HANDLER - 89)) | (1L << (K_MODIFY - 89)) | (1L << (K_REGR_R2 - 89)) | (1L << (K_TANH - 89)) | (1L << (K_AMP - 89)) | (1L << (K_CURRENT_TIMESTAMP - 89)) | (1L << (K_HASH - 89)) | (1L << (K_MONITOR - 89)) | (1L << (K_REGR_SLOPE - 89)) | (1L << (K_TBL_CS - 89)) | (1L << (K_AND - 89)) | (1L << (K_CURSOR - 89)) | (1L << (K_HASHAMP - 89)) | (1L << (K_MONRESOURCE - 89)) | (1L << (K_REGR_SXX - 89)) | (1L << (K_TEMPORARY - 89)) | (1L << (K_ANSIDATE - 89)) | (1L << (K_CV - 89)) | (1L << (K_HASHBAKAMP - 89)) | (1L << (K_MONSESSION - 89)) | (1L << (K_REGR_SXY - 89)) | (1L << (K_TERMINATE - 89)) | (1L << (K_ANY - 89)) | (1L << (K_CYCLE - 89)) | (1L << (K_HASHBUCKET - 89)) | (1L << (K_MONTH - 89)) | (1L << (K_REGR_SYY - 89)) | (1L << (K_THEN - 89)) | (1L << (K_AS - 89)) | (1L << (K_DATABASE - 89)) | (1L << (K_HASHROW - 89)) | (1L << (K_MSUBSTR - 89)) | (1L << (K_RELEASE - 89)) | (1L << (K_THRESHOLD - 89)) | (1L << (K_ASC - 89)) | (1L << (K_DATABLOCKSIZE - 89)) | (1L << (K_HAVING - 89)) | (1L << (K_MSUM - 89)) | (1L << (K_RENAME - 89)) | (1L << (K_TIME - 89)) | (1L << (K_ASIN - 89)) | (1L << (K_DATE - 89)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (K_HELP - 153)) | (1L << (K_MULTISET - 153)) | (1L << (K_REPEAT - 153)) | (1L << (K_TIMESTAMP - 153)) | (1L << (K_ASINH - 153)) | (1L << (K_DATEFORM - 153)) | (1L << (K_HOUR - 153)) | (1L << (K_NAMED - 153)) | (1L << (K_REPLACE - 153)) | (1L << (K_TIMEZONE_HOUR - 153)) | (1L << (K_AT - 153)) | (1L << (K_DAY - 153)) | (1L << (K_IDENTITY - 153)) | (1L << (K_NATURAL - 153)) | (1L << (K_REPLICATION - 153)) | (1L << (K_TIMEZONE_MINUTE - 153)) | (1L << (K_ATAN - 153)) | (1L << (K_DEC - 153)) | (1L << (K_IF - 153)) | (1L << (K_NE - 153)) | (1L << (K_REPOVERRIDE - 153)) | (1L << (K_TITLE - 153)) | (1L << (K_ATAN2 - 153)) | (1L << (K_DECIMAL - 153)) | (1L << (K_IMMEDIATE - 153)) | (1L << (K_NEW - 153)) | (1L << (K_REQUEST - 153)) | (1L << (K_TO - 153)) | (1L << (K_ATANH - 153)) | (1L << (K_DECLARE - 153)) | (1L << (K_IN - 153)) | (1L << (K_NEW_TABLE - 153)) | (1L << (K_RESTART - 153)) | (1L << (K_TRACE - 153)) | (1L << (K_ATOMIC - 153)) | (1L << (K_DEFAULT - 153)) | (1L << (K_INCONSISTENT - 153)) | (1L << (K_NEXT - 153)) | (1L << (K_RESTORE - 153)) | (1L << (K_TRAILING - 153)) | (1L << (K_AUTHORIZATION - 153)) | (1L << (K_DEGREES - 153)) | (1L << (K_INDEX - 153)) | (1L << (K_NO - 153)) | (1L << (K_RESUME - 153)) | (1L << (K_TRANSACTION - 153)) | (1L << (K_AVE - 153)) | (1L << (K_DEL - 153)) | (1L << (K_INDICATOR - 153)) | (1L << (K_NONE - 153)) | (1L << (K_RET - 153)) | (1L << (K_TRANSLATE - 153)) | (1L << (K_AVERAGE - 153)) | (1L << (K_DELETE - 153)) | (1L << (K_INITIATE - 153)) | (1L << (K_NOT - 153)) | (1L << (K_RETRIEVE - 153)) | (1L << (K_TRANSLATE_CHK - 153)) | (1L << (K_AVG - 153)) | (1L << (K_DESC - 153)) | (1L << (K_INNER - 153)) | (1L << (K_NOWAIT - 153)) | (1L << (K_RETURNS - 153)) | (1L << (K_TRIGGER - 153)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (K_BEFORE - 217)) | (1L << (K_DESCRIPTOR - 217)) | (1L << (K_INOUT - 217)) | (1L << (K_NULL - 217)) | (1L << (K_REVALIDATE - 217)) | (1L << (K_TRIM - 217)) | (1L << (K_BEGIN - 217)) | (1L << (K_DETERMINISTIC - 217)) | (1L << (K_INPUT - 217)) | (1L << (K_NULLIF - 217)) | (1L << (K_REVOKE - 217)) | (1L << (K_TYPE - 217)) | (1L << (K_BETWEEN - 217)) | (1L << (K_DIAGNOSTIC - 217)) | (1L << (K_INS - 217)) | (1L << (K_NULLIFZERO - 217)) | (1L << (K_RIGHT - 217)) | (1L << (K_UC - 217)) | (1L << (K_BLOB - 217)) | (1L << (K_DISABLED - 217)) | (1L << (K_INSERT - 217)) | (1L << (K_NUMERIC - 217)) | (1L << (K_RIGHTS - 217)) | (1L << (K_UNDEFINED - 217)) | (1L << (K_BOTH - 217)) | (1L << (K_DISTINCT - 217)) | (1L << (K_INSTEAD - 217)) | (1L << (K_OBJECTS - 217)) | (1L << (K_ROLE - 217)) | (1L << (K_UNDO - 217)) | (1L << (K_BT - 217)) | (1L << (K_DO - 217)) | (1L << (K_INT - 217)) | (1L << (K_OCTET_LENGTH - 217)) | (1L << (K_ROLLBACK - 217)) | (1L << (K_UNION - 217)) | (1L << (K_BUT - 217)) | (1L << (K_DOUBLE - 217)) | (1L << (K_INTEGER - 217)) | (1L << (K_OF - 217)) | (1L << (K_ROLLFORWARD - 217)) | (1L << (K_UNIQUE - 217)) | (1L << (K_BY - 217)) | (1L << (K_DROP - 217)) | (1L << (K_INTEGERDATE - 217)) | (1L << (K_OFF - 217)) | (1L << (K_ROW - 217)) | (1L << (K_UNTIL - 217)) | (1L << (K_BYTE - 217)) | (1L << (K_DUAL - 217)) | (1L << (K_INTERSECT - 217)) | (1L << (K_OLD - 217)) | (1L << (K_ROWID - 217)) | (1L << (K_UPD - 217)) | (1L << (K_BYTEINT - 217)) | (1L << (K_DUMP - 217)) | (1L << (K_INTERVAL - 217)) | (1L << (K_OLD_TABLE - 217)) | (1L << (K_ROWS - 217)) | (1L << (K_UPDATE - 217)) | (1L << (K_BYTES - 217)) | (1L << (K_EACH - 217)) | (1L << (K_INTO - 217)) | (1L << (K_ON - 217)))) != 0) || ((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & ((1L << (K_ROW_NUMBER - 281)) | (1L << (K_UPPER - 281)) | (1L << (K_CALL - 281)) | (1L << (K_ECHO - 281)) | (1L << (K_IS - 281)) | (1L << (K_ONLY - 281)) | (1L << (K_SAMPLE - 281)) | (1L << (K_UPPERCASE - 281)) | (1L << (K_CASE - 281)) | (1L << (K_ELSE - 281)) | (1L << (K_ITERATE - 281)) | (1L << (K_OPEN - 281)) | (1L << (K_SAMPLEID - 281)) | (1L << (K_USER - 281)) | (1L << (K_CASESPECIFIC - 281)) | (1L << (K_ELSEIF - 281)) | (1L << (K_JOIN - 281)) | (1L << (K_OPTION - 281)) | (1L << (K_SCROLL - 281)) | (1L << (K_USING - 281)) | (1L << (K_CASE_N - 281)) | (1L << (K_ENABLED - 281)) | (1L << (K_JOURNAL - 281)) | (1L << (K_OR - 281)) | (1L << (K_SECOND - 281)) | (1L << (K_VALUE - 281)) | (1L << (K_CAST - 281)) | (1L << (K_END - 281)) | (1L << (K_KEY - 281)) | (1L << (K_ORDER - 281)) | (1L << (K_SEL - 281)) | (1L << (K_VALUES - 281)) | (1L << (K_CD - 281)) | (1L << (K_EQ - 281)) | (1L << (K_KURTOSIS - 281)) | (1L << (K_OUT - 281)) | (1L << (K_SELECT - 281)) | (1L << (K_VARBYTE - 281)) | (1L << (K_CHAR - 281)) | (1L << (K_ERROR - 281)) | (1L << (K_LANGUAGE - 281)) | (1L << (K_OUTER - 281)) | (1L << (K_SESSION - 281)) | (1L << (K_VARCHAR - 281)) | (1L << (K_CHAR2HEXINT - 281)) | (1L << (K_ERRORFILES - 281)) | (1L << (K_LE - 281)) | (1L << (K_OVER - 281)) | (1L << (K_SET - 281)) | (1L << (K_VARGRAPHIC - 281)) | (1L << (K_CHARACTER - 281)) | (1L << (K_ERRORTABLES - 281)) | (1L << (K_LEADING - 281)) | (1L << (K_OVERLAPS - 281)) | (1L << (K_SETRESRATE - 281)) | (1L << (K_VARYING - 281)) | (1L << (K_CHARACTERS - 281)) | (1L << (K_ESCAPE - 281)) | (1L << (K_LEAVE - 281)) | (1L << (K_OVERRIDE - 281)) | (1L << (K_SETSESSRATE - 281)) | (1L << (K_VAR_POP - 281)) | (1L << (K_CHARACTER_LENGTH - 281)) | (1L << (K_ET - 281)))) != 0) || ((((_la - 345)) & ~0x3f) == 0 && ((1L << (_la - 345)) & ((1L << (K_LEFT - 345)) | (1L << (K_PARAMETER - 345)) | (1L << (K_SHOW - 345)) | (1L << (K_VAR_SAMP - 345)) | (1L << (K_CHARS - 345)) | (1L << (K_EXCEPT - 345)) | (1L << (K_LIKE - 345)) | (1L << (K_PASSWORD - 345)) | (1L << (K_SIMPLE - 345)) | (1L << (K_VIEW - 345)) | (1L << (K_CHAR_LENGTH - 345)) | (1L << (K_EXEC - 345)) | (1L << (K_LIMIT - 345)) | (1L << (K_PERCENT - 345)) | (1L << (K_SIN - 345)) | (1L << (K_VOLATILE - 345)) | (1L << (K_CHECK - 345)) | (1L << (K_EXECUTE - 345)) | (1L << (K_LN - 345)) | (1L << (K_PERCENT_RANK - 345)) | (1L << (K_SINH - 345)) | (1L << (K_WAIT - 345)) | (1L << (K_CHECKPOINT - 345)) | (1L << (K_EXISTS - 345)) | (1L << (K_LOADING - 345)) | (1L << (K_PERM - 345)) | (1L << (K_SKEW - 345)) | (1L << (K_WHEN - 345)) | (1L << (K_CLASS - 345)) | (1L << (K_EXIT - 345)) | (1L << (K_LOCAL - 345)) | (1L << (K_PERMANENT - 345)) | (1L << (K_SMALLINT - 345)) | (1L << (K_WHERE - 345)) | (1L << (K_CLOSE - 345)) | (1L << (K_EXP - 345)) | (1L << (K_LOCATOR - 345)) | (1L << (K_POSITION - 345)) | (1L << (K_SOME - 345)) | (1L << (K_WHILE - 345)) | (1L << (K_CLUSTER - 345)) | (1L << (K_EXPLAIN - 345)) | (1L << (K_LOCK - 345)) | (1L << (K_PRECISION - 345)) | (1L << (K_SOUNDEX - 345)) | (1L << (K_WIDTH_BUCKET - 345)) | (1L << (K_CM - 345)) | (1L << (K_EXTERNAL - 345)) | (1L << (K_LOCKING - 345)) | (1L << (K_PREPARE - 345)) | (1L << (K_SPECIFIC - 345)) | (1L << (K_WITH - 345)) | (1L << (K_COALESCE - 345)) | (1L << (K_EXTRACT - 345)) | (1L << (K_LOG - 345)) | (1L << (K_PRESERVE - 345)) | (1L << (K_SPOOL - 345)) | (1L << (K_WITHOUT - 345)) | (1L << (K_COLLATION - 345)) | (1L << (K_FALLBACK - 345)) | (1L << (K_LOGGING - 345)) | (1L << (K_PRIMARY - 345)) | (1L << (K_SQL - 345)) | (1L << (K_WORK - 345)))) != 0) || ((((_la - 409)) & ~0x3f) == 0 && ((1L << (_la - 409)) & ((1L << (K_COLLECT - 409)) | (1L << (K_FASTEXPORT - 409)) | (1L << (K_LOGON - 409)) | (1L << (K_PRIVATE - 409)) | (1L << (K_SQLEXCEPTION - 409)) | (1L << (K_YEAR - 409)) | (1L << (K_COLUMN - 409)) | (1L << (K_FETCH - 409)) | (1L << (K_LONG - 409)) | (1L << (K_PRIVILEGES - 409)) | (1L << (K_SQLTEXT - 409)) | (1L << (K_ZEROIFNULL - 409)) | (1L << (K_COMMENT - 409)) | (1L << (K_FIRST - 409)) | (1L << (K_LOOP - 409)) | (1L << (K_PROCEDURE - 409)) | (1L << (K_SQLWARNING - 409)) | (1L << (K_ZONE - 409)) | (1L << (K_COMMIT - 409)) | (1L << (K_FLOAT - 409)) | (1L << (K_LOWER - 409)) | (1L << (K_PROFILE - 409)) | (1L << (K_SQRT - 409)) | (1L << (K_COMPRESS - 409)) | (1L << (K_FOR - 409)) | (1L << (K_LT - 409)) | (1L << (K_PROPORTIONAL - 409)) | (1L << (K_SS - 409)) | (1L << (K_CONSTRAINT - 409)) | (1L << (K_FOREIGN - 409)) | (1L << (K_MACRO - 409)) | (1L << (K_PROTECTION - 409)) | (1L << (K_START - 409)) | (1L << (K_CONTINUE - 409)) | (1L << (K_FORMAT - 409)) | (1L << (K_MAVG - 409)) | (1L << (K_PUBLIC - 409)) | (1L << (K_STARTUP - 409)) | (1L << (K_TOP - 409)) | (1L << (K_TIES - 409)) | (1L << (K_VALIDTIME - 409)) | (1L << (K_TRANSACTIONTIME - 409)) | (1L << (K_BIGINT - 409)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TeradataParser.IDENTIFIER, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TeradataParser.IDENTIFIER, 0); }
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TeradataParser.IDENTIFIER, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TeradataParser.DOT, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(790);
				database_name();
				setState(791);
				match(DOT);
				}
				break;
			}
			setState(795);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TeradataParser.IDENTIFIER, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TeradataParser.DOT, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(797);
				table_name();
				setState(798);
				match(DOT);
				}
				break;
			}
			setState(802);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Correlation_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TeradataParser.IDENTIFIER, 0); }
		public Correlation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correlation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterCorrelation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitCorrelation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitCorrelation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Correlation_nameContext correlation_name() throws RecognitionException {
		Correlation_nameContext _localctx = new Correlation_nameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_correlation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(TeradataParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(TeradataParser.CLOSE_PAR, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(TeradataParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(TeradataParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(TeradataParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(TeradataParser.INTEGER, i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			types();
			setState(814);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(807);
				match(OPEN_PAR);
				setState(809); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(808);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==INTEGER || _la==STRING_LITERAL) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					setState(811); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA || _la==INTEGER || _la==STRING_LITERAL );
				setState(813);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode K_DATE() { return getToken(TeradataParser.K_DATE, 0); }
		public TerminalNode K_TIME() { return getToken(TeradataParser.K_TIME, 0); }
		public TerminalNode K_TIMESTAMP() { return getToken(TeradataParser.K_TIMESTAMP, 0); }
		public TerminalNode K_INTEGER() { return getToken(TeradataParser.K_INTEGER, 0); }
		public TerminalNode K_DEC() { return getToken(TeradataParser.K_DEC, 0); }
		public TerminalNode K_DECIMAL() { return getToken(TeradataParser.K_DECIMAL, 0); }
		public TerminalNode K_CHAR() { return getToken(TeradataParser.K_CHAR, 0); }
		public TerminalNode K_CHARACTER() { return getToken(TeradataParser.K_CHARACTER, 0); }
		public TerminalNode K_VARCHAR() { return getToken(TeradataParser.K_VARCHAR, 0); }
		public TerminalNode K_FLOAT() { return getToken(TeradataParser.K_FLOAT, 0); }
		public TerminalNode K_INT() { return getToken(TeradataParser.K_INT, 0); }
		public TerminalNode K_SMALLINT() { return getToken(TeradataParser.K_SMALLINT, 0); }
		public TerminalNode K_BIGINT() { return getToken(TeradataParser.K_BIGINT, 0); }
		public TerminalNode K_BLOB() { return getToken(TeradataParser.K_BLOB, 0); }
		public TerminalNode K_VARBYTE() { return getToken(TeradataParser.K_VARBYTE, 0); }
		public TerminalNode K_BYTE() { return getToken(TeradataParser.K_BYTE, 0); }
		public TerminalNode K_BYTEINT() { return getToken(TeradataParser.K_BYTEINT, 0); }
		public TerminalNode K_NUMERIC() { return getToken(TeradataParser.K_NUMERIC, 0); }
		public TerminalNode K_DOUBLE() { return getToken(TeradataParser.K_DOUBLE, 0); }
		public TerminalNode K_CURSOR() { return getToken(TeradataParser.K_CURSOR, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_la = _input.LA(1);
			if ( !(((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (K_CURSOR - 122)) | (1L << (K_TIME - 122)) | (1L << (K_DATE - 122)) | (1L << (K_TIMESTAMP - 122)) | (1L << (K_DEC - 122)) | (1L << (K_DECIMAL - 122)))) != 0) || ((((_la - 235)) & ~0x3f) == 0 && ((1L << (_la - 235)) & ((1L << (K_BLOB - 235)) | (1L << (K_NUMERIC - 235)) | (1L << (K_INT - 235)) | (1L << (K_DOUBLE - 235)) | (1L << (K_INTEGER - 235)) | (1L << (K_BYTE - 235)) | (1L << (K_BYTEINT - 235)))) != 0) || ((((_la - 318)) & ~0x3f) == 0 && ((1L << (_la - 318)) & ((1L << (K_VARBYTE - 318)) | (1L << (K_CHAR - 318)) | (1L << (K_VARCHAR - 318)) | (1L << (K_CHARACTER - 318)) | (1L << (K_SMALLINT - 318)))) != 0) || _la==K_FLOAT || _la==K_BIGINT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TeradataParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(TeradataParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataListener ) ((TeradataListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataVisitor ) return ((TeradataVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_any_name);
		try {
			setState(825);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_CONVERT_TABLE_HEADER:
			case K_FOUND:
			case K_MAX:
			case K_QUALIFIED:
			case K_STATEMENT:
			case K_ABORTSESSION:
			case K_CORR:
			case K_FREESPACE:
			case K_MAXIMUM:
			case K_QUALIFY:
			case K_STATISTICS:
			case K_ABS:
			case K_COS:
			case K_FROM:
			case K_MCHARACTERS:
			case K_QUANTILE:
			case K_STDDEV_POP:
			case K_ACCESS_LOCK:
			case K_COSH:
			case K_FULL:
			case K_MDIFF:
			case K_RADIANS:
			case K_STDDEV_SAMP:
			case K_ACCOUNT:
			case K_COUNT:
			case K_FUNCTION:
			case K_MERGE:
			case K_RANDOM:
			case K_STEPINFO:
			case K_ACOS:
			case K_COVAR_POP:
			case K_GE:
			case K_MIN:
			case K_RANGE_N:
			case K_STRING_CS:
			case K_ACOSH:
			case K_COVAR_SAMP:
			case K_GENERATED:
			case K_MINDEX:
			case K_RANK:
			case K_SUBSCRIBER:
			case K_ADD:
			case K_CREATE:
			case K_GIVE:
			case K_MINIMUM:
			case K_REAL:
			case K_SUBSTR:
			case K_ADD_MONTHS:
			case K_CROSS:
			case K_GO:
			case K_MINUS:
			case K_REFERENCES:
			case K_SUBSTRING:
			case K_ADMIN:
			case K_CS:
			case K_GOTO:
			case K_MINUTE:
			case K_REFERENCING:
			case K_SUM:
			case K_AFTER:
			case K_CSUM:
			case K_GRANT:
			case K_MLINREG:
			case K_REGR_AVGX:
			case K_SUMMARY:
			case K_AGGREGATE:
			case K_CT:
			case K_GRAPHIC:
			case K_MLOAD:
			case K_REGR_AVGY:
			case K_SUSPEND:
			case K_ALIAS:
			case K_CURRENT:
			case K_GROUP:
			case K_MOD:
			case K_REGR_COUNT:
			case K_TABLE:
			case K_ALL:
			case K_CURRENT_DATE:
			case K_GT:
			case K_MODE:
			case K_REGR_INTERCEPT:
			case K_TAN:
			case K_ALTER:
			case K_CURRENT_TIME:
			case K_HANDLER:
			case K_MODIFY:
			case K_REGR_R2:
			case K_TANH:
			case K_AMP:
			case K_CURRENT_TIMESTAMP:
			case K_HASH:
			case K_MONITOR:
			case K_REGR_SLOPE:
			case K_TBL_CS:
			case K_AND:
			case K_CURSOR:
			case K_HASHAMP:
			case K_MONRESOURCE:
			case K_REGR_SXX:
			case K_TEMPORARY:
			case K_ANSIDATE:
			case K_CV:
			case K_HASHBAKAMP:
			case K_MONSESSION:
			case K_REGR_SXY:
			case K_TERMINATE:
			case K_ANY:
			case K_CYCLE:
			case K_HASHBUCKET:
			case K_MONTH:
			case K_REGR_SYY:
			case K_THEN:
			case K_AS:
			case K_DATABASE:
			case K_HASHROW:
			case K_MSUBSTR:
			case K_RELEASE:
			case K_THRESHOLD:
			case K_ASC:
			case K_DATABLOCKSIZE:
			case K_HAVING:
			case K_MSUM:
			case K_RENAME:
			case K_TIME:
			case K_ASIN:
			case K_DATE:
			case K_HELP:
			case K_MULTISET:
			case K_REPEAT:
			case K_TIMESTAMP:
			case K_ASINH:
			case K_DATEFORM:
			case K_HOUR:
			case K_NAMED:
			case K_REPLACE:
			case K_TIMEZONE_HOUR:
			case K_AT:
			case K_DAY:
			case K_IDENTITY:
			case K_NATURAL:
			case K_REPLICATION:
			case K_TIMEZONE_MINUTE:
			case K_ATAN:
			case K_DEC:
			case K_IF:
			case K_NE:
			case K_REPOVERRIDE:
			case K_TITLE:
			case K_ATAN2:
			case K_DECIMAL:
			case K_IMMEDIATE:
			case K_NEW:
			case K_REQUEST:
			case K_TO:
			case K_ATANH:
			case K_DECLARE:
			case K_IN:
			case K_NEW_TABLE:
			case K_RESTART:
			case K_TRACE:
			case K_ATOMIC:
			case K_DEFAULT:
			case K_INCONSISTENT:
			case K_NEXT:
			case K_RESTORE:
			case K_TRAILING:
			case K_AUTHORIZATION:
			case K_DEGREES:
			case K_INDEX:
			case K_NO:
			case K_RESUME:
			case K_TRANSACTION:
			case K_AVE:
			case K_DEL:
			case K_INDICATOR:
			case K_NONE:
			case K_RET:
			case K_TRANSLATE:
			case K_AVERAGE:
			case K_DELETE:
			case K_INITIATE:
			case K_NOT:
			case K_RETRIEVE:
			case K_TRANSLATE_CHK:
			case K_AVG:
			case K_DESC:
			case K_INNER:
			case K_NOWAIT:
			case K_RETURNS:
			case K_TRIGGER:
			case K_BEFORE:
			case K_DESCRIPTOR:
			case K_INOUT:
			case K_NULL:
			case K_REVALIDATE:
			case K_TRIM:
			case K_BEGIN:
			case K_DETERMINISTIC:
			case K_INPUT:
			case K_NULLIF:
			case K_REVOKE:
			case K_TYPE:
			case K_BETWEEN:
			case K_DIAGNOSTIC:
			case K_INS:
			case K_NULLIFZERO:
			case K_RIGHT:
			case K_UC:
			case K_BLOB:
			case K_DISABLED:
			case K_INSERT:
			case K_NUMERIC:
			case K_RIGHTS:
			case K_UNDEFINED:
			case K_BOTH:
			case K_DISTINCT:
			case K_INSTEAD:
			case K_OBJECTS:
			case K_ROLE:
			case K_UNDO:
			case K_BT:
			case K_DO:
			case K_INT:
			case K_OCTET_LENGTH:
			case K_ROLLBACK:
			case K_UNION:
			case K_BUT:
			case K_DOUBLE:
			case K_INTEGER:
			case K_OF:
			case K_ROLLFORWARD:
			case K_UNIQUE:
			case K_BY:
			case K_DROP:
			case K_INTEGERDATE:
			case K_OFF:
			case K_ROW:
			case K_UNTIL:
			case K_BYTE:
			case K_DUAL:
			case K_INTERSECT:
			case K_OLD:
			case K_ROWID:
			case K_UPD:
			case K_BYTEINT:
			case K_DUMP:
			case K_INTERVAL:
			case K_OLD_TABLE:
			case K_ROWS:
			case K_UPDATE:
			case K_BYTES:
			case K_EACH:
			case K_INTO:
			case K_ON:
			case K_ROW_NUMBER:
			case K_UPPER:
			case K_CALL:
			case K_ECHO:
			case K_IS:
			case K_ONLY:
			case K_SAMPLE:
			case K_UPPERCASE:
			case K_CASE:
			case K_ELSE:
			case K_ITERATE:
			case K_OPEN:
			case K_SAMPLEID:
			case K_USER:
			case K_CASESPECIFIC:
			case K_ELSEIF:
			case K_JOIN:
			case K_OPTION:
			case K_SCROLL:
			case K_USING:
			case K_CASE_N:
			case K_ENABLED:
			case K_JOURNAL:
			case K_OR:
			case K_SECOND:
			case K_VALUE:
			case K_CAST:
			case K_END:
			case K_KEY:
			case K_ORDER:
			case K_SEL:
			case K_VALUES:
			case K_CD:
			case K_EQ:
			case K_KURTOSIS:
			case K_OUT:
			case K_SELECT:
			case K_VARBYTE:
			case K_CHAR:
			case K_ERROR:
			case K_LANGUAGE:
			case K_OUTER:
			case K_SESSION:
			case K_VARCHAR:
			case K_CHAR2HEXINT:
			case K_ERRORFILES:
			case K_LE:
			case K_OVER:
			case K_SET:
			case K_VARGRAPHIC:
			case K_CHARACTER:
			case K_ERRORTABLES:
			case K_LEADING:
			case K_OVERLAPS:
			case K_SETRESRATE:
			case K_VARYING:
			case K_CHARACTERS:
			case K_ESCAPE:
			case K_LEAVE:
			case K_OVERRIDE:
			case K_SETSESSRATE:
			case K_VAR_POP:
			case K_CHARACTER_LENGTH:
			case K_ET:
			case K_LEFT:
			case K_PARAMETER:
			case K_SHOW:
			case K_VAR_SAMP:
			case K_CHARS:
			case K_EXCEPT:
			case K_LIKE:
			case K_PASSWORD:
			case K_SIMPLE:
			case K_VIEW:
			case K_CHAR_LENGTH:
			case K_EXEC:
			case K_LIMIT:
			case K_PERCENT:
			case K_SIN:
			case K_VOLATILE:
			case K_CHECK:
			case K_EXECUTE:
			case K_LN:
			case K_PERCENT_RANK:
			case K_SINH:
			case K_WAIT:
			case K_CHECKPOINT:
			case K_EXISTS:
			case K_LOADING:
			case K_PERM:
			case K_SKEW:
			case K_WHEN:
			case K_CLASS:
			case K_EXIT:
			case K_LOCAL:
			case K_PERMANENT:
			case K_SMALLINT:
			case K_WHERE:
			case K_CLOSE:
			case K_EXP:
			case K_LOCATOR:
			case K_POSITION:
			case K_SOME:
			case K_WHILE:
			case K_CLUSTER:
			case K_EXPLAIN:
			case K_LOCK:
			case K_PRECISION:
			case K_SOUNDEX:
			case K_WIDTH_BUCKET:
			case K_CM:
			case K_EXTERNAL:
			case K_LOCKING:
			case K_PREPARE:
			case K_SPECIFIC:
			case K_WITH:
			case K_COALESCE:
			case K_EXTRACT:
			case K_LOG:
			case K_PRESERVE:
			case K_SPOOL:
			case K_WITHOUT:
			case K_COLLATION:
			case K_FALLBACK:
			case K_LOGGING:
			case K_PRIMARY:
			case K_SQL:
			case K_WORK:
			case K_COLLECT:
			case K_FASTEXPORT:
			case K_LOGON:
			case K_PRIVATE:
			case K_SQLEXCEPTION:
			case K_YEAR:
			case K_COLUMN:
			case K_FETCH:
			case K_LONG:
			case K_PRIVILEGES:
			case K_SQLTEXT:
			case K_ZEROIFNULL:
			case K_COMMENT:
			case K_FIRST:
			case K_LOOP:
			case K_PROCEDURE:
			case K_SQLWARNING:
			case K_ZONE:
			case K_COMMIT:
			case K_FLOAT:
			case K_LOWER:
			case K_PROFILE:
			case K_SQRT:
			case K_COMPRESS:
			case K_FOR:
			case K_LT:
			case K_PROPORTIONAL:
			case K_SS:
			case K_CONSTRAINT:
			case K_FOREIGN:
			case K_MACRO:
			case K_PROTECTION:
			case K_START:
			case K_CONTINUE:
			case K_FORMAT:
			case K_MAVG:
			case K_PUBLIC:
			case K_STARTUP:
			case K_TOP:
			case K_TIES:
			case K_VALIDTIME:
			case K_TRANSACTIONTIME:
			case K_BIGINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(820);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(821);
				match(OPEN_PAR);
				setState(822);
				any_name();
				setState(823);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u01d4\u033e\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\5\2\u008d\n\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\6\4\u0097\n\4\r\4\16\4\u0098\3\5\3\5"+
		"\5\5\u009d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a5\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00ae\n\6\3\7\3\7\3\7\3\7\5\7\u00b4\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c0\n\7\3\7\5\7\u00c3\n\7\3\7\3\7\5\7\u00c7"+
		"\n\7\3\7\5\7\u00ca\n\7\3\7\5\7\u00cd\n\7\3\7\3\7\3\7\5\7\u00d2\n\7\3\7"+
		"\5\7\u00d5\n\7\3\7\3\7\3\7\3\7\5\7\u00db\n\7\3\7\3\7\3\7\3\7\5\7\u00e1"+
		"\n\7\5\7\u00e3\n\7\3\b\3\b\5\b\u00e7\n\b\3\b\3\b\3\t\5\t\u00ec\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00fb\n\t\3\t\3\t"+
		"\5\t\u00ff\n\t\3\t\3\t\5\t\u0103\n\t\3\n\3\n\5\n\u0107\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u0110\n\n\5\n\u0112\n\n\3\13\3\13\3\13\5\13\u0117"+
		"\n\13\3\13\3\13\5\13\u011b\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0125"+
		"\n\f\3\r\3\r\3\r\3\r\7\r\u012b\n\r\f\r\16\r\u012e\13\r\5\r\u0130\n\r\3"+
		"\16\3\16\5\16\u0134\n\16\3\16\5\16\u0137\n\16\3\16\3\16\3\16\3\16\5\16"+
		"\u013d\n\16\3\17\3\17\3\17\3\20\3\20\7\20\u0144\n\20\f\20\16\20\u0147"+
		"\13\20\3\21\3\21\3\21\3\21\5\21\u014d\n\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0154\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u015c\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0163\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u016b"+
		"\n\21\5\21\u016d\n\21\3\22\3\22\3\22\5\22\u0172\n\22\3\23\3\23\5\23\u0176"+
		"\n\23\3\23\5\23\u0179\n\23\3\23\5\23\u017c\n\23\3\24\3\24\3\24\5\24\u0181"+
		"\n\24\5\24\u0183\n\24\3\24\3\24\3\24\5\24\u0188\n\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u0192\n\24\3\25\3\25\3\25\3\25\5\25\u0198"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u019f\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u01a6\n\26\3\26\3\26\3\26\5\26\u01ab\n\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u01b2\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u01b9\n\27\3\27\3\27"+
		"\3\27\5\27\u01be\n\27\7\27\u01c0\n\27\f\27\16\27\u01c3\13\27\5\27\u01c5"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01d2"+
		"\n\30\5\30\u01d4\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\7\36\u01e6\n\36\f\36\16\36\u01e9\13\36"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u01f0\n\37\3 \3 \3 \7 \u01f5\n \f \16 "+
		"\u01f8\13 \3!\3!\3!\3!\5!\u01fe\n!\3\"\3\"\5\"\u0202\n\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u020f\n\"\3\"\5\"\u0212\n\"\3\"\3\""+
		"\3\"\3\"\5\"\u0218\n\"\5\"\u021a\n\"\5\"\u021c\n\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\5#\u0227\n#\3#\3#\3#\7#\u022c\n#\f#\16#\u022f\13#\3#\5#\u0232"+
		"\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0243\n#\3#\3#\3#"+
		"\3#\3#\6#\u024a\n#\r#\16#\u024b\3#\3#\5#\u0250\n#\3#\3#\5#\u0254\n#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u026c"+
		"\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0278\n#\3#\3#\3#\5#\u027d\n#\3#"+
		"\3#\3#\3#\3#\3#\3#\5#\u0286\n#\3#\3#\3#\3#\5#\u028c\n#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\5#\u0296\n#\3#\3#\5#\u029a\n#\3#\3#\3#\3#\3#\3#\7#\u02a2\n#"+
		"\f#\16#\u02a5\13#\5#\u02a7\n#\3#\3#\3#\3#\3#\5#\u02ae\n#\3#\5#\u02b1\n"+
		"#\7#\u02b3\n#\f#\16#\u02b6\13#\3$\3$\3$\7$\u02bb\n$\f$\16$\u02be\13$\3"+
		"%\3%\3%\5%\u02c3\n%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3.\7.\u02d9\n.\f.\16.\u02dc\13.\3/\5/\u02df\n/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u02ec\n\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\58\u02fd\n"+
		"8\38\38\58\u0301\n8\39\59\u0304\n9\39\39\3:\5:\u0309\n:\3:\3:\3;\3;\5"+
		";\u030f\n;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\5@\u031c\n@\3@\3@\3A\3A\3"+
		"A\5A\u0323\nA\3A\3A\3B\3B\3C\3C\3C\6C\u032c\nC\rC\16C\u032d\3C\5C\u0331"+
		"\nC\3D\3D\3E\3E\3E\3E\3E\3E\3E\5E\u033c\nE\3E\2\3DF\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\2\17\4\2\u0139\u0139\u013f\u013f"+
		"\4\2\u0093\u0093\u00d6\u00d6\4\2\u00e9\u00e9\u00ef\u00ef\3\2\u01cc\u01cd"+
		"\5\2//\u00eb\u00eb\u015b\u015b\4\2ii\u00f4\u00f4\4\2\t\t\16\17\3\2\n\13"+
		"\3\2\24\27\4\2\n\f\u00d2\u00d2\3\2\33\u01c5\5\2\7\7\u01cc\u01cc\u01d0"+
		"\u01d0\24\2||\u0098\u0098\u009a\u009a\u009e\u009e\u00ac\u00ac\u00b2\u00b2"+
		"\u00ed\u00ed\u00f0\u00f0\u00fb\u00fb\u0100\u0101\u010b\u010b\u0111\u0111"+
		"\u0140\u0141\u0146\u0146\u014d\u014d\u017b\u017b\u01ae\u01ae\u01c5\u01c5"+
		"\u0398\2\u008c\3\2\2\2\4\u0090\3\2\2\2\6\u0096\3\2\2\2\b\u009c\3\2\2\2"+
		"\n\u00ad\3\2\2\2\f\u00af\3\2\2\2\16\u00e4\3\2\2\2\20\u0102\3\2\2\2\22"+
		"\u0104\3\2\2\2\24\u0113\3\2\2\2\26\u0124\3\2\2\2\30\u012f\3\2\2\2\32\u013c"+
		"\3\2\2\2\34\u013e\3\2\2\2\36\u0141\3\2\2\2 \u016c\3\2\2\2\"\u0171\3\2"+
		"\2\2$\u0173\3\2\2\2&\u0191\3\2\2\2(\u0193\3\2\2\2*\u01a0\3\2\2\2,\u01b3"+
		"\3\2\2\2.\u01d3\3\2\2\2\60\u01d5\3\2\2\2\62\u01d8\3\2\2\2\64\u01db\3\2"+
		"\2\2\66\u01de\3\2\2\28\u01e0\3\2\2\2:\u01e2\3\2\2\2<\u01ef\3\2\2\2>\u01f1"+
		"\3\2\2\2@\u01fd\3\2\2\2B\u021b\3\2\2\2D\u0253\3\2\2\2F\u02b7\3\2\2\2H"+
		"\u02c2\3\2\2\2J\u02c4\3\2\2\2L\u02c7\3\2\2\2N\u02c9\3\2\2\2P\u02cb\3\2"+
		"\2\2R\u02cd\3\2\2\2T\u02cf\3\2\2\2V\u02d1\3\2\2\2X\u02d3\3\2\2\2Z\u02d5"+
		"\3\2\2\2\\\u02de\3\2\2\2^\u02eb\3\2\2\2`\u02ed\3\2\2\2b\u02ef\3\2\2\2"+
		"d\u02f1\3\2\2\2f\u02f3\3\2\2\2h\u02f5\3\2\2\2j\u02f7\3\2\2\2l\u02f9\3"+
		"\2\2\2n\u0300\3\2\2\2p\u0303\3\2\2\2r\u0308\3\2\2\2t\u030e\3\2\2\2v\u0310"+
		"\3\2\2\2x\u0312\3\2\2\2z\u0314\3\2\2\2|\u0316\3\2\2\2~\u031b\3\2\2\2\u0080"+
		"\u0322\3\2\2\2\u0082\u0326\3\2\2\2\u0084\u0328\3\2\2\2\u0086\u0332\3\2"+
		"\2\2\u0088\u033b\3\2\2\2\u008a\u008d\5\6\4\2\u008b\u008d\5\4\3\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\2"+
		"\2\3\u008f\3\3\2\2\2\u0090\u0091\7\u01d4\2\2\u0091\u0092\b\3\1\2\u0092"+
		"\5\3\2\2\2\u0093\u0094\5\b\5\2\u0094\u0095\7\3\2\2\u0095\u0097\3\2\2\2"+
		"\u0096\u0093\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\7\3\2\2\2\u009a\u009d\5\n\6\2\u009b\u009d\5\16\b\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\t\3\2\2\2\u009e\u009f\7\u018e"+
		"\2\2\u009f\u00a4\5d\63\2\u00a0\u00a1\7\5\2\2\u00a1\u00a2\5Z.\2\u00a2\u00a3"+
		"\7\6\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\7\u008d\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9"+
		"\5\f\7\2\u00a9\u00aa\7\6\2\2\u00aa\u00ab\5\f\7\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00ae\5\f\7\2\u00ad\u009e\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\13\3\2\2"+
		"\2\u00af\u00c2\t\2\2\2\u00b0\u00b4\7\u00f4\2\2\u00b1\u00b4\7i\2\2\u00b2"+
		"\u00b4\5.\30\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2"+
		"\2\2\u00b4\u00bf\3\2\2\2\u00b5\u00b6\5~@\2\u00b6\u00b7\7\4\2\2\u00b7\u00b8"+
		"\7\t\2\2\u00b8\u00b9\7\4\2\2\u00b9\u00ba\7i\2\2\u00ba\u00c0\3\2\2\2\u00bb"+
		"\u00bc\5\u0080A\2\u00bc\u00bd\7\4\2\2\u00bd\u00be\7i\2\2\u00be\u00c0\3"+
		"\2\2\2\u00bf\u00b5\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00c3\5\24\13\2\u00c2\u00b3\3\2\2\2\u00c2\u00c1\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\5\30\r\2\u00c5"+
		"\u00c7\5\34\17\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3"+
		"\2\2\2\u00c8\u00ca\5,\27\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00cd\5\60\31\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3"+
		"\2\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7\u0105\2\2"+
		"\u00d0\u00d2\5:\36\2\u00d1\u00ce\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4"+
		"\3\2\2\2\u00d3\u00d5\5\26\f\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2"+
		"\u00d5\u00e2\3\2\2\2\u00d6\u00d7\7\u0138\2\2\u00d7\u00d8\7\u0105\2\2\u00d8"+
		"\u00da\5> \2\u00d9\u00db\t\3\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2"+
		"\2\u00db\u00e0\3\2\2\2\u00dc\u00dd\7\u01c9\2\2\u00dd\u00e1\7\u01a8\2\2"+
		"\u00de\u00df\7\u01c9\2\2\u00df\u00e1\7\u01c8\2\2\u00e0\u00dc\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d6\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\r\3\2\2\2\u00e4\u00e6\t\4\2\2\u00e5\u00e7"+
		"\7\u0119\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2"+
		"\2\u00e8\u00e9\5~@\2\u00e9\17\3\2\2\2\u00ea\u00ec\7\u013a\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7\5\2\2\u00ee"+
		"\u00ef\5F$\2\u00ef\u00f0\7\6\2\2\u00f0\u0103\3\2\2\2\u00f1\u00f2\7\5\2"+
		"\2\u00f2\u00f3\5Z.\2\u00f3\u00f4\7\6\2\2\u00f4\u00f5\7\u013a\2\2\u00f5"+
		"\u00f6\7\5\2\2\u00f6\u00f7\5F$\2\u00f7\u00f8\7\6\2\2\u00f8\u0103\3\2\2"+
		"\2\u00f9\u00fb\5Z.\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fe\5T+\2\u00fd\u00ff\5\22\n\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0103\3\2\2\2\u0100\u0101\7\u00be\2\2\u0101\u0103"+
		"\7\u013a\2\2\u0102\u00eb\3\2\2\2\u0102\u00f1\3\2\2\2\u0102\u00fa\3\2\2"+
		"\2\u0102\u0100\3\2\2\2\u0103\21\3\2\2\2\u0104\u0106\7\u0197\2\2\u0105"+
		"\u0107\7i\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u0111\7\u01ca\2\2\u0109\u010f\7\u018e\2\2\u010a\u010b\7\u00c6"+
		"\2\2\u010b\u0110\7\u0167\2\2\u010c\u010d\7\u0167\2\2\u010d\u010e\7\u0102"+
		"\2\2\u010e\u0110\7\u01cb\2\2\u010f\u010a\3\2\2\2\u010f\u010c\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u0109\3\2\2\2\u0111\u0112\3\2\2\2\u0112\23\3\2\2"+
		"\2\u0113\u0114\7\u01c1\2\2\u0114\u0116\t\5\2\2\u0115\u0117\7\u0168\2\2"+
		"\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0119"+
		"\7\u018e\2\2\u0119\u011b\7\u01c2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3"+
		"\2\2\2\u011b\25\3\2\2\2\u011c\u0125\5\62\32\2\u011d\u0125\5\64\33\2\u011e"+
		"\u011f\5\62\32\2\u011f\u0120\5\64\33\2\u0120\u0125\3\2\2\2\u0121\u0122"+
		"\5\64\33\2\u0122\u0123\5\62\32\2\u0123\u0125\3\2\2\2\u0124\u011c\3\2\2"+
		"\2\u0124\u011d\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u0121\3\2\2\2\u0125\27"+
		"\3\2\2\2\u0126\u0130\7\t\2\2\u0127\u012c\5\32\16\2\u0128\u0129\7\7\2\2"+
		"\u0129\u012b\5\32\16\2\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012f"+
		"\u0126\3\2\2\2\u012f\u0127\3\2\2\2\u0130\31\3\2\2\2\u0131\u0136\5D#\2"+
		"\u0132\u0134\7\u008d\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0137\5f\64\2\u0136\u0133\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u013d\3\2\2\2\u0138\u0139\5~@\2\u0139\u013a\7\4\2\2\u013a\u013b"+
		"\7\t\2\2\u013b\u013d\3\2\2\2\u013c\u0131\3\2\2\2\u013c\u0138\3\2\2\2\u013d"+
		"\33\3\2\2\2\u013e\u013f\7)\2\2\u013f\u0140\5\36\20\2\u0140\35\3\2\2\2"+
		"\u0141\u0145\5\"\22\2\u0142\u0144\5&\24\2\u0143\u0142\3\2\2\2\u0144\u0147"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\37\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0148\u0149\7\u008d\2\2\u0149\u014c\7\u0102\2\2\u014a\u014d"+
		"\5n8\2\u014b\u014d\5p9\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u016d\3\2\2\2\u014e\u014f\7\u01c3\2\2\u014f\u0150"+
		"\7\u008d\2\2\u0150\u0153\7\u0102\2\2\u0151\u0154\5n8\2\u0152\u0154\5p"+
		"9\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0156\7{\2\2\u0156\u0157\7\u01c4\2\2\u0157\u0158"+
		"\7\u008d\2\2\u0158\u015b\7\u0102\2\2\u0159\u015c\5n8\2\u015a\u015c\5p"+
		"9\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u016d\3\2\2\2\u015d\u015e\7\u01c4\2\2\u015e\u015f\7\u008d\2\2\u015f\u0162"+
		"\7\u0102\2\2\u0160\u0163\5n8\2\u0161\u0163\5p9\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7{"+
		"\2\2\u0165\u0166\7\u01c3\2\2\u0166\u0167\7\u008d\2\2\u0167\u016a\7\u0102"+
		"\2\2\u0168\u016b\5n8\2\u0169\u016b\5p9\2\u016a\u0168\3\2\2\2\u016a\u0169"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u0148\3\2\2\2\u016c"+
		"\u014e\3\2\2\2\u016c\u015d\3\2\2\2\u016d!\3\2\2\2\u016e\u0172\5$\23\2"+
		"\u016f\u0172\5(\25\2\u0170\u0172\5*\26\2\u0171\u016e\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0171\u0170\3\2\2\2\u0172#\3\2\2\2\u0173\u0175\5~@\2\u0174\u0176"+
		"\5 \21\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017b\3\2\2\2\u0177"+
		"\u0179\7\u008d\2\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017c\5\u0082B\2\u017b\u0178\3\2\2\2\u017b\u017c\3\2\2"+
		"\2\u017c%\3\2\2\2\u017d\u0183\7\u00d7\2\2\u017e\u0180\t\6\2\2\u017f\u0181"+
		"\7\u0144\2\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2"+
		"\2\u0182\u017d\3\2\2\2\u0182\u017e\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185"+
		"\7\u012b\2\2\u0185\u0187\5\"\22\2\u0186\u0188\5 \21\2\u0187\u0186\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\7\u011a\2\2\u018a"+
		"\u018b\5V,\2\u018b\u0192\3\2\2\2\u018c\u018d\7L\2\2\u018d\u018e\7\u012b"+
		"\2\2\u018e\u0192\5\"\22\2\u018f\u0190\7\7\2\2\u0190\u0192\5\"\22\2\u0191"+
		"\u0182\3\2\2\2\u0191\u018c\3\2\2\2\u0191\u018f\3\2\2\2\u0192\'\3\2\2\2"+
		"\u0193\u0194\7\5\2\2\u0194\u0195\5T+\2\u0195\u0197\7\6\2\2\u0196\u0198"+
		"\7\u008d\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2"+
		"\2\u0199\u019e\5l\67\2\u019a\u019b\7\5\2\2\u019b\u019c\5Z.\2\u019c\u019d"+
		"\7\6\2\2\u019d\u019f\3\2\2\2\u019e\u019a\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		")\3\2\2\2\u01a0\u01a1\7h\2\2\u01a1\u01a2\7\5\2\2\u01a2\u01a3\5z>\2\u01a3"+
		"\u01a5\7\5\2\2\u01a4\u01a6\5F$\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2"+
		"\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\7\6\2\2\u01a8\u01aa\7\6\2\2\u01a9\u01ab"+
		"\7\u008d\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2"+
		"\2\u01ac\u01b1\5l\67\2\u01ad\u01ae\7\5\2\2\u01ae\u01af\5Z.\2\u01af\u01b0"+
		"\7\6\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"+\3\2\2\2\u01b3\u01b4\7\u018e\2\2\u01b4\u01c4\5F$\2\u01b5\u01b6\7\u0105"+
		"\2\2\u01b6\u01b8\5D#\2\u01b7\u01b9\t\3\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01c1\3\2\2\2\u01ba\u01bb\7\7\2\2\u01bb\u01bd\5D#\2\u01bc"+
		"\u01be\t\3\2\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2"+
		"\2\2\u01bf\u01ba\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01b5\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5-\3\2\2\2\u01c6\u01d4\7\u01c6\2\2\u01c7"+
		"\u01c8\7\u01c6\2\2\u01c8\u01c9\7\u011a\2\2\u01c9\u01ca\7\u01c7\2\2\u01ca"+
		"\u01cb\7\u0132\2\2\u01cb\u01d4\7\u0150\2\2\u01cc\u01cd\7\u01c6\2\2\u01cd"+
		"\u01ce\7\u011a\2\2\u01ce\u01d1\7\u0150\2\2\u01cf\u01d0\7\u0132\2\2\u01d0"+
		"\u01d2\7\u01c7\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4"+
		"\3\2\2\2\u01d3\u01c6\3\2\2\2\u01d3\u01c7\3\2\2\2\u01d3\u01cc\3\2\2\2\u01d4"+
		"/\3\2\2\2\u01d5\u01d6\7\u017c\2\2\u01d6\u01d7\5V,\2\u01d7\61\3\2\2\2\u01d8"+
		"\u01d9\7\u0095\2\2\u01d9\u01da\5X-\2\u01da\63\3\2\2\2\u01db\u01dc\7%\2"+
		"\2\u01dc\u01dd\5V,\2\u01dd\65\3\2\2\2\u01de\u01df\3\2\2\2\u01df\67\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e19\3\2\2\2\u01e2\u01e7\5<\37\2\u01e3\u01e4"+
		"\7\7\2\2\u01e4\u01e6\5<\37\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8;\3\2\2\2\u01e9\u01e7\3\2\2\2"+
		"\u01ea\u01f0\5H%\2\u01eb\u01f0\5J&\2\u01ec\u01f0\5L\'\2\u01ed\u01f0\5"+
		"N(\2\u01ee\u01f0\5P)\2\u01ef\u01ea\3\2\2\2\u01ef\u01eb\3\2\2\2\u01ef\u01ec"+
		"\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0=\3\2\2\2\u01f1"+
		"\u01f6\5@!\2\u01f2\u01f3\7\7\2\2\u01f3\u01f5\5@!\2\u01f4\u01f2\3\2\2\2"+
		"\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7?\3"+
		"\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fe\5D#\2\u01fa\u01fe\5\u0080A\2\u01fb"+
		"\u01fe\5b\62\2\u01fc\u01fe\5R*\2\u01fd\u01f9\3\2\2\2\u01fd\u01fa\3\2\2"+
		"\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01feA\3\2\2\2\u01ff\u0201"+
		"\t\2\2\2\u0200\u0202\t\7\2\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0204\5\30\r\2\u0204\u0205\7)\2\2\u0205\u0206\5$"+
		"\23\2\u0206\u021c\3\2\2\2\u0207\u021c\5&\24\2\u0208\u0209\5(\25\2\u0209"+
		"\u020a\7\u017c\2\2\u020a\u020e\5V,\2\u020b\u020c\7e\2\2\u020c\u020d\7"+
		"\u0105\2\2\u020d\u020f\5:\36\2\u020e\u020b\3\2\2\2\u020e\u020f\3\2\2\2"+
		"\u020f\u0211\3\2\2\2\u0210\u0212\5\26\f\2\u0211\u0210\3\2\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0219\3\2\2\2\u0213\u0214\7\u0138\2\2\u0214\u0215\7\u0105"+
		"\2\2\u0215\u0217\5> \2\u0216\u0218\t\3\2\2\u0217\u0216\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0213\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021c\3\2\2\2\u021b\u01ff\3\2\2\2\u021b\u0207\3\2\2\2\u021b\u0208\3\2"+
		"\2\2\u021cC\3\2\2\2\u021d\u021e\b#\1\2\u021e\u0254\5^\60\2\u021f\u0254"+
		"\5\u0080A\2\u0220\u0221\5`\61\2\u0221\u0222\5D#\23\u0222\u0254\3\2\2\2"+
		"\u0223\u0224\5z>\2\u0224\u0231\7\5\2\2\u0225\u0227\7\u00f4\2\2\u0226\u0225"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022d\5D#\2\u0229"+
		"\u022a\7\7\2\2\u022a\u022c\5D#\2\u022b\u0229\3\2\2\2\u022c\u022f\3\2\2"+
		"\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0232\3\2\2\2\u022f\u022d"+
		"\3\2\2\2\u0230\u0232\7\t\2\2\u0231\u0226\3\2\2\2\u0231\u0230\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\7\6\2\2\u0234\u0254\3\2"+
		"\2\2\u0235\u0236\7\5\2\2\u0236\u0237\5D#\2\u0237\u0238\7\6\2\2\u0238\u0254"+
		"\3\2\2\2\u0239\u023a\7\u0135\2\2\u023a\u023b\7\5\2\2\u023b\u023c\5D#\2"+
		"\u023c\u023d\7\u008d\2\2\u023d\u023e\5\u0084C\2\u023e\u023f\7\6\2\2\u023f"+
		"\u0254\3\2\2\2\u0240\u0242\7\u0123\2\2\u0241\u0243\5D#\2\u0242\u0241\3"+
		"\2\2\2\u0242\u0243\3\2\2\2\u0243\u0249\3\2\2\2\u0244\u0245\7\u0176\2\2"+
		"\u0245\u0246\5D#\2\u0246\u0247\7\u008c\2\2\u0247\u0248\5D#\2\u0248\u024a"+
		"\3\2\2\2\u0249\u0244\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u0249\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024e\7\u0124\2\2\u024e\u0250"+
		"\5D#\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0252\7\u0136\2\2\u0252\u0254\3\2\2\2\u0253\u021d\3\2\2\2\u0253\u021f"+
		"\3\2\2\2\u0253\u0220\3\2\2\2\u0253\u0223\3\2\2\2\u0253\u0235\3\2\2\2\u0253"+
		"\u0239\3\2\2\2\u0253\u0240\3\2\2\2\u0254\u02b4\3\2\2\2\u0255\u0256\f\22"+
		"\2\2\u0256\u0257\7\r\2\2\u0257\u02b3\5D#\23\u0258\u0259\f\21\2\2\u0259"+
		"\u025a\t\b\2\2\u025a\u02b3\5D#\22\u025b\u025c\f\20\2\2\u025c\u025d\t\t"+
		"\2\2\u025d\u02b3\5D#\21\u025e\u025f\f\17\2\2\u025f\u0260\t\n\2\2\u0260"+
		"\u02b3\5D#\20\u0261\u026b\f\16\2\2\u0262\u026c\7\b\2\2\u0263\u026c\7\30"+
		"\2\2\u0264\u026c\7\31\2\2\u0265\u026c\7\32\2\2\u0266\u026c\7\u011f\2\2"+
		"\u0267\u0268\7\u011f\2\2\u0268\u026c\7\u00d2\2\2\u0269\u026c\7\u00b9\2"+
		"\2\u026a\u026c\7\u0161\2\2\u026b\u0262\3\2\2\2\u026b\u0263\3\2\2\2\u026b"+
		"\u0264\3\2\2\2\u026b\u0265\3\2\2\2\u026b\u0266\3\2\2\2\u026b\u0267\3\2"+
		"\2\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u02b3\5D#\17\u026e\u026f\f\r\2\2\u026f\u0270\7{\2\2\u0270\u02b3\5D#\16"+
		"\u0271\u0272\f\f\2\2\u0272\u0273\7\u0132\2\2\u0273\u02b3\5D#\r\u0274\u0275"+
		"\f\6\2\2\u0275\u0277\7\u011f\2\2\u0276\u0278\7\u00d2\2\2\u0277\u0276\3"+
		"\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u02b3\5D#\7\u027a"+
		"\u027c\f\5\2\2\u027b\u027d\7\u00d2\2\2\u027c\u027b\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\7\u00e7\2\2\u027f\u0280\5D#\2"+
		"\u0280\u0281\7{\2\2\u0281\u0282\5D#\6\u0282\u02b3\3\2\2\2\u0283\u0285"+
		"\f\b\2\2\u0284\u0286\7\u00d2\2\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2"+
		"\2\u0286\u0287\3\2\2\2\u0287\u0288\7\u0161\2\2\u0288\u028b\5D#\2\u0289"+
		"\u028a\7\u0154\2\2\u028a\u028c\5D#\2\u028b\u0289\3\2\2\2\u028b\u028c\3"+
		"\2\2\2\u028c\u02b3\3\2\2\2\u028d\u0295\f\7\2\2\u028e\u028f\7\u011f\2\2"+
		"\u028f\u0296\7\u00de\2\2\u0290\u0291\7\u011f\2\2\u0291\u0292\7\u00d2\2"+
		"\2\u0292\u0296\7\u00de\2\2\u0293\u0294\7\u00d2\2\2\u0294\u0296\7\u00de"+
		"\2\2\u0295\u028e\3\2\2\2\u0295\u0290\3\2\2\2\u0295\u0293\3\2\2\2\u0296"+
		"\u02b3\3\2\2\2\u0297\u0299\f\4\2\2\u0298\u029a\7\u00d2\2\2\u0299\u0298"+
		"\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u02b0\7\u00b9\2"+
		"\2\u029c\u02a6\7\5\2\2\u029d\u02a7\5T+\2\u029e\u02a3\5D#\2\u029f\u02a0"+
		"\7\7\2\2\u02a0\u02a2\5D#\2\u02a1\u029f\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3"+
		"\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2"+
		"\2\2\u02a6\u029d\3\2\2\2\u02a6\u029e\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8"+
		"\u02a9\7\6\2\2\u02a9\u02b1\3\2\2\2\u02aa\u02ab\5|?\2\u02ab\u02ac\7\4\2"+
		"\2\u02ac\u02ae\3\2\2\2\u02ad\u02aa\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af"+
		"\3\2\2\2\u02af\u02b1\5~@\2\u02b0\u029c\3\2\2\2\u02b0\u02ad\3\2\2\2\u02b1"+
		"\u02b3\3\2\2\2\u02b2\u0255\3\2\2\2\u02b2\u0258\3\2\2\2\u02b2\u025b\3\2"+
		"\2\2\u02b2\u025e\3\2\2\2\u02b2\u0261\3\2\2\2\u02b2\u026e\3\2\2\2\u02b2"+
		"\u0271\3\2\2\2\u02b2\u0274\3\2\2\2\u02b2\u027a\3\2\2\2\u02b2\u0283\3\2"+
		"\2\2\u02b2\u028d\3\2\2\2\u02b2\u0297\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4"+
		"\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5E\3\2\2\2\u02b6\u02b4\3\2\2\2"+
		"\u02b7\u02bc\5D#\2\u02b8\u02b9\7\7\2\2\u02b9\u02bb\5D#\2\u02ba\u02b8\3"+
		"\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"G\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c3\5\u0080A\2\u02c0\u02c3\5R*\2"+
		"\u02c1\u02c3\5D#\2\u02c2\u02bf\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c1"+
		"\3\2\2\2\u02c3I\3\2\2\2\u02c4\u02c5\7\5\2\2\u02c5\u02c6\7\6\2\2\u02c6"+
		"K\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8M\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"O\3\2\2\2\u02cb\u02cc\3\2\2\2\u02ccQ\3\2\2\2\u02cd\u02ce\7\u01cc\2\2\u02ce"+
		"S\3\2\2\2\u02cf\u02d0\5\f\7\2\u02d0U\3\2\2\2\u02d1\u02d2\5D#\2\u02d2W"+
		"\3\2\2\2\u02d3\u02d4\5D#\2\u02d4Y\3\2\2\2\u02d5\u02da\5\u0080A\2\u02d6"+
		"\u02d7\7\7\2\2\u02d7\u02d9\5\u0080A\2\u02d8\u02d6\3\2\2\2\u02d9\u02dc"+
		"\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db[\3\2\2\2\u02dc"+
		"\u02da\3\2\2\2\u02dd\u02df\t\t\2\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2"+
		"\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\7\u01cb\2\2\u02e1]\3\2\2\2\u02e2"+
		"\u02ec\7\u01cb\2\2\u02e3\u02ec\7\u01d0\2\2\u02e4\u02ec\7\u00de\2\2\u02e5"+
		"\u02ec\7p\2\2\u02e6\u02ec\7j\2\2\u02e7\u02ec\7v\2\2\u02e8\u02ec\5n8\2"+
		"\u02e9\u02ec\5r:\2\u02ea\u02ec\5p9\2\u02eb\u02e2\3\2\2\2\u02eb\u02e3\3"+
		"\2\2\2\u02eb\u02e4\3\2\2\2\u02eb\u02e5\3\2\2\2\u02eb\u02e6\3\2\2\2\u02eb"+
		"\u02e7\3\2\2\2\u02eb\u02e8\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ea\3\2"+
		"\2\2\u02ec_\3\2\2\2\u02ed\u02ee\t\13\2\2\u02eea\3\2\2\2\u02ef\u02f0\7"+
		"\u01cf\2\2\u02f0c\3\2\2\2\u02f1\u02f2\7\u01cf\2\2\u02f2e\3\2\2\2\u02f3"+
		"\u02f4\7\u01cf\2\2\u02f4g\3\2\2\2\u02f5\u02f6\5~@\2\u02f6i\3\2\2\2\u02f7"+
		"\u02f8\5~@\2\u02f8k\3\2\2\2\u02f9\u02fa\5~@\2\u02fam\3\2\2\2\u02fb\u02fd"+
		"\7\u009a\2\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2"+
		"\2\u02fe\u0301\7\u01d0\2\2\u02ff\u0301\7\u009a\2\2\u0300\u02fc\3\2\2\2"+
		"\u0300\u02ff\3\2\2\2\u0301o\3\2\2\2\u0302\u0304\7\u009e\2\2\u0303\u0302"+
		"\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306\7\u01d0\2"+
		"\2\u0306q\3\2\2\2\u0307\u0309\7\u0098\2\2\u0308\u0307\3\2\2\2\u0308\u0309"+
		"\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\7\u01d0\2\2\u030bs\3\2\2\2\u030c"+
		"\u030f\5p9\2\u030d\u030f\5n8\2\u030e\u030c\3\2\2\2\u030e\u030d\3\2\2\2"+
		"\u030fu\3\2\2\2\u0310\u0311\t\f\2\2\u0311w\3\2\2\2\u0312\u0313\5\u0088"+
		"E\2\u0313y\3\2\2\2\u0314\u0315\7\u01cf\2\2\u0315{\3\2\2\2\u0316\u0317"+
		"\7\u01cf\2\2\u0317}\3\2\2\2\u0318\u0319\5|?\2\u0319\u031a\7\4\2\2\u031a"+
		"\u031c\3\2\2\2\u031b\u0318\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\3\2"+
		"\2\2\u031d\u031e\7\u01cf\2\2\u031e\177\3\2\2\2\u031f\u0320\5~@\2\u0320"+
		"\u0321\7\4\2\2\u0321\u0323\3\2\2\2\u0322\u031f\3\2\2\2\u0322\u0323\3\2"+
		"\2\2\u0323\u0324\3\2\2\2\u0324\u0325\7\u01cf\2\2\u0325\u0081\3\2\2\2\u0326"+
		"\u0327\7\u01cf\2\2\u0327\u0083\3\2\2\2\u0328\u0330\5\u0086D\2\u0329\u032b"+
		"\7\5\2\2\u032a\u032c\t\r\2\2\u032b\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
		"\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331\7\6"+
		"\2\2\u0330\u0329\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0085\3\2\2\2\u0332"+
		"\u0333\t\16\2\2\u0333\u0087\3\2\2\2\u0334\u033c\7\u01cf\2\2\u0335\u033c"+
		"\5v<\2\u0336\u033c\7\u01d0\2\2\u0337\u0338\7\5\2\2\u0338\u0339\5\u0088"+
		"E\2\u0339\u033a\7\6\2\2\u033a\u033c\3\2\2\2\u033b\u0334\3\2\2\2\u033b"+
		"\u0335\3\2\2\2\u033b\u0336\3\2\2\2\u033b\u0337\3\2\2\2\u033c\u0089\3\2"+
		"\2\2i\u008c\u0098\u009c\u00a4\u00ad\u00b3\u00bf\u00c2\u00c6\u00c9\u00cc"+
		"\u00d1\u00d4\u00da\u00e0\u00e2\u00e6\u00eb\u00fa\u00fe\u0102\u0106\u010f"+
		"\u0111\u0116\u011a\u0124\u012c\u012f\u0133\u0136\u013c\u0145\u014c\u0153"+
		"\u015b\u0162\u016a\u016c\u0171\u0175\u0178\u017b\u0180\u0182\u0187\u0191"+
		"\u0197\u019e\u01a5\u01aa\u01b1\u01b8\u01bd\u01c1\u01c4\u01d1\u01d3\u01e7"+
		"\u01ef\u01f6\u01fd\u0201\u020e\u0211\u0217\u0219\u021b\u0226\u022d\u0231"+
		"\u0242\u024b\u024f\u0253\u026b\u0277\u027c\u0285\u028b\u0295\u0299\u02a3"+
		"\u02a6\u02ad\u02b0\u02b2\u02b4\u02bc\u02c2\u02da\u02de\u02eb\u02fc\u0300"+
		"\u0303\u0308\u030e\u031b\u0322\u032d\u0330\u033b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}