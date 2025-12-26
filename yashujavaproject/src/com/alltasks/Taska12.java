package com.alltasks;

import java.util.Scanner;

public class Taska12 {
	static double w = 2.45;
	static double h = 0.1245;

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("enter weight: ");
		double wi = sc1.nextDouble();
		System.out.print("enter height: ");
		double hi = sc1.nextDouble();
		int bmi = (int) (wi / (hi));
		
		int bmi1 = (int) (w / (h * h));
		System.out.println("BMi:" + bmi);
		System.out.println("BMi1:" + bmi1);

	}

}
