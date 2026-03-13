package com.programs;
// number based programs lfornum 1
//1.rev number
import java.util.Scanner;

public class  ReverseNum {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt(); 
		 int r=0,s=0;
       while(n>0) {          //for(;n>0;){r=n%10; n/=10; s=s*10+r;}-->sum    
    	   r=n%10;
    	   n/=10;
    	   s=s*10+r;//sum         
       }                   
			System.out.println(s); 
	sc.close();}

}
