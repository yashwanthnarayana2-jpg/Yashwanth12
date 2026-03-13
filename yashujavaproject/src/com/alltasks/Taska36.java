package com.alltasks;
// factorial of number 5!=120
import java.util.Scanner;

public class Taska36 {
	static int fact=1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
      int n =sc.nextInt();
  
	 for(int i=1;i<=n;i++) {
	fact=fact*i;
	 }
	 System.out.println(fact);
	 
sc.close();}}
