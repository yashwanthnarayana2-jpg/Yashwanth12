package com.arrays;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int a : arr) {
			if (a % 2 == 0) {
				System.out.print(a);
				 }
			else {
			  count++;
			}
		}
		System.out.println();
		System.out.println("odd count:"+count);
	}
}
