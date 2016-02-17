package semantico.scopes;

import java.util.LinkedHashMap;
import java.util.Map;

import semantico.symbols.Symbol;

public class BaseScope implements Scope {
	//Atributes
	Scope enclosingScope;
    Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();    
    
    //Constructors
    public BaseScope(Scope enclosingScope) {
    	this.enclosingScope = enclosingScope;  
    }
    
    //Metodos da interface
	@Override
	public String getScopeName() {
		return null;
	}

	@Override
	public Scope getEnclosingScope() {
		return this.getEnclosingScope();
	}

	@Override
	public void define(Symbol newSymbol) {
		this.symbols.put(newSymbol.getName(), newSymbol);
	}

	@Override
	public Symbol resolve(String name) {
        Symbol s = symbols.get(name);
        if ( s!=null ) return s;
        if ( enclosingScope != null ) return enclosingScope.resolve(name);
        return null;
	}
	
	public Symbol resolveCurrentScope(String name){
		Symbol s = this.symbols.get(name);
		return s;
	}
	
	
    public String toString() {
    	return getScopeName()+":"+symbols.keySet().toString(); 
    }
}
