package com.homepractising;
 
import java.util.Scanner;

public class CheckedException1 {

	public static void main(String[] args)   {
		 Scanner sc=new Scanner(System.in);
		 
// compiler we cnt write checked Exceptions directly without Exception
//        catch(IOException e) {
//	
//         }
		 System.out.println("enter number a");
		 int a=sc.nextInt();
		 System.out.println("enter number b");
		 int b=sc.nextInt();
		  if(b!=0) {
			  System.out.println(a/b);
		  }
		  else {
			  throw new ArithmeticException("with zero not possible");
		  }
	}
	

}
