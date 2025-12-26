package com.alltasks;

import java.util.Scanner;

public class Taska32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter student marks:");
		int marks =sc.nextInt();
		System.out.println(marks>40?"pass":"fail");
		//scholarship
		System.out.print("enter student percentage:");
		int percentage=sc.nextInt();
		System.out.print("enter student score:");
		int score=sc.nextInt();
		 
		 if(percentage>=75&&score>=50)
		 {
			 System.out.println("eligible for scholarship");
		 }
		 else {
		 System.out.println("not eligible for scholarship");
		 }
		 sc.close();
	}

}
