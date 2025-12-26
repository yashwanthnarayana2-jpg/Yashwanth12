package com.homepractising;
//autoboxing & unboxing
public class Exercise4 {

	public static void main(String[] args) {
		//autoboxing
		Integer a=10;
		Integer a1=Integer.valueOf(a);//internally
		System.out.println("autoboxing="+a);
		System.out.println("internally autoboxing="+a1);
	//0R---- //manual->int c =10 -->>Integer c1=Integer.valueOf(c)
		int c =30;
		Integer c1=Integer.valueOf(c);		
		System.out.println("manual:"+c1);
		System.out.println("***********************************");
		
		//unboxing
		int b =a;
		int b1 = a.intValue();//internally
		System.out.println("unautoboxing="+b);
		System.out.println("internally unautoboxing="+b1);
	//OR -----  // manual->Integer d=10-->>int d1 = d.intValue()
		Integer d=30;
		int d1 = d.intValue();
		System.out.println("manual:"+d1);
		 
	}

}
