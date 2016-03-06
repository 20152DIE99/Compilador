package semantico.symbols;

public class ConstantSymbol extends ValuedSymbol {
	private final Object value; 
    public ConstantSymbol(String name, grammar.Type type, Object value) {
    	super(name, type); 
    	this.value = value;
    	this.isInialized = true;
    }
    
    public Object getValue(){
    	return this.value;
    }
}
