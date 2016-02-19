package compilerErrors;

import java.util.Collections;
import java.util.List;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class VerboseListener extends BaseErrorListener {

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol
			, int line, int charPositionInLine,	String msg, RecognitionException e) {
		List<String> stack = ((org.antlr.v4.runtime.Parser)recognizer).
				getRuleInvocationStack();
		Collections.reverse(stack);
		System.err.println("pilha de regras: " + stack);
		System.err.println("linha " + line + ":" + charPositionInLine + " na "
				+ offendingSymbol + ": " + translateMsg(msg));		
	}
	
	private String translateMsg(String msg){
		if (msg.contains("missing ")) {
			msg.replace("missing ", "faltando ");
			msg.replace(" at ", " na ");
		}
		if (msg.contains("extraneous input ")){
			msg.replace("extraneous input ", "input estranho ");
			msg.replace(" expecting ", " esperando ");
		}
		if (msg.contains("rule ")){
			msg.replace("rule ", "regra ");
		}
		if (msg.contains("mismatched input ")){
			msg.replace("mismatched input " , "entrada incompatível ");
			msg.replace(" expecting ", " esperando ");
		}
		if (msg.contains("no viable alternative at input ")){
			msg.replace("no viable alternative at input ",
					"sem alternativa viável para a entrada ");
		}
		if (msg.contains("unknown recognition error type: ")){
			msg.replace("unknown recognition error type: ",
					"tipo de error de reconhecimento desconhecido");
		}		
		return msg;
	}	
}
