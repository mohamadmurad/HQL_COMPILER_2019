// Generated from C:/Users/MouAz He/IdeaProjects/HQL_COMPILER_2019\Hplsql.g4 by ANTLR 4.7.2
package antGen;

    import AST.*;
    import TypeArray.*;
    import java.io.IOException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HplsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T_ACTION=2, T_ADD2=3, T_ALL=4, T_ALLOCATE=5, T_ALTER=6, T_AND=7, 
		T_ANSI_NULLS=8, T_ANSI_PADDING=9, T_AS=10, T_ASC=11, T_ASSOCIATE=12, T_AT=13, 
		T_AUTO_INCREMENT=14, T_AVG=15, T_BATCHSIZE=16, T_BEGIN=17, T_BETWEEN=18, 
		T_BIGINT=19, T_BINARY_DOUBLE=20, T_BINARY_FLOAT=21, T_BINARY_INTEGER=22, 
		T_BIT=23, T_BODY=24, T_BREAK=25, T_BY=26, T_BYTE=27, T_CALL=28, T_CALLER=29, 
		T_CASCADE=30, T_CASE=31, T_CASESPECIFIC=32, T_CAST=33, T_CHAR=34, T_CHARACTER=35, 
		T_CHARSET=36, T_CLIENT=37, T_CLOSE=38, T_CLUSTERED=39, T_CMP=40, T_COLLECT=41, 
		T_COLLECTION=42, T_COLUMN=43, T_COMMENT=44, T_CONSTANT=45, T_COMMIT=46, 
		T_COMPRESS=47, T_CONCAT=48, T_CONDITION=49, T_CONSTRAINT=50, T_CONTINUE=51, 
		T_COPY=52, T_COUNT=53, T_COUNT_BIG=54, T_CREATE=55, T_CREATION=56, T_CREATOR=57, 
		T_CS=58, T_CURRENT=59, T_CURRENT_SCHEMA=60, T_CURSOR=61, T_DATABASE=62, 
		T_DATA=63, T_DATE=64, T_DATETIME=65, T_DAY=66, T_DAYS=67, T_DEC=68, T_DECIMAL=69, 
		T_DECLARE=70, T_DEFAULT=71, T_DEFERRED=72, T_DEFINED=73, T_DEFINER=74, 
		T_DEFINITION=75, T_DELETE=76, T_DELIMITED=77, T_DELIMITER=78, T_DESC=79, 
		T_DESCRIBE=80, T_DIAGNOSTICS=81, T_DIR=82, T_DIRECTORY=83, T_DISTINCT=84, 
		T_DISTRIBUTE=85, T_DO=86, T_DOUBLE=87, T_DROP=88, T_DYNAMIC=89, T_ELSE=90, 
		T_ELSEIF=91, T_ELSIF=92, T_ENABLE=93, T_END=94, T_ENGINE=95, T_ESCAPED=96, 
		T_EXCEPT=97, T_EXEC=98, T_EXECUTE=99, T_EXCEPTION=100, T_EXCLUSIVE=101, 
		T_EXISTS=102, T_EXIT=103, T_FALLBACK=104, T_FALSE=105, T_FETCH=106, T_FIELDS=107, 
		T_FILE=108, T_FILES=109, T_FOR=110, T_FOREIGN=111, T_FORMAT=112, T_FOUND=113, 
		T_FROM=114, T_FULL=115, T_FUNCTION=116, T_GET=117, T_GLOBAL=118, T_GO=119, 
		T_GRANT=120, T_GROUP=121, T_HANDLER=122, T_HASH=123, T_HAVING=124, T_HDFS=125, 
		T_HIVE=126, T_HOST=127, T_IDENTITY=128, T_IF=129, T_IGNORE=130, T_IMMEDIATE=131, 
		T_IN=132, T_INCLUDE=133, T_INDEX=134, T_INITRANS=135, T_INNER=136, T_INOUT=137, 
		T_INSERT=138, T_INT2=139, T_INT4=140, T_INT8=141, T_INTEGER=142, T_INTERSECT=143, 
		T_INTERVAL=144, T_INTO=145, T_INVOKER=146, T_IS=147, T_ISOPEN=148, T_ITEMS=149, 
		T_JOIN=150, T_KEEP=151, T_KEY=152, T_KEYS=153, T_LANGUAGE=154, T_LEAVE=155, 
		T_LEFT=156, T_LIKE=157, T_LIMIT=158, T_LINES=159, T_LOCAL=160, T_LOCATION=161, 
		T_LOCATOR=162, T_LOCATORS=163, T_LOCKS=164, T_LOG=165, T_LOGGED=166, T_LOGGING=167, 
		T_LOOP=168, T_MAP=169, T_MATCHED=170, T_MAX=171, T_MAXTRANS=172, T_MERGE=173, 
		T_MESSAGE_TEXT=174, T_MICROSECOND=175, T_MICROSECONDS=176, T_MIN=177, 
		T_MULTISET=178, T_NCHAR=179, T_NEW=180, T_NVARCHAR=181, T_NO=182, T_NOCOUNT=183, 
		T_NOCOMPRESS=184, T_NOLOGGING=185, T_NONE=186, T_NOT=187, T_NOTFOUND=188, 
		T_NULL=189, T_NUMERIC=190, T_NUMBER=191, T_OBJECT=192, T_OFF=193, T_ON=194, 
		T_ONLY=195, T_OPEN=196, T_OR=197, T_ORDER=198, T_OUT=199, T_OUTER=200, 
		T_OVER=201, T_OVERWRITE=202, T_OWNER=203, T_PACKAGE=204, T_PARTITION=205, 
		T_PCTFREE=206, T_PCTUSED=207, T_PLS_INTEGER=208, T_PRECISION=209, T_PRESERVE=210, 
		T_PRIMARY=211, T_PRINT=212, T_PROC=213, T_PROCEDURE=214, T_QUALIFY=215, 
		T_QUERY_BAND=216, T_QUIT=217, T_QUOTED_IDENTIFIER=218, T_RAISE=219, T_REAL=220, 
		T_REFERENCES=221, T_REGEXP=222, T_REPLACE=223, T_RESIGNAL=224, T_RESTRICT=225, 
		T_RESULT=226, T_RESULT_SET_LOCATOR=227, T_RETURN=228, T_RETURNS=229, T_REVERSE=230, 
		T_RIGHT=231, T_RLIKE=232, T_ROLE=233, T_ROLLBACK=234, T_ROW=235, T_ROWS=236, 
		T_ROWTYPE=237, T_ROW_COUNT=238, T_RR=239, T_RS=240, T_PWD=241, T_TRIM=242, 
		T_SCHEMA=243, T_SECOND=244, T_SECONDS=245, T_SECURITY=246, T_SEGMENT=247, 
		T_SEL=248, T_SELECT=249, T_SET=250, T_SESSION=251, T_SESSIONS=252, T_SETS=253, 
		T_SHARE=254, T_SIGNAL=255, T_SIMPLE_DOUBLE=256, T_SIMPLE_FLOAT=257, T_SIMPLE_INTEGER=258, 
		T_SMALLDATETIME=259, T_SMALLINT=260, T_SQL=261, T_SQLEXCEPTION=262, T_SQLINSERT=263, 
		T_SQLSTATE=264, T_SQLWARNING=265, T_STATS=266, T_STATISTICS=267, T_STEP=268, 
		T_STORAGE=269, T_STORED=270, T_SUBDIR=271, T_SUBSTRING=272, T_SUM=273, 
		T_SUMMARY=274, T_SYS_REFCURSOR=275, T_TABLE=276, T_TABLESPACE=277, T_TEMPORARY=278, 
		T_TERMINATED=279, T_TEXTIMAGE_ON=280, T_THEN=281, T_TIMESTAMP=282, T_TINYINT=283, 
		T_TITLE=284, T_TO=285, T_TOP=286, T_TRANSACTION=287, T_TRUE=288, T_TRUNCATE=289, 
		T_TYPE=290, T_UNION=291, T_UNIQUE=292, T_UPDATE=293, T_UR=294, T_USE=295, 
		T_USING=296, T_VALUE=297, T_VALUES=298, T_VAR=299, T_VARCHAR=300, T_VARCHAR2=301, 
		T_VARYING=302, T_VOLATILE=303, T_WHEN=304, T_WHERE=305, T_WHILE=306, T_WITH=307, 
		T_WITHOUT=308, T_WORK=309, T_XACT_ABORT=310, T_XML=311, T_YES=312, T_EXTERNAL=313, 
		T_VOID=314, T_ACTIVITY_COUNT=315, T_CUME_DIST=316, T_CURRENT_DATE=317, 
		T_CURRENT_TIMESTAMP=318, T_CURRENT_USER=319, T_DENSE_RANK=320, T_FIRST_VALUE=321, 
		T_LAG=322, T_LAST_VALUE=323, T_LEAD=324, T_MAX_PART_STRING=325, T_MIN_PART_STRING=326, 
		T_MAX_PART_INT=327, T_MIN_PART_INT=328, T_MAX_PART_DATE=329, T_MIN_PART_DATE=330, 
		T_PART_COUNT=331, T_PART_LOC=332, T_RANK=333, T_ROW_NUMBER=334, T_STDEV=335, 
		T_SYSDATE=336, T_VARIANCE=337, T_USER=338, T_ADD=339, T_COLON=340, T_COMMA=341, 
		T_PIPE=342, T_DIV=343, T_DOT2=344, T_EQUAL=345, T_EQUAL2=346, T_NOTEQUAL=347, 
		T_NOTEQUAL2=348, T_GREATER=349, T_GREATEREQUAL=350, T_LESS=351, T_LESSEQUAL=352, 
		T_MUL=353, T_OPEN_B=354, T_OPEN_P=355, T_OPEN_SB=356, T_CLOSE_B=357, T_CLOSE_P=358, 
		T_CLOSE_SB=359, T_SEMICOLON=360, T_SUB=361, T_AND_AND=362, T_DOT=363, 
		L_ID=364, L_S_STRING=365, L_v=366, L_D_STRING=367, L_INT=368, L_DEC=369, 
		L_WS=370, L_M_COMMENT=371, L_S_COMMENT=372, L_FILE=373, L_LABEL=374, T_FLOAT=375, 
		T_INT=376, T_STRING=377;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_single_block_stmt = 3, 
		RULE_block_end = 4, RULE_proc_block = 5, RULE_stmt = 6, RULE_exception_block = 7, 
		RULE_exception_block_item = 8, RULE_call_stmt = 9, RULE_declare_stmt = 10, 
		RULE_declare_block = 11, RULE_declare_block_inplace = 12, RULE_declare_stmt_item = 13, 
		RULE_declare_var_item = 14, RULE_declare_condition_item = 15, RULE_declare_cursor_item = 16, 
		RULE_cursor_with_return = 17, RULE_cursor_without_return = 18, RULE_declare_handler_item = 19, 
		RULE_declare_temporary_table_item = 20, RULE_create_table_stmt = 21, RULE_create_local_temp_table_stmt = 22, 
		RULE_create_table_definition = 23, RULE_new_delimiter = 24, RULE_new_location = 25, 
		RULE_new_store = 26, RULE_create_table_columns = 27, RULE_create_table_columns_item = 28, 
		RULE_column_name = 29, RULE_create_table_column_inline_cons = 30, RULE_create_table_column_cons = 31, 
		RULE_create_table_fk_action = 32, RULE_create_table_preoptions = 33, RULE_create_table_preoptions_item = 34, 
		RULE_create_table_preoptions_td_item = 35, RULE_create_table_options = 36, 
		RULE_create_table_options_item = 37, RULE_create_table_options_ora_item = 38, 
		RULE_create_table_options_db2_item = 39, RULE_create_table_options_td_item = 40, 
		RULE_create_table_options_hive_item = 41, RULE_create_table_hive_row_format = 42, 
		RULE_create_table_hive_row_format_fields = 43, RULE_create_table_options_mssql_item = 44, 
		RULE_create_table_options_mysql_item = 45, RULE_dtype = 46, RULE_dtype_len = 47, 
		RULE_dtype_attr = 48, RULE_dtype_default = 49, RULE_create_database_stmt = 50, 
		RULE_create_database_option = 51, RULE_error_create_database_stmt = 52, 
		RULE_function_stmt = 53, RULE_def_return = 54, RULE_return_param = 55, 
		RULE_return_param_item = 56, RULE_cpp_smt = 57, RULE_cpp_smt_for = 58, 
		RULE_cpp_if_stmt = 59, RULE_def_else_if = 60, RULE_def_else = 61, RULE_ifex = 62, 
		RULE_op = 63, RULE_cpp_assignment_stmt = 64, RULE_cpp_var_decleration = 65, 
		RULE_assigned_stmt = 66, RULE_cpp_for_stmt = 67, RULE_for_inc_dec = 68, 
		RULE_forhead1 = 69, RULE_create_function_stmt = 70, RULE_create_function_return = 71, 
		RULE_create_package_stmt = 72, RULE_package_spec = 73, RULE_package_spec_item = 74, 
		RULE_create_package_body_stmt = 75, RULE_package_body = 76, RULE_package_body_item = 77, 
		RULE_create_procedure_stmt = 78, RULE_create_routine_params = 79, RULE_create_routine_param_item = 80, 
		RULE_create_routine_options = 81, RULE_create_routine_option = 82, RULE_collect_stats_clause = 83, 
		RULE_cmp_source = 84, RULE_copy_source = 85, RULE_copy_target = 86, RULE_copy_option = 87, 
		RULE_copy_file_option = 88, RULE_create_index_stmt = 89, RULE_create_index_col = 90, 
		RULE_index_storage_clause = 91, RULE_index_mssql_storage_clause = 92, 
		RULE_set_session_option = 93, RULE_set_current_schema_option = 94, RULE_set_mssql_session_option = 95, 
		RULE_set_teradata_session_option = 96, RULE_while_stmt = 97, RULE_label = 98, 
		RULE_using_clause = 99, RULE_new_select_stmt = 100, RULE_new_select_col = 101, 
		RULE_col_func = 102, RULE_tabledotcol = 103, RULE_new_from_table = 104, 
		RULE_new_from_subselect_clause = 105, RULE_new_from_join_clause = 106, 
		RULE_new_join_condition = 107, RULE_new_where_condition = 108, RULE_select_stmt = 109, 
		RULE_cte_select_stmt = 110, RULE_cte_select_stmt_item = 111, RULE_cte_select_cols = 112, 
		RULE_fullselect_stmt = 113, RULE_fullselect_stmt_item = 114, RULE_fullselect_set_clause = 115, 
		RULE_subselect_stmt = 116, RULE_select_list = 117, RULE_select_list_set = 118, 
		RULE_select_list_limit = 119, RULE_select_list_item = 120, RULE_select_list_alias = 121, 
		RULE_select_list_asterisk = 122, RULE_into_clause = 123, RULE_from_clause = 124, 
		RULE_from_table_clause = 125, RULE_from_table_name_clause = 126, RULE_from_subselect_clause = 127, 
		RULE_from_join_clause = 128, RULE_from_join_type_clause = 129, RULE_from_table_values_clause = 130, 
		RULE_from_table_values_row = 131, RULE_from_alias_clause = 132, RULE_table_name = 133, 
		RULE_where_clause = 134, RULE_error_where_clause = 135, RULE_group_by_clause = 136, 
		RULE_having_clause = 137, RULE_qualify_clause = 138, RULE_order_by_clause = 139, 
		RULE_select_options = 140, RULE_select_options_item = 141, RULE_bool_expr = 142, 
		RULE_bool_expr_atom = 143, RULE_bool_expr_unary = 144, RULE_bool_expr_single_in = 145, 
		RULE_bool_expr_multi_in = 146, RULE_bool_expr_binary = 147, RULE_bool_expr_logical_operator = 148, 
		RULE_bool_expr_binary_operator = 149, RULE_expr = 150, RULE_colom_name = 151, 
		RULE_expr_atom = 152, RULE_expr_interval = 153, RULE_interval_item = 154, 
		RULE_expr_concat = 155, RULE_expr_concat_item = 156, RULE_expr_case = 157, 
		RULE_expr_case_simple = 158, RULE_expr_case_searched = 159, RULE_expr_cursor_attribute = 160, 
		RULE_expr_agg_window_func = 161, RULE_expr_func_all_distinct = 162, RULE_expr_func_over_clause = 163, 
		RULE_expr_func_partition_by_clause = 164, RULE_expr_spec_func = 165, RULE_expr_func = 166, 
		RULE_expr_func_params = 167, RULE_func_param = 168, RULE_expr_select = 169, 
		RULE_expr_file = 170, RULE_file_name = 171, RULE_date_literal = 172, RULE_timestamp_literal = 173, 
		RULE_ident = 174, RULE_string = 175, RULE_int_number = 176, RULE_dec_number = 177, 
		RULE_bool_literal = 178, RULE_null_const = 179, RULE_non_reserved_words = 180;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "begin_end_block", "single_block_stmt", "block_end", 
			"proc_block", "stmt", "exception_block", "exception_block_item", "call_stmt", 
			"declare_stmt", "declare_block", "declare_block_inplace", "declare_stmt_item", 
			"declare_var_item", "declare_condition_item", "declare_cursor_item", 
			"cursor_with_return", "cursor_without_return", "declare_handler_item", 
			"declare_temporary_table_item", "create_table_stmt", "create_local_temp_table_stmt", 
			"create_table_definition", "new_delimiter", "new_location", "new_store", 
			"create_table_columns", "create_table_columns_item", "column_name", "create_table_column_inline_cons", 
			"create_table_column_cons", "create_table_fk_action", "create_table_preoptions", 
			"create_table_preoptions_item", "create_table_preoptions_td_item", "create_table_options", 
			"create_table_options_item", "create_table_options_ora_item", "create_table_options_db2_item", 
			"create_table_options_td_item", "create_table_options_hive_item", "create_table_hive_row_format", 
			"create_table_hive_row_format_fields", "create_table_options_mssql_item", 
			"create_table_options_mysql_item", "dtype", "dtype_len", "dtype_attr", 
			"dtype_default", "create_database_stmt", "create_database_option", "error_create_database_stmt", 
			"function_stmt", "def_return", "return_param", "return_param_item", "cpp_smt", 
			"cpp_smt_for", "cpp_if_stmt", "def_else_if", "def_else", "ifex", "op", 
			"cpp_assignment_stmt", "cpp_var_decleration", "assigned_stmt", "cpp_for_stmt", 
			"for_inc_dec", "forhead1", "create_function_stmt", "create_function_return", 
			"create_package_stmt", "package_spec", "package_spec_item", "create_package_body_stmt", 
			"package_body", "package_body_item", "create_procedure_stmt", "create_routine_params", 
			"create_routine_param_item", "create_routine_options", "create_routine_option", 
			"collect_stats_clause", "cmp_source", "copy_source", "copy_target", "copy_option", 
			"copy_file_option", "create_index_stmt", "create_index_col", "index_storage_clause", 
			"index_mssql_storage_clause", "set_session_option", "set_current_schema_option", 
			"set_mssql_session_option", "set_teradata_session_option", "while_stmt", 
			"label", "using_clause", "new_select_stmt", "new_select_col", "col_func", 
			"tabledotcol", "new_from_table", "new_from_subselect_clause", "new_from_join_clause", 
			"new_join_condition", "new_where_condition", "select_stmt", "cte_select_stmt", 
			"cte_select_stmt_item", "cte_select_cols", "fullselect_stmt", "fullselect_stmt_item", 
			"fullselect_set_clause", "subselect_stmt", "select_list", "select_list_set", 
			"select_list_limit", "select_list_item", "select_list_alias", "select_list_asterisk", 
			"into_clause", "from_clause", "from_table_clause", "from_table_name_clause", 
			"from_subselect_clause", "from_join_clause", "from_join_type_clause", 
			"from_table_values_clause", "from_table_values_row", "from_alias_clause", 
			"table_name", "where_clause", "error_where_clause", "group_by_clause", 
			"having_clause", "qualify_clause", "order_by_clause", "select_options", 
			"select_options_item", "bool_expr", "bool_expr_atom", "bool_expr_unary", 
			"bool_expr_single_in", "bool_expr_multi_in", "bool_expr_binary", "bool_expr_logical_operator", 
			"bool_expr_binary_operator", "expr", "colom_name", "expr_atom", "expr_interval", 
			"interval_item", "expr_concat", "expr_concat_item", "expr_case", "expr_case_simple", 
			"expr_case_searched", "expr_cursor_attribute", "expr_agg_window_func", 
			"expr_func_all_distinct", "expr_func_over_clause", "expr_func_partition_by_clause", 
			"expr_spec_func", "expr_func", "expr_func_params", "func_param", "expr_select", 
			"expr_file", "file_name", "date_literal", "timestamp_literal", "ident", 
			"string", "int_number", "dec_number", "bool_literal", "null_const", "non_reserved_words"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'%'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'+'", "':'", "','", "'||'", "'/'", "'..'", "'='", 
			"'=='", "'<>'", "'!='", "'>'", "'>='", "'<'", "'<='", "'*'", "'{'", "'('", 
			"'['", "'}'", "')'", "']'", "';'", "'-'", "'&&'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "T_ACTION", "T_ADD2", "T_ALL", "T_ALLOCATE", "T_ALTER", "T_AND", 
			"T_ANSI_NULLS", "T_ANSI_PADDING", "T_AS", "T_ASC", "T_ASSOCIATE", "T_AT", 
			"T_AUTO_INCREMENT", "T_AVG", "T_BATCHSIZE", "T_BEGIN", "T_BETWEEN", "T_BIGINT", 
			"T_BINARY_DOUBLE", "T_BINARY_FLOAT", "T_BINARY_INTEGER", "T_BIT", "T_BODY", 
			"T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", "T_CASCADE", "T_CASE", 
			"T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", "T_CHARSET", "T_CLIENT", 
			"T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", "T_COLLECTION", "T_COLUMN", 
			"T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", "T_CONCAT", "T_CONDITION", 
			"T_CONSTRAINT", "T_CONTINUE", "T_COPY", "T_COUNT", "T_COUNT_BIG", "T_CREATE", 
			"T_CREATION", "T_CREATOR", "T_CS", "T_CURRENT", "T_CURRENT_SCHEMA", "T_CURSOR", 
			"T_DATABASE", "T_DATA", "T_DATE", "T_DATETIME", "T_DAY", "T_DAYS", "T_DEC", 
			"T_DECIMAL", "T_DECLARE", "T_DEFAULT", "T_DEFERRED", "T_DEFINED", "T_DEFINER", 
			"T_DEFINITION", "T_DELETE", "T_DELIMITED", "T_DELIMITER", "T_DESC", "T_DESCRIBE", 
			"T_DIAGNOSTICS", "T_DIR", "T_DIRECTORY", "T_DISTINCT", "T_DISTRIBUTE", 
			"T_DO", "T_DOUBLE", "T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", "T_ELSIF", 
			"T_ENABLE", "T_END", "T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", "T_EXECUTE", 
			"T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_FALLBACK", "T_FALSE", 
			"T_FETCH", "T_FIELDS", "T_FILE", "T_FILES", "T_FOR", "T_FOREIGN", "T_FORMAT", 
			"T_FOUND", "T_FROM", "T_FULL", "T_FUNCTION", "T_GET", "T_GLOBAL", "T_GO", 
			"T_GRANT", "T_GROUP", "T_HANDLER", "T_HASH", "T_HAVING", "T_HDFS", "T_HIVE", 
			"T_HOST", "T_IDENTITY", "T_IF", "T_IGNORE", "T_IMMEDIATE", "T_IN", "T_INCLUDE", 
			"T_INDEX", "T_INITRANS", "T_INNER", "T_INOUT", "T_INSERT", "T_INT2", 
			"T_INT4", "T_INT8", "T_INTEGER", "T_INTERSECT", "T_INTERVAL", "T_INTO", 
			"T_INVOKER", "T_IS", "T_ISOPEN", "T_ITEMS", "T_JOIN", "T_KEEP", "T_KEY", 
			"T_KEYS", "T_LANGUAGE", "T_LEAVE", "T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", 
			"T_LOCAL", "T_LOCATION", "T_LOCATOR", "T_LOCATORS", "T_LOCKS", "T_LOG", 
			"T_LOGGED", "T_LOGGING", "T_LOOP", "T_MAP", "T_MATCHED", "T_MAX", "T_MAXTRANS", 
			"T_MERGE", "T_MESSAGE_TEXT", "T_MICROSECOND", "T_MICROSECONDS", "T_MIN", 
			"T_MULTISET", "T_NCHAR", "T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", 
			"T_NOCOMPRESS", "T_NOLOGGING", "T_NONE", "T_NOT", "T_NOTFOUND", "T_NULL", 
			"T_NUMERIC", "T_NUMBER", "T_OBJECT", "T_OFF", "T_ON", "T_ONLY", "T_OPEN", 
			"T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", "T_OVERWRITE", "T_OWNER", 
			"T_PACKAGE", "T_PARTITION", "T_PCTFREE", "T_PCTUSED", "T_PLS_INTEGER", 
			"T_PRECISION", "T_PRESERVE", "T_PRIMARY", "T_PRINT", "T_PROC", "T_PROCEDURE", 
			"T_QUALIFY", "T_QUERY_BAND", "T_QUIT", "T_QUOTED_IDENTIFIER", "T_RAISE", 
			"T_REAL", "T_REFERENCES", "T_REGEXP", "T_REPLACE", "T_RESIGNAL", "T_RESTRICT", 
			"T_RESULT", "T_RESULT_SET_LOCATOR", "T_RETURN", "T_RETURNS", "T_REVERSE", 
			"T_RIGHT", "T_RLIKE", "T_ROLE", "T_ROLLBACK", "T_ROW", "T_ROWS", "T_ROWTYPE", 
			"T_ROW_COUNT", "T_RR", "T_RS", "T_PWD", "T_TRIM", "T_SCHEMA", "T_SECOND", 
			"T_SECONDS", "T_SECURITY", "T_SEGMENT", "T_SEL", "T_SELECT", "T_SET", 
			"T_SESSION", "T_SESSIONS", "T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", 
			"T_SIMPLE_FLOAT", "T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", 
			"T_SQL", "T_SQLEXCEPTION", "T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", 
			"T_STATS", "T_STATISTICS", "T_STEP", "T_STORAGE", "T_STORED", "T_SUBDIR", 
			"T_SUBSTRING", "T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", 
			"T_TEMPORARY", "T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", 
			"T_TINYINT", "T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", "T_TRUE", "T_TRUNCATE", 
			"T_TYPE", "T_UNION", "T_UNIQUE", "T_UPDATE", "T_UR", "T_USE", "T_USING", 
			"T_VALUE", "T_VALUES", "T_VAR", "T_VARCHAR", "T_VARCHAR2", "T_VARYING", 
			"T_VOLATILE", "T_WHEN", "T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", 
			"T_WORK", "T_XACT_ABORT", "T_XML", "T_YES", "T_EXTERNAL", "T_VOID", "T_ACTIVITY_COUNT", 
			"T_CUME_DIST", "T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", 
			"T_DENSE_RANK", "T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", 
			"T_MIN_PART_STRING", "T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", 
			"T_MIN_PART_DATE", "T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", 
			"T_STDEV", "T_SYSDATE", "T_VARIANCE", "T_USER", "T_ADD", "T_COLON", "T_COMMA", 
			"T_PIPE", "T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", 
			"T_GREATER", "T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", 
			"T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", 
			"T_SUB", "T_AND_AND", "T_DOT", "L_ID", "L_S_STRING", "L_v", "L_D_STRING", 
			"L_INT", "L_DEC", "L_WS", "L_M_COMMENT", "L_S_COMMENT", "L_FILE", "L_LABEL", 
			"T_FLOAT", "T_INT", "T_STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Hplsql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	        AST ast = new AST();

	        TypeArray types;

	        	{
	        		try {
	        			types = new TypeArray();
	        		} catch (IOException e) {
	        			e.printStackTrace();
	        		}
	        	}

	        	ArrayList<Node> FunChild = null;
	        	ArrayList<Node> ForChild = null;


	        	ArrayList<name_type> nameType = new ArrayList<>();



	public HplsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HplsqlParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			block();
			setState(363);
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

	public static class BlockContext extends ParserRuleContext {
		public StmtContext stmt;
		public List<Begin_end_blockContext> begin_end_block() {
			return getRuleContexts(Begin_end_blockContext.class);
		}
		public Begin_end_blockContext begin_end_block(int i) {
			return getRuleContext(Begin_end_blockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> T_GO() { return getTokens(HplsqlParser.T_GO); }
		public TerminalNode T_GO(int i) {
			return getToken(HplsqlParser.T_GO, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(369);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(365);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(366);
						((BlockContext)_localctx).stmt = stmt();
						AST.root = ((BlockContext)_localctx).stmt.root;
						}
						break;
					}
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(371);
						match(T_GO);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(376); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Begin_end_blockContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Declare_blockContext declare_block() {
			return getRuleContext(Declare_blockContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBegin_end_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBegin_end_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBegin_end_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(378);
				declare_block();
				}
			}

			setState(381);
			match(T_BEGIN);
			setState(382);
			block();
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(383);
				exception_block();
				}
				break;
			}
			setState(386);
			block_end();
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

	public static class Single_block_stmtContext extends ParserRuleContext {
		public StmtContext stmt;
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSingle_block_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSingle_block_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSingle_block_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_block_stmt);
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(T_BEGIN);
				setState(389);
				block();
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(390);
					exception_block();
					}
					break;
				}
				setState(393);
				block_end();
				}
				break;
			case T_ALTER:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BINARY_INTEGER:
			case T_BIT:
			case T_CHAR:
			case T_CREATE:
			case T_DATABASE:
			case T_DATE:
			case T_DATETIME:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DOUBLE:
			case T_FOR:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_NCHAR:
			case T_NVARCHAR:
			case T_NUMERIC:
			case T_NUMBER:
			case T_PACKAGE:
			case T_PLS_INTEGER:
			case T_PROC:
			case T_PROCEDURE:
			case T_REAL:
			case T_REPLACE:
			case T_RESULT_SET_LOCATOR:
			case T_SCHEMA:
			case T_SELECT:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SIMPLE_INTEGER:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SYS_REFCURSOR:
			case T_TIMESTAMP:
			case T_TINYINT:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_WHILE:
			case T_XML:
			case T_VOID:
			case T_LESS:
			case L_ID:
			case L_LABEL:
			case T_FLOAT:
			case T_INT:
			case T_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				((Single_block_stmtContext)_localctx).stmt = stmt();
				AST.root = ((Single_block_stmtContext)_localctx).stmt.root;
				setState(398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(397);
					match(T_SEMICOLON);
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

	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBlock_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBlock_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBlock_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(403);
			match(T_END);
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

	public static class Proc_blockContext extends ParserRuleContext {
		public StmtContext stmt;
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode T_GO() { return getToken(HplsqlParser.T_GO, 0); }
		public Proc_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterProc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitProc_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitProc_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc_block);
		try {
			int _alt;
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(406);
						((Proc_blockContext)_localctx).stmt = stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(409); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(411);
					match(T_GO);
					}
					break;
				}
				AST.root = ((Proc_blockContext)_localctx).stmt.root;
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

	public static class StmtContext extends ParserRuleContext {
		public Node root;
		public Function_stmtContext function_stmt;
		public Create_table_stmtContext create_table_stmt;
		public Cpp_var_declerationContext cpp_var_decleration;
		public Cpp_for_stmtContext cpp_for_stmt;
		public Call_stmtContext call_stmt() {
			return getRuleContext(Call_stmtContext.class,0);
		}
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public Function_stmtContext function_stmt() {
			return getRuleContext(Function_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
			return getRuleContext(Create_local_temp_table_stmtContext.class,0);
		}
		public Create_package_stmtContext create_package_stmt() {
			return getRuleContext(Create_package_stmtContext.class,0);
		}
		public Create_package_body_stmtContext create_package_body_stmt() {
			return getRuleContext(Create_package_body_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Declare_stmtContext declare_stmt() {
			return getRuleContext(Declare_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Cpp_assignment_stmtContext cpp_assignment_stmt() {
			return getRuleContext(Cpp_assignment_stmtContext.class,0);
		}
		public Cpp_var_declerationContext cpp_var_decleration() {
			return getRuleContext(Cpp_var_declerationContext.class,0);
		}
		public Cpp_for_stmtContext cpp_for_stmt() {
			return getRuleContext(Cpp_for_stmtContext.class,0);
		}
		public New_select_stmtContext new_select_stmt() {
			return getRuleContext(New_select_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((StmtContext)_localctx).root =  new Node();
				setState(419);
				call_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				create_database_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				((StmtContext)_localctx).function_stmt = function_stmt();
				((StmtContext)_localctx).root =  ((StmtContext)_localctx).function_stmt.astNode;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				create_index_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				create_local_temp_table_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(426);
				create_package_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(427);
				create_package_body_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(428);
				create_procedure_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(429);
				((StmtContext)_localctx).create_table_stmt = create_table_stmt();
				((StmtContext)_localctx).root =  ((StmtContext)_localctx).create_table_stmt.tableNode;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(432);
				declare_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(433);
				while_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(434);
				label();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(435);
				cpp_assignment_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(436);
				((StmtContext)_localctx).cpp_var_decleration = cpp_var_decleration();
				((StmtContext)_localctx).root =  ((StmtContext)_localctx).cpp_var_decleration.VarDecNode;
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(439);
				((StmtContext)_localctx).cpp_for_stmt = cpp_for_stmt();
				((StmtContext)_localctx).root =  ((StmtContext)_localctx).cpp_for_stmt.forNode;
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(442);
				new_select_stmt();
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

	public static class Exception_blockContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(HplsqlParser.T_EXCEPTION, 0); }
		public List<Exception_block_itemContext> exception_block_item() {
			return getRuleContexts(Exception_block_itemContext.class);
		}
		public Exception_block_itemContext exception_block_item(int i) {
			return getRuleContext(Exception_block_itemContext.class,i);
		}
		public Exception_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterException_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitException_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitException_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_blockContext exception_block() throws RecognitionException {
		Exception_blockContext _localctx = new Exception_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exception_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(T_EXCEPTION);
			setState(447); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(446);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(449); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Exception_block_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_WHEN() { return getTokens(HplsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HplsqlParser.T_WHEN, i);
		}
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public Exception_block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterException_block_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitException_block_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitException_block_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_block_itemContext exception_block_item() throws RecognitionException {
		Exception_block_itemContext _localctx = new Exception_block_itemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exception_block_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T_WHEN);
			setState(452);
			match(L_ID);
			setState(453);
			match(T_THEN);
			setState(454);
			block();
			setState(455);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T_END || _la==T_WHEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Call_stmtContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public Return_paramContext return_param() {
			return getRuleContext(Return_paramContext.class,0);
		}
		public Call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_call_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			ident();
			setState(458);
			match(T_OPEN_P);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T_BIGINT - 19)) | (1L << (T_BINARY_DOUBLE - 19)) | (1L << (T_BINARY_FLOAT - 19)) | (1L << (T_BINARY_INTEGER - 19)) | (1L << (T_BIT - 19)) | (1L << (T_CHAR - 19)) | (1L << (T_DATE - 19)) | (1L << (T_DATETIME - 19)) | (1L << (T_DEC - 19)) | (1L << (T_DECIMAL - 19)))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T_DOUBLE - 87)) | (1L << (T_INT2 - 87)) | (1L << (T_INT4 - 87)) | (1L << (T_INT8 - 87)) | (1L << (T_INTEGER - 87)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (T_NCHAR - 179)) | (1L << (T_NVARCHAR - 179)) | (1L << (T_NUMERIC - 179)) | (1L << (T_NUMBER - 179)) | (1L << (T_PLS_INTEGER - 179)) | (1L << (T_REAL - 179)) | (1L << (T_RESULT_SET_LOCATOR - 179)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SIMPLE_INTEGER - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TINYINT - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_XML - 256)) | (1L << (T_VOID - 256)))) != 0) || ((((_la - 364)) & ~0x3f) == 0 && ((1L << (_la - 364)) & ((1L << (L_ID - 364)) | (1L << (T_FLOAT - 364)) | (1L << (T_INT - 364)) | (1L << (T_STRING - 364)))) != 0)) {
				{
				setState(459);
				return_param();
				}
			}

			setState(462);
			match(T_CLOSE_P);
			setState(463);
			match(T_SEMICOLON);
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

	public static class Declare_stmtContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(HplsqlParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(T_DECLARE);
			setState(466);
			declare_stmt_item();
			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(467);
					match(T_COMMA);
					setState(468);
					declare_stmt_item();
					}
					} 
				}
				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Declare_blockContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(HplsqlParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declare_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(T_DECLARE);
			setState(475);
			declare_stmt_item();
			setState(476);
			match(T_SEMICOLON);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_CONTINUE || _la==T_CURSOR || _la==T_EXIT || _la==T_GLOBAL || _la==T_TEMPORARY || _la==L_ID) {
				{
				{
				setState(477);
				declare_stmt_item();
				setState(478);
				match(T_SEMICOLON);
				}
				}
				setState(484);
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

	public static class Declare_block_inplaceContext extends ParserRuleContext {
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block_inplace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_block_inplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_block_inplace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_block_inplace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			declare_stmt_item();
			setState(486);
			match(T_SEMICOLON);
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(487);
					declare_stmt_item();
					setState(488);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class Declare_stmt_itemContext extends ParserRuleContext {
		public Declare_cursor_itemContext declare_cursor_item() {
			return getRuleContext(Declare_cursor_itemContext.class,0);
		}
		public Declare_condition_itemContext declare_condition_item() {
			return getRuleContext(Declare_condition_itemContext.class,0);
		}
		public Declare_handler_itemContext declare_handler_item() {
			return getRuleContext(Declare_handler_itemContext.class,0);
		}
		public Declare_var_itemContext declare_var_item() {
			return getRuleContext(Declare_var_itemContext.class,0);
		}
		public Declare_temporary_table_itemContext declare_temporary_table_item() {
			return getRuleContext(Declare_temporary_table_itemContext.class,0);
		}
		public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declare_stmt_item);
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				declare_cursor_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				declare_condition_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				declare_handler_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				declare_var_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(499);
				declare_temporary_table_item();
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

	public static class Declare_var_itemContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_CONSTANT() { return getToken(HplsqlParser.T_CONSTANT, 0); }
		public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_var_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_var_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_var_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				ident();
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(503);
					match(T_COMMA);
					setState(504);
					ident();
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(510);
					match(T_AS);
					}
				}

				setState(513);
				dtype();
				setState(515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(514);
					dtype_len();
					}
					break;
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(517);
						dtype_attr();
						}
						} 
					}
					setState(522);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(523);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				ident();
				setState(527);
				match(T_CONSTANT);
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(528);
					match(T_AS);
					}
				}

				setState(531);
				dtype();
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(532);
					dtype_len();
					}
				}

				setState(535);
				dtype_default();
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

	public static class Declare_condition_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CONDITION() { return getToken(HplsqlParser.T_CONDITION, 0); }
		public Declare_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_condition_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_condition_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_condition_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_condition_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		Declare_condition_itemContext _localctx = new Declare_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			ident();
			setState(540);
			match(T_CONDITION);
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

	public static class Declare_cursor_itemContext extends ParserRuleContext {
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_CURSOR() { return getToken(HplsqlParser.T_CURSOR, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cursor_with_returnContext cursor_with_return() {
			return getRuleContext(Cursor_with_returnContext.class,0);
		}
		public Cursor_without_returnContext cursor_without_return() {
			return getRuleContext(Cursor_without_returnContext.class,0);
		}
		public Declare_cursor_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_cursor_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_cursor_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_cursor_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_cursor_itemContext declare_cursor_item() throws RecognitionException {
		Declare_cursor_itemContext _localctx = new Declare_cursor_itemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declare_cursor_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURSOR:
				{
				setState(542);
				match(T_CURSOR);
				setState(543);
				ident();
				}
				break;
			case L_ID:
				{
				setState(544);
				ident();
				setState(545);
				match(T_CURSOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WITH:
				{
				setState(549);
				cursor_with_return();
				}
				break;
			case T_WITHOUT:
				{
				setState(550);
				cursor_without_return();
				}
				break;
			case T_AS:
			case T_FOR:
			case T_IS:
				break;
			default:
				break;
			}
			setState(553);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_FOR || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(554);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(555);
				expr(0);
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

	public static class Cursor_with_returnContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public TerminalNode T_CALLER() { return getToken(HplsqlParser.T_CALLER, 0); }
		public TerminalNode T_CLIENT() { return getToken(HplsqlParser.T_CLIENT, 0); }
		public Cursor_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCursor_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCursor_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCursor_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_with_returnContext cursor_with_return() throws RecognitionException {
		Cursor_with_returnContext _localctx = new Cursor_with_returnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cursor_with_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(T_WITH);
			setState(559);
			match(T_RETURN);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ONLY) {
				{
				setState(560);
				match(T_ONLY);
				}
			}

			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TO) {
				{
				setState(563);
				match(T_TO);
				setState(564);
				_la = _input.LA(1);
				if ( !(_la==T_CALLER || _la==T_CLIENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class Cursor_without_returnContext extends ParserRuleContext {
		public TerminalNode T_WITHOUT() { return getToken(HplsqlParser.T_WITHOUT, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public Cursor_without_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_without_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCursor_without_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCursor_without_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCursor_without_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_without_returnContext cursor_without_return() throws RecognitionException {
		Cursor_without_returnContext _localctx = new Cursor_without_returnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cursor_without_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(T_WITHOUT);
			setState(568);
			match(T_RETURN);
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

	public static class Declare_handler_itemContext extends ParserRuleContext {
		public TerminalNode T_HANDLER() { return getToken(HplsqlParser.T_HANDLER, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_CONTINUE() { return getToken(HplsqlParser.T_CONTINUE, 0); }
		public TerminalNode T_EXIT() { return getToken(HplsqlParser.T_EXIT, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HplsqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HplsqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Declare_handler_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_handler_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_handler_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_handler_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_handler_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		Declare_handler_itemContext _localctx = new Declare_handler_itemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(571);
			match(T_HANDLER);
			setState(572);
			match(T_FOR);
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SQLEXCEPTION:
				{
				setState(573);
				match(T_SQLEXCEPTION);
				}
				break;
			case T_SQLWARNING:
				{
				setState(574);
				match(T_SQLWARNING);
				}
				break;
			case T_NOT:
				{
				setState(575);
				match(T_NOT);
				setState(576);
				match(T_FOUND);
				}
				break;
			case L_ID:
				{
				setState(577);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(580);
			single_block_stmt();
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

	public static class Declare_temporary_table_itemContext extends ParserRuleContext {
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_GLOBAL() { return getToken(HplsqlParser.T_GLOBAL, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Declare_temporary_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_temporary_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_temporary_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_temporary_table_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_temporary_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
		Declare_temporary_table_itemContext _localctx = new Declare_temporary_table_itemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(582);
				match(T_GLOBAL);
				}
			}

			setState(585);
			match(T_TEMPORARY);
			setState(586);
			match(T_TABLE);
			setState(587);
			ident();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LOCATION || _la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(588);
				create_table_preoptions();
				}
			}

			setState(591);
			create_table_definition();
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public CreateTableNode tableNode;
		public Table_nameContext table_name;
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_EXTERNAL() { return getToken(HplsqlParser.T_EXTERNAL, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			nameType = new ArrayList<name_type>();
			setState(594);
			match(T_CREATE);
			setState(595);
			match(T_EXTERNAL);
			setState(596);
			match(T_TABLE);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(597);
				match(T_IF);
				setState(598);
				match(T_NOT);
				setState(599);
				match(T_EXISTS);
				}
			}

			setState(602);
			((Create_table_stmtContext)_localctx).table_name = table_name();
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LOCATION || _la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(603);
				create_table_preoptions();
				}
			}

			setState(606);
			create_table_definition();
			setState(607);
			match(T_SEMICOLON);

			        /*if(types.find_typ((((Create_table_stmtContext)_localctx).table_name!=null?_input.getText(((Create_table_stmtContext)_localctx).table_name.start,((Create_table_stmtContext)_localctx).table_name.stop):null))){
			                System.out.print("Error Table :" + (((Create_table_stmtContext)_localctx).table_name!=null?_input.getText(((Create_table_stmtContext)_localctx).table_name.start,((Create_table_stmtContext)_localctx).table_name.stop):null) + "  found!");


			            }else{
			                 ((Create_table_stmtContext)_localctx).tableNode =  new CreateTableNode((((Create_table_stmtContext)_localctx).table_name!=null?_input.getText(((Create_table_stmtContext)_localctx).table_name.start,((Create_table_stmtContext)_localctx).table_name.stop):null));
			                 _localctx.tableNode.setColumns(nameType);
			                 try{
			                    types.set((((Create_table_stmtContext)_localctx).table_name!=null?_input.getText(((Create_table_stmtContext)_localctx).table_name.start,((Create_table_stmtContext)_localctx).table_name.stop):null),nameType);
			                } catch (IOException e) {
			                        e.printStackTrace();
			                }


			            }*/


			        
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

	public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(HplsqlParser.T_LOCAL, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HplsqlParser.T_VOLATILE, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_MULTISET() { return getToken(HplsqlParser.T_MULTISET, 0); }
		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_local_temp_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_local_temp_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_local_temp_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_local_temp_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(T_CREATE);
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(611);
				match(T_LOCAL);
				setState(612);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(613);
					_la = _input.LA(1);
					if ( !(_la==T_MULTISET || _la==T_SET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(616);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(619);
			match(T_TABLE);
			setState(620);
			ident();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LOCATION || _la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(621);
				create_table_preoptions();
				}
			}

			setState(624);
			create_table_definition();
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

	public static class Create_table_definitionContext extends ParserRuleContext {
		public New_storeContext new_store() {
			return getRuleContext(New_storeContext.class,0);
		}
		public New_delimiterContext new_delimiter() {
			return getRuleContext(New_delimiterContext.class,0);
		}
		public New_locationContext new_location() {
			return getRuleContext(New_locationContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Create_table_columnsContext create_table_columns() {
			return getRuleContext(Create_table_columnsContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(626);
					match(T_AS);
					}
				}

				setState(629);
				match(T_OPEN_P);
				setState(630);
				select_stmt();
				setState(631);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(633);
					match(T_AS);
					}
				}

				setState(636);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(637);
				match(T_OPEN_P);
				setState(638);
				create_table_columns();
				setState(639);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(643);
			new_store();
			setState(644);
			new_delimiter();
			setState(645);
			new_location();
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

	public static class New_delimiterContext extends ParserRuleContext {
		public TerminalNode T_ROW() { return getToken(HplsqlParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(HplsqlParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HplsqlParser.T_DELIMITED, 0); }
		public TerminalNode T_FIELDS() { return getToken(HplsqlParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HplsqlParser.T_TERMINATED, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public New_delimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_delimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNew_delimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNew_delimiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNew_delimiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_delimiterContext new_delimiter() throws RecognitionException {
		New_delimiterContext _localctx = new New_delimiterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_new_delimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(T_ROW);
			setState(648);
			match(T_FORMAT);
			setState(649);
			match(T_DELIMITED);
			setState(650);
			match(T_FIELDS);
			setState(651);
			match(T_TERMINATED);
			setState(652);
			match(T_BY);
			setState(653);
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

	public static class New_locationContext extends ParserRuleContext {
		public TerminalNode T_LOCATION() { return getToken(HplsqlParser.T_LOCATION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public New_locationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNew_location(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNew_location(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNew_location(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_locationContext new_location() throws RecognitionException {
		New_locationContext _localctx = new New_locationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_new_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(T_LOCATION);
			setState(656);
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

	public static class New_storeContext extends ParserRuleContext {
		public TerminalNode T_STORED() { return getToken(HplsqlParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public New_storeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_store; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNew_store(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNew_store(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNew_store(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_storeContext new_store() throws RecognitionException {
		New_storeContext _localctx = new New_storeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_new_store);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(T_STORED);
			setState(659);
			match(T_AS);
			setState(660);
			ident();
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

	public static class Create_table_columnsContext extends ParserRuleContext {
		public List<Create_table_columns_itemContext> create_table_columns_item() {
			return getRuleContexts(Create_table_columns_itemContext.class);
		}
		public Create_table_columns_itemContext create_table_columns_item(int i) {
			return getRuleContext(Create_table_columns_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_columns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			create_table_columns_item();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(663);
				match(T_COMMA);
				setState(664);
				create_table_columns_item();
				}
				}
				setState(669);
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

	public static class Create_table_columns_itemContext extends ParserRuleContext {
		public name_type col;
		public Column_nameContext column_name;
		public DtypeContext dtype;
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public List<Create_table_column_inline_consContext> create_table_column_inline_cons() {
			return getRuleContexts(Create_table_column_inline_consContext.class);
		}
		public Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
			return getRuleContext(Create_table_column_inline_consContext.class,i);
		}
		public Create_table_column_consContext create_table_column_cons() {
			return getRuleContext(Create_table_column_consContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(HplsqlParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_columns_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_columns_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_columns_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				((Create_table_columns_itemContext)_localctx).column_name = column_name();
				setState(671);
				((Create_table_columns_itemContext)_localctx).dtype = dtype();
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(672);
					dtype_len();
					}
				}

				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(675);
						dtype_attr();
						}
						} 
					}
					setState(680);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T_DEFAULT - 71)) | (1L << (T_ENABLE - 71)) | (1L << (T_IDENTITY - 71)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (T_NOT - 187)) | (1L << (T_NULL - 187)) | (1L << (T_PRIMARY - 187)) | (1L << (T_REFERENCES - 187)))) != 0) || ((((_la - 292)) & ~0x3f) == 0 && ((1L << (_la - 292)) & ((1L << (T_UNIQUE - 292)) | (1L << (T_WITH - 292)) | (1L << (T_COLON - 292)) | (1L << (T_EQUAL - 292)))) != 0)) {
					{
					{
					setState(681);
					create_table_column_inline_cons();
					}
					}
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				            /*if(types.find_typ((((Create_table_columns_itemContext)_localctx).dtype!=null?_input.getText(((Create_table_columns_itemContext)_localctx).dtype.start,((Create_table_columns_itemContext)_localctx).dtype.stop):null))){
				                ((Create_table_columns_itemContext)_localctx).col =  new name_type((((Create_table_columns_itemContext)_localctx).column_name!=null?_input.getText(((Create_table_columns_itemContext)_localctx).column_name.start,((Create_table_columns_itemContext)_localctx).column_name.stop):null),(((Create_table_columns_itemContext)_localctx).dtype!=null?_input.getText(((Create_table_columns_itemContext)_localctx).dtype.start,((Create_table_columns_itemContext)_localctx).dtype.stop):null));
				                nameType.add(_localctx.col);

				            }else{
				                ((Create_table_columns_itemContext)_localctx).col = null;
				                System.out.print("Error Type :" + (((Create_table_columns_itemContext)_localctx).dtype!=null?_input.getText(((Create_table_columns_itemContext)_localctx).dtype.start,((Create_table_columns_itemContext)_localctx).dtype.stop):null) + " Not found!");
				            }*/

				       
				}
				break;
			case T_CONSTRAINT:
			case T_FOREIGN:
			case T_PRIMARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(689);
					match(T_CONSTRAINT);
					setState(690);
					ident();
					}
				}

				setState(693);
				create_table_column_cons();
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

	public static class Column_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			ident();
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

	public static class Create_table_column_inline_consContext extends ParserRuleContext {
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_IDENTITY() { return getToken(HplsqlParser.T_IDENTITY, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_inline_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_column_inline_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_column_inline_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_column_inline_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(699);
					match(T_NOT);
					}
				}

				setState(702);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(703);
				match(T_PRIMARY);
				setState(704);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(705);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(706);
				match(T_REFERENCES);
				setState(707);
				table_name();
				setState(708);
				match(T_OPEN_P);
				setState(709);
				ident();
				setState(710);
				match(T_CLOSE_P);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(711);
					create_table_fk_action();
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(717);
				match(T_IDENTITY);
				setState(718);
				match(T_OPEN_P);
				setState(719);
				match(L_INT);
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(720);
					match(T_COMMA);
					setState(721);
					match(L_INT);
					}
					}
					setState(726);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(727);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(728);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(729);
				match(T_ENABLE);
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

	public static class Create_table_column_consContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(HplsqlParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HplsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HplsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HplsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HplsqlParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(HplsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_column_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_column_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_column_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_create_table_column_cons);
		int _la;
		try {
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				match(T_PRIMARY);
				setState(733);
				match(T_KEY);
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(734);
					match(T_CLUSTERED);
					}
				}

				setState(737);
				match(T_OPEN_P);
				setState(738);
				ident();
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(739);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(742);
					match(T_COMMA);
					setState(743);
					ident();
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(744);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(751);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(752);
				match(T_CLOSE_P);
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(753);
					match(T_ENABLE);
					}
				}

				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(756);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				match(T_FOREIGN);
				setState(760);
				match(T_KEY);
				setState(761);
				match(T_OPEN_P);
				setState(762);
				ident();
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(763);
					match(T_COMMA);
					setState(764);
					ident();
					}
					}
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(770);
				match(T_CLOSE_P);
				setState(771);
				match(T_REFERENCES);
				setState(772);
				table_name();
				setState(773);
				match(T_OPEN_P);
				setState(774);
				ident();
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(775);
					match(T_COMMA);
					setState(776);
					ident();
					}
					}
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(782);
				match(T_CLOSE_P);
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(783);
					create_table_fk_action();
					}
					}
					setState(788);
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

	public static class Create_table_fk_actionContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_ACTION() { return getToken(HplsqlParser.T_ACTION, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_CASCADE() { return getToken(HplsqlParser.T_CASCADE, 0); }
		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_fk_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_fk_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_fk_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_fk_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(T_ON);
			setState(792);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(793);
				match(T_NO);
				setState(794);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(795);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(796);
				match(T_SET);
				setState(797);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(798);
				match(T_SET);
				setState(799);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(800);
				match(T_CASCADE);
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

	public static class Create_table_preoptionsContext extends ParserRuleContext {
		public List<Create_table_preoptions_itemContext> create_table_preoptions_item() {
			return getRuleContexts(Create_table_preoptions_itemContext.class);
		}
		public Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
			return getRuleContext(Create_table_preoptions_itemContext.class,i);
		}
		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_preoptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_preoptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(803);
				create_table_preoptions_item();
				}
				}
				setState(806); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_LOCATION || _la==T_ROW || _la==T_STORED || _la==T_COMMA );
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

	public static class Create_table_preoptions_itemContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
			return getRuleContext(Create_table_preoptions_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_preoptions_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_preoptions_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_create_table_preoptions_item);
		try {
			setState(811);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				match(T_COMMA);
				setState(809);
				create_table_preoptions_td_item();
				}
				break;
			case T_LOCATION:
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				create_table_options_hive_item();
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

	public static class Create_table_preoptions_td_itemContext extends ParserRuleContext {
		public TerminalNode T_LOG() { return getToken(HplsqlParser.T_LOG, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HplsqlParser.T_FALLBACK, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_preoptions_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_preoptions_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(813);
				match(T_NO);
				}
			}

			setState(816);
			_la = _input.LA(1);
			if ( !(_la==T_FALLBACK || _la==T_LOG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Create_table_optionsContext extends ParserRuleContext {
		public List<Create_table_options_itemContext> create_table_options_item() {
			return getRuleContexts(Create_table_options_itemContext.class);
		}
		public Create_table_options_itemContext create_table_options_item(int i) {
			return getRuleContext(Create_table_options_itemContext.class,i);
		}
		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_create_table_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(818);
				create_table_options_item();
				}
				}
				setState(821); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_AUTO_INCREMENT) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_COMMENT) | (1L << T_COMPRESS))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T_DEFAULT - 71)) | (1L << (T_DEFINITION - 71)) | (1L << (T_DISTRIBUTE - 71)) | (1L << (T_ENGINE - 71)) | (1L << (T_IN - 71)) | (1L << (T_INDEX - 71)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (T_INITRANS - 135)) | (1L << (T_LOCATION - 135)) | (1L << (T_LOGGED - 135)) | (1L << (T_LOGGING - 135)) | (1L << (T_MAXTRANS - 135)) | (1L << (T_NOCOMPRESS - 135)) | (1L << (T_NOLOGGING - 135)) | (1L << (T_NOT - 135)) | (1L << (T_ON - 135)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (T_PCTFREE - 206)) | (1L << (T_PCTUSED - 206)) | (1L << (T_PRIMARY - 206)) | (1L << (T_ROW - 206)) | (1L << (T_SEGMENT - 206)) | (1L << (T_STORAGE - 206)))) != 0) || ((((_la - 270)) & ~0x3f) == 0 && ((1L << (_la - 270)) & ((1L << (T_STORED - 270)) | (1L << (T_TABLESPACE - 270)) | (1L << (T_TEXTIMAGE_ON - 270)) | (1L << (T_UNIQUE - 270)) | (1L << (T_WITH - 270)))) != 0) );
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

	public static class Create_table_options_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_COMMIT() { return getToken(HplsqlParser.T_COMMIT, 0); }
		public TerminalNode T_ROWS() { return getToken(HplsqlParser.T_ROWS, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HplsqlParser.T_PRESERVE, 0); }
		public Create_table_options_ora_itemContext create_table_options_ora_item() {
			return getRuleContext(Create_table_options_ora_itemContext.class,0);
		}
		public Create_table_options_db2_itemContext create_table_options_db2_item() {
			return getRuleContext(Create_table_options_db2_itemContext.class,0);
		}
		public Create_table_options_td_itemContext create_table_options_td_item() {
			return getRuleContext(Create_table_options_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item() {
			return getRuleContext(Create_table_options_mssql_itemContext.class,0);
		}
		public Create_table_options_mysql_itemContext create_table_options_mysql_item() {
			return getRuleContext(Create_table_options_mysql_itemContext.class,0);
		}
		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_create_table_options_item);
		int _la;
		try {
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				match(T_ON);
				setState(824);
				match(T_COMMIT);
				setState(825);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(826);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(828);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(829);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(830);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(831);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(832);
				create_table_options_mysql_item();
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

	public static class Create_table_options_ora_itemContext extends ParserRuleContext {
		public TerminalNode T_SEGMENT() { return getToken(HplsqlParser.T_SEGMENT, 0); }
		public TerminalNode T_CREATION() { return getToken(HplsqlParser.T_CREATION, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HplsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HplsqlParser.T_DEFERRED, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public TerminalNode T_PCTFREE() { return getToken(HplsqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HplsqlParser.T_PCTUSED, 0); }
		public TerminalNode T_INITRANS() { return getToken(HplsqlParser.T_INITRANS, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HplsqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HplsqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_LOGGING() { return getToken(HplsqlParser.T_LOGGING, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HplsqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_STORAGE() { return getToken(HplsqlParser.T_STORAGE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_TABLESPACE() { return getToken(HplsqlParser.T_TABLESPACE, 0); }
		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_ora_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_ora_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_ora_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_ora_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
				match(T_SEGMENT);
				setState(836);
				match(T_CREATION);
				setState(837);
				_la = _input.LA(1);
				if ( !(_la==T_DEFERRED || _la==T_IMMEDIATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_INITRANS:
			case T_MAXTRANS:
			case T_PCTFREE:
			case T_PCTUSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(839);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(840);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(841);
				_la = _input.LA(1);
				if ( !(_la==T_LOGGING || _la==T_NOLOGGING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(842);
				match(T_STORAGE);
				setState(843);
				match(T_OPEN_P);
				setState(846); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(846);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(844);
						ident();
						}
						break;
					case L_INT:
						{
						setState(845);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(848); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==L_ID || _la==L_INT );
				setState(850);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(851);
				match(T_TABLESPACE);
				setState(852);
				ident();
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

	public static class Create_table_options_db2_itemContext extends ParserRuleContext {
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HplsqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public TerminalNode T_HASH() { return getToken(HplsqlParser.T_HASH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_LOGGED() { return getToken(HplsqlParser.T_LOGGED, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HplsqlParser.T_COMPRESS, 0); }
		public TerminalNode T_YES() { return getToken(HplsqlParser.T_YES, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HplsqlParser.T_DEFINITION, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_DROP() { return getToken(HplsqlParser.T_DROP, 0); }
		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_db2_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_db2_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_db2_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_db2_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(855);
					match(T_INDEX);
					}
				}

				setState(858);
				match(T_IN);
				setState(859);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				match(T_WITH);
				setState(861);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(862);
				match(T_DISTRIBUTE);
				setState(863);
				match(T_BY);
				setState(864);
				match(T_HASH);
				setState(865);
				match(T_OPEN_P);
				setState(866);
				ident();
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(867);
					match(T_COMMA);
					setState(868);
					ident();
					}
					}
					setState(873);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(874);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(876);
					match(T_NOT);
					}
				}

				setState(879);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(880);
				match(T_COMPRESS);
				setState(881);
				_la = _input.LA(1);
				if ( !(_la==T_NO || _la==T_YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(882);
				match(T_DEFINITION);
				setState(883);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(884);
				match(T_WITH);
				setState(885);
				match(T_RESTRICT);
				setState(886);
				match(T_ON);
				setState(887);
				match(T_DROP);
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

	public static class Create_table_options_td_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_DATA() { return getToken(HplsqlParser.T_DATA, 0); }
		public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(908);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(890);
					match(T_UNIQUE);
					}
				}

				setState(893);
				match(T_PRIMARY);
				setState(894);
				match(T_INDEX);
				setState(895);
				match(T_OPEN_P);
				setState(896);
				ident();
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(897);
					match(T_COMMA);
					setState(898);
					ident();
					}
					}
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(904);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
				match(T_WITH);
				setState(907);
				match(T_DATA);
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

	public static class Create_table_options_hive_itemContext extends ParserRuleContext {
		public Create_table_hive_row_formatContext create_table_hive_row_format() {
			return getRuleContext(Create_table_hive_row_formatContext.class,0);
		}
		public TerminalNode T_STORED() { return getToken(HplsqlParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_LOCATION() { return getToken(HplsqlParser.T_LOCATION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_hive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_hive_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_hive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_create_table_options_hive_item);
		try {
			setState(916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(910);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				match(T_STORED);
				setState(912);
				match(T_AS);
				setState(913);
				ident();
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(914);
				match(T_LOCATION);
				setState(915);
				expr(0);
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

	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public TerminalNode T_ROW() { return getToken(HplsqlParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(HplsqlParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HplsqlParser.T_DELIMITED, 0); }
		public List<Create_table_hive_row_format_fieldsContext> create_table_hive_row_format_fields() {
			return getRuleContexts(Create_table_hive_row_format_fieldsContext.class);
		}
		public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields(int i) {
			return getRuleContext(Create_table_hive_row_format_fieldsContext.class,i);
		}
		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_hive_row_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_hive_row_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_hive_row_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_create_table_hive_row_format);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(T_ROW);
			setState(919);
			match(T_FORMAT);
			setState(920);
			match(T_DELIMITED);
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COLLECTION || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (T_FIELDS - 107)) | (1L << (T_LINES - 107)) | (1L << (T_MAP - 107)))) != 0) || _la==T_NULL) {
				{
				{
				setState(921);
				create_table_hive_row_format_fields();
				}
				}
				setState(926);
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

	public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
		public TerminalNode T_FIELDS() { return getToken(HplsqlParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HplsqlParser.T_TERMINATED, 0); }
		public List<TerminalNode> T_BY() { return getTokens(HplsqlParser.T_BY); }
		public TerminalNode T_BY(int i) {
			return getToken(HplsqlParser.T_BY, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ESCAPED() { return getToken(HplsqlParser.T_ESCAPED, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HplsqlParser.T_COLLECTION, 0); }
		public TerminalNode T_ITEMS() { return getToken(HplsqlParser.T_ITEMS, 0); }
		public TerminalNode T_MAP() { return getToken(HplsqlParser.T_MAP, 0); }
		public TerminalNode T_KEYS() { return getToken(HplsqlParser.T_KEYS, 0); }
		public TerminalNode T_LINES() { return getToken(HplsqlParser.T_LINES, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_DEFINED() { return getToken(HplsqlParser.T_DEFINED, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_hive_row_format_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_hive_row_format_fields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_hive_row_format_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_table_hive_row_format_fields);
		int _la;
		try {
			setState(954);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				match(T_FIELDS);
				setState(928);
				match(T_TERMINATED);
				setState(929);
				match(T_BY);
				setState(930);
				expr(0);
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ESCAPED) {
					{
					setState(931);
					match(T_ESCAPED);
					setState(932);
					match(T_BY);
					setState(933);
					expr(0);
					}
				}

				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				match(T_COLLECTION);
				setState(937);
				match(T_ITEMS);
				setState(938);
				match(T_TERMINATED);
				setState(939);
				match(T_BY);
				setState(940);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(941);
				match(T_MAP);
				setState(942);
				match(T_KEYS);
				setState(943);
				match(T_TERMINATED);
				setState(944);
				match(T_BY);
				setState(945);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(946);
				match(T_LINES);
				setState(947);
				match(T_TERMINATED);
				setState(948);
				match(T_BY);
				setState(949);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(950);
				match(T_NULL);
				setState(951);
				match(T_DEFINED);
				setState(952);
				match(T_AS);
				setState(953);
				expr(0);
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

	public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HplsqlParser.T_TEXTIMAGE_ON, 0); }
		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mssql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_mssql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_mssql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_mssql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_table_options_mssql_item);
		try {
			setState(960);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				match(T_ON);
				setState(957);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(958);
				match(T_TEXTIMAGE_ON);
				setState(959);
				ident();
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

	public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_CHARSET() { return getToken(HplsqlParser.T_CHARSET, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_ENGINE() { return getToken(HplsqlParser.T_ENGINE, 0); }
		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mysql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_mysql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_mysql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_mysql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(989);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				match(T_AUTO_INCREMENT);
				setState(964);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(963);
					match(T_EQUAL);
					}
					break;
				}
				setState(966);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				match(T_COMMENT);
				setState(969);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(968);
					match(T_EQUAL);
					}
					break;
				}
				setState(971);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(972);
					match(T_DEFAULT);
					}
				}

				setState(978);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(975);
					match(T_CHARACTER);
					setState(976);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(977);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(981);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(980);
					match(T_EQUAL);
					}
					break;
				}
				setState(983);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(984);
				match(T_ENGINE);
				setState(986);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(985);
					match(T_EQUAL);
					}
					break;
				}
				setState(988);
				expr(0);
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

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_BIGINT() { return getToken(HplsqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HplsqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HplsqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BINARY_INTEGER() { return getToken(HplsqlParser.T_BINARY_INTEGER, 0); }
		public TerminalNode T_BIT() { return getToken(HplsqlParser.T_BIT, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HplsqlParser.T_DATETIME, 0); }
		public TerminalNode T_DEC() { return getToken(HplsqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HplsqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HplsqlParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(HplsqlParser.T_PRECISION, 0); }
		public TerminalNode T_FLOAT() { return getToken(HplsqlParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(HplsqlParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(HplsqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HplsqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HplsqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HplsqlParser.T_INTEGER, 0); }
		public TerminalNode T_NCHAR() { return getToken(HplsqlParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HplsqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NUMBER() { return getToken(HplsqlParser.T_NUMBER, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HplsqlParser.T_NUMERIC, 0); }
		public TerminalNode T_PLS_INTEGER() { return getToken(HplsqlParser.T_PLS_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(HplsqlParser.T_REAL, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HplsqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_VARYING() { return getToken(HplsqlParser.T_VARYING, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HplsqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HplsqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_INTEGER() { return getToken(HplsqlParser.T_SIMPLE_INTEGER, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HplsqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HplsqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_STRING() { return getToken(HplsqlParser.T_STRING, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HplsqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TINYINT() { return getToken(HplsqlParser.T_TINYINT, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HplsqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HplsqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(HplsqlParser.T_XML, 0); }
		public TerminalNode T_VOID() { return getToken(HplsqlParser.T_VOID, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TYPE() { return getToken(HplsqlParser.T_TYPE, 0); }
		public TerminalNode T_ROWTYPE() { return getToken(HplsqlParser.T_ROWTYPE, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dtype);
		int _la;
		try {
			setState(1037);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				match(T_CHAR);
				}
				break;
			case T_BIGINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(992);
				match(T_BIGINT);
				}
				break;
			case T_BINARY_DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(993);
				match(T_BINARY_DOUBLE);
				}
				break;
			case T_BINARY_FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(994);
				match(T_BINARY_FLOAT);
				}
				break;
			case T_BINARY_INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(995);
				match(T_BINARY_INTEGER);
				}
				break;
			case T_BIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(996);
				match(T_BIT);
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(997);
				match(T_DATE);
				}
				break;
			case T_DATETIME:
				enterOuterAlt(_localctx, 8);
				{
				setState(998);
				match(T_DATETIME);
				}
				break;
			case T_DEC:
				enterOuterAlt(_localctx, 9);
				{
				setState(999);
				match(T_DEC);
				}
				break;
			case T_DECIMAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(1000);
				match(T_DECIMAL);
				}
				break;
			case T_DOUBLE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1001);
				match(T_DOUBLE);
				setState(1003);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(1002);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 12);
				{
				setState(1005);
				match(T_FLOAT);
				}
				break;
			case T_INT:
				enterOuterAlt(_localctx, 13);
				{
				setState(1006);
				match(T_INT);
				}
				break;
			case T_INT2:
				enterOuterAlt(_localctx, 14);
				{
				setState(1007);
				match(T_INT2);
				}
				break;
			case T_INT4:
				enterOuterAlt(_localctx, 15);
				{
				setState(1008);
				match(T_INT4);
				}
				break;
			case T_INT8:
				enterOuterAlt(_localctx, 16);
				{
				setState(1009);
				match(T_INT8);
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 17);
				{
				setState(1010);
				match(T_INTEGER);
				}
				break;
			case T_NCHAR:
				enterOuterAlt(_localctx, 18);
				{
				setState(1011);
				match(T_NCHAR);
				}
				break;
			case T_NVARCHAR:
				enterOuterAlt(_localctx, 19);
				{
				setState(1012);
				match(T_NVARCHAR);
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 20);
				{
				setState(1013);
				match(T_NUMBER);
				}
				break;
			case T_NUMERIC:
				enterOuterAlt(_localctx, 21);
				{
				setState(1014);
				match(T_NUMERIC);
				}
				break;
			case T_PLS_INTEGER:
				enterOuterAlt(_localctx, 22);
				{
				setState(1015);
				match(T_PLS_INTEGER);
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 23);
				{
				setState(1016);
				match(T_REAL);
				}
				break;
			case T_RESULT_SET_LOCATOR:
				enterOuterAlt(_localctx, 24);
				{
				setState(1017);
				match(T_RESULT_SET_LOCATOR);
				setState(1018);
				match(T_VARYING);
				}
				break;
			case T_SIMPLE_FLOAT:
				enterOuterAlt(_localctx, 25);
				{
				setState(1019);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case T_SIMPLE_DOUBLE:
				enterOuterAlt(_localctx, 26);
				{
				setState(1020);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case T_SIMPLE_INTEGER:
				enterOuterAlt(_localctx, 27);
				{
				setState(1021);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case T_SMALLINT:
				enterOuterAlt(_localctx, 28);
				{
				setState(1022);
				match(T_SMALLINT);
				}
				break;
			case T_SMALLDATETIME:
				enterOuterAlt(_localctx, 29);
				{
				setState(1023);
				match(T_SMALLDATETIME);
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 30);
				{
				setState(1024);
				match(T_STRING);
				}
				break;
			case T_SYS_REFCURSOR:
				enterOuterAlt(_localctx, 31);
				{
				setState(1025);
				match(T_SYS_REFCURSOR);
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 32);
				{
				setState(1026);
				match(T_TIMESTAMP);
				}
				break;
			case T_TINYINT:
				enterOuterAlt(_localctx, 33);
				{
				setState(1027);
				match(T_TINYINT);
				}
				break;
			case T_VARCHAR:
				enterOuterAlt(_localctx, 34);
				{
				setState(1028);
				match(T_VARCHAR);
				}
				break;
			case T_VARCHAR2:
				enterOuterAlt(_localctx, 35);
				{
				setState(1029);
				match(T_VARCHAR2);
				}
				break;
			case T_XML:
				enterOuterAlt(_localctx, 36);
				{
				setState(1030);
				match(T_XML);
				}
				break;
			case T_VOID:
				enterOuterAlt(_localctx, 37);
				{
				setState(1031);
				match(T_VOID);
				}
				break;
			case L_ID:
				enterOuterAlt(_localctx, 38);
				{
				setState(1032);
				ident();
				setState(1035);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(1033);
					match(T__0);
					setState(1034);
					_la = _input.LA(1);
					if ( !(_la==T_ROWTYPE || _la==T_TYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
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

	public static class Dtype_lenContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(HplsqlParser.T_BYTE, 0); }
		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype_len(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype_len(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			match(T_OPEN_P);
			setState(1040);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1041);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1044);
				match(T_COMMA);
				setState(1045);
				match(L_INT);
				}
			}

			setState(1048);
			match(T_CLOSE_P);
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

	public static class Dtype_attrContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CASESPECIFIC() { return getToken(HplsqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dtype_attr);
		int _la;
		try {
			setState(1061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1050);
					match(T_NOT);
					}
				}

				setState(1053);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1054);
				match(T_CHARACTER);
				setState(1055);
				match(T_SET);
				setState(1056);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1057);
					match(T_NOT);
					}
				}

				setState(1060);
				_la = _input.LA(1);
				if ( !(_la==T_CASESPECIFIC || _la==T_CS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class Dtype_defaultContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dtype_default);
		int _la;
		try {
			setState(1075);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1063);
					match(T_COLON);
					}
				}

				setState(1066);
				match(T_EQUAL);
				setState(1067);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1068);
					match(T_WITH);
					}
				}

				setState(1071);
				match(T_DEFAULT);
				setState(1073);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1072);
					expr(0);
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

	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(HplsqlParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public List<Create_database_optionContext> create_database_option() {
			return getRuleContexts(Create_database_optionContext.class);
		}
		public Create_database_optionContext create_database_option(int i) {
			return getRuleContext(Create_database_optionContext.class,i);
		}
		public Error_create_database_stmtContext error_create_database_stmt() {
			return getRuleContext(Error_create_database_stmtContext.class,0);
		}
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_database_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			setState(1092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1077);
				match(T_CREATE);
				setState(1078);
				_la = _input.LA(1);
				if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1082);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1079);
					match(T_IF);
					setState(1080);
					match(T_NOT);
					setState(1081);
					match(T_EXISTS);
					}
					break;
				}
				setState(1084);
				expr(0);
				setState(1088);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1085);
						create_database_option();
						}
						} 
					}
					setState(1090);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1091);
				error_create_database_stmt();
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

	public static class Create_database_optionContext extends ParserRuleContext {
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_LOCATION() { return getToken(HplsqlParser.T_LOCATION, 0); }
		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_database_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_database_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_database_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_create_database_option);
		try {
			setState(1098);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				match(T_COMMENT);
				setState(1095);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1096);
				match(T_LOCATION);
				setState(1097);
				expr(0);
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

	public static class Error_create_database_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public List<Create_database_optionContext> create_database_option() {
			return getRuleContexts(Create_database_optionContext.class);
		}
		public Create_database_optionContext create_database_option(int i) {
			return getRuleContext(Create_database_optionContext.class,i);
		}
		public TerminalNode T_DATABASE() { return getToken(HplsqlParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public Error_create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_create_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterError_create_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitError_create_database_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitError_create_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_create_database_stmtContext error_create_database_stmt() throws RecognitionException {
		Error_create_database_stmtContext _localctx = new Error_create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_error_create_database_stmt);
		int _la;
		try {
			int _alt;
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1100);
				match(T_CREATE);
				setState(1104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1101);
					match(T_IF);
					setState(1102);
					match(T_NOT);
					setState(1103);
					match(T_EXISTS);
					}
					break;
				}
				setState(1106);
				expr(0);
				setState(1110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1107);
						create_database_option();
						}
						} 
					}
					setState(1112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1113);
				_la = _input.LA(1);
				if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1114);
					match(T_IF);
					setState(1115);
					match(T_NOT);
					setState(1116);
					match(T_EXISTS);
					}
					break;
				}
				setState(1119);
				expr(0);
				setState(1123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1120);
						create_database_option();
						}
						} 
					}
					setState(1125);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1126);
				_la = _input.LA(1);
				if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1127);
				match(T_CREATE);
				setState(1131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1128);
					match(T_IF);
					setState(1129);
					match(T_NOT);
					setState(1130);
					match(T_EXISTS);
					}
					break;
				}
				setState(1133);
				expr(0);
				setState(1137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1134);
						create_database_option();
						}
						} 
					}
					setState(1139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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

	public static class Function_stmtContext extends ParserRuleContext {
		public FunctionNode astNode;
		public DtypeContext dtype;
		public IdentContext ident;
		public Return_paramContext parm;
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_OPEN_B() { return getToken(HplsqlParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(HplsqlParser.T_CLOSE_B, 0); }
		public Cpp_smtContext cpp_smt() {
			return getRuleContext(Cpp_smtContext.class,0);
		}
		public Def_returnContext def_return() {
			return getRuleContext(Def_returnContext.class,0);
		}
		public Return_paramContext return_param() {
			return getRuleContext(Return_paramContext.class,0);
		}
		public Function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFunction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFunction_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFunction_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_stmtContext function_stmt() throws RecognitionException {
		Function_stmtContext _localctx = new Function_stmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			FunChild = new ArrayList<>();
			setState(1143);
			((Function_stmtContext)_localctx).dtype = dtype();
			setState(1144);
			((Function_stmtContext)_localctx).ident = ident();
			setState(1145);
			match(T_OPEN_P);
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T_BIGINT - 19)) | (1L << (T_BINARY_DOUBLE - 19)) | (1L << (T_BINARY_FLOAT - 19)) | (1L << (T_BINARY_INTEGER - 19)) | (1L << (T_BIT - 19)) | (1L << (T_CHAR - 19)) | (1L << (T_DATE - 19)) | (1L << (T_DATETIME - 19)) | (1L << (T_DEC - 19)) | (1L << (T_DECIMAL - 19)))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T_DOUBLE - 87)) | (1L << (T_INT2 - 87)) | (1L << (T_INT4 - 87)) | (1L << (T_INT8 - 87)) | (1L << (T_INTEGER - 87)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (T_NCHAR - 179)) | (1L << (T_NVARCHAR - 179)) | (1L << (T_NUMERIC - 179)) | (1L << (T_NUMBER - 179)) | (1L << (T_PLS_INTEGER - 179)) | (1L << (T_REAL - 179)) | (1L << (T_RESULT_SET_LOCATOR - 179)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SIMPLE_INTEGER - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TINYINT - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_XML - 256)) | (1L << (T_VOID - 256)))) != 0) || ((((_la - 364)) & ~0x3f) == 0 && ((1L << (_la - 364)) & ((1L << (L_ID - 364)) | (1L << (T_FLOAT - 364)) | (1L << (T_INT - 364)) | (1L << (T_STRING - 364)))) != 0)) {
				{
				setState(1146);
				((Function_stmtContext)_localctx).parm = return_param();
				}
			}

			setState(1149);
			match(T_CLOSE_P);
			setState(1150);
			match(T_OPEN_B);
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1151);
				cpp_smt(0);
				}
				break;
			}
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_RETURN) {
				{
				setState(1154);
				def_return();
				}
			}

			setState(1157);
			match(T_CLOSE_B);

			                /*if(types.find_typ((((Function_stmtContext)_localctx).dtype!=null?_input.getText(((Function_stmtContext)_localctx).dtype.start,((Function_stmtContext)_localctx).dtype.stop):null))){
			                    ((Function_stmtContext)_localctx).astNode =  new FunctionNode((((Function_stmtContext)_localctx).ident!=null?_input.getText(((Function_stmtContext)_localctx).ident.start,((Function_stmtContext)_localctx).ident.stop):null),null,null,((Function_stmtContext)_localctx).parm.varNode,(((Function_stmtContext)_localctx).dtype!=null?_input.getText(((Function_stmtContext)_localctx).dtype.start,((Function_stmtContext)_localctx).dtype.stop):null));
			                     for(Node n :FunChild){
			                      n.setParent(_localctx.astNode);
			                  }
			                    _localctx.astNode.setChild(FunChild);
			                }else{
			                    ((Function_stmtContext)_localctx).astNode = null;
			                    System.out.print("Error Type :" + (((Function_stmtContext)_localctx).dtype!=null?_input.getText(((Function_stmtContext)_localctx).dtype.start,((Function_stmtContext)_localctx).dtype.stop):null) + " Not found!");
			                }*/



			            
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

	public static class Def_returnContext extends ParserRuleContext {
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Def_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDef_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDef_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDef_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_returnContext def_return() throws RecognitionException {
		Def_returnContext _localctx = new Def_returnContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_def_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			match(T_RETURN);
			setState(1161);
			ident();
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

	public static class Return_paramContext extends ParserRuleContext {
		public ArrayList<VarDecleration> varNode;
		public Return_param_itemContext p1;
		public Return_param_itemContext p2;
		public List<Return_param_itemContext> return_param_item() {
			return getRuleContexts(Return_param_itemContext.class);
		}
		public Return_param_itemContext return_param_item(int i) {
			return getRuleContext(Return_param_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Return_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterReturn_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitReturn_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitReturn_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_paramContext return_param() throws RecognitionException {
		Return_paramContext _localctx = new Return_paramContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_return_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			((Return_paramContext)_localctx).p1 = return_param_item();
			((Return_paramContext)_localctx).varNode =  ((Return_paramContext)_localctx).p1.varNode;
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1165);
				match(T_COMMA);
				setState(1166);
				((Return_paramContext)_localctx).p2 = return_param_item();
				 _localctx.varNode.addAll(((Return_paramContext)_localctx).p2.varNode); 
				}
				}
				setState(1173);
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

	public static class Return_param_itemContext extends ParserRuleContext {
		public ArrayList<VarDecleration> varNode;
		public DtypeContext dtype;
		public IdentContext ident;
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Return_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_param_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterReturn_param_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitReturn_param_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitReturn_param_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_param_itemContext return_param_item() throws RecognitionException {
		Return_param_itemContext _localctx = new Return_param_itemContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_return_param_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			((Return_param_itemContext)_localctx).dtype = dtype();
			setState(1175);
			((Return_param_itemContext)_localctx).ident = ident();

			   /* if(types.find_typ((((Return_param_itemContext)_localctx).dtype!=null?_input.getText(((Return_param_itemContext)_localctx).dtype.start,((Return_param_itemContext)_localctx).dtype.stop):null))){
			        ((Return_param_itemContext)_localctx).varNode =  new ArrayList<VarDecleration>();
			             VarDecleration n = new VarDecleration((((Return_param_itemContext)_localctx).ident!=null?_input.getText(((Return_param_itemContext)_localctx).ident.start,((Return_param_itemContext)_localctx).ident.stop):null),(((Return_param_itemContext)_localctx).dtype!=null?_input.getText(((Return_param_itemContext)_localctx).dtype.start,((Return_param_itemContext)_localctx).dtype.stop):null));

			             _localctx.varNode.add(n);

			    }else{

			        System.out.print("Error Type :" + (((Return_param_itemContext)_localctx).dtype!=null?_input.getText(((Return_param_itemContext)_localctx).dtype.start,((Return_param_itemContext)_localctx).dtype.stop):null) + " Not found!");
			    }*/

			   
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

	public static class Cpp_smtContext extends ParserRuleContext {
		public Cpp_for_stmtContext cpp_for_stmt;
		public Cpp_var_declerationContext cpp_var_decleration;
		public Select_stmtContext select_stmt;
		public Create_table_stmtContext create_table_stmt;
		public Cpp_smtContext cpp_smt() {
			return getRuleContext(Cpp_smtContext.class,0);
		}
		public Cpp_if_stmtContext cpp_if_stmt() {
			return getRuleContext(Cpp_if_stmtContext.class,0);
		}
		public Cpp_for_stmtContext cpp_for_stmt() {
			return getRuleContext(Cpp_for_stmtContext.class,0);
		}
		public Cpp_assignment_stmtContext cpp_assignment_stmt() {
			return getRuleContext(Cpp_assignment_stmtContext.class,0);
		}
		public Cpp_var_declerationContext cpp_var_decleration() {
			return getRuleContext(Cpp_var_declerationContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Cpp_smtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_smt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_smt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_smt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCpp_smt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cpp_smtContext cpp_smt() throws RecognitionException {
		return cpp_smt(0);
	}

	private Cpp_smtContext cpp_smt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Cpp_smtContext _localctx = new Cpp_smtContext(_ctx, _parentState);
		Cpp_smtContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_cpp_smt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						_localctx = new Cpp_smtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cpp_smt);
						setState(1179);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1180);
						cpp_if_stmt();
						}
						break;
					case 2:
						{
						_localctx = new Cpp_smtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cpp_smt);
						setState(1181);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1182);
						((Cpp_smtContext)_localctx).cpp_for_stmt = cpp_for_stmt();
						FunChild.add(((Cpp_smtContext)_localctx).cpp_for_stmt.forNode);
						}
						break;
					case 3:
						{
						_localctx = new Cpp_smtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cpp_smt);
						setState(1185);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1186);
						cpp_assignment_stmt();
						}
						break;
					case 4:
						{
						_localctx = new Cpp_smtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cpp_smt);
						setState(1187);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1188);
						((Cpp_smtContext)_localctx).cpp_var_decleration = cpp_var_decleration();
						FunChild.add(((Cpp_smtContext)_localctx).cpp_var_decleration.VarDecNode);
						}
						break;
					case 5:
						{
						_localctx = new Cpp_smtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cpp_smt);
						setState(1191);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1192);
						((Cpp_smtContext)_localctx).select_stmt = select_stmt();
						FunChild.add(((Cpp_smtContext)_localctx).select_stmt.b);
						}
						break;
					case 6:
						{
						_localctx = new Cpp_smtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cpp_smt);
						setState(1195);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1196);
						((Cpp_smtContext)_localctx).create_table_stmt = create_table_stmt();
						FunChild.add(((Cpp_smtContext)_localctx).create_table_stmt.tableNode);
						}
						break;
					}
					} 
				}
				setState(1203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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

	public static class Cpp_smt_forContext extends ParserRuleContext {
		public Cpp_for_stmtContext cpp_for_stmt;
		public Cpp_var_declerationContext cpp_var_decleration;
		public Select_stmtContext select_stmt;
		public Create_table_stmtContext create_table_stmt;
		public Cpp_smtContext cpp_smt() {
			return getRuleContext(Cpp_smtContext.class,0);
		}
		public Cpp_if_stmtContext cpp_if_stmt() {
			return getRuleContext(Cpp_if_stmtContext.class,0);
		}
		public Cpp_for_stmtContext cpp_for_stmt() {
			return getRuleContext(Cpp_for_stmtContext.class,0);
		}
		public Cpp_assignment_stmtContext cpp_assignment_stmt() {
			return getRuleContext(Cpp_assignment_stmtContext.class,0);
		}
		public Cpp_var_declerationContext cpp_var_decleration() {
			return getRuleContext(Cpp_var_declerationContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Cpp_smt_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_smt_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_smt_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_smt_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCpp_smt_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cpp_smt_forContext cpp_smt_for() throws RecognitionException {
		Cpp_smt_forContext _localctx = new Cpp_smt_forContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_cpp_smt_for);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1205);
				cpp_smt(0);
				setState(1206);
				cpp_if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1208);
				cpp_smt(0);
				setState(1209);
				((Cpp_smt_forContext)_localctx).cpp_for_stmt = cpp_for_stmt();
				ForChild.add(((Cpp_smt_forContext)_localctx).cpp_for_stmt.forNode);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1212);
				cpp_smt(0);
				setState(1213);
				cpp_assignment_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1215);
				cpp_smt(0);
				setState(1216);
				((Cpp_smt_forContext)_localctx).cpp_var_decleration = cpp_var_decleration();
				ForChild.add(((Cpp_smt_forContext)_localctx).cpp_var_decleration.VarDecNode);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1219);
				cpp_smt(0);
				setState(1220);
				((Cpp_smt_forContext)_localctx).select_stmt = select_stmt();
				ForChild.add(((Cpp_smt_forContext)_localctx).select_stmt.b);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1223);
				cpp_smt(0);
				setState(1224);
				((Cpp_smt_forContext)_localctx).create_table_stmt = create_table_stmt();
				ForChild.add(((Cpp_smt_forContext)_localctx).create_table_stmt.tableNode);
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

	public static class Cpp_if_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Cpp_smtContext cpp_smt() {
			return getRuleContext(Cpp_smtContext.class,0);
		}
		public List<IfexContext> ifex() {
			return getRuleContexts(IfexContext.class);
		}
		public IfexContext ifex(int i) {
			return getRuleContext(IfexContext.class,i);
		}
		public List<Def_else_ifContext> def_else_if() {
			return getRuleContexts(Def_else_ifContext.class);
		}
		public Def_else_ifContext def_else_if(int i) {
			return getRuleContext(Def_else_ifContext.class,i);
		}
		public Def_elseContext def_else() {
			return getRuleContext(Def_elseContext.class,0);
		}
		public List<TerminalNode> T_AND_AND() { return getTokens(HplsqlParser.T_AND_AND); }
		public TerminalNode T_AND_AND(int i) {
			return getToken(HplsqlParser.T_AND_AND, i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(HplsqlParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(HplsqlParser.T_PIPE, i);
		}
		public TerminalNode T_OPEN_B() { return getToken(HplsqlParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(HplsqlParser.T_CLOSE_B, 0); }
		public Cpp_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_if_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_if_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCpp_if_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cpp_if_stmtContext cpp_if_stmt() throws RecognitionException {
		Cpp_if_stmtContext _localctx = new Cpp_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_cpp_if_stmt);
		int _la;
		try {
			int _alt;
			setState(1273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1229);
				match(T_IF);
				setState(1230);
				match(T_OPEN_P);
				{
				setState(1231);
				ifex();
				setState(1236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_PIPE || _la==T_AND_AND) {
					{
					{
					setState(1232);
					_la = _input.LA(1);
					if ( !(_la==T_PIPE || _la==T_AND_AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1233);
					ifex();
					}
					}
					setState(1238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1239);
				match(T_CLOSE_P);
				setState(1240);
				cpp_smt(0);
				setState(1244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1241);
						def_else_if();
						}
						} 
					}
					setState(1246);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				}
				setState(1248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1247);
					def_else();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1250);
				match(T_IF);
				setState(1251);
				match(T_OPEN_P);
				{
				setState(1252);
				ifex();
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_PIPE || _la==T_AND_AND) {
					{
					{
					setState(1253);
					_la = _input.LA(1);
					if ( !(_la==T_PIPE || _la==T_AND_AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1254);
					ifex();
					}
					}
					setState(1259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1260);
				match(T_CLOSE_P);
				setState(1261);
				match(T_OPEN_B);
				setState(1262);
				cpp_smt(0);
				setState(1263);
				match(T_CLOSE_B);
				setState(1267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1264);
						def_else_if();
						}
						} 
					}
					setState(1269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
				setState(1271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1270);
					def_else();
					}
					break;
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

	public static class Def_else_ifContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Cpp_if_stmtContext cpp_if_stmt() {
			return getRuleContext(Cpp_if_stmtContext.class,0);
		}
		public Def_else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_else_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDef_else_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDef_else_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDef_else_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_else_ifContext def_else_if() throws RecognitionException {
		Def_else_ifContext _localctx = new Def_else_ifContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_def_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(T_ELSE);
			setState(1276);
			cpp_if_stmt();
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

	public static class Def_elseContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public TerminalNode T_OPEN_B() { return getToken(HplsqlParser.T_OPEN_B, 0); }
		public Cpp_smtContext cpp_smt() {
			return getRuleContext(Cpp_smtContext.class,0);
		}
		public TerminalNode T_CLOSE_B() { return getToken(HplsqlParser.T_CLOSE_B, 0); }
		public Def_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDef_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDef_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDef_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_elseContext def_else() throws RecognitionException {
		Def_elseContext _localctx = new Def_elseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_def_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			match(T_ELSE);
			setState(1279);
			match(T_OPEN_B);
			setState(1280);
			cpp_smt(0);
			setState(1281);
			match(T_CLOSE_B);
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

	public static class IfexContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public IfexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIfex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIfex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIfex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfexContext ifex() throws RecognitionException {
		IfexContext _localctx = new IfexContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ifex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			ident();
			setState(1284);
			op();
			setState(1287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(1285);
				ident();
				}
				break;
			case L_INT:
				{
				setState(1286);
				match(L_INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode T_EQUAL2() { return getToken(HplsqlParser.T_EQUAL2, 0); }
		public TerminalNode T_AND_AND() { return getToken(HplsqlParser.T_AND_AND, 0); }
		public TerminalNode T_PIPE() { return getToken(HplsqlParser.T_PIPE, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_ADD() { return getToken(HplsqlParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(HplsqlParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_GREATER() { return getToken(HplsqlParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(HplsqlParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LESS() { return getToken(HplsqlParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(HplsqlParser.T_LESSEQUAL, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_op);
		try {
			setState(1301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
			case L_INT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1290);
				match(T_EQUAL2);
				}
				break;
			case T_AND_AND:
				enterOuterAlt(_localctx, 3);
				{
				setState(1291);
				match(T_AND_AND);
				}
				break;
			case T_PIPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1292);
				match(T_PIPE);
				}
				break;
			case T_EQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1293);
				match(T_EQUAL);
				}
				break;
			case T_ADD:
				enterOuterAlt(_localctx, 6);
				{
				setState(1294);
				match(T_ADD);
				}
				break;
			case T_SUB:
				enterOuterAlt(_localctx, 7);
				{
				setState(1295);
				match(T_SUB);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 8);
				{
				setState(1296);
				match(T_NOTEQUAL2);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 9);
				{
				setState(1297);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(1298);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 11);
				{
				setState(1299);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 12);
				{
				setState(1300);
				match(T_LESSEQUAL);
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

	public static class Cpp_assignment_stmtContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode L_DEC() { return getToken(HplsqlParser.L_DEC, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Cpp_assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_assignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_assignment_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCpp_assignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cpp_assignment_stmtContext cpp_assignment_stmt() throws RecognitionException {
		Cpp_assignment_stmtContext _localctx = new Cpp_assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_cpp_assignment_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			ident();
			setState(1304);
			match(T_EQUAL);
			setState(1316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(1305);
				ident();
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1306);
					match(T_OPEN_P);
					setState(1308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==L_ID) {
						{
						setState(1307);
						ident();
						}
					}

					setState(1310);
					match(T_CLOSE_P);
					}
				}

				}
				break;
			case L_INT:
				{
				setState(1313);
				match(L_INT);
				}
				break;
			case L_DEC:
				{
				setState(1314);
				match(L_DEC);
				}
				break;
			case T_SEL:
			case T_SELECT:
			case T_WITH:
			case T_OPEN_P:
				{
				setState(1315);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1318);
			match(T_SEMICOLON);
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

	public static class Cpp_var_declerationContext extends ParserRuleContext {
		public VarDecleration VarDecNode;
		public DtypeContext dtype;
		public IdentContext ident;
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public Assigned_stmtContext assigned_stmt() {
			return getRuleContext(Assigned_stmtContext.class,0);
		}
		public Cpp_var_declerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_var_decleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_var_decleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_var_decleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCpp_var_decleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cpp_var_declerationContext cpp_var_decleration() throws RecognitionException {
		Cpp_var_declerationContext _localctx = new Cpp_var_declerationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_cpp_var_decleration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			((Cpp_var_declerationContext)_localctx).dtype = dtype();
			setState(1321);
			((Cpp_var_declerationContext)_localctx).ident = ident();
			setState(1323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(1322);
				assigned_stmt();
				}
			}

			setState(1325);
			match(T_SEMICOLON);

			                                        if(types.find_typ((((Cpp_var_declerationContext)_localctx).dtype!=null?_input.getText(((Cpp_var_declerationContext)_localctx).dtype.start,((Cpp_var_declerationContext)_localctx).dtype.stop):null))){
			                                            ((Cpp_var_declerationContext)_localctx).VarDecNode =  new VarDecleration((((Cpp_var_declerationContext)_localctx).ident!=null?_input.getText(((Cpp_var_declerationContext)_localctx).ident.start,((Cpp_var_declerationContext)_localctx).ident.stop):null),(((Cpp_var_declerationContext)_localctx).dtype!=null?_input.getText(((Cpp_var_declerationContext)_localctx).dtype.start,((Cpp_var_declerationContext)_localctx).dtype.stop):null));

			                                        }else{
			                                            ((Cpp_var_declerationContext)_localctx).VarDecNode = null;
			                                            System.out.print("Error Type :" + (((Cpp_var_declerationContext)_localctx).dtype!=null?_input.getText(((Cpp_var_declerationContext)_localctx).dtype.start,((Cpp_var_declerationContext)_localctx).dtype.stop):null) + " Not found!");
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

	public static class Assigned_stmtContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode L_DEC() { return getToken(HplsqlParser.L_DEC, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Assigned_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigned_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAssigned_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAssigned_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssigned_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assigned_stmtContext assigned_stmt() throws RecognitionException {
		Assigned_stmtContext _localctx = new Assigned_stmtContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_assigned_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			match(T_EQUAL);
			setState(1340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(1329);
				ident();
				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1330);
					match(T_OPEN_P);
					setState(1332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==L_ID) {
						{
						setState(1331);
						ident();
						}
					}

					setState(1334);
					match(T_CLOSE_P);
					}
				}

				}
				break;
			case L_INT:
				{
				setState(1337);
				match(L_INT);
				}
				break;
			case L_DEC:
				{
				setState(1338);
				match(L_DEC);
				}
				break;
			case T_SEL:
			case T_SELECT:
			case T_WITH:
			case T_OPEN_P:
				{
				setState(1339);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Cpp_for_stmtContext extends ParserRuleContext {
		public ForNode forNode;
		public Forhead1Context forhead1;
		public Bool_expr_binary_operatorContext bool_expr_binary_operator;
		public For_inc_decContext for_inc_dec;
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Forhead1Context forhead1() {
			return getRuleContext(Forhead1Context.class,0);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public For_inc_decContext for_inc_dec() {
			return getRuleContext(For_inc_decContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_OPEN_B() { return getToken(HplsqlParser.T_OPEN_B, 0); }
		public Cpp_smt_forContext cpp_smt_for() {
			return getRuleContext(Cpp_smt_forContext.class,0);
		}
		public TerminalNode T_CLOSE_B() { return getToken(HplsqlParser.T_CLOSE_B, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode T_DOT() { return getToken(HplsqlParser.T_DOT, 0); }
		public Cpp_smtContext cpp_smt() {
			return getRuleContext(Cpp_smtContext.class,0);
		}
		public Cpp_for_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_for_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_for_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCpp_for_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cpp_for_stmtContext cpp_for_stmt() throws RecognitionException {
		Cpp_for_stmtContext _localctx = new Cpp_for_stmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_cpp_for_stmt);
		int _la;
		try {
			setState(1371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				ForChild = new ArrayList<>();
				setState(1343);
				match(T_FOR);
				setState(1344);
				match(T_OPEN_P);
				setState(1345);
				((Cpp_for_stmtContext)_localctx).forhead1 = forhead1();
				setState(1346);
				match(T_SEMICOLON);
				setState(1347);
				ident();
				setState(1348);
				((Cpp_for_stmtContext)_localctx).bool_expr_binary_operator = bool_expr_binary_operator();
				setState(1355);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_INT:
					{
					setState(1349);
					match(L_INT);
					}
					break;
				case L_ID:
					{
					setState(1350);
					ident();
					setState(1353);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_DOT) {
						{
						setState(1351);
						match(T_DOT);
						setState(1352);
						ident();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1357);
				match(T_SEMICOLON);
				setState(1358);
				((Cpp_for_stmtContext)_localctx).for_inc_dec = for_inc_dec();
				setState(1359);
				match(T_CLOSE_P);
				setState(1360);
				match(T_OPEN_B);
				setState(1361);
				cpp_smt_for();
				setState(1362);
				match(T_CLOSE_B);

				                ((Cpp_for_stmtContext)_localctx).forNode =  new ForNode((((Cpp_for_stmtContext)_localctx).forhead1!=null?_input.getText(((Cpp_for_stmtContext)_localctx).forhead1.start,((Cpp_for_stmtContext)_localctx).forhead1.stop):null),(((Cpp_for_stmtContext)_localctx).bool_expr_binary_operator!=null?_input.getText(((Cpp_for_stmtContext)_localctx).bool_expr_binary_operator.start,((Cpp_for_stmtContext)_localctx).bool_expr_binary_operator.stop):null),(((Cpp_for_stmtContext)_localctx).for_inc_dec!=null?_input.getText(((Cpp_for_stmtContext)_localctx).for_inc_dec.start,((Cpp_for_stmtContext)_localctx).for_inc_dec.stop):null));
				                _localctx.forNode.setNodeName("FOR");
				                _localctx.forNode.setForChiled(ForChild);



				            
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1365);
				match(T_FOR);
				setState(1366);
				match(T_OPEN_P);
				setState(1367);
				match(T_SEMICOLON);
				setState(1368);
				match(T_SEMICOLON);
				setState(1369);
				match(T_CLOSE_P);
				setState(1370);
				cpp_smt(0);
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

	public static class For_inc_decContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<TerminalNode> T_ADD() { return getTokens(HplsqlParser.T_ADD); }
		public TerminalNode T_ADD(int i) {
			return getToken(HplsqlParser.T_ADD, i);
		}
		public List<TerminalNode> T_SUB() { return getTokens(HplsqlParser.T_SUB); }
		public TerminalNode T_SUB(int i) {
			return getToken(HplsqlParser.T_SUB, i);
		}
		public For_inc_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_inc_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFor_inc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFor_inc_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFor_inc_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_inc_decContext for_inc_dec() throws RecognitionException {
		For_inc_decContext _localctx = new For_inc_decContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_for_inc_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				{
				setState(1373);
				ident();
				setState(1374);
				match(T_ADD);
				setState(1375);
				match(T_ADD);
				}
				}
				break;
			case 2:
				{
				{
				setState(1377);
				ident();
				setState(1378);
				match(T_SUB);
				setState(1379);
				match(T_SUB);
				}
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

	public static class Forhead1Context extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Forhead1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forhead1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterForhead1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitForhead1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitForhead1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forhead1Context forhead1() throws RecognitionException {
		Forhead1Context _localctx = new Forhead1Context(_ctx, getState());
		enterRule(_localctx, 138, RULE_forhead1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1383);
				dtype();
				}
				break;
			}
			setState(1386);
			ident();
			}
			setState(1388);
			match(T_EQUAL);
			setState(1391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_INT:
				{
				setState(1389);
				match(L_INT);
				}
				break;
			case L_ID:
				{
				setState(1390);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Create_function_stmtContext extends ParserRuleContext {
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_function_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1393);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1394);
				match(T_CREATE);
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1395);
					match(T_OR);
					setState(1396);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1399);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
			}
			setState(1402);
			match(T_FUNCTION);
			setState(1403);
			ident();
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1404);
				create_routine_params();
				}
				break;
			}
			setState(1407);
			create_function_return();
			setState(1409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS || _la==T_IS) {
				{
				setState(1408);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1411);
				declare_block_inplace();
				}
				break;
			}
			setState(1414);
			single_block_stmt();
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

	public static class Create_function_returnContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HplsqlParser.T_RETURNS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_function_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_function_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_function_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1417);
			dtype();
			setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1418);
				dtype_len();
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

	public static class Create_package_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_specContext package_spec() {
			return getRuleContext(Package_specContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_package_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_package_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_package_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1421);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1422);
				match(T_CREATE);
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1423);
					match(T_OR);
					setState(1424);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1427);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1430);
			match(T_PACKAGE);
			setState(1431);
			ident();
			setState(1432);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1433);
			package_spec();
			setState(1434);
			match(T_END);
			setState(1438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1435);
				ident();
				setState(1436);
				match(T_SEMICOLON);
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

	public static class Package_specContext extends ParserRuleContext {
		public List<Package_spec_itemContext> package_spec_item() {
			return getRuleContexts(Package_spec_itemContext.class);
		}
		public Package_spec_itemContext package_spec_item(int i) {
			return getRuleContext(Package_spec_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_package_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			package_spec_item();
			setState(1441);
			match(T_SEMICOLON);
			setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_CONTINUE || _la==T_CURSOR || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (T_EXIT - 103)) | (1L << (T_FUNCTION - 103)) | (1L << (T_GLOBAL - 103)))) != 0) || _la==T_PROC || _la==T_PROCEDURE || _la==T_TEMPORARY || _la==L_ID) {
				{
				{
				setState(1442);
				package_spec_item();
				setState(1443);
				match(T_SEMICOLON);
				}
				}
				setState(1449);
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

	public static class Package_spec_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_spec_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_spec_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_spec_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_package_spec_item);
		int _la;
		try {
			setState(1463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CONTINUE:
			case T_CURSOR:
			case T_EXIT:
			case T_GLOBAL:
			case T_TEMPORARY:
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1450);
				declare_stmt_item();
				}
				break;
			case T_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1451);
				match(T_FUNCTION);
				setState(1452);
				ident();
				setState(1454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1453);
					create_routine_params();
					}
					break;
				}
				setState(1456);
				create_function_return();
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1458);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1459);
				ident();
				setState(1461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1460);
					create_routine_params();
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

	public static class Create_package_body_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public TerminalNode T_BODY() { return getToken(HplsqlParser.T_BODY, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_body_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_package_body_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_package_body_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_package_body_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1465);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1466);
				match(T_CREATE);
				setState(1469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1467);
					match(T_OR);
					setState(1468);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1471);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1474);
			match(T_PACKAGE);
			setState(1475);
			match(T_BODY);
			setState(1476);
			ident();
			setState(1477);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1478);
			package_body();
			setState(1479);
			match(T_END);
			setState(1483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1480);
				ident();
				setState(1481);
				match(T_SEMICOLON);
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

	public static class Package_bodyContext extends ParserRuleContext {
		public List<Package_body_itemContext> package_body_item() {
			return getRuleContexts(Package_body_itemContext.class);
		}
		public Package_body_itemContext package_body_item(int i) {
			return getRuleContext(Package_body_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			package_body_item();
			setState(1486);
			match(T_SEMICOLON);
			setState(1492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ALTER) | (1L << T_CONTINUE) | (1L << T_CREATE) | (1L << T_CURSOR))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (T_EXIT - 103)) | (1L << (T_FUNCTION - 103)) | (1L << (T_GLOBAL - 103)))) != 0) || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (T_PROC - 213)) | (1L << (T_PROCEDURE - 213)) | (1L << (T_REPLACE - 213)))) != 0) || _la==T_TEMPORARY || _la==L_ID) {
				{
				{
				setState(1487);
				package_body_item();
				setState(1488);
				match(T_SEMICOLON);
				}
				}
				setState(1494);
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

	public static class Package_body_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_body_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_body_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_body_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_package_body_item);
		try {
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1495);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1496);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1497);
				create_procedure_stmt();
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

	public static class Create_procedure_stmtContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Proc_blockContext proc_block() {
			return getRuleContext(Proc_blockContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Create_routine_optionsContext create_routine_options() {
			return getRuleContext(Create_routine_optionsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_procedure_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_procedure_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_procedure_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1500);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1501);
				match(T_CREATE);
				setState(1504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1502);
					match(T_OR);
					setState(1503);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1506);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1509);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1510);
			ident();
			setState(1512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1511);
				create_routine_params();
				}
				break;
			}
			setState(1515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DYNAMIC || _la==T_LANGUAGE || _la==T_RESULT || _la==T_SQL) {
				{
				setState(1514);
				create_routine_options();
				}
			}

			setState(1518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS || _la==T_IS) {
				{
				setState(1517);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1520);
				declare_block_inplace();
				}
				break;
			}
			setState(1524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1523);
				label();
				}
				break;
			}
			setState(1526);
			proc_block();
			setState(1530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1527);
				ident();
				setState(1528);
				match(T_SEMICOLON);
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

	public static class Create_routine_paramsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<Create_routine_param_itemContext> create_routine_param_item() {
			return getRuleContexts(Create_routine_param_itemContext.class);
		}
		public Create_routine_param_itemContext create_routine_param_item(int i) {
			return getRuleContext(Create_routine_param_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_create_routine_params);
		int _la;
		try {
			setState(1554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532);
				match(T_OPEN_P);
				setState(1533);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534);
				match(T_OPEN_P);
				setState(1535);
				create_routine_param_item();
				setState(1540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1536);
					match(T_COMMA);
					setState(1537);
					create_routine_param_item();
					}
					}
					setState(1542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1543);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1545);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1546);
				create_routine_param_item();
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1547);
					match(T_COMMA);
					setState(1548);
					create_routine_param_item();
					}
					}
					setState(1553);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Create_routine_param_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_OUT() { return getToken(HplsqlParser.T_OUT, 0); }
		public TerminalNode T_INOUT() { return getToken(HplsqlParser.T_INOUT, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_param_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_param_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_param_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_param_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_create_routine_param_item);
		int _la;
		try {
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1556);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1557);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1558);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1559);
					match(T_IN);
					setState(1560);
					match(T_OUT);
					}
					break;
				}
				setState(1563);
				ident();
				setState(1564);
				dtype();
				setState(1566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1565);
					dtype_len();
					}
				}

				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_CASESPECIFIC) | (1L << T_CHARACTER) | (1L << T_CS))) != 0) || _la==T_NOT || _la==T_NULL) {
					{
					{
					setState(1568);
					dtype_attr();
					}
					}
					setState(1573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT || ((((_la - 307)) & ~0x3f) == 0 && ((1L << (_la - 307)) & ((1L << (T_WITH - 307)) | (1L << (T_COLON - 307)) | (1L << (T_EQUAL - 307)))) != 0)) {
					{
					setState(1574);
					dtype_default();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1577);
				ident();
				setState(1583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1578);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1579);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1580);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1581);
					match(T_IN);
					setState(1582);
					match(T_OUT);
					}
					break;
				}
				setState(1585);
				dtype();
				setState(1587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1586);
					dtype_len();
					}
				}

				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_CASESPECIFIC) | (1L << T_CHARACTER) | (1L << T_CS))) != 0) || _la==T_NOT || _la==T_NULL) {
					{
					{
					setState(1589);
					dtype_attr();
					}
					}
					setState(1594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT || ((((_la - 307)) & ~0x3f) == 0 && ((1L << (_la - 307)) & ((1L << (T_WITH - 307)) | (1L << (T_COLON - 307)) | (1L << (T_EQUAL - 307)))) != 0)) {
					{
					setState(1595);
					dtype_default();
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

	public static class Create_routine_optionsContext extends ParserRuleContext {
		public List<Create_routine_optionContext> create_routine_option() {
			return getRuleContexts(Create_routine_optionContext.class);
		}
		public Create_routine_optionContext create_routine_option(int i) {
			return getRuleContext(Create_routine_optionContext.class,i);
		}
		public Create_routine_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionsContext create_routine_options() throws RecognitionException {
		Create_routine_optionsContext _localctx = new Create_routine_optionsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_create_routine_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1600);
				create_routine_option();
				}
				}
				setState(1603); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_DYNAMIC || _la==T_LANGUAGE || _la==T_RESULT || _la==T_SQL );
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

	public static class Create_routine_optionContext extends ParserRuleContext {
		public TerminalNode T_LANGUAGE() { return getToken(HplsqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_SQL() { return getToken(HplsqlParser.T_SQL, 0); }
		public TerminalNode T_SECURITY() { return getToken(HplsqlParser.T_SECURITY, 0); }
		public TerminalNode T_CREATOR() { return getToken(HplsqlParser.T_CREATOR, 0); }
		public TerminalNode T_DEFINER() { return getToken(HplsqlParser.T_DEFINER, 0); }
		public TerminalNode T_INVOKER() { return getToken(HplsqlParser.T_INVOKER, 0); }
		public TerminalNode T_OWNER() { return getToken(HplsqlParser.T_OWNER, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_SETS() { return getToken(HplsqlParser.T_SETS, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HplsqlParser.T_DYNAMIC, 0); }
		public Create_routine_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionContext create_routine_option() throws RecognitionException {
		Create_routine_optionContext _localctx = new Create_routine_optionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_create_routine_option);
		int _la;
		try {
			setState(1616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1605);
				match(T_LANGUAGE);
				setState(1606);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1607);
				match(T_SQL);
				setState(1608);
				match(T_SECURITY);
				setState(1609);
				_la = _input.LA(1);
				if ( !(_la==T_CREATOR || _la==T_DEFINER || _la==T_INVOKER || _la==T_OWNER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_DYNAMIC:
			case T_RESULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1610);
					match(T_DYNAMIC);
					}
				}

				setState(1613);
				match(T_RESULT);
				setState(1614);
				match(T_SETS);
				setState(1615);
				match(L_INT);
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

	public static class Collect_stats_clauseContext extends ParserRuleContext {
		public TerminalNode T_COLUMN() { return getToken(HplsqlParser.T_COLUMN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Collect_stats_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect_stats_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCollect_stats_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCollect_stats_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCollect_stats_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collect_stats_clauseContext collect_stats_clause() throws RecognitionException {
		Collect_stats_clauseContext _localctx = new Collect_stats_clauseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_collect_stats_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			match(T_COLUMN);
			setState(1619);
			match(T_OPEN_P);
			setState(1620);
			ident();
			setState(1625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1621);
				match(T_COMMA);
				setState(1622);
				ident();
				}
				}
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1628);
			match(T_CLOSE_P);
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

	public static class Cmp_sourceContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_AT() { return getToken(HplsqlParser.T_AT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Cmp_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCmp_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCmp_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCmp_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_sourceContext cmp_source() throws RecognitionException {
		Cmp_sourceContext _localctx = new Cmp_sourceContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_cmp_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(1630);
				table_name();
				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WHERE) {
					{
					setState(1631);
					where_clause();
					}
				}

				}
				break;
			case T_OPEN_P:
				{
				setState(1634);
				match(T_OPEN_P);
				setState(1635);
				select_stmt();
				setState(1636);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AT) {
				{
				setState(1640);
				match(T_AT);
				setState(1641);
				ident();
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

	public static class Copy_sourceContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Copy_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCopy_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCopy_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCopy_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_sourceContext copy_source() throws RecognitionException {
		Copy_sourceContext _localctx = new Copy_sourceContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_copy_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1644);
				file_name();
				}
				break;
			case 2:
				{
				setState(1645);
				expr(0);
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

	public static class Copy_targetContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Copy_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCopy_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCopy_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCopy_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_targetContext copy_target() throws RecognitionException {
		Copy_targetContext _localctx = new Copy_targetContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_copy_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1648);
				file_name();
				}
				break;
			case 2:
				{
				setState(1649);
				expr(0);
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

	public static class Copy_optionContext extends ParserRuleContext {
		public TerminalNode T_AT() { return getToken(HplsqlParser.T_AT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_BATCHSIZE() { return getToken(HplsqlParser.T_BATCHSIZE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DELIMITER() { return getToken(HplsqlParser.T_DELIMITER, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(HplsqlParser.T_SQLINSERT, 0); }
		public Copy_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCopy_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCopy_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCopy_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_optionContext copy_option() throws RecognitionException {
		Copy_optionContext _localctx = new Copy_optionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_copy_option);
		try {
			setState(1660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1652);
				match(T_AT);
				setState(1653);
				ident();
				}
				break;
			case T_BATCHSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1654);
				match(T_BATCHSIZE);
				setState(1655);
				expr(0);
				}
				break;
			case T_DELIMITER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1656);
				match(T_DELIMITER);
				setState(1657);
				expr(0);
				}
				break;
			case T_SQLINSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1658);
				match(T_SQLINSERT);
				setState(1659);
				ident();
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

	public static class Copy_file_optionContext extends ParserRuleContext {
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_IGNORE() { return getToken(HplsqlParser.T_IGNORE, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HplsqlParser.T_OVERWRITE, 0); }
		public Copy_file_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_file_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCopy_file_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCopy_file_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCopy_file_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_file_optionContext copy_file_option() throws RecognitionException {
		Copy_file_optionContext _localctx = new Copy_file_optionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_copy_file_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_IGNORE || _la==T_OVERWRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<Create_index_colContext> create_index_col() {
			return getRuleContexts(Create_index_colContext.class);
		}
		public Create_index_colContext create_index_col(int i) {
			return getRuleContext(Create_index_colContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			match(T_CREATE);
			setState(1666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1665);
				match(T_UNIQUE);
				}
			}

			setState(1668);
			match(T_INDEX);
			setState(1669);
			ident();
			setState(1670);
			match(T_ON);
			setState(1671);
			table_name();
			setState(1672);
			match(T_OPEN_P);
			setState(1673);
			create_index_col();
			setState(1678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1674);
				match(T_COMMA);
				setState(1675);
				create_index_col();
				}
				}
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1681);
			match(T_CLOSE_P);
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

	public static class Create_index_colContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ASC() { return getToken(HplsqlParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(HplsqlParser.T_DESC, 0); }
		public Create_index_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_index_col(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_index_col(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_index_col(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			ident();
			setState(1685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(1684);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class Index_storage_clauseContext extends ParserRuleContext {
		public Index_mssql_storage_clauseContext index_mssql_storage_clause() {
			return getRuleContext(Index_mssql_storage_clauseContext.class,0);
		}
		public Index_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIndex_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIndex_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIndex_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		Index_storage_clauseContext _localctx = new Index_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
			index_mssql_storage_clause();
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

	public static class Index_mssql_storage_clauseContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(HplsqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(HplsqlParser.T_EQUAL, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<Create_table_options_mssql_itemContext> create_table_options_mssql_item() {
			return getRuleContexts(Create_table_options_mssql_itemContext.class);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item(int i) {
			return getRuleContext(Create_table_options_mssql_itemContext.class,i);
		}
		public Index_mssql_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_mssql_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIndex_mssql_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIndex_mssql_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIndex_mssql_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		Index_mssql_storage_clauseContext _localctx = new Index_mssql_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_index_mssql_storage_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			match(T_WITH);
			setState(1690);
			match(T_OPEN_P);
			setState(1691);
			ident();
			setState(1692);
			match(T_EQUAL);
			setState(1693);
			ident();
			setState(1701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1694);
				match(T_COMMA);
				setState(1695);
				ident();
				setState(1696);
				match(T_EQUAL);
				setState(1697);
				ident();
				}
				}
				setState(1703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1704);
			match(T_CLOSE_P);
			setState(1708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ON || _la==T_TEXTIMAGE_ON) {
				{
				{
				setState(1705);
				create_table_options_mssql_item();
				}
				}
				setState(1710);
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

	public static class Set_session_optionContext extends ParserRuleContext {
		public Set_current_schema_optionContext set_current_schema_option() {
			return getRuleContext(Set_current_schema_optionContext.class,0);
		}
		public Set_mssql_session_optionContext set_mssql_session_option() {
			return getRuleContext(Set_mssql_session_optionContext.class,0);
		}
		public Set_teradata_session_optionContext set_teradata_session_option() {
			return getRuleContext(Set_teradata_session_optionContext.class,0);
		}
		public Set_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSet_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSet_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSet_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_session_optionContext set_session_option() throws RecognitionException {
		Set_session_optionContext _localctx = new Set_session_optionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_set_session_option);
		try {
			setState(1714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_SCHEMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1711);
				set_current_schema_option();
				}
				break;
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_NOCOUNT:
			case T_QUOTED_IDENTIFIER:
			case T_XACT_ABORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1712);
				set_mssql_session_option();
				}
				break;
			case T_QUERY_BAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(1713);
				set_teradata_session_option();
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

	public static class Set_current_schema_optionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(HplsqlParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public Set_current_schema_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_current_schema_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSet_current_schema_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSet_current_schema_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSet_current_schema_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_current_schema_optionContext set_current_schema_option() throws RecognitionException {
		Set_current_schema_optionContext _localctx = new Set_current_schema_optionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_set_current_schema_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_SCHEMA:
				{
				{
				setState(1717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CURRENT) {
					{
					setState(1716);
					match(T_CURRENT);
					}
				}

				setState(1719);
				match(T_SCHEMA);
				}
				}
				break;
			case T_CURRENT_SCHEMA:
				{
				setState(1720);
				match(T_CURRENT_SCHEMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1723);
				match(T_EQUAL);
				}
				break;
			}
			setState(1726);
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

	public static class Set_mssql_session_optionContext extends ParserRuleContext {
		public TerminalNode T_ANSI_NULLS() { return getToken(HplsqlParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(HplsqlParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(HplsqlParser.T_NOCOUNT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(HplsqlParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(HplsqlParser.T_XACT_ABORT, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_OFF() { return getToken(HplsqlParser.T_OFF, 0); }
		public Set_mssql_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_mssql_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSet_mssql_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSet_mssql_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSet_mssql_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_mssql_session_optionContext set_mssql_session_option() throws RecognitionException {
		Set_mssql_session_optionContext _localctx = new Set_mssql_session_optionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_set_mssql_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			_la = _input.LA(1);
			if ( !(_la==T_ANSI_NULLS || _la==T_ANSI_PADDING || _la==T_NOCOUNT || _la==T_QUOTED_IDENTIFIER || _la==T_XACT_ABORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1729);
			_la = _input.LA(1);
			if ( !(_la==T_OFF || _la==T_ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Set_teradata_session_optionContext extends ParserRuleContext {
		public TerminalNode T_QUERY_BAND() { return getToken(HplsqlParser.T_QUERY_BAND, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HplsqlParser.T_TRANSACTION, 0); }
		public TerminalNode T_SESSION() { return getToken(HplsqlParser.T_SESSION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_NONE() { return getToken(HplsqlParser.T_NONE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public Set_teradata_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_teradata_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSet_teradata_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSet_teradata_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSet_teradata_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_teradata_session_optionContext set_teradata_session_option() throws RecognitionException {
		Set_teradata_session_optionContext _localctx = new Set_teradata_session_optionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_set_teradata_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(T_QUERY_BAND);
			setState(1732);
			match(T_EQUAL);
			setState(1735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1733);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1734);
				match(T_NONE);
				}
				break;
			}
			setState(1738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UPDATE) {
				{
				setState(1737);
				match(T_UPDATE);
				}
			}

			setState(1740);
			match(T_FOR);
			setState(1741);
			_la = _input.LA(1);
			if ( !(_la==T_SESSION || _la==T_TRANSACTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class While_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_WHILE() { return getTokens(HplsqlParser.T_WHILE); }
		public TerminalNode T_WHILE(int i) {
			return getToken(HplsqlParser.T_WHILE, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_DO() { return getToken(HplsqlParser.T_DO, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(HplsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HplsqlParser.T_LOOP, i);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			match(T_WHILE);
			setState(1744);
			bool_expr(0);
			setState(1745);
			_la = _input.LA(1);
			if ( !(_la==T_BEGIN || _la==T_DO || _la==T_LOOP || _la==T_THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1746);
			block();
			setState(1747);
			match(T_END);
			setState(1749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1748);
				_la = _input.LA(1);
				if ( !(_la==T_LOOP || _la==T_WHILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode L_LABEL() { return getToken(HplsqlParser.L_LABEL, 0); }
		public List<TerminalNode> T_LESS() { return getTokens(HplsqlParser.T_LESS); }
		public TerminalNode T_LESS(int i) {
			return getToken(HplsqlParser.T_LESS, i);
		}
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public List<TerminalNode> T_GREATER() { return getTokens(HplsqlParser.T_GREATER); }
		public TerminalNode T_GREATER(int i) {
			return getToken(HplsqlParser.T_GREATER, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_label);
		try {
			setState(1757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1751);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1752);
				match(T_LESS);
				setState(1753);
				match(T_LESS);
				setState(1754);
				match(L_ID);
				setState(1755);
				match(T_GREATER);
				setState(1756);
				match(T_GREATER);
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

	public static class Using_clauseContext extends ParserRuleContext {
		public TerminalNode T_USING() { return getToken(HplsqlParser.T_USING, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Using_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterUsing_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitUsing_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitUsing_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_clauseContext using_clause() throws RecognitionException {
		Using_clauseContext _localctx = new Using_clauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_using_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			match(T_USING);
			setState(1760);
			expr(0);
			setState(1765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1761);
				match(T_COMMA);
				setState(1762);
				expr(0);
				}
				}
				setState(1767);
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

	public static class New_select_stmtContext extends ParserRuleContext {
		public TerminalNode T_SELECT() { return getToken(HplsqlParser.T_SELECT, 0); }
		public List<New_select_colContext> new_select_col() {
			return getRuleContexts(New_select_colContext.class);
		}
		public New_select_colContext new_select_col(int i) {
			return getRuleContext(New_select_colContext.class,i);
		}
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public New_from_tableContext new_from_table() {
			return getRuleContext(New_from_tableContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<New_from_join_clauseContext> new_from_join_clause() {
			return getRuleContexts(New_from_join_clauseContext.class);
		}
		public New_from_join_clauseContext new_from_join_clause(int i) {
			return getRuleContext(New_from_join_clauseContext.class,i);
		}
		public TerminalNode T_WHERE() { return getToken(HplsqlParser.T_WHERE, 0); }
		public New_where_conditionContext new_where_condition() {
			return getRuleContext(New_where_conditionContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public New_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNew_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNew_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNew_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_select_stmtContext new_select_stmt() throws RecognitionException {
		New_select_stmtContext _localctx = new New_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_new_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			match(T_SELECT);
			setState(1769);
			new_select_col();
			setState(1774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1770);
				match(T_COMMA);
				setState(1771);
				new_select_col();
				}
				}
				setState(1776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1777);
			match(T_FROM);
			setState(1778);
			new_from_table();
			setState(1782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (T_FULL - 115)) | (1L << (T_INNER - 115)) | (1L << (T_JOIN - 115)) | (1L << (T_LEFT - 115)))) != 0) || _la==T_RIGHT || _la==T_COMMA) {
				{
				{
				setState(1779);
				new_from_join_clause();
				}
				}
				setState(1784);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WHERE) {
				{
				setState(1785);
				match(T_WHERE);
				setState(1786);
				new_where_condition();
				}
			}

			setState(1790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GROUP) {
				{
				setState(1789);
				group_by_clause();
				}
			}

			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_HAVING) {
				{
				setState(1792);
				having_clause();
				}
			}

			setState(1796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(1795);
				order_by_clause();
				}
			}

			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LIMIT || _la==T_WITH) {
				{
				setState(1798);
				select_options();
				}
			}

			setState(1801);
			match(T_SEMICOLON);
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

	public static class New_select_colContext extends ParserRuleContext {
		public Select_list_asteriskContext select_list_asterisk() {
			return getRuleContext(Select_list_asteriskContext.class,0);
		}
		public Col_funcContext col_func() {
			return getRuleContext(Col_funcContext.class,0);
		}
		public TabledotcolContext tabledotcol() {
			return getRuleContext(TabledotcolContext.class,0);
		}
		public Colom_nameContext colom_name() {
			return getRuleContext(Colom_nameContext.class,0);
		}
		public New_select_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_select_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNew_select_col(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNew_select_col(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNew_select_col(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_select_colContext new_select_col() throws RecognitionException {
		New_select_colContext _localctx = new New_select_colContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_new_select_col);
		try {
			setState(1807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1803);
				select_list_asterisk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1804);
				col_func();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1805);
				tabledotcol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1806);
				colom_name();
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

	public static class Col_funcContext extends ParserRuleContext {
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public Col_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCol_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCol_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCol_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Col_funcContext col_func() throws RecognitionException {
		Col_funcContext _localctx = new Col_funcContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_col_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			expr_agg_window_func();
			setState(1811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1810);
				select_list_alias();
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

	public static class TabledotcolContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_DOT() { return getToken(HplsqlParser.T_DOT, 0); }
		public Colom_nameContext colom_name() {
			return getRuleContext(Colom_nameContext.class,0);
		}
		public TabledotcolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabledotcol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterTabledotcol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitTabledotcol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTabledotcol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabledotcolContext tabledotcol() throws RecognitionException {
		TabledotcolContext _localctx = new TabledotcolContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_tabledotcol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			ident();
			setState(1814);
			match(T_DOT);
			setState(1815);
			colom_name();
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

	public static class New_from_tableContext extends ParserRuleContext {
		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class,0);
		}
		public New_from_subselect_clauseContext new_from_subselect_clause() {
			return getRuleContext(New_from_subselect_clauseContext.class,0);
		}
		public New_from_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_from_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNew_from_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNew_from_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNew_from_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_from_tableContext new_from_table() throws RecognitionException {
		New_from_tableContext _localctx = new New_from_tableContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_new_from_table);
		try {
			setState(1819);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1817);
				from_table_name_clause();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1818);
				new_from_subselect_clause();
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

	public static class New_from_subselect_clauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public New_select_stmtContext new_select_stmt() {
			return getRuleContext(New_select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public New_from_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_from_subselect_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNew_from_subselect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNew_from_subselect_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNew_from_subselect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_from_subselect_clauseContext new_from_subselect_clause() throws RecognitionException {
		New_from_subselect_clauseContext _localctx = new New_from_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_new_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1821);
			match(T_OPEN_P);
			setState(1822);
			new_select_stmt();
			setState(1823);
			match(T_CLOSE_P);
			setState(1825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1824);
				from_alias_clause();
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

	public static class New_from_join_clauseContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public New_from_tableContext new_from_table() {
			return getRuleContext(New_from_tableContext.class,0);
		}
		public From_join_type_clauseContext from_join_type_clause() {
			return getRuleContext(From_join_type_clauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public New_join_conditionContext new_join_condition() {
			return getRuleContext(New_join_conditionContext.class,0);
		}
		public New_from_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_from_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNew_from_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNew_from_join_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNew_from_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_from_join_clauseContext new_from_join_clause() throws RecognitionException {
		New_from_join_clauseContext _localctx = new New_from_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_new_from_join_clause);
		try {
			setState(1834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1827);
				match(T_COMMA);
				setState(1828);
				new_from_table();
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1829);
				from_join_type_clause();
				setState(1830);
				new_from_table();
				setState(1831);
				match(T_ON);
				setState(1832);
				new_join_condition();
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

	public static class New_join_conditionContext extends ParserRuleContext {
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public List<TerminalNode> T_DOT() { return getTokens(HplsqlParser.T_DOT); }
		public TerminalNode T_DOT(int i) {
			return getToken(HplsqlParser.T_DOT, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public New_join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_join_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNew_join_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNew_join_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNew_join_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_join_conditionContext new_join_condition() throws RecognitionException {
		New_join_conditionContext _localctx = new New_join_conditionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_new_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			table_name();
			setState(1837);
			match(T_DOT);
			setState(1838);
			ident();
			setState(1839);
			op();
			setState(1840);
			table_name();
			setState(1841);
			match(T_DOT);
			setState(1842);
			ident();
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

	public static class New_where_conditionContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public New_where_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_where_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNew_where_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNew_where_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNew_where_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_where_conditionContext new_where_condition() throws RecognitionException {
		New_where_conditionContext _localctx = new New_where_conditionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_new_where_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			bool_expr(0);
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
		public SelectNode b;
		public Fullselect_stmtContext fullselect_stmt;
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public Cte_select_stmtContext cte_select_stmt() {
			return getRuleContext(Cte_select_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(1846);
				cte_select_stmt();
				}
			}

			setState(1849);
			((Select_stmtContext)_localctx).fullselect_stmt = fullselect_stmt();

			        ((Select_stmtContext)_localctx).b =  ((Select_stmtContext)_localctx).fullselect_stmt.b;
			       
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

	public static class Cte_select_stmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public List<Cte_select_stmt_itemContext> cte_select_stmt_item() {
			return getRuleContexts(Cte_select_stmt_itemContext.class);
		}
		public Cte_select_stmt_itemContext cte_select_stmt_item(int i) {
			return getRuleContext(Cte_select_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Cte_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCte_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCte_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCte_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		Cte_select_stmtContext _localctx = new Cte_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			match(T_WITH);
			setState(1853);
			cte_select_stmt_item();
			setState(1858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1854);
				match(T_COMMA);
				setState(1855);
				cte_select_stmt_item();
				}
				}
				setState(1860);
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

	public static class Cte_select_stmt_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Cte_select_colsContext cte_select_cols() {
			return getRuleContext(Cte_select_colsContext.class,0);
		}
		public Cte_select_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCte_select_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCte_select_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCte_select_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		Cte_select_stmt_itemContext _localctx = new Cte_select_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1861);
			ident();
			setState(1863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1862);
				cte_select_cols();
				}
			}

			setState(1865);
			match(T_AS);
			setState(1866);
			match(T_OPEN_P);
			setState(1867);
			fullselect_stmt();
			setState(1868);
			match(T_CLOSE_P);
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

	public static class Cte_select_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Cte_select_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCte_select_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCte_select_cols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCte_select_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_colsContext cte_select_cols() throws RecognitionException {
		Cte_select_colsContext _localctx = new Cte_select_colsContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			match(T_OPEN_P);
			setState(1871);
			ident();
			setState(1876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1872);
				match(T_COMMA);
				setState(1873);
				ident();
				}
				}
				setState(1878);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1879);
			match(T_CLOSE_P);
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

	public static class Fullselect_stmtContext extends ParserRuleContext {
		public SelectNode b;
		public Fullselect_stmt_itemContext fullselect_stmt_item;
		public List<Fullselect_stmt_itemContext> fullselect_stmt_item() {
			return getRuleContexts(Fullselect_stmt_itemContext.class);
		}
		public Fullselect_stmt_itemContext fullselect_stmt_item(int i) {
			return getRuleContext(Fullselect_stmt_itemContext.class,i);
		}
		public List<Fullselect_set_clauseContext> fullselect_set_clause() {
			return getRuleContexts(Fullselect_set_clauseContext.class);
		}
		public Fullselect_set_clauseContext fullselect_set_clause(int i) {
			return getRuleContext(Fullselect_set_clauseContext.class,i);
		}
		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFullselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFullselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFullselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1881);
			((Fullselect_stmtContext)_localctx).fullselect_stmt_item = fullselect_stmt_item();
			setState(1887);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1882);
					fullselect_set_clause();
					setState(1883);
					((Fullselect_stmtContext)_localctx).fullselect_stmt_item = fullselect_stmt_item();
					}
					} 
				}
				setState(1889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			}

			        ((Fullselect_stmtContext)_localctx).b =  ((Fullselect_stmtContext)_localctx).fullselect_stmt_item.b;
			       
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

	public static class Fullselect_stmt_itemContext extends ParserRuleContext {
		public SelectNode b;
		public Subselect_stmtContext subselect_stmt;
		public Subselect_stmtContext subselect_stmt() {
			return getRuleContext(Subselect_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFullselect_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFullselect_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFullselect_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_fullselect_stmt_item);
		try {
			setState(1899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1892);
				((Fullselect_stmt_itemContext)_localctx).subselect_stmt = subselect_stmt();
				((Fullselect_stmt_itemContext)_localctx).b =  ((Fullselect_stmt_itemContext)_localctx).subselect_stmt.selNode;
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1895);
				match(T_OPEN_P);
				setState(1896);
				fullselect_stmt();
				setState(1897);
				match(T_CLOSE_P);
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

	public static class Fullselect_set_clauseContext extends ParserRuleContext {
		public TerminalNode T_UNION() { return getToken(HplsqlParser.T_UNION, 0); }
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HplsqlParser.T_EXCEPT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HplsqlParser.T_INTERSECT, 0); }
		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFullselect_set_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFullselect_set_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFullselect_set_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(1913);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1901);
				match(T_UNION);
				setState(1903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1902);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1905);
				match(T_EXCEPT);
				setState(1907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1906);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1909);
				match(T_INTERSECT);
				setState(1911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1910);
					match(T_ALL);
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

	public static class Subselect_stmtContext extends ParserRuleContext {
		public SelectNode selNode;
		public Select_listContext col;
		public From_clauseContext from;
		public From_clauseContext from_clause;
		public TerminalNode T_SELECT() { return getToken(HplsqlParser.T_SELECT, 0); }
		public TerminalNode T_SEL() { return getToken(HplsqlParser.T_SEL, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSubselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSubselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSubselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((Subselect_stmtContext)_localctx).selNode =  new SelectNode();
			setState(1916);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1917);
			((Subselect_stmtContext)_localctx).col = select_list();
			setState(1919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1918);
				into_clause();
				}
				break;
			}
			setState(1922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1921);
				((Subselect_stmtContext)_localctx).from = ((Subselect_stmtContext)_localctx).from_clause = from_clause();
				}
				break;
			}
			setState(1925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1924);
				where_clause();
				}
				break;
			}
			setState(1928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1927);
				group_by_clause();
				}
				break;
			}
			setState(1932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1930);
				having_clause();
				}
				break;
			case 2:
				{
				setState(1931);
				qualify_clause();
				}
				break;
			}
			setState(1935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1934);
				order_by_clause();
				}
				break;
			}
			setState(1938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1937);
				select_options();
				}
				break;
			}


			            if(types.find_typ(((Subselect_stmtContext)_localctx).from_clause.t)){
			                        _localctx.selNode.setTableSource(((Subselect_stmtContext)_localctx).from.t);
			                        _localctx.selNode.setColoms(((Subselect_stmtContext)_localctx).col.cols);
			                        _localctx.selNode.setNodeName("Select");
			            }else{
			                System.out.println("Error Table ["+ ((Subselect_stmtContext)_localctx).from_clause.t +"] Not Found!");
			                ((Subselect_stmtContext)_localctx).selNode = null;
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

	public static class Select_listContext extends ParserRuleContext {
		public ArrayList<String> cols;
		public Select_list_itemContext c1;
		public Select_list_itemContext c2;
		public List<Select_list_itemContext> select_list_item() {
			return getRuleContexts(Select_list_itemContext.class);
		}
		public Select_list_itemContext select_list_item(int i) {
			return getRuleContext(Select_list_itemContext.class,i);
		}
		public Select_list_setContext select_list_set() {
			return getRuleContext(Select_list_setContext.class,0);
		}
		public Select_list_limitContext select_list_limit() {
			return getRuleContext(Select_list_limitContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1942);
				select_list_set();
				}
				break;
			}
			setState(1946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1945);
				select_list_limit();
				}
				break;
			}
			setState(1948);
			((Select_listContext)_localctx).c1 = select_list_item();
			((Select_listContext)_localctx).cols =  ((Select_listContext)_localctx).c1.col;
			setState(1956);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1950);
					match(T_COMMA);
					setState(1951);
					((Select_listContext)_localctx).c2 = select_list_item();
					_localctx.cols.addAll(((Select_listContext)_localctx).c2.col);
					}
					} 
				}
				setState(1958);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
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

	public static class Select_list_setContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Select_list_limitContext extends ParserRuleContext {
		public TerminalNode T_TOP() { return getToken(HplsqlParser.T_TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_limit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_limit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1961);
			match(T_TOP);
			setState(1962);
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

	public static class Select_list_itemContext extends ParserRuleContext {
		public ArrayList<String> col;
		public ExprContext expr;
		public Select_list_asteriskContext select_list_asterisk;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_asteriskContext select_list_asterisk() {
			return getRuleContext(Select_list_asteriskContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1967);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1964);
					ident();
					setState(1965);
					match(T_EQUAL);
					}
					break;
				}
				setState(1969);
				((Select_list_itemContext)_localctx).expr = expr(0);
				setState(1971);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1970);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1973);
				((Select_list_itemContext)_localctx).select_list_asterisk = select_list_asterisk();
				}
				break;
			}

			        ArrayList<String> c = new ArrayList<String>();
			        if((((Select_list_itemContext)_localctx).expr!=null?_input.getText(((Select_list_itemContext)_localctx).expr.start,((Select_list_itemContext)_localctx).expr.stop):null) !=null){
			            c.add((((Select_list_itemContext)_localctx).expr!=null?_input.getText(((Select_list_itemContext)_localctx).expr.start,((Select_list_itemContext)_localctx).expr.stop):null));
			        }else if((((Select_list_itemContext)_localctx).select_list_asterisk!=null?_input.getText(((Select_list_itemContext)_localctx).select_list_asterisk.start,((Select_list_itemContext)_localctx).select_list_asterisk.stop):null) != null){
			            c.add((((Select_list_itemContext)_localctx).select_list_asterisk!=null?_input.getText(((Select_list_itemContext)_localctx).select_list_asterisk.start,((Select_list_itemContext)_localctx).select_list_asterisk.stop):null));
			        }

			        ((Select_list_itemContext)_localctx).col =  c;
			       
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

	public static class Select_list_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_TITLE() { return getToken(HplsqlParser.T_TITLE, 0); }
		public TerminalNode L_S_STRING() { return getToken(HplsqlParser.L_S_STRING, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_select_list_alias);
		int _la;
		try {
			setState(1987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1978);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(1980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1979);
					match(T_AS);
					}
				}

				setState(1982);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1983);
				match(T_OPEN_P);
				setState(1984);
				match(T_TITLE);
				setState(1985);
				match(L_S_STRING);
				setState(1986);
				match(T_CLOSE_P);
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

	public static class Select_list_asteriskContext extends ParserRuleContext {
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_DOT() { return getToken(HplsqlParser.T_DOT, 0); }
		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_asterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_asterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_asterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(1989);
				match(L_ID);
				setState(1990);
				match(T_DOT);
				}
			}

			setState(1993);
			match(T_MUL);
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

	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInto_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInto_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInto_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			match(T_INTO);
			setState(1996);
			ident();
			setState(2001);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1997);
					match(T_COMMA);
					setState(1998);
					ident();
					}
					} 
				}
				setState(2003);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
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
		public String t;
		public From_table_clauseContext from_table_clause;
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public List<From_join_clauseContext> from_join_clause() {
			return getRuleContexts(From_join_clauseContext.class);
		}
		public From_join_clauseContext from_join_clause(int i) {
			return getRuleContext(From_join_clauseContext.class,i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2004);
			match(T_FROM);
			setState(2005);
			((From_clauseContext)_localctx).from_table_clause = from_table_clause();
			setState(2009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2006);
					from_join_clause();
					}
					} 
				}
				setState(2011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			}
			((From_clauseContext)_localctx).t =  (((From_clauseContext)_localctx).from_table_clause!=null?_input.getText(((From_clauseContext)_localctx).from_table_clause.start,((From_clauseContext)_localctx).from_table_clause.stop):null); 
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

	public static class From_table_clauseContext extends ParserRuleContext {
		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class,0);
		}
		public From_subselect_clauseContext from_subselect_clause() {
			return getRuleContext(From_subselect_clauseContext.class,0);
		}
		public From_table_values_clauseContext from_table_values_clause() {
			return getRuleContext(From_table_values_clauseContext.class,0);
		}
		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_from_table_clause);
		try {
			setState(2017);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2014);
				from_table_name_clause();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(2015);
				from_subselect_clause();
				}
				break;
			case T_TABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2016);
				from_table_values_clause();
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

	public static class From_table_name_clauseContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_name_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_name_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_name_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_name_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2019);
			table_name();
			setState(2021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2020);
				from_alias_clause();
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

	public static class From_subselect_clauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_subselect_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_subselect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_subselect_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_subselect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
			match(T_OPEN_P);
			setState(2024);
			select_stmt();
			setState(2025);
			match(T_CLOSE_P);
			setState(2027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(2026);
				from_alias_clause();
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

	public static class From_join_clauseContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public From_join_type_clauseContext from_join_type_clause() {
			return getRuleContext(From_join_type_clauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_join_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_from_join_clause);
		try {
			setState(2036);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2029);
				match(T_COMMA);
				setState(2030);
				from_table_clause();
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2031);
				from_join_type_clause();
				setState(2032);
				from_table_clause();
				setState(2033);
				match(T_ON);
				setState(2034);
				bool_expr(0);
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

	public static class From_join_type_clauseContext extends ParserRuleContext {
		public TerminalNode T_JOIN() { return getToken(HplsqlParser.T_JOIN, 0); }
		public TerminalNode T_INNER() { return getToken(HplsqlParser.T_INNER, 0); }
		public TerminalNode T_LEFT() { return getToken(HplsqlParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(HplsqlParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(HplsqlParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(HplsqlParser.T_OUTER, 0); }
		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_type_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_join_type_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_join_type_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_join_type_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_from_join_type_clause);
		int _la;
		try {
			setState(2047);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(2038);
					match(T_INNER);
					}
				}

				setState(2041);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(2043);
					match(T_OUTER);
					}
				}

				setState(2046);
				match(T_JOIN);
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

	public static class From_table_values_clauseContext extends ParserRuleContext {
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public List<From_table_values_rowContext> from_table_values_row() {
			return getRuleContexts(From_table_values_rowContext.class);
		}
		public From_table_values_rowContext from_table_values_row(int i) {
			return getRuleContext(From_table_values_rowContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_values_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_values_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_values_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
			match(T_TABLE);
			setState(2050);
			match(T_OPEN_P);
			setState(2051);
			match(T_VALUES);
			setState(2052);
			from_table_values_row();
			setState(2057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2053);
				match(T_COMMA);
				setState(2054);
				from_table_values_row();
				}
				}
				setState(2059);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2060);
			match(T_CLOSE_P);
			setState(2062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2061);
				from_alias_clause();
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

	public static class From_table_values_rowContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_values_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_values_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_values_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_from_table_values_row);
		int _la;
		try {
			setState(2076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2064);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2065);
				match(T_OPEN_P);
				setState(2066);
				expr(0);
				setState(2071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2067);
					match(T_COMMA);
					setState(2068);
					expr(0);
					}
					}
					setState(2073);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2074);
				match(T_CLOSE_P);
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

	public static class From_alias_clauseContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_alias_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_alias_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_alias_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_alias_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(2080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS) {
				{
				setState(2079);
				match(T_AS);
				}
			}

			setState(2082);
			ident();
			setState(2093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2083);
				match(T_OPEN_P);
				setState(2084);
				match(L_ID);
				setState(2089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2085);
					match(T_COMMA);
					setState(2086);
					match(L_ID);
					}
					}
					setState(2091);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2092);
				match(T_CLOSE_P);
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

	public static class Table_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			ident();
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
		public Error_where_clauseContext error_where_clause() {
			return getRuleContext(Error_where_clauseContext.class,0);
		}
		public TerminalNode T_WHERE() { return getToken(HplsqlParser.T_WHERE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_where_clause);
		try {
			setState(2100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2097);
				error_where_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2098);
				match(T_WHERE);
				setState(2099);
				bool_expr(0);
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

	public static class Error_where_clauseContext extends ParserRuleContext {
		public TerminalNode T_WHERE() { return getToken(HplsqlParser.T_WHERE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Error_where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterError_where_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitError_where_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitError_where_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_where_clauseContext error_where_clause() throws RecognitionException {
		Error_where_clauseContext _localctx = new Error_where_clauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_error_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2102);
			match(T_WHERE);
			setState(2103);
			ident();
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

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_GROUP() { return getToken(HplsqlParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitGroup_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitGroup_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2105);
			match(T_GROUP);
			setState(2106);
			match(T_BY);
			setState(2107);
			expr(0);
			setState(2112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2108);
					match(T_COMMA);
					setState(2109);
					expr(0);
					}
					} 
				}
				setState(2114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
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

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode T_HAVING() { return getToken(HplsqlParser.T_HAVING, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitHaving_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2115);
			match(T_HAVING);
			setState(2116);
			bool_expr(0);
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

	public static class Qualify_clauseContext extends ParserRuleContext {
		public TerminalNode T_QUALIFY() { return getToken(HplsqlParser.T_QUALIFY, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualify_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterQualify_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitQualify_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitQualify_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2118);
			match(T_QUALIFY);
			setState(2119);
			bool_expr(0);
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

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_ORDER() { return getToken(HplsqlParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HplsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HplsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HplsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HplsqlParser.T_DESC, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitOrder_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2121);
			match(T_ORDER);
			setState(2122);
			match(T_BY);
			setState(2123);
			expr(0);
			setState(2125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(2124);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(2134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2127);
					match(T_COMMA);
					setState(2128);
					expr(0);
					setState(2130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
					case 1:
						{
						setState(2129);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(2136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
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

	public static class Select_optionsContext extends ParserRuleContext {
		public List<Select_options_itemContext> select_options_item() {
			return getRuleContexts(Select_options_itemContext.class);
		}
		public Select_options_itemContext select_options_item(int i) {
			return getRuleContext(Select_options_itemContext.class,i);
		}
		public Select_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2138); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2137);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2140); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Select_options_itemContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() { return getToken(HplsqlParser.T_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_RR() { return getToken(HplsqlParser.T_RR, 0); }
		public TerminalNode T_RS() { return getToken(HplsqlParser.T_RS, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public TerminalNode T_UR() { return getToken(HplsqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HplsqlParser.T_USE, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_KEEP() { return getToken(HplsqlParser.T_KEEP, 0); }
		public TerminalNode T_LOCKS() { return getToken(HplsqlParser.T_LOCKS, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HplsqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_SHARE() { return getToken(HplsqlParser.T_SHARE, 0); }
		public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_select_options_item);
		int _la;
		try {
			setState(2153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2142);
				match(T_LIMIT);
				setState(2143);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2144);
				match(T_WITH);
				setState(2145);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 239)) & ~0x3f) == 0 && ((1L << (_la - 239)) & ((1L << (T_RR - 239)) | (1L << (T_RS - 239)) | (1L << (T_UR - 239)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2146);
					match(T_USE);
					setState(2147);
					match(T_AND);
					setState(2148);
					match(T_KEEP);
					setState(2149);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2150);
					match(T_LOCKS);
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

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_atomContext bool_expr_atom() {
			return getRuleContext(Bool_expr_atomContext.class,0);
		}
		public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return getRuleContext(Bool_expr_logical_operatorContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 284;
		enterRecursionRule(_localctx, 284, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(2157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2156);
					match(T_NOT);
					}
				}

				setState(2159);
				match(T_OPEN_P);
				setState(2160);
				bool_expr(0);
				setState(2161);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2163);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(2166);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(2167);
					bool_expr_logical_operator();
					setState(2168);
					bool_expr(3);
					}
					} 
				}
				setState(2174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
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

	public static class Bool_expr_atomContext extends ParserRuleContext {
		public Bool_expr_unaryContext bool_expr_unary() {
			return getRuleContext(Bool_expr_unaryContext.class,0);
		}
		public Bool_expr_binaryContext bool_expr_binary() {
			return getRuleContext(Bool_expr_binaryContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_bool_expr_atom);
		try {
			setState(2178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2175);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2176);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2177);
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

	public static class Bool_expr_unaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HplsqlParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Bool_expr_single_inContext bool_expr_single_in() {
			return getRuleContext(Bool_expr_single_inContext.class,0);
		}
		public Bool_expr_multi_inContext bool_expr_multi_in() {
			return getRuleContext(Bool_expr_multi_inContext.class,0);
		}
		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_bool_expr_unary);
		int _la;
		try {
			setState(2203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2180);
				expr(0);
				setState(2181);
				match(T_IS);
				setState(2183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2182);
					match(T_NOT);
					}
				}

				setState(2185);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2187);
				expr(0);
				setState(2188);
				match(T_BETWEEN);
				setState(2189);
				expr(0);
				setState(2190);
				match(T_AND);
				setState(2191);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2193);
					match(T_NOT);
					}
				}

				setState(2196);
				match(T_EXISTS);
				setState(2197);
				match(T_OPEN_P);
				setState(2198);
				select_stmt();
				setState(2199);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2201);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2202);
				bool_expr_multi_in();
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

	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_single_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_single_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_single_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_single_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2205);
			expr(0);
			setState(2207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2206);
				match(T_NOT);
				}
			}

			setState(2209);
			match(T_IN);
			setState(2210);
			match(T_OPEN_P);
			setState(2220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				{
				setState(2211);
				expr(0);
				setState(2216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2212);
					match(T_COMMA);
					setState(2213);
					expr(0);
					}
					}
					setState(2218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(2219);
				select_stmt();
				}
				break;
			}
			setState(2222);
			match(T_CLOSE_P);
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

	public static class Bool_expr_multi_inContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_multi_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_multi_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_multi_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_multi_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2224);
			match(T_OPEN_P);
			setState(2225);
			expr(0);
			setState(2230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2226);
				match(T_COMMA);
				setState(2227);
				expr(0);
				}
				}
				setState(2232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2233);
			match(T_CLOSE_P);
			setState(2235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2234);
				match(T_NOT);
				}
			}

			setState(2237);
			match(T_IN);
			setState(2238);
			match(T_OPEN_P);
			setState(2239);
			select_stmt();
			setState(2240);
			match(T_CLOSE_P);
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

	public static class Bool_expr_binaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_binary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2242);
			expr(0);
			setState(2243);
			bool_expr_binary_operator();
			setState(2244);
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

	public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_logical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_logical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_logical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2246);
			_la = _input.LA(1);
			if ( !(_la==T_AND || _la==T_OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_EQUAL2() { return getToken(HplsqlParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(HplsqlParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(HplsqlParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(HplsqlParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(HplsqlParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HplsqlParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(HplsqlParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LIKE() { return getToken(HplsqlParser.T_LIKE, 0); }
		public TerminalNode T_RLIKE() { return getToken(HplsqlParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(HplsqlParser.T_REGEXP, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_binary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_binary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_binary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2248);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2249);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2250);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(2251);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2252);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2253);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(2254);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2255);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2256);
					match(T_NOT);
					}
				}

				setState(2259);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_intervalContext expr_interval() {
			return getRuleContext(Expr_intervalContext.class,0);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_cursor_attributeContext expr_cursor_attribute() {
			return getRuleContext(Expr_cursor_attributeContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_ADD() { return getToken(HplsqlParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(HplsqlParser.T_DIV, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode L_DEC() { return getToken(HplsqlParser.L_DEC, 0); }
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 300;
		enterRecursionRule(_localctx, 300, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(2263);
				match(T_OPEN_P);
				setState(2264);
				select_stmt();
				setState(2265);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2267);
				match(T_OPEN_P);
				setState(2268);
				expr(0);
				setState(2269);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				{
				setState(2271);
				expr_interval();
				}
				break;
			case 5:
				{
				setState(2272);
				expr_concat();
				}
				break;
			case 6:
				{
				setState(2273);
				expr_case();
				}
				break;
			case 7:
				{
				setState(2274);
				expr_cursor_attribute();
				}
				break;
			case 8:
				{
				setState(2275);
				expr_agg_window_func();
				}
				break;
			case 9:
				{
				setState(2276);
				expr_spec_func();
				}
				break;
			case 10:
				{
				setState(2277);
				expr_func();
				}
				break;
			case 11:
				{
				setState(2278);
				expr_atom();
				}
				break;
			case 12:
				{
				setState(2279);
				ident();
				setState(2280);
				_la = _input.LA(1);
				if ( !(((((_la - 339)) & ~0x3f) == 0 && ((1L << (_la - 339)) & ((1L << (T_ADD - 339)) | (1L << (T_DIV - 339)) | (1L << (T_MUL - 339)) | (1L << (T_SUB - 339)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2281);
				match(T_EQUAL);
				setState(2282);
				_la = _input.LA(1);
				if ( !(_la==L_INT || _la==L_DEC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 13:
				{
				setState(2284);
				match(T_MUL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2301);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2287);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2288);
						match(T_MUL);
						setState(2289);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2290);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2291);
						match(T_DIV);
						setState(2292);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2293);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2294);
						match(T_ADD);
						setState(2295);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2296);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2297);
						match(T_SUB);
						setState(2298);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2299);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(2300);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(2305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
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

	public static class Colom_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public Colom_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colom_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterColom_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitColom_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitColom_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Colom_nameContext colom_name() throws RecognitionException {
		Colom_nameContext _localctx = new Colom_nameContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_colom_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2306);
			ident();
			setState(2308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(2307);
				select_list_alias();
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

	public static class Expr_atomContext extends ParserRuleContext {
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_DOT() { return getToken(HplsqlParser.T_DOT, 0); }
		public Colom_nameContext colom_name() {
			return getRuleContext(Colom_nameContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Null_constContext null_const() {
			return getRuleContext(Null_constContext.class,0);
		}
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_expr_atom);
		try {
			setState(2322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2310);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2311);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2312);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2313);
				table_name();
				setState(2314);
				match(T_DOT);
				setState(2315);
				colom_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2317);
				ident();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2318);
				string();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2319);
				dec_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2320);
				int_number();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2321);
				null_const();
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

	public static class Expr_intervalContext extends ParserRuleContext {
		public TerminalNode T_INTERVAL() { return getToken(HplsqlParser.T_INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public Expr_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2324);
			match(T_INTERVAL);
			setState(2325);
			expr(0);
			setState(2326);
			interval_item();
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

	public static class Interval_itemContext extends ParserRuleContext {
		public TerminalNode T_DAY() { return getToken(HplsqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HplsqlParser.T_DAYS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HplsqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HplsqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_SECOND() { return getToken(HplsqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HplsqlParser.T_SECONDS, 0); }
		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInterval_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInterval_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInterval_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || _la==T_MICROSECOND || _la==T_MICROSECONDS || _la==T_SECOND || _la==T_SECONDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Expr_concatContext extends ParserRuleContext {
		public List<Expr_concat_itemContext> expr_concat_item() {
			return getRuleContexts(Expr_concat_itemContext.class);
		}
		public Expr_concat_itemContext expr_concat_item(int i) {
			return getRuleContext(Expr_concat_itemContext.class,i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(HplsqlParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(HplsqlParser.T_PIPE, i);
		}
		public List<TerminalNode> T_CONCAT() { return getTokens(HplsqlParser.T_CONCAT); }
		public TerminalNode T_CONCAT(int i) {
			return getToken(HplsqlParser.T_CONCAT, i);
		}
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_concat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_concat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			expr_concat_item();
			setState(2331);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2332);
			expr_concat_item();
			setState(2337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2333);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2334);
					expr_concat_item();
					}
					} 
				}
				setState(2339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
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

	public static class Expr_concat_itemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_concat_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_concat_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_concat_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_expr_concat_item);
		try {
			setState(2349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2340);
				match(T_OPEN_P);
				setState(2341);
				expr(0);
				setState(2342);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2344);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2345);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2346);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2347);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2348);
				expr_atom();
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

	public static class Expr_caseContext extends ParserRuleContext {
		public Expr_case_simpleContext expr_case_simple() {
			return getRuleContext(Expr_case_simpleContext.class,0);
		}
		public Expr_case_searchedContext expr_case_searched() {
			return getRuleContext(Expr_case_searchedContext.class,0);
		}
		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_expr_case);
		try {
			setState(2353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2351);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2352);
				expr_case_searched();
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

	public static class Expr_case_simpleContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HplsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HplsqlParser.T_WHEN, i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HplsqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HplsqlParser.T_THEN, i);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_case_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_case_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_case_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			match(T_CASE);
			setState(2356);
			expr(0);
			setState(2362); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2357);
				match(T_WHEN);
				setState(2358);
				expr(0);
				setState(2359);
				match(T_THEN);
				setState(2360);
				expr(0);
				}
				}
				setState(2364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2366);
				match(T_ELSE);
				setState(2367);
				expr(0);
				}
			}

			setState(2370);
			match(T_END);
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

	public static class Expr_case_searchedContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HplsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HplsqlParser.T_WHEN, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HplsqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HplsqlParser.T_THEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_searched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_case_searched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_case_searched(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_case_searched(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2372);
			match(T_CASE);
			setState(2378); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2373);
				match(T_WHEN);
				setState(2374);
				bool_expr(0);
				setState(2375);
				match(T_THEN);
				setState(2376);
				expr(0);
				}
				}
				setState(2380); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2382);
				match(T_ELSE);
				setState(2383);
				expr(0);
				}
			}

			setState(2386);
			match(T_END);
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

	public static class Expr_cursor_attributeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ISOPEN() { return getToken(HplsqlParser.T_ISOPEN, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HplsqlParser.T_NOTFOUND, 0); }
		public Expr_cursor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cursor_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_cursor_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_cursor_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_cursor_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		Expr_cursor_attributeContext _localctx = new Expr_cursor_attributeContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2388);
			ident();
			setState(2389);
			match(T__0);
			setState(2390);
			_la = _input.LA(1);
			if ( !(_la==T_FOUND || _la==T_ISOPEN || _la==T_NOTFOUND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Expr_agg_window_funcContext extends ParserRuleContext {
		public TerminalNode T_AVG() { return getToken(HplsqlParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_all_distinctContext expr_func_all_distinct() {
			return getRuleContext(Expr_func_all_distinctContext.class,0);
		}
		public Expr_func_over_clauseContext expr_func_over_clause() {
			return getRuleContext(Expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HplsqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HplsqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HplsqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HplsqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_LAG() { return getToken(HplsqlParser.T_LAG, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_LAST_VALUE() { return getToken(HplsqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HplsqlParser.T_LEAD, 0); }
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_MIN() { return getToken(HplsqlParser.T_MIN, 0); }
		public TerminalNode T_RANK() { return getToken(HplsqlParser.T_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HplsqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_STDEV() { return getToken(HplsqlParser.T_STDEV, 0); }
		public TerminalNode T_SUM() { return getToken(HplsqlParser.T_SUM, 0); }
		public TerminalNode T_VAR() { return getToken(HplsqlParser.T_VAR, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HplsqlParser.T_VARIANCE, 0); }
		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_agg_window_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_agg_window_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_agg_window_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_agg_window_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2392);
				match(T_AVG);
				setState(2393);
				match(T_OPEN_P);
				setState(2395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2394);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2397);
				expr(0);
				setState(2398);
				match(T_CLOSE_P);
				setState(2400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2399);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2402);
				match(T_COUNT);
				setState(2403);
				match(T_OPEN_P);
				setState(2405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2404);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2407);
				expr(0);
				setState(2408);
				match(T_CLOSE_P);
				setState(2410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2409);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2412);
				match(T_COUNT_BIG);
				setState(2413);
				match(T_OPEN_P);
				setState(2415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2414);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2417);
				expr(0);
				setState(2418);
				match(T_CLOSE_P);
				setState(2420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2419);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2422);
				match(T_CUME_DIST);
				setState(2423);
				match(T_OPEN_P);
				setState(2424);
				expr(0);
				setState(2425);
				match(T_CLOSE_P);
				setState(2426);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2428);
				match(T_DENSE_RANK);
				setState(2429);
				match(T_OPEN_P);
				setState(2430);
				expr(0);
				setState(2431);
				match(T_CLOSE_P);
				setState(2432);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2434);
				match(T_FIRST_VALUE);
				setState(2435);
				match(T_OPEN_P);
				setState(2436);
				expr(0);
				setState(2437);
				match(T_CLOSE_P);
				setState(2438);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2440);
				match(T_LAG);
				setState(2441);
				match(T_OPEN_P);
				setState(2442);
				expr(0);
				setState(2449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2443);
					match(T_COMMA);
					setState(2444);
					expr(0);
					setState(2447);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2445);
						match(T_COMMA);
						setState(2446);
						expr(0);
						}
					}

					}
				}

				setState(2451);
				match(T_CLOSE_P);
				setState(2452);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2454);
				match(T_LAST_VALUE);
				setState(2455);
				match(T_OPEN_P);
				setState(2456);
				expr(0);
				setState(2457);
				match(T_CLOSE_P);
				setState(2458);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2460);
				match(T_LEAD);
				setState(2461);
				match(T_OPEN_P);
				setState(2462);
				expr(0);
				setState(2469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2463);
					match(T_COMMA);
					setState(2464);
					expr(0);
					setState(2467);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2465);
						match(T_COMMA);
						setState(2466);
						expr(0);
						}
					}

					}
				}

				setState(2471);
				match(T_CLOSE_P);
				setState(2472);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2474);
				match(T_MAX);
				setState(2475);
				match(T_OPEN_P);
				setState(2477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
				case 1:
					{
					setState(2476);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2479);
				expr(0);
				setState(2480);
				match(T_CLOSE_P);
				setState(2482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
				case 1:
					{
					setState(2481);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2484);
				match(T_MIN);
				setState(2485);
				match(T_OPEN_P);
				setState(2487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(2486);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2489);
				expr(0);
				setState(2490);
				match(T_CLOSE_P);
				setState(2492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
				case 1:
					{
					setState(2491);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2494);
				match(T_RANK);
				setState(2495);
				match(T_OPEN_P);
				setState(2496);
				expr(0);
				setState(2497);
				match(T_CLOSE_P);
				setState(2498);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2500);
				match(T_ROW_NUMBER);
				setState(2501);
				match(T_OPEN_P);
				setState(2502);
				expr(0);
				setState(2503);
				match(T_CLOSE_P);
				setState(2504);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2506);
				match(T_STDEV);
				setState(2507);
				match(T_OPEN_P);
				setState(2509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(2508);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2511);
				expr(0);
				setState(2512);
				match(T_CLOSE_P);
				setState(2514);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(2513);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2516);
				match(T_SUM);
				setState(2517);
				match(T_OPEN_P);
				setState(2519);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(2518);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2521);
				expr(0);
				setState(2522);
				match(T_CLOSE_P);
				setState(2524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
				case 1:
					{
					setState(2523);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(2526);
				match(T_VAR);
				setState(2527);
				match(T_OPEN_P);
				setState(2529);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
				case 1:
					{
					setState(2528);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2531);
				expr(0);
				setState(2532);
				match(T_CLOSE_P);
				setState(2534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
				case 1:
					{
					setState(2533);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(2536);
				match(T_VARIANCE);
				setState(2537);
				match(T_OPEN_P);
				setState(2539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
				case 1:
					{
					setState(2538);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2541);
				expr(0);
				setState(2542);
				match(T_CLOSE_P);
				setState(2544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
				case 1:
					{
					setState(2543);
					expr_func_over_clause();
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

	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_all_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_all_distinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_all_distinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_all_distinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2548);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Expr_func_over_clauseContext extends ParserRuleContext {
		public TerminalNode T_OVER() { return getToken(HplsqlParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_over_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_over_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_over_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2550);
			match(T_OVER);
			setState(2551);
			match(T_OPEN_P);
			setState(2553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2552);
				expr_func_partition_by_clause();
				}
			}

			setState(2556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2555);
				order_by_clause();
				}
			}

			setState(2558);
			match(T_CLOSE_P);
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

	public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() { return getToken(HplsqlParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_partition_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_partition_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_partition_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_partition_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2560);
			match(T_PARTITION);
			setState(2561);
			match(T_BY);
			setState(2562);
			expr(0);
			setState(2567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2563);
				match(T_COMMA);
				setState(2564);
				expr(0);
				}
				}
				setState(2569);
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

	public static class Expr_spec_funcContext extends ParserRuleContext {
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HplsqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_CAST() { return getToken(HplsqlParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HplsqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HplsqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HplsqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_USER() { return getToken(HplsqlParser.T_USER, 0); }
		public TerminalNode T_MAX_PART_STRING() { return getToken(HplsqlParser.T_MAX_PART_STRING, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(HplsqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(HplsqlParser.T_EQUAL, i);
		}
		public TerminalNode T_MIN_PART_STRING() { return getToken(HplsqlParser.T_MIN_PART_STRING, 0); }
		public TerminalNode T_MAX_PART_INT() { return getToken(HplsqlParser.T_MAX_PART_INT, 0); }
		public TerminalNode T_MIN_PART_INT() { return getToken(HplsqlParser.T_MIN_PART_INT, 0); }
		public TerminalNode T_MAX_PART_DATE() { return getToken(HplsqlParser.T_MAX_PART_DATE, 0); }
		public TerminalNode T_MIN_PART_DATE() { return getToken(HplsqlParser.T_MIN_PART_DATE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HplsqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HplsqlParser.T_PART_LOC, 0); }
		public TerminalNode T_TRIM() { return getToken(HplsqlParser.T_TRIM, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HplsqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HplsqlParser.T_SYSDATE, 0); }
		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_spec_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_spec_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_spec_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_spec_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2570);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2571);
				match(T_CAST);
				setState(2572);
				match(T_OPEN_P);
				setState(2573);
				expr(0);
				setState(2574);
				match(T_AS);
				setState(2575);
				dtype();
				setState(2577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2576);
					dtype_len();
					}
				}

				setState(2579);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2581);
				match(T_COUNT);
				setState(2582);
				match(T_OPEN_P);
				setState(2585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
				case 1:
					{
					setState(2583);
					expr(0);
					}
					break;
				case 2:
					{
					setState(2584);
					match(T_MUL);
					}
					break;
				}
				setState(2587);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2588);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2589);
				match(T_CURRENT);
				setState(2590);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2594);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(2591);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(2592);
					match(T_CURRENT);
					setState(2593);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2600);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(2596);
					match(T_OPEN_P);
					setState(2597);
					expr(0);
					setState(2598);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2602);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2603);
				match(T_CURRENT);
				setState(2604);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2605);
				match(T_MAX_PART_STRING);
				setState(2606);
				match(T_OPEN_P);
				setState(2607);
				expr(0);
				setState(2620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2608);
					match(T_COMMA);
					setState(2609);
					expr(0);
					setState(2617);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2610);
						match(T_COMMA);
						setState(2611);
						expr(0);
						setState(2612);
						match(T_EQUAL);
						setState(2613);
						expr(0);
						}
						}
						setState(2619);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2622);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2624);
				match(T_MIN_PART_STRING);
				setState(2625);
				match(T_OPEN_P);
				setState(2626);
				expr(0);
				setState(2639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2627);
					match(T_COMMA);
					setState(2628);
					expr(0);
					setState(2636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2629);
						match(T_COMMA);
						setState(2630);
						expr(0);
						setState(2631);
						match(T_EQUAL);
						setState(2632);
						expr(0);
						}
						}
						setState(2638);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2641);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2643);
				match(T_MAX_PART_INT);
				setState(2644);
				match(T_OPEN_P);
				setState(2645);
				expr(0);
				setState(2658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2646);
					match(T_COMMA);
					setState(2647);
					expr(0);
					setState(2655);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2648);
						match(T_COMMA);
						setState(2649);
						expr(0);
						setState(2650);
						match(T_EQUAL);
						setState(2651);
						expr(0);
						}
						}
						setState(2657);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2660);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2662);
				match(T_MIN_PART_INT);
				setState(2663);
				match(T_OPEN_P);
				setState(2664);
				expr(0);
				setState(2677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2665);
					match(T_COMMA);
					setState(2666);
					expr(0);
					setState(2674);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2667);
						match(T_COMMA);
						setState(2668);
						expr(0);
						setState(2669);
						match(T_EQUAL);
						setState(2670);
						expr(0);
						}
						}
						setState(2676);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2679);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2681);
				match(T_MAX_PART_DATE);
				setState(2682);
				match(T_OPEN_P);
				setState(2683);
				expr(0);
				setState(2696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2684);
					match(T_COMMA);
					setState(2685);
					expr(0);
					setState(2693);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2686);
						match(T_COMMA);
						setState(2687);
						expr(0);
						setState(2688);
						match(T_EQUAL);
						setState(2689);
						expr(0);
						}
						}
						setState(2695);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2698);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2700);
				match(T_MIN_PART_DATE);
				setState(2701);
				match(T_OPEN_P);
				setState(2702);
				expr(0);
				setState(2715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2703);
					match(T_COMMA);
					setState(2704);
					expr(0);
					setState(2712);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2705);
						match(T_COMMA);
						setState(2706);
						expr(0);
						setState(2707);
						match(T_EQUAL);
						setState(2708);
						expr(0);
						}
						}
						setState(2714);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2717);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2719);
				match(T_PART_COUNT);
				setState(2720);
				match(T_OPEN_P);
				setState(2721);
				expr(0);
				setState(2729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2722);
					match(T_COMMA);
					setState(2723);
					expr(0);
					setState(2724);
					match(T_EQUAL);
					setState(2725);
					expr(0);
					}
					}
					setState(2731);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2732);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2734);
				match(T_PART_LOC);
				setState(2735);
				match(T_OPEN_P);
				setState(2736);
				expr(0);
				setState(2742); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2737);
						match(T_COMMA);
						setState(2738);
						expr(0);
						setState(2739);
						match(T_EQUAL);
						setState(2740);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2744); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2746);
					match(T_COMMA);
					setState(2747);
					expr(0);
					}
				}

				setState(2750);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2752);
				match(T_TRIM);
				setState(2753);
				match(T_OPEN_P);
				setState(2754);
				expr(0);
				setState(2755);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2757);
				match(T_SUBSTRING);
				setState(2758);
				match(T_OPEN_P);
				setState(2759);
				expr(0);
				setState(2760);
				match(T_FROM);
				setState(2761);
				expr(0);
				setState(2764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(2762);
					match(T_FOR);
					setState(2763);
					expr(0);
					}
				}

				setState(2766);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2768);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2769);
				match(T_USER);
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

	public static class Expr_funcContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2772);
			ident();
			setState(2773);
			match(T_OPEN_P);
			setState(2775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				{
				setState(2774);
				expr_func_params();
				}
				break;
			}
			setState(2777);
			match(T_CLOSE_P);
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

	public static class Expr_func_paramsContext extends ParserRuleContext {
		public List<Func_paramContext> func_param() {
			return getRuleContexts(Func_paramContext.class);
		}
		public Func_paramContext func_param(int i) {
			return getRuleContext(Func_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_expr_func_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2779);
			func_param();
			setState(2784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2780);
				match(T_COMMA);
				setState(2781);
				func_param();
				}
				}
				setState(2786);
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

	public static class Func_paramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HplsqlParser.T_GREATER, 0); }
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFunc_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFunc_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFunc_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_func_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2787);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(2793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				{
				setState(2788);
				ident();
				setState(2789);
				match(T_EQUAL);
				setState(2791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
				case 1:
					{
					setState(2790);
					match(T_GREATER);
					}
					break;
				}
				}
				break;
			}
			setState(2795);
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

	public static class Expr_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_selectContext expr_select() throws RecognitionException {
		Expr_selectContext _localctx = new Expr_selectContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_expr_select);
		try {
			setState(2799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2797);
				select_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2798);
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

	public static class Expr_fileContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_fileContext expr_file() throws RecognitionException {
		Expr_fileContext _localctx = new Expr_fileContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_expr_file);
		try {
			setState(2803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2801);
				file_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2802);
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

	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode L_FILE() { return getToken(HplsqlParser.L_FILE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_DIV() { return getTokens(HplsqlParser.T_DIV); }
		public TerminalNode T_DIV(int i) {
			return getToken(HplsqlParser.T_DIV, i);
		}
		public TerminalNode T_DOT() { return getToken(HplsqlParser.T_DOT, 0); }
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFile_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_file_name);
		int _la;
		try {
			setState(2819);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2805);
				match(L_FILE);
				}
				break;
			case T_DIV:
			case T_DOT:
			case L_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2809);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_DIV:
					{
					setState(2806);
					match(T_DIV);
					}
					break;
				case T_DOT:
					{
					setState(2807);
					match(T_DOT);
					setState(2808);
					match(T_DIV);
					}
					break;
				case L_ID:
					break;
				default:
					break;
				}
				setState(2811);
				ident();
				setState(2816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_DIV) {
					{
					{
					setState(2812);
					match(T_DIV);
					setState(2813);
					ident();
					}
					}
					setState(2818);
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

	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDate_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2821);
			match(T_DATE);
			setState(2822);
			string();
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

	public static class Timestamp_literalContext extends ParserRuleContext {
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterTimestamp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitTimestamp_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTimestamp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2824);
			match(T_TIMESTAMP);
			setState(2825);
			string();
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

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public List<TerminalNode> T_DOT() { return getTokens(HplsqlParser.T_DOT); }
		public TerminalNode T_DOT(int i) {
			return getToken(HplsqlParser.T_DOT, i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2827);
			match(L_ID);
			}
			setState(2832);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2828);
					match(T_DOT);
					{
					setState(2829);
					match(L_ID);
					}
					}
					} 
				}
				setState(2834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Double_quotedStringContext extends StringContext {
		public TerminalNode L_D_STRING() { return getToken(HplsqlParser.L_D_STRING, 0); }
		public Double_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDouble_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDouble_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDouble_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single_quotedStringContext extends StringContext {
		public TerminalNode L_S_STRING() { return getToken(HplsqlParser.L_S_STRING, 0); }
		public Single_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSingle_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSingle_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSingle_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_string);
		try {
			setState(2837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2835);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2836);
				match(L_D_STRING);
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

	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(HplsqlParser.T_ADD, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInt_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInt_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInt_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2839);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2842);
			match(L_INT);
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

	public static class Dec_numberContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(HplsqlParser.L_DEC, 0); }
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(HplsqlParser.T_ADD, 0); }
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDec_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDec_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDec_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2844);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2847);
			match(L_DEC);
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

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode T_TRUE() { return getToken(HplsqlParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(HplsqlParser.T_FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2849);
			_la = _input.LA(1);
			if ( !(_la==T_FALSE || _la==T_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Null_constContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNull_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNull_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNull_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2851);
			match(T_NULL);
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

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode T_ACTION() { return getToken(HplsqlParser.T_ACTION, 0); }
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HplsqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_ADD2() { return getToken(HplsqlParser.T_ADD2, 0); }
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_ALLOCATE() { return getToken(HplsqlParser.T_ALLOCATE, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_ANSI_NULLS() { return getToken(HplsqlParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(HplsqlParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(HplsqlParser.T_ASC, 0); }
		public TerminalNode T_ASSOCIATE() { return getToken(HplsqlParser.T_ASSOCIATE, 0); }
		public TerminalNode T_AT() { return getToken(HplsqlParser.T_AT, 0); }
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_AVG() { return getToken(HplsqlParser.T_AVG, 0); }
		public TerminalNode T_BATCHSIZE() { return getToken(HplsqlParser.T_BATCHSIZE, 0); }
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HplsqlParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(HplsqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HplsqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HplsqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BIT() { return getToken(HplsqlParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(HplsqlParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(HplsqlParser.T_BREAK, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(HplsqlParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(HplsqlParser.T_CALL, 0); }
		public TerminalNode T_CALLER() { return getToken(HplsqlParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(HplsqlParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(HplsqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CAST() { return getToken(HplsqlParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(HplsqlParser.T_CHARSET, 0); }
		public TerminalNode T_CLIENT() { return getToken(HplsqlParser.T_CLIENT, 0); }
		public TerminalNode T_CLOSE() { return getToken(HplsqlParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(HplsqlParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(HplsqlParser.T_CMP, 0); }
		public TerminalNode T_COLLECT() { return getToken(HplsqlParser.T_COLLECT, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HplsqlParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMN() { return getToken(HplsqlParser.T_COLUMN, 0); }
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HplsqlParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(HplsqlParser.T_CONSTANT, 0); }
		public TerminalNode T_COPY() { return getToken(HplsqlParser.T_COPY, 0); }
		public TerminalNode T_COMMIT() { return getToken(HplsqlParser.T_COMMIT, 0); }
		public TerminalNode T_CONCAT() { return getToken(HplsqlParser.T_CONCAT, 0); }
		public TerminalNode T_CONDITION() { return getToken(HplsqlParser.T_CONDITION, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(HplsqlParser.T_CONSTRAINT, 0); }
		public TerminalNode T_CONTINUE() { return getToken(HplsqlParser.T_CONTINUE, 0); }
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HplsqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_CREATION() { return getToken(HplsqlParser.T_CREATION, 0); }
		public TerminalNode T_CREATOR() { return getToken(HplsqlParser.T_CREATOR, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HplsqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HplsqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(HplsqlParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HplsqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HplsqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_CURSOR() { return getToken(HplsqlParser.T_CURSOR, 0); }
		public TerminalNode T_DATA() { return getToken(HplsqlParser.T_DATA, 0); }
		public TerminalNode T_DATABASE() { return getToken(HplsqlParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HplsqlParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(HplsqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HplsqlParser.T_DAYS, 0); }
		public TerminalNode T_DEC() { return getToken(HplsqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HplsqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DECLARE() { return getToken(HplsqlParser.T_DECLARE, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HplsqlParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(HplsqlParser.T_DEFINED, 0); }
		public TerminalNode T_DEFINER() { return getToken(HplsqlParser.T_DEFINER, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HplsqlParser.T_DEFINITION, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HplsqlParser.T_DELIMITED, 0); }
		public TerminalNode T_DELIMITER() { return getToken(HplsqlParser.T_DELIMITER, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HplsqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_DESC() { return getToken(HplsqlParser.T_DESC, 0); }
		public TerminalNode T_DESCRIBE() { return getToken(HplsqlParser.T_DESCRIBE, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(HplsqlParser.T_DIAGNOSTICS, 0); }
		public TerminalNode T_DIR() { return getToken(HplsqlParser.T_DIR, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(HplsqlParser.T_DIRECTORY, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HplsqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_DO() { return getToken(HplsqlParser.T_DO, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HplsqlParser.T_DOUBLE, 0); }
		public TerminalNode T_DROP() { return getToken(HplsqlParser.T_DROP, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HplsqlParser.T_DYNAMIC, 0); }
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public TerminalNode T_ENGINE() { return getToken(HplsqlParser.T_ENGINE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(HplsqlParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HplsqlParser.T_EXCEPT, 0); }
		public TerminalNode T_EXEC() { return getToken(HplsqlParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(HplsqlParser.T_EXECUTE, 0); }
		public TerminalNode T_EXCEPTION() { return getToken(HplsqlParser.T_EXCEPTION, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HplsqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public TerminalNode T_EXIT() { return getToken(HplsqlParser.T_EXIT, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HplsqlParser.T_FALLBACK, 0); }
		public TerminalNode T_FALSE() { return getToken(HplsqlParser.T_FALSE, 0); }
		public TerminalNode T_FETCH() { return getToken(HplsqlParser.T_FETCH, 0); }
		public TerminalNode T_FIELDS() { return getToken(HplsqlParser.T_FIELDS, 0); }
		public TerminalNode T_FILE() { return getToken(HplsqlParser.T_FILE, 0); }
		public TerminalNode T_FILES() { return getToken(HplsqlParser.T_FILES, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HplsqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_FOREIGN() { return getToken(HplsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_FORMAT() { return getToken(HplsqlParser.T_FORMAT, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public TerminalNode T_FULL() { return getToken(HplsqlParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public TerminalNode T_GET() { return getToken(HplsqlParser.T_GET, 0); }
		public TerminalNode T_GLOBAL() { return getToken(HplsqlParser.T_GLOBAL, 0); }
		public TerminalNode T_GO() { return getToken(HplsqlParser.T_GO, 0); }
		public TerminalNode T_GRANT() { return getToken(HplsqlParser.T_GRANT, 0); }
		public TerminalNode T_GROUP() { return getToken(HplsqlParser.T_GROUP, 0); }
		public TerminalNode T_HANDLER() { return getToken(HplsqlParser.T_HANDLER, 0); }
		public TerminalNode T_HASH() { return getToken(HplsqlParser.T_HASH, 0); }
		public TerminalNode T_HAVING() { return getToken(HplsqlParser.T_HAVING, 0); }
		public TerminalNode T_HDFS() { return getToken(HplsqlParser.T_HDFS, 0); }
		public TerminalNode T_HIVE() { return getToken(HplsqlParser.T_HIVE, 0); }
		public TerminalNode T_HOST() { return getToken(HplsqlParser.T_HOST, 0); }
		public TerminalNode T_IDENTITY() { return getToken(HplsqlParser.T_IDENTITY, 0); }
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_IGNORE() { return getToken(HplsqlParser.T_IGNORE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HplsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_INCLUDE() { return getToken(HplsqlParser.T_INCLUDE, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_INITRANS() { return getToken(HplsqlParser.T_INITRANS, 0); }
		public TerminalNode T_INNER() { return getToken(HplsqlParser.T_INNER, 0); }
		public TerminalNode T_INOUT() { return getToken(HplsqlParser.T_INOUT, 0); }
		public TerminalNode T_INSERT() { return getToken(HplsqlParser.T_INSERT, 0); }
		public TerminalNode T_INT2() { return getToken(HplsqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HplsqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HplsqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HplsqlParser.T_INTEGER, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HplsqlParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(HplsqlParser.T_INTERVAL, 0); }
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public TerminalNode T_INVOKER() { return getToken(HplsqlParser.T_INVOKER, 0); }
		public TerminalNode T_ITEMS() { return getToken(HplsqlParser.T_ITEMS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_ISOPEN() { return getToken(HplsqlParser.T_ISOPEN, 0); }
		public TerminalNode T_JOIN() { return getToken(HplsqlParser.T_JOIN, 0); }
		public TerminalNode T_KEEP() { return getToken(HplsqlParser.T_KEEP, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public TerminalNode T_KEYS() { return getToken(HplsqlParser.T_KEYS, 0); }
		public TerminalNode T_LAG() { return getToken(HplsqlParser.T_LAG, 0); }
		public TerminalNode T_LANGUAGE() { return getToken(HplsqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_LAST_VALUE() { return getToken(HplsqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HplsqlParser.T_LEAD, 0); }
		public TerminalNode T_LEAVE() { return getToken(HplsqlParser.T_LEAVE, 0); }
		public TerminalNode T_LEFT() { return getToken(HplsqlParser.T_LEFT, 0); }
		public TerminalNode T_LIKE() { return getToken(HplsqlParser.T_LIKE, 0); }
		public TerminalNode T_LIMIT() { return getToken(HplsqlParser.T_LIMIT, 0); }
		public TerminalNode T_LINES() { return getToken(HplsqlParser.T_LINES, 0); }
		public TerminalNode T_LOCAL() { return getToken(HplsqlParser.T_LOCAL, 0); }
		public TerminalNode T_LOCATION() { return getToken(HplsqlParser.T_LOCATION, 0); }
		public TerminalNode T_LOCATOR() { return getToken(HplsqlParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(HplsqlParser.T_LOCATORS, 0); }
		public TerminalNode T_LOCKS() { return getToken(HplsqlParser.T_LOCKS, 0); }
		public TerminalNode T_LOG() { return getToken(HplsqlParser.T_LOG, 0); }
		public TerminalNode T_LOGGED() { return getToken(HplsqlParser.T_LOGGED, 0); }
		public TerminalNode T_LOGGING() { return getToken(HplsqlParser.T_LOGGING, 0); }
		public TerminalNode T_LOOP() { return getToken(HplsqlParser.T_LOOP, 0); }
		public TerminalNode T_MAP() { return getToken(HplsqlParser.T_MAP, 0); }
		public TerminalNode T_MATCHED() { return getToken(HplsqlParser.T_MATCHED, 0); }
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HplsqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_MERGE() { return getToken(HplsqlParser.T_MERGE, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(HplsqlParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HplsqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HplsqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_MIN() { return getToken(HplsqlParser.T_MIN, 0); }
		public TerminalNode T_MULTISET() { return getToken(HplsqlParser.T_MULTISET, 0); }
		public TerminalNode T_NCHAR() { return getToken(HplsqlParser.T_NCHAR, 0); }
		public TerminalNode T_NEW() { return getToken(HplsqlParser.T_NEW, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HplsqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HplsqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(HplsqlParser.T_NOCOUNT, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HplsqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_NONE() { return getToken(HplsqlParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HplsqlParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HplsqlParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(HplsqlParser.T_NUMBER, 0); }
		public TerminalNode T_OBJECT() { return getToken(HplsqlParser.T_OBJECT, 0); }
		public TerminalNode T_OFF() { return getToken(HplsqlParser.T_OFF, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(HplsqlParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(HplsqlParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(HplsqlParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(HplsqlParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(HplsqlParser.T_OVER, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HplsqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_OWNER() { return getToken(HplsqlParser.T_OWNER, 0); }
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HplsqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HplsqlParser.T_PART_LOC, 0); }
		public TerminalNode T_PARTITION() { return getToken(HplsqlParser.T_PARTITION, 0); }
		public TerminalNode T_PCTFREE() { return getToken(HplsqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HplsqlParser.T_PCTUSED, 0); }
		public TerminalNode T_PRECISION() { return getToken(HplsqlParser.T_PRECISION, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HplsqlParser.T_PRESERVE, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_PRINT() { return getToken(HplsqlParser.T_PRINT, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PWD() { return getToken(HplsqlParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(HplsqlParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(HplsqlParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(HplsqlParser.T_QUIT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(HplsqlParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_RAISE() { return getToken(HplsqlParser.T_RAISE, 0); }
		public TerminalNode T_RANK() { return getToken(HplsqlParser.T_RANK, 0); }
		public TerminalNode T_REAL() { return getToken(HplsqlParser.T_REAL, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(HplsqlParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(HplsqlParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_RESIGNAL() { return getToken(HplsqlParser.T_RESIGNAL, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HplsqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HplsqlParser.T_RETURNS, 0); }
		public TerminalNode T_REVERSE() { return getToken(HplsqlParser.T_REVERSE, 0); }
		public TerminalNode T_RIGHT() { return getToken(HplsqlParser.T_RIGHT, 0); }
		public TerminalNode T_RLIKE() { return getToken(HplsqlParser.T_RLIKE, 0); }
		public TerminalNode T_RS() { return getToken(HplsqlParser.T_RS, 0); }
		public TerminalNode T_ROLE() { return getToken(HplsqlParser.T_ROLE, 0); }
		public TerminalNode T_ROLLBACK() { return getToken(HplsqlParser.T_ROLLBACK, 0); }
		public TerminalNode T_ROW() { return getToken(HplsqlParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(HplsqlParser.T_ROWS, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HplsqlParser.T_ROW_COUNT, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HplsqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_SECOND() { return getToken(HplsqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HplsqlParser.T_SECONDS, 0); }
		public TerminalNode T_SECURITY() { return getToken(HplsqlParser.T_SECURITY, 0); }
		public TerminalNode T_SEGMENT() { return getToken(HplsqlParser.T_SEGMENT, 0); }
		public TerminalNode T_SEL() { return getToken(HplsqlParser.T_SEL, 0); }
		public TerminalNode T_SELECT() { return getToken(HplsqlParser.T_SELECT, 0); }
		public TerminalNode T_SESSION() { return getToken(HplsqlParser.T_SESSION, 0); }
		public TerminalNode T_SESSIONS() { return getToken(HplsqlParser.T_SESSIONS, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(HplsqlParser.T_SETS, 0); }
		public TerminalNode T_SHARE() { return getToken(HplsqlParser.T_SHARE, 0); }
		public TerminalNode T_SIGNAL() { return getToken(HplsqlParser.T_SIGNAL, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HplsqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HplsqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HplsqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HplsqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SQL() { return getToken(HplsqlParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HplsqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(HplsqlParser.T_SQLINSERT, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(HplsqlParser.T_SQLSTATE, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HplsqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_STATS() { return getToken(HplsqlParser.T_STATS, 0); }
		public TerminalNode T_STATISTICS() { return getToken(HplsqlParser.T_STATISTICS, 0); }
		public TerminalNode T_STEP() { return getToken(HplsqlParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(HplsqlParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(HplsqlParser.T_STORAGE, 0); }
		public TerminalNode T_SUBDIR() { return getToken(HplsqlParser.T_SUBDIR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HplsqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(HplsqlParser.T_SUM, 0); }
		public TerminalNode T_SUMMARY() { return getToken(HplsqlParser.T_SUMMARY, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HplsqlParser.T_SYSDATE, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HplsqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public TerminalNode T_TABLESPACE() { return getToken(HplsqlParser.T_TABLESPACE, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HplsqlParser.T_TERMINATED, 0); }
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HplsqlParser.T_TEXTIMAGE_ON, 0); }
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TITLE() { return getToken(HplsqlParser.T_TITLE, 0); }
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public TerminalNode T_TOP() { return getToken(HplsqlParser.T_TOP, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HplsqlParser.T_TRANSACTION, 0); }
		public TerminalNode T_TRIM() { return getToken(HplsqlParser.T_TRIM, 0); }
		public TerminalNode T_TRUE() { return getToken(HplsqlParser.T_TRUE, 0); }
		public TerminalNode T_TRUNCATE() { return getToken(HplsqlParser.T_TRUNCATE, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_UR() { return getToken(HplsqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HplsqlParser.T_USE, 0); }
		public TerminalNode T_USER() { return getToken(HplsqlParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(HplsqlParser.T_USING, 0); }
		public TerminalNode T_VALUE() { return getToken(HplsqlParser.T_VALUE, 0); }
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public TerminalNode T_VAR() { return getToken(HplsqlParser.T_VAR, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HplsqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HplsqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_VARYING() { return getToken(HplsqlParser.T_VARYING, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HplsqlParser.T_VARIANCE, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HplsqlParser.T_VOLATILE, 0); }
		public TerminalNode T_WHILE() { return getToken(HplsqlParser.T_WHILE, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_WITHOUT() { return getToken(HplsqlParser.T_WITHOUT, 0); }
		public TerminalNode T_WORK() { return getToken(HplsqlParser.T_WORK, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(HplsqlParser.T_XACT_ABORT, 0); }
		public TerminalNode T_XML() { return getToken(HplsqlParser.T_XML, 0); }
		public TerminalNode T_YES() { return getToken(HplsqlParser.T_YES, 0); }
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNon_reserved_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNon_reserved_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNon_reserved_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2853);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE) | (1L << T_DATA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return block_end_sempred((Block_endContext)_localctx, predIndex);
		case 57:
			return cpp_smt_sempred((Cpp_smtContext)_localctx, predIndex);
		case 79:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 121:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 132:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 142:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 150:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 168:
			return func_param_sempred((Func_paramContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_end_sempred(Block_endContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
		}
		return true;
	}
	private boolean cpp_smt_sempred(Cpp_smtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean create_routine_params_sempred(Create_routine_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return !_input.LT(1).getText().equalsIgnoreCase("IS") &&
		        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean select_list_alias_sempred(Select_list_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM");
		}
		return true;
	}
	private boolean from_alias_clause_sempred(From_alias_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return !_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
		        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
		        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
		        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("WITH");
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 16);
		case 12:
			return precpred(_ctx, 15);
		case 13:
			return precpred(_ctx, 14);
		case 14:
			return precpred(_ctx, 13);
		case 15:
			return precpred(_ctx, 17);
		}
		return true;
	}
	private boolean func_param_sempred(Func_paramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u017b\u0b2a\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u0174\n\3\3\3\5\3\u0177\n\3\6\3\u0179"+
		"\n\3\r\3\16\3\u017a\3\4\5\4\u017e\n\4\3\4\3\4\3\4\5\4\u0183\n\4\3\4\3"+
		"\4\3\5\3\5\3\5\5\5\u018a\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0191\n\5\5\5\u0193"+
		"\n\5\3\6\3\6\3\6\3\7\3\7\6\7\u019a\n\7\r\7\16\7\u019b\3\7\5\7\u019f\n"+
		"\7\3\7\3\7\5\7\u01a3\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01be\n\b\3"+
		"\t\3\t\6\t\u01c2\n\t\r\t\16\t\u01c3\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\5\13\u01cf\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u01d8\n\f\f\f"+
		"\16\f\u01db\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01e3\n\r\f\r\16\r\u01e6"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\7\16\u01ed\n\16\f\16\16\16\u01f0\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u01f7\n\17\3\20\3\20\3\20\7\20\u01fc\n"+
		"\20\f\20\16\20\u01ff\13\20\3\20\5\20\u0202\n\20\3\20\3\20\5\20\u0206\n"+
		"\20\3\20\7\20\u0209\n\20\f\20\16\20\u020c\13\20\3\20\5\20\u020f\n\20\3"+
		"\20\3\20\3\20\5\20\u0214\n\20\3\20\3\20\5\20\u0218\n\20\3\20\3\20\5\20"+
		"\u021c\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0226\n\22\3"+
		"\22\3\22\5\22\u022a\n\22\3\22\3\22\3\22\5\22\u022f\n\22\3\23\3\23\3\23"+
		"\5\23\u0234\n\23\3\23\3\23\5\23\u0238\n\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u0245\n\25\3\25\3\25\3\26\5\26\u024a"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u0250\n\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u025b\n\27\3\27\3\27\5\27\u025f\n\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\5\30\u0269\n\30\3\30\5\30\u026c\n\30\3\30"+
		"\3\30\3\30\5\30\u0271\n\30\3\30\3\30\3\31\5\31\u0276\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u027d\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0284\n\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u029c\n\35\f\35\16\35\u029f"+
		"\13\35\3\36\3\36\3\36\5\36\u02a4\n\36\3\36\7\36\u02a7\n\36\f\36\16\36"+
		"\u02aa\13\36\3\36\7\36\u02ad\n\36\f\36\16\36\u02b0\13\36\3\36\3\36\3\36"+
		"\3\36\5\36\u02b6\n\36\3\36\5\36\u02b9\n\36\3\37\3\37\3 \3 \5 \u02bf\n"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u02cb\n \f \16 \u02ce\13 \3 \3 \3 "+
		"\3 \3 \7 \u02d5\n \f \16 \u02d8\13 \3 \3 \3 \5 \u02dd\n \3!\3!\3!\5!\u02e2"+
		"\n!\3!\3!\3!\5!\u02e7\n!\3!\3!\3!\5!\u02ec\n!\7!\u02ee\n!\f!\16!\u02f1"+
		"\13!\3!\3!\5!\u02f5\n!\3!\5!\u02f8\n!\3!\3!\3!\3!\3!\3!\7!\u0300\n!\f"+
		"!\16!\u0303\13!\3!\3!\3!\3!\3!\3!\3!\7!\u030c\n!\f!\16!\u030f\13!\3!\3"+
		"!\7!\u0313\n!\f!\16!\u0316\13!\5!\u0318\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u0324\n\"\3#\6#\u0327\n#\r#\16#\u0328\3$\3$\3$\5$\u032e"+
		"\n$\3%\5%\u0331\n%\3%\3%\3&\6&\u0336\n&\r&\16&\u0337\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u0344\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\6(\u0351\n(\r(\16(\u0352\3(\3(\3(\5(\u0358\n(\3)\5)\u035b\n)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0368\n)\f)\16)\u036b\13)\3)\3)\3)\5)\u0370"+
		"\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u037b\n)\3*\5*\u037e\n*\3*\3*\3*\3*"+
		"\3*\3*\7*\u0386\n*\f*\16*\u0389\13*\3*\3*\3*\3*\5*\u038f\n*\3+\3+\3+\3"+
		"+\3+\3+\5+\u0397\n+\3,\3,\3,\3,\7,\u039d\n,\f,\16,\u03a0\13,\3-\3-\3-"+
		"\3-\3-\3-\3-\5-\u03a9\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\5-\u03bd\n-\3.\3.\3.\3.\5.\u03c3\n.\3/\3/\5/\u03c7\n/\3/\3/"+
		"\3/\5/\u03cc\n/\3/\3/\5/\u03d0\n/\3/\3/\3/\5/\u03d5\n/\3/\5/\u03d8\n/"+
		"\3/\3/\3/\5/\u03dd\n/\3/\5/\u03e0\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u03ee\n\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u040e\n\60\5\60"+
		"\u0410\n\60\3\61\3\61\3\61\5\61\u0415\n\61\3\61\3\61\5\61\u0419\n\61\3"+
		"\61\3\61\3\62\5\62\u041e\n\62\3\62\3\62\3\62\3\62\3\62\5\62\u0425\n\62"+
		"\3\62\5\62\u0428\n\62\3\63\5\63\u042b\n\63\3\63\3\63\3\63\5\63\u0430\n"+
		"\63\3\63\3\63\5\63\u0434\n\63\5\63\u0436\n\63\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u043d\n\64\3\64\3\64\7\64\u0441\n\64\f\64\16\64\u0444\13\64\3\64"+
		"\5\64\u0447\n\64\3\65\3\65\3\65\3\65\5\65\u044d\n\65\3\66\3\66\3\66\3"+
		"\66\5\66\u0453\n\66\3\66\3\66\7\66\u0457\n\66\f\66\16\66\u045a\13\66\3"+
		"\66\3\66\3\66\3\66\5\66\u0460\n\66\3\66\3\66\7\66\u0464\n\66\f\66\16\66"+
		"\u0467\13\66\3\66\3\66\3\66\3\66\3\66\5\66\u046e\n\66\3\66\3\66\7\66\u0472"+
		"\n\66\f\66\16\66\u0475\13\66\5\66\u0477\n\66\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u047e\n\67\3\67\3\67\3\67\5\67\u0483\n\67\3\67\5\67\u0486\n\67\3"+
		"\67\3\67\3\67\38\38\38\39\39\39\39\39\39\79\u0494\n9\f9\169\u0497\139"+
		"\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\7;\u04b2\n;\f;\16;\u04b5\13;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u04ce\n<\3=\3=\3=\3=\3=\7=\u04d5"+
		"\n=\f=\16=\u04d8\13=\3=\3=\3=\7=\u04dd\n=\f=\16=\u04e0\13=\3=\5=\u04e3"+
		"\n=\3=\3=\3=\3=\3=\7=\u04ea\n=\f=\16=\u04ed\13=\3=\3=\3=\3=\3=\7=\u04f4"+
		"\n=\f=\16=\u04f7\13=\3=\5=\u04fa\n=\5=\u04fc\n=\3>\3>\3>\3?\3?\3?\3?\3"+
		"?\3@\3@\3@\3@\5@\u050a\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0518"+
		"\nA\3B\3B\3B\3B\3B\5B\u051f\nB\3B\5B\u0522\nB\3B\3B\3B\5B\u0527\nB\3B"+
		"\3B\3C\3C\3C\5C\u052e\nC\3C\3C\3C\3D\3D\3D\3D\5D\u0537\nD\3D\5D\u053a"+
		"\nD\3D\3D\3D\5D\u053f\nD\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u054c\nE"+
		"\5E\u054e\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u055e\nE\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\5F\u0568\nF\3G\5G\u056b\nG\3G\3G\3G\3G\3G\5G\u0572"+
		"\nG\3H\3H\3H\3H\5H\u0578\nH\3H\5H\u057b\nH\3H\3H\3H\5H\u0580\nH\3H\3H"+
		"\5H\u0584\nH\3H\5H\u0587\nH\3H\3H\3I\3I\3I\5I\u058e\nI\3J\3J\3J\3J\5J"+
		"\u0594\nJ\3J\5J\u0597\nJ\3J\3J\3J\3J\3J\3J\3J\3J\5J\u05a1\nJ\3K\3K\3K"+
		"\3K\3K\7K\u05a8\nK\fK\16K\u05ab\13K\3L\3L\3L\3L\5L\u05b1\nL\3L\3L\3L\3"+
		"L\3L\5L\u05b8\nL\5L\u05ba\nL\3M\3M\3M\3M\5M\u05c0\nM\3M\5M\u05c3\nM\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u05ce\nM\3N\3N\3N\3N\3N\7N\u05d5\nN\fN\16"+
		"N\u05d8\13N\3O\3O\3O\5O\u05dd\nO\3P\3P\3P\3P\5P\u05e3\nP\3P\5P\u05e6\n"+
		"P\3P\3P\3P\5P\u05eb\nP\3P\5P\u05ee\nP\3P\5P\u05f1\nP\3P\5P\u05f4\nP\3"+
		"P\5P\u05f7\nP\3P\3P\3P\3P\5P\u05fd\nP\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u0605\nQ\f"+
		"Q\16Q\u0608\13Q\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u0610\nQ\fQ\16Q\u0613\13Q\5Q\u0615"+
		"\nQ\3R\3R\3R\3R\3R\5R\u061c\nR\3R\3R\3R\5R\u0621\nR\3R\7R\u0624\nR\fR"+
		"\16R\u0627\13R\3R\5R\u062a\nR\3R\3R\3R\3R\3R\3R\5R\u0632\nR\3R\3R\5R\u0636"+
		"\nR\3R\7R\u0639\nR\fR\16R\u063c\13R\3R\5R\u063f\nR\5R\u0641\nR\3S\6S\u0644"+
		"\nS\rS\16S\u0645\3T\3T\3T\3T\3T\3T\5T\u064e\nT\3T\3T\3T\5T\u0653\nT\3"+
		"U\3U\3U\3U\3U\7U\u065a\nU\fU\16U\u065d\13U\3U\3U\3V\3V\5V\u0663\nV\3V"+
		"\3V\3V\3V\5V\u0669\nV\3V\3V\5V\u066d\nV\3W\3W\5W\u0671\nW\3X\3X\5X\u0675"+
		"\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u067f\nY\3Z\3Z\3[\3[\5[\u0685\n[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\7[\u068f\n[\f[\16[\u0692\13[\3[\3[\3\\\3\\\5\\\u0698"+
		"\n\\\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\7^\u06a6\n^\f^\16^\u06a9\13^"+
		"\3^\3^\7^\u06ad\n^\f^\16^\u06b0\13^\3_\3_\3_\5_\u06b5\n_\3`\5`\u06b8\n"+
		"`\3`\3`\5`\u06bc\n`\3`\5`\u06bf\n`\3`\3`\3a\3a\3a\3b\3b\3b\3b\5b\u06ca"+
		"\nb\3b\5b\u06cd\nb\3b\3b\3b\3c\3c\3c\3c\3c\3c\5c\u06d8\nc\3d\3d\3d\3d"+
		"\3d\3d\5d\u06e0\nd\3e\3e\3e\3e\7e\u06e6\ne\fe\16e\u06e9\13e\3f\3f\3f\3"+
		"f\7f\u06ef\nf\ff\16f\u06f2\13f\3f\3f\3f\7f\u06f7\nf\ff\16f\u06fa\13f\3"+
		"f\3f\5f\u06fe\nf\3f\5f\u0701\nf\3f\5f\u0704\nf\3f\5f\u0707\nf\3f\5f\u070a"+
		"\nf\3f\3f\3g\3g\3g\3g\5g\u0712\ng\3h\3h\5h\u0716\nh\3i\3i\3i\3i\3j\3j"+
		"\5j\u071e\nj\3k\3k\3k\3k\5k\u0724\nk\3l\3l\3l\3l\3l\3l\3l\5l\u072d\nl"+
		"\3m\3m\3m\3m\3m\3m\3m\3m\3n\3n\3o\5o\u073a\no\3o\3o\3o\3p\3p\3p\3p\7p"+
		"\u0743\np\fp\16p\u0746\13p\3q\3q\5q\u074a\nq\3q\3q\3q\3q\3q\3r\3r\3r\3"+
		"r\7r\u0755\nr\fr\16r\u0758\13r\3r\3r\3s\3s\3s\3s\7s\u0760\ns\fs\16s\u0763"+
		"\13s\3s\3s\3t\3t\3t\3t\3t\3t\3t\5t\u076e\nt\3u\3u\5u\u0772\nu\3u\3u\5"+
		"u\u0776\nu\3u\3u\5u\u077a\nu\5u\u077c\nu\3v\3v\3v\3v\5v\u0782\nv\3v\5"+
		"v\u0785\nv\3v\5v\u0788\nv\3v\5v\u078b\nv\3v\3v\5v\u078f\nv\3v\5v\u0792"+
		"\nv\3v\5v\u0795\nv\3v\3v\3w\5w\u079a\nw\3w\5w\u079d\nw\3w\3w\3w\3w\3w"+
		"\3w\7w\u07a5\nw\fw\16w\u07a8\13w\3x\3x\3y\3y\3y\3z\3z\3z\5z\u07b2\nz\3"+
		"z\3z\5z\u07b6\nz\3z\5z\u07b9\nz\3z\3z\3{\3{\5{\u07bf\n{\3{\3{\3{\3{\3"+
		"{\5{\u07c6\n{\3|\3|\5|\u07ca\n|\3|\3|\3}\3}\3}\3}\7}\u07d2\n}\f}\16}\u07d5"+
		"\13}\3~\3~\3~\7~\u07da\n~\f~\16~\u07dd\13~\3~\3~\3\177\3\177\3\177\5\177"+
		"\u07e4\n\177\3\u0080\3\u0080\5\u0080\u07e8\n\u0080\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\5\u0081\u07ee\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\5\u0082\u07f7\n\u0082\3\u0083\5\u0083\u07fa\n\u0083\3"+
		"\u0083\3\u0083\3\u0083\5\u0083\u07ff\n\u0083\3\u0083\5\u0083\u0802\n\u0083"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u080a\n\u0084"+
		"\f\u0084\16\u0084\u080d\13\u0084\3\u0084\3\u0084\5\u0084\u0811\n\u0084"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u0818\n\u0085\f\u0085"+
		"\16\u0085\u081b\13\u0085\3\u0085\3\u0085\5\u0085\u081f\n\u0085\3\u0086"+
		"\3\u0086\5\u0086\u0823\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\7\u0086\u082a\n\u0086\f\u0086\16\u0086\u082d\13\u0086\3\u0086\5\u0086"+
		"\u0830\n\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\5\u0088\u0837\n"+
		"\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\7\u008a\u0841\n\u008a\f\u008a\16\u008a\u0844\13\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d"+
		"\u0850\n\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0855\n\u008d\7\u008d\u0857"+
		"\n\u008d\f\u008d\16\u008d\u085a\13\u008d\3\u008e\6\u008e\u085d\n\u008e"+
		"\r\u008e\16\u008e\u085e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\5\u008f\u086a\n\u008f\5\u008f\u086c\n\u008f\3"+
		"\u0090\3\u0090\5\u0090\u0870\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3"+
		"\u0090\5\u0090\u0877\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u087d"+
		"\n\u0090\f\u0090\16\u0090\u0880\13\u0090\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u0885\n\u0091\3\u0092\3\u0092\3\u0092\5\u0092\u088a\n\u0092\3\u0092\3"+
		"\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092"+
		"\u0895\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\5\u0092\u089e\n\u0092\3\u0093\3\u0093\5\u0093\u08a2\n\u0093\3\u0093\3"+
		"\u0093\3\u0093\3\u0093\3\u0093\7\u0093\u08a9\n\u0093\f\u0093\16\u0093"+
		"\u08ac\13\u0093\3\u0093\5\u0093\u08af\n\u0093\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\7\u0094\u08b7\n\u0094\f\u0094\16\u0094\u08ba"+
		"\13\u0094\3\u0094\3\u0094\5\u0094\u08be\n\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097"+
		"\u08d4\n\u0097\3\u0097\5\u0097\u08d7\n\u0097\3\u0098\3\u0098\3\u0098\3"+
		"\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\5\u0098\u08f0\n\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\7\u0098\u0900\n\u0098\f\u0098\16\u0098\u0903\13\u0098\3\u0099"+
		"\3\u0099\5\u0099\u0907\n\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u0915"+
		"\n\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\7\u009d\u0922\n\u009d\f\u009d\16\u009d\u0925"+
		"\13\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\5\u009e\u0930\n\u009e\3\u009f\3\u009f\5\u009f\u0934\n\u009f\3"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\6\u00a0\u093d\n"+
		"\u00a0\r\u00a0\16\u00a0\u093e\3\u00a0\3\u00a0\5\u00a0\u0943\n\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\6\u00a1"+
		"\u094d\n\u00a1\r\u00a1\16\u00a1\u094e\3\u00a1\3\u00a1\5\u00a1\u0953\n"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u095e\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0963\n"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0968\n\u00a3\3\u00a3\3\u00a3\3"+
		"\u00a3\5\u00a3\u096d\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0972\n\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0977\n\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0992\n\u00a3\5\u00a3\u0994\n"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3"+
		"\u09a6\n\u00a3\5\u00a3\u09a8\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3"+
		"\u00a3\3\u00a3\5\u00a3\u09b0\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u09b5"+
		"\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u09ba\n\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u09bf\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u09d0\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u09d5\n"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u09da\n\u00a3\3\u00a3\3\u00a3\3"+
		"\u00a3\5\u00a3\u09df\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u09e4\n\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u09e9\n\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\5\u00a3\u09ee\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u09f3\n\u00a3\5"+
		"\u00a3\u09f5\n\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u09fc"+
		"\n\u00a5\3\u00a5\5\u00a5\u09ff\n\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u0a08\n\u00a6\f\u00a6\16\u00a6\u0a0b"+
		"\13\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7"+
		"\u0a14\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7"+
		"\u0a1c\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\5\u00a7\u0a25\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0a2b\n"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u0a3a\n\u00a7\f\u00a7"+
		"\16\u00a7\u0a3d\13\u00a7\5\u00a7\u0a3f\n\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\7\u00a7\u0a4d\n\u00a7\f\u00a7\16\u00a7\u0a50\13\u00a7\5\u00a7\u0a52\n"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u0a60\n\u00a7\f\u00a7\16\u00a7"+
		"\u0a63\13\u00a7\5\u00a7\u0a65\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\7\u00a7"+
		"\u0a73\n\u00a7\f\u00a7\16\u00a7\u0a76\13\u00a7\5\u00a7\u0a78\n\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u0a86\n\u00a7\f\u00a7\16\u00a7\u0a89"+
		"\13\u00a7\5\u00a7\u0a8b\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u0a99"+
		"\n\u00a7\f\u00a7\16\u00a7\u0a9c\13\u00a7\5\u00a7\u0a9e\n\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\7\u00a7\u0aaa\n\u00a7\f\u00a7\16\u00a7\u0aad\13\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\6\u00a7"+
		"\u0ab9\n\u00a7\r\u00a7\16\u00a7\u0aba\3\u00a7\3\u00a7\5\u00a7\u0abf\n"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0acf\n\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0ad5\n\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a8\5\u00a8\u0ada\n\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9"+
		"\7\u00a9\u0ae1\n\u00a9\f\u00a9\16\u00a9\u0ae4\13\u00a9\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\5\u00aa\u0aea\n\u00aa\5\u00aa\u0aec\n\u00aa\3\u00aa\3"+
		"\u00aa\3\u00ab\3\u00ab\5\u00ab\u0af2\n\u00ab\3\u00ac\3\u00ac\5\u00ac\u0af6"+
		"\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0afc\n\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\7\u00ad\u0b01\n\u00ad\f\u00ad\16\u00ad\u0b04\13\u00ad"+
		"\5\u00ad\u0b06\n\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af"+
		"\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u0b11\n\u00b0\f\u00b0\16\u00b0\u0b14"+
		"\13\u00b0\3\u00b1\3\u00b1\5\u00b1\u0b18\n\u00b1\3\u00b2\5\u00b2\u0b1b"+
		"\n\u00b2\3\u00b2\3\u00b2\3\u00b3\5\u00b3\u0b20\n\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\2\5t\u011e\u012e"+
		"\u00b7\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132"+
		"\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a"+
		"\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162"+
		"\u0164\u0166\u0168\u016a\2.\4\2``\u0132\u0132\5\2\f\fpp\u0095\u0095\4"+
		"\2\37\37\'\'\4\2\65\65ii\4\2\u00b4\u00b4\u00fc\u00fc\4\2\r\rQQ\4\2NN\u0127"+
		"\u0127\4\2jj\u00a7\u00a7\4\2NN\u00d4\u00d4\4\2JJ\u0085\u0085\5\2\u0089"+
		"\u0089\u00ae\u00ae\u00d0\u00d1\4\2\u00a9\u00a9\u00bb\u00bb\4\2\u00b8\u00b8"+
		"\u013a\u013a\4\2\u00ef\u00ef\u0124\u0124\4\2\u00ad\u00ad\u0172\u0172\4"+
		"\2\35\35$$\4\2\"\"<<\4\2@@\u00f5\u00f5\4\2\u0158\u0158\u016c\u016c\4\2"+
		"\f\f\u0095\u0095\3\2\u00e6\u00e7\3\2\u00d7\u00d8\6\2;;LL\u0094\u0094\u00cd"+
		"\u00cd\5\2NN\u0084\u0084\u00cc\u00cc\6\2\n\13\u00b9\u00b9\u00dc\u00dc"+
		"\u0138\u0138\3\2\u00c3\u00c4\4\2\u00fd\u00fd\u0121\u0121\6\2\23\23XX\u00aa"+
		"\u00aa\u011b\u011b\4\2\u00aa\u00aa\u0134\u0134\3\2\u00fa\u00fb\4\2\6\6"+
		"VV\5\2uu\u009e\u009e\u00e9\u00e9\5\2<<\u00f1\u00f2\u0128\u0128\5\2gg\u0100"+
		"\u0100\u0127\u0127\4\2\t\t\u00c7\u00c7\5\2\u009f\u009f\u00e0\u00e0\u00ea"+
		"\u00ea\6\2\u0155\u0155\u0159\u0159\u0163\u0163\u016b\u016b\3\2\u0172\u0173"+
		"\5\2DE\u00b1\u00b2\u00f6\u00f7\4\2\62\62\u0158\u0158\5\2ss\u0096\u0096"+
		"\u00be\u00be\4\2\u0155\u0155\u016b\u016b\4\2kk\u0122\u0122\20\2\4\27\31"+
		"[__a\u00be\u00c0\u00d1\u00d3\u00ee\u00f0\u0103\u0105\u010f\u0111\u011c"+
		"\u011e\u0123\u0126\u0131\u0134\u013a\u013d\u0146\u014d\u0154\2\u0ca3\2"+
		"\u016c\3\2\2\2\4\u0178\3\2\2\2\6\u017d\3\2\2\2\b\u0192\3\2\2\2\n\u0194"+
		"\3\2\2\2\f\u01a2\3\2\2\2\16\u01bd\3\2\2\2\20\u01bf\3\2\2\2\22\u01c5\3"+
		"\2\2\2\24\u01cb\3\2\2\2\26\u01d3\3\2\2\2\30\u01dc\3\2\2\2\32\u01e7\3\2"+
		"\2\2\34\u01f6\3\2\2\2\36\u021b\3\2\2\2 \u021d\3\2\2\2\"\u0225\3\2\2\2"+
		"$\u0230\3\2\2\2&\u0239\3\2\2\2(\u023c\3\2\2\2*\u0249\3\2\2\2,\u0253\3"+
		"\2\2\2.\u0264\3\2\2\2\60\u0283\3\2\2\2\62\u0289\3\2\2\2\64\u0291\3\2\2"+
		"\2\66\u0294\3\2\2\28\u0298\3\2\2\2:\u02b8\3\2\2\2<\u02ba\3\2\2\2>\u02dc"+
		"\3\2\2\2@\u0317\3\2\2\2B\u0319\3\2\2\2D\u0326\3\2\2\2F\u032d\3\2\2\2H"+
		"\u0330\3\2\2\2J\u0335\3\2\2\2L\u0343\3\2\2\2N\u0357\3\2\2\2P\u037a\3\2"+
		"\2\2R\u038e\3\2\2\2T\u0396\3\2\2\2V\u0398\3\2\2\2X\u03bc\3\2\2\2Z\u03c2"+
		"\3\2\2\2\\\u03df\3\2\2\2^\u040f\3\2\2\2`\u0411\3\2\2\2b\u0427\3\2\2\2"+
		"d\u0435\3\2\2\2f\u0446\3\2\2\2h\u044c\3\2\2\2j\u0476\3\2\2\2l\u0478\3"+
		"\2\2\2n\u048a\3\2\2\2p\u048d\3\2\2\2r\u0498\3\2\2\2t\u049c\3\2\2\2v\u04cd"+
		"\3\2\2\2x\u04fb\3\2\2\2z\u04fd\3\2\2\2|\u0500\3\2\2\2~\u0505\3\2\2\2\u0080"+
		"\u0517\3\2\2\2\u0082\u0519\3\2\2\2\u0084\u052a\3\2\2\2\u0086\u0532\3\2"+
		"\2\2\u0088\u055d\3\2\2\2\u008a\u0567\3\2\2\2\u008c\u056a\3\2\2\2\u008e"+
		"\u057a\3\2\2\2\u0090\u058a\3\2\2\2\u0092\u0596\3\2\2\2\u0094\u05a2\3\2"+
		"\2\2\u0096\u05b9\3\2\2\2\u0098\u05c2\3\2\2\2\u009a\u05cf\3\2\2\2\u009c"+
		"\u05dc\3\2\2\2\u009e\u05e5\3\2\2\2\u00a0\u0614\3\2\2\2\u00a2\u0640\3\2"+
		"\2\2\u00a4\u0643\3\2\2\2\u00a6\u0652\3\2\2\2\u00a8\u0654\3\2\2\2\u00aa"+
		"\u0668\3\2\2\2\u00ac\u0670\3\2\2\2\u00ae\u0674\3\2\2\2\u00b0\u067e\3\2"+
		"\2\2\u00b2\u0680\3\2\2\2\u00b4\u0682\3\2\2\2\u00b6\u0695\3\2\2\2\u00b8"+
		"\u0699\3\2\2\2\u00ba\u069b\3\2\2\2\u00bc\u06b4\3\2\2\2\u00be\u06bb\3\2"+
		"\2\2\u00c0\u06c2\3\2\2\2\u00c2\u06c5\3\2\2\2\u00c4\u06d1\3\2\2\2\u00c6"+
		"\u06df\3\2\2\2\u00c8\u06e1\3\2\2\2\u00ca\u06ea\3\2\2\2\u00cc\u0711\3\2"+
		"\2\2\u00ce\u0713\3\2\2\2\u00d0\u0717\3\2\2\2\u00d2\u071d\3\2\2\2\u00d4"+
		"\u071f\3\2\2\2\u00d6\u072c\3\2\2\2\u00d8\u072e\3\2\2\2\u00da\u0736\3\2"+
		"\2\2\u00dc\u0739\3\2\2\2\u00de\u073e\3\2\2\2\u00e0\u0747\3\2\2\2\u00e2"+
		"\u0750\3\2\2\2\u00e4\u075b\3\2\2\2\u00e6\u076d\3\2\2\2\u00e8\u077b\3\2"+
		"\2\2\u00ea\u077d\3\2\2\2\u00ec\u0799\3\2\2\2\u00ee\u07a9\3\2\2\2\u00f0"+
		"\u07ab\3\2\2\2\u00f2\u07b8\3\2\2\2\u00f4\u07c5\3\2\2\2\u00f6\u07c9\3\2"+
		"\2\2\u00f8\u07cd\3\2\2\2\u00fa\u07d6\3\2\2\2\u00fc\u07e3\3\2\2\2\u00fe"+
		"\u07e5\3\2\2\2\u0100\u07e9\3\2\2\2\u0102\u07f6\3\2\2\2\u0104\u0801\3\2"+
		"\2\2\u0106\u0803\3\2\2\2\u0108\u081e\3\2\2\2\u010a\u0820\3\2\2\2\u010c"+
		"\u0831\3\2\2\2\u010e\u0836\3\2\2\2\u0110\u0838\3\2\2\2\u0112\u083b\3\2"+
		"\2\2\u0114\u0845\3\2\2\2\u0116\u0848\3\2\2\2\u0118\u084b\3\2\2\2\u011a"+
		"\u085c\3\2\2\2\u011c\u086b\3\2\2\2\u011e\u0876\3\2\2\2\u0120\u0884\3\2"+
		"\2\2\u0122\u089d\3\2\2\2\u0124\u089f\3\2\2\2\u0126\u08b2\3\2\2\2\u0128"+
		"\u08c4\3\2\2\2\u012a\u08c8\3\2\2\2\u012c\u08d6\3\2\2\2\u012e\u08ef\3\2"+
		"\2\2\u0130\u0904\3\2\2\2\u0132\u0914\3\2\2\2\u0134\u0916\3\2\2\2\u0136"+
		"\u091a\3\2\2\2\u0138\u091c\3\2\2\2\u013a\u092f\3\2\2\2\u013c\u0933\3\2"+
		"\2\2\u013e\u0935\3\2\2\2\u0140\u0946\3\2\2\2\u0142\u0956\3\2\2\2\u0144"+
		"\u09f4\3\2\2\2\u0146\u09f6\3\2\2\2\u0148\u09f8\3\2\2\2\u014a\u0a02\3\2"+
		"\2\2\u014c\u0ad4\3\2\2\2\u014e\u0ad6\3\2\2\2\u0150\u0add\3\2\2\2\u0152"+
		"\u0ae5\3\2\2\2\u0154\u0af1\3\2\2\2\u0156\u0af5\3\2\2\2\u0158\u0b05\3\2"+
		"\2\2\u015a\u0b07\3\2\2\2\u015c\u0b0a\3\2\2\2\u015e\u0b0d\3\2\2\2\u0160"+
		"\u0b17\3\2\2\2\u0162\u0b1a\3\2\2\2\u0164\u0b1f\3\2\2\2\u0166\u0b23\3\2"+
		"\2\2\u0168\u0b25\3\2\2\2\u016a\u0b27\3\2\2\2\u016c\u016d\5\4\3\2\u016d"+
		"\u016e\7\2\2\3\u016e\3\3\2\2\2\u016f\u0174\5\6\4\2\u0170\u0171\5\16\b"+
		"\2\u0171\u0172\b\3\1\2\u0172\u0174\3\2\2\2\u0173\u016f\3\2\2\2\u0173\u0170"+
		"\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0177\7y\2\2\u0176\u0175\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0173\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\5\3\2\2\2\u017c\u017e"+
		"\5\30\r\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2"+
		"\u017f\u0180\7\23\2\2\u0180\u0182\5\4\3\2\u0181\u0183\5\20\t\2\u0182\u0181"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\5\n\6\2\u0185"+
		"\7\3\2\2\2\u0186\u0187\7\23\2\2\u0187\u0189\5\4\3\2\u0188\u018a\5\20\t"+
		"\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c"+
		"\5\n\6\2\u018c\u0193\3\2\2\2\u018d\u018e\5\16\b\2\u018e\u0190\b\5\1\2"+
		"\u018f\u0191\7\u016a\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0186\3\2\2\2\u0192\u018d\3\2\2\2\u0193\t\3\2\2\2"+
		"\u0194\u0195\6\6\2\2\u0195\u0196\7`\2\2\u0196\13\3\2\2\2\u0197\u01a3\5"+
		"\6\4\2\u0198\u019a\5\16\b\2\u0199\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019f\7y"+
		"\2\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a1\b\7\1\2\u01a1\u01a3\3\2\2\2\u01a2\u0197\3\2\2\2\u01a2\u0199\3\2"+
		"\2\2\u01a3\r\3\2\2\2\u01a4\u01a5\b\b\1\2\u01a5\u01be\5\24\13\2\u01a6\u01be"+
		"\5f\64\2\u01a7\u01a8\5l\67\2\u01a8\u01a9\b\b\1\2\u01a9\u01be\3\2\2\2\u01aa"+
		"\u01be\5\u00b4[\2\u01ab\u01be\5.\30\2\u01ac\u01be\5\u0092J\2\u01ad\u01be"+
		"\5\u0098M\2\u01ae\u01be\5\u009eP\2\u01af\u01b0\5,\27\2\u01b0\u01b1\b\b"+
		"\1\2\u01b1\u01be\3\2\2\2\u01b2\u01be\5\26\f\2\u01b3\u01be\5\u00c4c\2\u01b4"+
		"\u01be\5\u00c6d\2\u01b5\u01be\5\u0082B\2\u01b6\u01b7\5\u0084C\2\u01b7"+
		"\u01b8\b\b\1\2\u01b8\u01be\3\2\2\2\u01b9\u01ba\5\u0088E\2\u01ba\u01bb"+
		"\b\b\1\2\u01bb\u01be\3\2\2\2\u01bc\u01be\5\u00caf\2\u01bd\u01a4\3\2\2"+
		"\2\u01bd\u01a6\3\2\2\2\u01bd\u01a7\3\2\2\2\u01bd\u01aa\3\2\2\2\u01bd\u01ab"+
		"\3\2\2\2\u01bd\u01ac\3\2\2\2\u01bd\u01ad\3\2\2\2\u01bd\u01ae\3\2\2\2\u01bd"+
		"\u01af\3\2\2\2\u01bd\u01b2\3\2\2\2\u01bd\u01b3\3\2\2\2\u01bd\u01b4\3\2"+
		"\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01b6\3\2\2\2\u01bd\u01b9\3\2\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01be\17\3\2\2\2\u01bf\u01c1\7f\2\2\u01c0\u01c2\5\22\n"+
		"\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4"+
		"\3\2\2\2\u01c4\21\3\2\2\2\u01c5\u01c6\7\u0132\2\2\u01c6\u01c7\7\u016e"+
		"\2\2\u01c7\u01c8\7\u011b\2\2\u01c8\u01c9\5\4\3\2\u01c9\u01ca\n\2\2\2\u01ca"+
		"\23\3\2\2\2\u01cb\u01cc\5\u015e\u00b0\2\u01cc\u01ce\7\u0165\2\2\u01cd"+
		"\u01cf\5p9\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2"+
		"\2\u01d0\u01d1\7\u0168\2\2\u01d1\u01d2\7\u016a\2\2\u01d2\25\3\2\2\2\u01d3"+
		"\u01d4\7H\2\2\u01d4\u01d9\5\34\17\2\u01d5\u01d6\7\u0157\2\2\u01d6\u01d8"+
		"\5\34\17\2\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2"+
		"\u01d9\u01da\3\2\2\2\u01da\27\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd"+
		"\7H\2\2\u01dd\u01de\5\34\17\2\u01de\u01e4\7\u016a\2\2\u01df\u01e0\5\34"+
		"\17\2\u01e0\u01e1\7\u016a\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01df\3\2\2\2"+
		"\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\31"+
		"\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\5\34\17\2\u01e8\u01ee\7\u016a"+
		"\2\2\u01e9\u01ea\5\34\17\2\u01ea\u01eb\7\u016a\2\2\u01eb\u01ed\3\2\2\2"+
		"\u01ec\u01e9\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ef\33\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f7\5\"\22\2\u01f2"+
		"\u01f7\5 \21\2\u01f3\u01f7\5(\25\2\u01f4\u01f7\5\36\20\2\u01f5\u01f7\5"+
		"*\26\2\u01f6\u01f1\3\2\2\2\u01f6\u01f2\3\2\2\2\u01f6\u01f3\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7\35\3\2\2\2\u01f8\u01fd\5\u015e"+
		"\u00b0\2\u01f9\u01fa\7\u0157\2\2\u01fa\u01fc\5\u015e\u00b0\2\u01fb\u01f9"+
		"\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\7\f\2\2\u0201\u0200\3\2"+
		"\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\5^\60\2\u0204"+
		"\u0206\5`\61\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u020a\3\2"+
		"\2\2\u0207\u0209\5b\62\2\u0208\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020d\u020f\5d\63\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u021c\3\2\2\2\u0210\u0211\5\u015e\u00b0\2\u0211\u0213\7/\2\2\u0212\u0214"+
		"\7\f\2\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0217\5^\60\2\u0216\u0218\5`\61\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2"+
		"\2\2\u0218\u0219\3\2\2\2\u0219\u021a\5d\63\2\u021a\u021c\3\2\2\2\u021b"+
		"\u01f8\3\2\2\2\u021b\u0210\3\2\2\2\u021c\37\3\2\2\2\u021d\u021e\5\u015e"+
		"\u00b0\2\u021e\u021f\7\63\2\2\u021f!\3\2\2\2\u0220\u0221\7?\2\2\u0221"+
		"\u0226\5\u015e\u00b0\2\u0222\u0223\5\u015e\u00b0\2\u0223\u0224\7?\2\2"+
		"\u0224\u0226\3\2\2\2\u0225\u0220\3\2\2\2\u0225\u0222\3\2\2\2\u0226\u0229"+
		"\3\2\2\2\u0227\u022a\5$\23\2\u0228\u022a\5&\24\2\u0229\u0227\3\2\2\2\u0229"+
		"\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022e\t\3"+
		"\2\2\u022c\u022f\5\u00dco\2\u022d\u022f\5\u012e\u0098\2\u022e\u022c\3"+
		"\2\2\2\u022e\u022d\3\2\2\2\u022f#\3\2\2\2\u0230\u0231\7\u0135\2\2\u0231"+
		"\u0233\7\u00e6\2\2\u0232\u0234\7\u00c5\2\2\u0233\u0232\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0236\7\u011f\2\2\u0236\u0238\t\4\2"+
		"\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238%\3\2\2\2\u0239\u023a"+
		"\7\u0136\2\2\u023a\u023b\7\u00e6\2\2\u023b\'\3\2\2\2\u023c\u023d\t\5\2"+
		"\2\u023d\u023e\7|\2\2\u023e\u0244\7p\2\2\u023f\u0245\7\u0108\2\2\u0240"+
		"\u0245\7\u010b\2\2\u0241\u0242\7\u00bd\2\2\u0242\u0245\7s\2\2\u0243\u0245"+
		"\5\u015e\u00b0\2\u0244\u023f\3\2\2\2\u0244\u0240\3\2\2\2\u0244\u0241\3"+
		"\2\2\2\u0244\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\5\b\5\2\u0247"+
		")\3\2\2\2\u0248\u024a\7x\2\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024b\3\2\2\2\u024b\u024c\7\u0118\2\2\u024c\u024d\7\u0116\2\2\u024d\u024f"+
		"\5\u015e\u00b0\2\u024e\u0250\5D#\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250\u0251\3\2\2\2\u0251\u0252\5\60\31\2\u0252+\3\2\2\2\u0253\u0254"+
		"\b\27\1\2\u0254\u0255\79\2\2\u0255\u0256\7\u013b\2\2\u0256\u025a\7\u0116"+
		"\2\2\u0257\u0258\7\u0083\2\2\u0258\u0259\7\u00bd\2\2\u0259\u025b\7h\2"+
		"\2\u025a\u0257\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e"+
		"\5\u010c\u0087\2\u025d\u025f\5D#\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025f\u0260\3\2\2\2\u0260\u0261\5\60\31\2\u0261\u0262\7\u016a\2\2"+
		"\u0262\u0263\b\27\1\2\u0263-\3\2\2\2\u0264\u026b\79\2\2\u0265\u0266\7"+
		"\u00a2\2\2\u0266\u026c\7\u0118\2\2\u0267\u0269\t\6\2\2\u0268\u0267\3\2"+
		"\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\7\u0131\2\2\u026b"+
		"\u0265\3\2\2\2\u026b\u0268\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\7\u0116"+
		"\2\2\u026e\u0270\5\u015e\u00b0\2\u026f\u0271\5D#\2\u0270\u026f\3\2\2\2"+
		"\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\5\60\31\2\u0273/"+
		"\3\2\2\2\u0274\u0276\7\f\2\2\u0275\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0278\7\u0165\2\2\u0278\u0279\5\u00dco\2\u0279\u027a"+
		"\7\u0168\2\2\u027a\u0284\3\2\2\2\u027b\u027d\7\f\2\2\u027c\u027b\3\2\2"+
		"\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0284\5\u00dco\2\u027f"+
		"\u0280\7\u0165\2\2\u0280\u0281\58\35\2\u0281\u0282\7\u0168\2\2\u0282\u0284"+
		"\3\2\2\2\u0283\u0275\3\2\2\2\u0283\u027c\3\2\2\2\u0283\u027f\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0286\5\66\34\2\u0286\u0287\5\62\32\2\u0287\u0288"+
		"\5\64\33\2\u0288\61\3\2\2\2\u0289\u028a\7\u00ed\2\2\u028a\u028b\7r\2\2"+
		"\u028b\u028c\7O\2\2\u028c\u028d\7m\2\2\u028d\u028e\7\u0119\2\2\u028e\u028f"+
		"\7\34\2\2\u028f\u0290\5\u012e\u0098\2\u0290\63\3\2\2\2\u0291\u0292\7\u00a3"+
		"\2\2\u0292\u0293\5\u012e\u0098\2\u0293\65\3\2\2\2\u0294\u0295\7\u0110"+
		"\2\2\u0295\u0296\7\f\2\2\u0296\u0297\5\u015e\u00b0\2\u0297\67\3\2\2\2"+
		"\u0298\u029d\5:\36\2\u0299\u029a\7\u0157\2\2\u029a\u029c\5:\36\2\u029b"+
		"\u0299\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2"+
		"\2\2\u029e9\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a1\5<\37\2\u02a1\u02a3"+
		"\5^\60\2\u02a2\u02a4\5`\61\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a8\3\2\2\2\u02a5\u02a7\5b\62\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3\2"+
		"\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ae\3\2\2\2\u02aa"+
		"\u02a8\3\2\2\2\u02ab\u02ad\5> \2\u02ac\u02ab\3\2\2\2\u02ad\u02b0\3\2\2"+
		"\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ae"+
		"\3\2\2\2\u02b1\u02b2\b\36\1\2\u02b2\u02b9\3\2\2\2\u02b3\u02b4\7\64\2\2"+
		"\u02b4\u02b6\5\u015e\u00b0\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02b7\3\2\2\2\u02b7\u02b9\5@!\2\u02b8\u02a0\3\2\2\2\u02b8\u02b5\3\2\2"+
		"\2\u02b9;\3\2\2\2\u02ba\u02bb\5\u015e\u00b0\2\u02bb=\3\2\2\2\u02bc\u02dd"+
		"\5d\63\2\u02bd\u02bf\7\u00bd\2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2"+
		"\2\u02bf\u02c0\3\2\2\2\u02c0\u02dd\7\u00bf\2\2\u02c1\u02c2\7\u00d5\2\2"+
		"\u02c2\u02dd\7\u009a\2\2\u02c3\u02dd\7\u0126\2\2\u02c4\u02c5\7\u00df\2"+
		"\2\u02c5\u02c6\5\u010c\u0087\2\u02c6\u02c7\7\u0165\2\2\u02c7\u02c8\5\u015e"+
		"\u00b0\2\u02c8\u02cc\7\u0168\2\2\u02c9\u02cb\5B\"\2\u02ca\u02c9\3\2\2"+
		"\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02dd"+
		"\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d0\7\u0082\2\2\u02d0\u02d1\7\u0165"+
		"\2\2\u02d1\u02d6\7\u0172\2\2\u02d2\u02d3\7\u0157\2\2\u02d3\u02d5\7\u0172"+
		"\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6"+
		"\u02d7\3\2\2\2\u02d7\u02d9\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02dd\7\u0168"+
		"\2\2\u02da\u02dd\7\20\2\2\u02db\u02dd\7_\2\2\u02dc\u02bc\3\2\2\2\u02dc"+
		"\u02be\3\2\2\2\u02dc\u02c1\3\2\2\2\u02dc\u02c3\3\2\2\2\u02dc\u02c4\3\2"+
		"\2\2\u02dc\u02cf\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02db\3\2\2\2\u02dd"+
		"?\3\2\2\2\u02de\u02df\7\u00d5\2\2\u02df\u02e1\7\u009a\2\2\u02e0\u02e2"+
		"\7)\2\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"\u02e4\7\u0165\2\2\u02e4\u02e6\5\u015e\u00b0\2\u02e5\u02e7\t\7\2\2\u02e6"+
		"\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02ef\3\2\2\2\u02e8\u02e9\7\u0157"+
		"\2\2\u02e9\u02eb\5\u015e\u00b0\2\u02ea\u02ec\t\7\2\2\u02eb\u02ea\3\2\2"+
		"\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02e8\3\2\2\2\u02ee\u02f1"+
		"\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1"+
		"\u02ef\3\2\2\2\u02f2\u02f4\7\u0168\2\2\u02f3\u02f5\7_\2\2\u02f4\u02f3"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02f8\5\u00b8]"+
		"\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u0318\3\2\2\2\u02f9\u02fa"+
		"\7q\2\2\u02fa\u02fb\7\u009a\2\2\u02fb\u02fc\7\u0165\2\2\u02fc\u0301\5"+
		"\u015e\u00b0\2\u02fd\u02fe\7\u0157\2\2\u02fe\u0300\5\u015e\u00b0\2\u02ff"+
		"\u02fd\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2"+
		"\2\2\u0302\u0304\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0305\7\u0168\2\2\u0305"+
		"\u0306\7\u00df\2\2\u0306\u0307\5\u010c\u0087\2\u0307\u0308\7\u0165\2\2"+
		"\u0308\u030d\5\u015e\u00b0\2\u0309\u030a\7\u0157\2\2\u030a\u030c\5\u015e"+
		"\u00b0\2\u030b\u0309\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0314\7\u0168"+
		"\2\2\u0311\u0313\5B\"\2\u0312\u0311\3\2\2\2\u0313\u0316\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2"+
		"\2\2\u0317\u02de\3\2\2\2\u0317\u02f9\3\2\2\2\u0318A\3\2\2\2\u0319\u031a"+
		"\7\u00c4\2\2\u031a\u0323\t\b\2\2\u031b\u031c\7\u00b8\2\2\u031c\u0324\7"+
		"\4\2\2\u031d\u0324\7\u00e3\2\2\u031e\u031f\7\u00fc\2\2\u031f\u0324\7\u00bf"+
		"\2\2\u0320\u0321\7\u00fc\2\2\u0321\u0324\7I\2\2\u0322\u0324\7 \2\2\u0323"+
		"\u031b\3\2\2\2\u0323\u031d\3\2\2\2\u0323\u031e\3\2\2\2\u0323\u0320\3\2"+
		"\2\2\u0323\u0322\3\2\2\2\u0324C\3\2\2\2\u0325\u0327\5F$\2\u0326\u0325"+
		"\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"E\3\2\2\2\u032a\u032b\7\u0157\2\2\u032b\u032e\5H%\2\u032c\u032e\5T+\2"+
		"\u032d\u032a\3\2\2\2\u032d\u032c\3\2\2\2\u032eG\3\2\2\2\u032f\u0331\7"+
		"\u00b8\2\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\3\2\2\2"+
		"\u0332\u0333\t\t\2\2\u0333I\3\2\2\2\u0334\u0336\5L\'\2\u0335\u0334\3\2"+
		"\2\2\u0336\u0337\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"K\3\2\2\2\u0339\u033a\7\u00c4\2\2\u033a\u033b\7\60\2\2\u033b\u033c\t\n"+
		"\2\2\u033c\u0344\7\u00ee\2\2\u033d\u0344\5N(\2\u033e\u0344\5P)\2\u033f"+
		"\u0344\5R*\2\u0340\u0344\5T+\2\u0341\u0344\5Z.\2\u0342\u0344\5\\/\2\u0343"+
		"\u0339\3\2\2\2\u0343\u033d\3\2\2\2\u0343\u033e\3\2\2\2\u0343\u033f\3\2"+
		"\2\2\u0343\u0340\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0342\3\2\2\2\u0344"+
		"M\3\2\2\2\u0345\u0346\7\u00f9\2\2\u0346\u0347\7:\2\2\u0347\u0358\t\13"+
		"\2\2\u0348\u0349\t\f\2\2\u0349\u0358\7\u0172\2\2\u034a\u0358\7\u00ba\2"+
		"\2\u034b\u0358\t\r\2\2\u034c\u034d\7\u010f\2\2\u034d\u0350\7\u0165\2\2"+
		"\u034e\u0351\5\u015e\u00b0\2\u034f\u0351\7\u0172\2\2\u0350\u034e\3\2\2"+
		"\2\u0350\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353"+
		"\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0358\7\u0168\2\2\u0355\u0356\7\u0117"+
		"\2\2\u0356\u0358\5\u015e\u00b0\2\u0357\u0345\3\2\2\2\u0357\u0348\3\2\2"+
		"\2\u0357\u034a\3\2\2\2\u0357\u034b\3\2\2\2\u0357\u034c\3\2\2\2\u0357\u0355"+
		"\3\2\2\2\u0358O\3\2\2\2\u0359\u035b\7\u0088\2\2\u035a\u0359\3\2\2\2\u035a"+
		"\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\7\u0086\2\2\u035d\u037b"+
		"\5\u015e\u00b0\2\u035e\u035f\7\u0135\2\2\u035f\u037b\7\u00e1\2\2\u0360"+
		"\u0361\7W\2\2\u0361\u0362\7\34\2\2\u0362\u0363\7}\2\2\u0363\u0364\7\u0165"+
		"\2\2\u0364\u0369\5\u015e\u00b0\2\u0365\u0366\7\u0157\2\2\u0366\u0368\5"+
		"\u015e\u00b0\2\u0367\u0365\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2"+
		"\2\2\u0369\u036a\3\2\2\2\u036a\u036c\3\2\2\2\u036b\u0369\3\2\2\2\u036c"+
		"\u036d\7\u0168\2\2\u036d\u037b\3\2\2\2\u036e\u0370\7\u00bd\2\2\u036f\u036e"+
		"\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u037b\7\u00a8\2"+
		"\2\u0372\u0373\7\61\2\2\u0373\u037b\t\16\2\2\u0374\u0375\7M\2\2\u0375"+
		"\u037b\7\u00c5\2\2\u0376\u0377\7\u0135\2\2\u0377\u0378\7\u00e3\2\2\u0378"+
		"\u0379\7\u00c4\2\2\u0379\u037b\7Z\2\2\u037a\u035a\3\2\2\2\u037a\u035e"+
		"\3\2\2\2\u037a\u0360\3\2\2\2\u037a\u036f\3\2\2\2\u037a\u0372\3\2\2\2\u037a"+
		"\u0374\3\2\2\2\u037a\u0376\3\2\2\2\u037bQ\3\2\2\2\u037c\u037e\7\u0126"+
		"\2\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\3\2\2\2\u037f"+
		"\u0380\7\u00d5\2\2\u0380\u0381\7\u0088\2\2\u0381\u0382\7\u0165\2\2\u0382"+
		"\u0387\5\u015e\u00b0\2\u0383\u0384\7\u0157\2\2\u0384\u0386\5\u015e\u00b0"+
		"\2\u0385\u0383\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388"+
		"\3\2\2\2\u0388\u038a\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u038b\7\u0168\2"+
		"\2\u038b\u038f\3\2\2\2\u038c\u038d\7\u0135\2\2\u038d\u038f\7A\2\2\u038e"+
		"\u037d\3\2\2\2\u038e\u038c\3\2\2\2\u038fS\3\2\2\2\u0390\u0397\5V,\2\u0391"+
		"\u0392\7\u0110\2\2\u0392\u0393\7\f\2\2\u0393\u0397\5\u015e\u00b0\2\u0394"+
		"\u0395\7\u00a3\2\2\u0395\u0397\5\u012e\u0098\2\u0396\u0390\3\2\2\2\u0396"+
		"\u0391\3\2\2\2\u0396\u0394\3\2\2\2\u0397U\3\2\2\2\u0398\u0399\7\u00ed"+
		"\2\2\u0399\u039a\7r\2\2\u039a\u039e\7O\2\2\u039b\u039d\5X-\2\u039c\u039b"+
		"\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"W\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1\u03a2\7m\2\2\u03a2\u03a3\7\u0119\2"+
		"\2\u03a3\u03a4\7\34\2\2\u03a4\u03a8\5\u012e\u0098\2\u03a5\u03a6\7b\2\2"+
		"\u03a6\u03a7\7\34\2\2\u03a7\u03a9\5\u012e\u0098\2\u03a8\u03a5\3\2\2\2"+
		"\u03a8\u03a9\3\2\2\2\u03a9\u03bd\3\2\2\2\u03aa\u03ab\7,\2\2\u03ab\u03ac"+
		"\7\u0097\2\2\u03ac\u03ad\7\u0119\2\2\u03ad\u03ae\7\34\2\2\u03ae\u03bd"+
		"\5\u012e\u0098\2\u03af\u03b0\7\u00ab\2\2\u03b0\u03b1\7\u009b\2\2\u03b1"+
		"\u03b2\7\u0119\2\2\u03b2\u03b3\7\34\2\2\u03b3\u03bd\5\u012e\u0098\2\u03b4"+
		"\u03b5\7\u00a1\2\2\u03b5\u03b6\7\u0119\2\2\u03b6\u03b7\7\34\2\2\u03b7"+
		"\u03bd\5\u012e\u0098\2\u03b8\u03b9\7\u00bf\2\2\u03b9\u03ba\7K\2\2\u03ba"+
		"\u03bb\7\f\2\2\u03bb\u03bd\5\u012e\u0098\2\u03bc\u03a1\3\2\2\2\u03bc\u03aa"+
		"\3\2\2\2\u03bc\u03af\3\2\2\2\u03bc\u03b4\3\2\2\2\u03bc\u03b8\3\2\2\2\u03bd"+
		"Y\3\2\2\2\u03be\u03bf\7\u00c4\2\2\u03bf\u03c3\5\u015e\u00b0\2\u03c0\u03c1"+
		"\7\u011a\2\2\u03c1\u03c3\5\u015e\u00b0\2\u03c2\u03be\3\2\2\2\u03c2\u03c0"+
		"\3\2\2\2\u03c3[\3\2\2\2\u03c4\u03c6\7\20\2\2\u03c5\u03c7\7\u015b\2\2\u03c6"+
		"\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03e0\5\u012e"+
		"\u0098\2\u03c9\u03cb\7.\2\2\u03ca\u03cc\7\u015b\2\2\u03cb\u03ca\3\2\2"+
		"\2\u03cb\u03cc\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03e0\5\u012e\u0098\2"+
		"\u03ce\u03d0\7I\2\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d4"+
		"\3\2\2\2\u03d1\u03d2\7%\2\2\u03d2\u03d5\7\u00fc\2\2\u03d3\u03d5\7&\2\2"+
		"\u03d4\u03d1\3\2\2\2\u03d4\u03d3\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03d8"+
		"\7\u015b\2\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03d9\3\2\2"+
		"\2\u03d9\u03e0\5\u012e\u0098\2\u03da\u03dc\7a\2\2\u03db\u03dd\7\u015b"+
		"\2\2\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de"+
		"\u03e0\5\u012e\u0098\2\u03df\u03c4\3\2\2\2\u03df\u03c9\3\2\2\2\u03df\u03cf"+
		"\3\2\2\2\u03df\u03da\3\2\2\2\u03e0]\3\2\2\2\u03e1\u0410\7$\2\2\u03e2\u0410"+
		"\7\25\2\2\u03e3\u0410\7\26\2\2\u03e4\u0410\7\27\2\2\u03e5\u0410\7\30\2"+
		"\2\u03e6\u0410\7\31\2\2\u03e7\u0410\7B\2\2\u03e8\u0410\7C\2\2\u03e9\u0410"+
		"\7F\2\2\u03ea\u0410\7G\2\2\u03eb\u03ed\7Y\2\2\u03ec\u03ee\7\u00d3\2\2"+
		"\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u0410\3\2\2\2\u03ef\u0410"+
		"\7\u0179\2\2\u03f0\u0410\7\u017a\2\2\u03f1\u0410\7\u008d\2\2\u03f2\u0410"+
		"\7\u008e\2\2\u03f3\u0410\7\u008f\2\2\u03f4\u0410\7\u0090\2\2\u03f5\u0410"+
		"\7\u00b5\2\2\u03f6\u0410\7\u00b7\2\2\u03f7\u0410\7\u00c1\2\2\u03f8\u0410"+
		"\7\u00c0\2\2\u03f9\u0410\7\u00d2\2\2\u03fa\u0410\7\u00de\2\2\u03fb\u03fc"+
		"\7\u00e5\2\2\u03fc\u0410\7\u0130\2\2\u03fd\u0410\7\u0103\2\2\u03fe\u0410"+
		"\7\u0102\2\2\u03ff\u0410\7\u0104\2\2\u0400\u0410\7\u0106\2\2\u0401\u0410"+
		"\7\u0105\2\2\u0402\u0410\7\u017b\2\2\u0403\u0410\7\u0115\2\2\u0404\u0410"+
		"\7\u011c\2\2\u0405\u0410\7\u011d\2\2\u0406\u0410\7\u012e\2\2\u0407\u0410"+
		"\7\u012f\2\2\u0408\u0410\7\u0139\2\2\u0409\u0410\7\u013c\2\2\u040a\u040d"+
		"\5\u015e\u00b0\2\u040b\u040c\7\3\2\2\u040c\u040e\t\17\2\2\u040d\u040b"+
		"\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\3\2\2\2\u040f\u03e1\3\2\2\2\u040f"+
		"\u03e2\3\2\2\2\u040f\u03e3\3\2\2\2\u040f\u03e4\3\2\2\2\u040f\u03e5\3\2"+
		"\2\2\u040f\u03e6\3\2\2\2\u040f\u03e7\3\2\2\2\u040f\u03e8\3\2\2\2\u040f"+
		"\u03e9\3\2\2\2\u040f\u03ea\3\2\2\2\u040f\u03eb\3\2\2\2\u040f\u03ef\3\2"+
		"\2\2\u040f\u03f0\3\2\2\2\u040f\u03f1\3\2\2\2\u040f\u03f2\3\2\2\2\u040f"+
		"\u03f3\3\2\2\2\u040f\u03f4\3\2\2\2\u040f\u03f5\3\2\2\2\u040f\u03f6\3\2"+
		"\2\2\u040f\u03f7\3\2\2\2\u040f\u03f8\3\2\2\2\u040f\u03f9\3\2\2\2\u040f"+
		"\u03fa\3\2\2\2\u040f\u03fb\3\2\2\2\u040f\u03fd\3\2\2\2\u040f\u03fe\3\2"+
		"\2\2\u040f\u03ff\3\2\2\2\u040f\u0400\3\2\2\2\u040f\u0401\3\2\2\2\u040f"+
		"\u0402\3\2\2\2\u040f\u0403\3\2\2\2\u040f\u0404\3\2\2\2\u040f\u0405\3\2"+
		"\2\2\u040f\u0406\3\2\2\2\u040f\u0407\3\2\2\2\u040f\u0408\3\2\2\2\u040f"+
		"\u0409\3\2\2\2\u040f\u040a\3\2\2\2\u0410_\3\2\2\2\u0411\u0412\7\u0165"+
		"\2\2\u0412\u0414\t\20\2\2\u0413\u0415\t\21\2\2\u0414\u0413\3\2\2\2\u0414"+
		"\u0415\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0417\7\u0157\2\2\u0417\u0419"+
		"\7\u0172\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\3\2\2"+
		"\2\u041a\u041b\7\u0168\2\2\u041ba\3\2\2\2\u041c\u041e\7\u00bd\2\2\u041d"+
		"\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0428\7\u00bf"+
		"\2\2\u0420\u0421\7%\2\2\u0421\u0422\7\u00fc\2\2\u0422\u0428\5\u015e\u00b0"+
		"\2\u0423\u0425\7\u00bd\2\2\u0424\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425"+
		"\u0426\3\2\2\2\u0426\u0428\t\22\2\2\u0427\u041d\3\2\2\2\u0427\u0420\3"+
		"\2\2\2\u0427\u0424\3\2\2\2\u0428c\3\2\2\2\u0429\u042b\7\u0156\2\2\u042a"+
		"\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\7\u015b"+
		"\2\2\u042d\u0436\5\u012e\u0098\2\u042e\u0430\7\u0135\2\2\u042f\u042e\3"+
		"\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0433\7I\2\2\u0432"+
		"\u0434\5\u012e\u0098\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0436"+
		"\3\2\2\2\u0435\u042a\3\2\2\2\u0435\u042f\3\2\2\2\u0436e\3\2\2\2\u0437"+
		"\u0438\79\2\2\u0438\u043c\t\23\2\2\u0439\u043a\7\u0083\2\2\u043a\u043b"+
		"\7\u00bd\2\2\u043b\u043d\7h\2\2\u043c\u0439\3\2\2\2\u043c\u043d\3\2\2"+
		"\2\u043d\u043e\3\2\2\2\u043e\u0442\5\u012e\u0098\2\u043f\u0441\5h\65\2"+
		"\u0440\u043f\3\2\2\2\u0441\u0444\3\2\2\2\u0442\u0440\3\2\2\2\u0442\u0443"+
		"\3\2\2\2\u0443\u0447\3\2\2\2\u0444\u0442\3\2\2\2\u0445\u0447\5j\66\2\u0446"+
		"\u0437\3\2\2\2\u0446\u0445\3\2\2\2\u0447g\3\2\2\2\u0448\u0449\7.\2\2\u0449"+
		"\u044d\5\u012e\u0098\2\u044a\u044b\7\u00a3\2\2\u044b\u044d\5\u012e\u0098"+
		"\2\u044c\u0448\3\2\2\2\u044c\u044a\3\2\2\2\u044di\3\2\2\2\u044e\u0452"+
		"\79\2\2\u044f\u0450\7\u0083\2\2\u0450\u0451\7\u00bd\2\2\u0451\u0453\7"+
		"h\2\2\u0452\u044f\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\3\2\2\2\u0454"+
		"\u0458\5\u012e\u0098\2\u0455\u0457\5h\65\2\u0456\u0455\3\2\2\2\u0457\u045a"+
		"\3\2\2\2\u0458\u0456\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u0477\3\2\2\2\u045a"+
		"\u0458\3\2\2\2\u045b\u045f\t\23\2\2\u045c\u045d\7\u0083\2\2\u045d\u045e"+
		"\7\u00bd\2\2\u045e\u0460\7h\2\2\u045f\u045c\3\2\2\2\u045f\u0460\3\2\2"+
		"\2\u0460\u0461\3\2\2\2\u0461\u0465\5\u012e\u0098\2\u0462\u0464\5h\65\2"+
		"\u0463\u0462\3\2\2\2\u0464\u0467\3\2\2\2\u0465\u0463\3\2\2\2\u0465\u0466"+
		"\3\2\2\2\u0466\u0477\3\2\2\2\u0467\u0465\3\2\2\2\u0468\u0469\t\23\2\2"+
		"\u0469\u046d\79\2\2\u046a\u046b\7\u0083\2\2\u046b\u046c\7\u00bd\2\2\u046c"+
		"\u046e\7h\2\2\u046d\u046a\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\3\2"+
		"\2\2\u046f\u0473\5\u012e\u0098\2\u0470\u0472\5h\65\2\u0471\u0470\3\2\2"+
		"\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0477"+
		"\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u044e\3\2\2\2\u0476\u045b\3\2\2\2\u0476"+
		"\u0468\3\2\2\2\u0477k\3\2\2\2\u0478\u0479\b\67\1\2\u0479\u047a\5^\60\2"+
		"\u047a\u047b\5\u015e\u00b0\2\u047b\u047d\7\u0165\2\2\u047c\u047e\5p9\2"+
		"\u047d\u047c\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480"+
		"\7\u0168\2\2\u0480\u0482\7\u0164\2\2\u0481\u0483\5t;\2\u0482\u0481\3\2"+
		"\2\2\u0482\u0483\3\2\2\2\u0483\u0485\3\2\2\2\u0484\u0486\5n8\2\u0485\u0484"+
		"\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\7\u0167\2"+
		"\2\u0488\u0489\b\67\1\2\u0489m\3\2\2\2\u048a\u048b\7\u00e6\2\2\u048b\u048c"+
		"\5\u015e\u00b0\2\u048co\3\2\2\2\u048d\u048e\5r:\2\u048e\u0495\b9\1\2\u048f"+
		"\u0490\7\u0157\2\2\u0490\u0491\5r:\2\u0491\u0492\b9\1\2\u0492\u0494\3"+
		"\2\2\2\u0493\u048f\3\2\2\2\u0494\u0497\3\2\2\2\u0495\u0493\3\2\2\2\u0495"+
		"\u0496\3\2\2\2\u0496q\3\2\2\2\u0497\u0495\3\2\2\2\u0498\u0499\5^\60\2"+
		"\u0499\u049a\5\u015e\u00b0\2\u049a\u049b\b:\1\2\u049bs\3\2\2\2\u049c\u04b3"+
		"\b;\1\2\u049d\u049e\f\b\2\2\u049e\u04b2\5x=\2\u049f\u04a0\f\7\2\2\u04a0"+
		"\u04a1\5\u0088E\2\u04a1\u04a2\b;\1\2\u04a2\u04b2\3\2\2\2\u04a3\u04a4\f"+
		"\6\2\2\u04a4\u04b2\5\u0082B\2\u04a5\u04a6\f\5\2\2\u04a6\u04a7\5\u0084"+
		"C\2\u04a7\u04a8\b;\1\2\u04a8\u04b2\3\2\2\2\u04a9\u04aa\f\4\2\2\u04aa\u04ab"+
		"\5\u00dco\2\u04ab\u04ac\b;\1\2\u04ac\u04b2\3\2\2\2\u04ad\u04ae\f\3\2\2"+
		"\u04ae\u04af\5,\27\2\u04af\u04b0\b;\1\2\u04b0\u04b2\3\2\2\2\u04b1\u049d"+
		"\3\2\2\2\u04b1\u049f\3\2\2\2\u04b1\u04a3\3\2\2\2\u04b1\u04a5\3\2\2\2\u04b1"+
		"\u04a9\3\2\2\2\u04b1\u04ad\3\2\2\2\u04b2\u04b5\3\2\2\2\u04b3\u04b1\3\2"+
		"\2\2\u04b3\u04b4\3\2\2\2\u04b4u\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b6\u04ce"+
		"\3\2\2\2\u04b7\u04b8\5t;\2\u04b8\u04b9\5x=\2\u04b9\u04ce\3\2\2\2\u04ba"+
		"\u04bb\5t;\2\u04bb\u04bc\5\u0088E\2\u04bc\u04bd\b<\1\2\u04bd\u04ce\3\2"+
		"\2\2\u04be\u04bf\5t;\2\u04bf\u04c0\5\u0082B\2\u04c0\u04ce\3\2\2\2\u04c1"+
		"\u04c2\5t;\2\u04c2\u04c3\5\u0084C\2\u04c3\u04c4\b<\1\2\u04c4\u04ce\3\2"+
		"\2\2\u04c5\u04c6\5t;\2\u04c6\u04c7\5\u00dco\2\u04c7\u04c8\b<\1\2\u04c8"+
		"\u04ce\3\2\2\2\u04c9\u04ca\5t;\2\u04ca\u04cb\5,\27\2\u04cb\u04cc\b<\1"+
		"\2\u04cc\u04ce\3\2\2\2\u04cd\u04b6\3\2\2\2\u04cd\u04b7\3\2\2\2\u04cd\u04ba"+
		"\3\2\2\2\u04cd\u04be\3\2\2\2\u04cd\u04c1\3\2\2\2\u04cd\u04c5\3\2\2\2\u04cd"+
		"\u04c9\3\2\2\2\u04cew\3\2\2\2\u04cf\u04d0\7\u0083\2\2\u04d0\u04d1\7\u0165"+
		"\2\2\u04d1\u04d6\5~@\2\u04d2\u04d3\t\24\2\2\u04d3\u04d5\5~@\2\u04d4\u04d2"+
		"\3\2\2\2\u04d5\u04d8\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7"+
		"\u04d9\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d9\u04da\7\u0168\2\2\u04da\u04de"+
		"\5t;\2\u04db\u04dd\5z>\2\u04dc\u04db\3\2\2\2\u04dd\u04e0\3\2\2\2\u04de"+
		"\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e2\3\2\2\2\u04e0\u04de\3\2"+
		"\2\2\u04e1\u04e3\5|?\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04fc"+
		"\3\2\2\2\u04e4\u04e5\7\u0083\2\2\u04e5\u04e6\7\u0165\2\2\u04e6\u04eb\5"+
		"~@\2\u04e7\u04e8\t\24\2\2\u04e8\u04ea\5~@\2\u04e9\u04e7\3\2\2\2\u04ea"+
		"\u04ed\3\2\2\2\u04eb\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ee\3\2"+
		"\2\2\u04ed\u04eb\3\2\2\2\u04ee\u04ef\7\u0168\2\2\u04ef\u04f0\7\u0164\2"+
		"\2\u04f0\u04f1\5t;\2\u04f1\u04f5\7\u0167\2\2\u04f2\u04f4\5z>\2\u04f3\u04f2"+
		"\3\2\2\2\u04f4\u04f7\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6"+
		"\u04f9\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f8\u04fa\5|?\2\u04f9\u04f8\3\2\2"+
		"\2\u04f9\u04fa\3\2\2\2\u04fa\u04fc\3\2\2\2\u04fb\u04cf\3\2\2\2\u04fb\u04e4"+
		"\3\2\2\2\u04fcy\3\2\2\2\u04fd\u04fe\7\\\2\2\u04fe\u04ff\5x=\2\u04ff{\3"+
		"\2\2\2\u0500\u0501\7\\\2\2\u0501\u0502\7\u0164\2\2\u0502\u0503\5t;\2\u0503"+
		"\u0504\7\u0167\2\2\u0504}\3\2\2\2\u0505\u0506\5\u015e\u00b0\2\u0506\u0509"+
		"\5\u0080A\2\u0507\u050a\5\u015e\u00b0\2\u0508\u050a\7\u0172\2\2\u0509"+
		"\u0507\3\2\2\2\u0509\u0508\3\2\2\2\u050a\177\3\2\2\2\u050b\u0518\3\2\2"+
		"\2\u050c\u0518\7\u015c\2\2\u050d\u0518\7\u016c\2\2\u050e\u0518\7\u0158"+
		"\2\2\u050f\u0518\7\u015b\2\2\u0510\u0518\7\u0155\2\2\u0511\u0518\7\u016b"+
		"\2\2\u0512\u0518\7\u015e\2\2\u0513\u0518\7\u015f\2\2\u0514\u0518\7\u0160"+
		"\2\2\u0515\u0518\7\u0161\2\2\u0516\u0518\7\u0162\2\2\u0517\u050b\3\2\2"+
		"\2\u0517\u050c\3\2\2\2\u0517\u050d\3\2\2\2\u0517\u050e\3\2\2\2\u0517\u050f"+
		"\3\2\2\2\u0517\u0510\3\2\2\2\u0517\u0511\3\2\2\2\u0517\u0512\3\2\2\2\u0517"+
		"\u0513\3\2\2\2\u0517\u0514\3\2\2\2\u0517\u0515\3\2\2\2\u0517\u0516\3\2"+
		"\2\2\u0518\u0081\3\2\2\2\u0519\u051a\5\u015e\u00b0\2\u051a\u0526\7\u015b"+
		"\2\2\u051b\u0521\5\u015e\u00b0\2\u051c\u051e\7\u0165\2\2\u051d\u051f\5"+
		"\u015e\u00b0\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520\3\2"+
		"\2\2\u0520\u0522\7\u0168\2\2\u0521\u051c\3\2\2\2\u0521\u0522\3\2\2\2\u0522"+
		"\u0527\3\2\2\2\u0523\u0527\7\u0172\2\2\u0524\u0527\7\u0173\2\2\u0525\u0527"+
		"\5\u00dco\2\u0526\u051b\3\2\2\2\u0526\u0523\3\2\2\2\u0526\u0524\3\2\2"+
		"\2\u0526\u0525\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529\7\u016a\2\2\u0529"+
		"\u0083\3\2\2\2\u052a\u052b\5^\60\2\u052b\u052d\5\u015e\u00b0\2\u052c\u052e"+
		"\5\u0086D\2\u052d\u052c\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u052f\3\2\2"+
		"\2\u052f\u0530\7\u016a\2\2\u0530\u0531\bC\1\2\u0531\u0085\3\2\2\2\u0532"+
		"\u053e\7\u015b\2\2\u0533\u0539\5\u015e\u00b0\2\u0534\u0536\7\u0165\2\2"+
		"\u0535\u0537\5\u015e\u00b0\2\u0536\u0535\3\2\2\2\u0536\u0537\3\2\2\2\u0537"+
		"\u0538\3\2\2\2\u0538\u053a\7\u0168\2\2\u0539\u0534\3\2\2\2\u0539\u053a"+
		"\3\2\2\2\u053a\u053f\3\2\2\2\u053b\u053f\7\u0172\2\2\u053c\u053f\7\u0173"+
		"\2\2\u053d\u053f\5\u00dco\2\u053e\u0533\3\2\2\2\u053e\u053b\3\2\2\2\u053e"+
		"\u053c\3\2\2\2\u053e\u053d\3\2\2\2\u053f\u0087\3\2\2\2\u0540\u0541\bE"+
		"\1\2\u0541\u0542\7p\2\2\u0542\u0543\7\u0165\2\2\u0543\u0544\5\u008cG\2"+
		"\u0544\u0545\7\u016a\2\2\u0545\u0546\5\u015e\u00b0\2\u0546\u054d\5\u012c"+
		"\u0097\2\u0547\u054e\7\u0172\2\2\u0548\u054b\5\u015e\u00b0\2\u0549\u054a"+
		"\7\u016d\2\2\u054a\u054c\5\u015e\u00b0\2\u054b\u0549\3\2\2\2\u054b\u054c"+
		"\3\2\2\2\u054c\u054e\3\2\2\2\u054d\u0547\3\2\2\2\u054d\u0548\3\2\2\2\u054e"+
		"\u054f\3\2\2\2\u054f\u0550\7\u016a\2\2\u0550\u0551\5\u008aF\2\u0551\u0552"+
		"\7\u0168\2\2\u0552\u0553\7\u0164\2\2\u0553\u0554\5v<\2\u0554\u0555\7\u0167"+
		"\2\2\u0555\u0556\bE\1\2\u0556\u055e\3\2\2\2\u0557\u0558\7p\2\2\u0558\u0559"+
		"\7\u0165\2\2\u0559\u055a\7\u016a\2\2\u055a\u055b\7\u016a\2\2\u055b\u055c"+
		"\7\u0168\2\2\u055c\u055e\5t;\2\u055d\u0540\3\2\2\2\u055d\u0557\3\2\2\2"+
		"\u055e\u0089\3\2\2\2\u055f\u0560\5\u015e\u00b0\2\u0560\u0561\7\u0155\2"+
		"\2\u0561\u0562\7\u0155\2\2\u0562\u0568\3\2\2\2\u0563\u0564\5\u015e\u00b0"+
		"\2\u0564\u0565\7\u016b\2\2\u0565\u0566\7\u016b\2\2\u0566\u0568\3\2\2\2"+
		"\u0567\u055f\3\2\2\2\u0567\u0563\3\2\2\2\u0568\u008b\3\2\2\2\u0569\u056b"+
		"\5^\60\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056c\3\2\2\2\u056c"+
		"\u056d\5\u015e\u00b0\2\u056d\u056e\3\2\2\2\u056e\u0571\7\u015b\2\2\u056f"+
		"\u0572\7\u0172\2\2\u0570\u0572\5\u015e\u00b0\2\u0571\u056f\3\2\2\2\u0571"+
		"\u0570\3\2\2\2\u0572\u008d\3\2\2\2\u0573\u057b\7\b\2\2\u0574\u0577\79"+
		"\2\2\u0575\u0576\7\u00c7\2\2\u0576\u0578\7\u00e1\2\2\u0577\u0575\3\2\2"+
		"\2\u0577\u0578\3\2\2\2\u0578\u057b\3\2\2\2\u0579\u057b\7\u00e1\2\2\u057a"+
		"\u0573\3\2\2\2\u057a\u0574\3\2\2\2\u057a\u0579\3\2\2\2\u057a\u057b\3\2"+
		"\2\2\u057b\u057c\3\2\2\2\u057c\u057d\7v\2\2\u057d\u057f\5\u015e\u00b0"+
		"\2\u057e\u0580\5\u00a0Q\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580"+
		"\u0581\3\2\2\2\u0581\u0583\5\u0090I\2\u0582\u0584\t\25\2\2\u0583\u0582"+
		"\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0586\3\2\2\2\u0585\u0587\5\32\16\2"+
		"\u0586\u0585\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589"+
		"\5\b\5\2\u0589\u008f\3\2\2\2\u058a\u058b\t\26\2\2\u058b\u058d\5^\60\2"+
		"\u058c\u058e\5`\61\2\u058d\u058c\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u0091"+
		"\3\2\2\2\u058f\u0597\7\b\2\2\u0590\u0593\79\2\2\u0591\u0592\7\u00c7\2"+
		"\2\u0592\u0594\7\u00e1\2\2\u0593\u0591\3\2\2\2\u0593\u0594\3\2\2\2\u0594"+
		"\u0597\3\2\2\2\u0595\u0597\7\u00e1\2\2\u0596\u058f\3\2\2\2\u0596\u0590"+
		"\3\2\2\2\u0596\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\3\2\2\2\u0598"+
		"\u0599\7\u00ce\2\2\u0599\u059a\5\u015e\u00b0\2\u059a\u059b\t\25\2\2\u059b"+
		"\u059c\5\u0094K\2\u059c\u05a0\7`\2\2\u059d\u059e\5\u015e\u00b0\2\u059e"+
		"\u059f\7\u016a\2\2\u059f\u05a1\3\2\2\2\u05a0\u059d\3\2\2\2\u05a0\u05a1"+
		"\3\2\2\2\u05a1\u0093\3\2\2\2\u05a2\u05a3\5\u0096L\2\u05a3\u05a9\7\u016a"+
		"\2\2\u05a4\u05a5\5\u0096L\2\u05a5\u05a6\7\u016a\2\2\u05a6\u05a8\3\2\2"+
		"\2\u05a7\u05a4\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa"+
		"\3\2\2\2\u05aa\u0095\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ac\u05ba\5\34\17\2"+
		"\u05ad\u05ae\7v\2\2\u05ae\u05b0\5\u015e\u00b0\2\u05af\u05b1\5\u00a0Q\2"+
		"\u05b0\u05af\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b3"+
		"\5\u0090I\2\u05b3\u05ba\3\2\2\2\u05b4\u05b5\t\27\2\2\u05b5\u05b7\5\u015e"+
		"\u00b0\2\u05b6\u05b8\5\u00a0Q\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8\3\2\2"+
		"\2\u05b8\u05ba\3\2\2\2\u05b9\u05ac\3\2\2\2\u05b9\u05ad\3\2\2\2\u05b9\u05b4"+
		"\3\2\2\2\u05ba\u0097\3\2\2\2\u05bb\u05c3\7\b\2\2\u05bc\u05bf\79\2\2\u05bd"+
		"\u05be\7\u00c7\2\2\u05be\u05c0\7\u00e1\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05c0"+
		"\3\2\2\2\u05c0\u05c3\3\2\2\2\u05c1\u05c3\7\u00e1\2\2\u05c2\u05bb\3\2\2"+
		"\2\u05c2\u05bc\3\2\2\2\u05c2\u05c1\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4"+
		"\3\2\2\2\u05c4\u05c5\7\u00ce\2\2\u05c5\u05c6\7\32\2\2\u05c6\u05c7\5\u015e"+
		"\u00b0\2\u05c7\u05c8\t\25\2\2\u05c8\u05c9\5\u009aN\2\u05c9\u05cd\7`\2"+
		"\2\u05ca\u05cb\5\u015e\u00b0\2\u05cb\u05cc\7\u016a\2\2\u05cc\u05ce\3\2"+
		"\2\2\u05cd\u05ca\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u0099\3\2\2\2\u05cf"+
		"\u05d0\5\u009cO\2\u05d0\u05d6\7\u016a\2\2\u05d1\u05d2\5\u009cO\2\u05d2"+
		"\u05d3\7\u016a\2\2\u05d3\u05d5\3\2\2\2\u05d4\u05d1\3\2\2\2\u05d5\u05d8"+
		"\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u009b\3\2\2\2\u05d8"+
		"\u05d6\3\2\2\2\u05d9\u05dd\5\34\17\2\u05da\u05dd\5\u008eH\2\u05db\u05dd"+
		"\5\u009eP\2\u05dc\u05d9\3\2\2\2\u05dc\u05da\3\2\2\2\u05dc\u05db\3\2\2"+
		"\2\u05dd\u009d\3\2\2\2\u05de\u05e6\7\b\2\2\u05df\u05e2\79\2\2\u05e0\u05e1"+
		"\7\u00c7\2\2\u05e1\u05e3\7\u00e1\2\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3\3"+
		"\2\2\2\u05e3\u05e6\3\2\2\2\u05e4\u05e6\7\u00e1\2\2\u05e5\u05de\3\2\2\2"+
		"\u05e5\u05df\3\2\2\2\u05e5\u05e4\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7"+
		"\3\2\2\2\u05e7\u05e8\t\27\2\2\u05e8\u05ea\5\u015e\u00b0\2\u05e9\u05eb"+
		"\5\u00a0Q\2\u05ea\u05e9\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ed\3\2\2"+
		"\2\u05ec\u05ee\5\u00a4S\2\u05ed\u05ec\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee"+
		"\u05f0\3\2\2\2\u05ef\u05f1\t\25\2\2\u05f0\u05ef\3\2\2\2\u05f0\u05f1\3"+
		"\2\2\2\u05f1\u05f3\3\2\2\2\u05f2\u05f4\5\32\16\2\u05f3\u05f2\3\2\2\2\u05f3"+
		"\u05f4\3\2\2\2\u05f4\u05f6\3\2\2\2\u05f5\u05f7\5\u00c6d\2\u05f6\u05f5"+
		"\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fc\5\f\7\2\u05f9"+
		"\u05fa\5\u015e\u00b0\2\u05fa\u05fb\7\u016a\2\2\u05fb\u05fd\3\2\2\2\u05fc"+
		"\u05f9\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u009f\3\2\2\2\u05fe\u05ff\7\u0165"+
		"\2\2\u05ff\u0615\7\u0168\2\2\u0600\u0601\7\u0165\2\2\u0601\u0606\5\u00a2"+
		"R\2\u0602\u0603\7\u0157\2\2\u0603\u0605\5\u00a2R\2\u0604\u0602\3\2\2\2"+
		"\u0605\u0608\3\2\2\2\u0606\u0604\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u0609"+
		"\3\2\2\2\u0608\u0606\3\2\2\2\u0609\u060a\7\u0168\2\2\u060a\u0615\3\2\2"+
		"\2\u060b\u060c\6Q\t\2\u060c\u0611\5\u00a2R\2\u060d\u060e\7\u0157\2\2\u060e"+
		"\u0610\5\u00a2R\2\u060f\u060d\3\2\2\2\u0610\u0613\3\2\2\2\u0611\u060f"+
		"\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0615\3\2\2\2\u0613\u0611\3\2\2\2\u0614"+
		"\u05fe\3\2\2\2\u0614\u0600\3\2\2\2\u0614\u060b\3\2\2\2\u0615\u00a1\3\2"+
		"\2\2\u0616\u061c\7\u0086\2\2\u0617\u061c\7\u00c9\2\2\u0618\u061c\7\u008b"+
		"\2\2\u0619\u061a\7\u0086\2\2\u061a\u061c\7\u00c9\2\2\u061b\u0616\3\2\2"+
		"\2\u061b\u0617\3\2\2\2\u061b\u0618\3\2\2\2\u061b\u0619\3\2\2\2\u061b\u061c"+
		"\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061e\5\u015e\u00b0\2\u061e\u0620\5"+
		"^\60\2\u061f\u0621\5`\61\2\u0620\u061f\3\2\2\2\u0620\u0621\3\2\2\2\u0621"+
		"\u0625\3\2\2\2\u0622\u0624\5b\62\2\u0623\u0622\3\2\2\2\u0624\u0627\3\2"+
		"\2\2\u0625\u0623\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0629\3\2\2\2\u0627"+
		"\u0625\3\2\2\2\u0628\u062a\5d\63\2\u0629\u0628\3\2\2\2\u0629\u062a\3\2"+
		"\2\2\u062a\u0641\3\2\2\2\u062b\u0631\5\u015e\u00b0\2\u062c\u0632\7\u0086"+
		"\2\2\u062d\u0632\7\u00c9\2\2\u062e\u0632\7\u008b\2\2\u062f\u0630\7\u0086"+
		"\2\2\u0630\u0632\7\u00c9\2\2\u0631\u062c\3\2\2\2\u0631\u062d\3\2\2\2\u0631"+
		"\u062e\3\2\2\2\u0631\u062f\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0633\3\2"+
		"\2\2\u0633\u0635\5^\60\2\u0634\u0636\5`\61\2\u0635\u0634\3\2\2\2\u0635"+
		"\u0636\3\2\2\2\u0636\u063a\3\2\2\2\u0637\u0639\5b\62\2\u0638\u0637\3\2"+
		"\2\2\u0639\u063c\3\2\2\2\u063a\u0638\3\2\2\2\u063a\u063b\3\2\2\2\u063b"+
		"\u063e\3\2\2\2\u063c\u063a\3\2\2\2\u063d\u063f\5d\63\2\u063e\u063d\3\2"+
		"\2\2\u063e\u063f\3\2\2\2\u063f\u0641\3\2\2\2\u0640\u061b\3\2\2\2\u0640"+
		"\u062b\3\2\2\2\u0641\u00a3\3\2\2\2\u0642\u0644\5\u00a6T\2\u0643\u0642"+
		"\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646"+
		"\u00a5\3\2\2\2\u0647\u0648\7\u009c\2\2\u0648\u0653\7\u0107\2\2\u0649\u064a"+
		"\7\u0107\2\2\u064a\u064b\7\u00f8\2\2\u064b\u0653\t\30\2\2\u064c\u064e"+
		"\7[\2\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064f\3\2\2\2\u064f"+
		"\u0650\7\u00e4\2\2\u0650\u0651\7\u00ff\2\2\u0651\u0653\7\u0172\2\2\u0652"+
		"\u0647\3\2\2\2\u0652\u0649\3\2\2\2\u0652\u064d\3\2\2\2\u0653\u00a7\3\2"+
		"\2\2\u0654\u0655\7-\2\2\u0655\u0656\7\u0165\2\2\u0656\u065b\5\u015e\u00b0"+
		"\2\u0657\u0658\7\u0157\2\2\u0658\u065a\5\u015e\u00b0\2\u0659\u0657\3\2"+
		"\2\2\u065a\u065d\3\2\2\2\u065b\u0659\3\2\2\2\u065b\u065c\3\2\2\2\u065c"+
		"\u065e\3\2\2\2\u065d\u065b\3\2\2\2\u065e\u065f\7\u0168\2\2\u065f\u00a9"+
		"\3\2\2\2\u0660\u0662\5\u010c\u0087\2\u0661\u0663\5\u010e\u0088\2\u0662"+
		"\u0661\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0669\3\2\2\2\u0664\u0665\7\u0165"+
		"\2\2\u0665\u0666\5\u00dco\2\u0666\u0667\7\u0168\2\2\u0667\u0669\3\2\2"+
		"\2\u0668\u0660\3\2\2\2\u0668\u0664\3\2\2\2\u0669\u066c\3\2\2\2\u066a\u066b"+
		"\7\17\2\2\u066b\u066d\5\u015e\u00b0\2\u066c\u066a\3\2\2\2\u066c\u066d"+
		"\3\2\2\2\u066d\u00ab\3\2\2\2\u066e\u0671\5\u0158\u00ad\2\u066f\u0671\5"+
		"\u012e\u0098\2\u0670\u066e\3\2\2\2\u0670\u066f\3\2\2\2\u0671\u00ad\3\2"+
		"\2\2\u0672\u0675\5\u0158\u00ad\2\u0673\u0675\5\u012e\u0098\2\u0674\u0672"+
		"\3\2\2\2\u0674\u0673\3\2\2\2\u0675\u00af\3\2\2\2\u0676\u0677\7\17\2\2"+
		"\u0677\u067f\5\u015e\u00b0\2\u0678\u0679\7\22\2\2\u0679\u067f\5\u012e"+
		"\u0098\2\u067a\u067b\7P\2\2\u067b\u067f\5\u012e\u0098\2\u067c\u067d\7"+
		"\u0109\2\2\u067d\u067f\5\u015e\u00b0\2\u067e\u0676\3\2\2\2\u067e\u0678"+
		"\3\2\2\2\u067e\u067a\3\2\2\2\u067e\u067c\3\2\2\2\u067f\u00b1\3\2\2\2\u0680"+
		"\u0681\t\31\2\2\u0681\u00b3\3\2\2\2\u0682\u0684\79\2\2\u0683\u0685\7\u0126"+
		"\2\2\u0684\u0683\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0686\3\2\2\2\u0686"+
		"\u0687\7\u0088\2\2\u0687\u0688\5\u015e\u00b0\2\u0688\u0689\7\u00c4\2\2"+
		"\u0689\u068a\5\u010c\u0087\2\u068a\u068b\7\u0165\2\2\u068b\u0690\5\u00b6"+
		"\\\2\u068c\u068d\7\u0157\2\2\u068d\u068f\5\u00b6\\\2\u068e\u068c\3\2\2"+
		"\2\u068f\u0692\3\2\2\2\u0690\u068e\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u0693"+
		"\3\2\2\2\u0692\u0690\3\2\2\2\u0693\u0694\7\u0168\2\2\u0694\u00b5\3\2\2"+
		"\2\u0695\u0697\5\u015e\u00b0\2\u0696\u0698\t\7\2\2\u0697\u0696\3\2\2\2"+
		"\u0697\u0698\3\2\2\2\u0698\u00b7\3\2\2\2\u0699\u069a\5\u00ba^\2\u069a"+
		"\u00b9\3\2\2\2\u069b\u069c\7\u0135\2\2\u069c\u069d\7\u0165\2\2\u069d\u069e"+
		"\5\u015e\u00b0\2\u069e\u069f\7\u015b\2\2\u069f\u06a7\5\u015e\u00b0\2\u06a0"+
		"\u06a1\7\u0157\2\2\u06a1\u06a2\5\u015e\u00b0\2\u06a2\u06a3\7\u015b\2\2"+
		"\u06a3\u06a4\5\u015e\u00b0\2\u06a4\u06a6\3\2\2\2\u06a5\u06a0\3\2\2\2\u06a6"+
		"\u06a9\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06aa\3\2"+
		"\2\2\u06a9\u06a7\3\2\2\2\u06aa\u06ae\7\u0168\2\2\u06ab\u06ad\5Z.\2\u06ac"+
		"\u06ab\3\2\2\2\u06ad\u06b0\3\2\2\2\u06ae\u06ac\3\2\2\2\u06ae\u06af\3\2"+
		"\2\2\u06af\u00bb\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b1\u06b5\5\u00be`\2\u06b2"+
		"\u06b5\5\u00c0a\2\u06b3\u06b5\5\u00c2b\2\u06b4\u06b1\3\2\2\2\u06b4\u06b2"+
		"\3\2\2\2\u06b4\u06b3\3\2\2\2\u06b5\u00bd\3\2\2\2\u06b6\u06b8\7=\2\2\u06b7"+
		"\u06b6\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06bc\7\u00f5"+
		"\2\2\u06ba\u06bc\7>\2\2\u06bb\u06b7\3\2\2\2\u06bb\u06ba\3\2\2\2\u06bc"+
		"\u06be\3\2\2\2\u06bd\u06bf\7\u015b\2\2\u06be\u06bd\3\2\2\2\u06be\u06bf"+
		"\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c1\5\u012e\u0098\2\u06c1\u00bf\3"+
		"\2\2\2\u06c2\u06c3\t\32\2\2\u06c3\u06c4\t\33\2\2\u06c4\u00c1\3\2\2\2\u06c5"+
		"\u06c6\7\u00da\2\2\u06c6\u06c9\7\u015b\2\2\u06c7\u06ca\5\u012e\u0098\2"+
		"\u06c8\u06ca\7\u00bc\2\2\u06c9\u06c7\3\2\2\2\u06c9\u06c8\3\2\2\2\u06ca"+
		"\u06cc\3\2\2\2\u06cb\u06cd\7\u0127\2\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd"+
		"\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06cf\7p\2\2\u06cf\u06d0\t\34\2\2\u06d0"+
		"\u00c3\3\2\2\2\u06d1\u06d2\7\u0134\2\2\u06d2\u06d3\5\u011e\u0090\2\u06d3"+
		"\u06d4\t\35\2\2\u06d4\u06d5\5\4\3\2\u06d5\u06d7\7`\2\2\u06d6\u06d8\t\36"+
		"\2\2\u06d7\u06d6\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u00c5\3\2\2\2\u06d9"+
		"\u06e0\7\u0178\2\2\u06da\u06db\7\u0161\2\2\u06db\u06dc\7\u0161\2\2\u06dc"+
		"\u06dd\7\u016e\2\2\u06dd\u06de\7\u015f\2\2\u06de\u06e0\7\u015f\2\2\u06df"+
		"\u06d9\3\2\2\2\u06df\u06da\3\2\2\2\u06e0\u00c7\3\2\2\2\u06e1\u06e2\7\u012a"+
		"\2\2\u06e2\u06e7\5\u012e\u0098\2\u06e3\u06e4\7\u0157\2\2\u06e4\u06e6\5"+
		"\u012e\u0098\2\u06e5\u06e3\3\2\2\2\u06e6\u06e9\3\2\2\2\u06e7\u06e5\3\2"+
		"\2\2\u06e7\u06e8\3\2\2\2\u06e8\u00c9\3\2\2\2\u06e9\u06e7\3\2\2\2\u06ea"+
		"\u06eb\7\u00fb\2\2\u06eb\u06f0\5\u00ccg\2\u06ec\u06ed\7\u0157\2\2\u06ed"+
		"\u06ef\5\u00ccg\2\u06ee\u06ec\3\2\2\2\u06ef\u06f2\3\2\2\2\u06f0\u06ee"+
		"\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u06f3\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f3"+
		"\u06f4\7t\2\2\u06f4\u06f8\5\u00d2j\2\u06f5\u06f7\5\u00d6l\2\u06f6\u06f5"+
		"\3\2\2\2\u06f7\u06fa\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9"+
		"\u06fd\3\2\2\2\u06fa\u06f8\3\2\2\2\u06fb\u06fc\7\u0133\2\2\u06fc\u06fe"+
		"\5\u00dan\2\u06fd\u06fb\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0700\3\2\2"+
		"\2\u06ff\u0701\5\u0112\u008a\2\u0700\u06ff\3\2\2\2\u0700\u0701\3\2\2\2"+
		"\u0701\u0703\3\2\2\2\u0702\u0704\5\u0114\u008b\2\u0703\u0702\3\2\2\2\u0703"+
		"\u0704\3\2\2\2\u0704\u0706\3\2\2\2\u0705\u0707\5\u0118\u008d\2\u0706\u0705"+
		"\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0709\3\2\2\2\u0708\u070a\5\u011a\u008e"+
		"\2\u0709\u0708\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070c"+
		"\7\u016a\2\2\u070c\u00cb\3\2\2\2\u070d\u0712\5\u00f6|\2\u070e\u0712\5"+
		"\u00ceh\2\u070f\u0712\5\u00d0i\2\u0710\u0712\5\u0130\u0099\2\u0711\u070d"+
		"\3\2\2\2\u0711\u070e\3\2\2\2\u0711\u070f\3\2\2\2\u0711\u0710\3\2\2\2\u0712"+
		"\u00cd\3\2\2\2\u0713\u0715\5\u0144\u00a3\2\u0714\u0716\5\u00f4{\2\u0715"+
		"\u0714\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u00cf\3\2\2\2\u0717\u0718\5\u015e"+
		"\u00b0\2\u0718\u0719\7\u016d\2\2\u0719\u071a\5\u0130\u0099\2\u071a\u00d1"+
		"\3\2\2\2\u071b\u071e\5\u00fe\u0080\2\u071c\u071e\5\u00d4k\2\u071d\u071b"+
		"\3\2\2\2\u071d\u071c\3\2\2\2\u071e\u00d3\3\2\2\2\u071f\u0720\7\u0165\2"+
		"\2\u0720\u0721\5\u00caf\2\u0721\u0723\7\u0168\2\2\u0722\u0724\5\u010a"+
		"\u0086\2\u0723\u0722\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u00d5\3\2\2\2\u0725"+
		"\u0726\7\u0157\2\2\u0726\u072d\5\u00d2j\2\u0727\u0728\5\u0104\u0083\2"+
		"\u0728\u0729\5\u00d2j\2\u0729\u072a\7\u00c4\2\2\u072a\u072b\5\u00d8m\2"+
		"\u072b\u072d\3\2\2\2\u072c\u0725\3\2\2\2\u072c\u0727\3\2\2\2\u072d\u00d7"+
		"\3\2\2\2\u072e\u072f\5\u010c\u0087\2\u072f\u0730\7\u016d\2\2\u0730\u0731"+
		"\5\u015e\u00b0\2\u0731\u0732\5\u0080A\2\u0732\u0733\5\u010c\u0087\2\u0733"+
		"\u0734\7\u016d\2\2\u0734\u0735\5\u015e\u00b0\2\u0735\u00d9\3\2\2\2\u0736"+
		"\u0737\5\u011e\u0090\2\u0737\u00db\3\2\2\2\u0738\u073a\5\u00dep\2\u0739"+
		"\u0738\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073c\5\u00e4"+
		"s\2\u073c\u073d\bo\1\2\u073d\u00dd\3\2\2\2\u073e\u073f\7\u0135\2\2\u073f"+
		"\u0744\5\u00e0q\2\u0740\u0741\7\u0157\2\2\u0741\u0743\5\u00e0q\2\u0742"+
		"\u0740\3\2\2\2\u0743\u0746\3\2\2\2\u0744\u0742\3\2\2\2\u0744\u0745\3\2"+
		"\2\2\u0745\u00df\3\2\2\2\u0746\u0744\3\2\2\2\u0747\u0749\5\u015e\u00b0"+
		"\2\u0748\u074a\5\u00e2r\2\u0749\u0748\3\2\2\2\u0749\u074a\3\2\2\2\u074a"+
		"\u074b\3\2\2\2\u074b\u074c\7\f\2\2\u074c\u074d\7\u0165\2\2\u074d\u074e"+
		"\5\u00e4s\2\u074e\u074f\7\u0168\2\2\u074f\u00e1\3\2\2\2\u0750\u0751\7"+
		"\u0165\2\2\u0751\u0756\5\u015e\u00b0\2\u0752\u0753\7\u0157\2\2\u0753\u0755"+
		"\5\u015e\u00b0\2\u0754\u0752\3\2\2\2\u0755\u0758\3\2\2\2\u0756\u0754\3"+
		"\2\2\2\u0756\u0757\3\2\2\2\u0757\u0759\3\2\2\2\u0758\u0756\3\2\2\2\u0759"+
		"\u075a\7\u0168\2\2\u075a\u00e3\3\2\2\2\u075b\u0761\5\u00e6t\2\u075c\u075d"+
		"\5\u00e8u\2\u075d\u075e\5\u00e6t\2\u075e\u0760\3\2\2\2\u075f\u075c\3\2"+
		"\2\2\u0760\u0763\3\2\2\2\u0761\u075f\3\2\2\2\u0761\u0762\3\2\2\2\u0762"+
		"\u0764\3\2\2\2\u0763\u0761\3\2\2\2\u0764\u0765\bs\1\2\u0765\u00e5\3\2"+
		"\2\2\u0766\u0767\5\u00eav\2\u0767\u0768\bt\1\2\u0768\u076e\3\2\2\2\u0769"+
		"\u076a\7\u0165\2\2\u076a\u076b\5\u00e4s\2\u076b\u076c\7\u0168\2\2\u076c"+
		"\u076e\3\2\2\2\u076d\u0766\3\2\2\2\u076d\u0769\3\2\2\2\u076e\u00e7\3\2"+
		"\2\2\u076f\u0771\7\u0125\2\2\u0770\u0772\7\6\2\2\u0771\u0770\3\2\2\2\u0771"+
		"\u0772\3\2\2\2\u0772\u077c\3\2\2\2\u0773\u0775\7c\2\2\u0774\u0776\7\6"+
		"\2\2\u0775\u0774\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u077c\3\2\2\2\u0777"+
		"\u0779\7\u0091\2\2\u0778\u077a\7\6\2\2\u0779\u0778\3\2\2\2\u0779\u077a"+
		"\3\2\2\2\u077a\u077c\3\2\2\2\u077b\u076f\3\2\2\2\u077b\u0773\3\2\2\2\u077b"+
		"\u0777\3\2\2\2\u077c\u00e9\3\2\2\2\u077d\u077e\bv\1\2\u077e\u077f\t\37"+
		"\2\2\u077f\u0781\5\u00ecw\2\u0780\u0782\5\u00f8}\2\u0781\u0780\3\2\2\2"+
		"\u0781\u0782\3\2\2\2\u0782\u0784\3\2\2\2\u0783\u0785\5\u00fa~\2\u0784"+
		"\u0783\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0787\3\2\2\2\u0786\u0788\5\u010e"+
		"\u0088\2\u0787\u0786\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u078a\3\2\2\2\u0789"+
		"\u078b\5\u0112\u008a\2\u078a\u0789\3\2\2\2\u078a\u078b\3\2\2\2\u078b\u078e"+
		"\3\2\2\2\u078c\u078f\5\u0114\u008b\2\u078d\u078f\5\u0116\u008c\2\u078e"+
		"\u078c\3\2\2\2\u078e\u078d\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0791\3\2"+
		"\2\2\u0790\u0792\5\u0118\u008d\2\u0791\u0790\3\2\2\2\u0791\u0792\3\2\2"+
		"\2\u0792\u0794\3\2\2\2\u0793\u0795\5\u011a\u008e\2\u0794\u0793\3\2\2\2"+
		"\u0794\u0795\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u0797\bv\1\2\u0797\u00eb"+
		"\3\2\2\2\u0798\u079a\5\u00eex\2\u0799\u0798\3\2\2\2\u0799\u079a\3\2\2"+
		"\2\u079a\u079c\3\2\2\2\u079b\u079d\5\u00f0y\2\u079c\u079b\3\2\2\2\u079c"+
		"\u079d\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u079f\5\u00f2z\2\u079f\u07a6"+
		"\bw\1\2\u07a0\u07a1\7\u0157\2\2\u07a1\u07a2\5\u00f2z\2\u07a2\u07a3\bw"+
		"\1\2\u07a3\u07a5\3\2\2\2\u07a4\u07a0\3\2\2\2\u07a5\u07a8\3\2\2\2\u07a6"+
		"\u07a4\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u00ed\3\2\2\2\u07a8\u07a6\3\2"+
		"\2\2\u07a9\u07aa\t \2\2\u07aa\u00ef\3\2\2\2\u07ab\u07ac\7\u0120\2\2\u07ac"+
		"\u07ad\5\u012e\u0098\2\u07ad\u00f1\3\2\2\2\u07ae\u07af\5\u015e\u00b0\2"+
		"\u07af\u07b0\7\u015b\2\2\u07b0\u07b2\3\2\2\2\u07b1\u07ae\3\2\2\2\u07b1"+
		"\u07b2\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b5\5\u012e\u0098\2\u07b4\u07b6"+
		"\5\u00f4{\2\u07b5\u07b4\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07b9\3\2\2"+
		"\2\u07b7\u07b9\5\u00f6|\2\u07b8\u07b1\3\2\2\2\u07b8\u07b7\3\2\2\2\u07b9"+
		"\u07ba\3\2\2\2\u07ba\u07bb\bz\1\2\u07bb\u00f3\3\2\2\2\u07bc\u07be\6{\n"+
		"\2\u07bd\u07bf\7\f\2\2\u07be\u07bd\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c0"+
		"\3\2\2\2\u07c0\u07c6\5\u015e\u00b0\2\u07c1\u07c2\7\u0165\2\2\u07c2\u07c3"+
		"\7\u011e\2\2\u07c3\u07c4\7\u016f\2\2\u07c4\u07c6\7\u0168\2\2\u07c5\u07bc"+
		"\3\2\2\2\u07c5\u07c1\3\2\2\2\u07c6\u00f5\3\2\2\2\u07c7\u07c8\7\u016e\2"+
		"\2\u07c8\u07ca\7\u016d\2\2\u07c9\u07c7\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca"+
		"\u07cb\3\2\2\2\u07cb\u07cc\7\u0163\2\2\u07cc\u00f7\3\2\2\2\u07cd\u07ce"+
		"\7\u0093\2\2\u07ce\u07d3\5\u015e\u00b0\2\u07cf\u07d0\7\u0157\2\2\u07d0"+
		"\u07d2\5\u015e\u00b0\2\u07d1\u07cf\3\2\2\2\u07d2\u07d5\3\2\2\2\u07d3\u07d1"+
		"\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u00f9\3\2\2\2\u07d5\u07d3\3\2\2\2\u07d6"+
		"\u07d7\7t\2\2\u07d7\u07db\5\u00fc\177\2\u07d8\u07da\5\u0102\u0082\2\u07d9"+
		"\u07d8\3\2\2\2\u07da\u07dd\3\2\2\2\u07db\u07d9\3\2\2\2\u07db\u07dc\3\2"+
		"\2\2\u07dc\u07de\3\2\2\2\u07dd\u07db\3\2\2\2\u07de\u07df\b~\1\2\u07df"+
		"\u00fb\3\2\2\2\u07e0\u07e4\5\u00fe\u0080\2\u07e1\u07e4\5\u0100\u0081\2"+
		"\u07e2\u07e4\5\u0106\u0084\2\u07e3\u07e0\3\2\2\2\u07e3\u07e1\3\2\2\2\u07e3"+
		"\u07e2\3\2\2\2\u07e4\u00fd\3\2\2\2\u07e5\u07e7\5\u010c\u0087\2\u07e6\u07e8"+
		"\5\u010a\u0086\2\u07e7\u07e6\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u00ff\3"+
		"\2\2\2\u07e9\u07ea\7\u0165\2\2\u07ea\u07eb\5\u00dco\2\u07eb\u07ed\7\u0168"+
		"\2\2\u07ec\u07ee\5\u010a\u0086\2\u07ed\u07ec\3\2\2\2\u07ed\u07ee\3\2\2"+
		"\2\u07ee\u0101\3\2\2\2\u07ef\u07f0\7\u0157\2\2\u07f0\u07f7\5\u00fc\177"+
		"\2\u07f1\u07f2\5\u0104\u0083\2\u07f2\u07f3\5\u00fc\177\2\u07f3\u07f4\7"+
		"\u00c4\2\2\u07f4\u07f5\5\u011e\u0090\2\u07f5\u07f7\3\2\2\2\u07f6\u07ef"+
		"\3\2\2\2\u07f6\u07f1\3\2\2\2\u07f7\u0103\3\2\2\2\u07f8\u07fa\7\u008a\2"+
		"\2\u07f9\u07f8\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u0802"+
		"\7\u0098\2\2\u07fc\u07fe\t!\2\2\u07fd\u07ff\7\u00ca\2\2\u07fe\u07fd\3"+
		"\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0802\7\u0098\2\2"+
		"\u0801\u07f9\3\2\2\2\u0801\u07fc\3\2\2\2\u0802\u0105\3\2\2\2\u0803\u0804"+
		"\7\u0116\2\2\u0804\u0805\7\u0165\2\2\u0805\u0806\7\u012c\2\2\u0806\u080b"+
		"\5\u0108\u0085\2\u0807\u0808\7\u0157\2\2\u0808\u080a\5\u0108\u0085\2\u0809"+
		"\u0807\3\2\2\2\u080a\u080d\3\2\2\2\u080b\u0809\3\2\2\2\u080b\u080c\3\2"+
		"\2\2\u080c\u080e\3\2\2\2\u080d\u080b\3\2\2\2\u080e\u0810\7\u0168\2\2\u080f"+
		"\u0811\5\u010a\u0086\2\u0810\u080f\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0107"+
		"\3\2\2\2\u0812\u081f\5\u012e\u0098\2\u0813\u0814\7\u0165\2\2\u0814\u0819"+
		"\5\u012e\u0098\2\u0815\u0816\7\u0157\2\2\u0816\u0818\5\u012e\u0098\2\u0817"+
		"\u0815\3\2\2\2\u0818\u081b\3\2\2\2\u0819\u0817\3\2\2\2\u0819\u081a\3\2"+
		"\2\2\u081a\u081c\3\2\2\2\u081b\u0819\3\2\2\2\u081c\u081d\7\u0168\2\2\u081d"+
		"\u081f\3\2\2\2\u081e\u0812\3\2\2\2\u081e\u0813\3\2\2\2\u081f\u0109\3\2"+
		"\2\2\u0820\u0822\6\u0086\13\2\u0821\u0823\7\f\2\2\u0822\u0821\3\2\2\2"+
		"\u0822\u0823\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u082f\5\u015e\u00b0\2\u0825"+
		"\u0826\7\u0165\2\2\u0826\u082b\7\u016e\2\2\u0827\u0828\7\u0157\2\2\u0828"+
		"\u082a\7\u016e\2\2\u0829\u0827\3\2\2\2\u082a\u082d\3\2\2\2\u082b\u0829"+
		"\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u082e\3\2\2\2\u082d\u082b\3\2\2\2\u082e"+
		"\u0830\7\u0168\2\2\u082f\u0825\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u010b"+
		"\3\2\2\2\u0831\u0832\5\u015e\u00b0\2\u0832\u010d\3\2\2\2\u0833\u0837\5"+
		"\u0110\u0089\2\u0834\u0835\7\u0133\2\2\u0835\u0837\5\u011e\u0090\2\u0836"+
		"\u0833\3\2\2\2\u0836\u0834\3\2\2\2\u0837\u010f\3\2\2\2\u0838\u0839\7\u0133"+
		"\2\2\u0839\u083a\5\u015e\u00b0\2\u083a\u0111\3\2\2\2\u083b\u083c\7{\2"+
		"\2\u083c\u083d\7\34\2\2\u083d\u0842\5\u012e\u0098\2\u083e\u083f\7\u0157"+
		"\2\2\u083f\u0841\5\u012e\u0098\2\u0840\u083e\3\2\2\2\u0841\u0844\3\2\2"+
		"\2\u0842\u0840\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0113\3\2\2\2\u0844\u0842"+
		"\3\2\2\2\u0845\u0846\7~\2\2\u0846\u0847\5\u011e\u0090\2\u0847\u0115\3"+
		"\2\2\2\u0848\u0849\7\u00d9\2\2\u0849\u084a\5\u011e\u0090\2\u084a\u0117"+
		"\3\2\2\2\u084b\u084c\7\u00c8\2\2\u084c\u084d\7\34\2\2\u084d\u084f\5\u012e"+
		"\u0098\2\u084e\u0850\t\7\2\2\u084f\u084e\3\2\2\2\u084f\u0850\3\2\2\2\u0850"+
		"\u0858\3\2\2\2\u0851\u0852\7\u0157\2\2\u0852\u0854\5\u012e\u0098\2\u0853"+
		"\u0855\t\7\2\2\u0854\u0853\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0857\3\2"+
		"\2\2\u0856\u0851\3\2\2\2\u0857\u085a\3\2\2\2\u0858\u0856\3\2\2\2\u0858"+
		"\u0859\3\2\2\2\u0859\u0119\3\2\2\2\u085a\u0858\3\2\2\2\u085b\u085d\5\u011c"+
		"\u008f\2\u085c\u085b\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u085c\3\2\2\2\u085e"+
		"\u085f\3\2\2\2\u085f\u011b\3\2\2\2\u0860\u0861\7\u00a0\2\2\u0861\u086c"+
		"\5\u012e\u0098\2\u0862\u0863\7\u0135\2\2\u0863\u0869\t\"\2\2\u0864\u0865"+
		"\7\u0129\2\2\u0865\u0866\7\t\2\2\u0866\u0867\7\u0099\2\2\u0867\u0868\t"+
		"#\2\2\u0868\u086a\7\u00a6\2\2\u0869\u0864\3\2\2\2\u0869\u086a\3\2\2\2"+
		"\u086a\u086c\3\2\2\2\u086b\u0860\3\2\2\2\u086b\u0862\3\2\2\2\u086c\u011d"+
		"\3\2\2\2\u086d\u086f\b\u0090\1\2\u086e\u0870\7\u00bd\2\2\u086f\u086e\3"+
		"\2\2\2\u086f\u0870\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u0872\7\u0165\2\2"+
		"\u0872\u0873\5\u011e\u0090\2\u0873\u0874\7\u0168\2\2\u0874\u0877\3\2\2"+
		"\2\u0875\u0877\5\u0120\u0091\2\u0876\u086d\3\2\2\2\u0876\u0875\3\2\2\2"+
		"\u0877\u087e\3\2\2\2\u0878\u0879\f\4\2\2\u0879\u087a\5\u012a\u0096\2\u087a"+
		"\u087b\5\u011e\u0090\5\u087b\u087d\3\2\2\2\u087c\u0878\3\2\2\2\u087d\u0880"+
		"\3\2\2\2\u087e\u087c\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u011f\3\2\2\2\u0880"+
		"\u087e\3\2\2\2\u0881\u0885\5\u0122\u0092\2\u0882\u0885\5\u0128\u0095\2"+
		"\u0883\u0885\5\u012e\u0098\2\u0884\u0881\3\2\2\2\u0884\u0882\3\2\2\2\u0884"+
		"\u0883\3\2\2\2\u0885\u0121\3\2\2\2\u0886\u0887\5\u012e\u0098\2\u0887\u0889"+
		"\7\u0095\2\2\u0888\u088a\7\u00bd\2\2\u0889\u0888\3\2\2\2\u0889\u088a\3"+
		"\2\2\2\u088a\u088b\3\2\2\2\u088b\u088c\7\u00bf\2\2\u088c\u089e\3\2\2\2"+
		"\u088d\u088e\5\u012e\u0098\2\u088e\u088f\7\24\2\2\u088f\u0890\5\u012e"+
		"\u0098\2\u0890\u0891\7\t\2\2\u0891\u0892\5\u012e\u0098\2\u0892\u089e\3"+
		"\2\2\2\u0893\u0895\7\u00bd\2\2\u0894\u0893\3\2\2\2\u0894\u0895\3\2\2\2"+
		"\u0895\u0896\3\2\2\2\u0896\u0897\7h\2\2\u0897\u0898\7\u0165\2\2\u0898"+
		"\u0899\5\u00dco\2\u0899\u089a\7\u0168\2\2\u089a\u089e\3\2\2\2\u089b\u089e"+
		"\5\u0124\u0093\2\u089c\u089e\5\u0126\u0094\2\u089d\u0886\3\2\2\2\u089d"+
		"\u088d\3\2\2\2\u089d\u0894\3\2\2\2\u089d\u089b\3\2\2\2\u089d\u089c\3\2"+
		"\2\2\u089e\u0123\3\2\2\2\u089f\u08a1\5\u012e\u0098\2\u08a0\u08a2\7\u00bd"+
		"\2\2\u08a1\u08a0\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3"+
		"\u08a4\7\u0086\2\2\u08a4\u08ae\7\u0165\2\2\u08a5\u08aa\5\u012e\u0098\2"+
		"\u08a6\u08a7\7\u0157\2\2\u08a7\u08a9\5\u012e\u0098\2\u08a8\u08a6\3\2\2"+
		"\2\u08a9\u08ac\3\2\2\2\u08aa\u08a8\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08af"+
		"\3\2\2\2\u08ac\u08aa\3\2\2\2\u08ad\u08af\5\u00dco\2\u08ae\u08a5\3\2\2"+
		"\2\u08ae\u08ad\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08b1\7\u0168\2\2\u08b1"+
		"\u0125\3\2\2\2\u08b2\u08b3\7\u0165\2\2\u08b3\u08b8\5\u012e\u0098\2\u08b4"+
		"\u08b5\7\u0157\2\2\u08b5\u08b7\5\u012e\u0098\2\u08b6\u08b4\3\2\2\2\u08b7"+
		"\u08ba\3\2\2\2\u08b8\u08b6\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08bb\3\2"+
		"\2\2\u08ba\u08b8\3\2\2\2\u08bb\u08bd\7\u0168\2\2\u08bc\u08be\7\u00bd\2"+
		"\2\u08bd\u08bc\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08bf\3\2\2\2\u08bf\u08c0"+
		"\7\u0086\2\2\u08c0\u08c1\7\u0165\2\2\u08c1\u08c2\5\u00dco\2\u08c2\u08c3"+
		"\7\u0168\2\2\u08c3\u0127\3\2\2\2\u08c4\u08c5\5\u012e\u0098\2\u08c5\u08c6"+
		"\5\u012c\u0097\2\u08c6\u08c7\5\u012e\u0098\2\u08c7\u0129\3\2\2\2\u08c8"+
		"\u08c9\t$\2\2\u08c9\u012b\3\2\2\2\u08ca\u08d7\7\u015b\2\2\u08cb\u08d7"+
		"\7\u015c\2\2\u08cc\u08d7\7\u015d\2\2\u08cd\u08d7\7\u015e\2\2\u08ce\u08d7"+
		"\7\u0161\2\2\u08cf\u08d7\7\u0162\2\2\u08d0\u08d7\7\u015f\2\2\u08d1\u08d7"+
		"\7\u0160\2\2\u08d2\u08d4\7\u00bd\2\2\u08d3\u08d2\3\2\2\2\u08d3\u08d4\3"+
		"\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08d7\t%\2\2\u08d6\u08ca\3\2\2\2\u08d6"+
		"\u08cb\3\2\2\2\u08d6\u08cc\3\2\2\2\u08d6\u08cd\3\2\2\2\u08d6\u08ce\3\2"+
		"\2\2\u08d6\u08cf\3\2\2\2\u08d6\u08d0\3\2\2\2\u08d6\u08d1\3\2\2\2\u08d6"+
		"\u08d3\3\2\2\2\u08d7\u012d\3\2\2\2\u08d8\u08f0\b\u0098\1\2\u08d9\u08da"+
		"\7\u0165\2\2\u08da\u08db\5\u00dco\2\u08db\u08dc\7\u0168\2\2\u08dc\u08f0"+
		"\3\2\2\2\u08dd\u08de\7\u0165\2\2\u08de\u08df\5\u012e\u0098\2\u08df\u08e0"+
		"\7\u0168\2\2\u08e0\u08f0\3\2\2\2\u08e1\u08f0\5\u0134\u009b\2\u08e2\u08f0"+
		"\5\u0138\u009d\2\u08e3\u08f0\5\u013c\u009f\2\u08e4\u08f0\5\u0142\u00a2"+
		"\2\u08e5\u08f0\5\u0144\u00a3\2\u08e6\u08f0\5\u014c\u00a7\2\u08e7\u08f0"+
		"\5\u014e\u00a8\2\u08e8\u08f0\5\u0132\u009a\2\u08e9\u08ea\5\u015e\u00b0"+
		"\2\u08ea\u08eb\t&\2\2\u08eb\u08ec\7\u015b\2\2\u08ec\u08ed\t\'\2\2\u08ed"+
		"\u08f0\3\2\2\2\u08ee\u08f0\7\u0163\2";
	private static final String _serializedATNSegment1 =
		"\2\u08ef\u08d8\3\2\2\2\u08ef\u08d9\3\2\2\2\u08ef\u08dd\3\2\2\2\u08ef\u08e1"+
		"\3\2\2\2\u08ef\u08e2\3\2\2\2\u08ef\u08e3\3\2\2\2\u08ef\u08e4\3\2\2\2\u08ef"+
		"\u08e5\3\2\2\2\u08ef\u08e6\3\2\2\2\u08ef\u08e7\3\2\2\2\u08ef\u08e8\3\2"+
		"\2\2\u08ef\u08e9\3\2\2\2\u08ef\u08ee\3\2\2\2\u08f0\u0901\3\2\2\2\u08f1"+
		"\u08f2\f\22\2\2\u08f2\u08f3\7\u0163\2\2\u08f3\u0900\5\u012e\u0098\23\u08f4"+
		"\u08f5\f\21\2\2\u08f5\u08f6\7\u0159\2\2\u08f6\u0900\5\u012e\u0098\22\u08f7"+
		"\u08f8\f\20\2\2\u08f8\u08f9\7\u0155\2\2\u08f9\u0900\5\u012e\u0098\21\u08fa"+
		"\u08fb\f\17\2\2\u08fb\u08fc\7\u016b\2\2\u08fc\u0900\5\u012e\u0098\20\u08fd"+
		"\u08fe\f\23\2\2\u08fe\u0900\5\u0136\u009c\2\u08ff\u08f1\3\2\2\2\u08ff"+
		"\u08f4\3\2\2\2\u08ff\u08f7\3\2\2\2\u08ff\u08fa\3\2\2\2\u08ff\u08fd\3\2"+
		"\2\2\u0900\u0903\3\2\2\2\u0901\u08ff\3\2\2\2\u0901\u0902\3\2\2\2\u0902"+
		"\u012f\3\2\2\2\u0903\u0901\3\2\2\2\u0904\u0906\5\u015e\u00b0\2\u0905\u0907"+
		"\5\u00f4{\2\u0906\u0905\3\2\2\2\u0906\u0907\3\2\2\2\u0907\u0131\3\2\2"+
		"\2\u0908\u0915\5\u015a\u00ae\2\u0909\u0915\5\u015c\u00af\2\u090a\u0915"+
		"\5\u0166\u00b4\2\u090b\u090c\5\u010c\u0087\2\u090c\u090d\7\u016d\2\2\u090d"+
		"\u090e\5\u0130\u0099\2\u090e\u0915\3\2\2\2\u090f\u0915\5\u015e\u00b0\2"+
		"\u0910\u0915\5\u0160\u00b1\2\u0911\u0915\5\u0164\u00b3\2\u0912\u0915\5"+
		"\u0162\u00b2\2\u0913\u0915\5\u0168\u00b5\2\u0914\u0908\3\2\2\2\u0914\u0909"+
		"\3\2\2\2\u0914\u090a\3\2\2\2\u0914\u090b\3\2\2\2\u0914\u090f\3\2\2\2\u0914"+
		"\u0910\3\2\2\2\u0914\u0911\3\2\2\2\u0914\u0912\3\2\2\2\u0914\u0913\3\2"+
		"\2\2\u0915\u0133\3\2\2\2\u0916\u0917\7\u0092\2\2\u0917\u0918\5\u012e\u0098"+
		"\2\u0918\u0919\5\u0136\u009c\2\u0919\u0135\3\2\2\2\u091a\u091b\t(\2\2"+
		"\u091b\u0137\3\2\2\2\u091c\u091d\5\u013a\u009e\2\u091d\u091e\t)\2\2\u091e"+
		"\u0923\5\u013a\u009e\2\u091f\u0920\t)\2\2\u0920\u0922\5\u013a\u009e\2"+
		"\u0921\u091f\3\2\2\2\u0922\u0925\3\2\2\2\u0923\u0921\3\2\2\2\u0923\u0924"+
		"\3\2\2\2\u0924\u0139\3\2\2\2\u0925\u0923\3\2\2\2\u0926\u0927\7\u0165\2"+
		"\2\u0927\u0928\5\u012e\u0098\2\u0928\u0929\7\u0168\2\2\u0929\u0930\3\2"+
		"\2\2\u092a\u0930\5\u013c\u009f\2\u092b\u0930\5\u0144\u00a3\2\u092c\u0930"+
		"\5\u014c\u00a7\2\u092d\u0930\5\u014e\u00a8\2\u092e\u0930\5\u0132\u009a"+
		"\2\u092f\u0926\3\2\2\2\u092f\u092a\3\2\2\2\u092f\u092b\3\2\2\2\u092f\u092c"+
		"\3\2\2\2\u092f\u092d\3\2\2\2\u092f\u092e\3\2\2\2\u0930\u013b\3\2\2\2\u0931"+
		"\u0934\5\u013e\u00a0\2\u0932\u0934\5\u0140\u00a1\2\u0933\u0931\3\2\2\2"+
		"\u0933\u0932\3\2\2\2\u0934\u013d\3\2\2\2\u0935\u0936\7!\2\2\u0936\u093c"+
		"\5\u012e\u0098\2\u0937\u0938\7\u0132\2\2\u0938\u0939\5\u012e\u0098\2\u0939"+
		"\u093a\7\u011b\2\2\u093a\u093b\5\u012e\u0098\2\u093b\u093d\3\2\2\2\u093c"+
		"\u0937\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u093c\3\2\2\2\u093e\u093f\3\2"+
		"\2\2\u093f\u0942\3\2\2\2\u0940\u0941\7\\\2\2\u0941\u0943\5\u012e\u0098"+
		"\2\u0942\u0940\3\2\2\2\u0942\u0943\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0945"+
		"\7`\2\2\u0945\u013f\3\2\2\2\u0946\u094c\7!\2\2\u0947\u0948\7\u0132\2\2"+
		"\u0948\u0949\5\u011e\u0090\2\u0949\u094a\7\u011b\2\2\u094a\u094b\5\u012e"+
		"\u0098\2\u094b\u094d\3\2\2\2\u094c\u0947\3\2\2\2\u094d\u094e\3\2\2\2\u094e"+
		"\u094c\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0952\3\2\2\2\u0950\u0951\7\\"+
		"\2\2\u0951\u0953\5\u012e\u0098\2\u0952\u0950\3\2\2\2\u0952\u0953\3\2\2"+
		"\2\u0953\u0954\3\2\2\2\u0954\u0955\7`\2\2\u0955\u0141\3\2\2\2\u0956\u0957"+
		"\5\u015e\u00b0\2\u0957\u0958\7\3\2\2\u0958\u0959\t*\2\2\u0959\u0143\3"+
		"\2\2\2\u095a\u095b\7\21\2\2\u095b\u095d\7\u0165\2\2\u095c\u095e\5\u0146"+
		"\u00a4\2\u095d\u095c\3\2\2\2\u095d\u095e\3\2\2\2\u095e\u095f\3\2\2\2\u095f"+
		"\u0960\5\u012e\u0098\2\u0960\u0962\7\u0168\2\2\u0961\u0963\5\u0148\u00a5"+
		"\2\u0962\u0961\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u09f5\3\2\2\2\u0964\u0965"+
		"\7\67\2\2\u0965\u0967\7\u0165\2\2\u0966\u0968\5\u0146\u00a4\2\u0967\u0966"+
		"\3\2\2\2\u0967\u0968\3\2\2\2\u0968\u0969\3\2\2\2\u0969\u096a\5\u012e\u0098"+
		"\2\u096a\u096c\7\u0168\2\2\u096b\u096d\5\u0148\u00a5\2\u096c\u096b\3\2"+
		"\2\2\u096c\u096d\3\2\2\2\u096d\u09f5\3\2\2\2\u096e\u096f\78\2\2\u096f"+
		"\u0971\7\u0165\2\2\u0970\u0972\5\u0146\u00a4\2\u0971\u0970\3\2\2\2\u0971"+
		"\u0972\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u0974\5\u012e\u0098\2\u0974\u0976"+
		"\7\u0168\2\2\u0975\u0977\5\u0148\u00a5\2\u0976\u0975\3\2\2\2\u0976\u0977"+
		"\3\2\2\2\u0977\u09f5\3\2\2\2\u0978\u0979\7\u013e\2\2\u0979\u097a\7\u0165"+
		"\2\2\u097a\u097b\5\u012e\u0098\2\u097b\u097c\7\u0168\2\2\u097c\u097d\5"+
		"\u0148\u00a5\2\u097d\u09f5\3\2\2\2\u097e\u097f\7\u0142\2\2\u097f\u0980"+
		"\7\u0165\2\2\u0980\u0981\5\u012e\u0098\2\u0981\u0982\7\u0168\2\2\u0982"+
		"\u0983\5\u0148\u00a5\2\u0983\u09f5\3\2\2\2\u0984\u0985\7\u0143\2\2\u0985"+
		"\u0986\7\u0165\2\2\u0986\u0987\5\u012e\u0098\2\u0987\u0988\7\u0168\2\2"+
		"\u0988\u0989\5\u0148\u00a5\2\u0989\u09f5\3\2\2\2\u098a\u098b\7\u0144\2"+
		"\2\u098b\u098c\7\u0165\2\2\u098c\u0993\5\u012e\u0098\2\u098d\u098e\7\u0157"+
		"\2\2\u098e\u0991\5\u012e\u0098\2\u098f\u0990\7\u0157\2\2\u0990\u0992\5"+
		"\u012e\u0098\2\u0991\u098f\3\2\2\2\u0991\u0992\3\2\2\2\u0992\u0994\3\2"+
		"\2\2\u0993\u098d\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0995\3\2\2\2\u0995"+
		"\u0996\7\u0168\2\2\u0996\u0997\5\u0148\u00a5\2\u0997\u09f5\3\2\2\2\u0998"+
		"\u0999\7\u0145\2\2\u0999\u099a\7\u0165\2\2\u099a\u099b\5\u012e\u0098\2"+
		"\u099b\u099c\7\u0168\2\2\u099c\u099d\5\u0148\u00a5\2\u099d\u09f5\3\2\2"+
		"\2\u099e\u099f\7\u0146\2\2\u099f\u09a0\7\u0165\2\2\u09a0\u09a7\5\u012e"+
		"\u0098\2\u09a1\u09a2\7\u0157\2\2\u09a2\u09a5\5\u012e\u0098\2\u09a3\u09a4"+
		"\7\u0157\2\2\u09a4\u09a6\5\u012e\u0098\2\u09a5\u09a3\3\2\2\2\u09a5\u09a6"+
		"\3\2\2\2\u09a6\u09a8\3\2\2\2\u09a7\u09a1\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8"+
		"\u09a9\3\2\2\2\u09a9\u09aa\7\u0168\2\2\u09aa\u09ab\5\u0148\u00a5\2\u09ab"+
		"\u09f5\3\2\2\2\u09ac\u09ad\7\u00ad\2\2\u09ad\u09af\7\u0165\2\2\u09ae\u09b0"+
		"\5\u0146\u00a4\2\u09af\u09ae\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u09b1\3"+
		"\2\2\2\u09b1\u09b2\5\u012e\u0098\2\u09b2\u09b4\7\u0168\2\2\u09b3\u09b5"+
		"\5\u0148\u00a5\2\u09b4\u09b3\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09f5\3"+
		"\2\2\2\u09b6\u09b7\7\u00b3\2\2\u09b7\u09b9\7\u0165\2\2\u09b8\u09ba\5\u0146"+
		"\u00a4\2\u09b9\u09b8\3\2\2\2\u09b9\u09ba\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb"+
		"\u09bc\5\u012e\u0098\2\u09bc\u09be\7\u0168\2\2\u09bd\u09bf\5\u0148\u00a5"+
		"\2\u09be\u09bd\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf\u09f5\3\2\2\2\u09c0\u09c1"+
		"\7\u014f\2\2\u09c1\u09c2\7\u0165\2\2\u09c2\u09c3\5\u012e\u0098\2\u09c3"+
		"\u09c4\7\u0168\2\2\u09c4\u09c5\5\u0148\u00a5\2\u09c5\u09f5\3\2\2\2\u09c6"+
		"\u09c7\7\u0150\2\2\u09c7\u09c8\7\u0165\2\2\u09c8\u09c9\5\u012e\u0098\2"+
		"\u09c9\u09ca\7\u0168\2\2\u09ca\u09cb\5\u0148\u00a5\2\u09cb\u09f5\3\2\2"+
		"\2\u09cc\u09cd\7\u0151\2\2\u09cd\u09cf\7\u0165\2\2\u09ce\u09d0\5\u0146"+
		"\u00a4\2\u09cf\u09ce\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1"+
		"\u09d2\5\u012e\u0098\2\u09d2\u09d4\7\u0168\2\2\u09d3\u09d5\5\u0148\u00a5"+
		"\2\u09d4\u09d3\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09f5\3\2\2\2\u09d6\u09d7"+
		"\7\u0113\2\2\u09d7\u09d9\7\u0165\2\2\u09d8\u09da\5\u0146\u00a4\2\u09d9"+
		"\u09d8\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dc\5\u012e"+
		"\u0098\2\u09dc\u09de\7\u0168\2\2\u09dd\u09df\5\u0148\u00a5\2\u09de\u09dd"+
		"\3\2\2\2\u09de\u09df\3\2\2\2\u09df\u09f5\3\2\2\2\u09e0\u09e1\7\u012d\2"+
		"\2\u09e1\u09e3\7\u0165\2\2\u09e2\u09e4\5\u0146\u00a4\2\u09e3\u09e2\3\2"+
		"\2\2\u09e3\u09e4\3\2\2\2\u09e4\u09e5\3\2\2\2\u09e5\u09e6\5\u012e\u0098"+
		"\2\u09e6\u09e8\7\u0168\2\2\u09e7\u09e9\5\u0148\u00a5\2\u09e8\u09e7\3\2"+
		"\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09f5\3\2\2\2\u09ea\u09eb\7\u0153\2\2\u09eb"+
		"\u09ed\7\u0165\2\2\u09ec\u09ee\5\u0146\u00a4\2\u09ed\u09ec\3\2\2\2\u09ed"+
		"\u09ee\3\2\2\2\u09ee\u09ef\3\2\2\2\u09ef\u09f0\5\u012e\u0098\2\u09f0\u09f2"+
		"\7\u0168\2\2\u09f1\u09f3\5\u0148\u00a5\2\u09f2\u09f1\3\2\2\2\u09f2\u09f3"+
		"\3\2\2\2\u09f3\u09f5\3\2\2\2\u09f4\u095a\3\2\2\2\u09f4\u0964\3\2\2\2\u09f4"+
		"\u096e\3\2\2\2\u09f4\u0978\3\2\2\2\u09f4\u097e\3\2\2\2\u09f4\u0984\3\2"+
		"\2\2\u09f4\u098a\3\2\2\2\u09f4\u0998\3\2\2\2\u09f4\u099e\3\2\2\2\u09f4"+
		"\u09ac\3\2\2\2\u09f4\u09b6\3\2\2\2\u09f4\u09c0\3\2\2\2\u09f4\u09c6\3\2"+
		"\2\2\u09f4\u09cc\3\2\2\2\u09f4\u09d6\3\2\2\2\u09f4\u09e0\3\2\2\2\u09f4"+
		"\u09ea\3\2\2\2\u09f5\u0145\3\2\2\2\u09f6\u09f7\t \2\2\u09f7\u0147\3\2"+
		"\2\2\u09f8\u09f9\7\u00cb\2\2\u09f9\u09fb\7\u0165\2\2\u09fa\u09fc\5\u014a"+
		"\u00a6\2\u09fb\u09fa\3\2\2\2\u09fb\u09fc\3\2\2\2\u09fc\u09fe\3\2\2\2\u09fd"+
		"\u09ff\5\u0118\u008d\2\u09fe\u09fd\3\2\2\2\u09fe\u09ff\3\2\2\2\u09ff\u0a00"+
		"\3\2\2\2\u0a00\u0a01\7\u0168\2\2\u0a01\u0149\3\2\2\2\u0a02\u0a03\7\u00cf"+
		"\2\2\u0a03\u0a04\7\34\2\2\u0a04\u0a09\5\u012e\u0098\2\u0a05\u0a06\7\u0157"+
		"\2\2\u0a06\u0a08\5\u012e\u0098\2\u0a07\u0a05\3\2\2\2\u0a08\u0a0b\3\2\2"+
		"\2\u0a09\u0a07\3\2\2\2\u0a09\u0a0a\3\2\2\2\u0a0a\u014b\3\2\2\2\u0a0b\u0a09"+
		"\3\2\2\2\u0a0c\u0ad5\7\u013d\2\2\u0a0d\u0a0e\7#\2\2\u0a0e\u0a0f\7\u0165"+
		"\2\2\u0a0f\u0a10\5\u012e\u0098\2\u0a10\u0a11\7\f\2\2\u0a11\u0a13\5^\60"+
		"\2\u0a12\u0a14\5`\61\2\u0a13\u0a12\3\2\2\2\u0a13\u0a14\3\2\2\2\u0a14\u0a15"+
		"\3\2\2\2\u0a15\u0a16\7\u0168\2\2\u0a16\u0ad5\3\2\2\2\u0a17\u0a18\7\67"+
		"\2\2\u0a18\u0a1b\7\u0165\2\2\u0a19\u0a1c\5\u012e\u0098\2\u0a1a\u0a1c\7"+
		"\u0163\2\2\u0a1b\u0a19\3\2\2\2\u0a1b\u0a1a\3\2\2\2\u0a1c\u0a1d\3\2\2\2"+
		"\u0a1d\u0ad5\7\u0168\2\2\u0a1e\u0ad5\7\u013f\2\2\u0a1f\u0a20\7=\2\2\u0a20"+
		"\u0ad5\7B\2\2\u0a21\u0a25\7\u0140\2\2\u0a22\u0a23\7=\2\2\u0a23\u0a25\7"+
		"\u011c\2\2\u0a24\u0a21\3\2\2\2\u0a24\u0a22\3\2\2\2\u0a25\u0a2a\3\2\2\2"+
		"\u0a26\u0a27\7\u0165\2\2\u0a27\u0a28\5\u012e\u0098\2\u0a28\u0a29\7\u0168"+
		"\2\2\u0a29\u0a2b\3\2\2\2\u0a2a\u0a26\3\2\2\2\u0a2a\u0a2b\3\2\2\2\u0a2b"+
		"\u0ad5\3\2\2\2\u0a2c\u0ad5\7\u0141\2\2\u0a2d\u0a2e\7=\2\2\u0a2e\u0ad5"+
		"\7\u0154\2\2\u0a2f\u0a30\7\u0147\2\2\u0a30\u0a31\7\u0165\2\2\u0a31\u0a3e"+
		"\5\u012e\u0098\2\u0a32\u0a33\7\u0157\2\2\u0a33\u0a3b\5\u012e\u0098\2\u0a34"+
		"\u0a35\7\u0157\2\2\u0a35\u0a36\5\u012e\u0098\2\u0a36\u0a37\7\u015b\2\2"+
		"\u0a37\u0a38\5\u012e\u0098\2\u0a38\u0a3a\3\2\2\2\u0a39\u0a34\3\2\2\2\u0a3a"+
		"\u0a3d\3\2\2\2\u0a3b\u0a39\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0a3f\3\2"+
		"\2\2\u0a3d\u0a3b\3\2\2\2\u0a3e\u0a32\3\2\2\2\u0a3e\u0a3f\3\2\2\2\u0a3f"+
		"\u0a40\3\2\2\2\u0a40\u0a41\7\u0168\2\2\u0a41\u0ad5\3\2\2\2\u0a42\u0a43"+
		"\7\u0148\2\2\u0a43\u0a44\7\u0165\2\2\u0a44\u0a51\5\u012e\u0098\2\u0a45"+
		"\u0a46\7\u0157\2\2\u0a46\u0a4e\5\u012e\u0098\2\u0a47\u0a48\7\u0157\2\2"+
		"\u0a48\u0a49\5\u012e\u0098\2\u0a49\u0a4a\7\u015b\2\2\u0a4a\u0a4b\5\u012e"+
		"\u0098\2\u0a4b\u0a4d\3\2\2\2\u0a4c\u0a47\3\2\2\2\u0a4d\u0a50\3\2\2\2\u0a4e"+
		"\u0a4c\3\2\2\2\u0a4e\u0a4f\3\2\2\2\u0a4f\u0a52\3\2\2\2\u0a50\u0a4e\3\2"+
		"\2\2\u0a51\u0a45\3\2\2\2\u0a51\u0a52\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53"+
		"\u0a54\7\u0168\2\2\u0a54\u0ad5\3\2\2\2\u0a55\u0a56\7\u0149\2\2\u0a56\u0a57"+
		"\7\u0165\2\2\u0a57\u0a64\5\u012e\u0098\2\u0a58\u0a59\7\u0157\2\2\u0a59"+
		"\u0a61\5\u012e\u0098\2\u0a5a\u0a5b\7\u0157\2\2\u0a5b\u0a5c\5\u012e\u0098"+
		"\2\u0a5c\u0a5d\7\u015b\2\2\u0a5d\u0a5e\5\u012e\u0098\2\u0a5e\u0a60\3\2"+
		"\2\2\u0a5f\u0a5a\3\2\2\2\u0a60\u0a63\3\2\2\2\u0a61\u0a5f\3\2\2\2\u0a61"+
		"\u0a62\3\2\2\2\u0a62\u0a65\3\2\2\2\u0a63\u0a61\3\2\2\2\u0a64\u0a58\3\2"+
		"\2\2\u0a64\u0a65\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66\u0a67\7\u0168\2\2\u0a67"+
		"\u0ad5\3\2\2\2\u0a68\u0a69\7\u014a\2\2\u0a69\u0a6a\7\u0165\2\2\u0a6a\u0a77"+
		"\5\u012e\u0098\2\u0a6b\u0a6c\7\u0157\2\2\u0a6c\u0a74\5\u012e\u0098\2\u0a6d"+
		"\u0a6e\7\u0157\2\2\u0a6e\u0a6f\5\u012e\u0098\2\u0a6f\u0a70\7\u015b\2\2"+
		"\u0a70\u0a71\5\u012e\u0098\2\u0a71\u0a73\3\2\2\2\u0a72\u0a6d\3\2\2\2\u0a73"+
		"\u0a76\3\2\2\2\u0a74\u0a72\3\2\2\2\u0a74\u0a75\3\2\2\2\u0a75\u0a78\3\2"+
		"\2\2\u0a76\u0a74\3\2\2\2\u0a77\u0a6b\3\2\2\2\u0a77\u0a78\3\2\2\2\u0a78"+
		"\u0a79\3\2\2\2\u0a79\u0a7a\7\u0168\2\2\u0a7a\u0ad5\3\2\2\2\u0a7b\u0a7c"+
		"\7\u014b\2\2\u0a7c\u0a7d\7\u0165\2\2\u0a7d\u0a8a\5\u012e\u0098\2\u0a7e"+
		"\u0a7f\7\u0157\2\2\u0a7f\u0a87\5\u012e\u0098\2\u0a80\u0a81\7\u0157\2\2"+
		"\u0a81\u0a82\5\u012e\u0098\2\u0a82\u0a83\7\u015b\2\2\u0a83\u0a84\5\u012e"+
		"\u0098\2\u0a84\u0a86\3\2\2\2\u0a85\u0a80\3\2\2\2\u0a86\u0a89\3\2\2\2\u0a87"+
		"\u0a85\3\2\2\2\u0a87\u0a88\3\2\2\2\u0a88\u0a8b\3\2\2\2\u0a89\u0a87\3\2"+
		"\2\2\u0a8a\u0a7e\3\2\2\2\u0a8a\u0a8b\3\2\2\2\u0a8b\u0a8c\3\2\2\2\u0a8c"+
		"\u0a8d\7\u0168\2\2\u0a8d\u0ad5\3\2\2\2\u0a8e\u0a8f\7\u014c\2\2\u0a8f\u0a90"+
		"\7\u0165\2\2\u0a90\u0a9d\5\u012e\u0098\2\u0a91\u0a92\7\u0157\2\2\u0a92"+
		"\u0a9a\5\u012e\u0098\2\u0a93\u0a94\7\u0157\2\2\u0a94\u0a95\5\u012e\u0098"+
		"\2\u0a95\u0a96\7\u015b\2\2\u0a96\u0a97\5\u012e\u0098\2\u0a97\u0a99\3\2"+
		"\2\2\u0a98\u0a93\3\2\2\2\u0a99\u0a9c\3\2\2\2\u0a9a\u0a98\3\2\2\2\u0a9a"+
		"\u0a9b\3\2\2\2\u0a9b\u0a9e\3\2\2\2\u0a9c\u0a9a\3\2\2\2\u0a9d\u0a91\3\2"+
		"\2\2\u0a9d\u0a9e\3\2\2\2\u0a9e\u0a9f\3\2\2\2\u0a9f\u0aa0\7\u0168\2\2\u0aa0"+
		"\u0ad5\3\2\2\2\u0aa1\u0aa2\7\u014d\2\2\u0aa2\u0aa3\7\u0165\2\2\u0aa3\u0aab"+
		"\5\u012e\u0098\2\u0aa4\u0aa5\7\u0157\2\2\u0aa5\u0aa6\5\u012e\u0098\2\u0aa6"+
		"\u0aa7\7\u015b\2\2\u0aa7\u0aa8\5\u012e\u0098\2\u0aa8\u0aaa\3\2\2\2\u0aa9"+
		"\u0aa4\3\2\2\2\u0aaa\u0aad\3\2\2\2\u0aab\u0aa9\3\2\2\2\u0aab\u0aac\3\2"+
		"\2\2\u0aac\u0aae\3\2\2\2\u0aad\u0aab\3\2\2\2\u0aae\u0aaf\7\u0168\2\2\u0aaf"+
		"\u0ad5\3\2\2\2\u0ab0\u0ab1\7\u014e\2\2\u0ab1\u0ab2\7\u0165\2\2\u0ab2\u0ab8"+
		"\5\u012e\u0098\2\u0ab3\u0ab4\7\u0157\2\2\u0ab4\u0ab5\5\u012e\u0098\2\u0ab5"+
		"\u0ab6\7\u015b\2\2\u0ab6\u0ab7\5\u012e\u0098\2\u0ab7\u0ab9\3\2\2\2\u0ab8"+
		"\u0ab3\3\2\2\2\u0ab9\u0aba\3\2\2\2\u0aba\u0ab8\3\2\2\2\u0aba\u0abb\3\2"+
		"\2\2\u0abb\u0abe\3\2\2\2\u0abc\u0abd\7\u0157\2\2\u0abd\u0abf\5\u012e\u0098"+
		"\2\u0abe\u0abc\3\2\2\2\u0abe\u0abf\3\2\2\2\u0abf\u0ac0\3\2\2\2\u0ac0\u0ac1"+
		"\7\u0168\2\2\u0ac1\u0ad5\3\2\2\2\u0ac2\u0ac3\7\u00f4\2\2\u0ac3\u0ac4\7"+
		"\u0165\2\2\u0ac4\u0ac5\5\u012e\u0098\2\u0ac5\u0ac6\7\u0168\2\2\u0ac6\u0ad5"+
		"\3\2\2\2\u0ac7\u0ac8\7\u0112\2\2\u0ac8\u0ac9\7\u0165\2\2\u0ac9\u0aca\5"+
		"\u012e\u0098\2\u0aca\u0acb\7t\2\2\u0acb\u0ace\5\u012e\u0098\2\u0acc\u0acd"+
		"\7p\2\2\u0acd\u0acf\5\u012e\u0098\2\u0ace\u0acc\3\2\2\2\u0ace\u0acf\3"+
		"\2\2\2\u0acf\u0ad0\3\2\2\2\u0ad0\u0ad1\7\u0168\2\2\u0ad1\u0ad5\3\2\2\2"+
		"\u0ad2\u0ad5\7\u0152\2\2\u0ad3\u0ad5\7\u0154\2\2\u0ad4\u0a0c\3\2\2\2\u0ad4"+
		"\u0a0d\3\2\2\2\u0ad4\u0a17\3\2\2\2\u0ad4\u0a1e\3\2\2\2\u0ad4\u0a1f\3\2"+
		"\2\2\u0ad4\u0a24\3\2\2\2\u0ad4\u0a2c\3\2\2\2\u0ad4\u0a2d\3\2\2\2\u0ad4"+
		"\u0a2f\3\2\2\2\u0ad4\u0a42\3\2\2\2\u0ad4\u0a55\3\2\2\2\u0ad4\u0a68\3\2"+
		"\2\2\u0ad4\u0a7b\3\2\2\2\u0ad4\u0a8e\3\2\2\2\u0ad4\u0aa1\3\2\2\2\u0ad4"+
		"\u0ab0\3\2\2\2\u0ad4\u0ac2\3\2\2\2\u0ad4\u0ac7\3\2\2\2\u0ad4\u0ad2\3\2"+
		"\2\2\u0ad4\u0ad3\3\2\2\2\u0ad5\u014d\3\2\2\2\u0ad6\u0ad7\5\u015e\u00b0"+
		"\2\u0ad7\u0ad9\7\u0165\2\2\u0ad8\u0ada\5\u0150\u00a9\2\u0ad9\u0ad8\3\2"+
		"\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb\u0adc\7\u0168\2\2\u0adc"+
		"\u014f\3\2\2\2\u0add\u0ae2\5\u0152\u00aa\2\u0ade\u0adf\7\u0157\2\2\u0adf"+
		"\u0ae1\5\u0152\u00aa\2\u0ae0\u0ade\3\2\2\2\u0ae1\u0ae4\3\2\2\2\u0ae2\u0ae0"+
		"\3\2\2\2\u0ae2\u0ae3\3\2\2\2\u0ae3\u0151\3\2\2\2\u0ae4\u0ae2\3\2\2\2\u0ae5"+
		"\u0aeb\6\u00aa\22\2\u0ae6\u0ae7\5\u015e\u00b0\2\u0ae7\u0ae9\7\u015b\2"+
		"\2\u0ae8\u0aea\7\u015f\2\2\u0ae9\u0ae8\3\2\2\2\u0ae9\u0aea\3\2\2\2\u0aea"+
		"\u0aec\3\2\2\2\u0aeb\u0ae6\3\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u0aed\3\2"+
		"\2\2\u0aed\u0aee\5\u012e\u0098\2\u0aee\u0153\3\2\2\2\u0aef\u0af2\5\u00dc"+
		"o\2\u0af0\u0af2\5\u012e\u0098\2\u0af1\u0aef\3\2\2\2\u0af1\u0af0\3\2\2"+
		"\2\u0af2\u0155\3\2\2\2\u0af3\u0af6\5\u0158\u00ad\2\u0af4\u0af6\5\u012e"+
		"\u0098\2\u0af5\u0af3\3\2\2\2\u0af5\u0af4\3\2\2\2\u0af6\u0157\3\2\2\2\u0af7"+
		"\u0b06\7\u0177\2\2\u0af8\u0afc\7\u0159\2\2\u0af9\u0afa\7\u016d\2\2\u0afa"+
		"\u0afc\7\u0159\2\2\u0afb\u0af8\3\2\2\2\u0afb\u0af9\3\2\2\2\u0afb\u0afc"+
		"\3\2\2\2\u0afc\u0afd\3\2\2\2\u0afd\u0b02\5\u015e\u00b0\2\u0afe\u0aff\7"+
		"\u0159\2\2\u0aff\u0b01\5\u015e\u00b0\2\u0b00\u0afe\3\2\2\2\u0b01\u0b04"+
		"\3\2\2\2\u0b02\u0b00\3\2\2\2\u0b02\u0b03\3\2\2\2\u0b03\u0b06\3\2\2\2\u0b04"+
		"\u0b02\3\2\2\2\u0b05\u0af7\3\2\2\2\u0b05\u0afb\3\2\2\2\u0b06\u0159\3\2"+
		"\2\2\u0b07\u0b08\7B\2\2\u0b08\u0b09\5\u0160\u00b1\2\u0b09\u015b\3\2\2"+
		"\2\u0b0a\u0b0b\7\u011c\2\2\u0b0b\u0b0c\5\u0160\u00b1\2\u0b0c\u015d\3\2"+
		"\2\2\u0b0d\u0b12\7\u016e\2\2\u0b0e\u0b0f\7\u016d\2\2\u0b0f\u0b11\7\u016e"+
		"\2\2\u0b10\u0b0e\3\2\2\2\u0b11\u0b14\3\2\2\2\u0b12\u0b10\3\2\2\2\u0b12"+
		"\u0b13\3\2\2\2\u0b13\u015f\3\2\2\2\u0b14\u0b12\3\2\2\2\u0b15\u0b18\7\u016f"+
		"\2\2\u0b16\u0b18\7\u0171\2\2\u0b17\u0b15\3\2\2\2\u0b17\u0b16\3\2\2\2\u0b18"+
		"\u0161\3\2\2\2\u0b19\u0b1b\t+\2\2\u0b1a\u0b19\3\2\2\2\u0b1a\u0b1b\3\2"+
		"\2\2\u0b1b\u0b1c\3\2\2\2\u0b1c\u0b1d\7\u0172\2\2\u0b1d\u0163\3\2\2\2\u0b1e"+
		"\u0b20\t+\2\2\u0b1f\u0b1e\3\2\2\2\u0b1f\u0b20\3\2\2\2\u0b20\u0b21\3\2"+
		"\2\2\u0b21\u0b22\7\u0173\2\2\u0b22\u0165\3\2\2\2\u0b23\u0b24\t,\2\2\u0b24"+
		"\u0167\3\2\2\2\u0b25\u0b26\7\u00bf\2\2\u0b26\u0169\3\2\2\2\u0b27\u0b28"+
		"\t-\2\2\u0b28\u016b\3\2\2\2\u0162\u0173\u0176\u017a\u017d\u0182\u0189"+
		"\u0190\u0192\u019b\u019e\u01a2\u01bd\u01c3\u01ce\u01d9\u01e4\u01ee\u01f6"+
		"\u01fd\u0201\u0205\u020a\u020e\u0213\u0217\u021b\u0225\u0229\u022e\u0233"+
		"\u0237\u0244\u0249\u024f\u025a\u025e\u0268\u026b\u0270\u0275\u027c\u0283"+
		"\u029d\u02a3\u02a8\u02ae\u02b5\u02b8\u02be\u02cc\u02d6\u02dc\u02e1\u02e6"+
		"\u02eb\u02ef\u02f4\u02f7\u0301\u030d\u0314\u0317\u0323\u0328\u032d\u0330"+
		"\u0337\u0343\u0350\u0352\u0357\u035a\u0369\u036f\u037a\u037d\u0387\u038e"+
		"\u0396\u039e\u03a8\u03bc\u03c2\u03c6\u03cb\u03cf\u03d4\u03d7\u03dc\u03df"+
		"\u03ed\u040d\u040f\u0414\u0418\u041d\u0424\u0427\u042a\u042f\u0433\u0435"+
		"\u043c\u0442\u0446\u044c\u0452\u0458\u045f\u0465\u046d\u0473\u0476\u047d"+
		"\u0482\u0485\u0495\u04b1\u04b3\u04cd\u04d6\u04de\u04e2\u04eb\u04f5\u04f9"+
		"\u04fb\u0509\u0517\u051e\u0521\u0526\u052d\u0536\u0539\u053e\u054b\u054d"+
		"\u055d\u0567\u056a\u0571\u0577\u057a\u057f\u0583\u0586\u058d\u0593\u0596"+
		"\u05a0\u05a9\u05b0\u05b7\u05b9\u05bf\u05c2\u05cd\u05d6\u05dc\u05e2\u05e5"+
		"\u05ea\u05ed\u05f0\u05f3\u05f6\u05fc\u0606\u0611\u0614\u061b\u0620\u0625"+
		"\u0629\u0631\u0635\u063a\u063e\u0640\u0645\u064d\u0652\u065b\u0662\u0668"+
		"\u066c\u0670\u0674\u067e\u0684\u0690\u0697\u06a7\u06ae\u06b4\u06b7\u06bb"+
		"\u06be\u06c9\u06cc\u06d7\u06df\u06e7\u06f0\u06f8\u06fd\u0700\u0703\u0706"+
		"\u0709\u0711\u0715\u071d\u0723\u072c\u0739\u0744\u0749\u0756\u0761\u076d"+
		"\u0771\u0775\u0779\u077b\u0781\u0784\u0787\u078a\u078e\u0791\u0794\u0799"+
		"\u079c\u07a6\u07b1\u07b5\u07b8\u07be\u07c5\u07c9\u07d3\u07db\u07e3\u07e7"+
		"\u07ed\u07f6\u07f9\u07fe\u0801\u080b\u0810\u0819\u081e\u0822\u082b\u082f"+
		"\u0836\u0842\u084f\u0854\u0858\u085e\u0869\u086b\u086f\u0876\u087e\u0884"+
		"\u0889\u0894\u089d\u08a1\u08aa\u08ae\u08b8\u08bd\u08d3\u08d6\u08ef\u08ff"+
		"\u0901\u0906\u0914\u0923\u092f\u0933\u093e\u0942\u094e\u0952\u095d\u0962"+
		"\u0967\u096c\u0971\u0976\u0991\u0993\u09a5\u09a7\u09af\u09b4\u09b9\u09be"+
		"\u09cf\u09d4\u09d9\u09de\u09e3\u09e8\u09ed\u09f2\u09f4\u09fb\u09fe\u0a09"+
		"\u0a13\u0a1b\u0a24\u0a2a\u0a3b\u0a3e\u0a4e\u0a51\u0a61\u0a64\u0a74\u0a77"+
		"\u0a87\u0a8a\u0a9a\u0a9d\u0aab\u0aba\u0abe\u0ace\u0ad4\u0ad9\u0ae2\u0ae9"+
		"\u0aeb\u0af1\u0af5\u0afb\u0b02\u0b05\u0b12\u0b17\u0b1a\u0b1f";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}