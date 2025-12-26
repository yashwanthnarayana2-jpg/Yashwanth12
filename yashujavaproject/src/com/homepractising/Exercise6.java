package com.homepractising;

//Variables
public class Exercise6 {
//Static variables
	static int i ;
	static String s ;
// Instance variables
	int a = 342;
	String str = "jfs";

	public static void main(String[] args) {
		// Local variables
		//no default value , thrown by jvm
		//local variable name used as cls level variable names also
		int i1 = 982;
		String s1 = "java";
		Exercise6 e = new Exercise6();
		Exercise6 e1 = null;
		i=345;
		s="vcube";
		System.out.println("***static variables**");
		// 1.with class name acessing static variables
		System.out.println("with cls name: " + Exercise6.i);
		System.out.println("with cls name: " + Exercise6.s);

		// 2.object reference for static variables
		System.out.println("obj ref: " + i);
		System.out.println("obj ref: " + s);

		// 3.obj ref null for static variables
		// static field can be accessed in static way
		System.out.println("obj ref as null: " + e1.i);
		System.out.println("obj ref as null: " + e1.s);

		// 1.obj ref for instance variables
		System.out.println("****instance variables***");
		System.out.println("obj ref: " + e.a);
		System.out.println("obj ref: " + e.str);

		// 2. obj ref null for instance variables
		// null pointer exception jvm throws
		// System.out.println(e1.a); // System.out.println(e1.str);
		 
		// 3.with class name acessing static variables
		// Cant make static reference to the non-static field
		// System.out.println(Exercise6.a); //System.out.println(Exercise6.str);//invalid
		 
		// local variables
		System.out.println("local variables");
		System.out.println("direct accessing: "+i1);
		System.out.println("direct accessing: "+s1  );

	}

}
