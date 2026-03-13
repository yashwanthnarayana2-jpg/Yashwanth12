package com.programs;
//sky -num is suma and product num is equal eg:2,1,1124
import java.util.Scanner;

public class SkyNum {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter number");
		 int n=sc.nextInt();
		 int r;
		 int sum=0,product=1;
		 while (n!=0)
		 {
			r=n%10;
			sum=sum+r;
			product=product*r;
			n/=10;
			 
		 }
		 System.out.println(sum==product?"sky":"not sky");
		 

	sc.close();}

}
