package com.homepractising;

import java.util.Scanner;

public class CheckedException2 {

	public static void main(String[] args) throws CustomizeException,CException {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter number");
     int a =sc.nextInt();
     if(a>0){
    	 System.out.println("positive num");
     }
     else {
    	 ex();
    	 throw new CException();
    	 } 
    }

	private static void ex() throws CustomizeException {
		throw new CustomizeException();
		  
	}
    }
