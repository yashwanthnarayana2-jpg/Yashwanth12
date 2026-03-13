package com.homepractising;

import java.util.Scanner;

public class Exercisea14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 boolean b=false;
		 do {
			 System.out.println("heyyy");
			 System.out.println("enter any item");
			 b=sc.next().equalsIgnoreCase("yes");
			 
		 }while(b==true);
	}

}
