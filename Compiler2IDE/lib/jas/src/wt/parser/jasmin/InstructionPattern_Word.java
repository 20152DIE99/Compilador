package wt.parser.jasmin;

import de.fub.bytecode.generic.*;
import de.fub.bytecode.Constants;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Bill
 * Date: 2004-2-17
 * Time: 12:48:13
 * To change this template use Options | File Templates.
 */
// used for instructions that take a word as a parameter
// branches, newarray, invokemethod
public class InstructionPattern_Word {
    
    public static InstructionHandle process(MethodGen mg, Token opcode, Token t_word, ArrayList branchInstructions)
        throws ParseException
    {
        InstructionFactory factory = JasminParser.factory;
        short oprCode = -1;
        if((oprCode = ScannerUtils.getOprCode(opcode.image)) == Constants.UNDEFINED){
            throw new ParseException("Not an instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        } 
        InsnInfo insn = InsnInfo.get(opcode.image);
        InstructionList il = mg.getInstructionList();
        if (insn.args.equals("method")) {
            return il.append(createInstruction_method(factory, oprCode, t_word.image));
        } else if (insn.args.equals("constant")) {
            return il.append(createInstruction_constant(factory, oprCode, t_word.image));
        } else if (insn.args.equals("atype")) {
            return il.append((Instruction)createInstruction_atype(factory, t_word.image));
        } else if (insn.args.equals("label")) {
            return il.append(createInstruction_label(oprCode, t_word.image, branchInstructions));
        } else if (insn.args.equals("class")) {
            if(oprCode == Constants.ANEWARRAY || oprCode == Constants.NEW){
                return il.append((Instruction)createAllocationInstruction_class(factory, oprCode, t_word.image));
            }
            else {
                return il.append(createInstruction_class(factory, oprCode, t_word.image));
            }
        } else {
            throw new ParseException("Bad arguments for instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        }
    }
    
    //method
    private static Instruction createInstruction_method(InstructionFactory factory, short oprCode, String operand)
    {
        String split[] = ScannerUtils.splitClassMethodSignature(operand);
        return factory.createInvoke(
                ScannerUtils.convertChars(split[0], "/", '.'),
                split[1],
                Type.getReturnType(split[2]),
                Type.getArgumentTypes(split[2]),
                oprCode
        );
    }

    //constant
    private static Instruction createInstruction_constant(InstructionFactory factory, short oprCode, String operand)
    {
        int index = 0;
        ConstantPoolGen cp = factory.getConstantPool();
        index = cp.addClass(ScannerUtils.convertChars(operand, "/", '.'));
        if(oprCode == Constants.LDC){
            return new LDC(index);
        } else {//ldc_w
            return new LDC_W(index);
        }
    }
    
    //atype, handle basic array type
    private static AllocationInstruction createInstruction_atype(InstructionFactory factory, String operand) 
            throws ParseException 
    {
        Type atype = null;
        if (operand.equals("boolean")) {
            atype = Type.BOOLEAN;
        } else if (operand.equals("char")) {
            atype = Type.CHAR;
        } else if (operand.equals("float")) {
            atype = Type.FLOAT;
        } else if (operand.equals("double")) {
            atype = Type.DOUBLE;
        } else if (operand.equals("byte")) {
            atype = Type.BYTE;
        } else if (operand.equals("short")) {
            atype = Type.SHORT;
        } else if (operand.equals("int")) {
            atype = Type.INT;
        } else if (operand.equals("long")) {
            atype = Type.LONG;
        } else {
            throw new ParseException("Bad array type: " + operand);
        }
        return factory.createNewArray(atype, (short)1);
    }

    //label, branch instructions
    private static BranchInstruction createInstruction_label(short oprCode, String operand, ArrayList branchInstructions)
    {
        TempBranchInstruction tempBranchInstruction = new TempBranchInstruction();
        tempBranchInstruction.instruction = InstructionFactory.createBranchInstruction(oprCode, null);
        tempBranchInstruction.target = operand;
        branchInstructions.add(tempBranchInstruction);
        return tempBranchInstruction.instruction;
    }

    //class: anewarray, new
    private static AllocationInstruction createAllocationInstruction_class(InstructionFactory factory, short oprCode, String operand)
    {
        if(oprCode == Constants.ANEWARRAY){
            return factory.createNewArray(new ObjectType(ScannerUtils.convertChars(operand, "/", '.')), (short)1);
        } else if(oprCode == Constants.NEW){
            return factory.createNew(new ObjectType(ScannerUtils.convertChars(operand, "/", '.')));
        }
        return null;
    }

    //class: checkcast, instanceof
    private static Instruction createInstruction_class(InstructionFactory factory, short oprCode, String operand)
    {
        if(oprCode == Constants.CHECKCAST){
            return factory.createCheckCast(new ObjectType(ScannerUtils.convertChars(operand, "/", '.')));
        }else if(oprCode == Constants.INSTANCEOF){
            int index = factory.getConstantPool().addClass(new ObjectType(ScannerUtils.convertChars(operand, "/", '.')));
            return new INSTANCEOF(index);
        }
        return null;
    }
}
