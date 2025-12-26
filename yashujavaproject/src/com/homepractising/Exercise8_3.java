package com.homepractising;

public class Exercise8_3 {
	  double a;   int b; String name; int c;
	  //static int a1; static double b1;
  //using this keyword
	 void meon(double a,int b) {
	 this.a=a;
	 this.b=b;
}
	 static void meon(String name,int c) {
		 System.out.println(c);
		  System.out.println(name);
	 }
	  void show()
	  {
		  System.out.println(a);
		  System.out.println(b);
		  
	  }
	public static void main(String[] args) {
		Exercise8_3 e=new Exercise8_3();
		 e.meon(10,20);
		 e.show();
		 meon("yashu",9);
		  
	}
	
	 
}
