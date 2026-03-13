package com.alltasks;

public class TaskaMatrixMultiplication {

	public static void main(String[] args) {
		int[][] m = { { 1, 2}, { 4, 5} };
		int[][] n = { { 6, 7}, { 8, 9}};
//		int[][] m = { { 1, 2,8 }, { 4, 5,9},{ 8, 9 ,7} };
//		int[][] n = { { 6, 7,8}, { 8, 9 ,7},{ 4, 5,9}};
		int res[][] = new int[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < n.length; j++) {
				for(int k=0;k<m[i].length;k++) {
					//System.out.print(m[i][k]+" ");
					System.out.print(n[j][k]+" ");
				res[i][j] += m[i][k] * n[k][j];
				  
				}
				//System.out.print(res[i][j] + " ");
			}
			 			System.out.println(); 
		}
	}

}
