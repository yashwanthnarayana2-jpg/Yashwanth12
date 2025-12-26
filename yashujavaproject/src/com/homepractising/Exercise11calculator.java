package com.homepractising;

import java.util.Scanner;

public class Exercise11calculator {
 static double a,b;
 
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		 
		add();
		 
	}

	static void add() {
	 double a=sc.nextDouble();
	 char c=sc.next().charAt(0);
	 char c1=(char)(c);
	 c=c1;
	 double b=sc.nextDouble();
        System.out.println((long)(a+b));
        
	}
	static void sub() {
		 char c=sc.next().charAt(1);
		 char c1=(char)(c);
		 c=c1;
	         System.out.println(a-b);
		}
	static void mul() {
		 char c=sc.next().charAt(1);
		 char c1=(char)(c);
		 c=c1;
	         System.out.println(a*b);
		}
	static void div() {
		 char c=sc.next().charAt(1);
		 char c1=(char)(c);
		 c=c1;
	         System.out.println(a/b);
	         
		}
}
