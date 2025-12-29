package com.casestudy;

import java.util.Scanner;

//OPERATORS TYPE
public class CaseStudy4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean a, b, c, d;
		boolean ispermanent = true;
		System.out.println("employee salary & eligibilty");
		System.out.print("emp salary:");
		double esal = sc.nextDouble();
		System.out.print("enter bonus:");
		double bonus = sc.nextDouble();
		System.out.print("enter deduction:");
		double deduction = sc.nextDouble();
		System.out.print("enter experience:");
		double experience = sc.nextDouble();
		// arithmetic
		double gross = esal + bonus;
		double netsal = gross - deduction;
		System.out.println("gross salary of emp:" + gross);
		System.out.println("net Salary  of emp:" + netsal);
		// relational
		a = (experience < 3);
		b = netsal > 30000;
		System.out.println("emp experience morethan3:" + a);
		System.out.println("emp of net salary greater30000:" + b);
		// logical operator
		// c=experience >0 && experience < 3;
		// d= experience < 3 ;
		boolean bo = (experience > 3);
		c = (ispermanent && bo);
		System.out.println("emp is permanent,morethan 3years of exp:" + c);

		boolean bo1 = (experience > 5);
		d = (ispermanent || bo1);
		System.out.println("emp is permanent,morethan 5years of exp:" + d);
		// assignment
		bonus += 1000;
		System.out.println("emp increased in bonus:"+bonus);
		// uniary
		experience++;
		System.out.println("emp exp increment:"+  experience);
		// ternary
		System.out.println(netsal >= 30000 ? "finally emp eligible" : "not eligible");
	}

}
