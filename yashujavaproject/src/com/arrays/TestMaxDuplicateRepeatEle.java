package com.arrays;

public class TestMaxDuplicateRepeatEle {

	public static void main(String[] args) {
		
		 int arr[]= {1,1,2,2,3,4,5,6,1,1,1,1,1,2,1,1,1,1,1,1,1,12,2,2,2,2,2,22,2,2};
		 int res=arr[0];
		 int maxcount=0;
		 for(int i=0;i<arr.length;i++) {
			 int count=1;
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j]) {
					 count++;
				 } 
				 if(count>maxcount) {
					 maxcount=count;
					 res=arr[j];
				 }
				 
			 }	  
		 } 
		 System.out.println(res);
	}

}
