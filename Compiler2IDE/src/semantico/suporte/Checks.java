package semantico.suporte;

import java.util.EnumSet;

import grammar.Type;

public class Checks {
	public static EnumSet<Type> arithmetic = EnumSet.of(Type.FLOAT, Type.INT); 
	public static boolean isValidArithmetic(Type tipoTestado){
		return arithmetic.contains(tipoTestado);
	}
}
