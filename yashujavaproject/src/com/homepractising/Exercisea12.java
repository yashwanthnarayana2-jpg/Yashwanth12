package com.homepractising;

import java.util.Scanner;
class A{
	
}
	 class B extends A {
		 
	 }

public class Exercisea12 {

	public static void main(String[] args) {
		 //false conditions
		B obj=new B();
		A o=new A();
		 System.out.println( obj instanceof A );//true
		 System.out.println(obj instanceof B ) ;//true
		 System.out.println(o instanceof A)  ;//true 
		 System.out.println(o instanceof B)  ; //false(A doesnot extends B)
		 System.out.println(o instanceof  Object);
		 
		 System.out.println( "*******************************");
		//true conditions:
		 Scanner sc=new Scanner(System.in);
		 Integer a=10;
		 String s="yash";
		 System.out.println(a instanceof Integer);
		 System.out.println(a instanceof Number)  ;
		 System.out.println(a instanceof Object)  ; 
		 System.out.println(s instanceof  String) ;
		 System.out.println(s instanceof Object)  ;
		 Character c='a';
		 System.out.println(c instanceof Character) ;
		 System.out.println(c instanceof Object)  ;
		 
	}
}
 