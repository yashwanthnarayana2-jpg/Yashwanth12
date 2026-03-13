package com.alltasks;
//addition of matrix
public class TaskaMatrixAdd {

	public static void main(String[] args) {
		int[][] m = { { 1, 2 },
				      { 4, 5 } };
		
		int[][] n = { { 6, 7 },
				      { 8, 9 } };
		int[][]res=new int[2][2];
    for(int i=0;i<m.length;i++) {
	for(int j=0;j<m[i].length;j++) {
			   res[i][j]=m[i][j]+n[i][j];
		System.out.print(res[i][j]+" ");
	}
	System.out.println();
	}

}}
