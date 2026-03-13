package com.alltasks;
//every array elements reverse 
//1000->0001
public class Taska44arrelerev {

	public static void main(String[] args) {
		 String str[]= {"1100","1101","0001","1001","1010","1000"};
		 
		 for(int i=0;i<str.length;i++) {
			 String rev="";
			 for(int j=str[i].length()-1;j>=0;j--) {
				 rev=rev+str[i].charAt(j);
			  }
			str[i]=rev; 
			  
		 }
		 for(String st:str ) {
			 System.out.print(st+" ");
	}}

}
