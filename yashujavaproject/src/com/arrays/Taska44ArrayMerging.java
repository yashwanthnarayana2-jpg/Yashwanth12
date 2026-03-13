package com.arrays;

//adding two arrays
public class Taska44ArrayMerging {

	public static void main(String[] args) {

		int n[] = { 1, 2, 3, 4 };
		int n1[] = { 5, 6, 7 };
		int m[] = new int [ n.length + n1.length ];
		int l=0;
		for (int i = 0; i <n.length; i++) {
			 m[i]=n[i];
			 l=i+1;}
			 for(int j=0;j<n1.length;j++) {
				 m[l]=n1[j];
				 l++;
			 } 
			 
			 for(int a:m)
			 System.out.print(a+" ");
		
	}

}
