package com.yashlogicalstmts;
//-ve and +ve num check ,greater of two num
import java.util.Scanner;

public class TestLS2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any number:");
		int a=sc.nextInt();
		//positive or negative
if(a>0) {
	System.out.println("positive");
	}
else if(a>0){
	System.out.println("negative");
}
else {
	System.out.println("zero");
}
//graeter b-w two
System.out.println("*************");
System.out.print("enter any number:");
int b=sc.nextInt();
if(a>b) {
	System.out.println(a+"greater");
}
else if(a<b) {
	System.out.println(b+"greater");
}
else {
	System.out.println("equal");
}
sc.close();
}}