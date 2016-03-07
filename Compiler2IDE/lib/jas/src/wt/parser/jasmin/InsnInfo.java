// InsnInfo is used to hold info about the opcode and parameters needed
// by an instruction. Instances of InsnInfo are created by a static
// initializer and stored in a table.
//

package wt.parser.jasmin;

import wt.parser.jasmin.JvmConstants;
import java.util.Hashtable;

class InsnInfo {
    // maps instruction name -> InsnInfo object
    static Hashtable infoTable;

    // information maintained about each instruction:
    public String name;     // instruction name
    public int opcode;      // its opcode
    public String args;     // the argument code

    public static InsnInfo get(String name) {
	return (InsnInfo)infoTable.get(name);	
    }

    public static boolean contains(String name) {
	return infoTable.get(name) != null;	
    }

    //
    // used to initialize the infoTable table (see below)
    //
    static private void addInfo(String name, int opcode, String args) {
	InsnInfo info = new InsnInfo();
	info.name = name;
	info.opcode = opcode;
	info.args = args;
        infoTable.put(name, info);
    }

    //
    // initializes the infoTable table
    //
    static {
        infoTable = new Hashtable();

        addInfo("aaload", JvmConstants.opc_aaload, "");
        addInfo("aastore", JvmConstants.opc_aastore, "");
        addInfo("aconst_null", JvmConstants.opc_aconst_null, "");
        addInfo("aload", JvmConstants.opc_aload, "i");
        addInfo("aload_0", JvmConstants.opc_aload_0, "");
        addInfo("aload_1", JvmConstants.opc_aload_1, "");
        addInfo("aload_2", JvmConstants.opc_aload_2, "");
        addInfo("aload_3", JvmConstants.opc_aload_3, "");
        addInfo("anewarray", JvmConstants.opc_anewarray, "class");
        addInfo("areturn", JvmConstants.opc_areturn, "");
        addInfo("arraylength", JvmConstants.opc_arraylength, "");
        addInfo("astore", JvmConstants.opc_astore, "i");
        addInfo("astore_0", JvmConstants.opc_astore_0, "");
        addInfo("astore_1", JvmConstants.opc_astore_1, "");
        addInfo("astore_2", JvmConstants.opc_astore_2, "");
        addInfo("astore_3", JvmConstants.opc_astore_3, "");
        addInfo("athrow", JvmConstants.opc_athrow, "");
        addInfo("baload", JvmConstants.opc_baload, "");
        addInfo("bastore", JvmConstants.opc_bastore, "");
        addInfo("bipush", JvmConstants.opc_bipush, "i");
        addInfo("breakpoint", JvmConstants.opc_breakpoint, "");
        addInfo("caload", JvmConstants.opc_caload, "");
        addInfo("castore", JvmConstants.opc_castore, "");
        addInfo("checkcast", JvmConstants.opc_checkcast, "class");
        addInfo("d2f", JvmConstants.opc_d2f, "");
        addInfo("d2i", JvmConstants.opc_d2i, "");
        addInfo("d2l", JvmConstants.opc_d2l, "");
        addInfo("dadd", JvmConstants.opc_dadd, "");
        addInfo("daload", JvmConstants.opc_daload, "");
        addInfo("dastore", JvmConstants.opc_dastore, "");
        addInfo("dcmpg", JvmConstants.opc_dcmpg, "");
        addInfo("dcmpl", JvmConstants.opc_dcmpl, "");
        addInfo("dconst_0", JvmConstants.opc_dconst_0, "");
        addInfo("dconst_1", JvmConstants.opc_dconst_1, "");
        addInfo("ddiv", JvmConstants.opc_ddiv, "");
        addInfo("dload", JvmConstants.opc_dload, "i");
        addInfo("dload_0", JvmConstants.opc_dload_0, "");
        addInfo("dload_1", JvmConstants.opc_dload_1, "");
        addInfo("dload_2", JvmConstants.opc_dload_2, "");
        addInfo("dload_3", JvmConstants.opc_dload_3, "");
        addInfo("dmul", JvmConstants.opc_dmul, "");
        addInfo("dneg", JvmConstants.opc_dneg, "");
        addInfo("drem", JvmConstants.opc_drem, "");
        addInfo("dreturn", JvmConstants.opc_dreturn, "");
        addInfo("dstore", JvmConstants.opc_dstore, "i");
        addInfo("dstore_0", JvmConstants.opc_dstore_0, "");
        addInfo("dstore_1", JvmConstants.opc_dstore_1, "");
        addInfo("dstore_2", JvmConstants.opc_dstore_2, "");
        addInfo("dstore_3", JvmConstants.opc_dstore_3, "");
        addInfo("dsub", JvmConstants.opc_dsub, "");
        addInfo("dup", JvmConstants.opc_dup, "");
        addInfo("dup2", JvmConstants.opc_dup2, "");
        addInfo("dup2_x1", JvmConstants.opc_dup2_x1, "");
        addInfo("dup2_x2", JvmConstants.opc_dup2_x2, "");
        addInfo("dup_x1", JvmConstants.opc_dup_x1, "");
        addInfo("dup_x2", JvmConstants.opc_dup_x2, "");
        addInfo("f2d", JvmConstants.opc_f2d, "");
        addInfo("f2i", JvmConstants.opc_f2i, "");
        addInfo("f2l", JvmConstants.opc_f2l, "");
        addInfo("fadd", JvmConstants.opc_fadd, "");
        addInfo("faload", JvmConstants.opc_faload, "");
        addInfo("fastore", JvmConstants.opc_fastore, "");
        addInfo("fcmpg", JvmConstants.opc_fcmpg, "");
        addInfo("fcmpl", JvmConstants.opc_fcmpl, "");
        addInfo("fconst_0", JvmConstants.opc_fconst_0, "");
        addInfo("fconst_1", JvmConstants.opc_fconst_1, "");
        addInfo("fconst_2", JvmConstants.opc_fconst_2, "");
        addInfo("fdiv", JvmConstants.opc_fdiv, "");
        addInfo("fload", JvmConstants.opc_fload, "i");
        addInfo("fload_0", JvmConstants.opc_fload_0, "");
        addInfo("fload_1", JvmConstants.opc_fload_1, "");
        addInfo("fload_2", JvmConstants.opc_fload_2, "");
        addInfo("fload_3", JvmConstants.opc_fload_3, "");
        addInfo("fmul", JvmConstants.opc_fmul, "");
        addInfo("fneg", JvmConstants.opc_fneg, "");
        addInfo("frem", JvmConstants.opc_frem, "");
        addInfo("freturn", JvmConstants.opc_freturn, "");
        addInfo("fstore", JvmConstants.opc_fstore, "i");
        addInfo("fstore_0", JvmConstants.opc_fstore_0, "");
        addInfo("fstore_1", JvmConstants.opc_fstore_1, "");
        addInfo("fstore_2", JvmConstants.opc_fstore_2, "");
        addInfo("fstore_3", JvmConstants.opc_fstore_3, "");
        addInfo("fsub", JvmConstants.opc_fsub, "");
        addInfo("getfield", JvmConstants.opc_getfield, "field");
        addInfo("getstatic", JvmConstants.opc_getstatic, "field");
        addInfo("goto", JvmConstants.opc_goto, "label");
        addInfo("goto_w", JvmConstants.opc_goto_w, "label");
        addInfo("i2d", JvmConstants.opc_i2d, "");
        addInfo("i2f", JvmConstants.opc_i2f, "");
        addInfo("i2l", JvmConstants.opc_i2l, "");
        addInfo("iadd", JvmConstants.opc_iadd, "");
        addInfo("iaload", JvmConstants.opc_iaload, "");
        addInfo("iand", JvmConstants.opc_iand, "");
        addInfo("iastore", JvmConstants.opc_iastore, "");
        addInfo("iconst_0", JvmConstants.opc_iconst_0, "");
        addInfo("iconst_1", JvmConstants.opc_iconst_1, "");
        addInfo("iconst_2", JvmConstants.opc_iconst_2, "");
        addInfo("iconst_3", JvmConstants.opc_iconst_3, "");
        addInfo("iconst_4", JvmConstants.opc_iconst_4, "");
        addInfo("iconst_5", JvmConstants.opc_iconst_5, "");
        addInfo("iconst_m1", JvmConstants.opc_iconst_m1, "");
        addInfo("idiv", JvmConstants.opc_idiv, "");
        addInfo("if_acmpeq", JvmConstants.opc_if_acmpeq, "label");
        addInfo("if_acmpne", JvmConstants.opc_if_acmpne, "label");
        addInfo("if_icmpeq", JvmConstants.opc_if_icmpeq, "label");
        addInfo("if_icmpge", JvmConstants.opc_if_icmpge, "label");
        addInfo("if_icmpgt", JvmConstants.opc_if_icmpgt, "label");
        addInfo("if_icmple", JvmConstants.opc_if_icmple, "label");
        addInfo("if_icmplt", JvmConstants.opc_if_icmplt, "label");
        addInfo("if_icmpne", JvmConstants.opc_if_icmpne, "label");
        addInfo("ifeq", JvmConstants.opc_ifeq, "label");
        addInfo("ifge", JvmConstants.opc_ifge, "label");
        addInfo("ifgt", JvmConstants.opc_ifgt, "label");
        addInfo("ifle", JvmConstants.opc_ifle, "label");
        addInfo("iflt", JvmConstants.opc_iflt, "label");
        addInfo("ifne", JvmConstants.opc_ifne, "label");
        addInfo("ifnonnull", JvmConstants.opc_ifnonnull, "label");
        addInfo("ifnull", JvmConstants.opc_ifnull, "label");
        addInfo("iinc", JvmConstants.opc_iinc, "ii");
        addInfo("iload", JvmConstants.opc_iload, "i");
        addInfo("iload_0", JvmConstants.opc_iload_0, "");
        addInfo("iload_1", JvmConstants.opc_iload_1, "");
        addInfo("iload_2", JvmConstants.opc_iload_2, "");
        addInfo("iload_3", JvmConstants.opc_iload_3, "");
        addInfo("imul", JvmConstants.opc_imul, "");
        addInfo("ineg", JvmConstants.opc_ineg, "");
        addInfo("instanceof", JvmConstants.opc_instanceof, "class");
        addInfo("int2byte", JvmConstants.opc_int2byte, "");
        addInfo("int2char", JvmConstants.opc_int2char, "");
        addInfo("int2short", JvmConstants.opc_int2short, "");
        // added this synonym
        addInfo("i2b", JvmConstants.opc_int2byte, "");
        // added this synonym
        addInfo("i2c", JvmConstants.opc_int2char, "");
        // added this synonym
        addInfo("i2s", JvmConstants.opc_int2short, "");
        addInfo("invokeinterface", JvmConstants.opc_invokeinterface, "interface");
        addInfo("invokenonvirtual", JvmConstants.opc_invokenonvirtual, "method");
        // added this synonym
        addInfo("invokespecial", JvmConstants.opc_invokenonvirtual, "method");
        addInfo("invokestatic", JvmConstants.opc_invokestatic, "method");
        addInfo("invokevirtual", JvmConstants.opc_invokevirtual, "method");
        addInfo("ior", JvmConstants.opc_ior, "");
        addInfo("irem", JvmConstants.opc_irem, "");
        addInfo("ireturn", JvmConstants.opc_ireturn, "");
        addInfo("ishl", JvmConstants.opc_ishl, "");
        addInfo("ishr", JvmConstants.opc_ishr, "");
        addInfo("istore", JvmConstants.opc_istore, "i");
        addInfo("istore_0", JvmConstants.opc_istore_0, "");
        addInfo("istore_1", JvmConstants.opc_istore_1, "");
        addInfo("istore_2", JvmConstants.opc_istore_2, "");
        addInfo("istore_3", JvmConstants.opc_istore_3, "");
        addInfo("isub", JvmConstants.opc_isub, "");
        addInfo("iushr", JvmConstants.opc_iushr, "");
        addInfo("ixor", JvmConstants.opc_ixor, "");
        addInfo("jsr", JvmConstants.opc_jsr, "label");
        addInfo("jsr_w", JvmConstants.opc_jsr, "label");  // synonym for "jsr"
        addInfo("l2d", JvmConstants.opc_l2d, "");
        addInfo("l2f", JvmConstants.opc_l2f, "");
        addInfo("l2i", JvmConstants.opc_l2i, "");
        addInfo("ladd", JvmConstants.opc_ladd, "");
        addInfo("laload", JvmConstants.opc_laload, "");
        addInfo("land", JvmConstants.opc_land, "");
        addInfo("lastore", JvmConstants.opc_lastore, "");
        addInfo("lcmp", JvmConstants.opc_lcmp, "");
        addInfo("lconst_0", JvmConstants.opc_lconst_0, "");
        addInfo("lconst_1", JvmConstants.opc_lconst_1, "");
        addInfo("ldc", JvmConstants.opc_ldc, "constant");
        addInfo("ldc_w", JvmConstants.opc_ldc_w, "constant");
        addInfo("ldc2_w", JvmConstants.opc_ldc2_w, "bigconstant");
        addInfo("ldiv", JvmConstants.opc_ldiv, "");
        addInfo("lload", JvmConstants.opc_lload, "i");
        addInfo("lload_0", JvmConstants.opc_lload_0, "");
        addInfo("lload_1", JvmConstants.opc_lload_1, "");
        addInfo("lload_2", JvmConstants.opc_lload_2, "");
        addInfo("lload_3", JvmConstants.opc_lload_3, "");
        addInfo("lmul", JvmConstants.opc_lmul, "");
        addInfo("lneg", JvmConstants.opc_lneg, "");
        addInfo("lookupswitch", JvmConstants.opc_lookupswitch, "switch");
        addInfo("lor", JvmConstants.opc_lor, "");
        addInfo("lrem", JvmConstants.opc_lrem, "");
        addInfo("lreturn", JvmConstants.opc_lreturn, "");
        addInfo("lshl", JvmConstants.opc_lshl, "");
        addInfo("lshr", JvmConstants.opc_lshr, "");
        addInfo("lstore", JvmConstants.opc_lstore, "i");
        addInfo("lstore_0", JvmConstants.opc_lstore_0, "");
        addInfo("lstore_1", JvmConstants.opc_lstore_1, "");
        addInfo("lstore_2", JvmConstants.opc_lstore_2, "");
        addInfo("lstore_3", JvmConstants.opc_lstore_3, "");
        addInfo("lsub", JvmConstants.opc_lsub, "");
        addInfo("lushr", JvmConstants.opc_lushr, "");
        addInfo("lxor", JvmConstants.opc_lxor, "");
        addInfo("monitorenter", JvmConstants.opc_monitorenter, "");
        addInfo("monitorexit", JvmConstants.opc_monitorexit, "");
        addInfo("multianewarray", JvmConstants.opc_multianewarray, "marray");
        addInfo("new", JvmConstants.opc_new, "class");
        addInfo("newarray", JvmConstants.opc_newarray, "atype");
        addInfo("nop", JvmConstants.opc_nop, "");
        addInfo("pop", JvmConstants.opc_pop, "");
        addInfo("pop2", JvmConstants.opc_pop2, "");
        addInfo("putfield", JvmConstants.opc_putfield, "field");
        addInfo("putstatic", JvmConstants.opc_putstatic, "field");
        addInfo("ret", JvmConstants.opc_ret, "i");
        addInfo("ret_w", JvmConstants.opc_ret, "i"); // synonym for ret
        addInfo("return", JvmConstants.opc_return, "");
        addInfo("saload", JvmConstants.opc_saload, "");
        addInfo("sastore", JvmConstants.opc_sastore, "");
        addInfo("sipush", JvmConstants.opc_sipush, "i");
        addInfo("swap", JvmConstants.opc_swap, "");
        addInfo("tableswitch", JvmConstants.opc_tableswitch, "switch");

        // special case:
        addInfo("wide", JvmConstants.opc_wide, "ignore");
    }

};

/* --- Revision History ---------------------------------------------------
--- Jonathan Meyer, Feb 8 1997
    Added invokespecial as a synonym for invokenonvirtual
*/
