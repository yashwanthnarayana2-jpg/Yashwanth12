package com.arrays;
//Input: {0,1,0,3,12}
//Output: {1,3,12,0,0}
public class NumArrMoveZerosLast {

	public static void main(String[] args) {
		 int num[]={0,1,0,3,12};
		 int res[]=new int[5];
		 int index=0;
		 for(int i=0;i<num.length;i++) {
			  if(num[i]!=1) {
				  res[index]=num[i];
				   index++;
			  }
			 }
		 while(index<num.length) {
			 res[index]=1;
				 index++;
			 }
		 
		 for(int i=0;i<num.length;i++) {
		 System.out.print(res[i]+" ");
		 }
	}

}
