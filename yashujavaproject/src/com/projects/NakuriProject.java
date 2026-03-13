package com.projects;

import java.util.Scanner;

//nested if
public class NakuriProject {

	public static void main(String[] args) {
		System.out.println("welcome to Nakuri profile");
		Scanner sc = new Scanner(System.in);
		final String NO = "no";
		final String YES = "yes";
		System.out.print("enter your name:");
		String name = sc.nextLine();
		System.out.print("enter your age:");
		int age = sc.nextInt();

		if (age > 18 && age < 28) {
			sc.nextLine();
			System.out.println("okay");
			System.out.print("enter your qualification:");
			String qualification = sc.nextLine();

			// sc.nextLine();
			System.out.print("enter your college name:");
			String college = sc.nextLine();

			System.out.println("Do you  have any active backlogs..? ");
			String blg = sc.next();

			System.out.println("do you  have any year gap in acadamics..? ");
			String gap = sc.next();

			if (blg.equalsIgnoreCase(NO) && gap.equalsIgnoreCase(NO)) {
				System.out.println("okay,u are eligible...");

				System.out.println("enter your year of passout");
				int year = sc.nextInt();
				if (year >= 2022 && year <= 2026) {

					System.out.println("ohh okay ");
					System.out.println("enter your percentage/cgpa of b.tech");
					double btech = sc.nextDouble();

					System.out.println("enter your percentage/cgpa of intermediate/diploma");
					double inter = sc.nextDouble();

					System.out.println("enter your percentage/cgpa of 10th");
					double tenth = sc.nextDouble();

					if (btech > 60 && inter > 60 && tenth > 60) {
						System.out.println("okay,you are good in academics");
						System.out.println("Have you done  your major project..?");
						String project = sc.next();
						if (project.equalsIgnoreCase(YES)) {
							sc.nextLine();
							System.out.println("okay,tell me your project title");
							String title = sc.nextLine();
							System.out.println("Are You willing to join within  1 month");
							String month = sc.next();
							if (month.equalsIgnoreCase(YES)) {
								System.out.println("Profile shortlisted. We will contact you soon.");
							} else {
								System.out.println("not in one month");
							}

						} else {

							System.out.println("major project mandatory");
						}

					} else {
						System.out.println("your  percentage below eligibility certeria");
					}

				} else {
					System.out.println("you are not eligible of yop");
				}

			} else {
				System.out.println("you are have backlog && gap");

				System.out.println("meet Hr later!!");
			}

		} else {
			System.out.println("your age not eligible for profile  ");
		}

		sc.close();
	}
}
