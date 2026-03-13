package com.yashlogicalstmts;

import java.util.Scanner;

//reverze of num
public class TestDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		revmethod(n);
		String s=sc.next();
		 revstrmetho(s);
		
	}
	static void revmethod(int n) {
		int rev=0,sum=0;
		for(;n>0;n/=10)
	    {
	    rev=rev*10+n%10;
	    //sum+=n%10;
	    if(n==rev) {
	    	System.out.println("palindrome");
	    }
	    else
	    	{
	    	System.out.println(" not palindrome");
	    	}
	    }
	    System.out.println(rev);
	    System.out.println(sum);
	}
	static void revstrmetho(String s) {
		String str="";
	 for(int i=s.length()-1;i>=0;i--) {
		 str=str+s.charAt(i);
		 if(s.equals(str)) {
			 System.out.println("palindhrome");
		 }
		 else{
			 System.out.println(" not palindrome string");
		 }
	 }
		System.out.println(str);
}
}
