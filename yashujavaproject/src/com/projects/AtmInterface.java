package com.projects;

public interface AtmInterface {
	public abstract void createAccount();
	default void display() {}
	public abstract void deposist();
	public abstract void withdrawl();
	public abstract void checkbal();
	public static void ifscode() {
		System.out.println("IFSCCODE:UNI005678");
	}
	

}
