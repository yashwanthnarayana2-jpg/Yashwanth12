package com.projects;

import java.util.Scanner;

public class Loan {
	 
	protected String phone;
	protected String pan;
	static Scanner sc = new Scanner(System.in); 

	String Aadharcard() {
		System.out.println("enter your Aadhar details ");
		String Aadhar=sc.next();
		validateAadharcard(Aadhar);
	return Aadhar;}
	
	boolean validateAadharcard(String Aadhar) {
		if (Aadhar.matches("^[2-9]{1}[0-9]{11}$")) {
			System.out.println("✅ Valid Aadhar Number");
			return true;
		} else {
			System.out.println("❌ Invalid Aadhar Number");

		}
		return false;
	}

	boolean validatePancard() {
		System.out.println("enter your Pan details (Example:ABCDE1234A)");
		String pan = sc.next();
		if (pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}$")) {
			System.out.println("✅ Valid PAN Number");
			return true;
		}

		else {
			System.out.println("❌ Invalid  Pan Number");
			return false;
		}
	}

	boolean validatePhoneNumber() {
		System.out.println("enter your mobile number");
		 String phone = sc.next();
		if (phone.matches("^[0-9]{10}$")) {
			System.out.println("✅ Valid mobile Number");
			return true;
		} else {
			System.out.println("❌ Invalid mobile Number");
			return false;
		}
	}

	double getUserSalary() {
		System.out.println("enter your salary");
		double salary = sc.nextDouble();
		return salary;
	}

	int getUserCibilScore() {
		System.out.println("enter your Cibil Score");
		int cibil = sc.nextInt();
		return cibil;
	}

	int getUserAge() {
		System.out.println("enter your age");
		int age = sc.nextInt();
		return age;
	}

	double getLoanROI() {
		double ROI = 9.5;
		return ROI;
	}
 void welcome() {
	System.out.println("welcome to oops");
}
}
