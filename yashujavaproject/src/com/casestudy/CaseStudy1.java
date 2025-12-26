package com.casestudy;
//CASE STUDY 
import java.util.Scanner;

class Bank {
	static Scanner sc = new Scanner(System.in);
	{
	System.out.println("Welcome GAVARAPALEM UNION BANK"  );
	}

	static void bankdetails() {
		String s = "Union Bank";
		String s1 = "Gavarapalem";
		String s2 = "UNIC0101";
		System.out.println("bank name:" + s);
		System.out.println("bank branch:" + s1);
		System.out.println("bank ifsc code:" + s2);
		BOpenAcc();
	}

	static void BOpenAcc() {
		System.out.print("enter your name:");
		String s1 = sc.nextLine();
		System.out.print("enter your Accno:");
		int no = sc.nextInt();
		System.out.print("enter your Phno:");
		long ph = sc.nextLong();
		System.out.print("enter your email:");
		String s2 = sc.next();
		long initialbal = 500;
		policy(initialbal);
		// System.out.println(policy(initialbal))
	}

	private static void policy(long bal) {
		// initial balance
		if (bal >= 500) {
			System.out.println("Your bank opened sucessfully");
		}

		else {
			System.out.println("Your bank not created");
		}
		deposist(bal);
	}

	static void deposist(long bal) {
		System.out.print("enter your deposist amount:");
		long amount = sc.nextLong();
		bal += amount;
		System.out.println("Deposist amount:" + bal);
		withdraw(bal);
	}

	private static void withdraw(long bal) {
		System.out.print("enter your  withdraw amount:");
		long amount = sc.nextLong();
		// transaction limit
		if (amount <= 10000) {
			bal -= amount;
			System.out.println("withdraw amount:" + bal);
			// System.out.println("sucessfully withdraw");
			checkbal(bal);
		}
			else if(bal<amount){
				System.out.println("Insufficient balance" );
			}
			else
			System.out.println("over limit transaction");

	}

	static void checkbal(long a) {
		System.out.println("your current balance:" + a);
	}

	static void loan() {
		System.out.print("enter loan amount:");
		long loan = sc.nextLong();
		if (loan <= 1000000000) {
			System.out.println("loan approved");
			System.out.print("enter interest for loan amount:");
			double r = sc.nextDouble();
			System.out.print("enter time for loan amount:");
			double t = sc.nextDouble();
			double  SI = (loan*t*r)/100;
			System.out.println("per monthly interest:"+SI);
			System.out.println("total amount for loan with interest:"+(loan+SI));
		} else
			System.out.println(" No loan Approved" + loan);
		 sc.close();
	}
}
public class CaseStudy1 {

	public static void main(String[] args) {
		Bank b = new Bank();
		Bank.bankdetails();
		Bank.loan();



	}

}
