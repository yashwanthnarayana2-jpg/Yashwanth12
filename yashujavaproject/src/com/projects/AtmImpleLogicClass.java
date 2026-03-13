package com.projects;

import java.util.Scanner;

public class AtmImpleLogicClass implements AtmInterface {
	static Scanner sc = new Scanner(System.in);
	double bal;
	String pin,pin1,Name;
	//pojo class object
	AtmPojo po = new AtmPojo();
 
	@Override
	public void createAccount() {
		po.setAccountno("56789089");
		System.out.println("Enter your name");
		String s = sc.nextLine();
		po.setName(s);
		System.out.println("Enter your phone number");
		String ph = sc.next();
		if(validatePhone(ph)){
		po.setPhone(ph);
//		po.setPin("5678");
//		pin1 = po.getPin();
		}
		po.setBalance(0.0);
		System.out.println("*******customer/user details*******");
		System.out.println("Acc/no:"+po.getAccountno());
		System.out.println("Name:"+(Name=po.getName()));
		 
		System.out.println("PhoneNo:"+po.getPhone());
		bal = po.getBalance();
		AtmInterface.ifscode();
		//System.out.println("IFSCCode:" + AtmInterface.ifscode());
		System.out.println("successfully account created");
	   
	   }

	@Override
	public void deposist() {
		System.out.println("enter your deposist amount:");
		double d = sc.nextDouble();
		System.out.println("enter your pin");
		String p = sc.next();
		
		if (p.equals(pin)||p.equals(pin1)) {
			   System.out.println(Name);
			if (d > 0 && d < 50000) {
				bal=bal+d;
				System.out.println("Successfully Credited...");
			} else {
				System.out.println(" Over limit deposist");
			}
		} else {
			System.out.println("invalid pin ");
		}
		 
	}

	@Override
	public void withdrawl() {
		System.out.println("enter your withdrawl amount:");
		double w = sc.nextDouble();
		System.out.println("enter your pin");
		String p = sc.next();
		if (p.equals(pin)||p.equals(pin1)) {
			if (w < bal && w < 50000) {
				bal-=w;
				System.out.println("Successfully Debited.. ");
			} else {
				System.out.println("over limit transaction");
			}
		} else {
			System.out.println("invalid pin ");
		}
	 
	}

	@Override
	public void checkbal() {
		System.out.println("enter your pin");
		String p = sc.next();
		if (p.equals(pin)||p.equals(pin1)) {
			System.out.println("Current Balance:"+bal);
		}
		else {
			System.out.println("invalid pin ");
		}
	}

	public void pin() {
		System.out.println("enter strong numbers only like eg:1234");
		String s = sc.next();
		po.setPin(s);
		System.out.println("sucessfully pin generate ");
		pin = po.getPin();
	}
boolean validatePhone(String ph) {
	if(ph.matches("^[0-9]{10}$")) {
		return true;
	}
	else {
		System.out.println("invalid phone number");
		System.out.println("Enter your phone number");
		String ph1 = sc.next();
		po.setPhone(ph1);
		return false;
	}
	
}
}
