// Generated from src\main\java\u005Cus\shadowlabs\antlr\Teradata.G4 by ANTLR 4.5.3
package us.shadowlabs.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TeradataParser}.
 */
public interface TeradataListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TeradataParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(TeradataParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(TeradataParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(TeradataParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(TeradataParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(TeradataParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(TeradataParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(TeradataParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(TeradataParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(TeradataParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(TeradataParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#select_expr}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expr(TeradataParser.Select_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#select_expr}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expr(TeradataParser.Select_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(TeradataParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(TeradataParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#insert_sub_expr}.
	 * @param ctx the parse tree
	 */
	void enterInsert_sub_expr(TeradataParser.Insert_sub_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#insert_sub_expr}.
	 * @param ctx the parse tree
	 */
	void exitInsert_sub_expr(TeradataParser.Insert_sub_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#insert_logging_errors}.
	 * @param ctx the parse tree
	 */
	void enterInsert_logging_errors(TeradataParser.Insert_logging_errorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#insert_logging_errors}.
	 * @param ctx the parse tree
	 */
	void exitInsert_logging_errors(TeradataParser.Insert_logging_errorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#top_expr}.
	 * @param ctx the parse tree
	 */
	void enterTop_expr(TeradataParser.Top_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#top_expr}.
	 * @param ctx the parse tree
	 */
	void exitTop_expr(TeradataParser.Top_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#having_qualify_expr}.
	 * @param ctx the parse tree
	 */
	void enterHaving_qualify_expr(TeradataParser.Having_qualify_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#having_qualify_expr}.
	 * @param ctx the parse tree
	 */
	void exitHaving_qualify_expr(TeradataParser.Having_qualify_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(TeradataParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(TeradataParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#select_list_expr}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_expr(TeradataParser.Select_list_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#select_list_expr}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_expr(TeradataParser.Select_list_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(TeradataParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(TeradataParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#from_expr}.
	 * @param ctx the parse tree
	 */
	void enterFrom_expr(TeradataParser.From_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#from_expr}.
	 * @param ctx the parse tree
	 */
	void exitFrom_expr(TeradataParser.From_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#as_of}.
	 * @param ctx the parse tree
	 */
	void enterAs_of(TeradataParser.As_ofContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#as_of}.
	 * @param ctx the parse tree
	 */
	void exitAs_of(TeradataParser.As_ofContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#from_table_expr}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_expr(TeradataParser.From_table_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#from_table_expr}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_expr(TeradataParser.From_table_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#from_single_expr}.
	 * @param ctx the parse tree
	 */
	void enterFrom_single_expr(TeradataParser.From_single_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#from_single_expr}.
	 * @param ctx the parse tree
	 */
	void exitFrom_single_expr(TeradataParser.From_single_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#from_join_expr}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_expr(TeradataParser.From_join_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#from_join_expr}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_expr(TeradataParser.From_join_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#from_derived_expr}.
	 * @param ctx the parse tree
	 */
	void enterFrom_derived_expr(TeradataParser.From_derived_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#from_derived_expr}.
	 * @param ctx the parse tree
	 */
	void exitFrom_derived_expr(TeradataParser.From_derived_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#from_tablefunc_expr}.
	 * @param ctx the parse tree
	 */
	void enterFrom_tablefunc_expr(TeradataParser.From_tablefunc_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#from_tablefunc_expr}.
	 * @param ctx the parse tree
	 */
	void exitFrom_tablefunc_expr(TeradataParser.From_tablefunc_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#from_with_expr}.
	 * @param ctx the parse tree
	 */
	void enterFrom_with_expr(TeradataParser.From_with_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#from_with_expr}.
	 * @param ctx the parse tree
	 */
	void exitFrom_with_expr(TeradataParser.From_with_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#normalize_expr}.
	 * @param ctx the parse tree
	 */
	void enterNormalize_expr(TeradataParser.Normalize_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#normalize_expr}.
	 * @param ctx the parse tree
	 */
	void exitNormalize_expr(TeradataParser.Normalize_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(TeradataParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(TeradataParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#having_expr}.
	 * @param ctx the parse tree
	 */
	void enterHaving_expr(TeradataParser.Having_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#having_expr}.
	 * @param ctx the parse tree
	 */
	void exitHaving_expr(TeradataParser.Having_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#qualify_expr}.
	 * @param ctx the parse tree
	 */
	void enterQualify_expr(TeradataParser.Qualify_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#qualify_expr}.
	 * @param ctx the parse tree
	 */
	void exitQualify_expr(TeradataParser.Qualify_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#sample_expr}.
	 * @param ctx the parse tree
	 */
	void enterSample_expr(TeradataParser.Sample_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#sample_expr}.
	 * @param ctx the parse tree
	 */
	void exitSample_expr(TeradataParser.Sample_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#expand_expr}.
	 * @param ctx the parse tree
	 */
	void enterExpand_expr(TeradataParser.Expand_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#expand_expr}.
	 * @param ctx the parse tree
	 */
	void exitExpand_expr(TeradataParser.Expand_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#group_by_list}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_list(TeradataParser.Group_by_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#group_by_list}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_list(TeradataParser.Group_by_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#group_by_val}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_val(TeradataParser.Group_by_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#group_by_val}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_val(TeradataParser.Group_by_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#order_by_list}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_list(TeradataParser.Order_by_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#order_by_list}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_list(TeradataParser.Order_by_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#order_by_val}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_val(TeradataParser.Order_by_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#order_by_val}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_val(TeradataParser.Order_by_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#seed_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSeed_stmt(TeradataParser.Seed_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#seed_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSeed_stmt(TeradataParser.Seed_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TeradataParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TeradataParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(TeradataParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(TeradataParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#ordinary_grouping_set}.
	 * @param ctx the parse tree
	 */
	void enterOrdinary_grouping_set(TeradataParser.Ordinary_grouping_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#ordinary_grouping_set}.
	 * @param ctx the parse tree
	 */
	void exitOrdinary_grouping_set(TeradataParser.Ordinary_grouping_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#empty_grouping_set}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_grouping_set(TeradataParser.Empty_grouping_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#empty_grouping_set}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_grouping_set(TeradataParser.Empty_grouping_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#rollup_list}.
	 * @param ctx the parse tree
	 */
	void enterRollup_list(TeradataParser.Rollup_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#rollup_list}.
	 * @param ctx the parse tree
	 */
	void exitRollup_list(TeradataParser.Rollup_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#cube_list}.
	 * @param ctx the parse tree
	 */
	void enterCube_list(TeradataParser.Cube_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#cube_list}.
	 * @param ctx the parse tree
	 */
	void exitCube_list(TeradataParser.Cube_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#grouping_sets_specification}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_specification(TeradataParser.Grouping_sets_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#grouping_sets_specification}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_specification(TeradataParser.Grouping_sets_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#column_position}.
	 * @param ctx the parse tree
	 */
	void enterColumn_position(TeradataParser.Column_positionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#column_position}.
	 * @param ctx the parse tree
	 */
	void exitColumn_position(TeradataParser.Column_positionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(TeradataParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(TeradataParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(TeradataParser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(TeradataParser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#conditional_expr}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expr(TeradataParser.Conditional_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#conditional_expr}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expr(TeradataParser.Conditional_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(TeradataParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(TeradataParser.Column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(TeradataParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(TeradataParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(TeradataParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(TeradataParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(TeradataParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(TeradataParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(TeradataParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(TeradataParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#query_name}.
	 * @param ctx the parse tree
	 */
	void enterQuery_name(TeradataParser.Query_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#query_name}.
	 * @param ctx the parse tree
	 */
	void exitQuery_name(TeradataParser.Query_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#expr_alias_name}.
	 * @param ctx the parse tree
	 */
	void enterExpr_alias_name(TeradataParser.Expr_alias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#expr_alias_name}.
	 * @param ctx the parse tree
	 */
	void exitExpr_alias_name(TeradataParser.Expr_alias_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#joined_table}.
	 * @param ctx the parse tree
	 */
	void enterJoined_table(TeradataParser.Joined_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#joined_table}.
	 * @param ctx the parse tree
	 */
	void exitJoined_table(TeradataParser.Joined_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#single_table_expr}.
	 * @param ctx the parse tree
	 */
	void enterSingle_table_expr(TeradataParser.Single_table_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#single_table_expr}.
	 * @param ctx the parse tree
	 */
	void exitSingle_table_expr(TeradataParser.Single_table_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#derived_table_name}.
	 * @param ctx the parse tree
	 */
	void enterDerived_table_name(TeradataParser.Derived_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#derived_table_name}.
	 * @param ctx the parse tree
	 */
	void exitDerived_table_name(TeradataParser.Derived_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#date_expr}.
	 * @param ctx the parse tree
	 */
	void enterDate_expr(TeradataParser.Date_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#date_expr}.
	 * @param ctx the parse tree
	 */
	void exitDate_expr(TeradataParser.Date_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#timestamp_expr}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_expr(TeradataParser.Timestamp_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#timestamp_expr}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_expr(TeradataParser.Timestamp_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#time_expr}.
	 * @param ctx the parse tree
	 */
	void enterTime_expr(TeradataParser.Time_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#time_expr}.
	 * @param ctx the parse tree
	 */
	void exitTime_expr(TeradataParser.Time_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#date_timestamp_expr}.
	 * @param ctx the parse tree
	 */
	void enterDate_timestamp_expr(TeradataParser.Date_timestamp_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#date_timestamp_expr}.
	 * @param ctx the parse tree
	 */
	void exitDate_timestamp_expr(TeradataParser.Date_timestamp_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(TeradataParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(TeradataParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(TeradataParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(TeradataParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(TeradataParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(TeradataParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(TeradataParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(TeradataParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(TeradataParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(TeradataParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(TeradataParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(TeradataParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#correlation_name}.
	 * @param ctx the parse tree
	 */
	void enterCorrelation_name(TeradataParser.Correlation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#correlation_name}.
	 * @param ctx the parse tree
	 */
	void exitCorrelation_name(TeradataParser.Correlation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(TeradataParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(TeradataParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(TeradataParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(TeradataParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(TeradataParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(TeradataParser.Any_nameContext ctx);
}