package com.programs;
//finding nth prime numbers
import java.util.Scanner;
 
public class PrimeNth_numofprime {
	static boolean prime(int a) {
		if(a==0||a==1) {
			return false;
		}
		if(a==2) {
			return true;
		}
		if(a%2==0) {
			return false;
		}
		for(int i=3;i<a/2;i++) {
			if(a%3==0) {
				return false;
			}
			 
		}
		 
	return true;}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter number:");
		 int n=sc.nextInt();
	 int count=0;
		 for(int i=2;i<=1000;i++) {
			if( prime(i)) {
				count++;
				if(count==n) {
					System.out.println(i);
					break;
				}
			}
			  
		 }
		 
	}

}
