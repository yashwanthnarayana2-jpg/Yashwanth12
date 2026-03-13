package com.programs;
//Powers of Number
import java.util.Scanner;

public class PowerOfNumber {
	static long method(long b,int pow) {
		long res=1;
		 for(int i=0;i<pow;i++) {
			 res=res*b;
		 }
		
	return res;}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         long b=sc.nextInt();
         int p=sc.nextInt();
         System.out.println(method(b,p));
	}

}
