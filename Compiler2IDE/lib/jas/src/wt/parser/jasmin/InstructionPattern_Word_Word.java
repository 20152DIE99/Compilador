package wt.parser.jasmin;

import de.fub.bytecode.generic.InstructionHandle;
import de.fub.bytecode.generic.MethodGen;
import de.fub.bytecode.generic.Type;
import de.fub.bytecode.generic.InstructionList;
import de.fub.bytecode.generic.InstructionFactory;
import de.fub.bytecode.Constants;

/**
 * Created by IntelliJ IDEA.
 * User: Bill
 * Date: 2004-2-17
 * Time: 11:09:47
 * To change this template use Options | File Templates.
 */
// used for instructions that take a field and a signature as parameters
// (e.g. getstatic, putstatic, getfield, putfield)
public class InstructionPattern_Word_Word {

    public static InstructionHandle process(MethodGen mg, Token opcode, Token t_word1, Token t_word2)
        throws ParseException
    {
        InstructionFactory factory = JasminParser.factory;
        short oprCode = -1;
        if((oprCode = ScannerUtils.getOprCode(opcode.image)) == Constants.UNDEFINED){
            throw new ParseException("Not an instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        } 
        InsnInfo insn = InsnInfo.get(opcode.image);
        InstructionList il = mg.getInstructionList();
        if (insn.args.equals("field")) {
            String split[] = ScannerUtils.splitClassField(t_word1.image);
            return il.append(factory.createFieldAccess(
                    ScannerUtils.convertChars(split[0], "/", '.'),
                    split[1],
                    Type.getType(t_word2.image),
                    oprCode
                ));
        } else {
            throw new ParseException("Bad arguments for instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        }
    }
}
