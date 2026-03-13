package com.programs;

import java.util.Scanner;

public class PrimeNumCheck {
	
	static boolean isPrime(int a) {
		if(a==0||a==1) {
			return false;
		}
		if(a==2) {
			 return false;
		}
		for(int i=3;i<=a/2;i++) {
			if(a%i==0) {
				return false;
			}
		}
	return true;}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter any number:");
		 int n=sc.nextInt();
		 if(isPrime(n)) {
			 System.out.println("prime");
		 }
		 else{
			 System.out.println("not prime");
		 }
		 
	sc.close();}
	 
}
