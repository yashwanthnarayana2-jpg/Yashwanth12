package com.alltasks;

import java.util.Scanner;

//122334 sum of digit
public class Taska38 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("main started");
		System.out.println("enter number");
         int a=sc.nextInt();
         int sum=0;
         int count=0;
//         int b=(a/100)%100;
//         int c=(a/10)%10;
//         int d=(a/1)%10;
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(d);
       for(;a>0; a=a/10) {
    	      
        	sum+=a%10;
      
    	   count++;
       }
        
        System.out.println(sum);
        System.out.println(count);
	}

	
}
