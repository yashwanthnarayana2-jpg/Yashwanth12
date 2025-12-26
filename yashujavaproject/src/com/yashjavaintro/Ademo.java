package com.yashjavaintro;

public class Ademo {
	static void method()
	{
		method1();
		System.out.println("iam static -Method");
	}
	void metho1()
	{
		Ademo d =new Ademo();
		d.metho2();
		System.out.println("iam instance -1Method");
	}
	
	void metho2()
	{
		System.out.println("iam instance -2Method");
	}
	
	static void method1()
	{
		 
		method2();
		 
		System.out.println("iam static - 1Method");
	}
	static void method2() 
	{
		 
		System.out.println("iam static - 2Method");  
	}

	{
		 
		System.out.println("iam instance Block");
	  
		 
	}
	static 
	{
		System.out.println("iam static block");
	 
		Ademo d =new Ademo(); 
		 
		d.metho1();
		method();
		 
		 
	}
	

	public static void main(String[] args) {
	 
		 
		System.out.println("hello main methiod started!!");
	}
	 
}
