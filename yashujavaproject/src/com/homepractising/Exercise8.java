package com.homepractising;

import java.util.Scanner;

//srikranth assignment all primitives dt used each method
public class Exercise8 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main started");
		System.out.print("enter fname:");
		String s = sc.next();
		System.out.print("enter lname:");
		String s1 = sc.next();
		System.out.print("enter Age:");
		byte a = sc.nextByte();
		System.out.print("enter BOB:");
	   short b = sc.nextShort();
		System.out.print("enter gender:");
		char g = sc.next().charAt(0);
		System.out.print("enter pin:");
		int p = sc.nextInt();
		System.out.print("enter phone no:");
		long no = sc.nextLong();
		System.out.print("enter Height:");
		Float h = sc.nextFloat();
		System.out.print("enter weight:");
		Double w = sc.nextDouble();
		System.out.println("**********Student info**********");
		metho(s, s1);
		metho(a);
		metho(b);
		metho(g);
		metho(p);
		metho(no);
		metho(h);
		metho(w);
		System.out.println("main end");
	}

	static void metho(String fname, String lname) {
		System.out.println("full name:" + fname + lname);
	}

	static void metho(byte age) {
		System.out.println("Age:" + age);
	}

	static void metho(char c) {
		System.out.println("Gender:" + c);
	}

	static void metho(short yob) {
		System.out.println("bday year:" + yob);
	}

	static void metho(int pin) {
		System.out.println("Pincode:" + pin);
	}

	static void metho(long phone) {
		System.out.println("mobile no:" + phone);
	}

	static void metho(float ht) {
		System.out.println("Height is:" + ht);
	}

	static void metho(double wt) {
		System.out.println("weight is:" + wt);
	}
}
