package com.alltasks;
//parameterized constructor
public class Taska20 {
	
	int id;
	String name;
	int sal;
	Taska20()
	{
		System.out.println("no args constructor");
		id=4;
		name="sajan";
		
	}
	 
	Taska20(int id ,String name ) {
		System.out.println("2-Parameterised constructor");
		this.id = id;
		this.name = name;
	}

	Taska20(int id, String name, int sal) {
		System.out.println("3-Parameterised constructor");
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public static void main(String[] args) {
		Taska20 t = new Taska20();
		t.show();
		Taska20 t1 = new Taska20(1,"yash");
		t1.show();
		Taska20 t2 = new Taska20(2, "umesh", 20000);
		t2.show();
		 
	}

	void show() {
		System.out.println("ID:" + id);
		System.out.println("NAME:" + name);
		System.out.println("SALARY:" + sal);
	}

}
