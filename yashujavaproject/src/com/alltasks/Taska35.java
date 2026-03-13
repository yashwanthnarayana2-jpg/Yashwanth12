package com.alltasks;

import java.util.Scanner;
//switch cases
public class Taska35 {

	public static void main(String[] args) {
		System.out.println("all days of week");
		 Scanner sc= new Scanner(System.in);
		 System.out.println("choose number from 1 to 7:");
		 int day =sc.nextInt();
switch(day) {
case 1->System.out.println("monday");
case 2->System.out.println("tuesday");
case 3->System.out.println("wednesday");
case 4->System.out.println("thursday");
case 5->System.out.println("friday");
case 6->System.out.println("saturday");
case 7->System.out.println("sunday");
default->System.out.println("invalid day");
}
	}

}
