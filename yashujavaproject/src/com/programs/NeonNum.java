package com.programs;

import java.util.Scanner;

//Neon num--> number sqaure their sum is equal to given num
public class NeonNum {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter number");
		 int n=sc.nextInt();
		 int t=n;
		 int r,m;
		 int sum=0;
		 m=n*n;
		 while(m!=0) {
			 r=m%10;
			 sum=sum+r;
			 m/=10;
		 }
		 System.out.println(sum==t?"neon":"not neon");

	sc.close();}

}
