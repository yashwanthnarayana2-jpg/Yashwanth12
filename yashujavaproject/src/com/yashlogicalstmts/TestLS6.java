package com.yashlogicalstmts;

import java.util.Scanner;

public class TestLS6 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     System.out.print("enter any weekname num:");
		 int num=sc.nextInt();
		 switch(num) {
		 case 1 -> {System.out.println("sunday");}
		 case 2 -> System.out.println("monday");
		 case 3 -> System.out.println("tuesday");
		 case 4 -> System.out.println("wednesday");
		 case 5 -> System.out.println("thursday");
		 case 6 -> System.out.println("friday");
		 case 7 -> System.out.println("saturday");
		 }
	sc.close();}

}
