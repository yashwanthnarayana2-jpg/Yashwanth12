package com.alltasks;

import java.util.Random;
import java.util.Scanner;

public class Taska42random {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int n=rd.nextInt(1,10);
		System.out.println(n);
		 
		int attempts=3;
		//int i = 0;
		 while(attempts!=0) {
			 System.out.println("enter number");
			 int num=sc.nextInt();
			 if(num==n) {
				 System.out.println("congrats");
				 break; 
			 }
			 else {
				 System.out.println("try again");
			 }
			 attempts--;
			  
			 
		 }
		
			 
	sc.close();}

}
