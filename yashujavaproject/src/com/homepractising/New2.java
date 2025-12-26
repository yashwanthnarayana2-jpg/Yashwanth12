package com.homepractising;

public class New2 {
	int a=1;
	int b=1;
  int add() {
	  
	return a+b;
}
  int sub() {
		return a-b;
	}
  int mul() {
		return a*b;
	}
  int div() {
		return a/b;
	}
    
   void synchronised() 
   {
	   System.out.println(add());
	// return 0;  
  }
	public static void main(String[] args) {
		 New2 t=new New2();
		 t.synchronised();
		  
 
System.out.println(t.add());
 
System.out.println(t.sub());
 
System.out.println(t.mul());
 
	}

}
