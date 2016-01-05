package grammar;
// Generated from /Users/laercioag/Documents/Grammars/simpleJava/simpleJava.g4 by ANTLR 4.1

   import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#declReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclReturn(@NotNull simpleJavaParser.DeclReturnContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(@NotNull simpleJavaParser.ComandosContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#declFuncoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclFuncoes(@NotNull simpleJavaParser.DeclFuncoesContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#cmdifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdifelse(@NotNull simpleJavaParser.CmdifelseContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(@NotNull simpleJavaParser.Expr2Context ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull simpleJavaParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#declConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclConst(@NotNull simpleJavaParser.DeclConstContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull simpleJavaParser.PrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull simpleJavaParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(@NotNull simpleJavaParser.AtribuicaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#cmdfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdfor(@NotNull simpleJavaParser.CmdforContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrincipal(@NotNull simpleJavaParser.PrincipalContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(@NotNull simpleJavaParser.TipoContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(@NotNull simpleJavaParser.ReadContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#cmdwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdwhile(@NotNull simpleJavaParser.CmdwhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#declVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVars(@NotNull simpleJavaParser.DeclVarsContext ctx);

	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#chamadaFuncoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaFuncoes(@NotNull simpleJavaParser.ChamadaFuncoesContext ctx);
}