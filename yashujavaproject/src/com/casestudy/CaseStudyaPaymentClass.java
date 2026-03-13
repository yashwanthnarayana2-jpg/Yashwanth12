package com.casestudy;
 
import java.util.Scanner;

public class CaseStudyaPaymentClass {
	Scanner sc = new Scanner(System.in);
	String transactionid;
	public double BankBal=10000000;
	int securedpassword=6789;
	public Double getcreditcardloan() {
		 double loan =500000; 
		 return loan;}

	public void getprocessPayment() {
		System.out.println("enter the amount for payment");
		double Amount = sc.nextDouble();
		Double Currbal=BankBal-Amount;
		System.out.println("enter your Secured password");
		int  password= sc.nextInt();
		if(password==securedpassword) {
			System.out.println("payment doned Successfully");
		}
		else {
			System.out.println("incoorrect password ");
		}
		
	}

}
