package com.programs;

import java.util.Scanner;

public class LcmofNumber {
	static void lcm(int n1,int n2) {
		int n=n1*n2;
		while(n2!=0) {
			int t=n2;
			n2=n1%n2;
			n1=t;	
		}
		System.out.println(n/n1); 
	}
 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number n1");
		int n1 = sc.nextInt();
		System.out.println("enter number n2");
		int n2 = sc.nextInt();
		lcm(n1,n2);
		sc.close();

	}

}
