package com.alltasks;
//fibonacci series
import java.util.Scanner;

public class Taska41fibonacci {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int a=0,b=1;
		 
		 for(int i=1;i<21;i++) {
			  System.out.println(a);
			int temp=a;    //int c=0;
			a=b;           //c=a+b;
			b=temp+b;      //a=b;//b=c; 
				 
		 }
	}

}
