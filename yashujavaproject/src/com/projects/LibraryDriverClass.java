package com.projects;

import java.util.Scanner;

public class LibraryDriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LibraryInterface.library();
		LibraryImpleLogicClass li = new LibraryImpleLogicClass();

		do {
			boolean b = false;
			System.out.println("---------------------------------------------------");
			System.out.println("1. Member Mangement" + "                 " +"2. Book Management" + "\n"
					+ "3. Books Search    " + "                 " +"4. Delete Book " + "\n" + "5. Books Issue System"
					+ "               " +"6. Books Reports");
			System.out.println("---------------------------------------------------");
			int c = sc.nextInt();
			switch (c) {
			case 1 -> li.memeberMang();
			case 2 -> li.bookAdd();
			case 3 -> li.bookSearch();
			case 4 -> li.bookDelete();
			case 5 -> li.issueSystem();
			case 6 -> li.reports();

			}
			System.out.println("go to menu yes/no");
			b = sc.next().equalsIgnoreCase("yes/no");
		} while (true);
	}

}
