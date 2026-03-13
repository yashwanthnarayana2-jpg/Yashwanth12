package com.projects;

public class AtmPojo {
	private String accountno;
	private String name;
	private String pin;
	private double balance;
	private String phone;

	public void setAccountno(String accountno) {
		this.accountno = "101001" + accountno;
	}

	public void setName(String Name) {
		this.name = "Mr/Mrs./Miss:" + Name;
	}

	public void setPin(String Pin) {
		this.pin = Pin;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAccountno() {
		return accountno;
	}

	public String getName() {
		return name;
	}

	public String getPin() {
		return pin;
	}

	public double getBalance() {
		return balance;
	}

	public String getPhone() {
		return phone;
	}
}
