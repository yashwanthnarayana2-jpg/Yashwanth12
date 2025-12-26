package com.alltasks;
//direct data to user,beginnerlevel
public class Taska15 {
	static void deposist() {
		long accno = 345101007617818191L;
		String s = "umesh";
		int cash = 500;
		int deposist =50000;
		int update_cash = deposist  + cash;
		System.out.println("holder name:" + s);
		System.out.println("holder accno:" + accno);
		System.out.println("initial cash:" + cash); 
		System.out.println("deposist cash:" +deposist );
		System.out.println("updated amount:" + update_cash);
		withdraw(update_cash);
	}

	static void withdraw(int uc) {
		int cash = 5000;
		float withdraw = uc - cash;
		System.out.println("withdraw cash:" + withdraw);
		checkbal(withdraw);
	}

	static void checkbal( float wd) {
		System.out.println("currentbal=" + wd);
	}

	public static void main(String[] args) {
		deposist();
	}

}
