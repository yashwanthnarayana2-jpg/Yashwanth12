package com.homepractising;

import java.util.Scanner;
//IndexOutOfBoundExceptions
public class UncheckedException2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		System.out.println("enter position array");
		 int i=sc.nextInt();
		 String s="Yashwanth";
		try {
			int a=arr[i];
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		try {
			s.charAt(i);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}

}
