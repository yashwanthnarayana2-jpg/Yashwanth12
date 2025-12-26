package com.alltasks;

import java.util.Scanner;

public class Taska30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number:");
		long a = sc.nextLong();
		if (a % 2 == 0) {
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}

		System.out.println(a % 2 == 0 ? "even" : "odd");// ternary operator
		sc.close();
	}

}
