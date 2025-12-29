package com.homepractising;

import java.util.Scanner;

//nested if
public class Exercisea13 {

	public static void main(String[] args) {
		System.out.println("welcome to Nakuri profile");
		Scanner sc = new Scanner(System.in);
		String d = "no";String d1 = "yes";
		System.out.print("enter your name:");
		String n = sc.next();
		System.out.print("enter your age:");
		int age = sc.nextInt();
		if (age > 18 && age < 28) {
			System.out.println("okay");
			System.out.print("enter your qualification:");
			String s = sc.next();
			System.out.print("enter your college name:");
			String s1 = sc.next();
			System.out.println("do have any active backlogs..? ");
			String bl = sc.next();
			System.out.println("do have any year gap in acadamics..? ");
			String b2 = sc.next();
			if (bl.equals(d) && b2.equals(d)) {
				System.out.println("okay,u are eligible...");
				System.out.print("enter your year of passout");
				int year = sc.nextInt();
				if (year > 2022 && year < 2026) {
					System.out.println("ohh okay ");
					System.out.println("enter your percentage/cgpa of b.tech");
					double p = sc.nextDouble();
					System.out.println("enter your percentage/cgpa of intermediate/diploma");
					double p1 = sc.nextDouble();
					System.out.println("enter your percentage/cgpa of 10th");
					double p2 = sc.nextDouble();
					if (p > 60 && p1 > 60 && p2 > 60) {
						System.out.println("okay,u are good in acadamics");
						System.out.println(" have done major project..?");
						String st = sc.next();
						 
						if (st == d1) {
							System.out.println("okay,tellme your project title");
							System.out.println("some disease detection using python");
							System.out.println(" okay,uare willing to join 1 month");
							 String m = sc.next();
							if (m.equals(d)) {
								System.out.println("okay,call u later");
							} else {
								System.out.println("not in one month");
							}

						} else {

							System.out.println("your no project");
						}

					} else {
						System.out.println("your  percentage below 60");
					}

				} else {
					System.out.println("you are not eligible of yop");
				}

			} else {
				System.out.println("you are have backlog && gap");
				System.out.println("enter your bacllog list & enter year gap also");
				int blg=sc.nextInt();
				System.out.println("okay, meet me later!!");
			}

		} else {
			System.out.println("your age not eligible for profile  ");
		}

	}
}
