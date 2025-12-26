package com.homepractising;
import java.util.Scanner;
public class New {
	 static Scanner sc=new Scanner(System.in);
	static void change (String s) {
		s=s+"youth";
		
	}
	static void change(int x)
	{
		//int x=x+5;
	}
	static void metho(String s,int x)
	{
		//String s=s+"hello";//invalid 
		//int x=x+9;//invalid
		s+=" World"; 
		x+=10;
		System.out.println(s);
		System.out.println(x);
		System.out.println("************************");
		metho(x,x);
	}
	static void metho(int a,int b)
	{
		System.out.println(a++ + a++);//a++=10,//++a=11
		System.out.println(++b + b++);//11,11
	}
	public static void main(String[] args) {
		String s="fashion";
		change(s);
		System.out.println(s);
		int x=10;
		change(x);
		System.out.println(x);
		 System.out.print("enter any number:");
		 int i=sc.nextInt();
		 System.out.print("enter any word:");
		 String s1=sc.next();
		 metho(s1,i);
		  
		  
		 
	}
}
