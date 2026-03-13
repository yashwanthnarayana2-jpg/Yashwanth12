package com.yashlogicalstmts;

import java.util.Scanner;

// factorial of num by recursion
public class TestRec1 {
	//factorial of num
	static long fact(int a) {
		if(a==0 || a==1) return 1;
	return a*fact(a-1);}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a number");
		 int n=sc.nextInt();
		 System.out.println( fact(n));
		  


	}

}
