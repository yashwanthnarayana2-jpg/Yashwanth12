package com.yashlogicalstmts;

import java.util.Scanner;

//to nth prime number
public class TestDemo3 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int count=0;
		 if(n==1){System.out.println("2");
		 }
		 if(n==2) {System.out.println("3");
			 }
		 for(int i=3;i<1000;i++) {
			 if(i%2!=0) {  
		 for(int j=3;j<i;j++)
		 {
			 if(i%j!=0) {
				  count++;
				   }
		 
			 }
		 }
			 //if(temp==i) {System.out.println("prime");}
		 
		 }
		 System.out.println(count+" ");
	sc.close();}

}
