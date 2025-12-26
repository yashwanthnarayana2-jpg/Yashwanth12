package com.alltasks;
class Practice {
	String brand;
	Practice(String brand){
		System.out.println("Read constructor called");
	}
	
}
class Write extends Practice{
	int model_year;
	Write(int  model_year,String brand){
	super(brand);
	this.model_year=model_year;
	this.brand=brand;
	System.out.println("Write constructor called");
		
	}
}
class Program extends Write{
	Program(){
		super(1995,"java");
		System.out.println("Program constructor called");
		System.out.println("our brand is:"+brand);
		System.out.println("introduce year:"+model_year);
	}
}

public class Taska26{

	 
	public static void main(String[] args) {
		 Program p=new Program();
		 //p.show();

	}

}
