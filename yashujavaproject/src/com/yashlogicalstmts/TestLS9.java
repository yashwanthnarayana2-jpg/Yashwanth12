package com.yashlogicalstmts;

import java.util.Scanner;
 
import java.time.LocalDate;
public class TestLS9 {
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter today date yyyy-mm-dd:");
	   LocalDate today =LocalDate.parse(sc.next());
	   //LocalDate ny= LocalDate.of(2026,01,01);
		 String s="HAPPY NEW YEAR";
		 if(today.getDayOfMonth()==1&&today.getMonthValue()==1)
		 {
		 System.out.println(s);}
		 else {
			 System.out.println("not new year");
		 }
		  
		 
		   
		  
		  
 
sc.close();}}
