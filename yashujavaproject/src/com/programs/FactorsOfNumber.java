package com.programs;
//factors of a number eg-10:-1,2,5,10
import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		metho(n);
		sc.close();
	}

	static void metho(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

}
