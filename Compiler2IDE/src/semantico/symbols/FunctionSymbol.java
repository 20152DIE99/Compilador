package semantico.symbols;

import java.util.LinkedHashMap;
import java.util.Map;

import semantico.scopes.Scope;

public class FunctionSymbol extends Symbol implements Scope {
	Map<String, Symbol> arguments = new LinkedHashMap<String, Symbol>();
	Scope enclosingScope;
	
	public FunctionSymbol(String name, grammar.Type type, Scope enclosingScope ) {
		super(name,type);
		this.enclosingScope = enclosingScope;
	} 

	@Override
	public String getScopeName() {
		return this.getName();
	}

	@Override
	public Scope getEnclosingScope() {
		return this.enclosingScope;
	}

	@Override
	public void define(Symbol newSymbol) {
		arguments.put(newSymbol.getName(), newSymbol);
	}

	@Override
	public Symbol resolve(String name) {
		Symbol s = arguments.get(name);
		if ( s != null ) return s;
		if ( this.getEnclosingScope() != null ){
			return getEnclosingScope().resolve(name);
		}
		return null;
	}
	
	public String toString(){
		return "function"+super.toString()+":"+arguments.values();
	}

	@Override
	public Symbol resolveCurrentScope(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
