package com.alltasks;

import java.util.Scanner;

public class Taska29 {
	double bsal,  bonus,  twd,  daysworked , deduction;
	static Scanner sc = new Scanner(System.in);
 
	 
void caldisplay( double bsal,double  bonus,  double twd, double daysworked ,double deduction)
	 {
	 
    double gross = bsal + bonus;
	double netsal = gross - deduction;
	double perdaysal = bsal / twd;
	double earnedsal = perdaysal * daysworked;
	double remdays = twd % daysworked;
		System.out.println("gross: "+gross);
		System.out.println("netsalary: "+netsal);
		System.out.println("perdaysalary:"+perdaysal);
		System.out.println("earnedsalary:"+earnedsal);
		System.out.println("remdays:"+remdays);
	}

	public static void main(String args[]) {
		 System.out.print ("enter basic salary:");
		  double bsal = sc.nextDouble();
			System.out.print ("enter bonus:");
			  double bonus = sc.nextDouble();
			System.out.print ("enter  total working days:");
		 double twd = sc.nextDouble();
			System.out.print ("enter  days worked:");
			  double daysworked = sc.nextDouble();
			System.out.print("enter  deduction:");
			  double deduction = sc.nextDouble();
			 
		 
		Taska29 t=new Taska29();
	    t.caldisplay (bsal,  bonus,  twd,  daysworked , deduction);
		sc.close();
		
	}
}
