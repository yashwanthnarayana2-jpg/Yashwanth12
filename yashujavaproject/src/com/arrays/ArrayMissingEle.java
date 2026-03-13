package com.arrays;

public class ArrayMissingEle {

	public static void main(String[] args) {
		 int arr[]= {1,10,12};
		 for(int i=0;i<arr.length-1;i++) {
				 int diff=arr[i+1]-arr[i];
			 if(diff>1) {
				 for (int j = arr[i] + 1; j < arr[i+1]; j++) {
	                    System.out.print(j + " ");
	                }
				  
			 }
		 }
	}

}
