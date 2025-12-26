package com.yashjavaintro;

public class Ddemo {			 

public static void main(String[] args) {
			 
    new Ddemo();
    System.out.println("main");
	System.gc();
	 
  }
 protected void finalize()   {
	System.out.println("finalise");
		}

}
