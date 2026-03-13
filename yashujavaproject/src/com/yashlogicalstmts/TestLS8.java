package com.yashlogicalstmts;
//print days-month-year using month,year console
import java.util.Scanner;

public class TestLS8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter year:");
		 int year=sc.nextInt();
		 System.out.print("enter month:");
		 int month=sc.nextInt();
		 int days=0;
		 switch(month) {
	 
		 case 1,3,5,7,8,10,12 ->{
			days=31;
			  
			 }
		 case 2 ->{
			 if(year%4==0 && year%100!=0) {
				 days=29;
				  
			 }
			 else {
				 days=28;
			 }}
		 case 4,6,9,11->{
			 days=30;
			  
		 }
		 }
		 System.out.println(days+"-"+month+"-"+year);
		 sc.close();}
	}


