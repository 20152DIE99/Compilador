package grammar;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import grammar.simpleJavaParser.DeclFuncoesContext;
import grammar.simpleJavaParser.DeclVarsContext;
import grammar.simpleJavaParser.FloatContext;
import grammar.simpleJavaParser.IdContext;
import grammar.simpleJavaParser.IntContext;
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
   
	/* (non-Javadoc)
	 * @see grammar.simpleJavaBaseListener#enterProg(grammar.simpleJavaParser.ProgContext)
	 */
	@Override
	public void enterProg(ProgContext ctx) {
		this.globals = new GlobalScope(null);
		this.currentScope = globals;
	}

	@Override
	public void exitProg(ProgContext ctx) {
		System.out.println(globals);
	}

	@Override
	public void enterDeclFuncoes(DeclFuncoesContext ctx) {
		String name = ctx.ID().getText();
		int typeTokenType = ctx.tipo().start.getType();
		Type tipo = getType(typeTokenType);
		FunctionSymbol function = new FunctionSymbol(name, tipo, currentScope);
		currentScope.define(function);
		this.saveScope(ctx, function);
		currentScope = function;
	}

	@Override
	public void exitDeclFuncoes(DeclFuncoesContext ctx) {
		System.out.println(currentScope);
		currentScope = currentScope.getEnclosingScope();
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
			//TODO em003 - erro de variavel nao declarada
			System.err.println("Variavel nao encontrada na linha " + 
					ctx.start.getLine() + " : \' " + varName + " \'"); 
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
			//TODO #em001 Erro de tipo invalido
			System.err.println("Tipo invalido linha: " + ctx.start.getLine()); 
		}else{
			for (TerminalNode id : ctx.ID()) {
				//Teste se o simbolo ainda não foi declarado
				String varName = id.getText();
				if (currentScope.resolveCurrentScope(varName) != null){
					//TODO #em002 Erro de redeclaracao de var
					System.err.println( 
							String.format(
									"Redeclaracao da variavel '%s' na linha '%d'",
									varName, ctx.start.getLine()));
				//Fim Teste se o simbolo ainda não foi declarado
				}else{
					VariableSymbol var = new VariableSymbol(varName, tipo);				
					currentScope.define(var);
				}
			}
		}
		//TODO refatorar essa acao em um metodo
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
