package com.homepractising;
//Repeat loop Until the 
import java.util.Scanner;

public class UncheckedException3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b;

		do {
			try {
				System.out.println("Enter number");
				int a = sc.nextInt();
				System.out.println("you got it");
				b=false;

			} catch (Exception e) {
				 
				 System.out.println("Enter Corect Number");
				 sc.next();
				b=true;
			}

		} while (b);

	}
}
