package com.arrays;
//sum and avg of 1D array
import java.util.Scanner;

public class NumSumofArrayD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);
		double avg = (sum / size);
		System.out.println(avg);
		sc.close();
	}

}
