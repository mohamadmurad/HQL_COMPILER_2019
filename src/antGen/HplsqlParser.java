// Generated from C:/Users/Husam/Desktop/projects/HQL_COMPILER_2019\Hplsql.g4 by ANTLR 4.7.2
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
		RULE_exception_block_item = 8, RULE_call_stmt = 9, RULE_call_param = 10, 
		RULE_call_param_item = 11, RULE_declare_stmt = 12, RULE_declare_block = 13, 
		RULE_declare_block_inplace = 14, RULE_declare_stmt_item = 15, RULE_declare_var_item = 16, 
		RULE_declare_condition_item = 17, RULE_declare_cursor_item = 18, RULE_cursor_with_return = 19, 
		RULE_cursor_without_return = 20, RULE_declare_handler_item = 21, RULE_declare_temporary_table_item = 22, 
		RULE_create_table_stmt = 23, RULE_create_local_temp_table_stmt = 24, RULE_create_table_definition = 25, 
		RULE_new_delimiter = 26, RULE_new_location = 27, RULE_new_store = 28, 
		RULE_create_table_columns = 29, RULE_create_table_columns_item = 30, RULE_column_name = 31, 
		RULE_create_table_column_inline_cons = 32, RULE_create_table_column_cons = 33, 
		RULE_create_table_fk_action = 34, RULE_create_table_preoptions = 35, RULE_create_table_preoptions_item = 36, 
		RULE_create_table_preoptions_td_item = 37, RULE_create_table_options = 38, 
		RULE_create_table_options_item = 39, RULE_create_table_options_ora_item = 40, 
		RULE_create_table_options_db2_item = 41, RULE_create_table_options_td_item = 42, 
		RULE_create_table_options_hive_item = 43, RULE_create_table_hive_row_format = 44, 
		RULE_create_table_hive_row_format_fields = 45, RULE_create_table_options_mssql_item = 46, 
		RULE_create_table_options_mysql_item = 47, RULE_dtype = 48, RULE_dtype_len = 49, 
		RULE_dtype_attr = 50, RULE_dtype_default = 51, RULE_create_database_stmt = 52, 
		RULE_create_database_option = 53, RULE_error_create_database_stmt = 54, 
		RULE_function_stmt = 55, RULE_def_return = 56, RULE_return_param = 57, 
		RULE_return_param_item = 58, RULE_cpp_smt = 59, RULE_cpp_smt_for = 60, 
		RULE_cpp_if_stmt = 61, RULE_def_else_if = 62, RULE_def_else = 63, RULE_ifex = 64, 
		RULE_op = 65, RULE_cpp_assignment_stmt = 66, RULE_number = 67, RULE_cpp_var_decleration = 68, 
		RULE_cpp_for_stmt = 69, RULE_for_inc_dec = 70, RULE_forhead1 = 71, RULE_create_function_stmt = 72, 
		RULE_create_function_return = 73, RULE_create_package_stmt = 74, RULE_package_spec = 75, 
		RULE_package_spec_item = 76, RULE_create_package_body_stmt = 77, RULE_package_body = 78, 
		RULE_package_body_item = 79, RULE_create_procedure_stmt = 80, RULE_create_routine_params = 81, 
		RULE_create_routine_param_item = 82, RULE_create_routine_options = 83, 
		RULE_create_routine_option = 84, RULE_collect_stats_clause = 85, RULE_cmp_source = 86, 
		RULE_copy_source = 87, RULE_copy_target = 88, RULE_copy_option = 89, RULE_copy_file_option = 90, 
		RULE_create_index_stmt = 91, RULE_create_index_col = 92, RULE_index_storage_clause = 93, 
		RULE_index_mssql_storage_clause = 94, RULE_set_session_option = 95, RULE_set_current_schema_option = 96, 
		RULE_set_mssql_session_option = 97, RULE_set_teradata_session_option = 98, 
		RULE_while_stmt = 99, RULE_label = 100, RULE_using_clause = 101, RULE_new_select_stmt = 102, 
		RULE_new_select_col = 103, RULE_col_func = 104, RULE_tabledotcol = 105, 
		RULE_new_from_table = 106, RULE_new_from_subselect_clause = 107, RULE_new_from_join_clause = 108, 
		RULE_new_join_condition = 109, RULE_new_where_condition = 110, RULE_select_stmt = 111, 
		RULE_cte_select_stmt = 112, RULE_cte_select_stmt_item = 113, RULE_cte_select_cols = 114, 
		RULE_fullselect_stmt = 115, RULE_fullselect_stmt_item = 116, RULE_fullselect_set_clause = 117, 
		RULE_subselect_stmt = 118, RULE_select_list = 119, RULE_select_list_set = 120, 
		RULE_select_list_limit = 121, RULE_select_list_item = 122, RULE_select_list_alias = 123, 
		RULE_select_list_asterisk = 124, RULE_into_clause = 125, RULE_from_clause = 126, 
		RULE_from_table_clause = 127, RULE_from_table_name_clause = 128, RULE_from_subselect_clause = 129, 
		RULE_from_join_clause = 130, RULE_from_join_type_clause = 131, RULE_from_table_values_clause = 132, 
		RULE_from_table_values_row = 133, RULE_from_alias_clause = 134, RULE_table_name = 135, 
		RULE_where_clause = 136, RULE_error_where_clause = 137, RULE_group_by_clause = 138, 
		RULE_having_clause = 139, RULE_qualify_clause = 140, RULE_order_by_clause = 141, 
		RULE_select_options = 142, RULE_select_options_item = 143, RULE_bool_expr = 144, 
		RULE_bool_expr_atom = 145, RULE_bool_expr_unary = 146, RULE_bool_expr_single_in = 147, 
		RULE_bool_expr_multi_in = 148, RULE_bool_expr_binary = 149, RULE_bool_expr_logical_operator = 150, 
		RULE_bool_expr_binary_operator = 151, RULE_expr = 152, RULE_colom_name = 153, 
		RULE_expr_atom = 154, RULE_expr_interval = 155, RULE_interval_item = 156, 
		RULE_expr_concat = 157, RULE_expr_concat_item = 158, RULE_expr_case = 159, 
		RULE_expr_case_simple = 160, RULE_expr_case_searched = 161, RULE_expr_cursor_attribute = 162, 
		RULE_expr_agg_window_func = 163, RULE_expr_func_all_distinct = 164, RULE_expr_func_over_clause = 165, 
		RULE_expr_func_partition_by_clause = 166, RULE_expr_spec_func = 167, RULE_expr_func = 168, 
		RULE_expr_func_params = 169, RULE_func_param = 170, RULE_expr_select = 171, 
		RULE_expr_file = 172, RULE_file_name = 173, RULE_date_literal = 174, RULE_timestamp_literal = 175, 
		RULE_ident = 176, RULE_string = 177, RULE_int_number = 178, RULE_dec_number = 179, 
		RULE_bool_literal = 180, RULE_null_const = 181, RULE_non_reserved_words = 182;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "begin_end_block", "single_block_stmt", "block_end", 
			"proc_block", "stmt", "exception_block", "exception_block_item", "call_stmt", 
			"call_param", "call_param_item", "declare_stmt", "declare_block", "declare_block_inplace", 
			"declare_stmt_item", "declare_var_item", "declare_condition_item", "declare_cursor_item", 
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
			"cpp_assignment_stmt", "number", "cpp_var_decleration", "cpp_for_stmt", 
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
			setState(366);
			block();
			setState(367);
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
			setState(378); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(373);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(369);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(370);
						((BlockContext)_localctx).stmt = stmt();
						AST.root = ((BlockContext)_localctx).stmt.root;
						}
						break;
					}
					setState(376);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(375);
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
				setState(380); 
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
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(382);
				declare_block();
				}
			}

			setState(385);
			match(T_BEGIN);
			setState(386);
			block();
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(387);
				exception_block();
				}
				break;
			}
			setState(390);
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
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(T_BEGIN);
				setState(393);
				block();
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(394);
					exception_block();
					}
					break;
				}
				setState(397);
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
				setState(399);
				((Single_block_stmtContext)_localctx).stmt = stmt();
				AST.root = ((Single_block_stmtContext)_localctx).stmt.root;
				setState(402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(401);
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
			setState(406);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(407);
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
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(410);
						((Proc_blockContext)_localctx).stmt = stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(413); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(415);
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
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((StmtContext)_localctx).root =  new Node();
				setState(423);
				call_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				create_database_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				((StmtContext)_localctx).function_stmt = function_stmt();
				((StmtContext)_localctx).root =  ((StmtContext)_localctx).function_stmt.astNode;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				create_index_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				create_local_temp_table_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(430);
				create_package_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(431);
				create_package_body_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(432);
				create_procedure_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(433);
				((StmtContext)_localctx).create_table_stmt = create_table_stmt();
				((StmtContext)_localctx).root =  ((StmtContext)_localctx).create_table_stmt.tableNode;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(436);
				declare_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(437);
				while_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(438);
				label();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(439);
				cpp_assignment_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(440);
				((StmtContext)_localctx).cpp_var_decleration = cpp_var_decleration();
				((StmtContext)_localctx).root =  ((StmtContext)_localctx).cpp_var_decleration.VarDecNode;
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(443);
				((StmtContext)_localctx).cpp_for_stmt = cpp_for_stmt();
				((StmtContext)_localctx).root =  ((StmtContext)_localctx).cpp_for_stmt.forNode;
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(446);
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
			setState(449);
			match(T_EXCEPTION);
			setState(451); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(450);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(453); 
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
			setState(455);
			match(T_WHEN);
			setState(456);
			match(L_ID);
			setState(457);
			match(T_THEN);
			setState(458);
			block();
			setState(459);
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
		public Call_paramContext call_param() {
			return getRuleContext(Call_paramContext.class,0);
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
			setState(461);
			ident();
			setState(462);
			match(T_OPEN_P);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 364)) & ~0x3f) == 0 && ((1L << (_la - 364)) & ((1L << (L_ID - 364)) | (1L << (L_INT - 364)) | (1L << (L_DEC - 364)))) != 0)) {
				{
				setState(463);
				call_param();
				}
			}

			setState(466);
			match(T_CLOSE_P);
			setState(467);
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

	public static class Call_paramContext extends ParserRuleContext {
		public List<Call_param_itemContext> call_param_item() {
			return getRuleContexts(Call_param_itemContext.class);
		}
		public Call_param_itemContext call_param_item(int i) {
			return getRuleContext(Call_param_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Call_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCall_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCall_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCall_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_paramContext call_param() throws RecognitionException {
		Call_paramContext _localctx = new Call_paramContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_call_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			call_param_item();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(470);
				match(T_COMMA);
				setState(471);
				call_param_item();
				}
				}
				setState(476);
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

	public static class Call_param_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Call_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_param_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCall_param_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCall_param_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCall_param_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_param_itemContext call_param_item() throws RecognitionException {
		Call_param_itemContext _localctx = new Call_param_itemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_call_param_item);
		try {
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				ident();
				}
				break;
			case L_INT:
			case L_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				number();
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
		enterRule(_localctx, 24, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(T_DECLARE);
			setState(482);
			declare_stmt_item();
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					match(T_COMMA);
					setState(484);
					declare_stmt_item();
					}
					} 
				}
				setState(489);
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
		enterRule(_localctx, 26, RULE_declare_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T_DECLARE);
			setState(491);
			declare_stmt_item();
			setState(492);
			match(T_SEMICOLON);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_CONTINUE || _la==T_CURSOR || _la==T_EXIT || _la==T_GLOBAL || _la==T_TEMPORARY || _la==L_ID) {
				{
				{
				setState(493);
				declare_stmt_item();
				setState(494);
				match(T_SEMICOLON);
				}
				}
				setState(500);
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
		enterRule(_localctx, 28, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			declare_stmt_item();
			setState(502);
			match(T_SEMICOLON);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(503);
					declare_stmt_item();
					setState(504);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 30, RULE_declare_stmt_item);
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				declare_cursor_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				declare_condition_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				declare_handler_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(514);
				declare_var_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(515);
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
		enterRule(_localctx, 32, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				ident();
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(519);
					match(T_COMMA);
					setState(520);
					ident();
					}
					}
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(526);
					match(T_AS);
					}
				}

				setState(529);
				dtype();
				setState(531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(530);
					dtype_len();
					}
					break;
				}
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(533);
						dtype_attr();
						}
						} 
					}
					setState(538);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(539);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				ident();
				setState(543);
				match(T_CONSTANT);
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(544);
					match(T_AS);
					}
				}

				setState(547);
				dtype();
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(548);
					dtype_len();
					}
				}

				setState(551);
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
		enterRule(_localctx, 34, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			ident();
			setState(556);
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
		enterRule(_localctx, 36, RULE_declare_cursor_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURSOR:
				{
				setState(558);
				match(T_CURSOR);
				setState(559);
				ident();
				}
				break;
			case L_ID:
				{
				setState(560);
				ident();
				setState(561);
				match(T_CURSOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WITH:
				{
				setState(565);
				cursor_with_return();
				}
				break;
			case T_WITHOUT:
				{
				setState(566);
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
			setState(569);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_FOR || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(570);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(571);
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
		enterRule(_localctx, 38, RULE_cursor_with_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(T_WITH);
			setState(575);
			match(T_RETURN);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ONLY) {
				{
				setState(576);
				match(T_ONLY);
				}
			}

			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TO) {
				{
				setState(579);
				match(T_TO);
				setState(580);
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
		enterRule(_localctx, 40, RULE_cursor_without_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(T_WITHOUT);
			setState(584);
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
		enterRule(_localctx, 42, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(587);
			match(T_HANDLER);
			setState(588);
			match(T_FOR);
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SQLEXCEPTION:
				{
				setState(589);
				match(T_SQLEXCEPTION);
				}
				break;
			case T_SQLWARNING:
				{
				setState(590);
				match(T_SQLWARNING);
				}
				break;
			case T_NOT:
				{
				setState(591);
				match(T_NOT);
				setState(592);
				match(T_FOUND);
				}
				break;
			case L_ID:
				{
				setState(593);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(596);
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
		enterRule(_localctx, 44, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(598);
				match(T_GLOBAL);
				}
			}

			setState(601);
			match(T_TEMPORARY);
			setState(602);
			match(T_TABLE);
			setState(603);
			ident();
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LOCATION || _la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(604);
				create_table_preoptions();
				}
			}

			setState(607);
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
		enterRule(_localctx, 46, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			nameType = new ArrayList<name_type>();
			setState(610);
			match(T_CREATE);
			setState(611);
			match(T_EXTERNAL);
			setState(612);
			match(T_TABLE);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(613);
				match(T_IF);
				setState(614);
				match(T_NOT);
				setState(615);
				match(T_EXISTS);
				}
			}

			setState(618);
			((Create_table_stmtContext)_localctx).table_name = table_name();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LOCATION || _la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(619);
				create_table_preoptions();
				}
			}

			setState(622);
			create_table_definition();
			setState(623);
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
		enterRule(_localctx, 48, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(T_CREATE);
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(627);
				match(T_LOCAL);
				setState(628);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(629);
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

				setState(632);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(635);
			match(T_TABLE);
			setState(636);
			ident();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LOCATION || _la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(637);
				create_table_preoptions();
				}
			}

			setState(640);
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
		enterRule(_localctx, 50, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(642);
					match(T_AS);
					}
				}

				setState(645);
				match(T_OPEN_P);
				setState(646);
				select_stmt();
				setState(647);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(649);
					match(T_AS);
					}
				}

				setState(652);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(653);
				match(T_OPEN_P);
				setState(654);
				create_table_columns();
				setState(655);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(659);
			new_store();
			setState(660);
			new_delimiter();
			setState(661);
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
		enterRule(_localctx, 52, RULE_new_delimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(T_ROW);
			setState(664);
			match(T_FORMAT);
			setState(665);
			match(T_DELIMITED);
			setState(666);
			match(T_FIELDS);
			setState(667);
			match(T_TERMINATED);
			setState(668);
			match(T_BY);
			setState(669);
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
		enterRule(_localctx, 54, RULE_new_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(T_LOCATION);
			setState(672);
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
		enterRule(_localctx, 56, RULE_new_store);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(T_STORED);
			setState(675);
			match(T_AS);
			setState(676);
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
		enterRule(_localctx, 58, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			create_table_columns_item();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(679);
				match(T_COMMA);
				setState(680);
				create_table_columns_item();
				}
				}
				setState(685);
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
		enterRule(_localctx, 60, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				((Create_table_columns_itemContext)_localctx).column_name = column_name();
				setState(687);
				((Create_table_columns_itemContext)_localctx).dtype = dtype();
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(688);
					dtype_len();
					}
				}

				setState(694);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(691);
						dtype_attr();
						}
						} 
					}
					setState(696);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T_DEFAULT - 71)) | (1L << (T_ENABLE - 71)) | (1L << (T_IDENTITY - 71)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (T_NOT - 187)) | (1L << (T_NULL - 187)) | (1L << (T_PRIMARY - 187)) | (1L << (T_REFERENCES - 187)))) != 0) || ((((_la - 292)) & ~0x3f) == 0 && ((1L << (_la - 292)) & ((1L << (T_UNIQUE - 292)) | (1L << (T_WITH - 292)) | (1L << (T_COLON - 292)) | (1L << (T_EQUAL - 292)))) != 0)) {
					{
					{
					setState(697);
					create_table_column_inline_cons();
					}
					}
					setState(702);
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
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(705);
					match(T_CONSTRAINT);
					setState(706);
					ident();
					}
				}

				setState(709);
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
		enterRule(_localctx, 62, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
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
		enterRule(_localctx, 64, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(715);
					match(T_NOT);
					}
				}

				setState(718);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(719);
				match(T_PRIMARY);
				setState(720);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(721);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(722);
				match(T_REFERENCES);
				setState(723);
				table_name();
				setState(724);
				match(T_OPEN_P);
				setState(725);
				ident();
				setState(726);
				match(T_CLOSE_P);
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(727);
					create_table_fk_action();
					}
					}
					setState(732);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(733);
				match(T_IDENTITY);
				setState(734);
				match(T_OPEN_P);
				setState(735);
				match(L_INT);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(736);
					match(T_COMMA);
					setState(737);
					match(L_INT);
					}
					}
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(743);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(744);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(745);
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
		enterRule(_localctx, 66, RULE_create_table_column_cons);
		int _la;
		try {
			setState(805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				match(T_PRIMARY);
				setState(749);
				match(T_KEY);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(750);
					match(T_CLUSTERED);
					}
				}

				setState(753);
				match(T_OPEN_P);
				setState(754);
				ident();
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(755);
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

				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(758);
					match(T_COMMA);
					setState(759);
					ident();
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(760);
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
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(768);
				match(T_CLOSE_P);
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(769);
					match(T_ENABLE);
					}
				}

				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(772);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				match(T_FOREIGN);
				setState(776);
				match(T_KEY);
				setState(777);
				match(T_OPEN_P);
				setState(778);
				ident();
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(779);
					match(T_COMMA);
					setState(780);
					ident();
					}
					}
					setState(785);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(786);
				match(T_CLOSE_P);
				setState(787);
				match(T_REFERENCES);
				setState(788);
				table_name();
				setState(789);
				match(T_OPEN_P);
				setState(790);
				ident();
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(791);
					match(T_COMMA);
					setState(792);
					ident();
					}
					}
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(798);
				match(T_CLOSE_P);
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(799);
					create_table_fk_action();
					}
					}
					setState(804);
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
		enterRule(_localctx, 68, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(T_ON);
			setState(808);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(809);
				match(T_NO);
				setState(810);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(811);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(812);
				match(T_SET);
				setState(813);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(814);
				match(T_SET);
				setState(815);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(816);
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
		enterRule(_localctx, 70, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(819);
				create_table_preoptions_item();
				}
				}
				setState(822); 
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
		enterRule(_localctx, 72, RULE_create_table_preoptions_item);
		try {
			setState(827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				match(T_COMMA);
				setState(825);
				create_table_preoptions_td_item();
				}
				break;
			case T_LOCATION:
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(826);
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
		enterRule(_localctx, 74, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(829);
				match(T_NO);
				}
			}

			setState(832);
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
		enterRule(_localctx, 76, RULE_create_table_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(834);
				create_table_options_item();
				}
				}
				setState(837); 
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
		enterRule(_localctx, 78, RULE_create_table_options_item);
		int _la;
		try {
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				match(T_ON);
				setState(840);
				match(T_COMMIT);
				setState(841);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(842);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(845);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(846);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(847);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(848);
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
		enterRule(_localctx, 80, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				match(T_SEGMENT);
				setState(852);
				match(T_CREATION);
				setState(853);
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
				setState(854);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(855);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(856);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(857);
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
				setState(858);
				match(T_STORAGE);
				setState(859);
				match(T_OPEN_P);
				setState(862); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(862);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(860);
						ident();
						}
						break;
					case L_INT:
						{
						setState(861);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(864); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==L_ID || _la==L_INT );
				setState(866);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(867);
				match(T_TABLESPACE);
				setState(868);
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
		enterRule(_localctx, 82, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(871);
					match(T_INDEX);
					}
				}

				setState(874);
				match(T_IN);
				setState(875);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
				match(T_WITH);
				setState(877);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				match(T_DISTRIBUTE);
				setState(879);
				match(T_BY);
				setState(880);
				match(T_HASH);
				setState(881);
				match(T_OPEN_P);
				setState(882);
				ident();
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(883);
					match(T_COMMA);
					setState(884);
					ident();
					}
					}
					setState(889);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(890);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(892);
					match(T_NOT);
					}
				}

				setState(895);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(896);
				match(T_COMPRESS);
				setState(897);
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
				setState(898);
				match(T_DEFINITION);
				setState(899);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(900);
				match(T_WITH);
				setState(901);
				match(T_RESTRICT);
				setState(902);
				match(T_ON);
				setState(903);
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
		enterRule(_localctx, 84, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(906);
					match(T_UNIQUE);
					}
				}

				setState(909);
				match(T_PRIMARY);
				setState(910);
				match(T_INDEX);
				setState(911);
				match(T_OPEN_P);
				setState(912);
				ident();
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(913);
					match(T_COMMA);
					setState(914);
					ident();
					}
					}
					setState(919);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(920);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				match(T_WITH);
				setState(923);
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
		enterRule(_localctx, 86, RULE_create_table_options_hive_item);
		try {
			setState(932);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				match(T_STORED);
				setState(928);
				match(T_AS);
				setState(929);
				ident();
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(930);
				match(T_LOCATION);
				setState(931);
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
		enterRule(_localctx, 88, RULE_create_table_hive_row_format);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(T_ROW);
			setState(935);
			match(T_FORMAT);
			setState(936);
			match(T_DELIMITED);
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COLLECTION || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (T_FIELDS - 107)) | (1L << (T_LINES - 107)) | (1L << (T_MAP - 107)))) != 0) || _la==T_NULL) {
				{
				{
				setState(937);
				create_table_hive_row_format_fields();
				}
				}
				setState(942);
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
		enterRule(_localctx, 90, RULE_create_table_hive_row_format_fields);
		int _la;
		try {
			setState(970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(943);
				match(T_FIELDS);
				setState(944);
				match(T_TERMINATED);
				setState(945);
				match(T_BY);
				setState(946);
				expr(0);
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ESCAPED) {
					{
					setState(947);
					match(T_ESCAPED);
					setState(948);
					match(T_BY);
					setState(949);
					expr(0);
					}
				}

				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				match(T_COLLECTION);
				setState(953);
				match(T_ITEMS);
				setState(954);
				match(T_TERMINATED);
				setState(955);
				match(T_BY);
				setState(956);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(957);
				match(T_MAP);
				setState(958);
				match(T_KEYS);
				setState(959);
				match(T_TERMINATED);
				setState(960);
				match(T_BY);
				setState(961);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(962);
				match(T_LINES);
				setState(963);
				match(T_TERMINATED);
				setState(964);
				match(T_BY);
				setState(965);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(966);
				match(T_NULL);
				setState(967);
				match(T_DEFINED);
				setState(968);
				match(T_AS);
				setState(969);
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
		enterRule(_localctx, 92, RULE_create_table_options_mssql_item);
		try {
			setState(976);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				match(T_ON);
				setState(973);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				match(T_TEXTIMAGE_ON);
				setState(975);
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
		enterRule(_localctx, 94, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(1005);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				match(T_AUTO_INCREMENT);
				setState(980);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(979);
					match(T_EQUAL);
					}
					break;
				}
				setState(982);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				match(T_COMMENT);
				setState(985);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(984);
					match(T_EQUAL);
					}
					break;
				}
				setState(987);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(988);
					match(T_DEFAULT);
					}
				}

				setState(994);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(991);
					match(T_CHARACTER);
					setState(992);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(993);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(997);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(996);
					match(T_EQUAL);
					}
					break;
				}
				setState(999);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1000);
				match(T_ENGINE);
				setState(1002);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(1001);
					match(T_EQUAL);
					}
					break;
				}
				setState(1004);
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
		enterRule(_localctx, 96, RULE_dtype);
		int _la;
		try {
			setState(1053);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
				match(T_CHAR);
				}
				break;
			case T_BIGINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				match(T_BIGINT);
				}
				break;
			case T_BINARY_DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1009);
				match(T_BINARY_DOUBLE);
				}
				break;
			case T_BINARY_FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1010);
				match(T_BINARY_FLOAT);
				}
				break;
			case T_BINARY_INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1011);
				match(T_BINARY_INTEGER);
				}
				break;
			case T_BIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1012);
				match(T_BIT);
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1013);
				match(T_DATE);
				}
				break;
			case T_DATETIME:
				enterOuterAlt(_localctx, 8);
				{
				setState(1014);
				match(T_DATETIME);
				}
				break;
			case T_DEC:
				enterOuterAlt(_localctx, 9);
				{
				setState(1015);
				match(T_DEC);
				}
				break;
			case T_DECIMAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(1016);
				match(T_DECIMAL);
				}
				break;
			case T_DOUBLE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1017);
				match(T_DOUBLE);
				setState(1019);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(1018);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 12);
				{
				setState(1021);
				match(T_FLOAT);
				}
				break;
			case T_INT:
				enterOuterAlt(_localctx, 13);
				{
				setState(1022);
				match(T_INT);
				}
				break;
			case T_INT2:
				enterOuterAlt(_localctx, 14);
				{
				setState(1023);
				match(T_INT2);
				}
				break;
			case T_INT4:
				enterOuterAlt(_localctx, 15);
				{
				setState(1024);
				match(T_INT4);
				}
				break;
			case T_INT8:
				enterOuterAlt(_localctx, 16);
				{
				setState(1025);
				match(T_INT8);
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 17);
				{
				setState(1026);
				match(T_INTEGER);
				}
				break;
			case T_NCHAR:
				enterOuterAlt(_localctx, 18);
				{
				setState(1027);
				match(T_NCHAR);
				}
				break;
			case T_NVARCHAR:
				enterOuterAlt(_localctx, 19);
				{
				setState(1028);
				match(T_NVARCHAR);
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 20);
				{
				setState(1029);
				match(T_NUMBER);
				}
				break;
			case T_NUMERIC:
				enterOuterAlt(_localctx, 21);
				{
				setState(1030);
				match(T_NUMERIC);
				}
				break;
			case T_PLS_INTEGER:
				enterOuterAlt(_localctx, 22);
				{
				setState(1031);
				match(T_PLS_INTEGER);
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 23);
				{
				setState(1032);
				match(T_REAL);
				}
				break;
			case T_RESULT_SET_LOCATOR:
				enterOuterAlt(_localctx, 24);
				{
				setState(1033);
				match(T_RESULT_SET_LOCATOR);
				setState(1034);
				match(T_VARYING);
				}
				break;
			case T_SIMPLE_FLOAT:
				enterOuterAlt(_localctx, 25);
				{
				setState(1035);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case T_SIMPLE_DOUBLE:
				enterOuterAlt(_localctx, 26);
				{
				setState(1036);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case T_SIMPLE_INTEGER:
				enterOuterAlt(_localctx, 27);
				{
				setState(1037);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case T_SMALLINT:
				enterOuterAlt(_localctx, 28);
				{
				setState(1038);
				match(T_SMALLINT);
				}
				break;
			case T_SMALLDATETIME:
				enterOuterAlt(_localctx, 29);
				{
				setState(1039);
				match(T_SMALLDATETIME);
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 30);
				{
				setState(1040);
				match(T_STRING);
				}
				break;
			case T_SYS_REFCURSOR:
				enterOuterAlt(_localctx, 31);
				{
				setState(1041);
				match(T_SYS_REFCURSOR);
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 32);
				{
				setState(1042);
				match(T_TIMESTAMP);
				}
				break;
			case T_TINYINT:
				enterOuterAlt(_localctx, 33);
				{
				setState(1043);
				match(T_TINYINT);
				}
				break;
			case T_VARCHAR:
				enterOuterAlt(_localctx, 34);
				{
				setState(1044);
				match(T_VARCHAR);
				}
				break;
			case T_VARCHAR2:
				enterOuterAlt(_localctx, 35);
				{
				setState(1045);
				match(T_VARCHAR2);
				}
				break;
			case T_XML:
				enterOuterAlt(_localctx, 36);
				{
				setState(1046);
				match(T_XML);
				}
				break;
			case T_VOID:
				enterOuterAlt(_localctx, 37);
				{
				setState(1047);
				match(T_VOID);
				}
				break;
			case L_ID:
				enterOuterAlt(_localctx, 38);
				{
				setState(1048);
				ident();
				setState(1051);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(1049);
					match(T__0);
					setState(1050);
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
		enterRule(_localctx, 98, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(T_OPEN_P);
			setState(1056);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1057);
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

			setState(1062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1060);
				match(T_COMMA);
				setState(1061);
				match(L_INT);
				}
			}

			setState(1064);
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
		enterRule(_localctx, 100, RULE_dtype_attr);
		int _la;
		try {
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1066);
					match(T_NOT);
					}
				}

				setState(1069);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				match(T_CHARACTER);
				setState(1071);
				match(T_SET);
				setState(1072);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1073);
					match(T_NOT);
					}
				}

				setState(1076);
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
		enterRule(_localctx, 102, RULE_dtype_default);
		int _la;
		try {
			setState(1091);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1079);
					match(T_COLON);
					}
				}

				setState(1082);
				match(T_EQUAL);
				setState(1083);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1084);
					match(T_WITH);
					}
				}

				setState(1087);
				match(T_DEFAULT);
				setState(1089);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1088);
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
		enterRule(_localctx, 104, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1093);
				match(T_CREATE);
				setState(1094);
				_la = _input.LA(1);
				if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1098);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1095);
					match(T_IF);
					setState(1096);
					match(T_NOT);
					setState(1097);
					match(T_EXISTS);
					}
					break;
				}
				setState(1100);
				expr(0);
				setState(1104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1101);
						create_database_option();
						}
						} 
					}
					setState(1106);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1107);
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
		enterRule(_localctx, 106, RULE_create_database_option);
		try {
			setState(1114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				match(T_COMMENT);
				setState(1111);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				match(T_LOCATION);
				setState(1113);
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
		enterRule(_localctx, 108, RULE_error_create_database_stmt);
		int _la;
		try {
			int _alt;
			setState(1156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1116);
				match(T_CREATE);
				setState(1120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1117);
					match(T_IF);
					setState(1118);
					match(T_NOT);
					setState(1119);
					match(T_EXISTS);
					}
					break;
				}
				setState(1122);
				expr(0);
				setState(1126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1123);
						create_database_option();
						}
						} 
					}
					setState(1128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1129);
				_la = _input.LA(1);
				if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1130);
					match(T_IF);
					setState(1131);
					match(T_NOT);
					setState(1132);
					match(T_EXISTS);
					}
					break;
				}
				setState(1135);
				expr(0);
				setState(1139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1136);
						create_database_option();
						}
						} 
					}
					setState(1141);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1142);
				_la = _input.LA(1);
				if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1143);
				match(T_CREATE);
				setState(1147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1144);
					match(T_IF);
					setState(1145);
					match(T_NOT);
					setState(1146);
					match(T_EXISTS);
					}
					break;
				}
				setState(1149);
				expr(0);
				setState(1153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1150);
						create_database_option();
						}
						} 
					}
					setState(1155);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
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
		public Return_paramContext return_param() {
			return getRuleContext(Return_paramContext.class,0);
		}
		public Cpp_smtContext cpp_smt() {
			return getRuleContext(Cpp_smtContext.class,0);
		}
		public Def_returnContext def_return() {
			return getRuleContext(Def_returnContext.class,0);
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
		enterRule(_localctx, 110, RULE_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			FunChild = new ArrayList<>();
			setState(1159);
			dtype();
			setState(1160);
			ident();
			setState(1161);
			match(T_OPEN_P);
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T_BIGINT - 19)) | (1L << (T_BINARY_DOUBLE - 19)) | (1L << (T_BINARY_FLOAT - 19)) | (1L << (T_BINARY_INTEGER - 19)) | (1L << (T_BIT - 19)) | (1L << (T_CHAR - 19)) | (1L << (T_DATE - 19)) | (1L << (T_DATETIME - 19)) | (1L << (T_DEC - 19)) | (1L << (T_DECIMAL - 19)))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T_DOUBLE - 87)) | (1L << (T_INT2 - 87)) | (1L << (T_INT4 - 87)) | (1L << (T_INT8 - 87)) | (1L << (T_INTEGER - 87)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (T_NCHAR - 179)) | (1L << (T_NVARCHAR - 179)) | (1L << (T_NUMERIC - 179)) | (1L << (T_NUMBER - 179)) | (1L << (T_PLS_INTEGER - 179)) | (1L << (T_REAL - 179)) | (1L << (T_RESULT_SET_LOCATOR - 179)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SIMPLE_INTEGER - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TINYINT - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_XML - 256)) | (1L << (T_VOID - 256)))) != 0) || ((((_la - 364)) & ~0x3f) == 0 && ((1L << (_la - 364)) & ((1L << (L_ID - 364)) | (1L << (T_FLOAT - 364)) | (1L << (T_INT - 364)) | (1L << (T_STRING - 364)))) != 0)) {
				{
				setState(1162);
				return_param();
				}
			}

			setState(1165);
			match(T_CLOSE_P);
			setState(1166);
			match(T_OPEN_B);
			setState(1168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1167);
				cpp_smt(0);
				}
				break;
			}
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_RETURN) {
				{
				setState(1170);
				def_return();
				}
			}

			setState(1173);
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
		enterRule(_localctx, 112, RULE_def_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(T_RETURN);
			setState(1176);
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
		enterRule(_localctx, 114, RULE_return_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			return_param_item();
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1179);
				match(T_COMMA);
				setState(1180);
				return_param_item();
				}
				}
				setState(1185);
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
		enterRule(_localctx, 116, RULE_return_param_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			dtype();
			setState(1187);
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_cpp_smt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						_localctx = new Cpp_smtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cpp_smt);
						setState(1190);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1191);
						cpp_if_stmt();
						}
						break;
					case 2:
						{
						_localctx = new Cpp_smtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cpp_smt);
						setState(1192);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1193);
						((Cpp_smtContext)_localctx).cpp_for_stmt = cpp_for_stmt();
						FunChild.add(((Cpp_smtContext)_localctx).cpp_for_stmt.forNode);
						}
						break;
					case 3:
						{
						_localctx = new Cpp_smtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cpp_smt);
						setState(1196);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1197);
						cpp_assignment_stmt();
						}
						break;
					case 4:
						{
						_localctx = new Cpp_smtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cpp_smt);
						setState(1198);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1199);
						((Cpp_smtContext)_localctx).cpp_var_decleration = cpp_var_decleration();
						FunChild.add(((Cpp_smtContext)_localctx).cpp_var_decleration.VarDecNode);
						}
						break;
					case 5:
						{
						_localctx = new Cpp_smtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cpp_smt);
						setState(1202);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1203);
						((Cpp_smtContext)_localctx).select_stmt = select_stmt();
						FunChild.add(((Cpp_smtContext)_localctx).select_stmt.b);
						}
						break;
					case 6:
						{
						_localctx = new Cpp_smtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cpp_smt);
						setState(1206);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1207);
						((Cpp_smtContext)_localctx).create_table_stmt = create_table_stmt();
						FunChild.add(((Cpp_smtContext)_localctx).create_table_stmt.tableNode);
						}
						break;
					}
					} 
				}
				setState(1214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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
		enterRule(_localctx, 120, RULE_cpp_smt_for);
		try {
			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1216);
				cpp_smt(0);
				setState(1217);
				cpp_if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1219);
				cpp_smt(0);
				setState(1220);
				((Cpp_smt_forContext)_localctx).cpp_for_stmt = cpp_for_stmt();
				ForChild.add(((Cpp_smt_forContext)_localctx).cpp_for_stmt.forNode);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1223);
				cpp_smt(0);
				setState(1224);
				cpp_assignment_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1226);
				cpp_smt(0);
				setState(1227);
				((Cpp_smt_forContext)_localctx).cpp_var_decleration = cpp_var_decleration();
				ForChild.add(((Cpp_smt_forContext)_localctx).cpp_var_decleration.VarDecNode);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1230);
				cpp_smt(0);
				setState(1231);
				((Cpp_smt_forContext)_localctx).select_stmt = select_stmt();
				ForChild.add(((Cpp_smt_forContext)_localctx).select_stmt.b);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1234);
				cpp_smt(0);
				setState(1235);
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
		enterRule(_localctx, 122, RULE_cpp_if_stmt);
		int _la;
		try {
			int _alt;
			setState(1284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1240);
				match(T_IF);
				setState(1241);
				match(T_OPEN_P);
				{
				setState(1242);
				ifex();
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_PIPE || _la==T_AND_AND) {
					{
					{
					setState(1243);
					_la = _input.LA(1);
					if ( !(_la==T_PIPE || _la==T_AND_AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1244);
					ifex();
					}
					}
					setState(1249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1250);
				match(T_CLOSE_P);
				setState(1251);
				cpp_smt(0);
				setState(1255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1252);
						def_else_if();
						}
						} 
					}
					setState(1257);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				}
				setState(1259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1258);
					def_else();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1261);
				match(T_IF);
				setState(1262);
				match(T_OPEN_P);
				{
				setState(1263);
				ifex();
				setState(1268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_PIPE || _la==T_AND_AND) {
					{
					{
					setState(1264);
					_la = _input.LA(1);
					if ( !(_la==T_PIPE || _la==T_AND_AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1265);
					ifex();
					}
					}
					setState(1270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1271);
				match(T_CLOSE_P);
				setState(1272);
				match(T_OPEN_B);
				setState(1273);
				cpp_smt(0);
				setState(1274);
				match(T_CLOSE_B);
				setState(1278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1275);
						def_else_if();
						}
						} 
					}
					setState(1280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				}
				setState(1282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1281);
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
		enterRule(_localctx, 124, RULE_def_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			match(T_ELSE);
			setState(1287);
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
		enterRule(_localctx, 126, RULE_def_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			match(T_ELSE);
			setState(1290);
			match(T_OPEN_B);
			setState(1291);
			cpp_smt(0);
			setState(1292);
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
		enterRule(_localctx, 128, RULE_ifex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			ident();
			setState(1295);
			op();
			setState(1298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(1296);
				ident();
				}
				break;
			case L_INT:
				{
				setState(1297);
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
		enterRule(_localctx, 130, RULE_op);
		try {
			setState(1312);
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
				setState(1301);
				match(T_EQUAL2);
				}
				break;
			case T_AND_AND:
				enterOuterAlt(_localctx, 3);
				{
				setState(1302);
				match(T_AND_AND);
				}
				break;
			case T_PIPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1303);
				match(T_PIPE);
				}
				break;
			case T_EQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1304);
				match(T_EQUAL);
				}
				break;
			case T_ADD:
				enterOuterAlt(_localctx, 6);
				{
				setState(1305);
				match(T_ADD);
				}
				break;
			case T_SUB:
				enterOuterAlt(_localctx, 7);
				{
				setState(1306);
				match(T_SUB);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 8);
				{
				setState(1307);
				match(T_NOTEQUAL2);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 9);
				{
				setState(1308);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(1309);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 11);
				{
				setState(1310);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 12);
				{
				setState(1311);
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public New_select_stmtContext new_select_stmt() {
			return getRuleContext(New_select_stmtContext.class,0);
		}
		public Call_stmtContext call_stmt() {
			return getRuleContext(Call_stmtContext.class,0);
		}
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
		enterRule(_localctx, 132, RULE_cpp_assignment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			ident();
			setState(1315);
			match(T_EQUAL);
			setState(1320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1316);
				ident();
				}
				break;
			case 2:
				{
				setState(1317);
				number();
				}
				break;
			case 3:
				{
				setState(1318);
				new_select_stmt();
				}
				break;
			case 4:
				{
				setState(1319);
				call_stmt();
				}
				break;
			}
			setState(1322);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode L_DEC() { return getToken(HplsqlParser.L_DEC, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
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
		enterRule(_localctx, 136, RULE_cpp_var_decleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			((Cpp_var_declerationContext)_localctx).dtype = dtype();
			setState(1327);
			((Cpp_var_declerationContext)_localctx).ident = ident();
			setState(1328);
			match(T_SEMICOLON);

			                                        if(types.find_typ((((Cpp_var_declerationContext)_localctx).dtype!=null?_input.getText(((Cpp_var_declerationContext)_localctx).dtype.start,((Cpp_var_declerationContext)_localctx).dtype.stop):null))){
			                                            ((Cpp_var_declerationContext)_localctx).VarDecNode =  new VarDecleration((((Cpp_var_declerationContext)_localctx).ident!=null?_input.getText(((Cpp_var_declerationContext)_localctx).ident.start,((Cpp_var_declerationContext)_localctx).ident.stop):null),(((Cpp_var_declerationContext)_localctx).dtype!=null?_input.getText(((Cpp_var_declerationContext)_localctx).dtype.start,((Cpp_var_declerationContext)_localctx).dtype.stop):null));

			                                        }else{
			                                            ((Cpp_var_declerationContext)_localctx).VarDecNode = null;

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
		enterRule(_localctx, 138, RULE_cpp_for_stmt);
		int _la;
		try {
			setState(1360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				ForChild = new ArrayList<>();
				setState(1332);
				match(T_FOR);
				setState(1333);
				match(T_OPEN_P);
				setState(1334);
				((Cpp_for_stmtContext)_localctx).forhead1 = forhead1();
				setState(1335);
				match(T_SEMICOLON);
				setState(1336);
				ident();
				setState(1337);
				((Cpp_for_stmtContext)_localctx).bool_expr_binary_operator = bool_expr_binary_operator();
				setState(1344);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_INT:
					{
					setState(1338);
					match(L_INT);
					}
					break;
				case L_ID:
					{
					setState(1339);
					ident();
					setState(1342);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_DOT) {
						{
						setState(1340);
						match(T_DOT);
						setState(1341);
						ident();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1346);
				match(T_SEMICOLON);
				setState(1347);
				((Cpp_for_stmtContext)_localctx).for_inc_dec = for_inc_dec();
				setState(1348);
				match(T_CLOSE_P);
				setState(1349);
				match(T_OPEN_B);
				setState(1350);
				cpp_smt_for();
				setState(1351);
				match(T_CLOSE_B);

				                ((Cpp_for_stmtContext)_localctx).forNode =  new ForNode((((Cpp_for_stmtContext)_localctx).forhead1!=null?_input.getText(((Cpp_for_stmtContext)_localctx).forhead1.start,((Cpp_for_stmtContext)_localctx).forhead1.stop):null),(((Cpp_for_stmtContext)_localctx).bool_expr_binary_operator!=null?_input.getText(((Cpp_for_stmtContext)_localctx).bool_expr_binary_operator.start,((Cpp_for_stmtContext)_localctx).bool_expr_binary_operator.stop):null),(((Cpp_for_stmtContext)_localctx).for_inc_dec!=null?_input.getText(((Cpp_for_stmtContext)_localctx).for_inc_dec.start,((Cpp_for_stmtContext)_localctx).for_inc_dec.stop):null));
				                _localctx.forNode.setNodeName("FOR");
				                _localctx.forNode.setForChiled(ForChild);



				            
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1354);
				match(T_FOR);
				setState(1355);
				match(T_OPEN_P);
				setState(1356);
				match(T_SEMICOLON);
				setState(1357);
				match(T_SEMICOLON);
				setState(1358);
				match(T_CLOSE_P);
				setState(1359);
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
		enterRule(_localctx, 140, RULE_for_inc_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				{
				setState(1362);
				ident();
				setState(1363);
				match(T_ADD);
				setState(1364);
				match(T_ADD);
				}
				}
				break;
			case 2:
				{
				{
				setState(1366);
				ident();
				setState(1367);
				match(T_SUB);
				setState(1368);
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
		enterRule(_localctx, 142, RULE_forhead1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1372);
				dtype();
				}
				break;
			}
			setState(1375);
			ident();
			}
			setState(1377);
			match(T_EQUAL);
			setState(1380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_INT:
				{
				setState(1378);
				match(L_INT);
				}
				break;
			case L_ID:
				{
				setState(1379);
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
		enterRule(_localctx, 144, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1382);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1383);
				match(T_CREATE);
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1384);
					match(T_OR);
					setState(1385);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1388);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
			}
			setState(1391);
			match(T_FUNCTION);
			setState(1392);
			ident();
			setState(1394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1393);
				create_routine_params();
				}
				break;
			}
			setState(1396);
			create_function_return();
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS || _la==T_IS) {
				{
				setState(1397);
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

			setState(1401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1400);
				declare_block_inplace();
				}
				break;
			}
			setState(1403);
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
		enterRule(_localctx, 146, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1406);
			dtype();
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1407);
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
		enterRule(_localctx, 148, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1410);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1411);
				match(T_CREATE);
				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1412);
					match(T_OR);
					setState(1413);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1416);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1419);
			match(T_PACKAGE);
			setState(1420);
			ident();
			setState(1421);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1422);
			package_spec();
			setState(1423);
			match(T_END);
			setState(1427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1424);
				ident();
				setState(1425);
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
		enterRule(_localctx, 150, RULE_package_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			package_spec_item();
			setState(1430);
			match(T_SEMICOLON);
			setState(1436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_CONTINUE || _la==T_CURSOR || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (T_EXIT - 103)) | (1L << (T_FUNCTION - 103)) | (1L << (T_GLOBAL - 103)))) != 0) || _la==T_PROC || _la==T_PROCEDURE || _la==T_TEMPORARY || _la==L_ID) {
				{
				{
				setState(1431);
				package_spec_item();
				setState(1432);
				match(T_SEMICOLON);
				}
				}
				setState(1438);
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
		enterRule(_localctx, 152, RULE_package_spec_item);
		int _la;
		try {
			setState(1452);
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
				setState(1439);
				declare_stmt_item();
				}
				break;
			case T_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440);
				match(T_FUNCTION);
				setState(1441);
				ident();
				setState(1443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1442);
					create_routine_params();
					}
					break;
				}
				setState(1445);
				create_function_return();
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1447);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1448);
				ident();
				setState(1450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1449);
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
		enterRule(_localctx, 154, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1454);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1455);
				match(T_CREATE);
				setState(1458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1456);
					match(T_OR);
					setState(1457);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1460);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1463);
			match(T_PACKAGE);
			setState(1464);
			match(T_BODY);
			setState(1465);
			ident();
			setState(1466);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1467);
			package_body();
			setState(1468);
			match(T_END);
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1469);
				ident();
				setState(1470);
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
		enterRule(_localctx, 156, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			package_body_item();
			setState(1475);
			match(T_SEMICOLON);
			setState(1481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ALTER) | (1L << T_CONTINUE) | (1L << T_CREATE) | (1L << T_CURSOR))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (T_EXIT - 103)) | (1L << (T_FUNCTION - 103)) | (1L << (T_GLOBAL - 103)))) != 0) || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (T_PROC - 213)) | (1L << (T_PROCEDURE - 213)) | (1L << (T_REPLACE - 213)))) != 0) || _la==T_TEMPORARY || _la==L_ID) {
				{
				{
				setState(1476);
				package_body_item();
				setState(1477);
				match(T_SEMICOLON);
				}
				}
				setState(1483);
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
		enterRule(_localctx, 158, RULE_package_body_item);
		try {
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1484);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1485);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1486);
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
		enterRule(_localctx, 160, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1489);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1490);
				match(T_CREATE);
				setState(1493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1491);
					match(T_OR);
					setState(1492);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1495);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1498);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1499);
			ident();
			setState(1501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1500);
				create_routine_params();
				}
				break;
			}
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DYNAMIC || _la==T_LANGUAGE || _la==T_RESULT || _la==T_SQL) {
				{
				setState(1503);
				create_routine_options();
				}
			}

			setState(1507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS || _la==T_IS) {
				{
				setState(1506);
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

			setState(1510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1509);
				declare_block_inplace();
				}
				break;
			}
			setState(1513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1512);
				label();
				}
				break;
			}
			setState(1515);
			proc_block();
			setState(1519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1516);
				ident();
				setState(1517);
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
		enterRule(_localctx, 162, RULE_create_routine_params);
		int _la;
		try {
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				match(T_OPEN_P);
				setState(1522);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1523);
				match(T_OPEN_P);
				setState(1524);
				create_routine_param_item();
				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1525);
					match(T_COMMA);
					setState(1526);
					create_routine_param_item();
					}
					}
					setState(1531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1532);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1534);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
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
		enterRule(_localctx, 164, RULE_create_routine_param_item);
		int _la;
		try {
			setState(1587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1545);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1546);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1547);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1548);
					match(T_IN);
					setState(1549);
					match(T_OUT);
					}
					break;
				}
				setState(1552);
				ident();
				setState(1553);
				dtype();
				setState(1555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1554);
					dtype_len();
					}
				}

				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_CASESPECIFIC) | (1L << T_CHARACTER) | (1L << T_CS))) != 0) || _la==T_NOT || _la==T_NULL) {
					{
					{
					setState(1557);
					dtype_attr();
					}
					}
					setState(1562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT || ((((_la - 307)) & ~0x3f) == 0 && ((1L << (_la - 307)) & ((1L << (T_WITH - 307)) | (1L << (T_COLON - 307)) | (1L << (T_EQUAL - 307)))) != 0)) {
					{
					setState(1563);
					dtype_default();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1566);
				ident();
				setState(1572);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1567);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1568);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1569);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1570);
					match(T_IN);
					setState(1571);
					match(T_OUT);
					}
					break;
				}
				setState(1574);
				dtype();
				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1575);
					dtype_len();
					}
				}

				setState(1581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_CASESPECIFIC) | (1L << T_CHARACTER) | (1L << T_CS))) != 0) || _la==T_NOT || _la==T_NULL) {
					{
					{
					setState(1578);
					dtype_attr();
					}
					}
					setState(1583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT || ((((_la - 307)) & ~0x3f) == 0 && ((1L << (_la - 307)) & ((1L << (T_WITH - 307)) | (1L << (T_COLON - 307)) | (1L << (T_EQUAL - 307)))) != 0)) {
					{
					setState(1584);
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
		enterRule(_localctx, 166, RULE_create_routine_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1589);
				create_routine_option();
				}
				}
				setState(1592); 
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
		enterRule(_localctx, 168, RULE_create_routine_option);
		int _la;
		try {
			setState(1605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1594);
				match(T_LANGUAGE);
				setState(1595);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1596);
				match(T_SQL);
				setState(1597);
				match(T_SECURITY);
				setState(1598);
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
				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1599);
					match(T_DYNAMIC);
					}
				}

				setState(1602);
				match(T_RESULT);
				setState(1603);
				match(T_SETS);
				setState(1604);
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
		enterRule(_localctx, 170, RULE_collect_stats_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			match(T_COLUMN);
			setState(1608);
			match(T_OPEN_P);
			setState(1609);
			ident();
			setState(1614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1610);
				match(T_COMMA);
				setState(1611);
				ident();
				}
				}
				setState(1616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1617);
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
		enterRule(_localctx, 172, RULE_cmp_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(1619);
				table_name();
				setState(1621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WHERE) {
					{
					setState(1620);
					where_clause();
					}
				}

				}
				break;
			case T_OPEN_P:
				{
				setState(1623);
				match(T_OPEN_P);
				setState(1624);
				select_stmt();
				setState(1625);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AT) {
				{
				setState(1629);
				match(T_AT);
				setState(1630);
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
		enterRule(_localctx, 174, RULE_copy_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1633);
				file_name();
				}
				break;
			case 2:
				{
				setState(1634);
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
		enterRule(_localctx, 176, RULE_copy_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1637);
				file_name();
				}
				break;
			case 2:
				{
				setState(1638);
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
		enterRule(_localctx, 178, RULE_copy_option);
		try {
			setState(1649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1641);
				match(T_AT);
				setState(1642);
				ident();
				}
				break;
			case T_BATCHSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1643);
				match(T_BATCHSIZE);
				setState(1644);
				expr(0);
				}
				break;
			case T_DELIMITER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1645);
				match(T_DELIMITER);
				setState(1646);
				expr(0);
				}
				break;
			case T_SQLINSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1647);
				match(T_SQLINSERT);
				setState(1648);
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
		enterRule(_localctx, 180, RULE_copy_file_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
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
		enterRule(_localctx, 182, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			match(T_CREATE);
			setState(1655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1654);
				match(T_UNIQUE);
				}
			}

			setState(1657);
			match(T_INDEX);
			setState(1658);
			ident();
			setState(1659);
			match(T_ON);
			setState(1660);
			table_name();
			setState(1661);
			match(T_OPEN_P);
			setState(1662);
			create_index_col();
			setState(1667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1663);
				match(T_COMMA);
				setState(1664);
				create_index_col();
				}
				}
				setState(1669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1670);
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
		enterRule(_localctx, 184, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			ident();
			setState(1674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(1673);
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
		enterRule(_localctx, 186, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
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
		enterRule(_localctx, 188, RULE_index_mssql_storage_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			match(T_WITH);
			setState(1679);
			match(T_OPEN_P);
			setState(1680);
			ident();
			setState(1681);
			match(T_EQUAL);
			setState(1682);
			ident();
			setState(1690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1683);
				match(T_COMMA);
				setState(1684);
				ident();
				setState(1685);
				match(T_EQUAL);
				setState(1686);
				ident();
				}
				}
				setState(1692);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1693);
			match(T_CLOSE_P);
			setState(1697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ON || _la==T_TEXTIMAGE_ON) {
				{
				{
				setState(1694);
				create_table_options_mssql_item();
				}
				}
				setState(1699);
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
		enterRule(_localctx, 190, RULE_set_session_option);
		try {
			setState(1703);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_SCHEMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1700);
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
				setState(1701);
				set_mssql_session_option();
				}
				break;
			case T_QUERY_BAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(1702);
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
		enterRule(_localctx, 192, RULE_set_current_schema_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_SCHEMA:
				{
				{
				setState(1706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CURRENT) {
					{
					setState(1705);
					match(T_CURRENT);
					}
				}

				setState(1708);
				match(T_SCHEMA);
				}
				}
				break;
			case T_CURRENT_SCHEMA:
				{
				setState(1709);
				match(T_CURRENT_SCHEMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1712);
				match(T_EQUAL);
				}
				break;
			}
			setState(1715);
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
		enterRule(_localctx, 194, RULE_set_mssql_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			_la = _input.LA(1);
			if ( !(_la==T_ANSI_NULLS || _la==T_ANSI_PADDING || _la==T_NOCOUNT || _la==T_QUOTED_IDENTIFIER || _la==T_XACT_ABORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1718);
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
		enterRule(_localctx, 196, RULE_set_teradata_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			match(T_QUERY_BAND);
			setState(1721);
			match(T_EQUAL);
			setState(1724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1722);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1723);
				match(T_NONE);
				}
				break;
			}
			setState(1727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UPDATE) {
				{
				setState(1726);
				match(T_UPDATE);
				}
			}

			setState(1729);
			match(T_FOR);
			setState(1730);
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
		enterRule(_localctx, 198, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			match(T_WHILE);
			setState(1733);
			bool_expr(0);
			setState(1734);
			_la = _input.LA(1);
			if ( !(_la==T_BEGIN || _la==T_DO || _la==T_LOOP || _la==T_THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1735);
			block();
			setState(1736);
			match(T_END);
			setState(1738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1737);
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
		enterRule(_localctx, 200, RULE_label);
		try {
			setState(1746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1740);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1741);
				match(T_LESS);
				setState(1742);
				match(T_LESS);
				setState(1743);
				match(L_ID);
				setState(1744);
				match(T_GREATER);
				setState(1745);
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
		enterRule(_localctx, 202, RULE_using_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			match(T_USING);
			setState(1749);
			expr(0);
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1750);
				match(T_COMMA);
				setState(1751);
				expr(0);
				}
				}
				setState(1756);
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
		enterRule(_localctx, 204, RULE_new_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			match(T_SELECT);
			setState(1758);
			new_select_col();
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1759);
				match(T_COMMA);
				setState(1760);
				new_select_col();
				}
				}
				setState(1765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1766);
			match(T_FROM);
			setState(1767);
			new_from_table();
			setState(1771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (T_FULL - 115)) | (1L << (T_INNER - 115)) | (1L << (T_JOIN - 115)) | (1L << (T_LEFT - 115)))) != 0) || _la==T_RIGHT || _la==T_COMMA) {
				{
				{
				setState(1768);
				new_from_join_clause();
				}
				}
				setState(1773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WHERE) {
				{
				setState(1774);
				match(T_WHERE);
				setState(1775);
				new_where_condition();
				}
			}

			setState(1779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GROUP) {
				{
				setState(1778);
				group_by_clause();
				}
			}

			setState(1782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_HAVING) {
				{
				setState(1781);
				having_clause();
				}
			}

			setState(1785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(1784);
				order_by_clause();
				}
			}

			setState(1788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LIMIT || _la==T_WITH) {
				{
				setState(1787);
				select_options();
				}
			}

			setState(1790);
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
		enterRule(_localctx, 206, RULE_new_select_col);
		try {
			setState(1796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1792);
				select_list_asterisk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1793);
				col_func();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1794);
				tabledotcol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1795);
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
		enterRule(_localctx, 208, RULE_col_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			expr_agg_window_func();
			setState(1800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1799);
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
		enterRule(_localctx, 210, RULE_tabledotcol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			ident();
			setState(1803);
			match(T_DOT);
			setState(1804);
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
		enterRule(_localctx, 212, RULE_new_from_table);
		try {
			setState(1808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1806);
				from_table_name_clause();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1807);
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
		enterRule(_localctx, 214, RULE_new_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			match(T_OPEN_P);
			setState(1811);
			new_select_stmt();
			setState(1812);
			match(T_CLOSE_P);
			setState(1814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1813);
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
		enterRule(_localctx, 216, RULE_new_from_join_clause);
		try {
			setState(1823);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1816);
				match(T_COMMA);
				setState(1817);
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
				setState(1818);
				from_join_type_clause();
				setState(1819);
				new_from_table();
				setState(1820);
				match(T_ON);
				setState(1821);
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
		enterRule(_localctx, 218, RULE_new_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			table_name();
			setState(1826);
			match(T_DOT);
			setState(1827);
			ident();
			setState(1828);
			op();
			setState(1829);
			table_name();
			setState(1830);
			match(T_DOT);
			setState(1831);
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
		enterRule(_localctx, 220, RULE_new_where_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
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
		enterRule(_localctx, 222, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(1835);
				cte_select_stmt();
				}
			}

			setState(1838);
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
		enterRule(_localctx, 224, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			match(T_WITH);
			setState(1842);
			cte_select_stmt_item();
			setState(1847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1843);
				match(T_COMMA);
				setState(1844);
				cte_select_stmt_item();
				}
				}
				setState(1849);
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
		enterRule(_localctx, 226, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			ident();
			setState(1852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1851);
				cte_select_cols();
				}
			}

			setState(1854);
			match(T_AS);
			setState(1855);
			match(T_OPEN_P);
			setState(1856);
			fullselect_stmt();
			setState(1857);
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
		enterRule(_localctx, 228, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			match(T_OPEN_P);
			setState(1860);
			ident();
			setState(1865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1861);
				match(T_COMMA);
				setState(1862);
				ident();
				}
				}
				setState(1867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 230, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			((Fullselect_stmtContext)_localctx).fullselect_stmt_item = fullselect_stmt_item();
			setState(1876);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1871);
					fullselect_set_clause();
					setState(1872);
					((Fullselect_stmtContext)_localctx).fullselect_stmt_item = fullselect_stmt_item();
					}
					} 
				}
				setState(1878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
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
		enterRule(_localctx, 232, RULE_fullselect_stmt_item);
		try {
			setState(1888);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1881);
				((Fullselect_stmt_itemContext)_localctx).subselect_stmt = subselect_stmt();
				((Fullselect_stmt_itemContext)_localctx).b =  ((Fullselect_stmt_itemContext)_localctx).subselect_stmt.selNode;
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1884);
				match(T_OPEN_P);
				setState(1885);
				fullselect_stmt();
				setState(1886);
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
		enterRule(_localctx, 234, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(1902);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1890);
				match(T_UNION);
				setState(1892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1891);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1894);
				match(T_EXCEPT);
				setState(1896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1895);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1898);
				match(T_INTERSECT);
				setState(1900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1899);
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
		enterRule(_localctx, 236, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((Subselect_stmtContext)_localctx).selNode =  new SelectNode();
			setState(1905);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1906);
			((Subselect_stmtContext)_localctx).col = select_list();
			setState(1908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1907);
				into_clause();
				}
				break;
			}
			setState(1911);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1910);
				((Subselect_stmtContext)_localctx).from = ((Subselect_stmtContext)_localctx).from_clause = from_clause();
				}
				break;
			}
			setState(1914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1913);
				where_clause();
				}
				break;
			}
			setState(1917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1916);
				group_by_clause();
				}
				break;
			}
			setState(1921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1919);
				having_clause();
				}
				break;
			case 2:
				{
				setState(1920);
				qualify_clause();
				}
				break;
			}
			setState(1924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1923);
				order_by_clause();
				}
				break;
			}
			setState(1927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1926);
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
		enterRule(_localctx, 238, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1931);
				select_list_set();
				}
				break;
			}
			setState(1935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1934);
				select_list_limit();
				}
				break;
			}
			setState(1937);
			((Select_listContext)_localctx).c1 = select_list_item();
			((Select_listContext)_localctx).cols =  ((Select_listContext)_localctx).c1.col;
			setState(1945);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1939);
					match(T_COMMA);
					setState(1940);
					((Select_listContext)_localctx).c2 = select_list_item();
					_localctx.cols.addAll(((Select_listContext)_localctx).c2.col);
					}
					} 
				}
				setState(1947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
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
		enterRule(_localctx, 240, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1948);
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
		enterRule(_localctx, 242, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1950);
			match(T_TOP);
			setState(1951);
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
		enterRule(_localctx, 244, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1953);
					ident();
					setState(1954);
					match(T_EQUAL);
					}
					break;
				}
				setState(1958);
				((Select_list_itemContext)_localctx).expr = expr(0);
				setState(1960);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1959);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1962);
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
		enterRule(_localctx, 246, RULE_select_list_alias);
		int _la;
		try {
			setState(1976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1967);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(1969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1968);
					match(T_AS);
					}
				}

				setState(1971);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1972);
				match(T_OPEN_P);
				setState(1973);
				match(T_TITLE);
				setState(1974);
				match(L_S_STRING);
				setState(1975);
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
		enterRule(_localctx, 248, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(1978);
				match(L_ID);
				setState(1979);
				match(T_DOT);
				}
			}

			setState(1982);
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
		enterRule(_localctx, 250, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1984);
			match(T_INTO);
			setState(1985);
			ident();
			setState(1990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1986);
					match(T_COMMA);
					setState(1987);
					ident();
					}
					} 
				}
				setState(1992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
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
		enterRule(_localctx, 252, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1993);
			match(T_FROM);
			setState(1994);
			((From_clauseContext)_localctx).from_table_clause = from_table_clause();
			setState(1998);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1995);
					from_join_clause();
					}
					} 
				}
				setState(2000);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
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
		enterRule(_localctx, 254, RULE_from_table_clause);
		try {
			setState(2006);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2003);
				from_table_name_clause();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(2004);
				from_subselect_clause();
				}
				break;
			case T_TABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2005);
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
		enterRule(_localctx, 256, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			table_name();
			setState(2010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2009);
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
		enterRule(_localctx, 258, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
			match(T_OPEN_P);
			setState(2013);
			select_stmt();
			setState(2014);
			match(T_CLOSE_P);
			setState(2016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2015);
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
		enterRule(_localctx, 260, RULE_from_join_clause);
		try {
			setState(2025);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2018);
				match(T_COMMA);
				setState(2019);
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
				setState(2020);
				from_join_type_clause();
				setState(2021);
				from_table_clause();
				setState(2022);
				match(T_ON);
				setState(2023);
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
		enterRule(_localctx, 262, RULE_from_join_type_clause);
		int _la;
		try {
			setState(2036);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(2027);
					match(T_INNER);
					}
				}

				setState(2030);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2031);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(2032);
					match(T_OUTER);
					}
				}

				setState(2035);
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
		enterRule(_localctx, 264, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
			match(T_TABLE);
			setState(2039);
			match(T_OPEN_P);
			setState(2040);
			match(T_VALUES);
			setState(2041);
			from_table_values_row();
			setState(2046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2042);
				match(T_COMMA);
				setState(2043);
				from_table_values_row();
				}
				}
				setState(2048);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2049);
			match(T_CLOSE_P);
			setState(2051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2050);
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
		enterRule(_localctx, 266, RULE_from_table_values_row);
		int _la;
		try {
			setState(2065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2053);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2054);
				match(T_OPEN_P);
				setState(2055);
				expr(0);
				setState(2060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2056);
					match(T_COMMA);
					setState(2057);
					expr(0);
					}
					}
					setState(2062);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2063);
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
		enterRule(_localctx, 268, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(2069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS) {
				{
				setState(2068);
				match(T_AS);
				}
			}

			setState(2071);
			ident();
			setState(2082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(2072);
				match(T_OPEN_P);
				setState(2073);
				match(L_ID);
				setState(2078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2074);
					match(T_COMMA);
					setState(2075);
					match(L_ID);
					}
					}
					setState(2080);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2081);
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
		enterRule(_localctx, 270, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
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
		enterRule(_localctx, 272, RULE_where_clause);
		try {
			setState(2089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2086);
				error_where_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2087);
				match(T_WHERE);
				setState(2088);
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
		enterRule(_localctx, 274, RULE_error_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2091);
			match(T_WHERE);
			setState(2092);
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
		enterRule(_localctx, 276, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2094);
			match(T_GROUP);
			setState(2095);
			match(T_BY);
			setState(2096);
			expr(0);
			setState(2101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2097);
					match(T_COMMA);
					setState(2098);
					expr(0);
					}
					} 
				}
				setState(2103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
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
		enterRule(_localctx, 278, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			match(T_HAVING);
			setState(2105);
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
		enterRule(_localctx, 280, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2107);
			match(T_QUALIFY);
			setState(2108);
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
		enterRule(_localctx, 282, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2110);
			match(T_ORDER);
			setState(2111);
			match(T_BY);
			setState(2112);
			expr(0);
			setState(2114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(2113);
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
			setState(2123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2116);
					match(T_COMMA);
					setState(2117);
					expr(0);
					setState(2119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
					case 1:
						{
						setState(2118);
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
				setState(2125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
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
		enterRule(_localctx, 284, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2127); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2126);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2129); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
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
		enterRule(_localctx, 286, RULE_select_options_item);
		int _la;
		try {
			setState(2142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2131);
				match(T_LIMIT);
				setState(2132);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2133);
				match(T_WITH);
				setState(2134);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 239)) & ~0x3f) == 0 && ((1L << (_la - 239)) & ((1L << (T_RR - 239)) | (1L << (T_RS - 239)) | (1L << (T_UR - 239)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(2135);
					match(T_USE);
					setState(2136);
					match(T_AND);
					setState(2137);
					match(T_KEEP);
					setState(2138);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2139);
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
		int _startState = 288;
		enterRecursionRule(_localctx, 288, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(2146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2145);
					match(T_NOT);
					}
				}

				setState(2148);
				match(T_OPEN_P);
				setState(2149);
				bool_expr(0);
				setState(2150);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2152);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(2155);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(2156);
					bool_expr_logical_operator();
					setState(2157);
					bool_expr(3);
					}
					} 
				}
				setState(2163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
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
		enterRule(_localctx, 290, RULE_bool_expr_atom);
		try {
			setState(2167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2164);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2165);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2166);
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
		enterRule(_localctx, 292, RULE_bool_expr_unary);
		int _la;
		try {
			setState(2192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2169);
				expr(0);
				setState(2170);
				match(T_IS);
				setState(2172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2171);
					match(T_NOT);
					}
				}

				setState(2174);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2176);
				expr(0);
				setState(2177);
				match(T_BETWEEN);
				setState(2178);
				expr(0);
				setState(2179);
				match(T_AND);
				setState(2180);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
				match(T_EXISTS);
				setState(2186);
				match(T_OPEN_P);
				setState(2187);
				select_stmt();
				setState(2188);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2190);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2191);
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
		enterRule(_localctx, 294, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2194);
			expr(0);
			setState(2196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2195);
				match(T_NOT);
				}
			}

			setState(2198);
			match(T_IN);
			setState(2199);
			match(T_OPEN_P);
			setState(2209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				{
				setState(2200);
				expr(0);
				setState(2205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2201);
					match(T_COMMA);
					setState(2202);
					expr(0);
					}
					}
					setState(2207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(2208);
				select_stmt();
				}
				break;
			}
			setState(2211);
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
		enterRule(_localctx, 296, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			match(T_OPEN_P);
			setState(2214);
			expr(0);
			setState(2219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2215);
				match(T_COMMA);
				setState(2216);
				expr(0);
				}
				}
				setState(2221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2222);
			match(T_CLOSE_P);
			setState(2224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2223);
				match(T_NOT);
				}
			}

			setState(2226);
			match(T_IN);
			setState(2227);
			match(T_OPEN_P);
			setState(2228);
			select_stmt();
			setState(2229);
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
		enterRule(_localctx, 298, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2231);
			expr(0);
			setState(2232);
			bool_expr_binary_operator();
			setState(2233);
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
		enterRule(_localctx, 300, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
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
		enterRule(_localctx, 302, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2237);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2238);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2239);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(2240);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2241);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2242);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(2243);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2244);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2245);
					match(T_NOT);
					}
				}

				setState(2248);
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
		int _startState = 304;
		enterRecursionRule(_localctx, 304, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(2252);
				match(T_OPEN_P);
				setState(2253);
				select_stmt();
				setState(2254);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2256);
				match(T_OPEN_P);
				setState(2257);
				expr(0);
				setState(2258);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				{
				setState(2260);
				expr_interval();
				}
				break;
			case 5:
				{
				setState(2261);
				expr_concat();
				}
				break;
			case 6:
				{
				setState(2262);
				expr_case();
				}
				break;
			case 7:
				{
				setState(2263);
				expr_cursor_attribute();
				}
				break;
			case 8:
				{
				setState(2264);
				expr_agg_window_func();
				}
				break;
			case 9:
				{
				setState(2265);
				expr_spec_func();
				}
				break;
			case 10:
				{
				setState(2266);
				expr_func();
				}
				break;
			case 11:
				{
				setState(2267);
				expr_atom();
				}
				break;
			case 12:
				{
				setState(2268);
				ident();
				setState(2269);
				_la = _input.LA(1);
				if ( !(((((_la - 339)) & ~0x3f) == 0 && ((1L << (_la - 339)) & ((1L << (T_ADD - 339)) | (1L << (T_DIV - 339)) | (1L << (T_MUL - 339)) | (1L << (T_SUB - 339)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2270);
				match(T_EQUAL);
				setState(2271);
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
				setState(2273);
				match(T_MUL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2276);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2277);
						match(T_MUL);
						setState(2278);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2279);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2280);
						match(T_DIV);
						setState(2281);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2282);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2283);
						match(T_ADD);
						setState(2284);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2285);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2286);
						match(T_SUB);
						setState(2287);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2288);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(2289);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(2294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
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
		enterRule(_localctx, 306, RULE_colom_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2295);
			ident();
			setState(2297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2296);
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
		enterRule(_localctx, 308, RULE_expr_atom);
		try {
			setState(2311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2299);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2300);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2301);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2302);
				table_name();
				setState(2303);
				match(T_DOT);
				setState(2304);
				colom_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2306);
				ident();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2307);
				string();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2308);
				dec_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2309);
				int_number();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2310);
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
		enterRule(_localctx, 310, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2313);
			match(T_INTERVAL);
			setState(2314);
			expr(0);
			setState(2315);
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
		enterRule(_localctx, 312, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2317);
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
		enterRule(_localctx, 314, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2319);
			expr_concat_item();
			setState(2320);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2321);
			expr_concat_item();
			setState(2326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2322);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2323);
					expr_concat_item();
					}
					} 
				}
				setState(2328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
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
		enterRule(_localctx, 316, RULE_expr_concat_item);
		try {
			setState(2338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2329);
				match(T_OPEN_P);
				setState(2330);
				expr(0);
				setState(2331);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2333);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2334);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2335);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2336);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2337);
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
		enterRule(_localctx, 318, RULE_expr_case);
		try {
			setState(2342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2340);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2341);
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
		enterRule(_localctx, 320, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2344);
			match(T_CASE);
			setState(2345);
			expr(0);
			setState(2351); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2346);
				match(T_WHEN);
				setState(2347);
				expr(0);
				setState(2348);
				match(T_THEN);
				setState(2349);
				expr(0);
				}
				}
				setState(2353); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2355);
				match(T_ELSE);
				setState(2356);
				expr(0);
				}
			}

			setState(2359);
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
		enterRule(_localctx, 322, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2361);
			match(T_CASE);
			setState(2367); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2362);
				match(T_WHEN);
				setState(2363);
				bool_expr(0);
				setState(2364);
				match(T_THEN);
				setState(2365);
				expr(0);
				}
				}
				setState(2369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2371);
				match(T_ELSE);
				setState(2372);
				expr(0);
				}
			}

			setState(2375);
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
		enterRule(_localctx, 324, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
			ident();
			setState(2378);
			match(T__0);
			setState(2379);
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
		enterRule(_localctx, 326, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2381);
				match(T_AVG);
				setState(2382);
				match(T_OPEN_P);
				setState(2384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2383);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2386);
				expr(0);
				setState(2387);
				match(T_CLOSE_P);
				setState(2389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2388);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2391);
				match(T_COUNT);
				setState(2392);
				match(T_OPEN_P);
				setState(2394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2393);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2396);
				expr(0);
				setState(2397);
				match(T_CLOSE_P);
				setState(2399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2398);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2401);
				match(T_COUNT_BIG);
				setState(2402);
				match(T_OPEN_P);
				setState(2404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2403);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2406);
				expr(0);
				setState(2407);
				match(T_CLOSE_P);
				setState(2409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2408);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2411);
				match(T_CUME_DIST);
				setState(2412);
				match(T_OPEN_P);
				setState(2413);
				expr(0);
				setState(2414);
				match(T_CLOSE_P);
				setState(2415);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2417);
				match(T_DENSE_RANK);
				setState(2418);
				match(T_OPEN_P);
				setState(2419);
				expr(0);
				setState(2420);
				match(T_CLOSE_P);
				setState(2421);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2423);
				match(T_FIRST_VALUE);
				setState(2424);
				match(T_OPEN_P);
				setState(2425);
				expr(0);
				setState(2426);
				match(T_CLOSE_P);
				setState(2427);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2429);
				match(T_LAG);
				setState(2430);
				match(T_OPEN_P);
				setState(2431);
				expr(0);
				setState(2438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2432);
					match(T_COMMA);
					setState(2433);
					expr(0);
					setState(2436);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2434);
						match(T_COMMA);
						setState(2435);
						expr(0);
						}
					}

					}
				}

				setState(2440);
				match(T_CLOSE_P);
				setState(2441);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2443);
				match(T_LAST_VALUE);
				setState(2444);
				match(T_OPEN_P);
				setState(2445);
				expr(0);
				setState(2446);
				match(T_CLOSE_P);
				setState(2447);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2449);
				match(T_LEAD);
				setState(2450);
				match(T_OPEN_P);
				setState(2451);
				expr(0);
				setState(2458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2452);
					match(T_COMMA);
					setState(2453);
					expr(0);
					setState(2456);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2454);
						match(T_COMMA);
						setState(2455);
						expr(0);
						}
					}

					}
				}

				setState(2460);
				match(T_CLOSE_P);
				setState(2461);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2463);
				match(T_MAX);
				setState(2464);
				match(T_OPEN_P);
				setState(2466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2465);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2468);
				expr(0);
				setState(2469);
				match(T_CLOSE_P);
				setState(2471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2470);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2473);
				match(T_MIN);
				setState(2474);
				match(T_OPEN_P);
				setState(2476);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2475);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2478);
				expr(0);
				setState(2479);
				match(T_CLOSE_P);
				setState(2481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2480);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2483);
				match(T_RANK);
				setState(2484);
				match(T_OPEN_P);
				setState(2485);
				expr(0);
				setState(2486);
				match(T_CLOSE_P);
				setState(2487);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2489);
				match(T_ROW_NUMBER);
				setState(2490);
				match(T_OPEN_P);
				setState(2491);
				expr(0);
				setState(2492);
				match(T_CLOSE_P);
				setState(2493);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2495);
				match(T_STDEV);
				setState(2496);
				match(T_OPEN_P);
				setState(2498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
				case 1:
					{
					setState(2497);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2500);
				expr(0);
				setState(2501);
				match(T_CLOSE_P);
				setState(2503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
				case 1:
					{
					setState(2502);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2505);
				match(T_SUM);
				setState(2506);
				match(T_OPEN_P);
				setState(2508);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(2507);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2510);
				expr(0);
				setState(2511);
				match(T_CLOSE_P);
				setState(2513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
				case 1:
					{
					setState(2512);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(2515);
				match(T_VAR);
				setState(2516);
				match(T_OPEN_P);
				setState(2518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(2517);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2520);
				expr(0);
				setState(2521);
				match(T_CLOSE_P);
				setState(2523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(2522);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(2525);
				match(T_VARIANCE);
				setState(2526);
				match(T_OPEN_P);
				setState(2528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(2527);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2530);
				expr(0);
				setState(2531);
				match(T_CLOSE_P);
				setState(2533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
				case 1:
					{
					setState(2532);
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
		enterRule(_localctx, 328, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2537);
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
		enterRule(_localctx, 330, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2539);
			match(T_OVER);
			setState(2540);
			match(T_OPEN_P);
			setState(2542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2541);
				expr_func_partition_by_clause();
				}
			}

			setState(2545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2544);
				order_by_clause();
				}
			}

			setState(2547);
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
		enterRule(_localctx, 332, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2549);
			match(T_PARTITION);
			setState(2550);
			match(T_BY);
			setState(2551);
			expr(0);
			setState(2556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2552);
				match(T_COMMA);
				setState(2553);
				expr(0);
				}
				}
				setState(2558);
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
		enterRule(_localctx, 334, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2559);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2560);
				match(T_CAST);
				setState(2561);
				match(T_OPEN_P);
				setState(2562);
				expr(0);
				setState(2563);
				match(T_AS);
				setState(2564);
				dtype();
				setState(2566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2565);
					dtype_len();
					}
				}

				setState(2568);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2570);
				match(T_COUNT);
				setState(2571);
				match(T_OPEN_P);
				setState(2574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(2572);
					expr(0);
					}
					break;
				case 2:
					{
					setState(2573);
					match(T_MUL);
					}
					break;
				}
				setState(2576);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2577);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2578);
				match(T_CURRENT);
				setState(2579);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2583);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(2580);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(2581);
					match(T_CURRENT);
					setState(2582);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2585);
					match(T_OPEN_P);
					setState(2586);
					expr(0);
					setState(2587);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2591);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2592);
				match(T_CURRENT);
				setState(2593);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2594);
				match(T_MAX_PART_STRING);
				setState(2595);
				match(T_OPEN_P);
				setState(2596);
				expr(0);
				setState(2609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2597);
					match(T_COMMA);
					setState(2598);
					expr(0);
					setState(2606);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2599);
						match(T_COMMA);
						setState(2600);
						expr(0);
						setState(2601);
						match(T_EQUAL);
						setState(2602);
						expr(0);
						}
						}
						setState(2608);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2611);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2613);
				match(T_MIN_PART_STRING);
				setState(2614);
				match(T_OPEN_P);
				setState(2615);
				expr(0);
				setState(2628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2616);
					match(T_COMMA);
					setState(2617);
					expr(0);
					setState(2625);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2618);
						match(T_COMMA);
						setState(2619);
						expr(0);
						setState(2620);
						match(T_EQUAL);
						setState(2621);
						expr(0);
						}
						}
						setState(2627);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2630);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2632);
				match(T_MAX_PART_INT);
				setState(2633);
				match(T_OPEN_P);
				setState(2634);
				expr(0);
				setState(2647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2635);
					match(T_COMMA);
					setState(2636);
					expr(0);
					setState(2644);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2637);
						match(T_COMMA);
						setState(2638);
						expr(0);
						setState(2639);
						match(T_EQUAL);
						setState(2640);
						expr(0);
						}
						}
						setState(2646);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2649);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2651);
				match(T_MIN_PART_INT);
				setState(2652);
				match(T_OPEN_P);
				setState(2653);
				expr(0);
				setState(2666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2654);
					match(T_COMMA);
					setState(2655);
					expr(0);
					setState(2663);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2656);
						match(T_COMMA);
						setState(2657);
						expr(0);
						setState(2658);
						match(T_EQUAL);
						setState(2659);
						expr(0);
						}
						}
						setState(2665);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2668);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2670);
				match(T_MAX_PART_DATE);
				setState(2671);
				match(T_OPEN_P);
				setState(2672);
				expr(0);
				setState(2685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2673);
					match(T_COMMA);
					setState(2674);
					expr(0);
					setState(2682);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2675);
						match(T_COMMA);
						setState(2676);
						expr(0);
						setState(2677);
						match(T_EQUAL);
						setState(2678);
						expr(0);
						}
						}
						setState(2684);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2687);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2689);
				match(T_MIN_PART_DATE);
				setState(2690);
				match(T_OPEN_P);
				setState(2691);
				expr(0);
				setState(2704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2692);
					match(T_COMMA);
					setState(2693);
					expr(0);
					setState(2701);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2694);
						match(T_COMMA);
						setState(2695);
						expr(0);
						setState(2696);
						match(T_EQUAL);
						setState(2697);
						expr(0);
						}
						}
						setState(2703);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2706);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2708);
				match(T_PART_COUNT);
				setState(2709);
				match(T_OPEN_P);
				setState(2710);
				expr(0);
				setState(2718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2711);
					match(T_COMMA);
					setState(2712);
					expr(0);
					setState(2713);
					match(T_EQUAL);
					setState(2714);
					expr(0);
					}
					}
					setState(2720);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2721);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2723);
				match(T_PART_LOC);
				setState(2724);
				match(T_OPEN_P);
				setState(2725);
				expr(0);
				setState(2731); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2726);
						match(T_COMMA);
						setState(2727);
						expr(0);
						setState(2728);
						match(T_EQUAL);
						setState(2729);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2733); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2735);
					match(T_COMMA);
					setState(2736);
					expr(0);
					}
				}

				setState(2739);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2741);
				match(T_TRIM);
				setState(2742);
				match(T_OPEN_P);
				setState(2743);
				expr(0);
				setState(2744);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2746);
				match(T_SUBSTRING);
				setState(2747);
				match(T_OPEN_P);
				setState(2748);
				expr(0);
				setState(2749);
				match(T_FROM);
				setState(2750);
				expr(0);
				setState(2753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(2751);
					match(T_FOR);
					setState(2752);
					expr(0);
					}
				}

				setState(2755);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2757);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2758);
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
		enterRule(_localctx, 336, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2761);
			ident();
			setState(2762);
			match(T_OPEN_P);
			setState(2764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				{
				setState(2763);
				expr_func_params();
				}
				break;
			}
			setState(2766);
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
		enterRule(_localctx, 338, RULE_expr_func_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2768);
			func_param();
			setState(2773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2769);
				match(T_COMMA);
				setState(2770);
				func_param();
				}
				}
				setState(2775);
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
		enterRule(_localctx, 340, RULE_func_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2776);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(2782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				{
				setState(2777);
				ident();
				setState(2778);
				match(T_EQUAL);
				setState(2780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
				case 1:
					{
					setState(2779);
					match(T_GREATER);
					}
					break;
				}
				}
				break;
			}
			setState(2784);
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
		enterRule(_localctx, 342, RULE_expr_select);
		try {
			setState(2788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2786);
				select_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2787);
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
		enterRule(_localctx, 344, RULE_expr_file);
		try {
			setState(2792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2790);
				file_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2791);
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
		enterRule(_localctx, 346, RULE_file_name);
		int _la;
		try {
			setState(2808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2794);
				match(L_FILE);
				}
				break;
			case T_DIV:
			case T_DOT:
			case L_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2798);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_DIV:
					{
					setState(2795);
					match(T_DIV);
					}
					break;
				case T_DOT:
					{
					setState(2796);
					match(T_DOT);
					setState(2797);
					match(T_DIV);
					}
					break;
				case L_ID:
					break;
				default:
					break;
				}
				setState(2800);
				ident();
				setState(2805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_DIV) {
					{
					{
					setState(2801);
					match(T_DIV);
					setState(2802);
					ident();
					}
					}
					setState(2807);
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
		enterRule(_localctx, 348, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2810);
			match(T_DATE);
			setState(2811);
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
		enterRule(_localctx, 350, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2813);
			match(T_TIMESTAMP);
			setState(2814);
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
		enterRule(_localctx, 352, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2816);
			match(L_ID);
			}
			setState(2821);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,344,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2817);
					match(T_DOT);
					{
					setState(2818);
					match(L_ID);
					}
					}
					} 
				}
				setState(2823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,344,_ctx);
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
		enterRule(_localctx, 354, RULE_string);
		try {
			setState(2826);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2824);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2825);
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
		enterRule(_localctx, 356, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2828);
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

			setState(2831);
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
		enterRule(_localctx, 358, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2833);
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

			setState(2836);
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
		enterRule(_localctx, 360, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2838);
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
		enterRule(_localctx, 362, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2840);
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
		enterRule(_localctx, 364, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2842);
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
		case 59:
			return cpp_smt_sempred((Cpp_smtContext)_localctx, predIndex);
		case 81:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 123:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 134:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 144:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 152:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 170:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u017b\u0b1f\4\2\t"+
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
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u0178"+
		"\n\3\3\3\5\3\u017b\n\3\6\3\u017d\n\3\r\3\16\3\u017e\3\4\5\4\u0182\n\4"+
		"\3\4\3\4\3\4\5\4\u0187\n\4\3\4\3\4\3\5\3\5\3\5\5\5\u018e\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u0195\n\5\5\5\u0197\n\5\3\6\3\6\3\6\3\7\3\7\6\7\u019e\n"+
		"\7\r\7\16\7\u019f\3\7\5\7\u01a3\n\7\3\7\3\7\5\7\u01a7\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u01c2\n\b\3\t\3\t\6\t\u01c6\n\t\r\t\16\t\u01c7"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u01d3\n\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\7\f\u01db\n\f\f\f\16\f\u01de\13\f\3\r\3\r\5\r\u01e2\n\r\3"+
		"\16\3\16\3\16\3\16\7\16\u01e8\n\16\f\16\16\16\u01eb\13\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u01f3\n\17\f\17\16\17\u01f6\13\17\3\20\3\20\3"+
		"\20\3\20\3\20\7\20\u01fd\n\20\f\20\16\20\u0200\13\20\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u0207\n\21\3\22\3\22\3\22\7\22\u020c\n\22\f\22\16\22\u020f"+
		"\13\22\3\22\5\22\u0212\n\22\3\22\3\22\5\22\u0216\n\22\3\22\7\22\u0219"+
		"\n\22\f\22\16\22\u021c\13\22\3\22\5\22\u021f\n\22\3\22\3\22\3\22\5\22"+
		"\u0224\n\22\3\22\3\22\5\22\u0228\n\22\3\22\3\22\5\22\u022c\n\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u0236\n\24\3\24\3\24\5\24\u023a"+
		"\n\24\3\24\3\24\3\24\5\24\u023f\n\24\3\25\3\25\3\25\5\25\u0244\n\25\3"+
		"\25\3\25\5\25\u0248\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0255\n\27\3\27\3\27\3\30\5\30\u025a\n\30\3\30\3\30\3"+
		"\30\3\30\5\30\u0260\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u026b\n\31\3\31\3\31\5\31\u026f\n\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\5\32\u0279\n\32\3\32\5\32\u027c\n\32\3\32\3\32\3\32\5\32"+
		"\u0281\n\32\3\32\3\32\3\33\5\33\u0286\n\33\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u028d\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u0294\n\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\7\37\u02ac\n\37\f\37\16\37\u02af\13\37\3 \3"+
		" \3 \5 \u02b4\n \3 \7 \u02b7\n \f \16 \u02ba\13 \3 \7 \u02bd\n \f \16"+
		" \u02c0\13 \3 \3 \3 \3 \5 \u02c6\n \3 \5 \u02c9\n \3!\3!\3\"\3\"\5\"\u02cf"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u02db\n\"\f\"\16\"\u02de"+
		"\13\"\3\"\3\"\3\"\3\"\3\"\7\"\u02e5\n\"\f\"\16\"\u02e8\13\"\3\"\3\"\3"+
		"\"\5\"\u02ed\n\"\3#\3#\3#\5#\u02f2\n#\3#\3#\3#\5#\u02f7\n#\3#\3#\3#\5"+
		"#\u02fc\n#\7#\u02fe\n#\f#\16#\u0301\13#\3#\3#\5#\u0305\n#\3#\5#\u0308"+
		"\n#\3#\3#\3#\3#\3#\3#\7#\u0310\n#\f#\16#\u0313\13#\3#\3#\3#\3#\3#\3#\3"+
		"#\7#\u031c\n#\f#\16#\u031f\13#\3#\3#\7#\u0323\n#\f#\16#\u0326\13#\5#\u0328"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0334\n$\3%\6%\u0337\n%\r%\16%\u0338"+
		"\3&\3&\3&\5&\u033e\n&\3\'\5\'\u0341\n\'\3\'\3\'\3(\6(\u0346\n(\r(\16("+
		"\u0347\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0354\n)\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\6*\u0361\n*\r*\16*\u0362\3*\3*\3*\5*\u0368\n*\3+\5+\u036b"+
		"\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u0378\n+\f+\16+\u037b\13+\3+\3"+
		"+\3+\5+\u0380\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u038b\n+\3,\5,\u038e\n"+
		",\3,\3,\3,\3,\3,\3,\7,\u0396\n,\f,\16,\u0399\13,\3,\3,\3,\3,\5,\u039f"+
		"\n,\3-\3-\3-\3-\3-\3-\5-\u03a7\n-\3.\3.\3.\3.\7.\u03ad\n.\f.\16.\u03b0"+
		"\13.\3/\3/\3/\3/\3/\3/\3/\5/\u03b9\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\5/\u03cd\n/\3\60\3\60\3\60\3\60\5\60\u03d3\n\60"+
		"\3\61\3\61\5\61\u03d7\n\61\3\61\3\61\3\61\5\61\u03dc\n\61\3\61\3\61\5"+
		"\61\u03e0\n\61\3\61\3\61\3\61\5\61\u03e5\n\61\3\61\5\61\u03e8\n\61\3\61"+
		"\3\61\3\61\5\61\u03ed\n\61\3\61\5\61\u03f0\n\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u03fe\n\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u041e\n\62\5\62\u0420\n\62\3\63\3\63\3\63\5\63\u0425\n\63\3\63\3\63\5"+
		"\63\u0429\n\63\3\63\3\63\3\64\5\64\u042e\n\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u0435\n\64\3\64\5\64\u0438\n\64\3\65\5\65\u043b\n\65\3\65\3\65\3"+
		"\65\5\65\u0440\n\65\3\65\3\65\5\65\u0444\n\65\5\65\u0446\n\65\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u044d\n\66\3\66\3\66\7\66\u0451\n\66\f\66\16\66\u0454"+
		"\13\66\3\66\5\66\u0457\n\66\3\67\3\67\3\67\3\67\5\67\u045d\n\67\38\38"+
		"\38\38\58\u0463\n8\38\38\78\u0467\n8\f8\168\u046a\138\38\38\38\38\58\u0470"+
		"\n8\38\38\78\u0474\n8\f8\168\u0477\138\38\38\38\38\38\58\u047e\n8\38\3"+
		"8\78\u0482\n8\f8\168\u0485\138\58\u0487\n8\39\39\39\39\39\59\u048e\n9"+
		"\39\39\39\59\u0493\n9\39\59\u0496\n9\39\39\3:\3:\3:\3;\3;\3;\7;\u04a0"+
		"\n;\f;\16;\u04a3\13;\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\7=\u04bd\n=\f=\16=\u04c0\13=\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u04d9\n>\3?\3?"+
		"\3?\3?\3?\7?\u04e0\n?\f?\16?\u04e3\13?\3?\3?\3?\7?\u04e8\n?\f?\16?\u04eb"+
		"\13?\3?\5?\u04ee\n?\3?\3?\3?\3?\3?\7?\u04f5\n?\f?\16?\u04f8\13?\3?\3?"+
		"\3?\3?\3?\7?\u04ff\n?\f?\16?\u0502\13?\3?\5?\u0505\n?\5?\u0507\n?\3@\3"+
		"@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\5B\u0515\nB\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\5C\u0523\nC\3D\3D\3D\3D\3D\3D\5D\u052b\nD\3D\3D\3E\3E\3F\3"+
		"F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0541\nG\5G\u0543\nG\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0553\nG\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\5H\u055d\nH\3I\5I\u0560\nI\3I\3I\3I\3I\3I\5I\u0567\nI\3J\3J\3"+
		"J\3J\5J\u056d\nJ\3J\5J\u0570\nJ\3J\3J\3J\5J\u0575\nJ\3J\3J\5J\u0579\n"+
		"J\3J\5J\u057c\nJ\3J\3J\3K\3K\3K\5K\u0583\nK\3L\3L\3L\3L\5L\u0589\nL\3"+
		"L\5L\u058c\nL\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0596\nL\3M\3M\3M\3M\3M\7M\u059d"+
		"\nM\fM\16M\u05a0\13M\3N\3N\3N\3N\5N\u05a6\nN\3N\3N\3N\3N\3N\5N\u05ad\n"+
		"N\5N\u05af\nN\3O\3O\3O\3O\5O\u05b5\nO\3O\5O\u05b8\nO\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\3O\5O\u05c3\nO\3P\3P\3P\3P\3P\7P\u05ca\nP\fP\16P\u05cd\13P\3Q"+
		"\3Q\3Q\5Q\u05d2\nQ\3R\3R\3R\3R\5R\u05d8\nR\3R\5R\u05db\nR\3R\3R\3R\5R"+
		"\u05e0\nR\3R\5R\u05e3\nR\3R\5R\u05e6\nR\3R\5R\u05e9\nR\3R\5R\u05ec\nR"+
		"\3R\3R\3R\3R\5R\u05f2\nR\3S\3S\3S\3S\3S\3S\7S\u05fa\nS\fS\16S\u05fd\13"+
		"S\3S\3S\3S\3S\3S\3S\7S\u0605\nS\fS\16S\u0608\13S\5S\u060a\nS\3T\3T\3T"+
		"\3T\3T\5T\u0611\nT\3T\3T\3T\5T\u0616\nT\3T\7T\u0619\nT\fT\16T\u061c\13"+
		"T\3T\5T\u061f\nT\3T\3T\3T\3T\3T\3T\5T\u0627\nT\3T\3T\5T\u062b\nT\3T\7"+
		"T\u062e\nT\fT\16T\u0631\13T\3T\5T\u0634\nT\5T\u0636\nT\3U\6U\u0639\nU"+
		"\rU\16U\u063a\3V\3V\3V\3V\3V\3V\5V\u0643\nV\3V\3V\3V\5V\u0648\nV\3W\3"+
		"W\3W\3W\3W\7W\u064f\nW\fW\16W\u0652\13W\3W\3W\3X\3X\5X\u0658\nX\3X\3X"+
		"\3X\3X\5X\u065e\nX\3X\3X\5X\u0662\nX\3Y\3Y\5Y\u0666\nY\3Z\3Z\5Z\u066a"+
		"\nZ\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0674\n[\3\\\3\\\3]\3]\5]\u067a\n]\3]\3"+
		"]\3]\3]\3]\3]\3]\3]\7]\u0684\n]\f]\16]\u0687\13]\3]\3]\3^\3^\5^\u068d"+
		"\n^\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\7`\u069b\n`\f`\16`\u069e\13`\3"+
		"`\3`\7`\u06a2\n`\f`\16`\u06a5\13`\3a\3a\3a\5a\u06aa\na\3b\5b\u06ad\nb"+
		"\3b\3b\5b\u06b1\nb\3b\5b\u06b4\nb\3b\3b\3c\3c\3c\3d\3d\3d\3d\5d\u06bf"+
		"\nd\3d\5d\u06c2\nd\3d\3d\3d\3e\3e\3e\3e\3e\3e\5e\u06cd\ne\3f\3f\3f\3f"+
		"\3f\3f\5f\u06d5\nf\3g\3g\3g\3g\7g\u06db\ng\fg\16g\u06de\13g\3h\3h\3h\3"+
		"h\7h\u06e4\nh\fh\16h\u06e7\13h\3h\3h\3h\7h\u06ec\nh\fh\16h\u06ef\13h\3"+
		"h\3h\5h\u06f3\nh\3h\5h\u06f6\nh\3h\5h\u06f9\nh\3h\5h\u06fc\nh\3h\5h\u06ff"+
		"\nh\3h\3h\3i\3i\3i\3i\5i\u0707\ni\3j\3j\5j\u070b\nj\3k\3k\3k\3k\3l\3l"+
		"\5l\u0713\nl\3m\3m\3m\3m\5m\u0719\nm\3n\3n\3n\3n\3n\3n\3n\5n\u0722\nn"+
		"\3o\3o\3o\3o\3o\3o\3o\3o\3p\3p\3q\5q\u072f\nq\3q\3q\3q\3r\3r\3r\3r\7r"+
		"\u0738\nr\fr\16r\u073b\13r\3s\3s\5s\u073f\ns\3s\3s\3s\3s\3s\3t\3t\3t\3"+
		"t\7t\u074a\nt\ft\16t\u074d\13t\3t\3t\3u\3u\3u\3u\7u\u0755\nu\fu\16u\u0758"+
		"\13u\3u\3u\3v\3v\3v\3v\3v\3v\3v\5v\u0763\nv\3w\3w\5w\u0767\nw\3w\3w\5"+
		"w\u076b\nw\3w\3w\5w\u076f\nw\5w\u0771\nw\3x\3x\3x\3x\5x\u0777\nx\3x\5"+
		"x\u077a\nx\3x\5x\u077d\nx\3x\5x\u0780\nx\3x\3x\5x\u0784\nx\3x\5x\u0787"+
		"\nx\3x\5x\u078a\nx\3x\3x\3y\5y\u078f\ny\3y\5y\u0792\ny\3y\3y\3y\3y\3y"+
		"\3y\7y\u079a\ny\fy\16y\u079d\13y\3z\3z\3{\3{\3{\3|\3|\3|\5|\u07a7\n|\3"+
		"|\3|\5|\u07ab\n|\3|\5|\u07ae\n|\3|\3|\3}\3}\5}\u07b4\n}\3}\3}\3}\3}\3"+
		"}\5}\u07bb\n}\3~\3~\5~\u07bf\n~\3~\3~\3\177\3\177\3\177\3\177\7\177\u07c7"+
		"\n\177\f\177\16\177\u07ca\13\177\3\u0080\3\u0080\3\u0080\7\u0080\u07cf"+
		"\n\u0080\f\u0080\16\u0080\u07d2\13\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\3\u0081\5\u0081\u07d9\n\u0081\3\u0082\3\u0082\5\u0082\u07dd\n\u0082\3"+
		"\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u07e3\n\u0083\3\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u07ec\n\u0084\3\u0085\5"+
		"\u0085\u07ef\n\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u07f4\n\u0085\3\u0085"+
		"\5\u0085\u07f7\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\7\u0086\u07ff\n\u0086\f\u0086\16\u0086\u0802\13\u0086\3\u0086\3\u0086"+
		"\5\u0086\u0806\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087"+
		"\u080d\n\u0087\f\u0087\16\u0087\u0810\13\u0087\3\u0087\3\u0087\5\u0087"+
		"\u0814\n\u0087\3\u0088\3\u0088\5\u0088\u0818\n\u0088\3\u0088\3\u0088\3"+
		"\u0088\3\u0088\3\u0088\7\u0088\u081f\n\u0088\f\u0088\16\u0088\u0822\13"+
		"\u0088\3\u0088\5\u0088\u0825\n\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3"+
		"\u008a\5\u008a\u082c\n\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3"+
		"\u008c\3\u008c\3\u008c\7\u008c\u0836\n\u008c\f\u008c\16\u008c\u0839\13"+
		"\u008c\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\5\u008f\u0845\n\u008f\3\u008f\3\u008f\3\u008f\5\u008f"+
		"\u084a\n\u008f\7\u008f\u084c\n\u008f\f\u008f\16\u008f\u084f\13\u008f\3"+
		"\u0090\6\u0090\u0852\n\u0090\r\u0090\16\u0090\u0853\3\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u085f\n"+
		"\u0091\5\u0091\u0861\n\u0091\3\u0092\3\u0092\5\u0092\u0865\n\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u086c\n\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\7\u0092\u0872\n\u0092\f\u0092\16\u0092\u0875\13\u0092"+
		"\3\u0093\3\u0093\3\u0093\5\u0093\u087a\n\u0093\3\u0094\3\u0094\3\u0094"+
		"\5\u0094\u087f\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\5\u0094\u088a\n\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0893\n\u0094\3\u0095\3\u0095"+
		"\5\u0095\u0897\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\7\u0095"+
		"\u089e\n\u0095\f\u0095\16\u0095\u08a1\13\u0095\3\u0095\5\u0095\u08a4\n"+
		"\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u08ac\n"+
		"\u0096\f\u0096\16\u0096\u08af\13\u0096\3\u0096\3\u0096\5\u0096\u08b3\n"+
		"\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\5\u0099\u08c9\n\u0099\3\u0099\5\u0099\u08cc\n"+
		"\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u08e5\n\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u08f5\n\u009a\f\u009a"+
		"\16\u009a\u08f8\13\u009a\3\u009b\3\u009b\5\u009b\u08fc\n\u009b\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\5\u009c\u090a\n\u009c\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\7\u009f\u0917"+
		"\n\u009f\f\u009f\16\u009f\u091a\13\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0925\n\u00a0\3\u00a1"+
		"\3\u00a1\5\u00a1\u0929\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\6\u00a2\u0932\n\u00a2\r\u00a2\16\u00a2\u0933\3\u00a2"+
		"\3\u00a2\5\u00a2\u0938\n\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\6\u00a3\u0942\n\u00a3\r\u00a3\16\u00a3\u0943"+
		"\3\u00a3\3\u00a3\5\u00a3\u0948\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0953\n\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\5\u00a5\u0958\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5"+
		"\u095d\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0962\n\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\5\u00a5\u0967\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u096c"+
		"\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5"+
		"\u0987\n\u00a5\5\u00a5\u0989\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u099b\n\u00a5\5\u00a5\u099d\n\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u09a5\n\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\5\u00a5\u09aa\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5"+
		"\u00a5\u09af\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u09b4\n\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u09c5\n\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\5\u00a5\u09ca\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5"+
		"\u09cf\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u09d4\n\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\5\u00a5\u09d9\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u09de"+
		"\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u09e3\n\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\5\u00a5\u09e8\n\u00a5\5\u00a5\u09ea\n\u00a5\3\u00a6\3\u00a6\3"+
		"\u00a7\3\u00a7\3\u00a7\5\u00a7\u09f1\n\u00a7\3\u00a7\5\u00a7\u09f4\n\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u09fd"+
		"\n\u00a8\f\u00a8\16\u00a8\u0a00\13\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0a09\n\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0a11\n\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0a1a\n\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\5\u00a9\u0a20\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\7\u00a9\u0a2f\n\u00a9\f\u00a9\16\u00a9\u0a32\13\u00a9\5\u00a9\u0a34\n"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u0a42\n\u00a9\f\u00a9\16\u00a9"+
		"\u0a45\13\u00a9\5\u00a9\u0a47\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9"+
		"\u0a55\n\u00a9\f\u00a9\16\u00a9\u0a58\13\u00a9\5\u00a9\u0a5a\n\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u0a68\n\u00a9\f\u00a9\16\u00a9\u0a6b"+
		"\13\u00a9\5\u00a9\u0a6d\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u0a7b"+
		"\n\u00a9\f\u00a9\16\u00a9\u0a7e\13\u00a9\5\u00a9\u0a80\n\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\7\u00a9\u0a8e\n\u00a9\f\u00a9\16\u00a9\u0a91\13\u00a9"+
		"\5\u00a9\u0a93\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u0a9f\n\u00a9\f\u00a9\16\u00a9"+
		"\u0aa2\13\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\6\u00a9\u0aae\n\u00a9\r\u00a9\16\u00a9\u0aaf"+
		"\3\u00a9\3\u00a9\5\u00a9\u0ab4\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u0ac4\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u0aca\n\u00a9\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0acf\n\u00aa\3\u00aa\3"+
		"\u00aa\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0ad6\n\u00ab\f\u00ab\16\u00ab"+
		"\u0ad9\13\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0adf\n\u00ac"+
		"\5\u00ac\u0ae1\n\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\5\u00ad\u0ae7\n"+
		"\u00ad\3\u00ae\3\u00ae\5\u00ae\u0aeb\n\u00ae\3\u00af\3\u00af\3\u00af\3"+
		"\u00af\5\u00af\u0af1\n\u00af\3\u00af\3\u00af\3\u00af\7\u00af\u0af6\n\u00af"+
		"\f\u00af\16\u00af\u0af9\13\u00af\5\u00af\u0afb\n\u00af\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\7\u00b2\u0b06"+
		"\n\u00b2\f\u00b2\16\u00b2\u0b09\13\u00b2\3\u00b3\3\u00b3\5\u00b3\u0b0d"+
		"\n\u00b3\3\u00b4\5\u00b4\u0b10\n\u00b4\3\u00b4\3\u00b4\3\u00b5\5\u00b5"+
		"\u0b15\n\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b8\2\5x\u0122\u0132\u00b9\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\2."+
		"\4\2``\u0132\u0132\5\2\f\fpp\u0095\u0095\4\2\37\37\'\'\4\2\65\65ii\4\2"+
		"\u00b4\u00b4\u00fc\u00fc\4\2\r\rQQ\4\2NN\u0127\u0127\4\2jj\u00a7\u00a7"+
		"\4\2NN\u00d4\u00d4\4\2JJ\u0085\u0085\5\2\u0089\u0089\u00ae\u00ae\u00d0"+
		"\u00d1\4\2\u00a9\u00a9\u00bb\u00bb\4\2\u00b8\u00b8\u013a\u013a\4\2\u00ef"+
		"\u00ef\u0124\u0124\4\2\u00ad\u00ad\u0172\u0172\4\2\35\35$$\4\2\"\"<<\4"+
		"\2@@\u00f5\u00f5\4\2\u0158\u0158\u016c\u016c\3\2\u0172\u0173\4\2\f\f\u0095"+
		"\u0095\3\2\u00e6\u00e7\3\2\u00d7\u00d8\6\2;;LL\u0094\u0094\u00cd\u00cd"+
		"\5\2NN\u0084\u0084\u00cc\u00cc\6\2\n\13\u00b9\u00b9\u00dc\u00dc\u0138"+
		"\u0138\3\2\u00c3\u00c4\4\2\u00fd\u00fd\u0121\u0121\6\2\23\23XX\u00aa\u00aa"+
		"\u011b\u011b\4\2\u00aa\u00aa\u0134\u0134\3\2\u00fa\u00fb\4\2\6\6VV\5\2"+
		"uu\u009e\u009e\u00e9\u00e9\5\2<<\u00f1\u00f2\u0128\u0128\5\2gg\u0100\u0100"+
		"\u0127\u0127\4\2\t\t\u00c7\u00c7\5\2\u009f\u009f\u00e0\u00e0\u00ea\u00ea"+
		"\6\2\u0155\u0155\u0159\u0159\u0163\u0163\u016b\u016b\5\2DE\u00b1\u00b2"+
		"\u00f6\u00f7\4\2\62\62\u0158\u0158\5\2ss\u0096\u0096\u00be\u00be\4\2\u0155"+
		"\u0155\u016b\u016b\4\2kk\u0122\u0122\20\2\4\27\31[__a\u00be\u00c0\u00d1"+
		"\u00d3\u00ee\u00f0\u0103\u0105\u010f\u0111\u011c\u011e\u0123\u0126\u0131"+
		"\u0134\u013a\u013d\u0146\u014d\u0154\2\u0c90\2\u0170\3\2\2\2\4\u017c\3"+
		"\2\2\2\6\u0181\3\2\2\2\b\u0196\3\2\2\2\n\u0198\3\2\2\2\f\u01a6\3\2\2\2"+
		"\16\u01c1\3\2\2\2\20\u01c3\3\2\2\2\22\u01c9\3\2\2\2\24\u01cf\3\2\2\2\26"+
		"\u01d7\3\2\2\2\30\u01e1\3\2\2\2\32\u01e3\3\2\2\2\34\u01ec\3\2\2\2\36\u01f7"+
		"\3\2\2\2 \u0206\3\2\2\2\"\u022b\3\2\2\2$\u022d\3\2\2\2&\u0235\3\2\2\2"+
		"(\u0240\3\2\2\2*\u0249\3\2\2\2,\u024c\3\2\2\2.\u0259\3\2\2\2\60\u0263"+
		"\3\2\2\2\62\u0274\3\2\2\2\64\u0293\3\2\2\2\66\u0299\3\2\2\28\u02a1\3\2"+
		"\2\2:\u02a4\3\2\2\2<\u02a8\3\2\2\2>\u02c8\3\2\2\2@\u02ca\3\2\2\2B\u02ec"+
		"\3\2\2\2D\u0327\3\2\2\2F\u0329\3\2\2\2H\u0336\3\2\2\2J\u033d\3\2\2\2L"+
		"\u0340\3\2\2\2N\u0345\3\2\2\2P\u0353\3\2\2\2R\u0367\3\2\2\2T\u038a\3\2"+
		"\2\2V\u039e\3\2\2\2X\u03a6\3\2\2\2Z\u03a8\3\2\2\2\\\u03cc\3\2\2\2^\u03d2"+
		"\3\2\2\2`\u03ef\3\2\2\2b\u041f\3\2\2\2d\u0421\3\2\2\2f\u0437\3\2\2\2h"+
		"\u0445\3\2\2\2j\u0456\3\2\2\2l\u045c\3\2\2\2n\u0486\3\2\2\2p\u0488\3\2"+
		"\2\2r\u0499\3\2\2\2t\u049c\3\2\2\2v\u04a4\3\2\2\2x\u04a7\3\2\2\2z\u04d8"+
		"\3\2\2\2|\u0506\3\2\2\2~\u0508\3\2\2\2\u0080\u050b\3\2\2\2\u0082\u0510"+
		"\3\2\2\2\u0084\u0522\3\2\2\2\u0086\u0524\3\2\2\2\u0088\u052e\3\2\2\2\u008a"+
		"\u0530\3\2\2\2\u008c\u0552\3\2\2\2\u008e\u055c\3\2\2\2\u0090\u055f\3\2"+
		"\2\2\u0092\u056f\3\2\2\2\u0094\u057f\3\2\2\2\u0096\u058b\3\2\2\2\u0098"+
		"\u0597\3\2\2\2\u009a\u05ae\3\2\2\2\u009c\u05b7\3\2\2\2\u009e\u05c4\3\2"+
		"\2\2\u00a0\u05d1\3\2\2\2\u00a2\u05da\3\2\2\2\u00a4\u0609\3\2\2\2\u00a6"+
		"\u0635\3\2\2\2\u00a8\u0638\3\2\2\2\u00aa\u0647\3\2\2\2\u00ac\u0649\3\2"+
		"\2\2\u00ae\u065d\3\2\2\2\u00b0\u0665\3\2\2\2\u00b2\u0669\3\2\2\2\u00b4"+
		"\u0673\3\2\2\2\u00b6\u0675\3\2\2\2\u00b8\u0677\3\2\2\2\u00ba\u068a\3\2"+
		"\2\2\u00bc\u068e\3\2\2\2\u00be\u0690\3\2\2\2\u00c0\u06a9\3\2\2\2\u00c2"+
		"\u06b0\3\2\2\2\u00c4\u06b7\3\2\2\2\u00c6\u06ba\3\2\2\2\u00c8\u06c6\3\2"+
		"\2\2\u00ca\u06d4\3\2\2\2\u00cc\u06d6\3\2\2\2\u00ce\u06df\3\2\2\2\u00d0"+
		"\u0706\3\2\2\2\u00d2\u0708\3\2\2\2\u00d4\u070c\3\2\2\2\u00d6\u0712\3\2"+
		"\2\2\u00d8\u0714\3\2\2\2\u00da\u0721\3\2\2\2\u00dc\u0723\3\2\2\2\u00de"+
		"\u072b\3\2\2\2\u00e0\u072e\3\2\2\2\u00e2\u0733\3\2\2\2\u00e4\u073c\3\2"+
		"\2\2\u00e6\u0745\3\2\2\2\u00e8\u0750\3\2\2\2\u00ea\u0762\3\2\2\2\u00ec"+
		"\u0770\3\2\2\2\u00ee\u0772\3\2\2\2\u00f0\u078e\3\2\2\2\u00f2\u079e\3\2"+
		"\2\2\u00f4\u07a0\3\2\2\2\u00f6\u07ad\3\2\2\2\u00f8\u07ba\3\2\2\2\u00fa"+
		"\u07be\3\2\2\2\u00fc\u07c2\3\2\2\2\u00fe\u07cb\3\2\2\2\u0100\u07d8\3\2"+
		"\2\2\u0102\u07da\3\2\2\2\u0104\u07de\3\2\2\2\u0106\u07eb\3\2\2\2\u0108"+
		"\u07f6\3\2\2\2\u010a\u07f8\3\2\2\2\u010c\u0813\3\2\2\2\u010e\u0815\3\2"+
		"\2\2\u0110\u0826\3\2\2\2\u0112\u082b\3\2\2\2\u0114\u082d\3\2\2\2\u0116"+
		"\u0830\3\2\2\2\u0118\u083a\3\2\2\2\u011a\u083d\3\2\2\2\u011c\u0840\3\2"+
		"\2\2\u011e\u0851\3\2\2\2\u0120\u0860\3\2\2\2\u0122\u086b\3\2\2\2\u0124"+
		"\u0879\3\2\2\2\u0126\u0892\3\2\2\2\u0128\u0894\3\2\2\2\u012a\u08a7\3\2"+
		"\2\2\u012c\u08b9\3\2\2\2\u012e\u08bd\3\2\2\2\u0130\u08cb\3\2\2\2\u0132"+
		"\u08e4\3\2\2\2\u0134\u08f9\3\2\2\2\u0136\u0909\3\2\2\2\u0138\u090b\3\2"+
		"\2\2\u013a\u090f\3\2\2\2\u013c\u0911\3\2\2\2\u013e\u0924\3\2\2\2\u0140"+
		"\u0928\3\2\2\2\u0142\u092a\3\2\2\2\u0144\u093b\3\2\2\2\u0146\u094b\3\2"+
		"\2\2\u0148\u09e9\3\2\2\2\u014a\u09eb\3\2\2\2\u014c\u09ed\3\2\2\2\u014e"+
		"\u09f7\3\2\2\2\u0150\u0ac9\3\2\2\2\u0152\u0acb\3\2\2\2\u0154\u0ad2\3\2"+
		"\2\2\u0156\u0ada\3\2\2\2\u0158\u0ae6\3\2\2\2\u015a\u0aea\3\2\2\2\u015c"+
		"\u0afa\3\2\2\2\u015e\u0afc\3\2\2\2\u0160\u0aff\3\2\2\2\u0162\u0b02\3\2"+
		"\2\2\u0164\u0b0c\3\2\2\2\u0166\u0b0f\3\2\2\2\u0168\u0b14\3\2\2\2\u016a"+
		"\u0b18\3\2\2\2\u016c\u0b1a\3\2\2\2\u016e\u0b1c\3\2\2\2\u0170\u0171\5\4"+
		"\3\2\u0171\u0172\7\2\2\3\u0172\3\3\2\2\2\u0173\u0178\5\6\4\2\u0174\u0175"+
		"\5\16\b\2\u0175\u0176\b\3\1\2\u0176\u0178\3\2\2\2\u0177\u0173\3\2\2\2"+
		"\u0177\u0174\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u017b\7y\2\2\u017a\u0179"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u0177\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\5\3\2\2\2"+
		"\u0180\u0182\5\34\17\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0184\7\23\2\2\u0184\u0186\5\4\3\2\u0185\u0187\5\20\t\2"+
		"\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189"+
		"\5\n\6\2\u0189\7\3\2\2\2\u018a\u018b\7\23\2\2\u018b\u018d\5\4\3\2\u018c"+
		"\u018e\5\20\t\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3"+
		"\2\2\2\u018f\u0190\5\n\6\2\u0190\u0197\3\2\2\2\u0191\u0192\5\16\b\2\u0192"+
		"\u0194\b\5\1\2\u0193\u0195\7\u016a\2\2\u0194\u0193\3\2\2\2\u0194\u0195"+
		"\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u018a\3\2\2\2\u0196\u0191\3\2\2\2\u0197"+
		"\t\3\2\2\2\u0198\u0199\6\6\2\2\u0199\u019a\7`\2\2\u019a\13\3\2\2\2\u019b"+
		"\u01a7\5\6\4\2\u019c\u019e\5\16\b\2\u019d\u019c\3\2\2\2\u019e\u019f\3"+
		"\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1"+
		"\u01a3\7y\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a5\b\7\1\2\u01a5\u01a7\3\2\2\2\u01a6\u019b\3\2\2\2\u01a6"+
		"\u019d\3\2\2\2\u01a7\r\3\2\2\2\u01a8\u01a9\b\b\1\2\u01a9\u01c2\5\24\13"+
		"\2\u01aa\u01c2\5j\66\2\u01ab\u01ac\5p9\2\u01ac\u01ad\b\b\1\2\u01ad\u01c2"+
		"\3\2\2\2\u01ae\u01c2\5\u00b8]\2\u01af\u01c2\5\62\32\2\u01b0\u01c2\5\u0096"+
		"L\2\u01b1\u01c2\5\u009cO\2\u01b2\u01c2\5\u00a2R\2\u01b3\u01b4\5\60\31"+
		"\2\u01b4\u01b5\b\b\1\2\u01b5\u01c2\3\2\2\2\u01b6\u01c2\5\32\16\2\u01b7"+
		"\u01c2\5\u00c8e\2\u01b8\u01c2\5\u00caf\2\u01b9\u01c2\5\u0086D\2\u01ba"+
		"\u01bb\5\u008aF\2\u01bb\u01bc\b\b\1\2\u01bc\u01c2\3\2\2\2\u01bd\u01be"+
		"\5\u008cG\2\u01be\u01bf\b\b\1\2\u01bf\u01c2\3\2\2\2\u01c0\u01c2\5\u00ce"+
		"h\2\u01c1\u01a8\3\2\2\2\u01c1\u01aa\3\2\2\2\u01c1\u01ab\3\2\2\2\u01c1"+
		"\u01ae\3\2\2\2\u01c1\u01af\3\2\2\2\u01c1\u01b0\3\2\2\2\u01c1\u01b1\3\2"+
		"\2\2\u01c1\u01b2\3\2\2\2\u01c1\u01b3\3\2\2\2\u01c1\u01b6\3\2\2\2\u01c1"+
		"\u01b7\3\2\2\2\u01c1\u01b8\3\2\2\2\u01c1\u01b9\3\2\2\2\u01c1\u01ba\3\2"+
		"\2\2\u01c1\u01bd\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2\17\3\2\2\2\u01c3\u01c5"+
		"\7f\2\2\u01c4\u01c6\5\22\n\2\u01c5\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\21\3\2\2\2\u01c9\u01ca\7\u0132"+
		"\2\2\u01ca\u01cb\7\u016e\2\2\u01cb\u01cc\7\u011b\2\2\u01cc\u01cd\5\4\3"+
		"\2\u01cd\u01ce\n\2\2\2\u01ce\23\3\2\2\2\u01cf\u01d0\5\u0162\u00b2\2\u01d0"+
		"\u01d2\7\u0165\2\2\u01d1\u01d3\5\26\f\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\7\u0168\2\2\u01d5\u01d6\7\u016a"+
		"\2\2\u01d6\25\3\2\2\2\u01d7\u01dc\5\30\r\2\u01d8\u01d9\7\u0157\2\2\u01d9"+
		"\u01db\5\30\r\2\u01da\u01d8\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3"+
		"\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\27\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01e2\5\u0162\u00b2\2\u01e0\u01e2\5\u0088E\2\u01e1\u01df\3\2\2\2\u01e1"+
		"\u01e0\3\2\2\2\u01e2\31\3\2\2\2\u01e3\u01e4\7H\2\2\u01e4\u01e9\5 \21\2"+
		"\u01e5\u01e6\7\u0157\2\2\u01e6\u01e8\5 \21\2\u01e7\u01e5\3\2\2\2\u01e8"+
		"\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\33\3\2\2"+
		"\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7H\2\2\u01ed\u01ee\5 \21\2\u01ee\u01f4"+
		"\7\u016a\2\2\u01ef\u01f0\5 \21\2\u01f0\u01f1\7\u016a\2\2\u01f1\u01f3\3"+
		"\2\2\2\u01f2\u01ef\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\35\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\5 \21"+
		"\2\u01f8\u01fe\7\u016a\2\2\u01f9\u01fa\5 \21\2\u01fa\u01fb\7\u016a\2\2"+
		"\u01fb\u01fd\3\2\2\2\u01fc\u01f9\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\37\3\2\2\2\u0200\u01fe\3\2\2\2\u0201"+
		"\u0207\5&\24\2\u0202\u0207\5$\23\2\u0203\u0207\5,\27\2\u0204\u0207\5\""+
		"\22\2\u0205\u0207\5.\30\2\u0206\u0201\3\2\2\2\u0206\u0202\3\2\2\2\u0206"+
		"\u0203\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207!\3\2\2\2"+
		"\u0208\u020d\5\u0162\u00b2\2\u0209\u020a\7\u0157\2\2\u020a\u020c\5\u0162"+
		"\u00b2\2\u020b\u0209\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0212\7\f"+
		"\2\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0215\5b\62\2\u0214\u0216\5d\63\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216\u021a\3\2\2\2\u0217\u0219\5f\64\2\u0218\u0217\3\2\2\2\u0219"+
		"\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021e\3\2"+
		"\2\2\u021c\u021a\3\2\2\2\u021d\u021f\5h\65\2\u021e\u021d\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u022c\3\2\2\2\u0220\u0221\5\u0162\u00b2\2\u0221\u0223"+
		"\7/\2\2\u0222\u0224\7\f\2\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0227\5b\62\2\u0226\u0228\5d\63\2\u0227\u0226\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\5h\65\2\u022a"+
		"\u022c\3\2\2\2\u022b\u0208\3\2\2\2\u022b\u0220\3\2\2\2\u022c#\3\2\2\2"+
		"\u022d\u022e\5\u0162\u00b2\2\u022e\u022f\7\63\2\2\u022f%\3\2\2\2\u0230"+
		"\u0231\7?\2\2\u0231\u0236\5\u0162\u00b2\2\u0232\u0233\5\u0162\u00b2\2"+
		"\u0233\u0234\7?\2\2\u0234\u0236\3\2\2\2\u0235\u0230\3\2\2\2\u0235\u0232"+
		"\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u023a\5(\25\2\u0238\u023a\5*\26\2\u0239"+
		"\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2"+
		"\2\2\u023b\u023e\t\3\2\2\u023c\u023f\5\u00e0q\2\u023d\u023f\5\u0132\u009a"+
		"\2\u023e\u023c\3\2\2\2\u023e\u023d\3\2\2\2\u023f\'\3\2\2\2\u0240\u0241"+
		"\7\u0135\2\2\u0241\u0243\7\u00e6\2\2\u0242\u0244\7\u00c5\2\2\u0243\u0242"+
		"\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0246\7\u011f\2"+
		"\2\u0246\u0248\t\4\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248)"+
		"\3\2\2\2\u0249\u024a\7\u0136\2\2\u024a\u024b\7\u00e6\2\2\u024b+\3\2\2"+
		"\2\u024c\u024d\t\5\2\2\u024d\u024e\7|\2\2\u024e\u0254\7p\2\2\u024f\u0255"+
		"\7\u0108\2\2\u0250\u0255\7\u010b\2\2\u0251\u0252\7\u00bd\2\2\u0252\u0255"+
		"\7s\2\2\u0253\u0255\5\u0162\u00b2\2\u0254\u024f\3\2\2\2\u0254\u0250\3"+
		"\2\2\2\u0254\u0251\3\2\2\2\u0254\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0257\5\b\5\2\u0257-\3\2\2\2\u0258\u025a\7x\2\2\u0259\u0258\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\7\u0118\2\2\u025c\u025d"+
		"\7\u0116\2\2\u025d\u025f\5\u0162\u00b2\2\u025e\u0260\5H%\2\u025f\u025e"+
		"\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\5\64\33\2"+
		"\u0262/\3\2\2\2\u0263\u0264\b\31\1\2\u0264\u0265\79\2\2\u0265\u0266\7"+
		"\u013b\2\2\u0266\u026a\7\u0116\2\2\u0267\u0268\7\u0083\2\2\u0268\u0269"+
		"\7\u00bd\2\2\u0269\u026b\7h\2\2\u026a\u0267\3\2\2\2\u026a\u026b\3\2\2"+
		"\2\u026b\u026c\3\2\2\2\u026c\u026e\5\u0110\u0089\2\u026d\u026f\5H%\2\u026e"+
		"\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\5\64"+
		"\33\2\u0271\u0272\7\u016a\2\2\u0272\u0273\b\31\1\2\u0273\61\3\2\2\2\u0274"+
		"\u027b\79\2\2\u0275\u0276\7\u00a2\2\2\u0276\u027c\7\u0118\2\2\u0277\u0279"+
		"\t\6\2\2\u0278\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027c\7\u0131\2\2\u027b\u0275\3\2\2\2\u027b\u0278\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027d\u027e\7\u0116\2\2\u027e\u0280\5\u0162\u00b2\2\u027f\u0281"+
		"\5H%\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
		"\u0283\5\64\33\2\u0283\63\3\2\2\2\u0284\u0286\7\f\2\2\u0285\u0284\3\2"+
		"\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\7\u0165\2\2\u0288"+
		"\u0289\5\u00e0q\2\u0289\u028a\7\u0168\2\2\u028a\u0294\3\2\2\2\u028b\u028d"+
		"\7\f\2\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u0294\5\u00e0q\2\u028f\u0290\7\u0165\2\2\u0290\u0291\5<\37\2\u0291\u0292"+
		"\7\u0168\2\2\u0292\u0294\3\2\2\2\u0293\u0285\3\2\2\2\u0293\u028c\3\2\2"+
		"\2\u0293\u028f\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\5:\36\2\u0296\u0297"+
		"\5\66\34\2\u0297\u0298\58\35\2\u0298\65\3\2\2\2\u0299\u029a\7\u00ed\2"+
		"\2\u029a\u029b\7r\2\2\u029b\u029c\7O\2\2\u029c\u029d\7m\2\2\u029d\u029e"+
		"\7\u0119\2\2\u029e\u029f\7\34\2\2\u029f\u02a0\5\u0132\u009a\2\u02a0\67"+
		"\3\2\2\2\u02a1\u02a2\7\u00a3\2\2\u02a2\u02a3\5\u0132\u009a\2\u02a39\3"+
		"\2\2\2\u02a4\u02a5\7\u0110\2\2\u02a5\u02a6\7\f\2\2\u02a6\u02a7\5\u0162"+
		"\u00b2\2\u02a7;\3\2\2\2\u02a8\u02ad\5> \2\u02a9\u02aa\7\u0157\2\2\u02aa"+
		"\u02ac\5> \2\u02ab\u02a9\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2"+
		"\2\u02ad\u02ae\3\2\2\2\u02ae=\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b1"+
		"\5@!\2\u02b1\u02b3\5b\62\2\u02b2\u02b4\5d\63\2\u02b3\u02b2\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b8\3\2\2\2\u02b5\u02b7\5f\64\2\u02b6\u02b5\3\2"+
		"\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9"+
		"\u02be\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bd\5B\"\2\u02bc\u02bb\3\2"+
		"\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02c1\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1\u02c2\b \1\2\u02c2\u02c9\3\2"+
		"\2\2\u02c3\u02c4\7\64\2\2\u02c4\u02c6\5\u0162\u00b2\2\u02c5\u02c3\3\2"+
		"\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\5D#\2\u02c8\u02b0"+
		"\3\2\2\2\u02c8\u02c5\3\2\2\2\u02c9?\3\2\2\2\u02ca\u02cb\5\u0162\u00b2"+
		"\2\u02cbA\3\2\2\2\u02cc\u02ed\5h\65\2\u02cd\u02cf\7\u00bd\2\2\u02ce\u02cd"+
		"\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02ed\7\u00bf\2"+
		"\2\u02d1\u02d2\7\u00d5\2\2\u02d2\u02ed\7\u009a\2\2\u02d3\u02ed\7\u0126"+
		"\2\2\u02d4\u02d5\7\u00df\2\2\u02d5\u02d6\5\u0110\u0089\2\u02d6\u02d7\7"+
		"\u0165\2\2\u02d7\u02d8\5\u0162\u00b2\2\u02d8\u02dc\7\u0168\2\2\u02d9\u02db"+
		"\5F$\2\u02da\u02d9\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc"+
		"\u02dd\3\2\2\2\u02dd\u02ed\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e0\7\u0082"+
		"\2\2\u02e0\u02e1\7\u0165\2\2\u02e1\u02e6\7\u0172\2\2\u02e2\u02e3\7\u0157"+
		"\2\2\u02e3\u02e5\7\u0172\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6"+
		"\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02e6\3\2"+
		"\2\2\u02e9\u02ed\7\u0168\2\2\u02ea\u02ed\7\20\2\2\u02eb\u02ed\7_\2\2\u02ec"+
		"\u02cc\3\2\2\2\u02ec\u02ce\3\2\2\2\u02ec\u02d1\3\2\2\2\u02ec\u02d3\3\2"+
		"\2\2\u02ec\u02d4\3\2\2\2\u02ec\u02df\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec"+
		"\u02eb\3\2\2\2\u02edC\3\2\2\2\u02ee\u02ef\7\u00d5\2\2\u02ef\u02f1\7\u009a"+
		"\2\2\u02f0\u02f2\7)\2\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2"+
		"\u02f3\3\2\2\2\u02f3\u02f4\7\u0165\2\2\u02f4\u02f6\5\u0162\u00b2\2\u02f5"+
		"\u02f7\t\7\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02ff\3\2"+
		"\2\2\u02f8\u02f9\7\u0157\2\2\u02f9\u02fb\5\u0162\u00b2\2\u02fa\u02fc\t"+
		"\7\2\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fe\3\2\2\2\u02fd"+
		"\u02f8\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2"+
		"\2\2\u0300\u0302\3\2\2\2\u0301\u02ff\3\2\2\2\u0302\u0304\7\u0168\2\2\u0303"+
		"\u0305\7_\2\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\3\2"+
		"\2\2\u0306\u0308\5\u00bc_\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u0328\3\2\2\2\u0309\u030a\7q\2\2\u030a\u030b\7\u009a\2\2\u030b\u030c"+
		"\7\u0165\2\2\u030c\u0311\5\u0162\u00b2\2\u030d\u030e\7\u0157\2\2\u030e"+
		"\u0310\5\u0162\u00b2\2\u030f\u030d\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f"+
		"\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\3\2\2\2\u0313\u0311\3\2\2\2\u0314"+
		"\u0315\7\u0168\2\2\u0315\u0316\7\u00df\2\2\u0316\u0317\5\u0110\u0089\2"+
		"\u0317\u0318\7\u0165\2\2\u0318\u031d\5\u0162\u00b2\2\u0319\u031a\7\u0157"+
		"\2\2\u031a\u031c\5\u0162\u00b2\2\u031b\u0319\3\2\2\2\u031c\u031f\3\2\2"+
		"\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f\u031d"+
		"\3\2\2\2\u0320\u0324\7\u0168\2\2\u0321\u0323\5F$\2\u0322\u0321\3\2\2\2"+
		"\u0323\u0326\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0328"+
		"\3\2\2\2\u0326\u0324\3\2\2\2\u0327\u02ee\3\2\2\2\u0327\u0309\3\2\2\2\u0328"+
		"E\3\2\2\2\u0329\u032a\7\u00c4\2\2\u032a\u0333\t\b\2\2\u032b\u032c\7\u00b8"+
		"\2\2\u032c\u0334\7\4\2\2\u032d\u0334\7\u00e3\2\2\u032e\u032f\7\u00fc\2"+
		"\2\u032f\u0334\7\u00bf\2\2\u0330\u0331\7\u00fc\2\2\u0331\u0334\7I\2\2"+
		"\u0332\u0334\7 \2\2\u0333\u032b\3\2\2\2\u0333\u032d\3\2\2\2\u0333\u032e"+
		"\3\2\2\2\u0333\u0330\3\2\2\2\u0333\u0332\3\2\2\2\u0334G\3\2\2\2\u0335"+
		"\u0337\5J&\2\u0336\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0336\3\2\2"+
		"\2\u0338\u0339\3\2\2\2\u0339I\3\2\2\2\u033a\u033b\7\u0157\2\2\u033b\u033e"+
		"\5L\'\2\u033c\u033e\5X-\2\u033d\u033a\3\2\2\2\u033d\u033c\3\2\2\2\u033e"+
		"K\3\2\2\2\u033f\u0341\7\u00b8\2\2\u0340\u033f\3\2\2\2\u0340\u0341\3\2"+
		"\2\2\u0341\u0342\3\2\2\2\u0342\u0343\t\t\2\2\u0343M\3\2\2\2\u0344\u0346"+
		"\5P)\2\u0345\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0345\3\2\2\2\u0347"+
		"\u0348\3\2\2\2\u0348O\3\2\2\2\u0349\u034a\7\u00c4\2\2\u034a\u034b\7\60"+
		"\2\2\u034b\u034c\t\n\2\2\u034c\u0354\7\u00ee\2\2\u034d\u0354\5R*\2\u034e"+
		"\u0354\5T+\2\u034f\u0354\5V,\2\u0350\u0354\5X-\2\u0351\u0354\5^\60\2\u0352"+
		"\u0354\5`\61\2\u0353\u0349\3\2\2\2\u0353\u034d\3\2\2\2\u0353\u034e\3\2"+
		"\2\2\u0353\u034f\3\2\2\2\u0353\u0350\3\2\2\2\u0353\u0351\3\2\2\2\u0353"+
		"\u0352\3\2\2\2\u0354Q\3\2\2\2\u0355\u0356\7\u00f9\2\2\u0356\u0357\7:\2"+
		"\2\u0357\u0368\t\13\2\2\u0358\u0359\t\f\2\2\u0359\u0368\7\u0172\2\2\u035a"+
		"\u0368\7\u00ba\2\2\u035b\u0368\t\r\2\2\u035c\u035d\7\u010f\2\2\u035d\u0360"+
		"\7\u0165\2\2\u035e\u0361\5\u0162\u00b2\2\u035f\u0361\7\u0172\2\2\u0360"+
		"\u035e\3\2\2\2\u0360\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0360\3\2"+
		"\2\2\u0362\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0368\7\u0168\2\2\u0365"+
		"\u0366\7\u0117\2\2\u0366\u0368\5\u0162\u00b2\2\u0367\u0355\3\2\2\2\u0367"+
		"\u0358\3\2\2\2\u0367\u035a\3\2\2\2\u0367\u035b\3\2\2\2\u0367\u035c\3\2"+
		"\2\2\u0367\u0365\3\2\2\2\u0368S\3\2\2\2\u0369\u036b\7\u0088\2\2\u036a"+
		"\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\7\u0086"+
		"\2\2\u036d\u038b\5\u0162\u00b2\2\u036e\u036f\7\u0135\2\2\u036f\u038b\7"+
		"\u00e1\2\2\u0370\u0371\7W\2\2\u0371\u0372\7\34\2\2\u0372\u0373\7}\2\2"+
		"\u0373\u0374\7\u0165\2\2\u0374\u0379\5\u0162\u00b2\2\u0375\u0376\7\u0157"+
		"\2\2\u0376\u0378\5\u0162\u00b2\2\u0377\u0375\3\2\2\2\u0378\u037b\3\2\2"+
		"\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037c\3\2\2\2\u037b\u0379"+
		"\3\2\2\2\u037c\u037d\7\u0168\2\2\u037d\u038b\3\2\2\2\u037e\u0380\7\u00bd"+
		"\2\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381"+
		"\u038b\7\u00a8\2\2\u0382\u0383\7\61\2\2\u0383\u038b\t\16\2\2\u0384\u0385"+
		"\7M\2\2\u0385\u038b\7\u00c5\2\2\u0386\u0387\7\u0135\2\2\u0387\u0388\7"+
		"\u00e3\2\2\u0388\u0389\7\u00c4\2\2\u0389\u038b\7Z\2\2\u038a\u036a\3\2"+
		"\2\2\u038a\u036e\3\2\2\2\u038a\u0370\3\2\2\2\u038a\u037f\3\2\2\2\u038a"+
		"\u0382\3\2\2\2\u038a\u0384\3\2\2\2\u038a\u0386\3\2\2\2\u038bU\3\2\2\2"+
		"\u038c\u038e\7\u0126\2\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e"+
		"\u038f\3\2\2\2\u038f\u0390\7\u00d5\2\2\u0390\u0391\7\u0088\2\2\u0391\u0392"+
		"\7\u0165\2\2\u0392\u0397\5\u0162\u00b2\2\u0393\u0394\7\u0157\2\2\u0394"+
		"\u0396\5\u0162\u00b2\2\u0395\u0393\3\2\2\2\u0396\u0399\3\2\2\2\u0397\u0395"+
		"\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039a\3\2\2\2\u0399\u0397\3\2\2\2\u039a"+
		"\u039b\7\u0168\2\2\u039b\u039f\3\2\2\2\u039c\u039d\7\u0135\2\2\u039d\u039f"+
		"\7A\2\2\u039e\u038d\3\2\2\2\u039e\u039c\3\2\2\2\u039fW\3\2\2\2\u03a0\u03a7"+
		"\5Z.\2\u03a1\u03a2\7\u0110\2\2\u03a2\u03a3\7\f\2\2\u03a3\u03a7\5\u0162"+
		"\u00b2\2\u03a4\u03a5\7\u00a3\2\2\u03a5\u03a7\5\u0132\u009a\2\u03a6\u03a0"+
		"\3\2\2\2\u03a6\u03a1\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a7Y\3\2\2\2\u03a8"+
		"\u03a9\7\u00ed\2\2\u03a9\u03aa\7r\2\2\u03aa\u03ae\7O\2\2\u03ab\u03ad\5"+
		"\\/\2\u03ac\u03ab\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae"+
		"\u03af\3\2\2\2\u03af[\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1\u03b2\7m\2\2\u03b2"+
		"\u03b3\7\u0119\2\2\u03b3\u03b4\7\34\2\2\u03b4\u03b8\5\u0132\u009a\2\u03b5"+
		"\u03b6\7b\2\2\u03b6\u03b7\7\34\2\2\u03b7\u03b9\5\u0132\u009a\2\u03b8\u03b5"+
		"\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03cd\3\2\2\2\u03ba\u03bb\7,\2\2\u03bb"+
		"\u03bc\7\u0097\2\2\u03bc\u03bd\7\u0119\2\2\u03bd\u03be\7\34\2\2\u03be"+
		"\u03cd\5\u0132\u009a\2\u03bf\u03c0\7\u00ab\2\2\u03c0\u03c1\7\u009b\2\2"+
		"\u03c1\u03c2\7\u0119\2\2\u03c2\u03c3\7\34\2\2\u03c3\u03cd\5\u0132\u009a"+
		"\2\u03c4\u03c5\7\u00a1\2\2\u03c5\u03c6\7\u0119\2\2\u03c6\u03c7\7\34\2"+
		"\2\u03c7\u03cd\5\u0132\u009a\2\u03c8\u03c9\7\u00bf\2\2\u03c9\u03ca\7K"+
		"\2\2\u03ca\u03cb\7\f\2\2\u03cb\u03cd\5\u0132\u009a\2\u03cc\u03b1\3\2\2"+
		"\2\u03cc\u03ba\3\2\2\2\u03cc\u03bf\3\2\2\2\u03cc\u03c4\3\2\2\2\u03cc\u03c8"+
		"\3\2\2\2\u03cd]\3\2\2\2\u03ce\u03cf\7\u00c4\2\2\u03cf\u03d3\5\u0162\u00b2"+
		"\2\u03d0\u03d1\7\u011a\2\2\u03d1\u03d3\5\u0162\u00b2\2\u03d2\u03ce\3\2"+
		"\2\2\u03d2\u03d0\3\2\2\2\u03d3_\3\2\2\2\u03d4\u03d6\7\20\2\2\u03d5\u03d7"+
		"\7\u015b\2\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d8\3\2\2"+
		"\2\u03d8\u03f0\5\u0132\u009a\2\u03d9\u03db\7.\2\2\u03da\u03dc\7\u015b"+
		"\2\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd"+
		"\u03f0\5\u0132\u009a\2\u03de\u03e0\7I\2\2\u03df\u03de\3\2\2\2\u03df\u03e0"+
		"\3\2\2\2\u03e0\u03e4\3\2\2\2\u03e1\u03e2\7%\2\2\u03e2\u03e5\7\u00fc\2"+
		"\2\u03e3\u03e5\7&\2\2\u03e4\u03e1\3\2\2\2\u03e4\u03e3\3\2\2\2\u03e5\u03e7"+
		"\3\2\2\2\u03e6\u03e8\7\u015b\2\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2"+
		"\2\u03e8\u03e9\3\2\2\2\u03e9\u03f0\5\u0132\u009a\2\u03ea\u03ec\7a\2\2"+
		"\u03eb\u03ed\7\u015b\2\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u03ee\3\2\2\2\u03ee\u03f0\5\u0132\u009a\2\u03ef\u03d4\3\2\2\2\u03ef\u03d9"+
		"\3\2\2\2\u03ef\u03df\3\2\2\2\u03ef\u03ea\3\2\2\2\u03f0a\3\2\2\2\u03f1"+
		"\u0420\7$\2\2\u03f2\u0420\7\25\2\2\u03f3\u0420\7\26\2\2\u03f4\u0420\7"+
		"\27\2\2\u03f5\u0420\7\30\2\2\u03f6\u0420\7\31\2\2\u03f7\u0420\7B\2\2\u03f8"+
		"\u0420\7C\2\2\u03f9\u0420\7F\2\2\u03fa\u0420\7G\2\2\u03fb\u03fd\7Y\2\2"+
		"\u03fc\u03fe\7\u00d3\2\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe"+
		"\u0420\3\2\2\2\u03ff\u0420\7\u0179\2\2\u0400\u0420\7\u017a\2\2\u0401\u0420"+
		"\7\u008d\2\2\u0402\u0420\7\u008e\2\2\u0403\u0420\7\u008f\2\2\u0404\u0420"+
		"\7\u0090\2\2\u0405\u0420\7\u00b5\2\2\u0406\u0420\7\u00b7\2\2\u0407\u0420"+
		"\7\u00c1\2\2\u0408\u0420\7\u00c0\2\2\u0409\u0420\7\u00d2\2\2\u040a\u0420"+
		"\7\u00de\2\2\u040b\u040c\7\u00e5\2\2\u040c\u0420\7\u0130\2\2\u040d\u0420"+
		"\7\u0103\2\2\u040e\u0420\7\u0102\2\2\u040f\u0420\7\u0104\2\2\u0410\u0420"+
		"\7\u0106\2\2\u0411\u0420\7\u0105\2\2\u0412\u0420\7\u017b\2\2\u0413\u0420"+
		"\7\u0115\2\2\u0414\u0420\7\u011c\2\2\u0415\u0420\7\u011d\2\2\u0416\u0420"+
		"\7\u012e\2\2\u0417\u0420\7\u012f\2\2\u0418\u0420\7\u0139\2\2\u0419\u0420"+
		"\7\u013c\2\2\u041a\u041d\5\u0162\u00b2\2\u041b\u041c\7\3\2\2\u041c\u041e"+
		"\t\17\2\2\u041d\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0420\3\2\2\2"+
		"\u041f\u03f1\3\2\2\2\u041f\u03f2\3\2\2\2\u041f\u03f3\3\2\2\2\u041f\u03f4"+
		"\3\2\2\2\u041f\u03f5\3\2\2\2\u041f\u03f6\3\2\2\2\u041f\u03f7\3\2\2\2\u041f"+
		"\u03f8\3\2\2\2\u041f\u03f9\3\2\2\2\u041f\u03fa\3\2\2\2\u041f\u03fb\3\2"+
		"\2\2\u041f\u03ff\3\2\2\2\u041f\u0400\3\2\2\2\u041f\u0401\3\2\2\2\u041f"+
		"\u0402\3\2\2\2\u041f\u0403\3\2\2\2\u041f\u0404\3\2\2\2\u041f\u0405\3\2"+
		"\2\2\u041f\u0406\3\2\2\2\u041f\u0407\3\2\2\2\u041f\u0408\3\2\2\2\u041f"+
		"\u0409\3\2\2\2\u041f\u040a\3\2\2\2\u041f\u040b\3\2\2\2\u041f\u040d\3\2"+
		"\2\2\u041f\u040e\3\2\2\2\u041f\u040f\3\2\2\2\u041f\u0410\3\2\2\2\u041f"+
		"\u0411\3\2\2\2\u041f\u0412\3\2\2\2\u041f\u0413\3\2\2\2\u041f\u0414\3\2"+
		"\2\2\u041f\u0415\3\2\2\2\u041f\u0416\3\2\2\2\u041f\u0417\3\2\2\2\u041f"+
		"\u0418\3\2\2\2\u041f\u0419\3\2\2\2\u041f\u041a\3\2\2\2\u0420c\3\2\2\2"+
		"\u0421\u0422\7\u0165\2\2\u0422\u0424\t\20\2\2\u0423\u0425\t\21\2\2\u0424"+
		"\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0428\3\2\2\2\u0426\u0427\7\u0157"+
		"\2\2\u0427\u0429\7\u0172\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429"+
		"\u042a\3\2\2\2\u042a\u042b\7\u0168\2\2\u042be\3\2\2\2\u042c\u042e\7\u00bd"+
		"\2\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u0438\7\u00bf\2\2\u0430\u0431\7%\2\2\u0431\u0432\7\u00fc\2\2\u0432\u0438"+
		"\5\u0162\u00b2\2\u0433\u0435\7\u00bd\2\2\u0434\u0433\3\2\2\2\u0434\u0435"+
		"\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0438\t\22\2\2\u0437\u042d\3\2\2\2"+
		"\u0437\u0430\3\2\2\2\u0437\u0434\3\2\2\2\u0438g\3\2\2\2\u0439\u043b\7"+
		"\u0156\2\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043c\3\2\2\2"+
		"\u043c\u043d\7\u015b\2\2\u043d\u0446\5\u0132\u009a\2\u043e\u0440\7\u0135"+
		"\2\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3\2\2\2\u0441"+
		"\u0443\7I\2\2\u0442\u0444\5\u0132\u009a\2\u0443\u0442\3\2\2\2\u0443\u0444"+
		"\3\2\2\2\u0444\u0446\3\2\2\2\u0445\u043a\3\2\2\2\u0445\u043f\3\2\2\2\u0446"+
		"i\3\2\2\2\u0447\u0448\79\2\2\u0448\u044c\t\23\2\2\u0449\u044a\7\u0083"+
		"\2\2\u044a\u044b\7\u00bd\2\2\u044b\u044d\7h\2\2\u044c\u0449\3\2\2\2\u044c"+
		"\u044d\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0452\5\u0132\u009a\2\u044f\u0451"+
		"\5l\67\2\u0450\u044f\3\2\2\2\u0451\u0454\3\2\2\2\u0452\u0450\3\2\2\2\u0452"+
		"\u0453\3\2\2\2\u0453\u0457\3\2\2\2\u0454\u0452\3\2\2\2\u0455\u0457\5n"+
		"8\2\u0456\u0447\3\2\2\2\u0456\u0455\3\2\2\2\u0457k\3\2\2\2\u0458\u0459"+
		"\7.\2\2\u0459\u045d\5\u0132\u009a\2\u045a\u045b\7\u00a3\2\2\u045b\u045d"+
		"\5\u0132\u009a\2\u045c\u0458\3\2\2\2\u045c\u045a\3\2\2\2\u045dm\3\2\2"+
		"\2\u045e\u0462\79\2\2\u045f\u0460\7\u0083\2\2\u0460\u0461\7\u00bd\2\2"+
		"\u0461\u0463\7h\2\2\u0462\u045f\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464"+
		"\3\2\2\2\u0464\u0468\5\u0132\u009a\2\u0465\u0467\5l\67\2\u0466\u0465\3"+
		"\2\2\2\u0467\u046a\3\2\2\2\u0468\u0466\3\2\2\2\u0468\u0469\3\2\2\2\u0469"+
		"\u0487\3\2\2\2\u046a\u0468\3\2\2\2\u046b\u046f\t\23\2\2\u046c\u046d\7"+
		"\u0083\2\2\u046d\u046e\7\u00bd\2\2\u046e\u0470\7h\2\2\u046f\u046c\3\2"+
		"\2\2\u046f\u0470\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0475\5\u0132\u009a"+
		"\2\u0472\u0474\5l\67\2\u0473\u0472\3\2\2\2\u0474\u0477\3\2\2\2\u0475\u0473"+
		"\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0487\3\2\2\2\u0477\u0475\3\2\2\2\u0478"+
		"\u0479\t\23\2\2\u0479\u047d\79\2\2\u047a\u047b\7\u0083\2\2\u047b\u047c"+
		"\7\u00bd\2\2\u047c\u047e\7h\2\2\u047d\u047a\3\2\2\2\u047d\u047e\3\2\2"+
		"\2\u047e\u047f\3\2\2\2\u047f\u0483\5\u0132\u009a\2\u0480\u0482\5l\67\2"+
		"\u0481\u0480\3\2\2\2\u0482\u0485\3\2\2\2\u0483\u0481\3\2\2\2\u0483\u0484"+
		"\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0483\3\2\2\2\u0486\u045e\3\2\2\2\u0486"+
		"\u046b\3\2\2\2\u0486\u0478\3\2\2\2\u0487o\3\2\2\2\u0488\u0489\b9\1\2\u0489"+
		"\u048a\5b\62\2\u048a\u048b\5\u0162\u00b2\2\u048b\u048d\7\u0165\2\2\u048c"+
		"\u048e\5t;\2\u048d\u048c\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\3\2\2"+
		"\2\u048f\u0490\7\u0168\2\2\u0490\u0492\7\u0164\2\2\u0491\u0493\5x=\2\u0492"+
		"\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0495\3\2\2\2\u0494\u0496\5r"+
		":\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497\3\2\2\2\u0497"+
		"\u0498\7\u0167\2\2\u0498q\3\2\2\2\u0499\u049a\7\u00e6\2\2\u049a\u049b"+
		"\5\u0162\u00b2\2\u049bs\3\2\2\2\u049c\u04a1\5v<\2\u049d\u049e\7\u0157"+
		"\2\2\u049e\u04a0\5v<\2\u049f\u049d\3\2\2\2\u04a0\u04a3\3\2\2\2\u04a1\u049f"+
		"\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2u\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a4"+
		"\u04a5\5b\62\2\u04a5\u04a6\5\u0162\u00b2\2\u04a6w\3\2\2\2\u04a7\u04be"+
		"\b=\1\2\u04a8\u04a9\f\b\2\2\u04a9\u04bd\5|?\2\u04aa\u04ab\f\7\2\2\u04ab"+
		"\u04ac\5\u008cG\2\u04ac\u04ad\b=\1\2\u04ad\u04bd\3\2\2\2\u04ae\u04af\f"+
		"\6\2\2\u04af\u04bd\5\u0086D\2\u04b0\u04b1\f\5\2\2\u04b1\u04b2\5\u008a"+
		"F\2\u04b2\u04b3\b=\1\2\u04b3\u04bd\3\2\2\2\u04b4\u04b5\f\4\2\2\u04b5\u04b6"+
		"\5\u00e0q\2\u04b6\u04b7\b=\1\2\u04b7\u04bd\3\2\2\2\u04b8\u04b9\f\3\2\2"+
		"\u04b9\u04ba\5\60\31\2\u04ba\u04bb\b=\1\2\u04bb\u04bd\3\2\2\2\u04bc\u04a8"+
		"\3\2\2\2\u04bc\u04aa\3\2\2\2\u04bc\u04ae\3\2\2\2\u04bc\u04b0\3\2\2\2\u04bc"+
		"\u04b4\3\2\2\2\u04bc\u04b8\3\2\2\2\u04bd\u04c0\3\2\2\2\u04be\u04bc\3\2"+
		"\2\2\u04be\u04bf\3\2\2\2\u04bfy\3\2\2\2\u04c0\u04be\3\2\2\2\u04c1\u04d9"+
		"\3\2\2\2\u04c2\u04c3\5x=\2\u04c3\u04c4\5|?\2\u04c4\u04d9\3\2\2\2\u04c5"+
		"\u04c6\5x=\2\u04c6\u04c7\5\u008cG\2\u04c7\u04c8\b>\1\2\u04c8\u04d9\3\2"+
		"\2\2\u04c9\u04ca\5x=\2\u04ca\u04cb\5\u0086D\2\u04cb\u04d9\3\2\2\2\u04cc"+
		"\u04cd\5x=\2\u04cd\u04ce\5\u008aF\2\u04ce\u04cf\b>\1\2\u04cf\u04d9\3\2"+
		"\2\2\u04d0\u04d1\5x=\2\u04d1\u04d2\5\u00e0q\2\u04d2\u04d3\b>\1\2\u04d3"+
		"\u04d9\3\2\2\2\u04d4\u04d5\5x=\2\u04d5\u04d6\5\60\31\2\u04d6\u04d7\b>"+
		"\1\2\u04d7\u04d9\3\2\2\2\u04d8\u04c1\3\2\2\2\u04d8\u04c2\3\2\2\2\u04d8"+
		"\u04c5\3\2\2\2\u04d8\u04c9\3\2\2\2\u04d8\u04cc\3\2\2\2\u04d8\u04d0\3\2"+
		"\2\2\u04d8\u04d4\3\2\2\2\u04d9{\3\2\2\2\u04da\u04db\7\u0083\2\2\u04db"+
		"\u04dc\7\u0165\2\2\u04dc\u04e1\5\u0082B\2\u04dd\u04de\t\24\2\2\u04de\u04e0"+
		"\5\u0082B\2\u04df\u04dd\3\2\2\2\u04e0\u04e3\3\2\2\2\u04e1\u04df\3\2\2"+
		"\2\u04e1\u04e2\3\2\2\2\u04e2\u04e4\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e4\u04e5"+
		"\7\u0168\2\2\u04e5\u04e9\5x=\2\u04e6\u04e8\5~@\2\u04e7\u04e6\3\2\2\2\u04e8"+
		"\u04eb\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04ed\3\2"+
		"\2\2\u04eb\u04e9\3\2\2\2\u04ec\u04ee\5\u0080A\2\u04ed\u04ec\3\2\2\2\u04ed"+
		"\u04ee\3\2\2\2\u04ee\u0507\3\2\2\2\u04ef\u04f0\7\u0083\2\2\u04f0\u04f1"+
		"\7\u0165\2\2\u04f1\u04f6\5\u0082B\2\u04f2\u04f3\t\24\2\2\u04f3\u04f5\5"+
		"\u0082B\2\u04f4\u04f2\3\2\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f4\3\2\2\2"+
		"\u04f6\u04f7\3\2\2\2\u04f7\u04f9\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9\u04fa"+
		"\7\u0168\2\2\u04fa\u04fb\7\u0164\2\2\u04fb\u04fc\5x=\2\u04fc\u0500\7\u0167"+
		"\2\2\u04fd\u04ff\5~@\2\u04fe\u04fd\3\2\2\2\u04ff\u0502\3\2\2\2\u0500\u04fe"+
		"\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0504\3\2\2\2\u0502\u0500\3\2\2\2\u0503"+
		"\u0505\5\u0080A\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0507"+
		"\3\2\2\2\u0506\u04da\3\2\2\2\u0506\u04ef\3\2\2\2\u0507}\3\2\2\2\u0508"+
		"\u0509\7\\\2\2\u0509\u050a\5|?\2\u050a\177\3\2\2\2\u050b\u050c\7\\\2\2"+
		"\u050c\u050d\7\u0164\2\2\u050d\u050e\5x=\2\u050e\u050f\7\u0167\2\2\u050f"+
		"\u0081\3\2\2\2\u0510\u0511\5\u0162\u00b2\2\u0511\u0514\5\u0084C\2\u0512"+
		"\u0515\5\u0162\u00b2\2\u0513\u0515\7\u0172\2\2\u0514\u0512\3\2\2\2\u0514"+
		"\u0513\3\2\2\2\u0515\u0083\3\2\2\2\u0516\u0523\3\2\2\2\u0517\u0523\7\u015c"+
		"\2\2\u0518\u0523\7\u016c\2\2\u0519\u0523\7\u0158\2\2\u051a\u0523\7\u015b"+
		"\2\2\u051b\u0523\7\u0155\2\2\u051c\u0523\7\u016b\2\2\u051d\u0523\7\u015e"+
		"\2\2\u051e\u0523\7\u015f\2\2\u051f\u0523\7\u0160\2\2\u0520\u0523\7\u0161"+
		"\2\2\u0521\u0523\7\u0162\2\2\u0522\u0516\3\2\2\2\u0522\u0517\3\2\2\2\u0522"+
		"\u0518\3\2\2\2\u0522\u0519\3\2\2\2\u0522\u051a\3\2\2\2\u0522\u051b\3\2"+
		"\2\2\u0522\u051c\3\2\2\2\u0522\u051d\3\2\2\2\u0522\u051e\3\2\2\2\u0522"+
		"\u051f\3\2\2\2\u0522\u0520\3\2\2\2\u0522\u0521\3\2\2\2\u0523\u0085\3\2"+
		"\2\2\u0524\u0525\5\u0162\u00b2\2\u0525\u052a\7\u015b\2\2\u0526\u052b\5"+
		"\u0162\u00b2\2\u0527\u052b\5\u0088E\2\u0528\u052b\5\u00ceh\2\u0529\u052b"+
		"\5\24\13\2\u052a\u0526\3\2\2\2\u052a\u0527\3\2\2\2\u052a\u0528\3\2\2\2"+
		"\u052a\u0529\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\7\u016a\2\2\u052d"+
		"\u0087\3\2\2\2\u052e\u052f\t\25\2\2\u052f\u0089\3\2\2\2\u0530\u0531\5"+
		"b\62\2\u0531\u0532\5\u0162\u00b2\2\u0532\u0533\7\u016a\2\2\u0533\u0534"+
		"\bF\1\2\u0534\u008b\3\2\2\2\u0535\u0536\bG\1\2\u0536\u0537\7p\2\2\u0537"+
		"\u0538\7\u0165\2\2\u0538\u0539\5\u0090I\2\u0539\u053a\7\u016a\2\2\u053a"+
		"\u053b\5\u0162\u00b2\2\u053b\u0542\5\u0130\u0099\2\u053c\u0543\7\u0172"+
		"\2\2\u053d\u0540\5\u0162\u00b2\2\u053e\u053f\7\u016d\2\2\u053f\u0541\5"+
		"\u0162\u00b2\2\u0540\u053e\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\3\2"+
		"\2\2\u0542\u053c\3\2\2\2\u0542\u053d\3\2\2\2\u0543\u0544\3\2\2\2\u0544"+
		"\u0545\7\u016a\2\2\u0545\u0546\5\u008eH\2\u0546\u0547\7\u0168\2\2\u0547"+
		"\u0548\7\u0164\2\2\u0548\u0549\5z>\2\u0549\u054a\7\u0167\2\2\u054a\u054b"+
		"\bG\1\2\u054b\u0553\3\2\2\2\u054c\u054d\7p\2\2\u054d\u054e\7\u0165\2\2"+
		"\u054e\u054f\7\u016a\2\2\u054f\u0550\7\u016a\2\2\u0550\u0551\7\u0168\2"+
		"\2\u0551\u0553\5x=\2\u0552\u0535\3\2\2\2\u0552\u054c\3\2\2\2\u0553\u008d"+
		"\3\2\2\2\u0554\u0555\5\u0162\u00b2\2\u0555\u0556\7\u0155\2\2\u0556\u0557"+
		"\7\u0155\2\2\u0557\u055d\3\2\2\2\u0558\u0559\5\u0162\u00b2\2\u0559\u055a"+
		"\7\u016b\2\2\u055a\u055b\7\u016b\2\2\u055b\u055d\3\2\2\2\u055c\u0554\3"+
		"\2\2\2\u055c\u0558\3\2\2\2\u055d\u008f\3\2\2\2\u055e\u0560\5b\62\2\u055f"+
		"\u055e\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562\5\u0162"+
		"\u00b2\2\u0562\u0563\3\2\2\2\u0563\u0566\7\u015b\2\2\u0564\u0567\7\u0172"+
		"\2\2\u0565\u0567\5\u0162\u00b2\2\u0566\u0564\3\2\2\2\u0566\u0565\3\2\2"+
		"\2\u0567\u0091\3\2\2\2\u0568\u0570\7\b\2\2\u0569\u056c\79\2\2\u056a\u056b"+
		"\7\u00c7\2\2\u056b\u056d\7\u00e1\2\2\u056c\u056a\3\2\2\2\u056c\u056d\3"+
		"\2\2\2\u056d\u0570\3\2\2\2\u056e\u0570\7\u00e1\2\2\u056f\u0568\3\2\2\2"+
		"\u056f\u0569\3\2\2\2\u056f\u056e\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0571"+
		"\3\2\2\2\u0571\u0572\7v\2\2\u0572\u0574\5\u0162\u00b2\2\u0573\u0575\5"+
		"\u00a4S\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0576\3\2\2\2"+
		"\u0576\u0578\5\u0094K\2\u0577\u0579\t\26\2\2\u0578\u0577\3\2\2\2\u0578"+
		"\u0579\3\2\2\2\u0579\u057b\3\2\2\2\u057a\u057c\5\36\20\2\u057b\u057a\3"+
		"\2\2\2\u057b\u057c\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057e\5\b\5\2\u057e"+
		"\u0093\3\2\2\2\u057f\u0580\t\27\2\2\u0580\u0582\5b\62\2\u0581\u0583\5"+
		"d\63\2\u0582\u0581\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0095\3\2\2\2\u0584"+
		"\u058c\7\b\2\2\u0585\u0588\79\2\2\u0586\u0587\7\u00c7\2\2\u0587\u0589"+
		"\7\u00e1\2\2\u0588\u0586\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058c\3\2\2"+
		"\2\u058a\u058c\7\u00e1\2\2\u058b\u0584\3\2\2\2\u058b\u0585\3\2\2\2\u058b"+
		"\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058e\7\u00ce"+
		"\2\2\u058e\u058f\5\u0162\u00b2\2\u058f\u0590\t\26\2\2\u0590\u0591\5\u0098"+
		"M\2\u0591\u0595\7`\2\2\u0592\u0593\5\u0162\u00b2\2\u0593\u0594\7\u016a"+
		"\2\2\u0594\u0596\3\2\2\2\u0595\u0592\3\2\2\2\u0595\u0596\3\2\2\2\u0596"+
		"\u0097\3\2\2\2\u0597\u0598\5\u009aN\2\u0598\u059e\7\u016a\2\2\u0599\u059a"+
		"\5\u009aN\2\u059a\u059b\7\u016a\2\2\u059b\u059d\3\2\2\2\u059c\u0599\3"+
		"\2\2\2\u059d\u05a0\3\2\2\2\u059e\u059c\3\2\2\2\u059e\u059f\3\2\2\2\u059f"+
		"\u0099\3\2\2\2\u05a0\u059e\3\2\2\2\u05a1\u05af\5 \21\2\u05a2\u05a3\7v"+
		"\2\2\u05a3\u05a5\5\u0162\u00b2\2\u05a4\u05a6\5\u00a4S\2\u05a5\u05a4\3"+
		"\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a8\5\u0094K\2"+
		"\u05a8\u05af\3\2\2\2\u05a9\u05aa\t\30\2\2\u05aa\u05ac\5\u0162\u00b2\2"+
		"\u05ab\u05ad\5\u00a4S\2\u05ac\u05ab\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad"+
		"\u05af\3\2\2\2\u05ae\u05a1\3\2\2\2\u05ae\u05a2\3\2\2\2\u05ae\u05a9\3\2"+
		"\2\2\u05af\u009b\3\2\2\2\u05b0\u05b8\7\b\2\2\u05b1\u05b4\79\2\2\u05b2"+
		"\u05b3\7\u00c7\2\2\u05b3\u05b5\7\u00e1\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5"+
		"\3\2\2\2\u05b5\u05b8\3\2\2\2\u05b6\u05b8\7\u00e1\2\2\u05b7\u05b0\3\2\2"+
		"\2\u05b7\u05b1\3\2\2\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b9"+
		"\3\2\2\2\u05b9\u05ba\7\u00ce\2\2\u05ba\u05bb\7\32\2\2\u05bb\u05bc\5\u0162"+
		"\u00b2\2\u05bc\u05bd\t\26\2\2\u05bd\u05be\5\u009eP\2\u05be\u05c2\7`\2"+
		"\2\u05bf\u05c0\5\u0162\u00b2\2\u05c0\u05c1\7\u016a\2\2\u05c1\u05c3\3\2"+
		"\2\2\u05c2\u05bf\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u009d\3\2\2\2\u05c4"+
		"\u05c5\5\u00a0Q\2\u05c5\u05cb\7\u016a\2\2\u05c6\u05c7\5\u00a0Q\2\u05c7"+
		"\u05c8\7\u016a\2\2\u05c8\u05ca\3\2\2\2\u05c9\u05c6\3\2\2\2\u05ca\u05cd"+
		"\3\2\2\2\u05cb\u05c9\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u009f\3\2\2\2\u05cd"+
		"\u05cb\3\2\2\2\u05ce\u05d2\5 \21\2\u05cf\u05d2\5\u0092J\2\u05d0\u05d2"+
		"\5\u00a2R\2\u05d1\u05ce\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d1\u05d0\3\2\2"+
		"\2\u05d2\u00a1\3\2\2\2\u05d3\u05db\7\b\2\2\u05d4\u05d7\79\2\2\u05d5\u05d6"+
		"\7\u00c7\2\2\u05d6\u05d8\7\u00e1\2\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8\3"+
		"\2\2\2\u05d8\u05db\3\2\2\2\u05d9\u05db\7\u00e1\2\2\u05da\u05d3\3\2\2\2"+
		"\u05da\u05d4\3\2\2\2\u05da\u05d9\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dc"+
		"\3\2\2\2\u05dc\u05dd\t\30\2\2\u05dd\u05df\5\u0162\u00b2\2\u05de\u05e0"+
		"\5\u00a4S\2\u05df\u05de\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e2\3\2\2"+
		"\2\u05e1\u05e3\5\u00a8U\2\u05e2\u05e1\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3"+
		"\u05e5\3\2\2\2\u05e4\u05e6\t\26\2\2\u05e5\u05e4\3\2\2\2\u05e5\u05e6\3"+
		"\2\2\2\u05e6\u05e8\3\2\2\2\u05e7\u05e9\5\36\20\2\u05e8\u05e7\3\2\2\2\u05e8"+
		"\u05e9\3\2\2\2\u05e9\u05eb\3\2\2\2\u05ea\u05ec\5\u00caf\2\u05eb\u05ea"+
		"\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05f1\5\f\7\2\u05ee"+
		"\u05ef\5\u0162\u00b2\2\u05ef\u05f0\7\u016a\2\2\u05f0\u05f2\3\2\2\2\u05f1"+
		"\u05ee\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u00a3\3\2\2\2\u05f3\u05f4\7\u0165"+
		"\2\2\u05f4\u060a\7\u0168\2\2\u05f5\u05f6\7\u0165\2\2\u05f6\u05fb\5\u00a6"+
		"T\2\u05f7\u05f8\7\u0157\2\2\u05f8\u05fa\5\u00a6T\2\u05f9\u05f7\3\2\2\2"+
		"\u05fa\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fe"+
		"\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fe\u05ff\7\u0168\2\2\u05ff\u060a\3\2\2"+
		"\2\u0600\u0601\6S\t\2\u0601\u0606\5\u00a6T\2\u0602\u0603\7\u0157\2\2\u0603"+
		"\u0605\5\u00a6T\2\u0604\u0602\3\2\2\2\u0605\u0608\3\2\2\2\u0606\u0604"+
		"\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u060a\3\2\2\2\u0608\u0606\3\2\2\2\u0609"+
		"\u05f3\3\2\2\2\u0609\u05f5\3\2\2\2\u0609\u0600\3\2\2\2\u060a\u00a5\3\2"+
		"\2\2\u060b\u0611\7\u0086\2\2\u060c\u0611\7\u00c9\2\2\u060d\u0611\7\u008b"+
		"\2\2\u060e\u060f\7\u0086\2\2\u060f\u0611\7\u00c9\2\2\u0610\u060b\3\2\2"+
		"\2\u0610\u060c\3\2\2\2\u0610\u060d\3\2\2\2\u0610\u060e\3\2\2\2\u0610\u0611"+
		"\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0613\5\u0162\u00b2\2\u0613\u0615\5"+
		"b\62\2\u0614\u0616\5d\63\2\u0615\u0614\3\2\2\2\u0615\u0616\3\2\2\2\u0616"+
		"\u061a\3\2\2\2\u0617\u0619\5f\64\2\u0618\u0617\3\2\2\2\u0619\u061c\3\2"+
		"\2\2\u061a\u0618\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061e\3\2\2\2\u061c"+
		"\u061a\3\2\2\2\u061d\u061f\5h\65\2\u061e\u061d\3\2\2\2\u061e\u061f\3\2"+
		"\2\2\u061f\u0636\3\2\2\2\u0620\u0626\5\u0162\u00b2\2\u0621\u0627\7\u0086"+
		"\2\2\u0622\u0627\7\u00c9\2\2\u0623\u0627\7\u008b\2\2\u0624\u0625\7\u0086"+
		"\2\2\u0625\u0627\7\u00c9\2\2\u0626\u0621\3\2\2\2\u0626\u0622\3\2\2\2\u0626"+
		"\u0623\3\2\2\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0628\3\2"+
		"\2\2\u0628\u062a\5b\62\2\u0629\u062b\5d\63\2\u062a\u0629\3\2\2\2\u062a"+
		"\u062b\3\2\2\2\u062b\u062f\3\2\2\2\u062c\u062e\5f\64\2\u062d\u062c\3\2"+
		"\2\2\u062e\u0631\3\2\2\2\u062f\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630"+
		"\u0633\3\2\2\2\u0631\u062f\3\2\2\2\u0632\u0634\5h\65\2\u0633\u0632\3\2"+
		"\2\2\u0633\u0634\3\2\2\2\u0634\u0636\3\2\2\2\u0635\u0610\3\2\2\2\u0635"+
		"\u0620\3\2\2\2\u0636\u00a7\3\2\2\2\u0637\u0639\5\u00aaV\2\u0638\u0637"+
		"\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u0638\3\2\2\2\u063a\u063b\3\2\2\2\u063b"+
		"\u00a9\3\2\2\2\u063c\u063d\7\u009c\2\2\u063d\u0648\7\u0107\2\2\u063e\u063f"+
		"\7\u0107\2\2\u063f\u0640\7\u00f8\2\2\u0640\u0648\t\31\2\2\u0641\u0643"+
		"\7[\2\2\u0642\u0641\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0644\3\2\2\2\u0644"+
		"\u0645\7\u00e4\2\2\u0645\u0646\7\u00ff\2\2\u0646\u0648\7\u0172\2\2\u0647"+
		"\u063c\3\2\2\2\u0647\u063e\3\2\2\2\u0647\u0642\3\2\2\2\u0648\u00ab\3\2"+
		"\2\2\u0649\u064a\7-\2\2\u064a\u064b\7\u0165\2\2\u064b\u0650\5\u0162\u00b2"+
		"\2\u064c\u064d\7\u0157\2\2\u064d\u064f\5\u0162\u00b2\2\u064e\u064c\3\2"+
		"\2\2\u064f\u0652\3\2\2\2\u0650\u064e\3\2\2\2\u0650\u0651\3\2\2\2\u0651"+
		"\u0653\3\2\2\2\u0652\u0650\3\2\2\2\u0653\u0654\7\u0168\2\2\u0654\u00ad"+
		"\3\2\2\2\u0655\u0657\5\u0110\u0089\2\u0656\u0658\5\u0112\u008a\2\u0657"+
		"\u0656\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u065e\3\2\2\2\u0659\u065a\7\u0165"+
		"\2\2\u065a\u065b\5\u00e0q\2\u065b\u065c\7\u0168\2\2\u065c\u065e\3\2\2"+
		"\2\u065d\u0655\3\2\2\2\u065d\u0659\3\2\2\2\u065e\u0661\3\2\2\2\u065f\u0660"+
		"\7\17\2\2\u0660\u0662\5\u0162\u00b2\2\u0661\u065f\3\2\2\2\u0661\u0662"+
		"\3\2\2\2\u0662\u00af\3\2\2\2\u0663\u0666\5\u015c\u00af\2\u0664\u0666\5"+
		"\u0132\u009a\2\u0665\u0663\3\2\2\2\u0665\u0664\3\2\2\2\u0666\u00b1\3\2"+
		"\2\2\u0667\u066a\5\u015c\u00af\2\u0668\u066a\5\u0132\u009a\2\u0669\u0667"+
		"\3\2\2\2\u0669\u0668\3\2\2\2\u066a\u00b3\3\2\2\2\u066b\u066c\7\17\2\2"+
		"\u066c\u0674\5\u0162\u00b2\2\u066d\u066e\7\22\2\2\u066e\u0674\5\u0132"+
		"\u009a\2\u066f\u0670\7P\2\2\u0670\u0674\5\u0132\u009a\2\u0671\u0672\7"+
		"\u0109\2\2\u0672\u0674\5\u0162\u00b2\2\u0673\u066b\3\2\2\2\u0673\u066d"+
		"\3\2\2\2\u0673\u066f\3\2\2\2\u0673\u0671\3\2\2\2\u0674\u00b5\3\2\2\2\u0675"+
		"\u0676\t\32\2\2\u0676\u00b7\3\2\2\2\u0677\u0679\79\2\2\u0678\u067a\7\u0126"+
		"\2\2\u0679\u0678\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067b\3\2\2\2\u067b"+
		"\u067c\7\u0088\2\2\u067c\u067d\5\u0162\u00b2\2\u067d\u067e\7\u00c4\2\2"+
		"\u067e\u067f\5\u0110\u0089\2\u067f\u0680\7\u0165\2\2\u0680\u0685\5\u00ba"+
		"^\2\u0681\u0682\7\u0157\2\2\u0682\u0684\5\u00ba^\2\u0683\u0681\3\2\2\2"+
		"\u0684\u0687\3\2\2\2\u0685\u0683\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0688"+
		"\3\2\2\2\u0687\u0685\3\2\2\2\u0688\u0689\7\u0168\2\2\u0689\u00b9\3\2\2"+
		"\2\u068a\u068c\5\u0162\u00b2\2\u068b\u068d\t\7\2\2\u068c\u068b\3\2\2\2"+
		"\u068c\u068d\3\2\2\2\u068d\u00bb\3\2\2\2\u068e\u068f\5\u00be`\2\u068f"+
		"\u00bd\3\2\2\2\u0690\u0691\7\u0135\2\2\u0691\u0692\7\u0165\2\2\u0692\u0693"+
		"\5\u0162\u00b2\2\u0693\u0694\7\u015b\2\2\u0694\u069c\5\u0162\u00b2\2\u0695"+
		"\u0696\7\u0157\2\2\u0696\u0697\5\u0162\u00b2\2\u0697\u0698\7\u015b\2\2"+
		"\u0698\u0699\5\u0162\u00b2\2\u0699\u069b\3\2\2\2\u069a\u0695\3\2\2\2\u069b"+
		"\u069e\3\2\2\2\u069c\u069a\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069f\3\2"+
		"\2\2\u069e\u069c\3\2\2\2\u069f\u06a3\7\u0168\2\2\u06a0\u06a2\5^\60\2\u06a1"+
		"\u06a0\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a3\u06a4\3\2"+
		"\2\2\u06a4\u00bf\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a6\u06aa\5\u00c2b\2\u06a7"+
		"\u06aa\5\u00c4c\2\u06a8\u06aa\5\u00c6d\2\u06a9\u06a6\3\2\2\2\u06a9\u06a7"+
		"\3\2\2\2\u06a9\u06a8\3\2\2\2\u06aa\u00c1\3\2\2\2\u06ab\u06ad\7=\2\2\u06ac"+
		"\u06ab\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06b1\7\u00f5"+
		"\2\2\u06af\u06b1\7>\2\2\u06b0\u06ac\3\2\2\2\u06b0\u06af\3\2\2\2\u06b1"+
		"\u06b3\3\2\2\2\u06b2\u06b4\7\u015b\2\2\u06b3\u06b2\3\2\2\2\u06b3\u06b4"+
		"\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\5\u0132\u009a\2\u06b6\u00c3\3"+
		"\2\2\2\u06b7\u06b8\t\33\2\2\u06b8\u06b9\t\34\2\2\u06b9\u00c5\3\2\2\2\u06ba"+
		"\u06bb\7\u00da\2\2\u06bb\u06be\7\u015b\2\2\u06bc\u06bf\5\u0132\u009a\2"+
		"\u06bd\u06bf\7\u00bc\2\2\u06be\u06bc\3\2\2\2\u06be\u06bd\3\2\2\2\u06bf"+
		"\u06c1\3\2\2\2\u06c0\u06c2\7\u0127\2\2\u06c1\u06c0\3\2\2\2\u06c1\u06c2"+
		"\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c4\7p\2\2\u06c4\u06c5\t\35\2\2\u06c5"+
		"\u00c7\3\2\2\2\u06c6\u06c7\7\u0134\2\2\u06c7\u06c8\5\u0122\u0092\2\u06c8"+
		"\u06c9\t\36\2\2\u06c9\u06ca\5\4\3\2\u06ca\u06cc\7`\2\2\u06cb\u06cd\t\37"+
		"\2\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u00c9\3\2\2\2\u06ce"+
		"\u06d5\7\u0178\2\2\u06cf\u06d0\7\u0161\2\2\u06d0\u06d1\7\u0161\2\2\u06d1"+
		"\u06d2\7\u016e\2\2\u06d2\u06d3\7\u015f\2\2\u06d3\u06d5\7\u015f\2\2\u06d4"+
		"\u06ce\3\2\2\2\u06d4\u06cf\3\2\2\2\u06d5\u00cb\3\2\2\2\u06d6\u06d7\7\u012a"+
		"\2\2\u06d7\u06dc\5\u0132\u009a\2\u06d8\u06d9\7\u0157\2\2\u06d9\u06db\5"+
		"\u0132\u009a\2\u06da\u06d8\3\2\2\2\u06db\u06de\3\2\2\2\u06dc\u06da\3\2"+
		"\2\2\u06dc\u06dd\3\2\2\2\u06dd\u00cd\3\2\2\2\u06de\u06dc\3\2\2\2\u06df"+
		"\u06e0\7\u00fb\2\2\u06e0\u06e5\5\u00d0i\2\u06e1\u06e2\7\u0157\2\2\u06e2"+
		"\u06e4\5\u00d0i\2\u06e3\u06e1\3\2\2\2\u06e4\u06e7\3\2\2\2\u06e5\u06e3"+
		"\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e8\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e8"+
		"\u06e9\7t\2\2\u06e9\u06ed\5\u00d6l\2\u06ea\u06ec\5\u00dan\2\u06eb\u06ea"+
		"\3\2\2\2\u06ec\u06ef\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee"+
		"\u06f2\3\2\2\2\u06ef\u06ed\3\2\2\2\u06f0\u06f1\7\u0133\2\2\u06f1\u06f3"+
		"\5\u00dep\2\u06f2\u06f0\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f5\3\2\2"+
		"\2\u06f4\u06f6\5\u0116\u008c\2\u06f5\u06f4\3\2\2\2\u06f5\u06f6\3\2\2\2"+
		"\u06f6\u06f8\3\2\2\2\u06f7\u06f9\5\u0118\u008d\2\u06f8\u06f7\3\2\2\2\u06f8"+
		"\u06f9\3\2\2\2\u06f9\u06fb\3\2\2\2\u06fa\u06fc\5\u011c\u008f\2\u06fb\u06fa"+
		"\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fe\3\2\2\2\u06fd\u06ff\5\u011e\u0090"+
		"\2\u06fe\u06fd\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0701"+
		"\7\u016a\2\2\u0701\u00cf\3\2\2\2\u0702\u0707\5\u00fa~\2\u0703\u0707\5"+
		"\u00d2j\2\u0704\u0707\5\u00d4k\2\u0705\u0707\5\u0134\u009b\2\u0706\u0702"+
		"\3\2\2\2\u0706\u0703\3\2\2\2\u0706\u0704\3\2\2\2\u0706\u0705\3\2\2\2\u0707"+
		"\u00d1\3\2\2\2\u0708\u070a\5\u0148\u00a5\2\u0709\u070b\5\u00f8}\2\u070a"+
		"\u0709\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u00d3\3\2\2\2\u070c\u070d\5\u0162"+
		"\u00b2\2\u070d\u070e\7\u016d\2\2\u070e\u070f\5\u0134\u009b\2\u070f\u00d5"+
		"\3\2\2\2\u0710\u0713\5\u0102\u0082\2\u0711\u0713\5\u00d8m\2\u0712\u0710"+
		"\3\2\2\2\u0712\u0711\3\2\2\2\u0713\u00d7\3\2\2\2\u0714\u0715\7\u0165\2"+
		"\2\u0715\u0716\5\u00ceh\2\u0716\u0718\7\u0168\2\2\u0717\u0719\5\u010e"+
		"\u0088\2\u0718\u0717\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u00d9\3\2\2\2\u071a"+
		"\u071b\7\u0157\2\2\u071b\u0722\5\u00d6l\2\u071c\u071d\5\u0108\u0085\2"+
		"\u071d\u071e\5\u00d6l\2\u071e\u071f\7\u00c4\2\2\u071f\u0720\5\u00dco\2"+
		"\u0720\u0722\3\2\2\2\u0721\u071a\3\2\2\2\u0721\u071c\3\2\2\2\u0722\u00db"+
		"\3\2\2\2\u0723\u0724\5\u0110\u0089\2\u0724\u0725\7\u016d\2\2\u0725\u0726"+
		"\5\u0162\u00b2\2\u0726\u0727\5\u0084C\2\u0727\u0728\5\u0110\u0089\2\u0728"+
		"\u0729\7\u016d\2\2\u0729\u072a\5\u0162\u00b2\2\u072a\u00dd\3\2\2\2\u072b"+
		"\u072c\5\u0122\u0092\2\u072c\u00df\3\2\2\2\u072d\u072f\5\u00e2r\2\u072e"+
		"\u072d\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0731\5\u00e8"+
		"u\2\u0731\u0732\bq\1\2\u0732\u00e1\3\2\2\2\u0733\u0734\7\u0135\2\2\u0734"+
		"\u0739\5\u00e4s\2\u0735\u0736\7\u0157\2\2\u0736\u0738\5\u00e4s\2\u0737"+
		"\u0735\3\2\2\2\u0738\u073b\3\2\2\2\u0739\u0737\3\2\2\2\u0739\u073a\3\2"+
		"\2\2\u073a\u00e3\3\2\2\2\u073b\u0739\3\2\2\2\u073c\u073e\5\u0162\u00b2"+
		"\2\u073d\u073f\5\u00e6t\2\u073e\u073d\3\2\2\2\u073e\u073f\3\2\2\2\u073f"+
		"\u0740\3\2\2\2\u0740\u0741\7\f\2\2\u0741\u0742\7\u0165\2\2\u0742\u0743"+
		"\5\u00e8u\2\u0743\u0744\7\u0168\2\2\u0744\u00e5\3\2\2\2\u0745\u0746\7"+
		"\u0165\2\2\u0746\u074b\5\u0162\u00b2\2\u0747\u0748\7\u0157\2\2\u0748\u074a"+
		"\5\u0162\u00b2\2\u0749\u0747\3\2\2\2\u074a\u074d\3\2\2\2\u074b\u0749\3"+
		"\2\2\2\u074b\u074c\3\2\2\2\u074c\u074e\3\2\2\2\u074d\u074b\3\2\2\2\u074e"+
		"\u074f\7\u0168\2\2\u074f\u00e7\3\2\2\2\u0750\u0756\5\u00eav\2\u0751\u0752"+
		"\5\u00ecw\2\u0752\u0753\5\u00eav\2\u0753\u0755\3\2\2\2\u0754\u0751\3\2"+
		"\2\2\u0755\u0758\3\2\2\2\u0756\u0754\3\2\2\2\u0756\u0757\3\2\2\2\u0757"+
		"\u0759\3\2\2\2\u0758\u0756\3\2\2\2\u0759\u075a\bu\1\2\u075a\u00e9\3\2"+
		"\2\2\u075b\u075c\5\u00eex\2\u075c\u075d\bv\1\2\u075d\u0763\3\2\2\2\u075e"+
		"\u075f\7\u0165\2\2\u075f\u0760\5\u00e8u\2\u0760\u0761\7\u0168\2\2\u0761"+
		"\u0763\3\2\2\2\u0762\u075b\3\2\2\2\u0762\u075e\3\2\2\2\u0763\u00eb\3\2"+
		"\2\2\u0764\u0766\7\u0125\2\2\u0765\u0767\7\6\2\2\u0766\u0765\3\2\2\2\u0766"+
		"\u0767\3\2\2\2\u0767\u0771\3\2\2\2\u0768\u076a\7c\2\2\u0769\u076b\7\6"+
		"\2\2\u076a\u0769\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u0771\3\2\2\2\u076c"+
		"\u076e\7\u0091\2\2\u076d\u076f\7\6\2\2\u076e\u076d\3\2\2\2\u076e\u076f"+
		"\3\2\2\2\u076f\u0771\3\2\2\2\u0770\u0764\3\2\2\2\u0770\u0768\3\2\2\2\u0770"+
		"\u076c\3\2\2\2\u0771\u00ed\3\2\2\2\u0772\u0773\bx\1\2\u0773\u0774\t \2"+
		"\2\u0774\u0776\5\u00f0y\2\u0775\u0777\5\u00fc\177\2\u0776\u0775\3\2\2"+
		"\2\u0776\u0777\3\2\2\2\u0777\u0779\3\2\2\2\u0778\u077a\5\u00fe\u0080\2"+
		"\u0779\u0778\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077c\3\2\2\2\u077b\u077d"+
		"\5\u0112\u008a\2\u077c\u077b\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u077f\3"+
		"\2\2\2\u077e\u0780\5\u0116\u008c\2\u077f\u077e\3\2\2\2\u077f\u0780\3\2"+
		"\2\2\u0780\u0783\3\2\2\2\u0781\u0784\5\u0118\u008d\2\u0782\u0784\5\u011a"+
		"\u008e\2\u0783\u0781\3\2\2\2\u0783\u0782\3\2\2\2\u0783\u0784\3\2\2\2\u0784"+
		"\u0786\3\2\2\2\u0785\u0787\5\u011c\u008f\2\u0786\u0785\3\2\2\2\u0786\u0787"+
		"\3\2\2\2\u0787\u0789\3\2\2\2\u0788\u078a\5\u011e\u0090\2\u0789\u0788\3"+
		"\2\2\2\u0789\u078a\3\2\2\2\u078a\u078b\3\2\2\2\u078b\u078c\bx\1\2\u078c"+
		"\u00ef\3\2\2\2\u078d\u078f\5\u00f2z\2\u078e\u078d\3\2\2\2\u078e\u078f"+
		"\3\2\2\2\u078f\u0791\3\2\2\2\u0790\u0792\5\u00f4{\2\u0791\u0790\3\2\2"+
		"\2\u0791\u0792\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0794\5\u00f6|\2\u0794"+
		"\u079b\by\1\2\u0795\u0796\7\u0157\2\2\u0796\u0797\5\u00f6|\2\u0797\u0798"+
		"\by\1\2\u0798\u079a\3\2\2\2\u0799\u0795\3\2\2\2\u079a\u079d\3\2\2\2\u079b"+
		"\u0799\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u00f1\3\2\2\2\u079d\u079b\3\2"+
		"\2\2\u079e\u079f\t!\2\2\u079f\u00f3\3\2\2\2\u07a0\u07a1\7\u0120\2\2\u07a1"+
		"\u07a2\5\u0132\u009a\2\u07a2\u00f5\3\2\2\2\u07a3\u07a4\5\u0162\u00b2\2"+
		"\u07a4\u07a5\7\u015b\2\2\u07a5\u07a7\3\2\2\2\u07a6\u07a3\3\2\2\2\u07a6"+
		"\u07a7\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07aa\5\u0132\u009a\2\u07a9\u07ab"+
		"\5\u00f8}\2\u07aa\u07a9\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ae\3\2\2"+
		"\2\u07ac\u07ae\5\u00fa~\2\u07ad\u07a6\3\2\2\2\u07ad\u07ac\3\2\2\2\u07ae"+
		"\u07af\3\2\2\2\u07af\u07b0\b|\1\2\u07b0\u00f7\3\2\2\2\u07b1\u07b3\6}\n"+
		"\2\u07b2\u07b4\7\f\2\2\u07b3\u07b2\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b5"+
		"\3\2\2\2\u07b5\u07bb\5\u0162\u00b2\2\u07b6\u07b7\7\u0165\2\2\u07b7\u07b8"+
		"\7\u011e\2\2\u07b8\u07b9\7\u016f\2\2\u07b9\u07bb\7\u0168\2\2\u07ba\u07b1"+
		"\3\2\2\2\u07ba\u07b6\3\2\2\2\u07bb\u00f9\3\2\2\2\u07bc\u07bd\7\u016e\2"+
		"\2\u07bd\u07bf\7\u016d\2\2\u07be\u07bc\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf"+
		"\u07c0\3\2\2\2\u07c0\u07c1\7\u0163\2\2\u07c1\u00fb\3\2\2\2\u07c2\u07c3"+
		"\7\u0093\2\2\u07c3\u07c8\5\u0162\u00b2\2\u07c4\u07c5\7\u0157\2\2\u07c5"+
		"\u07c7\5\u0162\u00b2\2\u07c6\u07c4\3\2\2\2\u07c7\u07ca\3\2\2\2\u07c8\u07c6"+
		"\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u00fd\3\2\2\2\u07ca\u07c8\3\2\2\2\u07cb"+
		"\u07cc\7t\2\2\u07cc\u07d0\5\u0100\u0081\2\u07cd\u07cf\5\u0106\u0084\2"+
		"\u07ce\u07cd\3\2\2\2\u07cf\u07d2\3\2\2\2\u07d0\u07ce\3\2\2\2\u07d0\u07d1"+
		"\3\2\2\2\u07d1\u07d3\3\2\2\2\u07d2\u07d0\3\2\2\2\u07d3\u07d4\b\u0080\1"+
		"\2\u07d4\u00ff\3\2\2\2\u07d5\u07d9\5\u0102\u0082\2\u07d6\u07d9\5\u0104"+
		"\u0083\2\u07d7\u07d9\5\u010a\u0086\2\u07d8\u07d5\3\2\2\2\u07d8\u07d6\3"+
		"\2\2\2\u07d8\u07d7\3\2\2\2\u07d9\u0101\3\2\2\2\u07da\u07dc\5\u0110\u0089"+
		"\2\u07db\u07dd\5\u010e\u0088\2\u07dc\u07db\3\2\2\2\u07dc\u07dd\3\2\2\2"+
		"\u07dd\u0103\3\2\2\2\u07de\u07df\7\u0165\2\2\u07df\u07e0\5\u00e0q\2\u07e0"+
		"\u07e2\7\u0168\2\2\u07e1\u07e3\5\u010e\u0088\2\u07e2\u07e1\3\2\2\2\u07e2"+
		"\u07e3\3\2\2\2\u07e3\u0105\3\2\2\2\u07e4\u07e5\7\u0157\2\2\u07e5\u07ec"+
		"\5\u0100\u0081\2\u07e6\u07e7\5\u0108\u0085\2\u07e7\u07e8\5\u0100\u0081"+
		"\2\u07e8\u07e9\7\u00c4\2\2\u07e9\u07ea\5\u0122\u0092\2\u07ea\u07ec\3\2"+
		"\2\2\u07eb\u07e4\3\2\2\2\u07eb\u07e6\3\2\2\2\u07ec\u0107\3\2\2\2\u07ed"+
		"\u07ef\7\u008a\2\2\u07ee\u07ed\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u07f0"+
		"\3\2\2\2\u07f0\u07f7\7\u0098\2\2\u07f1\u07f3\t\"\2\2\u07f2\u07f4\7\u00ca"+
		"\2\2\u07f3\u07f2\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5"+
		"\u07f7\7\u0098\2\2\u07f6\u07ee\3\2\2\2\u07f6\u07f1\3\2\2\2\u07f7\u0109"+
		"\3\2\2\2\u07f8\u07f9\7\u0116\2\2\u07f9\u07fa\7\u0165\2\2\u07fa\u07fb\7"+
		"\u012c\2\2\u07fb\u0800\5\u010c\u0087\2\u07fc\u07fd\7\u0157\2\2\u07fd\u07ff"+
		"\5\u010c\u0087\2\u07fe\u07fc\3\2\2\2\u07ff\u0802\3\2\2\2\u0800\u07fe\3"+
		"\2\2\2\u0800\u0801\3\2\2\2\u0801\u0803\3\2\2\2\u0802\u0800\3\2\2\2\u0803"+
		"\u0805\7\u0168\2\2\u0804\u0806\5\u010e\u0088\2\u0805\u0804\3\2\2\2\u0805"+
		"\u0806\3\2\2\2\u0806\u010b\3\2\2\2\u0807\u0814\5\u0132\u009a\2\u0808\u0809"+
		"\7\u0165\2\2\u0809\u080e\5\u0132\u009a\2\u080a\u080b\7\u0157\2\2\u080b"+
		"\u080d\5\u0132\u009a\2\u080c\u080a\3\2\2\2\u080d\u0810\3\2\2\2\u080e\u080c"+
		"\3\2\2\2\u080e\u080f\3\2\2\2\u080f\u0811\3\2\2\2\u0810\u080e\3\2\2\2\u0811"+
		"\u0812\7\u0168\2\2\u0812\u0814\3\2\2\2\u0813\u0807\3\2\2\2\u0813\u0808"+
		"\3\2\2\2\u0814\u010d\3\2\2\2\u0815\u0817\6\u0088\13\2\u0816\u0818\7\f"+
		"\2\2\u0817\u0816\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u0819\3\2\2\2\u0819"+
		"\u0824\5\u0162\u00b2\2\u081a\u081b\7\u0165\2\2\u081b\u0820\7\u016e\2\2"+
		"\u081c\u081d\7\u0157\2\2\u081d\u081f\7\u016e\2\2\u081e\u081c\3\2\2\2\u081f"+
		"\u0822\3\2\2\2\u0820\u081e\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0823\3\2"+
		"\2\2\u0822\u0820\3\2\2\2\u0823\u0825\7\u0168\2\2\u0824\u081a\3\2\2\2\u0824"+
		"\u0825\3\2\2\2\u0825\u010f\3\2\2\2\u0826\u0827\5\u0162\u00b2\2\u0827\u0111"+
		"\3\2\2\2\u0828\u082c\5\u0114\u008b\2\u0829\u082a\7\u0133\2\2\u082a\u082c"+
		"\5\u0122\u0092\2\u082b\u0828\3\2\2\2\u082b\u0829\3\2\2\2\u082c\u0113\3"+
		"\2\2\2\u082d\u082e\7\u0133\2\2\u082e\u082f\5\u0162\u00b2\2\u082f\u0115"+
		"\3\2\2\2\u0830\u0831\7{\2\2\u0831\u0832\7\34\2\2\u0832\u0837\5\u0132\u009a"+
		"\2\u0833\u0834\7\u0157\2\2\u0834\u0836\5\u0132\u009a\2\u0835\u0833\3\2"+
		"\2\2\u0836\u0839\3\2\2\2\u0837\u0835\3\2\2\2\u0837\u0838\3\2\2\2\u0838"+
		"\u0117\3\2\2\2\u0839\u0837\3\2\2\2\u083a\u083b\7~\2\2\u083b\u083c\5\u0122"+
		"\u0092\2\u083c\u0119\3\2\2\2\u083d\u083e\7\u00d9\2\2\u083e\u083f\5\u0122"+
		"\u0092\2\u083f\u011b\3\2\2\2\u0840\u0841\7\u00c8\2\2\u0841\u0842\7\34"+
		"\2\2\u0842\u0844\5\u0132\u009a\2\u0843\u0845\t\7\2\2\u0844\u0843\3\2\2"+
		"\2\u0844\u0845\3\2\2\2\u0845\u084d\3\2\2\2\u0846\u0847\7\u0157\2\2\u0847"+
		"\u0849\5\u0132\u009a\2\u0848\u084a\t\7\2\2\u0849\u0848\3\2\2\2\u0849\u084a"+
		"\3\2\2\2\u084a\u084c\3\2\2\2\u084b\u0846\3\2\2\2\u084c\u084f\3\2\2\2\u084d"+
		"\u084b\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u011d\3\2\2\2\u084f\u084d\3\2"+
		"\2\2\u0850\u0852\5\u0120\u0091\2\u0851\u0850\3\2\2\2\u0852\u0853\3\2\2"+
		"\2\u0853\u0851\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u011f\3\2\2\2\u0855\u0856"+
		"\7\u00a0\2\2\u0856\u0861\5\u0132\u009a\2\u0857\u0858\7\u0135\2\2\u0858"+
		"\u085e\t#\2\2\u0859\u085a\7\u0129\2\2\u085a\u085b\7\t\2\2\u085b\u085c"+
		"\7\u0099\2\2\u085c\u085d\t$\2\2\u085d\u085f\7\u00a6\2\2\u085e\u0859\3"+
		"\2\2\2\u085e\u085f\3\2\2\2\u085f\u0861\3\2\2\2\u0860\u0855\3\2\2\2\u0860"+
		"\u0857\3\2\2\2\u0861\u0121\3\2\2\2\u0862\u0864\b\u0092\1\2\u0863\u0865"+
		"\7\u00bd\2\2\u0864\u0863\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0866\3\2\2"+
		"\2\u0866\u0867\7\u0165\2\2\u0867\u0868\5\u0122\u0092\2\u0868\u0869\7\u0168"+
		"\2\2\u0869\u086c\3\2\2\2\u086a\u086c\5\u0124\u0093\2\u086b\u0862\3\2\2"+
		"\2\u086b\u086a\3\2\2\2\u086c\u0873\3\2\2\2\u086d\u086e\f\4\2\2\u086e\u086f"+
		"\5\u012e\u0098\2\u086f\u0870\5\u0122\u0092\5\u0870\u0872\3\2\2\2\u0871"+
		"\u086d\3\2\2\2\u0872\u0875\3\2\2\2\u0873\u0871\3\2\2\2\u0873\u0874\3\2"+
		"\2\2\u0874\u0123\3\2\2\2\u0875\u0873\3\2\2\2\u0876\u087a\5\u0126\u0094"+
		"\2\u0877\u087a\5\u012c\u0097\2\u0878\u087a\5\u0132\u009a\2\u0879\u0876"+
		"\3\2\2\2\u0879\u0877\3\2\2\2\u0879\u0878\3\2\2\2\u087a\u0125\3\2\2\2\u087b"+
		"\u087c\5\u0132\u009a\2\u087c\u087e\7\u0095\2\2\u087d\u087f\7\u00bd\2\2"+
		"\u087e\u087d\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0881"+
		"\7\u00bf\2\2\u0881\u0893\3\2\2\2\u0882\u0883\5\u0132\u009a\2\u0883\u0884"+
		"\7\24\2\2\u0884\u0885\5\u0132\u009a\2\u0885\u0886\7\t\2\2\u0886\u0887"+
		"\5\u0132\u009a\2\u0887\u0893\3\2\2\2\u0888\u088a\7\u00bd\2\2\u0889\u0888"+
		"\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u088c\7h\2\2\u088c"+
		"\u088d\7\u0165\2\2\u088d\u088e\5\u00e0q\2\u088e\u088f\7\u0168\2\2\u088f"+
		"\u0893\3\2\2\2\u0890\u0893\5\u0128\u0095\2\u0891\u0893\5\u012a\u0096\2"+
		"\u0892\u087b\3\2\2\2\u0892\u0882\3\2\2\2\u0892\u0889\3\2\2\2\u0892\u0890"+
		"\3\2\2\2\u0892\u0891\3\2\2\2\u0893\u0127\3\2\2\2\u0894\u0896\5\u0132\u009a"+
		"\2\u0895\u0897\7\u00bd\2\2\u0896\u0895\3\2\2\2\u0896\u0897\3\2\2\2\u0897"+
		"\u0898\3\2\2\2\u0898\u0899\7\u0086\2\2\u0899\u08a3\7\u0165\2\2\u089a\u089f"+
		"\5\u0132\u009a\2\u089b\u089c\7\u0157\2\2\u089c\u089e\5\u0132\u009a\2\u089d"+
		"\u089b\3\2\2\2\u089e\u08a1\3\2\2\2\u089f\u089d\3\2\2\2\u089f\u08a0\3\2"+
		"\2\2\u08a0\u08a4\3\2\2\2\u08a1\u089f\3\2\2\2\u08a2\u08a4\5\u00e0q\2\u08a3"+
		"\u089a\3\2\2\2\u08a3\u08a2\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a6\7\u0168"+
		"\2\2\u08a6\u0129\3\2\2\2\u08a7\u08a8\7\u0165\2\2\u08a8\u08ad\5\u0132\u009a"+
		"\2\u08a9\u08aa\7\u0157\2\2\u08aa\u08ac\5\u0132\u009a\2\u08ab\u08a9\3\2"+
		"\2\2\u08ac\u08af\3\2\2\2\u08ad\u08ab\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae"+
		"\u08b0\3\2\2\2\u08af\u08ad\3\2\2\2\u08b0\u08b2\7\u0168\2\2\u08b1\u08b3"+
		"\7\u00bd\2\2\u08b2\u08b1\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b4\3\2\2"+
		"\2\u08b4\u08b5\7\u0086\2\2\u08b5\u08b6\7\u0165\2\2\u08b6\u08b7\5\u00e0"+
		"q\2\u08b7\u08b8\7\u0168\2\2\u08b8\u012b\3\2\2\2\u08b9\u08ba\5\u0132\u009a"+
		"\2\u08ba\u08bb\5\u0130\u0099\2\u08bb\u08bc\5\u0132\u009a\2\u08bc\u012d"+
		"\3\2\2\2\u08bd\u08be\t%\2\2\u08be\u012f\3\2\2\2\u08bf\u08cc\7\u015b\2"+
		"\2\u08c0\u08cc\7\u015c\2\2\u08c1\u08cc\7\u015d\2\2\u08c2\u08cc\7\u015e"+
		"\2\2\u08c3\u08cc\7\u0161\2\2\u08c4\u08cc\7\u0162\2\2\u08c5\u08cc\7\u015f"+
		"\2\2\u08c6\u08cc\7\u0160\2\2\u08c7\u08c9\7\u00bd\2\2\u08c8\u08c7\3\2\2"+
		"\2\u08c8\u08c9\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cc\t&\2\2\u08cb\u08bf"+
		"\3\2\2\2\u08cb\u08c0\3\2\2\2\u08cb\u08c1\3\2\2\2\u08cb\u08c2\3\2\2\2\u08cb"+
		"\u08c3\3\2\2\2\u08cb\u08c4\3\2\2\2\u08cb\u08c5\3\2\2\2\u08cb\u08c6\3\2"+
		"\2\2\u08cb\u08c8\3\2\2\2\u08cc\u0131\3\2\2\2\u08cd\u08e5\b\u009a\1\2\u08ce"+
		"\u08cf\7\u0165\2\2\u08cf\u08d0\5\u00e0q\2\u08d0\u08d1\7\u0168\2\2\u08d1"+
		"\u08e5\3\2\2\2\u08d2\u08d3\7\u0165\2\2\u08d3\u08d4\5\u0132\u009a\2\u08d4"+
		"\u08d5\7\u0168\2\2\u08d5\u08e5\3\2\2\2\u08d6\u08e5\5\u0138\u009d\2\u08d7"+
		"\u08e5\5\u013c\u009f\2\u08d8\u08e5\5\u0140\u00a1\2\u08d9\u08e5\5\u0146"+
		"\u00a4\2\u08da\u08e5\5\u0148\u00a5\2\u08db\u08e5\5\u0150\u00a9\2\u08dc"+
		"\u08e5\5\u0152\u00aa\2\u08dd\u08e5\5\u0136\u009c\2\u08de\u08df\5\u0162"+
		"\u00b2\2\u08df\u08e0\t\'\2\2\u08e0\u08e1\7\u015b\2\2\u08e1\u08e2\t\25"+
		"\2\2\u08e2\u08e5\3\2\2\2\u08e3\u08e5\7\u0163\2\2\u08e4\u08cd\3\2\2\2\u08e4"+
		"\u08ce\3\2\2\2\u08e4\u08d2\3\2\2\2\u08e4\u08d6\3\2\2\2\u08e4\u08d7\3\2"+
		"\2\2\u08e4\u08d8\3\2\2\2\u08e4\u08d9\3\2\2\2\u08e4\u08da\3\2\2\2\u08e4"+
		"\u08db\3\2\2\2\u08e4\u08dc\3\2\2\2\u08e4\u08dd\3\2\2\2\u08e4\u08de\3\2"+
		"\2\2\u08e4\u08e3\3\2\2\2\u08e5\u08f6\3\2\2\2\u08e6\u08e7\f\22\2\2\u08e7"+
		"\u08e8\7\u0163\2\2\u08e8\u08f5\5\u0132\u009a\23\u08e9\u08ea\f\21\2\2\u08ea"+
		"\u08eb\7\u0159\2\2\u08eb\u08f5\5\u0132\u009a\22\u08ec\u08ed\f\20\2\2\u08ed"+
		"\u08ee\7\u0155\2\2\u08ee\u08f5\5\u0132";
	private static final String _serializedATNSegment1 =
		"\u009a\21\u08ef\u08f0\f\17\2\2\u08f0\u08f1\7\u016b\2\2\u08f1\u08f5\5\u0132"+
		"\u009a\20\u08f2\u08f3\f\23\2\2\u08f3\u08f5\5\u013a\u009e\2\u08f4\u08e6"+
		"\3\2\2\2\u08f4\u08e9\3\2\2\2\u08f4\u08ec\3\2\2\2\u08f4\u08ef\3\2\2\2\u08f4"+
		"\u08f2\3\2\2\2\u08f5\u08f8\3\2\2\2\u08f6\u08f4\3\2\2\2\u08f6\u08f7\3\2"+
		"\2\2\u08f7\u0133\3\2\2\2\u08f8\u08f6\3\2\2\2\u08f9\u08fb\5\u0162\u00b2"+
		"\2\u08fa\u08fc\5\u00f8}\2\u08fb\u08fa\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc"+
		"\u0135\3\2\2\2\u08fd\u090a\5\u015e\u00b0\2\u08fe\u090a\5\u0160\u00b1\2"+
		"\u08ff\u090a\5\u016a\u00b6\2\u0900\u0901\5\u0110\u0089\2\u0901\u0902\7"+
		"\u016d\2\2\u0902\u0903\5\u0134\u009b\2\u0903\u090a\3\2\2\2\u0904\u090a"+
		"\5\u0162\u00b2\2\u0905\u090a\5\u0164\u00b3\2\u0906\u090a\5\u0168\u00b5"+
		"\2\u0907\u090a\5\u0166\u00b4\2\u0908\u090a\5\u016c\u00b7\2\u0909\u08fd"+
		"\3\2\2\2\u0909\u08fe\3\2\2\2\u0909\u08ff\3\2\2\2\u0909\u0900\3\2\2\2\u0909"+
		"\u0904\3\2\2\2\u0909\u0905\3\2\2\2\u0909\u0906\3\2\2\2\u0909\u0907\3\2"+
		"\2\2\u0909\u0908\3\2\2\2\u090a\u0137\3\2\2\2\u090b\u090c\7\u0092\2\2\u090c"+
		"\u090d\5\u0132\u009a\2\u090d\u090e\5\u013a\u009e\2\u090e\u0139\3\2\2\2"+
		"\u090f\u0910\t(\2\2\u0910\u013b\3\2\2\2\u0911\u0912\5\u013e\u00a0\2\u0912"+
		"\u0913\t)\2\2\u0913\u0918\5\u013e\u00a0\2\u0914\u0915\t)\2\2\u0915\u0917"+
		"\5\u013e\u00a0\2\u0916\u0914\3\2\2\2\u0917\u091a\3\2\2\2\u0918\u0916\3"+
		"\2\2\2\u0918\u0919\3\2\2\2\u0919\u013d\3\2\2\2\u091a\u0918\3\2\2\2\u091b"+
		"\u091c\7\u0165\2\2\u091c\u091d\5\u0132\u009a\2\u091d\u091e\7\u0168\2\2"+
		"\u091e\u0925\3\2\2\2\u091f\u0925\5\u0140\u00a1\2\u0920\u0925\5\u0148\u00a5"+
		"\2\u0921\u0925\5\u0150\u00a9\2\u0922\u0925\5\u0152\u00aa\2\u0923\u0925"+
		"\5\u0136\u009c\2\u0924\u091b\3\2\2\2\u0924\u091f\3\2\2\2\u0924\u0920\3"+
		"\2\2\2\u0924\u0921\3\2\2\2\u0924\u0922\3\2\2\2\u0924\u0923\3\2\2\2\u0925"+
		"\u013f\3\2\2\2\u0926\u0929\5\u0142\u00a2\2\u0927\u0929\5\u0144\u00a3\2"+
		"\u0928\u0926\3\2\2\2\u0928\u0927\3\2\2\2\u0929\u0141\3\2\2\2\u092a\u092b"+
		"\7!\2\2\u092b\u0931\5\u0132\u009a\2\u092c\u092d\7\u0132\2\2\u092d\u092e"+
		"\5\u0132\u009a\2\u092e\u092f\7\u011b\2\2\u092f\u0930\5\u0132\u009a\2\u0930"+
		"\u0932\3\2\2\2\u0931\u092c\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0931\3\2"+
		"\2\2\u0933\u0934\3\2\2\2\u0934\u0937\3\2\2\2\u0935\u0936\7\\\2\2\u0936"+
		"\u0938\5\u0132\u009a\2\u0937\u0935\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u0939"+
		"\3\2\2\2\u0939\u093a\7`\2\2\u093a\u0143\3\2\2\2\u093b\u0941\7!\2\2\u093c"+
		"\u093d\7\u0132\2\2\u093d\u093e\5\u0122\u0092\2\u093e\u093f\7\u011b\2\2"+
		"\u093f\u0940\5\u0132\u009a\2\u0940\u0942\3\2\2\2\u0941\u093c\3\2\2\2\u0942"+
		"\u0943\3\2\2\2\u0943\u0941\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0947\3\2"+
		"\2\2\u0945\u0946\7\\\2\2\u0946\u0948\5\u0132\u009a\2\u0947\u0945\3\2\2"+
		"\2\u0947\u0948\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094a\7`\2\2\u094a\u0145"+
		"\3\2\2\2\u094b\u094c\5\u0162\u00b2\2\u094c\u094d\7\3\2\2\u094d\u094e\t"+
		"*\2\2\u094e\u0147\3\2\2\2\u094f\u0950\7\21\2\2\u0950\u0952\7\u0165\2\2"+
		"\u0951\u0953\5\u014a\u00a6\2\u0952\u0951\3\2\2\2\u0952\u0953\3\2\2\2\u0953"+
		"\u0954\3\2\2\2\u0954\u0955\5\u0132\u009a\2\u0955\u0957\7\u0168\2\2\u0956"+
		"\u0958\5\u014c\u00a7\2\u0957\u0956\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u09ea"+
		"\3\2\2\2\u0959\u095a\7\67\2\2\u095a\u095c\7\u0165\2\2\u095b\u095d\5\u014a"+
		"\u00a6\2\u095c\u095b\3\2\2\2\u095c\u095d\3\2\2\2\u095d\u095e\3\2\2\2\u095e"+
		"\u095f\5\u0132\u009a\2\u095f\u0961\7\u0168\2\2\u0960\u0962\5\u014c\u00a7"+
		"\2\u0961\u0960\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u09ea\3\2\2\2\u0963\u0964"+
		"\78\2\2\u0964\u0966\7\u0165\2\2\u0965\u0967\5\u014a\u00a6\2\u0966\u0965"+
		"\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0968\3\2\2\2\u0968\u0969\5\u0132\u009a"+
		"\2\u0969\u096b\7\u0168\2\2\u096a\u096c\5\u014c\u00a7\2\u096b\u096a\3\2"+
		"\2\2\u096b\u096c\3\2\2\2\u096c\u09ea\3\2\2\2\u096d\u096e\7\u013e\2\2\u096e"+
		"\u096f\7\u0165\2\2\u096f\u0970\5\u0132\u009a\2\u0970\u0971\7\u0168\2\2"+
		"\u0971\u0972\5\u014c\u00a7\2\u0972\u09ea\3\2\2\2\u0973\u0974\7\u0142\2"+
		"\2\u0974\u0975\7\u0165\2\2\u0975\u0976\5\u0132\u009a\2\u0976\u0977\7\u0168"+
		"\2\2\u0977\u0978\5\u014c\u00a7\2\u0978\u09ea\3\2\2\2\u0979\u097a\7\u0143"+
		"\2\2\u097a\u097b\7\u0165\2\2\u097b\u097c\5\u0132\u009a\2\u097c\u097d\7"+
		"\u0168\2\2\u097d\u097e\5\u014c\u00a7\2\u097e\u09ea\3\2\2\2\u097f\u0980"+
		"\7\u0144\2\2\u0980\u0981\7\u0165\2\2\u0981\u0988\5\u0132\u009a\2\u0982"+
		"\u0983\7\u0157\2\2\u0983\u0986\5\u0132\u009a\2\u0984\u0985\7\u0157\2\2"+
		"\u0985\u0987\5\u0132\u009a\2\u0986\u0984\3\2\2\2\u0986\u0987\3\2\2\2\u0987"+
		"\u0989\3\2\2\2\u0988\u0982\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098a\3\2"+
		"\2\2\u098a\u098b\7\u0168\2\2\u098b\u098c\5\u014c\u00a7\2\u098c\u09ea\3"+
		"\2\2\2\u098d\u098e\7\u0145\2\2\u098e\u098f\7\u0165\2\2\u098f\u0990\5\u0132"+
		"\u009a\2\u0990\u0991\7\u0168\2\2\u0991\u0992\5\u014c\u00a7\2\u0992\u09ea"+
		"\3\2\2\2\u0993\u0994\7\u0146\2\2\u0994\u0995\7\u0165\2\2\u0995\u099c\5"+
		"\u0132\u009a\2\u0996\u0997\7\u0157\2\2\u0997\u099a\5\u0132\u009a\2\u0998"+
		"\u0999\7\u0157\2\2\u0999\u099b\5\u0132\u009a\2\u099a\u0998\3\2\2\2\u099a"+
		"\u099b\3\2\2\2\u099b\u099d\3\2\2\2\u099c\u0996\3\2\2\2\u099c\u099d\3\2"+
		"\2\2\u099d\u099e\3\2\2\2\u099e\u099f\7\u0168\2\2\u099f\u09a0\5\u014c\u00a7"+
		"\2\u09a0\u09ea\3\2\2\2\u09a1\u09a2\7\u00ad\2\2\u09a2\u09a4\7\u0165\2\2"+
		"\u09a3\u09a5\5\u014a\u00a6\2\u09a4\u09a3\3\2\2\2\u09a4\u09a5\3\2\2\2\u09a5"+
		"\u09a6\3\2\2\2\u09a6\u09a7\5\u0132\u009a\2\u09a7\u09a9\7\u0168\2\2\u09a8"+
		"\u09aa\5\u014c\u00a7\2\u09a9\u09a8\3\2\2\2\u09a9\u09aa\3\2\2\2\u09aa\u09ea"+
		"\3\2\2\2\u09ab\u09ac\7\u00b3\2\2\u09ac\u09ae\7\u0165\2\2\u09ad\u09af\5"+
		"\u014a\u00a6\2\u09ae\u09ad\3\2\2\2\u09ae\u09af\3\2\2\2\u09af\u09b0\3\2"+
		"\2\2\u09b0\u09b1\5\u0132\u009a\2\u09b1\u09b3\7\u0168\2\2\u09b2\u09b4\5"+
		"\u014c\u00a7\2\u09b3\u09b2\3\2\2\2\u09b3\u09b4\3\2\2\2\u09b4\u09ea\3\2"+
		"\2\2\u09b5\u09b6\7\u014f\2\2\u09b6\u09b7\7\u0165\2\2\u09b7\u09b8\5\u0132"+
		"\u009a\2\u09b8\u09b9\7\u0168\2\2\u09b9\u09ba\5\u014c\u00a7\2\u09ba\u09ea"+
		"\3\2\2\2\u09bb\u09bc\7\u0150\2\2\u09bc\u09bd\7\u0165\2\2\u09bd\u09be\5"+
		"\u0132\u009a\2\u09be\u09bf\7\u0168\2\2\u09bf\u09c0\5\u014c\u00a7\2\u09c0"+
		"\u09ea\3\2\2\2\u09c1\u09c2\7\u0151\2\2\u09c2\u09c4\7\u0165\2\2\u09c3\u09c5"+
		"\5\u014a\u00a6\2\u09c4\u09c3\3\2\2\2\u09c4\u09c5\3\2\2\2\u09c5\u09c6\3"+
		"\2\2\2\u09c6\u09c7\5\u0132\u009a\2\u09c7\u09c9\7\u0168\2\2\u09c8\u09ca"+
		"\5\u014c\u00a7\2\u09c9\u09c8\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09ea\3"+
		"\2\2\2\u09cb\u09cc\7\u0113\2\2\u09cc\u09ce\7\u0165\2\2\u09cd\u09cf\5\u014a"+
		"\u00a6\2\u09ce\u09cd\3\2\2\2\u09ce\u09cf\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0"+
		"\u09d1\5\u0132\u009a\2\u09d1\u09d3\7\u0168\2\2\u09d2\u09d4\5\u014c\u00a7"+
		"\2\u09d3\u09d2\3\2\2\2\u09d3\u09d4\3\2\2\2\u09d4\u09ea\3\2\2\2\u09d5\u09d6"+
		"\7\u012d\2\2\u09d6\u09d8\7\u0165\2\2\u09d7\u09d9\5\u014a\u00a6\2\u09d8"+
		"\u09d7\3\2\2\2\u09d8\u09d9\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db\5\u0132"+
		"\u009a\2\u09db\u09dd\7\u0168\2\2\u09dc\u09de\5\u014c\u00a7\2\u09dd\u09dc"+
		"\3\2\2\2\u09dd\u09de\3\2\2\2\u09de\u09ea\3\2\2\2\u09df\u09e0\7\u0153\2"+
		"\2\u09e0\u09e2\7\u0165\2\2\u09e1\u09e3\5\u014a\u00a6\2\u09e2\u09e1\3\2"+
		"\2\2\u09e2\u09e3\3\2\2\2\u09e3\u09e4\3\2\2\2\u09e4\u09e5\5\u0132\u009a"+
		"\2\u09e5\u09e7\7\u0168\2\2\u09e6\u09e8\5\u014c\u00a7\2\u09e7\u09e6\3\2"+
		"\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09ea\3\2\2\2\u09e9\u094f\3\2\2\2\u09e9"+
		"\u0959\3\2\2\2\u09e9\u0963\3\2\2\2\u09e9\u096d\3\2\2\2\u09e9\u0973\3\2"+
		"\2\2\u09e9\u0979\3\2\2\2\u09e9\u097f\3\2\2\2\u09e9\u098d\3\2\2\2\u09e9"+
		"\u0993\3\2\2\2\u09e9\u09a1\3\2\2\2\u09e9\u09ab\3\2\2\2\u09e9\u09b5\3\2"+
		"\2\2\u09e9\u09bb\3\2\2\2\u09e9\u09c1\3\2\2\2\u09e9\u09cb\3\2\2\2\u09e9"+
		"\u09d5\3\2\2\2\u09e9\u09df\3\2\2\2\u09ea\u0149\3\2\2\2\u09eb\u09ec\t!"+
		"\2\2\u09ec\u014b\3\2\2\2\u09ed\u09ee\7\u00cb\2\2\u09ee\u09f0\7\u0165\2"+
		"\2\u09ef\u09f1\5\u014e\u00a8\2\u09f0\u09ef\3\2\2\2\u09f0\u09f1\3\2\2\2"+
		"\u09f1\u09f3\3\2\2\2\u09f2\u09f4\5\u011c\u008f\2\u09f3\u09f2\3\2\2\2\u09f3"+
		"\u09f4\3\2\2\2\u09f4\u09f5\3\2\2\2\u09f5\u09f6\7\u0168\2\2\u09f6\u014d"+
		"\3\2\2\2\u09f7\u09f8\7\u00cf\2\2\u09f8\u09f9\7\34\2\2\u09f9\u09fe\5\u0132"+
		"\u009a\2\u09fa\u09fb\7\u0157\2\2\u09fb\u09fd\5\u0132\u009a\2\u09fc\u09fa"+
		"\3\2\2\2\u09fd\u0a00\3\2\2\2\u09fe\u09fc\3\2\2\2\u09fe\u09ff\3\2\2\2\u09ff"+
		"\u014f\3\2\2\2\u0a00\u09fe\3\2\2\2\u0a01\u0aca\7\u013d\2\2\u0a02\u0a03"+
		"\7#\2\2\u0a03\u0a04\7\u0165\2\2\u0a04\u0a05\5\u0132\u009a\2\u0a05\u0a06"+
		"\7\f\2\2\u0a06\u0a08\5b\62\2\u0a07\u0a09\5d\63\2\u0a08\u0a07\3\2\2\2\u0a08"+
		"\u0a09\3\2\2\2\u0a09\u0a0a\3\2\2\2\u0a0a\u0a0b\7\u0168\2\2\u0a0b\u0aca"+
		"\3\2\2\2\u0a0c\u0a0d\7\67\2\2\u0a0d\u0a10\7\u0165\2\2\u0a0e\u0a11\5\u0132"+
		"\u009a\2\u0a0f\u0a11\7\u0163\2\2\u0a10\u0a0e\3\2\2\2\u0a10\u0a0f\3\2\2"+
		"\2\u0a11\u0a12\3\2\2\2\u0a12\u0aca\7\u0168\2\2\u0a13\u0aca\7\u013f\2\2"+
		"\u0a14\u0a15\7=\2\2\u0a15\u0aca\7B\2\2\u0a16\u0a1a\7\u0140\2\2\u0a17\u0a18"+
		"\7=\2\2\u0a18\u0a1a\7\u011c\2\2\u0a19\u0a16\3\2\2\2\u0a19\u0a17\3\2\2"+
		"\2\u0a1a\u0a1f\3\2\2\2\u0a1b\u0a1c\7\u0165\2\2\u0a1c\u0a1d\5\u0132\u009a"+
		"\2\u0a1d\u0a1e\7\u0168\2\2\u0a1e\u0a20\3\2\2\2\u0a1f\u0a1b\3\2\2\2\u0a1f"+
		"\u0a20\3\2\2\2\u0a20\u0aca\3\2\2\2\u0a21\u0aca\7\u0141\2\2\u0a22\u0a23"+
		"\7=\2\2\u0a23\u0aca\7\u0154\2\2\u0a24\u0a25\7\u0147\2\2\u0a25\u0a26\7"+
		"\u0165\2\2\u0a26\u0a33\5\u0132\u009a\2\u0a27\u0a28\7\u0157\2\2\u0a28\u0a30"+
		"\5\u0132\u009a\2\u0a29\u0a2a\7\u0157\2\2\u0a2a\u0a2b\5\u0132\u009a\2\u0a2b"+
		"\u0a2c\7\u015b\2\2\u0a2c\u0a2d\5\u0132\u009a\2\u0a2d\u0a2f\3\2\2\2\u0a2e"+
		"\u0a29\3\2\2\2\u0a2f\u0a32\3\2\2\2\u0a30\u0a2e\3\2\2\2\u0a30\u0a31\3\2"+
		"\2\2\u0a31\u0a34\3\2\2\2\u0a32\u0a30\3\2\2\2\u0a33\u0a27\3\2\2\2\u0a33"+
		"\u0a34\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35\u0a36\7\u0168\2\2\u0a36\u0aca"+
		"\3\2\2\2\u0a37\u0a38\7\u0148\2\2\u0a38\u0a39\7\u0165\2\2\u0a39\u0a46\5"+
		"\u0132\u009a\2\u0a3a\u0a3b\7\u0157\2\2\u0a3b\u0a43\5\u0132\u009a\2\u0a3c"+
		"\u0a3d\7\u0157\2\2\u0a3d\u0a3e\5\u0132\u009a\2\u0a3e\u0a3f\7\u015b\2\2"+
		"\u0a3f\u0a40\5\u0132\u009a\2\u0a40\u0a42\3\2\2\2\u0a41\u0a3c\3\2\2\2\u0a42"+
		"\u0a45\3\2\2\2\u0a43\u0a41\3\2\2\2\u0a43\u0a44\3\2\2\2\u0a44\u0a47\3\2"+
		"\2\2\u0a45\u0a43\3\2\2\2\u0a46\u0a3a\3\2\2\2\u0a46\u0a47\3\2\2\2\u0a47"+
		"\u0a48\3\2\2\2\u0a48\u0a49\7\u0168\2\2\u0a49\u0aca\3\2\2\2\u0a4a\u0a4b"+
		"\7\u0149\2\2\u0a4b\u0a4c\7\u0165\2\2\u0a4c\u0a59\5\u0132\u009a\2\u0a4d"+
		"\u0a4e\7\u0157\2\2\u0a4e\u0a56\5\u0132\u009a\2\u0a4f\u0a50\7\u0157\2\2"+
		"\u0a50\u0a51\5\u0132\u009a\2\u0a51\u0a52\7\u015b\2\2\u0a52\u0a53\5\u0132"+
		"\u009a\2\u0a53\u0a55\3\2\2\2\u0a54\u0a4f\3\2\2\2\u0a55\u0a58\3\2\2\2\u0a56"+
		"\u0a54\3\2\2\2\u0a56\u0a57\3\2\2\2\u0a57\u0a5a\3\2\2\2\u0a58\u0a56\3\2"+
		"\2\2\u0a59\u0a4d\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a\u0a5b\3\2\2\2\u0a5b"+
		"\u0a5c\7\u0168\2\2\u0a5c\u0aca\3\2\2\2\u0a5d\u0a5e\7\u014a\2\2\u0a5e\u0a5f"+
		"\7\u0165\2\2\u0a5f\u0a6c\5\u0132\u009a\2\u0a60\u0a61\7\u0157\2\2\u0a61"+
		"\u0a69\5\u0132\u009a\2\u0a62\u0a63\7\u0157\2\2\u0a63\u0a64\5\u0132\u009a"+
		"\2\u0a64\u0a65\7\u015b\2\2\u0a65\u0a66\5\u0132\u009a\2\u0a66\u0a68\3\2"+
		"\2\2\u0a67\u0a62\3\2\2\2\u0a68\u0a6b\3\2\2\2\u0a69\u0a67\3\2\2\2\u0a69"+
		"\u0a6a\3\2\2\2\u0a6a\u0a6d\3\2\2\2\u0a6b\u0a69\3\2\2\2\u0a6c\u0a60\3\2"+
		"\2\2\u0a6c\u0a6d\3\2\2\2\u0a6d\u0a6e\3\2\2\2\u0a6e\u0a6f\7\u0168\2\2\u0a6f"+
		"\u0aca\3\2\2\2\u0a70\u0a71\7\u014b\2\2\u0a71\u0a72\7\u0165\2\2\u0a72\u0a7f"+
		"\5\u0132\u009a\2\u0a73\u0a74\7\u0157\2\2\u0a74\u0a7c\5\u0132\u009a\2\u0a75"+
		"\u0a76\7\u0157\2\2\u0a76\u0a77\5\u0132\u009a\2\u0a77\u0a78\7\u015b\2\2"+
		"\u0a78\u0a79\5\u0132\u009a\2\u0a79\u0a7b\3\2\2\2\u0a7a\u0a75\3\2\2\2\u0a7b"+
		"\u0a7e\3\2\2\2\u0a7c\u0a7a\3\2\2\2\u0a7c\u0a7d\3\2\2\2\u0a7d\u0a80\3\2"+
		"\2\2\u0a7e\u0a7c\3\2\2\2\u0a7f\u0a73\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80"+
		"\u0a81\3\2\2\2\u0a81\u0a82\7\u0168\2\2\u0a82\u0aca\3\2\2\2\u0a83\u0a84"+
		"\7\u014c\2\2\u0a84\u0a85\7\u0165\2\2\u0a85\u0a92\5\u0132\u009a\2\u0a86"+
		"\u0a87\7\u0157\2\2\u0a87\u0a8f\5\u0132\u009a\2\u0a88\u0a89\7\u0157\2\2"+
		"\u0a89\u0a8a\5\u0132\u009a\2\u0a8a\u0a8b\7\u015b\2\2\u0a8b\u0a8c\5\u0132"+
		"\u009a\2\u0a8c\u0a8e\3\2\2\2\u0a8d\u0a88\3\2\2\2\u0a8e\u0a91\3\2\2\2\u0a8f"+
		"\u0a8d\3\2\2\2\u0a8f\u0a90\3\2\2\2\u0a90\u0a93\3\2\2\2\u0a91\u0a8f\3\2"+
		"\2\2\u0a92\u0a86\3\2\2\2\u0a92\u0a93\3\2\2\2\u0a93\u0a94\3\2\2\2\u0a94"+
		"\u0a95\7\u0168\2\2\u0a95\u0aca\3\2\2\2\u0a96\u0a97\7\u014d\2\2\u0a97\u0a98"+
		"\7\u0165\2\2\u0a98\u0aa0\5\u0132\u009a\2\u0a99\u0a9a\7\u0157\2\2\u0a9a"+
		"\u0a9b\5\u0132\u009a\2\u0a9b\u0a9c\7\u015b\2\2\u0a9c\u0a9d\5\u0132\u009a"+
		"\2\u0a9d\u0a9f\3\2\2\2\u0a9e\u0a99\3\2\2\2\u0a9f\u0aa2\3\2\2\2\u0aa0\u0a9e"+
		"\3\2\2\2\u0aa0\u0aa1\3\2\2\2\u0aa1\u0aa3\3\2\2\2\u0aa2\u0aa0\3\2\2\2\u0aa3"+
		"\u0aa4\7\u0168\2\2\u0aa4\u0aca\3\2\2\2\u0aa5\u0aa6\7\u014e\2\2\u0aa6\u0aa7"+
		"\7\u0165\2\2\u0aa7\u0aad\5\u0132\u009a\2\u0aa8\u0aa9\7\u0157\2\2\u0aa9"+
		"\u0aaa\5\u0132\u009a\2\u0aaa\u0aab\7\u015b\2\2\u0aab\u0aac\5\u0132\u009a"+
		"\2\u0aac\u0aae\3\2\2\2\u0aad\u0aa8\3\2\2\2\u0aae\u0aaf\3\2\2\2\u0aaf\u0aad"+
		"\3\2\2\2\u0aaf\u0ab0\3\2\2\2\u0ab0\u0ab3\3\2\2\2\u0ab1\u0ab2\7\u0157\2"+
		"\2\u0ab2\u0ab4\5\u0132\u009a\2\u0ab3\u0ab1\3\2\2\2\u0ab3\u0ab4\3\2\2\2"+
		"\u0ab4\u0ab5\3\2\2\2\u0ab5\u0ab6\7\u0168\2\2\u0ab6\u0aca\3\2\2\2\u0ab7"+
		"\u0ab8\7\u00f4\2\2\u0ab8\u0ab9\7\u0165\2\2\u0ab9\u0aba\5\u0132\u009a\2"+
		"\u0aba\u0abb\7\u0168\2\2\u0abb\u0aca\3\2\2\2\u0abc\u0abd\7\u0112\2\2\u0abd"+
		"\u0abe\7\u0165\2\2\u0abe\u0abf\5\u0132\u009a\2\u0abf\u0ac0\7t\2\2\u0ac0"+
		"\u0ac3\5\u0132\u009a\2\u0ac1\u0ac2\7p\2\2\u0ac2\u0ac4\5\u0132\u009a\2"+
		"\u0ac3\u0ac1\3\2\2\2\u0ac3\u0ac4\3\2\2\2\u0ac4\u0ac5\3\2\2\2\u0ac5\u0ac6"+
		"\7\u0168\2\2\u0ac6\u0aca\3\2\2\2\u0ac7\u0aca\7\u0152\2\2\u0ac8\u0aca\7"+
		"\u0154\2\2\u0ac9\u0a01\3\2\2\2\u0ac9\u0a02\3\2\2\2\u0ac9\u0a0c\3\2\2\2"+
		"\u0ac9\u0a13\3\2\2\2\u0ac9\u0a14\3\2\2\2\u0ac9\u0a19\3\2\2\2\u0ac9\u0a21"+
		"\3\2\2\2\u0ac9\u0a22\3\2\2\2\u0ac9\u0a24\3\2\2\2\u0ac9\u0a37\3\2\2\2\u0ac9"+
		"\u0a4a\3\2\2\2\u0ac9\u0a5d\3\2\2\2\u0ac9\u0a70\3\2\2\2\u0ac9\u0a83\3\2"+
		"\2\2\u0ac9\u0a96\3\2\2\2\u0ac9\u0aa5\3\2\2\2\u0ac9\u0ab7\3\2\2\2\u0ac9"+
		"\u0abc\3\2\2\2\u0ac9\u0ac7\3\2\2\2\u0ac9\u0ac8\3\2\2\2\u0aca\u0151\3\2"+
		"\2\2\u0acb\u0acc\5\u0162\u00b2\2\u0acc\u0ace\7\u0165\2\2\u0acd\u0acf\5"+
		"\u0154\u00ab\2\u0ace\u0acd\3\2\2\2\u0ace\u0acf\3\2\2\2\u0acf\u0ad0\3\2"+
		"\2\2\u0ad0\u0ad1\7\u0168\2\2\u0ad1\u0153\3\2\2\2\u0ad2\u0ad7\5\u0156\u00ac"+
		"\2\u0ad3\u0ad4\7\u0157\2\2\u0ad4\u0ad6\5\u0156\u00ac\2\u0ad5\u0ad3\3\2"+
		"\2\2\u0ad6\u0ad9\3\2\2\2\u0ad7\u0ad5\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8"+
		"\u0155\3\2\2\2\u0ad9\u0ad7\3\2\2\2\u0ada\u0ae0\6\u00ac\22\2\u0adb\u0adc"+
		"\5\u0162\u00b2\2\u0adc\u0ade\7\u015b\2\2\u0add\u0adf\7\u015f\2\2\u0ade"+
		"\u0add\3\2\2\2\u0ade\u0adf\3\2\2\2\u0adf\u0ae1\3\2\2\2\u0ae0\u0adb\3\2"+
		"\2\2\u0ae0\u0ae1\3\2\2\2\u0ae1\u0ae2\3\2\2\2\u0ae2\u0ae3\5\u0132\u009a"+
		"\2\u0ae3\u0157\3\2\2\2\u0ae4\u0ae7\5\u00e0q\2\u0ae5\u0ae7\5\u0132\u009a"+
		"\2\u0ae6\u0ae4\3\2\2\2\u0ae6\u0ae5\3\2\2\2\u0ae7\u0159\3\2\2\2\u0ae8\u0aeb"+
		"\5\u015c\u00af\2\u0ae9\u0aeb\5\u0132\u009a\2\u0aea\u0ae8\3\2\2\2\u0aea"+
		"\u0ae9\3\2\2\2\u0aeb\u015b\3\2\2\2\u0aec\u0afb\7\u0177\2\2\u0aed\u0af1"+
		"\7\u0159\2\2\u0aee\u0aef\7\u016d\2\2\u0aef\u0af1\7\u0159\2\2\u0af0\u0aed"+
		"\3\2\2\2\u0af0\u0aee\3\2\2\2\u0af0\u0af1\3\2\2\2\u0af1\u0af2\3\2\2\2\u0af2"+
		"\u0af7\5\u0162\u00b2\2\u0af3\u0af4\7\u0159\2\2\u0af4\u0af6\5\u0162\u00b2"+
		"\2\u0af5\u0af3\3\2\2\2\u0af6\u0af9\3\2\2\2\u0af7\u0af5\3\2\2\2\u0af7\u0af8"+
		"\3\2\2\2\u0af8\u0afb\3\2\2\2\u0af9\u0af7\3\2\2\2\u0afa\u0aec\3\2\2\2\u0afa"+
		"\u0af0\3\2\2\2\u0afb\u015d\3\2\2\2\u0afc\u0afd\7B\2\2\u0afd\u0afe\5\u0164"+
		"\u00b3\2\u0afe\u015f\3\2\2\2\u0aff\u0b00\7\u011c\2\2\u0b00\u0b01\5\u0164"+
		"\u00b3\2\u0b01\u0161\3\2\2\2\u0b02\u0b07\7\u016e\2\2\u0b03\u0b04\7\u016d"+
		"\2\2\u0b04\u0b06\7\u016e\2\2\u0b05\u0b03\3\2\2\2\u0b06\u0b09\3\2\2\2\u0b07"+
		"\u0b05\3\2\2\2\u0b07\u0b08\3\2\2\2\u0b08\u0163\3\2\2\2\u0b09\u0b07\3\2"+
		"\2\2\u0b0a\u0b0d\7\u016f\2\2\u0b0b\u0b0d\7\u0171\2\2\u0b0c\u0b0a\3\2\2"+
		"\2\u0b0c\u0b0b\3\2\2\2\u0b0d\u0165\3\2\2\2\u0b0e\u0b10\t+\2\2\u0b0f\u0b0e"+
		"\3\2\2\2\u0b0f\u0b10\3\2\2\2\u0b10\u0b11\3\2\2\2\u0b11\u0b12\7\u0172\2"+
		"\2\u0b12\u0167\3\2\2\2\u0b13\u0b15\t+\2\2\u0b14\u0b13\3\2\2\2\u0b14\u0b15"+
		"\3\2\2\2\u0b15\u0b16\3\2\2\2\u0b16\u0b17\7\u0173\2\2\u0b17\u0169\3\2\2"+
		"\2\u0b18\u0b19\t,\2\2\u0b19\u016b\3\2\2\2\u0b1a\u0b1b\7\u00bf\2\2\u0b1b"+
		"\u016d\3\2\2\2\u0b1c\u0b1d\t-\2\2\u0b1d\u016f\3\2\2\2\u015e\u0177\u017a"+
		"\u017e\u0181\u0186\u018d\u0194\u0196\u019f\u01a2\u01a6\u01c1\u01c7\u01d2"+
		"\u01dc\u01e1\u01e9\u01f4\u01fe\u0206\u020d\u0211\u0215\u021a\u021e\u0223"+
		"\u0227\u022b\u0235\u0239\u023e\u0243\u0247\u0254\u0259\u025f\u026a\u026e"+
		"\u0278\u027b\u0280\u0285\u028c\u0293\u02ad\u02b3\u02b8\u02be\u02c5\u02c8"+
		"\u02ce\u02dc\u02e6\u02ec\u02f1\u02f6\u02fb\u02ff\u0304\u0307\u0311\u031d"+
		"\u0324\u0327\u0333\u0338\u033d\u0340\u0347\u0353\u0360\u0362\u0367\u036a"+
		"\u0379\u037f\u038a\u038d\u0397\u039e\u03a6\u03ae\u03b8\u03cc\u03d2\u03d6"+
		"\u03db\u03df\u03e4\u03e7\u03ec\u03ef\u03fd\u041d\u041f\u0424\u0428\u042d"+
		"\u0434\u0437\u043a\u043f\u0443\u0445\u044c\u0452\u0456\u045c\u0462\u0468"+
		"\u046f\u0475\u047d\u0483\u0486\u048d\u0492\u0495\u04a1\u04bc\u04be\u04d8"+
		"\u04e1\u04e9\u04ed\u04f6\u0500\u0504\u0506\u0514\u0522\u052a\u0540\u0542"+
		"\u0552\u055c\u055f\u0566\u056c\u056f\u0574\u0578\u057b\u0582\u0588\u058b"+
		"\u0595\u059e\u05a5\u05ac\u05ae\u05b4\u05b7\u05c2\u05cb\u05d1\u05d7\u05da"+
		"\u05df\u05e2\u05e5\u05e8\u05eb\u05f1\u05fb\u0606\u0609\u0610\u0615\u061a"+
		"\u061e\u0626\u062a\u062f\u0633\u0635\u063a\u0642\u0647\u0650\u0657\u065d"+
		"\u0661\u0665\u0669\u0673\u0679\u0685\u068c\u069c\u06a3\u06a9\u06ac\u06b0"+
		"\u06b3\u06be\u06c1\u06cc\u06d4\u06dc\u06e5\u06ed\u06f2\u06f5\u06f8\u06fb"+
		"\u06fe\u0706\u070a\u0712\u0718\u0721\u072e\u0739\u073e\u074b\u0756\u0762"+
		"\u0766\u076a\u076e\u0770\u0776\u0779\u077c\u077f\u0783\u0786\u0789\u078e"+
		"\u0791\u079b\u07a6\u07aa\u07ad\u07b3\u07ba\u07be\u07c8\u07d0\u07d8\u07dc"+
		"\u07e2\u07eb\u07ee\u07f3\u07f6\u0800\u0805\u080e\u0813\u0817\u0820\u0824"+
		"\u082b\u0837\u0844\u0849\u084d\u0853\u085e\u0860\u0864\u086b\u0873\u0879"+
		"\u087e\u0889\u0892\u0896\u089f\u08a3\u08ad\u08b2\u08c8\u08cb\u08e4\u08f4"+
		"\u08f6\u08fb\u0909\u0918\u0924\u0928\u0933\u0937\u0943\u0947\u0952\u0957"+
		"\u095c\u0961\u0966\u096b\u0986\u0988\u099a\u099c\u09a4\u09a9\u09ae\u09b3"+
		"\u09c4\u09c9\u09ce\u09d3\u09d8\u09dd\u09e2\u09e7\u09e9\u09f0\u09f3\u09fe"+
		"\u0a08\u0a10\u0a19\u0a1f\u0a30\u0a33\u0a43\u0a46\u0a56\u0a59\u0a69\u0a6c"+
		"\u0a7c\u0a7f\u0a8f\u0a92\u0aa0\u0aaf\u0ab3\u0ac3\u0ac9\u0ace\u0ad7\u0ade"+
		"\u0ae0\u0ae6\u0aea\u0af0\u0af7\u0afa\u0b07\u0b0c\u0b0f\u0b14";
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