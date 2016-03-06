package semantico.symbols;

public class VariableSymbol extends ValuedSymbol {
	
    public VariableSymbol(String name, grammar.Type type) {
    	super(name, type); 
    }
    
    public Object getValue() {
		return value;
	}
    
    public void initialize(Object value){
    	try {
			this.value = value;
			this.isInialized = true;
		} catch (Exception e) {
			throw new RuntimeException();
		}
    }
    
    public void initialize(){
			this.isInialized = true;
    }
}