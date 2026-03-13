package com.programs;
//to print Sum of square digit
//123->1^2+2^2+3^2+4^2=30
import java.util.Scanner;

public class SumOfSquareDigit {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int sum=0;
		 int x=sc.nextInt();
		 while(x>0) {
			 int r=x%10;
			 x/=10;
			sum=sum+r*r; 
		 }
		 System.out.println(sum);
	}

}
