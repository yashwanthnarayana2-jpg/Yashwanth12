package com.alltasks;
//stock market->lowest buying day ,highest selling day
//(low profit day ,hi profit day)
public class TaskaArrStockMarket {

	public static void main(String[] args) {

		int p = 0, s = 0, e = 0;
		int stock[] = { 10, 2, 3, 13, 27, 96 };
		for (int i = 0; i < stock.length; i++) {
			for (int j = i + 1; j < stock.length; j++) {
				int stockDiff = stock[j] - stock[i];
				 
				if (p < stockDiff) {
					p = stockDiff;
					s = i;
					e = j;
				}

			}
		}
		System.out.println("stock buy day:" + s);
		System.out.println("stock sell day:" + e);
	}

}
