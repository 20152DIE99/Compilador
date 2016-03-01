package semantico.symbols;

public class ConstantSymbol extends Symbol {
	private final Object value;	
    public ConstantSymbol(String name, grammar.Type type, Object value) {
    	super(name, type); 
    	this.value = value;
    }
    
    public Object getValue(){
    	return this.value;
    }
}
