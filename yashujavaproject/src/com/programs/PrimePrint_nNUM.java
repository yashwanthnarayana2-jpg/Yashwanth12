package com.programs;

//printing n prime numbers
import java.util.Scanner;

public class PrimePrint_nNUM {

	static boolean isprime(int a) {
		if (a == 0 || a == 1) {
			return false;
		}
		if (a == 2) {
			return true;
		}
		if (a % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= a / 2; i ++) {
			if (a % i == 0) { 
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number:");
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			if (isprime(i)) {
				System.out.println(i);
			}
		}
		 
		sc.close();
	}

}
