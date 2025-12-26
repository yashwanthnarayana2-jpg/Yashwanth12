package com.homepractising;
//22/11 exam
public class Exercise3 {

	public static void main(String[] args) {
		char c = 'A';
		System.out.println(c+1);//66
		System.out.println((char) (c + 1));//B
		System.out.println("*******************");
		
		char c1 = 300;
		byte b1 = (byte)(c1);
		System.out.println(b1);//44
	    System.out.println("*******************");
		 
		int a='5';
		char cc='5';
		System.out.println(a);
		System.out.println(cc);
		System.out.println("*******************");
		
		boolean b = true;
		//boolean bb = 1; error
		System.out.println(!b == false);
		 
	}

}
