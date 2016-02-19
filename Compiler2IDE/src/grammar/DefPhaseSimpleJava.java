package grammar;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import compilerErrors.SemanticError;
import compileride.CompilerIDE;
import grammar.simpleJavaParser.DeclFuncoesContext;
import grammar.simpleJavaParser.DeclVarsContext;
import grammar.simpleJavaParser.FloatContext;
import grammar.simpleJavaParser.IdContext;
import grammar.simpleJavaParser.IntContext;
import grammar.simpleJavaParser.ParamsContext;
import grammar.simpleJavaParser.ProgContext;
import grammar.simpleJavaParser.TipoContext;
import semantico.scopes.GlobalScope;
import semantico.scopes.Scope;
import semantico.symbols.FunctionSymbol;
import semantico.symbols.Symbol;
import semantico.symbols.VariableSymbol;

public class DefPhaseSimpleJava extends simpleJavaBaseListener {
	ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
	ParseTreeProperty<Type> typeChecker = new ParseTreeProperty<Type>(); 
	GlobalScope globals;
	Scope currentScope;
	CompilerIDE ide;
	simpleJavaParser parser;
	
	public DefPhaseSimpleJava(CompilerIDE ide, simpleJavaParser parser){
		this.ide = ide;
		this.parser = parser;
	}

    public static Type getType(int tokenType) {
        switch ( tokenType ) {
            case simpleJavaParser.TBOOL :  	return Type.BOOLEAN;
            case simpleJavaParser.TINT :   	return Type.INT;
            case simpleJavaParser.TFLOAT : 	return Type.FLOAT;
            case simpleJavaParser.TSTR : 	return Type.STRING;
        }
        return Type.INVALID;
    }
    
    public void addTypeToChecker(ParserRuleContext ctx, Type type){
    	this.typeChecker.put(ctx, type);
    }	
    
    public Type getTypeFromChecker(ParserRuleContext ctx){
    	Type type = this.typeChecker.get(ctx);
    	return (type == null )? Type.INVALID : type; 
    }
    
	@Override
	public void enterProg(ProgContext ctx) {
		this.globals = new GlobalScope(null);
		this.currentScope = globals;
	}

	@Override
	public void exitProg(ProgContext ctx) {
		System.out.println(globals);
	}
	
	//TODO
	public String mangleName(ParamsContext paramCtx, DeclFuncoesContext funCtx){
		String funName = funCtx.ID().getText()+"_";
		int tokenType = funCtx.tipo().start.getType();
		funName = funName + getType(tokenType);	
		Type tipoParam;
		for ( TipoContext tipo : paramCtx.tipo()) {
			tipoParam = getType(tipo.start.getType());
			if(tipoParam != Type.INVALID) 
				funName = funName + "$" + tipoParam;			
		}
		return funName;
	}

	@Override
	public void enterDeclFuncoes(DeclFuncoesContext ctx) {
		String name = ctx.ID().getText();
		int typeTokenType = ctx.tipo().start.getType();
		Type tipo = getType(typeTokenType);
		
		//TODO testar o tipo de token, typeErr
		//TODO mangle no name
		FunctionSymbol function = new FunctionSymbol(name, tipo, currentScope);
		currentScope.define(function);
		this.saveScope(ctx, function);
		currentScope = function;
	}

	@Override
	public void exitDeclFuncoes(DeclFuncoesContext ctx) {
		String funName = mangleName(ctx.params(), ctx);
		String oldFunName = ctx.ID().getText();
//		currentScope.resolve(ctx.ID().getText()).setName(funName);
		globals.updateSymbolTable(funName, oldFunName);
		System.out.println(currentScope);
		currentScope = currentScope.getEnclosingScope();
	}
	
	@Override
	public void enterParams(ParamsContext ctx) {
		// TODO Auto-generated method stub
		super.enterParams(ctx);
	}

	@Override
	public void exitParams(ParamsContext ctx) {
		super.exitParams(ctx);
		Type type;
		for (int i = 0; i < ctx.tipo().size(); i++) {
			type = getTypeFromChecker(ctx.tipo(i));			
			if (type == Type.INVALID) {
//				ide.printError(SemanticError.invalidType(ctx.tipo(i).start.getText(),
//						ctx.start.getLine()));			
			}else{
				//Teste se o simbolo ainda não foi declarado
				String varName = ctx.ID(i).getText();
				if(varName.equals("<missing ID>")){
					System.err.println("Erro sintatico: nome do parâmetro não definido"
							+ " linha - " + ctx.tipo(i).stop.getLine() + ":"
							+ ctx.tipo(i).stop.getCharPositionInLine()+ "\n");
				}else{
					if (currentScope.resolveCurrentScope(varName) != null){
						ide.printError(SemanticError.varRedeclaration(
								varName, ctx.stop.getLine()));
						//Fim Teste se o simbolo ainda não foi declarado
					}else{
						VariableSymbol var = new VariableSymbol(varName, type);				
						currentScope.define(var);
					}					
				}
				//remoçao do contexto do tipo das anotações da árvore
				this.typeChecker.removeFrom(ctx.tipo(i));
			}
		}
	}
	
	void saveScope(ParserRuleContext ctx, Scope s) { 
		scopes.put(ctx, s); 
	}

	@Override
	public void enterInt(IntContext ctx) {
		super.enterInt(ctx);
	}

	@Override
	public void exitInt(IntContext ctx) {
		this.addTypeToChecker(ctx, Type.INT);
	}

	@Override
	public void enterFloat(FloatContext ctx) {
		super.enterFloat(ctx);
	}

	@Override
	public void exitFloat(FloatContext ctx) {
		this.addTypeToChecker(ctx, Type.FLOAT);
	}

	@Override
	public void enterId(IdContext ctx) {
		super.enterId(ctx);
	}

	@Override
	public void exitId(IdContext ctx) {
		String varName = ctx.ID().getText();
		Symbol var = currentScope.resolve(varName);
		if (var == null) {
			ide.printError(SemanticError.varUnknown(varName, ctx.start.getLine()));
			//TODO erro SymbolFunction			
		}else{
			this.addTypeToChecker(ctx, var.getType());		
		}		
	}

	@Override
	public void enterDeclVars(DeclVarsContext ctx) {
		super.enterDeclVars(ctx);
	}

	@Override
	public void exitDeclVars(DeclVarsContext ctx) {
		Type tipo = getTypeFromChecker(ctx.tipo());
		if (tipo == Type.INVALID) {
			ide.printError(SemanticError.invalidType(ctx.tipo().start.getText(),
				ctx.start.getLine()));
		}else{
			for (TerminalNode id : ctx.ID()) {
				//Teste se o simbolo ainda não foi declarado
				String varName = id.getText();
				if(varName.equals("<missing ID>")) continue;
				if (currentScope.resolveCurrentScope(varName) != null){
					ide.printError(SemanticError.varRedeclaration(
							varName, ctx.start.getLine()));
				//Fim Teste se o simbolo ainda não foi declarado
				}else{
					VariableSymbol var = new VariableSymbol(varName, tipo);				
					currentScope.define(var);
				}
			}
		}
		//remoçao do contexto do tipo das anotações da árvore
		this.typeChecker.removeFrom(ctx.tipo());
	}

	@Override
	public void enterTipo(TipoContext ctx) {
		super.enterTipo(ctx);
	}

	@Override
	public void exitTipo(TipoContext ctx) {
		int typeTokenType = ctx.start.getType();
		Type tipo = getType(typeTokenType);
		this.addTypeToChecker(ctx, tipo);
	}
	
	
	
	
	
	
	
	
	
	
	
}
