package com.yashlogicalstmts;

import java.util.Scanner;
//vowel check 
public class TestLS4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any characater:");
		 char c=sc.next().charAt(0);
		  
		 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'
				 ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
		
			 System.out.println("is vowel");
	}
		 else{
			  System.out.println("is constant");
		 }
sc.close();	}

}
