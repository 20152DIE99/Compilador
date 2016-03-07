// Generated from /home/rafael/workspace/Compiladores/Compiler2IDE/src/grammar/simpleJava.g4 by ANTLR 4.1

   package grammar;
   import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleJavaParser}.
 */
public interface simpleJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#paramCall}.
	 * @param ctx the parse tree
	 */
	void enterParamCall(@NotNull simpleJavaParser.ParamCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#paramCall}.
	 * @param ctx the parse tree
	 */
	void exitParamCall(@NotNull simpleJavaParser.ParamCallContext ctx);

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
	 * Enter a parse tree produced by {@link simpleJavaParser#Bracket}.
	 * @param ctx the parse tree
	 */
	void enterBracket(@NotNull simpleJavaParser.BracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#Bracket}.
	 * @param ctx the parse tree
	 */
	void exitBracket(@NotNull simpleJavaParser.BracketContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#cmdif}.
	 * @param ctx the parse tree
	 */
	void enterCmdif(@NotNull simpleJavaParser.CmdifContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#cmdif}.
	 * @param ctx the parse tree
	 */
	void exitCmdif(@NotNull simpleJavaParser.CmdifContext ctx);

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
	 * Enter a parse tree produced by {@link simpleJavaParser#Int}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull simpleJavaParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#Int}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull simpleJavaParser.IntContext ctx);

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

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#Float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(@NotNull simpleJavaParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#Float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(@NotNull simpleJavaParser.FloatContext ctx);

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
	 * Enter a parse tree produced by {@link simpleJavaParser#inicAttrib}.
	 * @param ctx the parse tree
	 */
	void enterInicAttrib(@NotNull simpleJavaParser.InicAttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#inicAttrib}.
	 * @param ctx the parse tree
	 */
	void exitInicAttrib(@NotNull simpleJavaParser.InicAttribContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#AddSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull simpleJavaParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#AddSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull simpleJavaParser.AddSubContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#inicVal}.
	 * @param ctx the parse tree
	 */
	void enterInicVal(@NotNull simpleJavaParser.InicValContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#inicVal}.
	 * @param ctx the parse tree
	 */
	void exitInicVal(@NotNull simpleJavaParser.InicValContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull simpleJavaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull simpleJavaParser.ParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#FunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull simpleJavaParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#FunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull simpleJavaParser.FunctionCallContext ctx);

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
	 * Enter a parse tree produced by {@link simpleJavaParser#MultDiv}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(@NotNull simpleJavaParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#MultDiv}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(@NotNull simpleJavaParser.MultDivContext ctx);

	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#cmdelse}.
	 * @param ctx the parse tree
	 */
	void enterCmdelse(@NotNull simpleJavaParser.CmdelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#cmdelse}.
	 * @param ctx the parse tree
	 */
	void exitCmdelse(@NotNull simpleJavaParser.CmdelseContext ctx);

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
	 * Enter a parse tree produced by {@link simpleJavaParser#Id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull simpleJavaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#Id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull simpleJavaParser.IdContext ctx);

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
}