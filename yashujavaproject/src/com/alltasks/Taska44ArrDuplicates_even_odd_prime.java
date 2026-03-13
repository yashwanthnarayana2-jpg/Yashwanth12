package com.alltasks;

import java.util.Scanner;

public class Taska44ArrDuplicates_even_odd_prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size = sc.nextInt();
		int num[] = new int[size];
//		int num1[] = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		int k = 0;
		for (int i = 0; i < size; i++) {
			boolean status = false;
			for (int j = i + 1; j < size; j++) {
				if (num[i] == num[j]) {
					status = true;
					break;
				}
			}
			if (!status) {
				num[k] = num[i];
				k++;
			}

		}
		System.out.println("unique number:");
		for (int i = 0; i < k; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("even number:");
		for(int i=0;i<k;i++) {
			if(num[i]%2==0) {
			System.out.print(num[i] + " ");}
		}
		System.out.println();
		System.out.println("odd numbers");
		for(int i=0;i<k;i++) {
			if(num[i]%2!=0) {
			System.out.print(num[i] + " ");}}
		System.out.println();
		System.out.println("prime numbers");
		 
		for(int i=0;i<k;i++) {
			int n=num[i];
		int	count=0;
		 if(n>1) {
			for(int j=2;j<n;j++) {
			if(n%j==0) {
				 count++;
			}  
			}
			 }
			if(count==0) {
				System.out.print(num[i]+" ");}}
		 
		sc.close();}

}
