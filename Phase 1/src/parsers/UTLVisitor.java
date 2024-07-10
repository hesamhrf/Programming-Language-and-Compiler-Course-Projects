// Generated from C:/Users/asus/Desktop/Compiler CA P1/src/main/grammar/UTL.g4 by ANTLR 4.13.1
package parsers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UTLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UTLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UTLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(UTLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#external_init_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_init_var(UTLParser.External_init_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(UTLParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#on_init_start_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_init_start_func(UTLParser.On_init_start_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(UTLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#function_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_args(UTLParser.Function_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(UTLParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#body_general_ends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_general_ends(UTLParser.Body_general_endsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#body_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_return(UTLParser.Body_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#body_general_blocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_general_blocks(UTLParser.Body_general_blocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#body_general_instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_general_instructions(UTLParser.Body_general_instructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#body_general_calls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_general_calls(UTLParser.Body_general_callsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#static_init_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_init_var(UTLParser.Static_init_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#if_else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_block(UTLParser.If_else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(UTLParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(UTLParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(UTLParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(UTLParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#try_catch_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_block(UTLParser.Try_catch_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#try}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry(UTLParser.TryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#try_catch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch(UTLParser.Try_catchContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#body_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_scope(UTLParser.Body_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#print_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_call(UTLParser.Print_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(UTLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#schedule_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchedule_init(UTLParser.Schedule_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#trade_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrade_exp(UTLParser.Trade_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#schedule_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchedule_rule(UTLParser.Schedule_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#trade_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrade_id(UTLParser.Trade_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#experssion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExperssion(UTLParser.ExperssionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp1(UTLParser.Exp1Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp1prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp1prim(UTLParser.Exp1primContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp2(UTLParser.Exp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp3(UTLParser.Exp3Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp4(UTLParser.Exp4Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp4prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp4prim(UTLParser.Exp4primContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp5(UTLParser.Exp5Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp5prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp5prim(UTLParser.Exp5primContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp6(UTLParser.Exp6Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp6prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp6prim(UTLParser.Exp6primContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp7(UTLParser.Exp7Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp7prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp7prim(UTLParser.Exp7primContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp8(UTLParser.Exp8Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp8prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp8prim(UTLParser.Exp8primContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp9(UTLParser.Exp9Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp9prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp9prim(UTLParser.Exp9primContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp10}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp10(UTLParser.Exp10Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp11}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp11(UTLParser.Exp11Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp11prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp11prim(UTLParser.Exp11primContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp12}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp12(UTLParser.Exp12Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp13}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp13(UTLParser.Exp13Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp14}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp14(UTLParser.Exp14Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exp15}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp15(UTLParser.Exp15Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#body_experssion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_experssion(UTLParser.Body_experssionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#class_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_member(UTLParser.Class_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(UTLParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#assign_arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_arr(UTLParser.Assign_arrContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#assign_experssion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_experssion(UTLParser.Assign_experssionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(UTLParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#inc_dec_a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_dec_a(UTLParser.Inc_dec_aContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#inc_dec_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_dec_p(UTLParser.Inc_dec_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#init_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_var(UTLParser.Init_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#init_arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_arr(UTLParser.Init_arrContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#assign_init_experssion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_init_experssion(UTLParser.Assign_init_experssionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#arr_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_index(UTLParser.Arr_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#assign_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_types(UTLParser.Assign_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#throw_execption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_execption(UTLParser.Throw_execptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#execption_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecption_constructor(UTLParser.Execption_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#assign_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_function(UTLParser.Assign_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#function_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_names(UTLParser.Function_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(UTLParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#primitives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitives(UTLParser.PrimitivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#utl_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtl_types(UTLParser.Utl_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#arr_primitives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_primitives(UTLParser.Arr_primitivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#primitives_vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitives_vals(UTLParser.Primitives_valsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#order_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_type(UTLParser.Order_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#class_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_attributes(UTLParser.Class_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#trade_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrade_attributes(UTLParser.Trade_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#candle_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCandle_attributes(UTLParser.Candle_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#execption_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecption_attributes(UTLParser.Execption_attributesContext ctx);
}