package com.alltasks;
import java.util.Scanner;
//temp conversion f<-->c
public class Taska11 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any value");
		int farenheit = sc.nextInt(); 
		 double celcius=((farenheit-32)*5/9);
		 System.out.println( "farenheit to celcius:"+celcius+"C");
		 double resfarenheit =((celcius*9/5)+32);
		 System.out.println( "celcius to farenheit:" +resfarenheit+"F");
		 
	}

}
