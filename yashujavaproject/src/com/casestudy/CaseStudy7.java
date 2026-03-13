package com.casestudy;

import java.util.Scanner;

public class CaseStudy7 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter no of items");
		 int item=sc.nextInt();
		 int arr[]=new int[item];
		 System.out.println("enter "+item+"item prices list");
		 for(int i=0;i<item;i++) {
			 arr[i]=sc.nextInt();
		 }
//display all prices
		 for(int a:arr) {
			 System.out.print(a+" ");
		 }
		 System.out.println();
//calculate bill,avg price
		 int bill=0;
		 int exp=arr[0];
		 int cheap=arr[0];
		 for(int a:arr) {
			 bill+=a;  
		 }
		 System.out.println("total bill:"+bill);
		  double avg=bill/item;
		  System.out.println("avg price:"+avg);
		  System.out.println("item cost above avg");
	 for(int a:arr) {
		  if(avg<a) {
		  System.out.print(a+" ");
		  }
	  }
	 System.out.println();
	 for(int i=0;i<item;i++) {
		  
		 if(arr[i]<cheap) {
			  System.out.println("cheapest item:"+(cheap=arr[i]));
		  }
		 
		 if(arr[i]>exp) {
			  System.out.println("expensive item:"+( exp=arr[i]));
		  }
		  
	 }
	sc.close();}

}
