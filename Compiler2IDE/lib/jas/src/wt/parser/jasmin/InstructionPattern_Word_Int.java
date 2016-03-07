package wt.parser.jasmin;

import de.fub.bytecode.generic.InstructionHandle;
import de.fub.bytecode.generic.MethodGen;
import de.fub.bytecode.generic.Type;
import de.fub.bytecode.generic.Instruction;
import de.fub.bytecode.generic.InstructionList;
import de.fub.bytecode.generic.InstructionFactory;
import de.fub.bytecode.Constants;

/**
 * Created by IntelliJ IDEA.
 * User: Bill
 * Date: 2004-2-17
 * Time: 11:01:03
 * To change this template use Options | File Templates.
 */
// used for invokeinterface and multianewarray
public class InstructionPattern_Word_Int {
    
    public static InstructionHandle process(MethodGen mg, Token opcode, Token t_word, Token t_int)
        throws ParseException
    {
        InstructionFactory factory = JasminParser.factory;
        short oprCode = -1;
        if((oprCode = ScannerUtils.getOprCode(opcode.image)) == Constants.UNDEFINED){
            throw new ParseException("Not an instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        } 
        InsnInfo insn = InsnInfo.get(opcode.image);
        InstructionList il = mg.getInstructionList();
        if (insn.args.equals("interface")) {
            String split[] = ScannerUtils.splitClassMethodSignature(t_word.image);
            return il.append(factory.createInvoke(
                    ScannerUtils.convertChars(split[0], "/", '.'),
                    split[1],
                    Type.getReturnType(split[2]),
                    Type.getArgumentTypes(split[2]),
                    oprCode
                ));
        } else if (insn.args.equals("marray")) {
            return il.append((Instruction)factory.createNewArray(
                    Type.getType(t_word.image),
                    (short)ScannerUtils.convertInt(t_int.image)
                ));    
        } else {
            throw new ParseException("Bad arguments for instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        }
    }

}
