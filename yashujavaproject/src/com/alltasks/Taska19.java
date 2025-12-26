package com.alltasks;
//object count using constructor
public class Taska19 {
	static int count=0;
	Taska19()
	{
		count++;
	}

	public static void main(String[] args) {
		  new Taska19();
		  new Taska19();
		  new Taska19();
		 System.out.println("no of objects:"+count);

	}

}
