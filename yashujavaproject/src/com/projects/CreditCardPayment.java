package com.projects;

import java.util.Scanner;

public class CreditCardPayment implements PaymentInterface {
	Scanner sc = new Scanner(System.in);
	double bal;
	boolean PayStatus;

	public static void main(String[] args) {
		CreditCardPayment cp = new CreditCardPayment();
		cp.pay(1000000);
		CreditCardPayment.paymentGuidelines();//static method

	}

	@Override
	public void pay(double amount) {
		bal = amount;
		System.out.println("enter you amount to pay");
		double pay = sc.nextInt();
		if (pay > 0 && pay <= bal) {
			PayStatus = true;
			bal -= pay;
			validatePayment();

		} else {
			System.out.println("no payment done");

		}

	}

	@Override
	public void refund(double amount) {
		bal += amount;
	}

	@Override
	public void generateReceipt() {
		if (PayStatus) {
			System.out.println("Reciept generated:Payment successfully done");
		} else {
			System.out.println("no reciept generated");
		}
	}

	public void validatePayment() {
		System.out.println("enter your pin correctly");
		String pin = sc.next();
		if (validatePin(pin)) {
			System.out.println("Payment Successfully Doned");
			System.out.println("current bal" + bal);
			generateReceipt();
		} else {
			System.out.println("invalid pin");
			PayStatus=false;
		}
	}

	public static void paymentGuidelines() {
		System.out.println("Never share to OTP ");
		System.out.println("never share your detail");
	}

	boolean validatePin(String pin) {
		return pin.matches("\\d{4}");
	}
}
