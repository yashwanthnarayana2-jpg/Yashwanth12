package com.arrays;

import java.util.Scanner;

///jagged array inside array
public class TestJaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int n[][] = new int[size][size];
		System.out.println("enter array elements of size "+size +"D :");
		for(int i=0;i<size;i++) { 
			for(int j=0;j<n[i].length;j++) { 
			n[i][j]=sc.nextInt();
		}}
		for(int i=0;i<size;i++) { 
			for(int j=0;j<n[i].length;j++) {
				sum=sum+n[i][j];	 
			}
			}
		System.out.print(sum); 
	sc.close();}}
