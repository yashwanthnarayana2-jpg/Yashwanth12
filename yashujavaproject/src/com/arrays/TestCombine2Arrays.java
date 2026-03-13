package com.arrays;
// 2arrays into single array
public class TestCombine2Arrays {

	public static void main(String[] args) {
		 String [] str1= {"10","20","30","40","50"};
		 String [] str2= {"60","70","80","90","100"};
		 String str[]=new String[ str1.length+str2.length];
		 // insert values in str
		 for(int i=0;i<str1.length;i++) {
			 str[i]=str1[i];
		 }
		 for(int i=0;i<str2.length;i++) {
			 str[str1.length+i]=str2[i];
		 }
		 for(int i=0;i<str.length;i++) {
		 System.out.print( str[i]+" ");
	 }
// for(String st1:str)
//	 System.out.println(st1);
}}
