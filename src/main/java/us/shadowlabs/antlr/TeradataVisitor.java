// Generated from src\main\java\u005Cus\shadowlabs\antlr\Teradata.G4 by ANTLR 4.5.3
package us.shadowlabs.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TeradataParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TeradataVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TeradataParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(TeradataParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(TeradataParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(TeradataParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(TeradataParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(TeradataParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#select_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_expr(TeradataParser.Select_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(TeradataParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#insert_sub_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_sub_expr(TeradataParser.Insert_sub_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#insert_logging_errors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_logging_errors(TeradataParser.Insert_logging_errorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#top_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_expr(TeradataParser.Top_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#having_qualify_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_qualify_expr(TeradataParser.Having_qualify_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(TeradataParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#select_list_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_expr(TeradataParser.Select_list_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(TeradataParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#from_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_expr(TeradataParser.From_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#as_of}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_of(TeradataParser.As_ofContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#from_table_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_expr(TeradataParser.From_table_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#from_single_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_single_expr(TeradataParser.From_single_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#from_join_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_expr(TeradataParser.From_join_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#from_derived_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_derived_expr(TeradataParser.From_derived_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#from_tablefunc_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_tablefunc_expr(TeradataParser.From_tablefunc_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#from_with_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_with_expr(TeradataParser.From_with_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#normalize_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalize_expr(TeradataParser.Normalize_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(TeradataParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#having_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_expr(TeradataParser.Having_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#qualify_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualify_expr(TeradataParser.Qualify_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#sample_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_expr(TeradataParser.Sample_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#expand_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpand_expr(TeradataParser.Expand_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#group_by_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_list(TeradataParser.Group_by_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#group_by_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_val(TeradataParser.Group_by_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#order_by_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_list(TeradataParser.Order_by_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#order_by_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_val(TeradataParser.Order_by_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#seed_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeed_stmt(TeradataParser.Seed_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TeradataParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(TeradataParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#ordinary_grouping_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinary_grouping_set(TeradataParser.Ordinary_grouping_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#empty_grouping_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_grouping_set(TeradataParser.Empty_grouping_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#rollup_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollup_list(TeradataParser.Rollup_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#cube_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCube_list(TeradataParser.Cube_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#grouping_sets_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_specification(TeradataParser.Grouping_sets_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#column_position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_position(TeradataParser.Column_positionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(TeradataParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(TeradataParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#conditional_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expr(TeradataParser.Conditional_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(TeradataParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(TeradataParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(TeradataParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(TeradataParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(TeradataParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#query_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_name(TeradataParser.Query_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#expr_alias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_alias_name(TeradataParser.Expr_alias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#joined_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoined_table(TeradataParser.Joined_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#single_table_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_table_expr(TeradataParser.Single_table_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#derived_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_table_name(TeradataParser.Derived_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#date_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_expr(TeradataParser.Date_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#timestamp_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_expr(TeradataParser.Timestamp_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#time_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_expr(TeradataParser.Time_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#date_timestamp_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_timestamp_expr(TeradataParser.Date_timestamp_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(TeradataParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(TeradataParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(TeradataParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(TeradataParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(TeradataParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(TeradataParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#correlation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrelation_name(TeradataParser.Correlation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(TeradataParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(TeradataParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(TeradataParser.Any_nameContext ctx);
}