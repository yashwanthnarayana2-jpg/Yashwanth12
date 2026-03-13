package com.alltasks;

//diagonal name as kohli
public class Taska45DiagonalPattern {

	public static void main(String[] args) {
		System.out.println("main stared");
		String s = "kohli";
		//int n = 5;
		for (int i = 0; i <s.length(); i++) {
			for (int j = 0; j <s.length(); j++) {
				if ( i==j||i + j == s.length() - 1)
					System.out.print(s.charAt(i));
				else
					System.out.print(" ");
			}

			System.out.println();

		}

	}

}
