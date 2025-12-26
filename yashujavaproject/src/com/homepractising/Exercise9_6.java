package com.homepractising;

class Car
{
	String name,n,ename,sname;
	Car(){ 
		 
		System.out.println("no args from car");
	}
	Car(String name){
	this(" yashu","umesh");
	System.out.println("1- args from car");
	this.name=name;
	}
		Car(String sname,String ename){ 
			this.ename=ename;
			this.sname=sname;
			System.out.println("2- args from car");
		 
	
}}
class Bike extends Car {
	String name;
	Bike(){
		 
		System.out.println("no args from Bike");
	}
	Bike(String name)
	{
		super("Suzuki");
		this.name=name;
		System.out.println("1- args from bike");
	}
}
class van extends Bike{
	String name;
	van(){
		System.out.println("no args from van");
	}
	 
	van(String name){
    super("hero honda");
	this.name=name;
	 System.out.println("1- args from van");
	}
}


class vehicle extends van  {
	vehicle(){
		//super();
		super("maruti");
		System.out.println("no args vehicle");
		}
	void show() {
		System.out.println("carname:"+((Car)this).name);
		System.out.println("managername:"+((Car)this).ename);
		System.out.println("ownername:"+((Car)this).sname);
		System.out.println("bikename:"+((Bike)this).name);
		System.out.println("vanname:"+super.name);
		
	}
}
public class Exercise9_6 {
	 
	public static void main(String[] args) {
		System.out.println("calling constructor one by one");
		vehicle v=new vehicle();
		System.out.println("all abt vehicles details");
		v.show();

	}}


