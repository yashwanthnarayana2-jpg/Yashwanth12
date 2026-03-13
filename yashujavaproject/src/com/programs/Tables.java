package com.programs;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter table num");
		 int n=sc.nextInt();
		 System.out.println("up to 20's or 30's soon..");
		 int m=sc.nextInt();
		 for(int i=1;i<=m;i++) {
			 System.out.println(n+ " X " +i+  " = "+(n*i));
		 }

	sc.close();}

}
