package com.yashjavaintro;
 
import java.util.* ;

// Arithmetic operations

public class Cdemo {
	  
	  static int addition(int a,int b) 
	  {return a+b;}
	  static int  subtraction(int a,int b) 
	  {return a-b;}
	  static int multiply(int a,int b) 
	  {return a*b;}
	  static  double division (int a,int b) 
	  {return a/b;}
	  static  double  modulus (int a,int b) 
	  {return a%b;}
	  
	 public static  void main(String[] args) {
		 System.out.println("welcome to arithmetic operations");
		 Scanner sc= new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 System.out.println("enter value of a="+a);
		 System.out.println("enter value of b="+b);
		 
		 System.out.println("Add result="+addition(a,b));
		 System.out.println("Sub result="+ subtraction(a,b));
		 System.out.println("Mul result="+ multiply(a,b));
		 System.out.println("Div result="+division(a,b));
		 System.out.println("mod result="+modulus(a,b));
		  
		  
		 
	}

}