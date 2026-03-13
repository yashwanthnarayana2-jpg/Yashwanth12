package com.alltasks;
//ternary operator
import java.util.Scanner;

public class Taska34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks:");
		int a=sc.nextInt();
		 String s =((a>100 || a<0)?"invalid":
			       (a>=90 && a<=100)?"grade A":
		           (a>=80 && a<=90)?"grade B":
		    	       (a>=70 && a<=80)?"grade C":
		    	       (a>=50 && a<=70)?"grade D":
		    	       (a>=35 && a<=50)?"grade E":"fail");
		    	    	//   (a>=0 && a<=35)?"fail");invalid
		 System.out.println(s);
	sc.close();}

}
