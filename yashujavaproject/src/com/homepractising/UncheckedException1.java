package com.homepractising;

import java.util.Scanner;
//Arithmatic Exception
public class UncheckedException1 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a number:");
		 int a=sc.nextInt();
		 System.out.println("enter b number:");
		 int b=sc.nextInt();
		 try {
			 System.out.println(a/0.0);//infinity
			 System.out.println(0.0/0.0);//NaaN
			 System.out.println(a/0);//AE 
			 System.out.println(a/b);//value
		 }
		 catch(Exception e){
			 System.err.println(e.getMessage());
			 e.printStackTrace();
		 }
		 finally {
			 System.out.println("your exception doned");
			 sc.close();}
	 }

}
