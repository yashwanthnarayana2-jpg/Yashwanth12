package com.arrays;

public class AlgoSelectionSort {

	public static void main(String[] args) {
		 int n[]= {2,5,7,9,8,20,67};
		 int mid,t;
		 for(int i=0;i<n.length;i++)
		 { boolean status =false; 
			 mid=i;
			for(int j=i+1;j<n.length;j++)  {
				if(n[mid]>n[j]) {
					 mid=j; 
				}}
				t=n[i];
				 n[i]=n[mid];
				 n[mid]=t;
				status=true;
			
		 if(!status) {
			 break;
		 }}
		 for(int a:n) {
			 System.out.print(a+" ");
		 }
	}

}
