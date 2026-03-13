package com.arrays;
//pascal triangle using 2D-array
//formula 2D Array :arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
//formula 1D Array: arr[j]=arr[j]+arr[j-1];
public class PascalTriangle {

	public static void main(String[] args) {
		System.out.println("main stared:");
		int n=6;
		int a[][] = new int[n][n];

		for (int i = 0; i <n; i++) {
			a[0][i]=1;
			a[i][i]=1;
			for (int j = 1; j <i; j++) {
				  a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
		}
		for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+a[i][j] + "  ");
            }
            System.out.println();
        }
	}
}
