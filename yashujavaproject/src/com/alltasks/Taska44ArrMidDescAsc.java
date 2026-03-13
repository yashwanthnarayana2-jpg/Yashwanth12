package com.alltasks;

//import java.util.Arrays;

//Input arr [5,9,10,11,5,6,1]
//Output arr [10,9,5,1,6,5,11]
public class Taska44ArrMidDescAsc {

	public static void main(String[] args) {
		int num[] = { 5, 9, 10, 11, 5, 6, 1 };
		int mid = num.length / 2;

		for (int i = 0; i < mid; i++) {
			for (int j = i + 1; j < mid; j++) {
				if (num[i] < num[j]) {
					int t = num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
			System.out.print(num[i]+" ");
		}
		for (int i = mid; i <num.length; i++) {
			for (int j = i + 1; j<num.length; j++) {
				if (num[i]  > num[j]) {
					int t = num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
			System.out.print(num[i]+" ");
		}
		
		 

	}
}
