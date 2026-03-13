package com.arrays;

//sort only even elements
public class NumSortEvenElements {

	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 4, 5, 6, 7, 8,9,10 };
		int t = 0;
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length - 1; j++) {
				if (n[j] % 2 == 0) {
					if (n[j] < n[j + 1]) {
						t = n[j];
						n[j] = n[j + 1];
						n[j + 1] = t;
					}
				}
			}
		 }
		 for(int x:n) {
			 System.out.print(x+" ");
		 }
	}

}
