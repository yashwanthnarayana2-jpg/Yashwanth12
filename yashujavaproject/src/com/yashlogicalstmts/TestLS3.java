package com.yashlogicalstmts;

//divisibility conditions
import java.util.Scanner;

public class TestLS3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number:");
		int a = sc.nextInt();
		//nested if
		if (a % 2 == 0) {
			System.out.println("divisible by 2");
			if (a % 3 == 0) {
				System.out.println("divisible by 3");
			    }
				if (a % 2 == 0 && a % 3 == 0) {
					System.out.println("divisible by 6");
				}
				if (  a % 9 == 0) {
					System.out.println("divisible by 9");
				}
				  if (a % 4 == 0) {
						System.out.println("divisible by 4");
						if (a % 2 == 0 && a % 4 == 0) {
							System.out.println("divisible by 8");
						}
					}
		
	  if (a % 5 == 0) {
			System.out.println("divisible by 5");
			if (a % 10 == 0) {
				System.out.println("divisible by 10");
			}
		} else if (a % 7 == 0) {
			System.out.println("divisible by 7");
		}
		}
		else {
			System.out.println("invalid divisible");
		}
sc.close();
	}
}
