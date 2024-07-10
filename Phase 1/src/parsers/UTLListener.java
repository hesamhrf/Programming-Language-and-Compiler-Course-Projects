// Generated from C:/Users/asus/Desktop/Compiler CA P1/src/main/grammar/UTL.g4 by ANTLR 4.13.1
package parsers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UTLParser}.
 */
public interface UTLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UTLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(UTLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(UTLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#external_init_var}.
	 * @param ctx the parse tree
	 */
	void enterExternal_init_var(UTLParser.External_init_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#external_init_var}.
	 * @param ctx the parse tree
	 */
	void exitExternal_init_var(UTLParser.External_init_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(UTLParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(UTLParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#on_init_start_func}.
	 * @param ctx the parse tree
	 */
	void enterOn_init_start_func(UTLParser.On_init_start_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#on_init_start_func}.
	 * @param ctx the parse tree
	 */
	void exitOn_init_start_func(UTLParser.On_init_start_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(UTLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(UTLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#function_args}.
	 * @param ctx the parse tree
	 */
	void enterFunction_args(UTLParser.Function_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#function_args}.
	 * @param ctx the parse tree
	 */
	void exitFunction_args(UTLParser.Function_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(UTLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(UTLParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#body_general_ends}.
	 * @param ctx the parse tree
	 */
	void enterBody_general_ends(UTLParser.Body_general_endsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#body_general_ends}.
	 * @param ctx the parse tree
	 */
	void exitBody_general_ends(UTLParser.Body_general_endsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#body_return}.
	 * @param ctx the parse tree
	 */
	void enterBody_return(UTLParser.Body_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#body_return}.
	 * @param ctx the parse tree
	 */
	void exitBody_return(UTLParser.Body_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#body_general_blocks}.
	 * @param ctx the parse tree
	 */
	void enterBody_general_blocks(UTLParser.Body_general_blocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#body_general_blocks}.
	 * @param ctx the parse tree
	 */
	void exitBody_general_blocks(UTLParser.Body_general_blocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#body_general_instructions}.
	 * @param ctx the parse tree
	 */
	void enterBody_general_instructions(UTLParser.Body_general_instructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#body_general_instructions}.
	 * @param ctx the parse tree
	 */
	void exitBody_general_instructions(UTLParser.Body_general_instructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#body_general_calls}.
	 * @param ctx the parse tree
	 */
	void enterBody_general_calls(UTLParser.Body_general_callsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#body_general_calls}.
	 * @param ctx the parse tree
	 */
	void exitBody_general_calls(UTLParser.Body_general_callsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#static_init_var}.
	 * @param ctx the parse tree
	 */
	void enterStatic_init_var(UTLParser.Static_init_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#static_init_var}.
	 * @param ctx the parse tree
	 */
	void exitStatic_init_var(UTLParser.Static_init_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#if_else_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_block(UTLParser.If_else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#if_else_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_block(UTLParser.If_else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(UTLParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(UTLParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(UTLParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(UTLParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(UTLParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(UTLParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(UTLParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(UTLParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#try_catch_block}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_block(UTLParser.Try_catch_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#try_catch_block}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_block(UTLParser.Try_catch_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#try}.
	 * @param ctx the parse tree
	 */
	void enterTry(UTLParser.TryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#try}.
	 * @param ctx the parse tree
	 */
	void exitTry(UTLParser.TryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#try_catch}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch(UTLParser.Try_catchContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#try_catch}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch(UTLParser.Try_catchContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#body_scope}.
	 * @param ctx the parse tree
	 */
	void enterBody_scope(UTLParser.Body_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#body_scope}.
	 * @param ctx the parse tree
	 */
	void exitBody_scope(UTLParser.Body_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#print_call}.
	 * @param ctx the parse tree
	 */
	void enterPrint_call(UTLParser.Print_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#print_call}.
	 * @param ctx the parse tree
	 */
	void exitPrint_call(UTLParser.Print_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(UTLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(UTLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#schedule_init}.
	 * @param ctx the parse tree
	 */
	void enterSchedule_init(UTLParser.Schedule_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#schedule_init}.
	 * @param ctx the parse tree
	 */
	void exitSchedule_init(UTLParser.Schedule_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#trade_exp}.
	 * @param ctx the parse tree
	 */
	void enterTrade_exp(UTLParser.Trade_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#trade_exp}.
	 * @param ctx the parse tree
	 */
	void exitTrade_exp(UTLParser.Trade_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#schedule_rule}.
	 * @param ctx the parse tree
	 */
	void enterSchedule_rule(UTLParser.Schedule_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#schedule_rule}.
	 * @param ctx the parse tree
	 */
	void exitSchedule_rule(UTLParser.Schedule_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#trade_id}.
	 * @param ctx the parse tree
	 */
	void enterTrade_id(UTLParser.Trade_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#trade_id}.
	 * @param ctx the parse tree
	 */
	void exitTrade_id(UTLParser.Trade_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#experssion}.
	 * @param ctx the parse tree
	 */
	void enterExperssion(UTLParser.ExperssionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#experssion}.
	 * @param ctx the parse tree
	 */
	void exitExperssion(UTLParser.ExperssionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(UTLParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(UTLParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp1prim}.
	 * @param ctx the parse tree
	 */
	void enterExp1prim(UTLParser.Exp1primContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp1prim}.
	 * @param ctx the parse tree
	 */
	void exitExp1prim(UTLParser.Exp1primContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExp2(UTLParser.Exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExp2(UTLParser.Exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp3}.
	 * @param ctx the parse tree
	 */
	void enterExp3(UTLParser.Exp3Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp3}.
	 * @param ctx the parse tree
	 */
	void exitExp3(UTLParser.Exp3Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp4}.
	 * @param ctx the parse tree
	 */
	void enterExp4(UTLParser.Exp4Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp4}.
	 * @param ctx the parse tree
	 */
	void exitExp4(UTLParser.Exp4Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp4prim}.
	 * @param ctx the parse tree
	 */
	void enterExp4prim(UTLParser.Exp4primContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp4prim}.
	 * @param ctx the parse tree
	 */
	void exitExp4prim(UTLParser.Exp4primContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp5}.
	 * @param ctx the parse tree
	 */
	void enterExp5(UTLParser.Exp5Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp5}.
	 * @param ctx the parse tree
	 */
	void exitExp5(UTLParser.Exp5Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp5prim}.
	 * @param ctx the parse tree
	 */
	void enterExp5prim(UTLParser.Exp5primContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp5prim}.
	 * @param ctx the parse tree
	 */
	void exitExp5prim(UTLParser.Exp5primContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp6}.
	 * @param ctx the parse tree
	 */
	void enterExp6(UTLParser.Exp6Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp6}.
	 * @param ctx the parse tree
	 */
	void exitExp6(UTLParser.Exp6Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp6prim}.
	 * @param ctx the parse tree
	 */
	void enterExp6prim(UTLParser.Exp6primContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp6prim}.
	 * @param ctx the parse tree
	 */
	void exitExp6prim(UTLParser.Exp6primContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp7}.
	 * @param ctx the parse tree
	 */
	void enterExp7(UTLParser.Exp7Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp7}.
	 * @param ctx the parse tree
	 */
	void exitExp7(UTLParser.Exp7Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp7prim}.
	 * @param ctx the parse tree
	 */
	void enterExp7prim(UTLParser.Exp7primContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp7prim}.
	 * @param ctx the parse tree
	 */
	void exitExp7prim(UTLParser.Exp7primContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp8}.
	 * @param ctx the parse tree
	 */
	void enterExp8(UTLParser.Exp8Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp8}.
	 * @param ctx the parse tree
	 */
	void exitExp8(UTLParser.Exp8Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp8prim}.
	 * @param ctx the parse tree
	 */
	void enterExp8prim(UTLParser.Exp8primContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp8prim}.
	 * @param ctx the parse tree
	 */
	void exitExp8prim(UTLParser.Exp8primContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp9}.
	 * @param ctx the parse tree
	 */
	void enterExp9(UTLParser.Exp9Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp9}.
	 * @param ctx the parse tree
	 */
	void exitExp9(UTLParser.Exp9Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp9prim}.
	 * @param ctx the parse tree
	 */
	void enterExp9prim(UTLParser.Exp9primContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp9prim}.
	 * @param ctx the parse tree
	 */
	void exitExp9prim(UTLParser.Exp9primContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp10}.
	 * @param ctx the parse tree
	 */
	void enterExp10(UTLParser.Exp10Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp10}.
	 * @param ctx the parse tree
	 */
	void exitExp10(UTLParser.Exp10Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp11}.
	 * @param ctx the parse tree
	 */
	void enterExp11(UTLParser.Exp11Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp11}.
	 * @param ctx the parse tree
	 */
	void exitExp11(UTLParser.Exp11Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp11prim}.
	 * @param ctx the parse tree
	 */
	void enterExp11prim(UTLParser.Exp11primContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp11prim}.
	 * @param ctx the parse tree
	 */
	void exitExp11prim(UTLParser.Exp11primContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp12}.
	 * @param ctx the parse tree
	 */
	void enterExp12(UTLParser.Exp12Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp12}.
	 * @param ctx the parse tree
	 */
	void exitExp12(UTLParser.Exp12Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp13}.
	 * @param ctx the parse tree
	 */
	void enterExp13(UTLParser.Exp13Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp13}.
	 * @param ctx the parse tree
	 */
	void exitExp13(UTLParser.Exp13Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp14}.
	 * @param ctx the parse tree
	 */
	void enterExp14(UTLParser.Exp14Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp14}.
	 * @param ctx the parse tree
	 */
	void exitExp14(UTLParser.Exp14Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exp15}.
	 * @param ctx the parse tree
	 */
	void enterExp15(UTLParser.Exp15Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exp15}.
	 * @param ctx the parse tree
	 */
	void exitExp15(UTLParser.Exp15Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#body_experssion}.
	 * @param ctx the parse tree
	 */
	void enterBody_experssion(UTLParser.Body_experssionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#body_experssion}.
	 * @param ctx the parse tree
	 */
	void exitBody_experssion(UTLParser.Body_experssionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#class_member}.
	 * @param ctx the parse tree
	 */
	void enterClass_member(UTLParser.Class_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#class_member}.
	 * @param ctx the parse tree
	 */
	void exitClass_member(UTLParser.Class_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(UTLParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(UTLParser.Assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#assign_arr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_arr(UTLParser.Assign_arrContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#assign_arr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_arr(UTLParser.Assign_arrContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#assign_experssion}.
	 * @param ctx the parse tree
	 */
	void enterAssign_experssion(UTLParser.Assign_experssionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#assign_experssion}.
	 * @param ctx the parse tree
	 */
	void exitAssign_experssion(UTLParser.Assign_experssionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(UTLParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(UTLParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#inc_dec_a}.
	 * @param ctx the parse tree
	 */
	void enterInc_dec_a(UTLParser.Inc_dec_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#inc_dec_a}.
	 * @param ctx the parse tree
	 */
	void exitInc_dec_a(UTLParser.Inc_dec_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#inc_dec_p}.
	 * @param ctx the parse tree
	 */
	void enterInc_dec_p(UTLParser.Inc_dec_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#inc_dec_p}.
	 * @param ctx the parse tree
	 */
	void exitInc_dec_p(UTLParser.Inc_dec_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#init_var}.
	 * @param ctx the parse tree
	 */
	void enterInit_var(UTLParser.Init_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#init_var}.
	 * @param ctx the parse tree
	 */
	void exitInit_var(UTLParser.Init_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#init_arr}.
	 * @param ctx the parse tree
	 */
	void enterInit_arr(UTLParser.Init_arrContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#init_arr}.
	 * @param ctx the parse tree
	 */
	void exitInit_arr(UTLParser.Init_arrContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#assign_init_experssion}.
	 * @param ctx the parse tree
	 */
	void enterAssign_init_experssion(UTLParser.Assign_init_experssionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#assign_init_experssion}.
	 * @param ctx the parse tree
	 */
	void exitAssign_init_experssion(UTLParser.Assign_init_experssionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#arr_index}.
	 * @param ctx the parse tree
	 */
	void enterArr_index(UTLParser.Arr_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#arr_index}.
	 * @param ctx the parse tree
	 */
	void exitArr_index(UTLParser.Arr_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#assign_types}.
	 * @param ctx the parse tree
	 */
	void enterAssign_types(UTLParser.Assign_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#assign_types}.
	 * @param ctx the parse tree
	 */
	void exitAssign_types(UTLParser.Assign_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#throw_execption}.
	 * @param ctx the parse tree
	 */
	void enterThrow_execption(UTLParser.Throw_execptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#throw_execption}.
	 * @param ctx the parse tree
	 */
	void exitThrow_execption(UTLParser.Throw_execptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#execption_constructor}.
	 * @param ctx the parse tree
	 */
	void enterExecption_constructor(UTLParser.Execption_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#execption_constructor}.
	 * @param ctx the parse tree
	 */
	void exitExecption_constructor(UTLParser.Execption_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#assign_function}.
	 * @param ctx the parse tree
	 */
	void enterAssign_function(UTLParser.Assign_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#assign_function}.
	 * @param ctx the parse tree
	 */
	void exitAssign_function(UTLParser.Assign_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#function_names}.
	 * @param ctx the parse tree
	 */
	void enterFunction_names(UTLParser.Function_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#function_names}.
	 * @param ctx the parse tree
	 */
	void exitFunction_names(UTLParser.Function_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(UTLParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(UTLParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#primitives}.
	 * @param ctx the parse tree
	 */
	void enterPrimitives(UTLParser.PrimitivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#primitives}.
	 * @param ctx the parse tree
	 */
	void exitPrimitives(UTLParser.PrimitivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#utl_types}.
	 * @param ctx the parse tree
	 */
	void enterUtl_types(UTLParser.Utl_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#utl_types}.
	 * @param ctx the parse tree
	 */
	void exitUtl_types(UTLParser.Utl_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#arr_primitives}.
	 * @param ctx the parse tree
	 */
	void enterArr_primitives(UTLParser.Arr_primitivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#arr_primitives}.
	 * @param ctx the parse tree
	 */
	void exitArr_primitives(UTLParser.Arr_primitivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#primitives_vals}.
	 * @param ctx the parse tree
	 */
	void enterPrimitives_vals(UTLParser.Primitives_valsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#primitives_vals}.
	 * @param ctx the parse tree
	 */
	void exitPrimitives_vals(UTLParser.Primitives_valsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#order_type}.
	 * @param ctx the parse tree
	 */
	void enterOrder_type(UTLParser.Order_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#order_type}.
	 * @param ctx the parse tree
	 */
	void exitOrder_type(UTLParser.Order_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#class_attributes}.
	 * @param ctx the parse tree
	 */
	void enterClass_attributes(UTLParser.Class_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#class_attributes}.
	 * @param ctx the parse tree
	 */
	void exitClass_attributes(UTLParser.Class_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#trade_attributes}.
	 * @param ctx the parse tree
	 */
	void enterTrade_attributes(UTLParser.Trade_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#trade_attributes}.
	 * @param ctx the parse tree
	 */
	void exitTrade_attributes(UTLParser.Trade_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#candle_attributes}.
	 * @param ctx the parse tree
	 */
	void enterCandle_attributes(UTLParser.Candle_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#candle_attributes}.
	 * @param ctx the parse tree
	 */
	void exitCandle_attributes(UTLParser.Candle_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#execption_attributes}.
	 * @param ctx the parse tree
	 */
	void enterExecption_attributes(UTLParser.Execption_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#execption_attributes}.
	 * @param ctx the parse tree
	 */
	void exitExecption_attributes(UTLParser.Execption_attributesContext ctx);
}