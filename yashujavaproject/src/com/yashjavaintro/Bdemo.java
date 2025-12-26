package com.yashjavaintro;

public class Bdemo {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalise");
	}
	// method inside object
			void display () {
				 System.out.println("garbage");
				 Bdemo b=new Bdemo();
			}

	  void main(String[] args) {
		 
		Bdemo b1=new Bdemo();
		Bdemo b2=new Bdemo();
		Bdemo b3=new Bdemo();
	 //by nullified object
		b1=null;
	// anonymous object	
		new Bdemo ();
	//re-assigning value
		b2=b3;
    // method inside object	
		display();
     // rund gc in virtual machine
		 System.gc() ; 
		 
		 System.out.println(b1);//7ad041f3
		 System.out.println(b2);//251a69d7
		 System.out.println(b3);
		 
  
	}

}
