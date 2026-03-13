package com.yashoperators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//2m,intialp123,mp78,mp130,m1b10,m2b0
class Mon {
	int p;
	int b;
	int po;
	Mon(int p,int b){
		this.p=p;
		this.b=b;
		 
	}	 
}

public class Demo2 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int exp=sc.nextInt();
		 int [] p=new int[n];
		 int [] b=new int[n];
		 // power
		 for(int i=0;i<n;i++) {
			 p[i]=sc.nextInt();
		 }
		 //bonus
		 for(int i=0;i<n;i++) {
			 b[i]=sc.nextInt();
		 }
		 
	Mon [] m=new Mon[n];
	for(int i=0;i<n;i++) {
		m[i]=new Mon(p[i],b[i]);
		
	}
	Arrays.sort(m,Comparator.comparingInt(mon->mon.p));
	int count = 0;
    for (Mon ms : m) {
        if (exp < ms.p) break;
        exp += ms.b;
        count++;
    }

    System.out.println(count);
	
	}
		 
	}

		

