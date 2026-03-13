package com.alltasks;
//check isprime 
public class Taska39Prime {
	static boolean isprime(int a) {
		if(a==0||a==1) return false;
		if(a==2) return true;
		if(a%2==0) return false;
		for(int i=3;i<a;i++) {
			if(a%i==0)return false;
			 
		}
	return true;}

	public static void main(String[] args) {
		 
		 for(int i=0;i<=50;i++) {
			  if(isprime(i)) {
				 
				 System.out.println(i);
			  }
			  
		 }
		  
	}

}
