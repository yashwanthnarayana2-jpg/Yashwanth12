package com.alltasks;
//2.without Creating Object for instance methods:
public class Task2{
	 static {
		metho();
		metho1();
		new Task2 ();
		 }
	 
	 
void method()
{ 
	 System.out.println( "instance method 1");
}
void method1()
{
	 System.out.println("instance method 2");
	  
	 }
{
	 method();
	 method1();
}
	  
static void metho()
{
   System.out.println("static   method 1");
}
static void metho1()
{
   System.out.println("static   method 2");
	 
}
	public static void main(String[] args) {
   System.out.println("***main method***");
		  
}
}
