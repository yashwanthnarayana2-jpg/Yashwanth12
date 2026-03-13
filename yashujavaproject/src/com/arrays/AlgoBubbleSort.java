package com.arrays;

//bubble sort sorting adjacent elements
public class AlgoBubbleSort {

	public static void main(String[] args) {
		System.out.println("main started!!");
		int arr[] = {1,2,2,3,4,4,5,7,5};
		int t = 0;
		//for (int i = 0; i < arr.length; i++) {
			 System.out.println(arr.length-1);
			for (int j = 0; j < arr.length-1; j++) {
				boolean flag =false;
				if (arr[j] > arr[j + 1]) {
					t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
              flag =true;
			//}
			if(!flag) {
				break;
			}
		}
		for (int x : arr) {
			System.out.print(x+" ");
		}
	}

}
