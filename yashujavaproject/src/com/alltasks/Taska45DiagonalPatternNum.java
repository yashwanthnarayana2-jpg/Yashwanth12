package com.alltasks;
//    1        1               1           1
//      2    2                    2     2
//        3                          3
//     4     4                    2     2
//   5          5              1           1

public class Taska45DiagonalPatternNum {

	public static void main(String[] args) {
		 int n=5;
		 for(int i=1 ;i<=n;i++) {
			 for(int j=1 ;j<=n;j++) {
				 if(i==j || j==n-i+1) {
					 System.out.print(i+" ");
				 }
				 else
				 {System.out.print("  "); }
				 
				 }
			 System.out.println();
			 
			 }
	}

}
