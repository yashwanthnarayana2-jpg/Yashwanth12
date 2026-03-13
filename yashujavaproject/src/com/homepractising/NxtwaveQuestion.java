package com.homepractising;

import java.util.Scanner;

public class NxtwaveQuestion {

	public static void main(String[] args) {
		System.out.println("main ");
		Scanner sc = new Scanner(System.in);
		int upperLimit = sc.nextInt();
		int divisor = sc.nextInt();
        
		int count = 0;
		for (int sum = divisor; sum <= upperLimit; sum += divisor) {
			
		    count = (sum - 1) / 2;
		    
		}
	
		System.out.println(count/2);
	
		
		sc.close();
	}
}