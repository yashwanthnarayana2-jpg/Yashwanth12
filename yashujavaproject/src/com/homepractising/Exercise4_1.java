package com.homepractising;
//wrapper caching 
//wrapper datatypes having particular cacherange.
//accessing values of wrapperdt are same upto 127->true. behond 128 ->false.
//char 0to127
public class Exercise4_1 {
 
	public static void main(String[] args) {
		
		 Integer a=127;
		 Integer b=127;
		 System.out.println("Integer:"+(a==b));//true
		  Short a1=150;  
		  Short b1=150;
		 System.out.println("short:"+(a1==b1));//false
		 
		 Character c='A';  
		 Character c1='A';
		 System.out.println(c==c1);//true
		 Boolean B=null;
		 Boolean B1=null;
		 System.out.println(B==B1);
// wrapper datatypes must be mention l,f,d for integernumber values also(L,F,D)
// No Caching for Float and Double default all false		 
		
		 // Float f=123; invalid 
		 Float f= 123.0f;       Double d=127.0d;
		 Float f1= 123.0f;      Double d1=127.0d;
		 System.out.println(f==f1);//false
		 System.out.println(d==d1);//false
		  
		  
		   
		 
		 
		 
		 
		 
		 
		 
	}

}
