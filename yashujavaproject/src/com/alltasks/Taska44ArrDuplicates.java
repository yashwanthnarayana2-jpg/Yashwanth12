package com.alltasks;

import java.util.Scanner;

public class Taska44ArrDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.println("enter size of array:");
		int size = sc.nextInt();
		int n[] = new int[size];
		for (int i = 0; i < size; i++) {
			n[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			count = 1;
			for (int j = i + 1; j < size; j++) {

				if (n[i] == n[j]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println("occurance of " + n[i] + " is " + count);
			}
			else {
				System.out.println("unique:"+n[i]);
				}

		}

		sc.close();
	}
}