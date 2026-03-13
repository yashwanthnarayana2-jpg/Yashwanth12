package com.alltasks;

public class Taska44arrEvenindex {

	public static void main(String[] args) {
		 int [] arr= {2,3,4,6,7,8,9,10};
  
	 for(int i=0;i<arr.length;i++) {
		if( arr[i]%2==0) {
			System.out.println("even index:" +arr[i]+" ");
			
		}}
	 System.out.println();
		for(int a:arr) {
			if(a%2!=0) {
				System.out.println("odd index: "+a+" ");
				 
			}
		}
			  
	 }
 }
	


