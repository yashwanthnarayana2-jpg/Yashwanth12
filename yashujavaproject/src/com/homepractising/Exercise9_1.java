package com.homepractising;
import java.lang.Math;
public class Exercise9_1 {
	Exercise9_1(){
		System.out.println("no arg constructor");
	 
		 
	}
	static void show() {
		System.out.println("hello vcube");
		double d=3252627282.90672882822d;
		System.out.println(d*Math.PI);
		System.out.println(Math.pow(2,5));
		System.out.println(Math.abs(-25.2));
		System.out.println(Math.ceil(25.0));
		System.out.println(Math.round(25.6));
		System.out.println(Math.floor(24.9));
	}
	 static  strictfp void method() {
	double d=3252627282.90672882822d;
	System.out.println(d*Math.PI);
	System.out.println(Math.sqrt(25));
	 }

	 
	public static void main(String[] args) {
		 show();
		System.out.println();
		 method();
	}

}
