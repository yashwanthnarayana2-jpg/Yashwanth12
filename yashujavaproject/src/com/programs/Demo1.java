package com.programs;
//input:1231-->remove single 1
//123<231 criteria
//output:231

// 1313
public class Demo1 {

	public static void main(String[] args) {
		String s = "1231";
		String fr = "";
		int m = 0;
		char d = '1';

	 boolean  vist = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == d && !vist) {
				 vist=true;
			}

			else {
				fr = fr + s.charAt(i);
				  m=Integer.parseInt(fr);
			}

		}

		System.out.println(m);
	}

}
