package com.yashlogicalstmts;
//leap or not
import java.util.Scanner;

public class TestLS5 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("enter a value:");
		 int a=sc.nextInt();
//		 System.out.print("enter a value:");
//		 int b=sc.nextInt();
		 if((a%400==0||a%4==0&&a%100!=0) ){
			 
			 System.out.print("leap year");
		 }
		 else {
			 System.out.print("not leap");
		 }
		  
	sc.close();} 

}
