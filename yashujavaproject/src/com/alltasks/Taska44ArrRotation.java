package com.alltasks;

import java.util.Scanner;

public class Taska44ArrRotation {
	
	
	static void leftRotation(int arr[],int r) {
		for (int j = 0; j < r; j++) {
			int s = arr[0];
			for (int i = 0; i < arr.length-1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length-1 ] = s;

		}
	}
	static void rightRotation(int arr[],int r) {
		 
		for (int j = 0; j < r; j++) {
			int last = arr[arr.length-1 ] ;
			for (int i =arr.length-1; i>0; i--) {
				arr[i] = arr[i-1];
			}
			 arr[0] = last;

		}
	}
	static void reverse(int arr[]) {
		int t;
		int st=0;
		int end=arr.length-1;
		  
		while(st<end) {
			t=arr[st];
			arr[st]=arr[end];
			arr[end]=t;
			st++;
			end--;
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("rotation position num:");
		int r = sc.nextInt();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(arr.length);
		System.out.println("left rotation");
		leftRotation(arr,r);
		for (int a : arr) {
			System.out.print(a + " ");
		}
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println();
		System.out.println("right rotation");
		rightRotation(arr1,r);
		for (int a : arr1) {
			System.out.print(a + " ");
		}
		int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println();
		System.out.println("reverse");
		reverse(arr2);
		for (int a : arr2) {
			System.out.print(a + " ");
		}
		sc.close();
	}

}
