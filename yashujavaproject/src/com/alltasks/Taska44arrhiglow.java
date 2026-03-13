package com.alltasks;
//array high and low  num from  array
import java.util.Scanner;

public class Taska44arrhiglow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
		 }
		 for(int a:arr)
		 {
			 System.out.println(a);
			 
		 }
	sc.close();}

}
