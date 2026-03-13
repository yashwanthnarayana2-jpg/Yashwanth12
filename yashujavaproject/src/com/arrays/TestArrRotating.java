package com.arrays;

import java.util.Scanner;

public class TestArrRotating {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter rotate position");
		int r=sc.nextInt();
		 int [] arr= {1,2,3,3,4,5,6};
		 int start;
		 for(int i=0;i<r;i++) {
			start=arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			 arr[arr.length-1]=start;
			 
		 }
for(int a:arr) {
	System.out.print(a+" ");
}
	}

}
