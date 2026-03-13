package com.yashlogicalstmts;
// multiples of number && is perfect number
import java.util.Scanner;

public class Multiples$PerfectNum {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int sum=0;
		 int temp=n;
		 for (int i=1;i<n;i++) {
			 if(n%i==0) {
			System.out.println(i);	
				 
              sum=sum+i;
		 }
	 	 
	}
		 System.out.println(sum==n?"perfect":"not perfect");
		  

}}
