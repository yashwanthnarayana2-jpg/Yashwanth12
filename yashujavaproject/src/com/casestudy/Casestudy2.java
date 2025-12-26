package com.casestudy;

class Employee {
	String deptno;
	int id;
	int age;
	String Fname;
	String Lname;
	static String dept = "JAVA";

	Employee(int id, String Fname, String Lname) {
		super();
		this.id = id;
		this.Fname = Fname;
		this.Lname = Lname;
	}

	Employee(Employee e, int age, String deptno) {
		this.id = e.id;
		this.Fname = e.Fname;
		this.Lname = e.Lname;
		this.age = age;
		this.deptno = deptno;

	}

	void show() {
		System.out.println(dept);
		System.out.println(id);
		System.out.println(Fname + "." + Lname);
		System.out.println(age);
		System.out.println(deptno);
	}
}

public class Casestudy2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "B", "Pradhu");
		Employee e2 = new Employee(e1, 23, "JFS-21");
		e2.show();

	}

}
