package grammar;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import grammar.simpleJavaParser.AddSubContext;
import grammar.simpleJavaParser.AtribuicaoContext;
import grammar.simpleJavaParser.BracketContext;
import grammar.simpleJavaParser.ChamadaFuncoesContext;
import grammar.simpleJavaParser.CmdelseContext;
import grammar.simpleJavaParser.CmdforContext;
import grammar.simpleJavaParser.CmdifContext;
import grammar.simpleJavaParser.CmdwhileContext;
import grammar.simpleJavaParser.ComandosContext;
import grammar.simpleJavaParser.DeclConstContext;
import grammar.simpleJavaParser.DeclFuncoesContext;
import grammar.simpleJavaParser.DeclReturnContext;
import grammar.simpleJavaParser.DeclVarsContext;
import grammar.simpleJavaParser.Expr2Context;
import grammar.simpleJavaParser.FloatContext;
import grammar.simpleJavaParser.FunctionCallContext;
import grammar.simpleJavaParser.IdContext;
import grammar.simpleJavaParser.InicAttribContext;
import grammar.simpleJavaParser.InicValContext;
import grammar.simpleJavaParser.IntContext;
import grammar.simpleJavaParser.MultDivContext;
import grammar.simpleJavaParser.ParamCallContext;
import grammar.simpleJavaParser.ParamsContext;
import grammar.simpleJavaParser.PrincipalContext;
import grammar.simpleJavaParser.PrintContext;
import grammar.simpleJavaParser.ProgContext;
import grammar.simpleJavaParser.ReadContext;
import grammar.simpleJavaParser.TipoContext;

public class simpleJavaGenerateCode extends simpleJavaBaseListener{
	
	StringTemplate st;

	public simpleJavaGenerateCode() {
		super();
		st = new StringTemplate();
	}

	@Override
	public void enterParamCall(ParamCallContext ctx) {
		// TODO Auto-generated method stub
		super.enterParamCall(ctx);
	}

	@Override
	public void exitParamCall(ParamCallContext ctx) {
		// TODO Auto-generated method stub
		super.exitParamCall(ctx);
		
	}

	@Override
	public void enterCmdif(CmdifContext ctx) {
		// TODO Auto-generated method stub
		super.enterCmdif(ctx);
		StringBuffer buffer = new StringBuffer();
		buffer.append(ctx.TIF().getText());
		buffer.append(ctx.OB().getText());
		buffer.append(ctx.expr2().getText());
		buffer.append(ctx.CB().getText());
		buffer.append(ctx.OCB().getText());
		st.sb.append(buffer.toString().replace("<>", "=="));
	}

	@Override
	public void exitCmdif(CmdifContext ctx) {
		// TODO Auto-generated method stub
		super.exitCmdif(ctx);
		st.sb.append(ctx.CCB().getText());
	}

	@Override
	public void enterCmdelse(CmdelseContext ctx) {
		// TODO Auto-generated method stub
		super.enterCmdelse(ctx);
		StringBuffer buffer = new StringBuffer();
		buffer.append(ctx.TELSE().toString());
		buffer.append(ctx.OCB().toString());
		st.sb.append(buffer.toString().replace("<>", "=="));
	}

	@Override
	public void exitCmdelse(CmdelseContext ctx) {
		// TODO Auto-generated method stub
		super.exitCmdelse(ctx);
		st.sb.append(ctx.CCB().getText());
	}

	@Override
	public void enterExpr2(Expr2Context ctx) {
		// TODO Auto-generated method stub
		super.enterExpr2(ctx);
	}

	@Override
	public void exitExpr2(Expr2Context ctx) {
		// TODO Auto-generated method stub
		super.exitExpr2(ctx);
	}

	@Override
	public void enterBracket(BracketContext ctx) {
		// TODO Auto-generated method stub
		super.enterBracket(ctx);
	}

	@Override
	public void exitBracket(BracketContext ctx) {
		// TODO Auto-generated method stub
		super.exitBracket(ctx);
	}

	@Override
	public void enterProg(ProgContext ctx) {
		// TODO Auto-generated method stub
		super.enterProg(ctx);
		st.classe(ctx.ID().getText());
	}

	@Override
	public void exitProg(ProgContext ctx) {
		// TODO Auto-generated method stub
		super.exitProg(ctx);
		st.fecha();
		st.generateCode();
	}

	@Override
	public void enterCmdfor(CmdforContext ctx) {
		// TODO Auto-generated method stub
		super.enterCmdfor(ctx);
		st.forInicio(ctx.INT().get(0).toString(), ctx.INT().get(1).toString());
	}

	@Override
	public void exitCmdfor(CmdforContext ctx) {
		// TODO Auto-generated method stub
		super.exitCmdfor(ctx);
		if(ctx.INT().size() == 3){
			st.forFinal(ctx.INT().get(2).toString());
		} else {
			st.forFinal("1");
		}
	}

	@Override
	public void enterAtribuicao(AtribuicaoContext ctx) {
		// TODO Auto-generated method stub
		super.enterAtribuicao(ctx);
	}

	@Override
	public void exitAtribuicao(AtribuicaoContext ctx) {
		// TODO Auto-generated method stub
		super.exitAtribuicao(ctx);
		String context = ctx.getText();
		context = context.replace("<>", "==");
		st.sb.append(context+";");
	}

	@Override
	public void enterPrincipal(PrincipalContext ctx) {
		// TODO Auto-generated method stub
		super.enterPrincipal(ctx);
		st.mainF();
	}

	@Override
	public void exitPrincipal(PrincipalContext ctx) {
		// TODO Auto-generated method stub
		super.exitPrincipal(ctx);
		st.fecha();
	}

	@Override
	public void enterRead(ReadContext ctx) {
		// TODO Auto-generated method stub
		super.enterRead(ctx);
	}

	@Override
	public void exitRead(ReadContext ctx) {
		// TODO Auto-generated method stub
		super.exitRead(ctx);
		for(TerminalNode id : ctx.ID()){
			//descrobre o tipo de id
		}
	}

	@Override
	public void enterInt(IntContext ctx) {
		// TODO Auto-generated method stub
		super.enterInt(ctx);
	}

	@Override
	public void exitInt(IntContext ctx) {
		// TODO Auto-generated method stub
		super.exitInt(ctx);
	}

	@Override
	public void enterChamadaFuncoes(ChamadaFuncoesContext ctx) {
		// TODO Auto-generated method stub
		super.enterChamadaFuncoes(ctx);
	}

	@Override
	public void exitChamadaFuncoes(ChamadaFuncoesContext ctx) {
		// TODO Auto-generated method stub
		super.exitChamadaFuncoes(ctx);
	}

	@Override
	public void enterFloat(FloatContext ctx) {
		// TODO Auto-generated method stub
		super.enterFloat(ctx);
	}

	@Override
	public void exitFloat(FloatContext ctx) {
		// TODO Auto-generated method stub
		super.exitFloat(ctx);
	}

	@Override
	public void enterComandos(ComandosContext ctx) {
		// TODO Auto-generated method stub
		super.enterComandos(ctx);
	}

	@Override
	public void exitComandos(ComandosContext ctx) {
		// TODO Auto-generated method stub
		super.exitComandos(ctx);
	}

	@Override
	public void enterDeclReturn(DeclReturnContext ctx) {
		// TODO Auto-generated method stub
		super.enterDeclReturn(ctx);
	}

	@Override
	public void exitDeclReturn(DeclReturnContext ctx) {
		// TODO Auto-generated method stub
		super.exitDeclReturn(ctx);
	}

	@Override
	public void enterDeclFuncoes(DeclFuncoesContext ctx) {
		// TODO Auto-generated method stub
		super.enterDeclFuncoes(ctx);
	}

	@Override
	public void exitDeclFuncoes(DeclFuncoesContext ctx) {
		// TODO Auto-generated method stub
		super.exitDeclFuncoes(ctx);
	}

	@Override
	public void enterInicAttrib(InicAttribContext ctx) {
		// TODO Auto-generated method stub
		super.enterInicAttrib(ctx);
	}

	@Override
	public void exitInicAttrib(InicAttribContext ctx) {
		// TODO Auto-generated method stub
		super.exitInicAttrib(ctx);
	}

	@Override
	public void enterAddSub(AddSubContext ctx) {
		// TODO Auto-generated method stub
		super.enterAddSub(ctx);
	}

	@Override
	public void exitAddSub(AddSubContext ctx) {
		// TODO Auto-generated method stub
	}

	@Override
	public void enterInicVal(InicValContext ctx) {
		// TODO Auto-generated method stub
		super.enterInicVal(ctx);
	}

	@Override
	public void exitInicVal(InicValContext ctx) {
		// TODO Auto-generated method stub
		super.exitInicVal(ctx);
	}

	@Override
	public void enterParams(ParamsContext ctx) {
		// TODO Auto-generated method stub
		super.enterParams(ctx);
	}

	@Override
	public void exitParams(ParamsContext ctx) {
		// TODO Auto-generated method stub
		super.exitParams(ctx);
	}

	@Override
	public void enterDeclConst(DeclConstContext ctx) {
		// TODO Auto-generated method stub
		super.enterDeclConst(ctx);
	}

	@Override
	public void exitDeclConst(DeclConstContext ctx) {
		// TODO Auto-generated method stub
		super.exitDeclConst(ctx);
		
		String tipo = "";
		if(ctx.tipo().getText().equals("int")) {
			tipo = "int";
		}
		if(ctx.tipo().getText().equals("float")) {
			tipo = "double";
		}
		if(ctx.tipo().getText().equals("string")) {
			tipo = "String";
		}
		if(ctx.tipo().getText().equals("boolean")) {
			tipo = "Boolean";
		}

		st.declConst(tipo, ctx.ID().getText(), ctx.inicVal().getText());
	}

	@Override
	public void enterFunctionCall(FunctionCallContext ctx) {
		// TODO Auto-generated method stub
		super.enterFunctionCall(ctx);
	}

	@Override
	public void exitFunctionCall(FunctionCallContext ctx) {
		// TODO Auto-generated method stub
		super.exitFunctionCall(ctx);
	}

	@Override
	public void enterPrint(PrintContext ctx) {
		// TODO Auto-generated method stub
		super.enterPrint(ctx);
	}

	@Override
	public void exitPrint(PrintContext ctx) {
		// TODO Auto-generated method stub
		super.exitPrint(ctx);
		for(ParamCallContext p : ctx.paramCall()){
			st.print(p.getText());
		}
	}

	@Override
	public void enterMultDiv(MultDivContext ctx) {
		// TODO Auto-generated method stub
		super.enterMultDiv(ctx);
	}

	@Override
	public void exitMultDiv(MultDivContext ctx) {
		// TODO Auto-generated method stub
		super.exitMultDiv(ctx);
	}

	@Override
	public void enterTipo(TipoContext ctx) {
		// TODO Auto-generated method stub
		super.enterTipo(ctx);
	}

	@Override
	public void exitTipo(TipoContext ctx) {
		// TODO Auto-generated method stub
		super.exitTipo(ctx);
	}

	@Override
	public void enterId(IdContext ctx) {
		// TODO Auto-generated method stub
		super.enterId(ctx);
	}

	@Override
	public void exitId(IdContext ctx) {
		// TODO Auto-generated method stub
		super.exitId(ctx);
	}

	@Override
	public void enterCmdwhile(CmdwhileContext ctx) {
		// TODO Auto-generated method stub
		super.enterCmdwhile(ctx);
		StringBuffer buffer = new StringBuffer();
		buffer.append(ctx.TWHILE().getText());
		buffer.append(ctx.OB().getText());
		buffer.append(ctx.expr2().getText());
		buffer.append(ctx.CB().getText());
		buffer.append(ctx.OCB().getText());
		st.sb.append(buffer.toString().replace("<>", "=="));
	}

	@Override
	public void exitCmdwhile(CmdwhileContext ctx) {
		// TODO Auto-generated method stub
		super.exitCmdwhile(ctx);
		st.sb.append(ctx.CCB().getText());
	}

	@Override
	public void enterDeclVars(DeclVarsContext ctx) {
		// TODO Auto-generated method stub
		super.enterDeclVars(ctx);
	}

	@Override
	public void exitDeclVars(DeclVarsContext ctx) {
		// TODO Auto-generated method stub
		super.exitDeclVars(ctx);
		
		String tipo = "";
		if(ctx.tipo().getText().equals("int")) {
			tipo = "int";
		}
		if(ctx.tipo().getText().equals("float")) {
			tipo = "double";
		}
		if(ctx.tipo().getText().equals("string")) {
			tipo = "String";
		}
		if(ctx.tipo().getText().equals("boolean")) {
			tipo = "Boolean";
		}
		
		StringBuilder ids = new StringBuilder();
		String prefix = "";
		for(TerminalNode id : ctx.ID()){
			ids.append(prefix);
			prefix = ",";
			ids.append(id.getText());
		}
		st.declVar(tipo, ids.toString());
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.enterEveryRule(ctx);
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.exitEveryRule(ctx);
	}

	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		super.visitTerminal(node);
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		super.visitErrorNode(node);
	}

}
