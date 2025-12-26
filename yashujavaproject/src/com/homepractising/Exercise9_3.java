package com.homepractising;
//exam13/12
class Test{
	Test(int a,double b){
		System.out.println("int-double");//name ambiguity
	}
	Test(double a,int b){
		System.out.println("double-int");//name ambiguity
	}
}

public class Exercise9_3 {
	Exercise9_3(){
		this(10);
		System.out.println("a default");
	}
	Exercise9_3(int x){
		super();
		//this();
		System.out.println("a default"+x);
	}
 
	public static void main(String[] args) {
		new Exercise9_3();
		//Test t=new Test(10,20);//The constructor Test(int, double) is ambiguous
	}

}
