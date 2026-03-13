package com.arrays;

//based on target value pair elemnets in array
import java.util.Scanner;

public class AlgoBurteforce {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter Target Value:");
		int Tv = sc.nextInt();
		int[] n = { 2, 3, 4, 1, 5, -8, 3, 2, -9, 4, 1 };
		boolean b[] = new boolean[n.length];
        
         
		for (int i = 0; i < n.length; i++) {
			if (b[i]) {continue;}
			int k=0; 
			boolean pair = false;
			for (int j = i + 1; j < n.length; j++) {
				 
				if (!b[j] && n[i] + n[j] == Tv) {
					k=n[j];
					pair=true;					
					b[i] = true;
					b[j] = true;
					 				 
				}
				 
			}if(pair) {
			System.out.println(n[i]+" "+k);}
		}

		sc.close();
	}

}
