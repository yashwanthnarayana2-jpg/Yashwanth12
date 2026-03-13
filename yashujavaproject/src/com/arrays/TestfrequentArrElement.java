package com.arrays;

import java.util.Scanner;

//frequency of each element count
public class TestfrequentArrElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int m = sc.nextInt();
		int n[] = new int[m];
		boolean[] vist = new boolean[m];
		// user array elements
		for (int i = 0; i < m; i++) {
			n[i] = sc.nextInt();
		}
		// frequency count
		for (int i = 0; i < m; i++) {
			int count = 0;
			if (vist[i]) {
				continue;
			}
			//int count = 1;
			for (int j = 0; j < m; j++) {
				if (n[i] == n[j]) {
					count++;
					vist[j] = true;
					 
				}
			}

			System.out.println(n[i]+" occurance: "+count + " times");
		}

	sc.close();}
}
