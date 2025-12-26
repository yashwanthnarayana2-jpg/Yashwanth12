package com.alltasks;
//no return ,args
public class Taska13 {
	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		 sub(a,c);
	}
	static void  sub(int c, int b)
	{
		int d=b-c;
		System.out.println(d);
		multiply(c,d);
	}
	static void  multiply(int d, int b)
	{
		int f=d*b;
		System.out.println(f);
		divide(d,f);
	}
	static void divide(int f, int b)
	{
		int e= f/b;
		System.out.println(e);
	}
	 
	public static void main(String[] args) {
	 
		 add(7,9);
	}

}
