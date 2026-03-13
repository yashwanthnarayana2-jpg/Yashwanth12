package com.alltasks;
//90 degree rotate of matrix
//1.transpose of matrix
//2.reverse of every row
public class TaskaTransposeReverseMatrix {

	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] res = new int[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				res[i][j] = m[j][i];
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = m[i].length - 1; j >= 0; j--) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}

	}

}
