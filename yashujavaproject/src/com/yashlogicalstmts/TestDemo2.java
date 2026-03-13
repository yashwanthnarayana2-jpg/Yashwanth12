package com.yashlogicalstmts;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int sum=0,count=0;
		for(int i=1;i<=100;i++) {
			count++;
			System.out.println(i);
			sum+=i;
		}
		System.out.println(sum);
		System.out.println(count);
		//System.out.println(i);
	}

}
