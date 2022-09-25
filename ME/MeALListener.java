// Generated from MeAL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MeALParser}.
 */
public interface MeALListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MeALParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MeALParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MeALParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(MeALParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(MeALParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void enterListDecl(MeALParser.ListDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void exitListDecl(MeALParser.ListDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#declTip}.
	 * @param ctx the parse tree
	 */
	void enterDeclTip(MeALParser.DeclTipContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#declTip}.
	 * @param ctx the parse tree
	 */
	void exitDeclTip(MeALParser.DeclTipContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#listId}.
	 * @param ctx the parse tree
	 */
	void enterListId(MeALParser.ListIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#listId}.
	 * @param ctx the parse tree
	 */
	void exitListId(MeALParser.ListIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#tip}.
	 * @param ctx the parse tree
	 */
	void enterTip(MeALParser.TipContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#tip}.
	 * @param ctx the parse tree
	 */
	void exitTip(MeALParser.TipContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#cmdComp}.
	 * @param ctx the parse tree
	 */
	void enterCmdComp(MeALParser.CmdCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#cmdComp}.
	 * @param ctx the parse tree
	 */
	void exitCmdComp(MeALParser.CmdCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#listCmd}.
	 * @param ctx the parse tree
	 */
	void enterListCmd(MeALParser.ListCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#listCmd}.
	 * @param ctx the parse tree
	 */
	void exitListCmd(MeALParser.ListCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(MeALParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(MeALParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(MeALParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(MeALParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(MeALParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(MeALParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(MeALParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(MeALParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(MeALParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(MeALParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#listW}.
	 * @param ctx the parse tree
	 */
	void enterListW(MeALParser.ListWContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#listW}.
	 * @param ctx the parse tree
	 */
	void exitListW(MeALParser.ListWContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#elemW}.
	 * @param ctx the parse tree
	 */
	void enterElemW(MeALParser.ElemWContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#elemW}.
	 * @param ctx the parse tree
	 */
	void exitElemW(MeALParser.ElemWContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtrib(MeALParser.CmdAtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtrib(MeALParser.CmdAtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MeALParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MeALParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeALParser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(MeALParser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeALParser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(MeALParser.ExprBoolContext ctx);
}