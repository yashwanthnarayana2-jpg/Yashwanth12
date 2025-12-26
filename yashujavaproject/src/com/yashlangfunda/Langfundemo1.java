package com.yashlangfunda;
//1️ By default, integer literals (e.g., 10, 100) are of type int.
// 2️ By default, decimal (floating-point) literals (e.g., 10.5) are of type double.
//Primitive Data Types:
//byte → short → int → long → float → double
//char, boolean (special)


public class Langfundemo1 {
			    // ----------------- byte -----------------
			    byte b = 100;
			    // byte b1 = 128; // CE: Type mismatch: cannot convert from int to byte
			    byte b2 = (byte) 257; // Explicit type casting (int → byte)
			    // 257 % 256 = 1 → result = 1 (overflow wraps around)

			    // ----------------- short -----------------
			    short s = 12345;
			    // short s1 = 32768; // CE: Type mismatch: cannot convert from int to short
			    short s2 = (short) 32768; // Overflow: 32768 → -32768 (wraps around)

			    // ----------------- int -----------------
			    int i = 2147483647; // 2^31 - 1 (max int value)
			    // int i1 = 2147483648; // CE: Literal out of int range
			    int i2 = (int) 2147483648L; // long → int, overflow occurs → prints -2147483648

			    // ----------------- long -----------------
			    long l = 9223372036854775807L; // 2^63 - 1 (max long value)
			    long l1 = 2147483648L; // Valid long literal
			    long l2 = 9223372036854775807L; // Duplicate variable but valid

			    // ----------------- float & double -----------------
			    // float f = 5.9; // CE: Type mismatch: cannot convert from double to float
			    float f = 5.9f; // Add 'f' suffix to denote float literal
			    float f1 = 100; // Implicit widening (int → float)
			    float f2 = 45.6789976554579F; // precision up to ~7 digits
			    double d = 45.6789976554579D; // double precision up to ~15 digits
			    float f3 = 2147483647.866F; // acceptable, within float range

			    // ----------------- char -----------------
			    char c = 'M';
			    char c1 = 'F';
			    char c3 = '5';

			    // ASCII reference:
			    // A–Z → 65–90
			    // a–z → 97–122
			    char c2 = 33; // int → char (implicit casting), prints '!'

			    // Unicode character
			    char c4 = '\u0023'; // Unicode for '#'

			    int i5 = 'A'; // char → int → ASCII value 65

			    // ----------------- boolean -----------------
			    boolean boo = false;
			   // boolean b6=0;
//				boolean b3=1;
//				boolean b4=True;
//				boolean b5=False;
//				boolean boo = "false";
//				boolean boo = "true";

			     

			    public static void main(String[] args) {
			        System.out.println("main method started!");
			        Langfundemo1 t = new  Langfundemo1();

			        System.out.println("byte b  = " + t.b);
			        System.out.println("byte b2 = " + t.b2); // prints 1 (257 overflow)

			        System.out.println("short s = " + t.s);
			        System.out.println("short s2 = " + t.s2); // prints -32768 (overflow)

			        System.out.println("int i = " );
			        System.out.println("int i2 = " + t.i2); // prints -2147483648 (overflow)
			        System.out.println("int i5 (char 'A') = " + t.i5); // prints 65

			        System.out.println("long l = " + t.l);
			        System.out.println("long l1 = " + t.l1);
			        System.out.println("long l2 = " + t.l2);

			        System.out.println("float f = " + t.f);
			        System.out.println("float f1 = " + t.f1);
			        System.out.println("float f2 = " + t.f2);
			        System.out.println("double d = " + t.d);
			        System.out.println("float f3 = " + t.f3);

			        System.out.println("char c = " + t.c);
			        System.out.println("char c1 = " + t.c1);
			        System.out.println("char c2 = " + t.c2);
			        System.out.println("char c3 = " + t.c3);
			        System.out.println("char c4 = " + t.c4);

			        System.out.println("boolean boo = " + t.boo);

			        if (t.boo) {
			            System.out.println("Hello Guys, Good Morning!!");
			        }
			        else {
			            System.out.println("Condition not satisfied, skipping message.");
			        }
			    }
			    }
