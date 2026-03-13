package com.alltasks;
//alternate prime numbers
public class Taska40altPrime {

	static boolean isprime(int a) {
		if (a == 0 || a == 1)
			return false;
		if (a == 2)
			return true;
		if (a % 2 == 0)
			return false;
		for (int i = 3; i < a; i++) {
			if (a % i == 0)
				return false;

		}
		return true;
	}

	public static void main(String[] args) {
		int count=0;

		for (int i = 0; i <= 50; i++) {
			if (isprime(i)) {
                   count++;
                   if(count%2!=0) 
				System.out.println(i);
			}

		}

	}

}
