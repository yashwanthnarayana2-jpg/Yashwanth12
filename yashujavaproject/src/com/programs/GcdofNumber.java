package com.programs;

import java.util.Scanner;

public class GcdofNumber {
	static int gcd(int n1,int n2){
		while(n2!=0) {
			 int t=n2;
			 n2=n1%n2;
			 n1=t;}
		return n1; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number n1");
		int n1 = sc.nextInt();
		System.out.println("enter number n2");
		int n2 = sc.nextInt();
		 System.out.println("gcf:"+gcd(n1,n2));
		
		sc.close();
	}

}
