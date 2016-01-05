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
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		
		super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
		List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
		Collections.reverse(stack);
		ide.printError("rule stack: "+stack);
		ide.printError("line "+line+":"+charPositionInLine+" at "+
		offendingSymbol+": "+msg);
	}
}
