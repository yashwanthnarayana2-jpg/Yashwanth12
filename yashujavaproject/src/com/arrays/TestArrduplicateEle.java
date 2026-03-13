package com.arrays;
//remove duplicates and print duplicates once
public class TestArrduplicateEle {

	public static void main(String[] args) {
		 int [] arr= {2,3,7,7,4,4,3,5,6,9,7};
		 
		 for(int i=0;i<arr.length;i++) {
			 boolean  flag=false;
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j]) {
					 flag=true;
					  break;
				 }
				  } 
			  
		 
		 if(flag) {
			 System.out.print(arr[i]+" ");
			  
		 }

	}}

}
