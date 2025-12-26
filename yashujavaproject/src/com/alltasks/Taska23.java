package com.alltasks;

public class Taska23 {
    long accno;
	String cname;
	double bal;
	Taska23(){
		System.out.println("no args");
		}
	Taska23(long accno){
		this();
		System.out.println("1- args");
		 
		}
	Taska23(long accno,String cname){
		this(2);
		System.out.println("2- args");
		
	}
	Taska23(long accno,String cname,double bal)
	{
		this(2,"y");
		System.out.println("3- args");
		this.accno=accno;
		this.cname=cname;
		this.bal=bal;
	}
	void show() {
		System.out.println(accno);
		System.out.println(cname);
		System.out.println(bal);
	}

	public static void main(String[] args) {
		Taska23 t=new Taska23(52625237222L,"umesh",400000);
		 t.show();

	}

}
