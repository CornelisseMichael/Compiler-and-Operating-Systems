// Generated from C:/Users/victo/OneDrive/Bureaublad/Compilers & OS/70/src\JavaLite.g4 by ANTLR 4.8
package nl.saxion.cos;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaLiteParser}.
 */
public interface JavaLiteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaLiteParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaLiteParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLiteParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaLiteParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLiteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaLiteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLiteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaLiteParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLiteParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(JavaLiteParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLiteParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(JavaLiteParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLiteParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(JavaLiteParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLiteParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(JavaLiteParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLiteParser#declareParameters}.
	 * @param ctx the parse tree
	 */
	void enterDeclareParameters(JavaLiteParser.DeclareParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLiteParser#declareParameters}.
	 * @param ctx the parse tree
	 */
	void exitDeclareParameters(JavaLiteParser.DeclareParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLiteParser#declareParameter}.
	 * @param ctx the parse tree
	 */
	void enterDeclareParameter(JavaLiteParser.DeclareParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLiteParser#declareParameter}.
	 * @param ctx the parse tree
	 */
	void exitDeclareParameter(JavaLiteParser.DeclareParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLiteParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaLiteParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLiteParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaLiteParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintCall}
	 * labeled alternative in {@link JavaLiteParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintCall(JavaLiteParser.PrintCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintCall}
	 * labeled alternative in {@link JavaLiteParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintCall(JavaLiteParser.PrintCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScannerCall}
	 * labeled alternative in {@link JavaLiteParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterScannerCall(JavaLiteParser.ScannerCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScannerCall}
	 * labeled alternative in {@link JavaLiteParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitScannerCall(JavaLiteParser.ScannerCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomFunctionCall}
	 * labeled alternative in {@link JavaLiteParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterCustomFunctionCall(JavaLiteParser.CustomFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomFunctionCall}
	 * labeled alternative in {@link JavaLiteParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitCustomFunctionCall(JavaLiteParser.CustomFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLiteParser#callParameters}.
	 * @param ctx the parse tree
	 */
	void enterCallParameters(JavaLiteParser.CallParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLiteParser#callParameters}.
	 * @param ctx the parse tree
	 */
	void exitCallParameters(JavaLiteParser.CallParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLiteParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JavaLiteParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLiteParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JavaLiteParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLiteParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JavaLiteParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLiteParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JavaLiteParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLiteParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(JavaLiteParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLiteParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(JavaLiteParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLiteParser#booleanStatements}.
	 * @param ctx the parse tree
	 */
	void enterBooleanStatements(JavaLiteParser.BooleanStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLiteParser#booleanStatements}.
	 * @param ctx the parse tree
	 */
	void exitBooleanStatements(JavaLiteParser.BooleanStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link JavaLiteParser#booleanStatement}.
	 * @param ctx the parse tree
	 */
	void enterComparison(JavaLiteParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link JavaLiteParser#booleanStatement}.
	 * @param ctx the parse tree
	 */
	void exitComparison(JavaLiteParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDBoolean}
	 * labeled alternative in {@link JavaLiteParser#booleanStatement}.
	 * @param ctx the parse tree
	 */
	void enterIDBoolean(JavaLiteParser.IDBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDBoolean}
	 * labeled alternative in {@link JavaLiteParser#booleanStatement}.
	 * @param ctx the parse tree
	 */
	void exitIDBoolean(JavaLiteParser.IDBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanValue}
	 * labeled alternative in {@link JavaLiteParser#booleanStatement}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(JavaLiteParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanValue}
	 * labeled alternative in {@link JavaLiteParser#booleanStatement}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(JavaLiteParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(JavaLiteParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(JavaLiteParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(JavaLiteParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(JavaLiteParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyExpr}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpr(JavaLiteParser.MultiplyExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyExpr}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpr(JavaLiteParser.MultiplyExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDLiteral}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIDLiteral(JavaLiteParser.IDLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDLiteral}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIDLiteral(JavaLiteParser.IDLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionValue}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValue(JavaLiteParser.FunctionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionValue}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValue(JavaLiteParser.FunctionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(JavaLiteParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(JavaLiteParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(JavaLiteParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(JavaLiteParser.AddExprContext ctx);
}