package com.homepractising;
//example exam 13/12--> 6.java
class com {
	int id;
	String name;
	double price;
	com() {
		id = 1;
		name = "yash";
		price = 0.0;
		}
   com(int id, String name, double price) {
		this();
		this.id = id;
		this.name = name;
		this.price = price;
		 }
	void show() {
		System.out.println("your id:"+id);
		System.out.println("your name:"+name);
		System.out.println("your price:"+price);
	 
}}
class product extends com 
	{
	product(int id,String name)
	{
		super(10,"y",100);
		this.id=id;
		this.name=name;
	}
	}
public class Exercise9_2 {

	public static void main(String[] args) {
		System.out.println("Product Details");
		 product p=new product(101,"ram");
		 p.show();

	}
	}


