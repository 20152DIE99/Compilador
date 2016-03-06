package semantico.symbols;

import grammar.*;
import semantico.scopes.Scope;

public abstract class Symbol {
	public static Type Type;
	
	private String name;
	private Type type;
	private Scope scope;
	
	public Symbol(String name){
		this.name = name;
	}
	
	public Symbol(String name, Type type){
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Scope getScope() {
		return scope;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}
	
	public String toString(){
        if ( type!=grammar.Type.INVALID ) return '<'+getName()+":"+type+'>';
        return getName();
	}
}
