package com.homepractising;
//char with all numbers(byte,short,int,long,float)

public class Exercise3_1 {

	public static void main(String[] args) {
		char c = 300;
		byte b = (byte)(c);
		short s=(short)(c);
		int i=(int)(c);
		long l=(long)(c);
		float f=(float)(c);
		System.out.println(b+","+s+","+i+","+l+","+f);
		
		char c1=65535;
		byte b1=(byte)(c1);
		System.out.println(b1);
		
		
	     char c2= 'A';
		 System.out.println((int)c2);
	}

}
