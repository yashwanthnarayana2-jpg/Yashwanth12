package com.arrays;
import java.util.Scanner;
//array maxi,mini element
public class NumArrMaxMin {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("main method");
		 int [] num= {2,3,4,5,9,11,78};
		 int max=num[0];
		int min=num[0];
		 for(int i=0;i<num.length;i++) {
			 if(num[i]<min) 
			 {
				 min=num[i];
			 }  
			 
			 if(num[i]>max) 
			 {
				 max=num[i]; 
			 }  
			  
		 }
		 System.out.println(min);
		 System.out.println(max); 
		   
	sc.close();}

}
