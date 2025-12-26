package com.homepractising;

import java.util.Scanner;

public class Exercise7 {

	static void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		sub(a, c);// 7,16
	}

	static void sub(int a, int b) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();// 7
		System.out.println("difference " + (a - b));//-9
		mul(a, c);//7,7
	}

	static void mul(int a, int b) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();// 3
		System.out.println("product" + a * b);//49
		div(a, c);// 
	}

	static void div(int a, int b) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();//7
		System.out.println("division" + a / b);//1
	}

	//wrapper dt
	static void medo(Integer x,Integer y)
	{
		  System.out.println("z="+(x+y));
	 }
	static void methoi(String s,char c) {
		c=(byte)('A');
		c=(short)('\u0040');
		c=(int)('B');
		c=(char)('\u0040');
		System.out.print("int:"+c+"\nbyte:"+c);
	}
	public static void main(String[] args) {
		methoi("ty",'9');
		Scanner scr = new Scanner(System.in);
		int a = scr.nextInt();
		int b = scr.nextInt();
		add(a, b);// 7,9
		medo(5,6);
	}

}
