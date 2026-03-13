package com.programs;
//perfect number:multiples of number extrends itself number
//eg 6->1,2,3->1+2+3=6::# 6=6
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter a number");
		 int n=sc.nextInt();
		 metho(n);
		 sc.close();
	}
	static void metho(int num)	{
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println(sum);
		System.out.println(num==sum?"perfect":"not perfect");
	}
	
	

}
