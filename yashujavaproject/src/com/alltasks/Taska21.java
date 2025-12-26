package com.alltasks;

public class Taska21 {
	int id;
	String name;

	Taska21() {
		this(202);
		System.out.println("no-arg constructor called");
		id = 201;
		name = "umesh";
	}

	Taska21(int id) {
		this(203, " abhi");
		System.out.println("1-arg constructor called");
		this.id = id;
		display();
	}

	Taska21(int id, String name) {

		System.out.println("2-arg constructor called");
		this.id = id;
		this.name = name;
		display();

	}

	void display() {
		System.out.println("ID:" + id);
		System.out.println("NAME:" + name);
	}

	public static void main(String[] args) {
		Taska21 t = new Taska21();
		t.display();
	}

}
