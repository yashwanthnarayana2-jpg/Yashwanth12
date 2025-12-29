package com.yashlogicalstmts;
//uppercase,lowercase,digit 
import java.util.Scanner;

public class TestLS1 {

	public static void main(String[] args) { 
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any character");
        char c=sc.next().charAt(0);
		if( Character.isUpperCase(c)) {
			System.out.println("uppercase");
		}
		else if(Character.isLowerCase(c)){
			System.out.println(" Lowercase");
		}
		else if(Character.isDigit(c))
		{
			System.out.println("not spl character");
		 
	}
		else {
			System.out.println("spl character");
		}
		 System.out.println((c>='A'&& c<='Z')?"upperCase":"no");
		 System.out.println((c>='a'&& c<='z')?"lower":"no");
  System.out.println(c>='A'&& c<='Z'?c>='a'&& c<='z'?c>=0 &&c<=9:"not spl ":"spl");
sc.close();		 
}
	}
