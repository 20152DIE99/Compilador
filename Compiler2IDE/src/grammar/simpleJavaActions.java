package grammar;

import java.util.IdentityHashMap;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import compileride.CompilerIDE;
import grammar.simpleJavaParser.AddSubContext;
import grammar.simpleJavaParser.AtribuicaoContext;
import grammar.simpleJavaParser.BracketContext;
import grammar.simpleJavaParser.ChamadaFuncoesContext;
import grammar.simpleJavaParser.CmdforContext;
import grammar.simpleJavaParser.CmdifelseContext;
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
import grammar.simpleJavaParser.IntContext;
import grammar.simpleJavaParser.MultDivContext;
import grammar.simpleJavaParser.PrincipalContext;
import grammar.simpleJavaParser.PrintContext;
import grammar.simpleJavaParser.ProgContext;
import grammar.simpleJavaParser.ReadContext;
import grammar.simpleJavaParser.TipoContext;

public class simpleJavaActions extends simpleJavaBaseListener {

	CompilerIDE ide;
	simpleJavaParser parser;
	private IdentityHashMap<ParserRuleContext, AnnotatedTreeNode> values = 
			new IdentityHashMap<ParserRuleContext, AnnotatedTreeNode>(); 
	
	//Getter and setter methods for the annotedTree informations	
	/**
	 * @return 
	 */
	public AnnotatedTreeNode getValue(ParserRuleContext node) {
		return this.values.get(node);
	}
	
	public void setValue(ParserRuleContext node, AnnotatedTreeNode annotedNode) {
		this.values.put(node, annotedNode);
	}	
	
	public simpleJavaActions(CompilerIDE ide, simpleJavaParser parser) {
		super();
		this.ide = ide;
		this.parser = parser;
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
	public void enterCmdifelse(CmdifelseContext ctx) {
		// TODO Auto-generated method stub
		super.enterCmdifelse(ctx);
	}

	@Override
	public void exitCmdifelse(CmdifelseContext ctx) {
		// TODO Auto-generated method stub
		super.exitCmdifelse(ctx);
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
	public void enterDeclConst(DeclConstContext ctx) {
		// TODO Auto-generated method stub
		super.enterDeclConst(ctx);
	}

	@Override
	public void exitDeclConst(DeclConstContext ctx) {
		// TODO Auto-generated method stub
		super.exitDeclConst(ctx);
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
	}

	@Override
	public void enterProg(ProgContext ctx) {
		// TODO Auto-generated method stub
		super.enterProg(ctx);
	}

	@Override
	public void exitProg(ProgContext ctx) {
		// TODO Auto-generated method stub
		super.exitProg(ctx);
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
	}

	@Override
	public void enterCmdfor(CmdforContext ctx) {
		// TODO Auto-generated method stub
		super.enterCmdfor(ctx);
	}

	@Override
	public void exitCmdfor(CmdforContext ctx) {
		// TODO Auto-generated method stub
		super.exitCmdfor(ctx);
	}

	@Override
	public void enterPrincipal(PrincipalContext ctx) {
		// TODO Auto-generated method stub
		super.enterPrincipal(ctx);
	}

	@Override
	public void exitPrincipal(PrincipalContext ctx) {
		// TODO Auto-generated method stub
		super.exitPrincipal(ctx);
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
	public void enterRead(ReadContext ctx) {
		// TODO Auto-generated method stub
		super.enterRead(ctx);
	}

	@Override
	public void exitRead(ReadContext ctx) {
		// TODO Auto-generated method stub
		super.exitRead(ctx);
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
	public void enterInt(IntContext ctx) {
		// TODO Auto-generated method stub
		super.enterInt(ctx);
	}

	@Override
	public void exitInt(IntContext ctx) {
		// TODO Auto-generated method stub
		super.exitInt(ctx);
		AnnotatedTreeNode annotedNode = 
				new AnnotatedTreeNode(DataType.INT, Integer.parseInt(ctx.getText()));
		//TODO
		this.setValue(ctx, annotedNode);
	}

	@Override
	public void enterCmdwhile(CmdwhileContext ctx) {
		// TODO Auto-generated method stub
		super.enterCmdwhile(ctx);
	}

	@Override
	public void exitCmdwhile(CmdwhileContext ctx) {
		// TODO Auto-generated method stub
		super.exitCmdwhile(ctx);
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

	@Override
	public void enterAddSub(AddSubContext ctx) {
		// TODO Auto-generated method stub
		super.enterAddSub(ctx);
	}

	@Override
	public void exitAddSub(AddSubContext ctx) {
		// TODO Auto-generated method stub
		super.exitAddSub(ctx);
		// TODO observar casos Float e INT e os procedimentos a fazer
		AnnotatedTreeNode left =  getValue(ctx.expr(0));
		AnnotatedTreeNode right =  getValue(ctx.expr(1));
		AnnotatedTreeNode ctxVal = new AnnotatedTreeNode();
		
		if (left.getType() == DataType.FLOAT || right.getType() == DataType.FLOAT)
			ctxVal.setType(DataType.FLOAT);			
		else
			ctxVal.setType(DataType.INT);
		
		if (ctx.ADD() != null) {
			if (ctxVal.getType() == DataType.FLOAT) {
				ctxVal.setValue((float)left.getValue() + (float)right.getValue());
			} else {
				ctxVal.setValue((int)left.getValue() + (int)right.getValue());
			}			
		}else{
			if (ctxVal.getType() == DataType.FLOAT) {
				ctxVal.setValue((float)left.getValue() - (float)right.getValue());
			} else {
				ctxVal.setValue((int)left.getValue() - (int)right.getValue());
			}
		}
		this.setValue(ctx, ctxVal);
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
}
