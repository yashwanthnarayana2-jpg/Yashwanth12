package com.programs;
//strong factorial of num= given num
import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter number");
		 long n=sc.nextLong();
		 long t=n;
		 long fact=1;
		 int i=1;
		 while(i<=n) {
			fact=fact*i; 
			i++;
		 }
		 System.out.println(fact);
		 if(fact==t) {
			 System.out.println("strong");
		 }
		 else{
			 System.out.println(" not strong");
		 }
			 

	sc.close();}

}
