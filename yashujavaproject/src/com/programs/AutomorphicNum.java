package com.programs;

import java.util.Scanner;

//automorphic num ->numsaquare lsb of num
//eg 5^2->25 5=5,6^2->36-6=6
public class AutomorphicNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");//
		int num = sc.nextInt();
		int t = num;
		int n = t;
		int pow = 1;
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		// System.out.println(count);
		int r = num * num;
		// System.out.println(r);
		for (; count > 0; count--)    // while(count>){ count--;}
		{
			pow *= 10;
			 
		}
		if (r % pow == num) {
			System.out.println("automorphic");}

		else {
			System.out.println(" not automorphic");
		}

		 
		sc.close();}
}