package com.alltasks;

import java.util.Scanner;
 
public class Taska28SwapNum {
	static Scanner sc = new Scanner(System.in);
	//without temp
	static void method() {
		System.out.print("enter value a:");
		int a = sc.nextInt();
		System.out.print("enter value b:");
		int b = sc.nextInt();
		System.out.println("before swap a value:" + a);
		System.out.println("before swap b value:" + b);
		a = a + b;// 30
		b = a - b;// 30-10
		a = a - b;// 30-20
		System.out.println("after swap a value:" + a);
		System.out.println("after swap b value:" + b);

	}
//with temp
	static void tempmethod() {
		System.out.print("enter value a:");
		int a = sc.nextInt();
		System.out.print("enter value b:");
		int b = sc.nextInt();
		System.out.println("before swap a value:" + a);
		System.out.println("before swap b value:" + b);
	 
		int c = a;
		a=b;
		b=c;
		System.out.println("after swap a value:" + a);
		System.out.println("after swap b value:" + b);

	}
	static void BitOPerator() {
		System.out.print("enter value a:");
		int a = sc.nextInt();
		System.out.print("enter value b:");
		int b = sc.nextInt();
		System.out.println("before swap a value:" + a);
		System.out.println("before swap b value:" + b);
	  a=a^b;//30
	  b=a^b;
	  a=a^b;
	  System.out.println("after swap a value:" + a);
	  System.out.println("after swap b value:" + b);
	}


	public static void main(String[] args) {
		 
		method();
		tempmethod();
		sc.close();

	}}

	 