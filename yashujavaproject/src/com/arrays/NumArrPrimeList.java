package com.arrays;

import java.util.Scanner;

public class NumArrPrimeList {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         int[] arr=new int[size];
         for(int i=0;i<size;i++) {
        	 arr[i]=sc.nextInt();}
         for( int n:arr) {
        	 if(prime(n)) {
        		 System.out.print(n+ " ");
        	 }
         }   
	sc.close();}
	
	static boolean prime( int n) {
         
        	 if(n==0||n==1) {
        		 return false;
        	 }
        	 if(n==2) {
        		 return true;
        	 }
        	 if(n%2==0) {
        		 return false;
        	 }
        	 for(int i=3;i<n;i++) {
        		 if(n%i==0) {
        			 return false;
        		 }}
        	 

return true;}}
