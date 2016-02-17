package semantico.scopes;

import semantico.symbols.Symbol;

public interface Scope {
	public abstract String getScopeName();
	public abstract Scope getEnclosingScope();
	public abstract void define (Symbol newSymbol);
	public abstract Symbol resolve(String name);
	public abstract Symbol resolveCurrentScope(String name);
}
