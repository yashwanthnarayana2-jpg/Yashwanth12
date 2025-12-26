package com.alltasks;
//with return ,args
public class Taska14 {
	static int add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return sub(a, c);

	}

	static int sub(int c, int b) {
		int d = b - c;
		System.out.println(d);
		return multiply(c, d);
	}

	static int multiply(int d, int b) {
		int f = d * b;
		System.out.println(f);
		return divide(d, f);
	}

	static int divide(int f, int b) {
		int e = f / b;
		System.out.println(e);
		return e;
	}

	public static void main(String[] args) {
		add(7, 9);
	}

}
