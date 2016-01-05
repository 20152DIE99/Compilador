package grammar;
// Generated from /Users/laercioag/Documents/Grammars/simpleJava/simpleJava.g4 by ANTLR 4.1

   import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleJavaParser}.
 */
public interface simpleJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#declReturn}.
	 * @param ctx the parse tree
	 */
	void enterDeclReturn(@NotNull simpleJavaParser.DeclReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#declReturn}.
	 * @param ctx the parse tree
	 */
	void exitDeclReturn(@NotNull simpleJavaParser.DeclReturnContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(@NotNull simpleJavaParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(@NotNull simpleJavaParser.ComandosContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#declFuncoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclFuncoes(@NotNull simpleJavaParser.DeclFuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#declFuncoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclFuncoes(@NotNull simpleJavaParser.DeclFuncoesContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#cmdifelse}.
	 * @param ctx the parse tree
	 */
	void enterCmdifelse(@NotNull simpleJavaParser.CmdifelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#cmdifelse}.
	 * @param ctx the parse tree
	 */
	void exitCmdifelse(@NotNull simpleJavaParser.CmdifelseContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(@NotNull simpleJavaParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(@NotNull simpleJavaParser.Expr2Context ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull simpleJavaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull simpleJavaParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#declConst}.
	 * @param ctx the parse tree
	 */
	void enterDeclConst(@NotNull simpleJavaParser.DeclConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#declConst}.
	 * @param ctx the parse tree
	 */
	void exitDeclConst(@NotNull simpleJavaParser.DeclConstContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull simpleJavaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull simpleJavaParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull simpleJavaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull simpleJavaParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(@NotNull simpleJavaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(@NotNull simpleJavaParser.AtribuicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#cmdfor}.
	 * @param ctx the parse tree
	 */
	void enterCmdfor(@NotNull simpleJavaParser.CmdforContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#cmdfor}.
	 * @param ctx the parse tree
	 */
	void exitCmdfor(@NotNull simpleJavaParser.CmdforContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(@NotNull simpleJavaParser.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(@NotNull simpleJavaParser.PrincipalContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull simpleJavaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull simpleJavaParser.TipoContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull simpleJavaParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull simpleJavaParser.ReadContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#cmdwhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdwhile(@NotNull simpleJavaParser.CmdwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#cmdwhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdwhile(@NotNull simpleJavaParser.CmdwhileContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#declVars}.
	 * @param ctx the parse tree
	 */
	void enterDeclVars(@NotNull simpleJavaParser.DeclVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#declVars}.
	 * @param ctx the parse tree
	 */
	void exitDeclVars(@NotNull simpleJavaParser.DeclVarsContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#chamadaFuncoes}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncoes(@NotNull simpleJavaParser.ChamadaFuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#chamadaFuncoes}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncoes(@NotNull simpleJavaParser.ChamadaFuncoesContext ctx);
}