package com.programs;
//decimal <--> binary
import java.util.Scanner;

public class NumConDec_Bin{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		metho(n);
		//metho1("1010");
		 meth(2,-3);
	sc.close();}

	// dec->bin
	static void metho(int n) {
		int r = 0;
		String bin = "";
		while (n != 0) {
			r = n % 2;
			n = n / 2;
			bin = r + bin;
		}
		System.out.println(bin);
		 
		metho1(bin);

	}
//bin->dec
	static void metho1(String bin2) {
		 
		int r;
		double dec = 0;
		int count = 0;
		int a = Integer.parseInt(bin2);
		while (a != 0) {
			r = a % 10;
			dec = dec + r * (Math.pow(2,count));
			a = a / 10;
			count++;
		}
		System.out.println(dec);

	}
	//power of numbers
	static void meth(double base,int pow) {
		 double r=1;
		int p=pow;
		if(p<0) {
			p=-pow;
		}
		for(int i=1;i<=pow;i++)
		{
		r*=base;
		}
		System.out.println(r); 
	}
	
}
