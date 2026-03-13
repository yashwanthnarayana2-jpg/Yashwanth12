package com.casestudy;

import java.util.Scanner;

public class CaseStudy6 {

	public static void main(String[] args) {
		  System.out.println("welcome to ATM");
		  Scanner sc =new Scanner(System.in);
		  int amount=0;
		  boolean b=false;
			 do {
		  System.out.println("enter transaction number like 1 or 2");
		 int transaction =sc.nextInt();
		 switch(transaction) {
		 case 1 -> {System.out.println("enter deposist amount");
		 int deposist=sc.nextInt();
		 amount+=deposist;
		 System.out.println(amount);
		 }
		 case 2 -> {System.out.println("enter withdraw amount");
		 int withdraw=sc.nextInt();
		 amount-=withdraw;
		 System.out.println(amount);
		 }
		 default->System.out.println("invalid transaction");
		 
		 }
		 System.out.println("go to transaction");
		 b=sc.next().equalsIgnoreCase("yes");
		 }while(b);
		 
		 
	sc.close();}

}
