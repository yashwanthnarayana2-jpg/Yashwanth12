package com.alltasks;

//compare lastdigit of array and greater than lastdigitvalue then sort 
public class Taska44Compre_lastdigitodArr_swapnum {

	public static void main(String[] args) {
		int t;
		int num[] = { 19,8,27,26,25 };
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
					 int a=num[i]%10;
					 int b=num[j]%10;
					 if(a>b) {
						 t=num[i];
						 num[i]=num[j];
						 num[j]=t; 
				 }
				
				 
			}
			System.out.print(num[i]+" ");	 
		}
		

	}
}
