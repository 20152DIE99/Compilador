package semantico.scopes;

import semantico.symbols.Symbol;

public class GlobalScope extends BaseScope {
    public GlobalScope(Scope enclosingScope) { super(enclosingScope); }
    public String getScopeName() { return "globals"; }
    
    public void updateSymbolTable (String newFunName, String funName){
    	Symbol fun = this.symbols.get(funName);
    	this.symbols.remove(funName);
    	this.symbols.put(newFunName, fun);
    }
    
    public void remove(String symbName){
    	this.symbols.remove(symbName);
    }
}
