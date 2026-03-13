package com.arrays;

//second highest and second lowest
public class NumArrSecondhighest {
	static void sechigh(int n[]) {
		int max = n[0];
		int secmax = n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i] > max) {
				secmax = max;
				max = n[i];
			} else if (n[i] > secmax && n[i] < max)
				secmax = n[i];

		}
		System.out.println("second highest:" + secmax);

	}
	static void seclow(int n[]) {
		int min = n[0];
		int secmin = n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i] < min) {
				secmin = min;
				min = n[i];
			} else if (n[i] < secmin && n[i] > min)
				secmin = n[i];

		}
		System.out.println("second lowest:" + secmin);

	}
	public static void main(String[] args) {

		int n[] = {2,7,4,8,1,4,3,4,5,9,7,};
		sechigh(n);
		seclow(n);

	}

}
