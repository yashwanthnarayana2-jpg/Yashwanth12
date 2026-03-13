package com.yashlogicalstmts;
//pattern based programs lfornum 1
public class LforPatterns {

	public static void main(String[] args) {
		 int n=6;
		  //y letter 
		  for(int i=0;i<n;i++) {
			  for(int j=0;j<n;j++) {
		  if((j==i&&i<2)||(j==5-i&&i<=5)) 
				  {
				   System.out.print(" *");}
				  else {
					  System.out.print(" ");
				  }
			  }
			  System.out.println();
}
		  
		  
		  System.out.print(" ");
		  //A
		  for(int i=0;i<n;i++) {
			  for(int j=0;j<n;j++) {
				  if(i==j) {
					  System.out.print("*");}
				  else {
					  System.out.print(" ");
				  }
			  }
			  System.out.print( "");
		  }
		  
		  }}