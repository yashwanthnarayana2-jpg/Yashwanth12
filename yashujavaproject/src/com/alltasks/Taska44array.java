package com.alltasks;

import java.util.Scanner;

public class Taska44array {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println(" enter size of array");
		 int n=sc.nextInt();
		 int[] arr=new int[n];
		 System.out.println(" enter list numbers");
		 for (int i=0;i<n;i++) {
			  
			   arr[i]=sc.nextInt();
		 }
		 
		 for(int a:arr) {
			 //System.out.println( a);
			 
			 if(a%2==0)
				 System.out.println(a);
			
		 }
	sc.close();}

}
