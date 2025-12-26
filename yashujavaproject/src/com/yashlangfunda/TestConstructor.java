package com.yashlangfunda;
//this()
class Constructor {
	int cid;
	String cname;
	int cage;
	// no arg constructor
	Constructor () {
		System.out.println("no arg constructor called !");
		cid = 101;
		cname = "unknown";
		cage = 18;
	}
	// one arg constructor
	Constructor (int cid) {
		this();
		System.out.println("1-arg constructor called !");
		this.cid = cid;
	}
	// Two arg constructor
	Constructor (int cid, String cname) {
		this(cid);
		System.out.println("2-arg constructor called !");
		this.cname = cname;
	}
	// three arg constructor
	Constructor (int cid, String cname, int cage) {
		this(cid, cname);
		System.out.println("3-arg constructor called !");
		this.cage = cage;
	}
	void display() {
		System.out.println("*******************************");
		System.out.println("Customer ID : " + cid);
		System.out.println("Customer Name : " + cname);
		System.out.println("Customer Age : " + cage);
		System.out.println("*******************************");
	}}
public class TestConstructor{
	public static void main(String[] args) {
		System.out.println("main method started !");
		Constructor c1=new Constructor();
		c1.display();
		Constructor c2=new Constructor(102);
		 
		c2.display();
		Constructor c3=new Constructor(103, "Sajan");
		c3.display();
		Constructor c4=new Constructor(104, "Aswanth", 22);
		c4.display();
		System.out.println("main method ended !");
	}
	 
}




