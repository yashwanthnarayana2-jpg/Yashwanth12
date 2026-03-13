package com.arrays;

import java.util.Scanner;

public class Test2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int n[][] = new int[size][size];
		for(int i=0;i<size;i++) { 
			for(int j=0;j<n[i].length;j++) { 
			n[i][j]=sc.nextInt();
		}}
		 
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j]+" ");
			}
		}
		sc.close();
	}
}