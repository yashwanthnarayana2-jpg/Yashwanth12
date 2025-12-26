package com.yashjavaintro;

public class Example {
 static {
	 System.out.println( "static");
	 }
 {
	 System.out.println( "instance");
 }
 static {

	 System.out.println( "static");
	 }
	public static void main(String[] args) {
		
	 System.out.println("main method");
		 
	 Example e1 = new Example();
     Example e2 = new Example();


	  
      }

}
