package wt.parser.jasmin;

import de.fub.bytecode.generic.InstructionHandle;
import de.fub.bytecode.generic.MethodGen;
import de.fub.bytecode.generic.LDC2_W;
import de.fub.bytecode.generic.LDC_W;
import de.fub.bytecode.generic.LDC;
import de.fub.bytecode.generic.InstructionList;
import de.fub.bytecode.generic.ConstantPoolGen;
import de.fub.bytecode.generic.Instruction;
import de.fub.bytecode.generic.ALOAD;
import de.fub.bytecode.generic.ASTORE;
import de.fub.bytecode.generic.BIPUSH;
import de.fub.bytecode.generic.DLOAD;
import de.fub.bytecode.generic.DSTORE;
import de.fub.bytecode.generic.FLOAD;
import de.fub.bytecode.generic.FSTORE;
import de.fub.bytecode.generic.ILOAD;
import de.fub.bytecode.generic.ISTORE;
import de.fub.bytecode.generic.LLOAD;
import de.fub.bytecode.generic.LSTORE;
import de.fub.bytecode.generic.RET;
import de.fub.bytecode.generic.SIPUSH;
import de.fub.bytecode.Constants;

/**
 * Created by IntelliJ IDEA.
 * User: Bill
 * Date: 2004-2-17
 * Time: 11:32:04
 * To change this template use Options | File Templates.
 */
// used for instructions that take an integer parameter
//ldc, ldc_w, ldc2_w
//aload, astore, bipush, dload, dstore, fload, fstore, iload, istore
//lload, lstore, ret, ret_w, sipush
public class InstructionPattern_Int {
    
    public static InstructionHandle process(MethodGen mg, Token opcode, Token t_int)
        throws ParseException
    {
        short oprCode = -1;
        ConstantPoolGen cp = JasminParser.cp;
        if((oprCode = ScannerUtils.getOprCode(opcode.image)) == Constants.UNDEFINED){
            throw new ParseException("Not an instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        } 
        InsnInfo insn = InsnInfo.get(opcode.image);
        InstructionList il = mg.getInstructionList();
        if (insn.args.equals("i")) {
            return il.append(createInstruction_i(oprCode, ScannerUtils.convertInt(t_int.image)));
        } 
        else if (insn.args.equals("constant")) {//ldc, ldc_w
            int index = cp.addInteger(ScannerUtils.convertInt(t_int.image));
            if(oprCode == Constants.LDC){
                return il.append(new LDC(index));
            }
            if(oprCode == Constants.LDC_W){
                return il.append(new LDC_W(index));
            }
        } 
        else if (insn.args.equals("bigconstant")) {// ldc2_w
            int index = cp.addLong(ScannerUtils.convertLong(t_int.image));
            return il.append(new LDC2_W(index));
        } 
        else {
            throw new ParseException("Bad arguments for instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        }
        return null;
    }
    
    private static Instruction createInstruction_i(short oprCode, int v)
    {
        switch(oprCode){
            case Constants.ALOAD:
                return new ALOAD(v);
            case Constants.ASTORE:
                return new ASTORE(v);
            case Constants.BIPUSH:
                return new BIPUSH((byte)v);
            case Constants.DLOAD:
                return new DLOAD(v);
            case Constants.DSTORE:
                return new DSTORE(v);
            case Constants.FLOAD:
                return new FLOAD(v);
            case Constants.FSTORE:
                return new FSTORE(v);
            case Constants.ILOAD:
                return new ILOAD(v);
            case Constants.ISTORE:
                return new ISTORE(v);
            case Constants.LLOAD:
                return new LLOAD(v);
            case Constants.LSTORE:
                return new LSTORE(v);
            case Constants.RET:
                return new RET(v);
            case Constants.SIPUSH:
                return new SIPUSH((short)v);
        }
        return null;
    }
    
}
