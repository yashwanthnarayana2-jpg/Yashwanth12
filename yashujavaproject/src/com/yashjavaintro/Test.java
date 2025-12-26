package com.yashjavaintro;

public class Test {
	int a= 10;
	{
		System.out.println("instance block="+a);
		a=20;
	}

	public static void main(String[] args) {
		 Test t = new Test ();
		 System.out.println(t.a);
	}

}
