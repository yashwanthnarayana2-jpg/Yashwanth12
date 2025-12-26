package com.alltasks;

import java.util.Scanner;
//console data to user,scanner cls
public class Taska17 {
	static int bal = 5000;
	static Scanner sc = new Scanner(System.in);
	static void accdetails() {
		System.out.print("enter your name:");
		String name = sc.nextLine();
		System.out.print("enter Accno:");
		int accno =sc.nextInt();
		System.out.print("enter your phone:");
		 Long phone = sc.nextLong();
		System.out.println("initial bal:"+bal);
		deposist(bal);
	}
	static void deposist(long amount) { 
		System.out.print("enter your  deposiste cash:");
		long amount1 = sc.nextLong();
		amount += amount1;
		System.out.println("updated cash:" +amount);
		withdraw(amount);
	}

	static void withdraw(long amount) {
		System.out.print("enter your  withdraw cash:");
		long amount1 = sc.nextLong();
	    amount -= amount1;
		System.out.println("updated cash:" + amount);
	}
        
	public static void main(String[] args) {
		accdetails();
		 
		sc.close();
		}
	

}

