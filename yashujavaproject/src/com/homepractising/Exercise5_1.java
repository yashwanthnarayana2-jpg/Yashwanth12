package com.homepractising;
//floating point  literal
public class Exercise5_1 {

	public static void main(String[] args) {
//floating literal
		//decimal
		 float d=100;
		 System.out.println("floating decimal:"+d);
		 //binary
		 float b =0b0101;
	     //float b1=0b0110f//invalid      float b1=0b10101.101f;//invalid
		 System.out.println("floating binary:"+b);
		 //octal 
		 float o=0123;//83.0
		 System.out.println("floating octal:"+o);
		 //float o1=0123.5;
		 float o1=0123.5F;//123.5--> (not considering  as octal "f" mentioned)
		 float o2=01252267f;//1252267.0--> (not considering  as octal "f" mentioned)
		 System.out.println("floating octal:"+o1);
		 System.out.println("floating octal:"+o2);
		 //hexadecimal
		 float h=0x123f;
		 //float h1=0x1234.5f invalid
		 System.out.println("floating hexadecial:"+h);
System.out.println("**************************");	 
//double literal
			//decimal
			double c=100;
			 System.out.println("double decimal:"+c);
			 //binary
			double i =0b0101;
		   // double i1=0b0110d//invalid      float i1=0b10101.101f;//invalid
			 System.out.println("double binary:"+i);
			 //octal 
		    double t=0123;//83.0
			 System.out.println("double octal:"+t);
			 double t1=0123.5f;//123.5--> (not considering  as octal "d" mentioned)
			 double t2=01252267d;//1252267.0--> (not considering  as octal "d" mentioned)
			 System.out.println("double octal:"+t1);
			 System.out.println("double octal:"+t2);
			 //hexadecimal
			 double hx=0x123f;
			 //float hx1=0x1234.5f invalid
			 System.out.println("double hexadecial:"+hx);
		 
	}

}
