;; Produced by JasminVisitor (BCEL)
;; http://bcel.sourceforge.net/
;; Sun Mar 06 20:25:25 BRT 2016

.source TesteJasmin.java
.class public TesteJasmin
.super java/lang/Object


.method public <init>()V
.limit stack 1
.limit locals 1
.var 0 is this LTesteJasmin; from Label0 to Label1

Label0:
	aload_0
	invokespecial java/lang/Object/<init>()V
Label1:
	return

.end method

.method public teste()V
.limit stack 2
.limit locals 3
.var 0 is this LTesteJasmin; from Label0 to Label1

Label0:
	bipush 10
	istore_1
	bipush 20
	istore_2
	iload_1
	iload_2
	iadd
	istore_1
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload_1
	invokevirtual java/io/PrintStream/println(I)V
Label1:
	return

.end method

.method public static main([Ljava/lang/String;)V
.limit stack 2
.limit locals 1
.var 0 is arg0 [Ljava/lang/String; from Label0 to Label1

Label0:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "32"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
Label1:
	return

.end method
