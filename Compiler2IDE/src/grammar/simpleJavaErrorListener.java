package grammar;

import java.util.BitSet;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import compileride.CompilerIDE;

public class simpleJavaErrorListener extends BaseErrorListener{
	
	CompilerIDE ide;

	public simpleJavaErrorListener(CompilerIDE ide) {
		super();
		this.ide = ide;
	}

	@Override
	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
			BitSet ambigAlts, ATNConfigSet configs) {
		// TODO Auto-generated method stub
		super.reportAmbiguity(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs);
	}

	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
			BitSet conflictingAlts, ATNConfigSet configs) {
		// TODO Auto-generated method stub
		super.reportAttemptingFullContext(recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs);
	}

	@Override
	public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
			ATNConfigSet configs) {
		// TODO Auto-generated method stub
		super.reportContextSensitivity(recognizer, dfa, startIndex, stopIndex, prediction, configs);
	}
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol
			, int line, int charPositionInLine,	String msg, RecognitionException e) {
		List<String> stack = ((org.antlr.v4.runtime.Parser)recognizer).
				getRuleInvocationStack();
		Collections.reverse(stack);
//		ide.printError("SyntaxErr\npilha de regras: " + stack);
//		"SemanticErr.Linha-%d: Redeclaração da variável \"%s\"", line,varID;
		ide.printError("SintaticErr.Linha-" + line + ": " + translateMsg(msg)+ ".");
//		ide.printError("linha " + line + ":" + charPositionInLine + " na " + ": " + translateMsg(msg));		
	}
	
	private String translateMsg(String msg){
		if (msg.contains("missing ")) {
			msg = msg.replace("missing ", "faltando ");
			msg = msg.replace(" at ", " antes de ");
			msg = msg.replace("ID", "identificador");
			msg = msg.replace("{'int', 'float', 'string', 'boolean'}", 
					"expressão de tipo ('int', 'float', 'boolean' ou 'string')");
		}
		if (msg.contains("extraneous input ")){
			msg = msg.replace("extraneous input ", "input estranho ");
			msg = msg.replace(" expecting ", " esperando ");
		}
		if (msg.contains("rule ")){
			msg = msg.replace("rule ", "regra ");
		}
		if (msg.contains("mismatched input ")){
			msg = msg.replace("mismatched input " , "entrada incompatível ");
			msg = msg.replace(" expecting ", " esperando ");
		}
		if (msg.contains("no viable alternative at input ")){
			msg = msg.replace("no viable alternative at input ",
					"Erro de sintaxe para a entrada ");
		}
		if (msg.contains("unknown recognition error type: ")){
			msg = msg.replace("unknown recognition error type: ",
					"tipo de error de reconhecimento desconhecido");
		}		
		return msg;
	}	
}
