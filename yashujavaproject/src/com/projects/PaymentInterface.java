package com.projects;

public interface PaymentInterface {
	public abstract void pay(double amount);

	public abstract void refund(double amount);

	public void generateReceipt();

	public default void validatePayment() {
		 System.out.println("validate Payment");
	}
	public static void paymentGuidelines() {
		System.out.println("Never share to OTP ");
	}

}
