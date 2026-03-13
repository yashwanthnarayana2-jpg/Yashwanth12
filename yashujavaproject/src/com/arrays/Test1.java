package com.arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//declaration of array and creation
		 int [] arr=new int[5];
		 String [] a1=new String[3];
		 float [] a2=new float[2];
		 char [] a3=new char[2];
		 boolean [] a4=new boolean [2];
		 BigInteger [] big=new BigInteger[1000000000];
		 //initialise
		 arr[0]=10; arr[1]=20; arr[2]=10; arr[3]=40; arr[4]=60;
		 a1[0]="yashu"; a1[1]="bru"; a1[2]="akp";  
		 a2[0]=2.2f; a2[1]=2123456.20946886f; 
		 a4[0]=true; a4[1]=false; 
		 a3[0]='A';a3[0]='b';a3[1]='B';
		 for(int i:arr)
			 System.out.println(i);
		 for(int i=0;i<a2.length;i++)
			 System.out.println(a2[i]);
		 for (String i:a1)
			 System.out.println(i);
		 for(char i:a3)
			 System.out.println((char)i);
		 //for(BigInteger b:big)
			// System.out.println(b);
	sc.close();}

}
