package com.alltasks;
//array leader elements from array list
public class Taska44ArrLeader {

	public static void main(String[] args) {
		 int[] arr= {13,2,8,4,5,1,0,90};
		 int n=arr.length-1;
		  for(int i=0;i<=n;i++) {
			  if(i==n||arr[i]>arr[i+1]) {
				  System.out.print(arr[i]+" ");
			  }
		  }
		  
	}

}
