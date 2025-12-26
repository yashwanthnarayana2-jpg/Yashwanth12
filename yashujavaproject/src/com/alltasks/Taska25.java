package com.alltasks;

public class Taska25 {

	int empid;
	String empname;
	double salary;
	static String companyname;

	Taska25() {
		companyname = "techsoft pvd ltd";
	}

	Taska25(int empid) {
		this();
		this.empid = empid;
		 }
	Taska25(Taska25 t,String empname,double salary) {
		this.empid =t.empid+1;
		this.empname = empname;;
		this.salary =salary;
	}
	
	void display() {
		System.out.println(companyname);
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
	}
 
	public static void main(String[] args) {
		Taska25 t1 = new Taska25(100);
		//t1.display();
		Taska25 t2 = new Taska25(t1, "umesh",300000);
		t2.display();
		Taska25 t3 = new Taska25(t2, "yash",800000);
		t3.display();
	}

}
