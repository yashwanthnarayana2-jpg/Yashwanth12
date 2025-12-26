package com.alltasks;

public class Taska31 {

	public static void main(String[] args) {

		int p = 3;
		int q = 6;
		int r = p++ + --q + ++p + q--;//3-4,5,5,5-4
		System.out.println(r);
		int a = 5;
		int b = ++a + a++ + --a;//6,6-7,6
		System.out.println(b);

	}

}
