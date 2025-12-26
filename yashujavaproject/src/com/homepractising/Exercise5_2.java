package com.homepractising;
//string character null boolean
public class Exercise5_2 {

	public static void main(String[] args) {
		//string literal
		 String s1="yash";
		 String  s2 ="yash";
		 System.out.println(s1==(s2));
		 String s3=new String("yash");
		 System.out.println(s1.equals(s3));
		 //char literal
		 char c='A';//single character
		 char c1=89;//ascii values
		 char c2 ='\u0040';//hexa
		 System.out.println( c);
		 System.out.println( c1);
		 System.out.println( c2);
		 //boolean literals
		 Boolean b=true;
		 boolean b1=false;
		 if (b) 
			 { System.out.println("good day");}
		 //null
		 Exercise5_2 e =null;
		 String n="";//null
		 String n1=null;//null
		 System.out.println(n);
		 System.out.println(n1);
		  
	}

}
