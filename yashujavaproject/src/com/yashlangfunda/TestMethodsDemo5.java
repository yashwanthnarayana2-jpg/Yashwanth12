package com.yashlangfunda;
//3) with return type + no arguments.
public class TestMethodsDemo5 {
	public static void main(String[] args) {
		System.out.println("main method started ");
		TestMethodsDemo5 t = new TestMethodsDemo5();
		double sal = t.getSalaryInfo();
		double bonus = t.getBonusInfo();
		System.out.println("Total Salary = " + (sal + bonus));
		System.out.println("main method ended");
	}
	double getSalaryInfo() {
		double salary = 100000.00;
		return salary;
	}
	double getBonusInfo() {
		
		double bonus = 20000.00;
		return bonus;
	}
}

