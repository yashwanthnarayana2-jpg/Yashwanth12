package com.casestudy;

//Stock market
public class CaseStudy8 {

	public static void main(String[] args) {
		System.out.println("main method started:");
		//System.out.println("reverse");
		int total = 0;
		int avg = 0;

		int stock[] = { 1, 4, 6, 7, 9, 20, 78, 90 };
		int stlength = stock.length;
		int maxstock = stock[0];
		int minstock = stock[0];
		// method(stock);
		for (int i = 0; i < stock.length; i++) {
			// minstock
			if (stock[i] < minstock) {
				minstock = stock[i];
			}

			// maxstock
			if (stock[i] > maxstock) {
				maxstock = stock[i];
			}
			// total avg
			total += stock[i];
			avg = total / stlength;
			System.out.print(stock[i] + " ");

		}
		System.out.println();
		System.out.println("maximum:" + maxstock);
		System.out.println("ministock:" + minstock);
		System.out.println("total:" + total);
		System.out.println("avg of days:" + avg);
		System.out.println("below avg days:");
		for (int i = 0; i < stock.length; i++) {
			// int belowavg;
			if (stock[i] < avg) {
				// belowavg = avg;
				System.out.print(i + " ");
			}

		}

		System.out.println();
		System.out.println("reverse");
		//reverse of array
		for (int i = stlength - 1; i >= 0; i--) {
			System.out.print(stock[i] + " ");
		}
	}

//	static void method(int stock[]) {
//		int s = 0;
//		int e = stock.length - 1;
//		while (s < e) {
//			int t = stock[s];
//			stock[s] = stock[e];
//			stock[e] = t;
//			s++;
//			e--;
//		}
}
