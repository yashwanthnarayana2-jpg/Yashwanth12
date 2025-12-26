package com.alltasks;

//person class
class person {
	String name;
	int age;

	person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

//employee class
class employee extends person {
	int eid;
	long esal;

	employee(int eid, long esal, int age, String name) {
		super(name,age);
		this.eid = eid;
		this.esal = esal;
	}

	void show() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(eid);
		System.out.println(esal);
	}
}

//driver class
public class Taska22 {

	public static void main(String[] args) {
		employee e = new employee(209, 50000,23,"umesh");
		e.show();
	}

}
