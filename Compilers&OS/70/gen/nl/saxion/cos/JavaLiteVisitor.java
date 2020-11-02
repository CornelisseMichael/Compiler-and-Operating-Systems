// Generated from C:/Users/victo/OneDrive/Bureaublad/Compilers & OS/70/src\JavaLite.g4 by ANTLR 4.8
package nl.saxion.cos;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaLiteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaLiteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaLiteParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavaLiteParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLiteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaLiteParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLiteParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(JavaLiteParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLiteParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(JavaLiteParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLiteParser#declareParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareParameters(JavaLiteParser.DeclareParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLiteParser#declareParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareParameter(JavaLiteParser.DeclareParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLiteParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaLiteParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintCall}
	 * labeled alternative in {@link JavaLiteParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCall(JavaLiteParser.PrintCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScannerCall}
	 * labeled alternative in {@link JavaLiteParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScannerCall(JavaLiteParser.ScannerCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomFunctionCall}
	 * labeled alternative in {@link JavaLiteParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomFunctionCall(JavaLiteParser.CustomFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLiteParser#callParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParameters(JavaLiteParser.CallParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLiteParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(JavaLiteParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLiteParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JavaLiteParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLiteParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(JavaLiteParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLiteParser#booleanStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanStatements(JavaLiteParser.BooleanStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link JavaLiteParser#booleanStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(JavaLiteParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDBoolean}
	 * labeled alternative in {@link JavaLiteParser#booleanStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDBoolean(JavaLiteParser.IDBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanValue}
	 * labeled alternative in {@link JavaLiteParser#booleanStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(JavaLiteParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(JavaLiteParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(JavaLiteParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyExpr}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpr(JavaLiteParser.MultiplyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDLiteral}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDLiteral(JavaLiteParser.IDLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionValue}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValue(JavaLiteParser.FunctionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(JavaLiteParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link JavaLiteParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(JavaLiteParser.AddExprContext ctx);
}