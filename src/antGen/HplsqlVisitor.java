// Generated from C:/Users/Husam/Desktop/projects/HQL_COMPILER_2019\Hplsql.g4 by ANTLR 4.7.2
package antGen;

    import AST.*;
    import TypeArray.*;
    import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HplsqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HplsqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HplsqlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HplsqlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end_block(HplsqlParser.Begin_end_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_block_stmt(HplsqlParser.Single_block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#block_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_end(HplsqlParser.Block_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#proc_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_block(HplsqlParser.Proc_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(HplsqlParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#exception_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block(HplsqlParser.Exception_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block_item(HplsqlParser.Exception_block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(HplsqlParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt(HplsqlParser.Declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(HplsqlParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block_inplace(HplsqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt_item(HplsqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_item(HplsqlParser.Declare_var_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_condition_item(HplsqlParser.Declare_condition_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor_item(HplsqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_with_return(HplsqlParser.Cursor_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_without_return(HplsqlParser.Cursor_without_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_handler_item(HplsqlParser.Declare_handler_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_temporary_table_item(HplsqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(HplsqlParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_local_temp_table_stmt(HplsqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_definition(HplsqlParser.Create_table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns(HplsqlParser.Create_table_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns_item(HplsqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(HplsqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_inline_cons(HplsqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_cons(HplsqlParser.Create_table_column_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_fk_action(HplsqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions(HplsqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_item(HplsqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_td_item(HplsqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options(HplsqlParser.Create_table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_item(HplsqlParser.Create_table_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_ora_item(HplsqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_db2_item(HplsqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_td_item(HplsqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_hive_item(HplsqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format(HplsqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format_fields(HplsqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mssql_item(HplsqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mysql_item(HplsqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(HplsqlParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#dtype_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_len(HplsqlParser.Dtype_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_attr(HplsqlParser.Dtype_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#dtype_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_default(HplsqlParser.Dtype_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_stmt(HplsqlParser.Create_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(HplsqlParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#error_create_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_create_database_stmt(HplsqlParser.Error_create_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_stmt(HplsqlParser.Function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#def_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_return(HplsqlParser.Def_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#return_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_param(HplsqlParser.Return_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#return_param_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_param_item(HplsqlParser.Return_param_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_smt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_smt(HplsqlParser.Cpp_smtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_smt_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_smt_for(HplsqlParser.Cpp_smt_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_if_stmt(HplsqlParser.Cpp_if_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#def_else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_else_if(HplsqlParser.Def_else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#def_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_else(HplsqlParser.Def_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#ifex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfex(HplsqlParser.IfexContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(HplsqlParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_assignment_stmt(HplsqlParser.Cpp_assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_var_decleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_var_decleration(HplsqlParser.Cpp_var_declerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_for_stmt(HplsqlParser.Cpp_for_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#for_inc_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_inc_dec(HplsqlParser.For_inc_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#forhead1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForhead1(HplsqlParser.Forhead1Context ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_stmt(HplsqlParser.Create_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_return(HplsqlParser.Create_function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_stmt(HplsqlParser.Create_package_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(HplsqlParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec_item(HplsqlParser.Package_spec_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body_stmt(HplsqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(HplsqlParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#package_body_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_item(HplsqlParser.Package_body_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_stmt(HplsqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_params(HplsqlParser.Create_routine_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_param_item(HplsqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_options(HplsqlParser.Create_routine_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_option(HplsqlParser.Create_routine_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_stats_clause(HplsqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cmp_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_source(HplsqlParser.Cmp_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#copy_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_source(HplsqlParser.Copy_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#copy_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_target(HplsqlParser.Copy_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#copy_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_option(HplsqlParser.Copy_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_file_option(HplsqlParser.Copy_file_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(HplsqlParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_index_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_col(HplsqlParser.Create_index_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_storage_clause(HplsqlParser.Index_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_mssql_storage_clause(HplsqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#set_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_option(HplsqlParser.Set_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_current_schema_option(HplsqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_mssql_session_option(HplsqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_teradata_session_option(HplsqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(HplsqlParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(HplsqlParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(HplsqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#new_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_select_stmt(HplsqlParser.New_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#new_select_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_select_col(HplsqlParser.New_select_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#col_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol_func(HplsqlParser.Col_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#tabledotcol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabledotcol(HplsqlParser.TabledotcolContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#new_from_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_from_table(HplsqlParser.New_from_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#new_from_subselect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_from_subselect_clause(HplsqlParser.New_from_subselect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#new_from_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_from_join_clause(HplsqlParser.New_from_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#new_join_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_join_condition(HplsqlParser.New_join_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#new_where_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_where_condition(HplsqlParser.New_where_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(HplsqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt(HplsqlParser.Cte_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt_item(HplsqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_cols(HplsqlParser.Cte_select_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt(HplsqlParser.Fullselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt_item(HplsqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_set_clause(HplsqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(HplsqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_set(HplsqlParser.Select_list_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_limit(HplsqlParser.Select_list_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_item(HplsqlParser.Select_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_alias(HplsqlParser.Select_list_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_asterisk(HplsqlParser.Select_list_asteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(HplsqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(HplsqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_clause(HplsqlParser.From_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_name_clause(HplsqlParser.From_table_name_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_subselect_clause(HplsqlParser.From_subselect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_clause(HplsqlParser.From_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_type_clause(HplsqlParser.From_join_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_clause(HplsqlParser.From_table_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_row(HplsqlParser.From_table_values_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_alias_clause(HplsqlParser.From_alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(HplsqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(HplsqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#error_where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_where_clause(HplsqlParser.Error_where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(HplsqlParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(HplsqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualify_clause(HplsqlParser.Qualify_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(HplsqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options(HplsqlParser.Select_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options_item(HplsqlParser.Select_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(HplsqlParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_atom(HplsqlParser.Bool_expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_unary(HplsqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_single_in(HplsqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_multi_in(HplsqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary(HplsqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_logical_operator(HplsqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary_operator(HplsqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HplsqlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#colom_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColom_name(HplsqlParser.Colom_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_atom(HplsqlParser.Expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_interval(HplsqlParser.Expr_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#interval_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_item(HplsqlParser.Interval_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat(HplsqlParser.Expr_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat_item(HplsqlParser.Expr_concat_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case(HplsqlParser.Expr_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_simple(HplsqlParser.Expr_case_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_searched(HplsqlParser.Expr_case_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cursor_attribute(HplsqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_agg_window_func(HplsqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_all_distinct(HplsqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_over_clause(HplsqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_partition_by_clause(HplsqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_spec_func(HplsqlParser.Expr_spec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func(HplsqlParser.Expr_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_params(HplsqlParser.Expr_func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(HplsqlParser.Func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_select(HplsqlParser.Expr_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_file(HplsqlParser.Expr_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(HplsqlParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(HplsqlParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(HplsqlParser.Timestamp_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(HplsqlParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link HplsqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_quotedString(HplsqlParser.Single_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link HplsqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_quotedString(HplsqlParser.Double_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(HplsqlParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#dec_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_number(HplsqlParser.Dec_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(HplsqlParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#null_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_const(HplsqlParser.Null_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_words(HplsqlParser.Non_reserved_wordsContext ctx);
}