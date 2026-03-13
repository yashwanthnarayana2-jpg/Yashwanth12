package com.projects;

import java.util.Scanner;

public class AtmDriverClass {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		AtmImpleLogicClass a=new AtmImpleLogicClass();
		a.createAccount();
	//AtmInterface.ifscode();
   System.out.println("---------------------------------------------------");
		System.out.println("***Welcome To ATM***");
		do {
			boolean b=false;
		System.out.println("1 Deposist"+"          "+"2 Withdrawl"+"\n"+
				           "3 Check bal"+"         "+"4 Pin generate");
		System.out.println("---------------------------------------------------");		             
		int choose=sc.nextInt();
		switch(choose) {
		case 1-> a.deposist();
		case 2-> a.withdrawl();
		case 3-> a.checkbal();
		case 4-> a.pin();
		 
		}

		System.out.println("GO to Menu Display yes/no");
		b=sc.next().equalsIgnoreCase("yes");
		}
		while(true);
		}}

