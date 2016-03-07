package wt.parser.jasmin;

import de.fub.bytecode.generic.InstructionHandle;
import de.fub.bytecode.generic.MethodGen;
import de.fub.bytecode.generic.InstructionFactory;
import de.fub.bytecode.generic.InstructionList;
import de.fub.bytecode.Constants;

/**
 * Created by IntelliJ IDEA.
 * User: Bill
 * Date: 2004-2-17
 * Time: 12:48:32
 * To change this template use Options | File Templates.
 */
// used for instructions that take no arguments
public class InstructionPattern_NoParam {
    
    public static InstructionHandle process(MethodGen mg, Token opcode)
        throws ParseException
    {
        short oprCode = -1;
        if((oprCode = ScannerUtils.getOprCode(opcode.image)) == Constants.UNDEFINED){
            throw new ParseException("Not an instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        } 
        InsnInfo insn = InsnInfo.get(opcode.image);
        InstructionList il = mg.getInstructionList();
        if (insn.args.equals("")) {
            return il.append(JvmConstants.INSTRUCTIONS[oprCode]);
        } else if (insn.name.equals("wide")) {
            // don't do anything for this one...
        } else {
            throw new ParseException("Bad arguments for instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        }
        return null;
    }    
    
}
