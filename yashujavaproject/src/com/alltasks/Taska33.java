package com.alltasks;

import java.util.Scanner;

public class Taska33 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter any number of a");
		 int a=sc.nextInt();
		 System.out.println("enter any number of b");
		 int b=sc.nextInt();
		 System.out.println("enter any number of c");
		 int c=sc.nextInt();
		 a=a^b^c;
		 b=a^b^c;
		 a=a^b^c;
		 System.out.println("after swap");
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 
		 
		 sc.close();
	}

}
