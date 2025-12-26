package com.homepractising;
// class as object methods
//instance variables
class student{
	
 }
//static variables
class student1{
	static int sid;
	static String sname;
}
public class Exercise8_2 {
	int sid;
	String sname;
	
	student getmetho()
	{
		System.out.println("instance student obj type method");
		student s=new student();
		sid=1;
		sname="sri";
		System.out.println(sid);
		System.out.println(sname);
		getmetho1(202,"sirluu");
		//return metho1();
		return s;   
	}
	student getmetho1(int sid,String sname) {
		System.out.println("instance student obj type method 2-args");
		student s=new student();
		this.sid=sid;
		 this.sname=sname;
		 System.out.println(sid);
		 System.out.println(sname);
		 metho1();
		return s;
		  
	}

   static student1 metho1()
	{
	   System.out.println("static student obj type method");
		student1 s=new student1();
		student1.sid=2;
		student1.sname="siri";
		System.out.println(student1.sid);
		System.out.println(student1.sname);
		//s.getmetho(student1.sid, student1.sname);
		metho1(student1.sid,student1.sname);
		//s.getmetho1(student1.sid,student1.sname);
		return s;
	}
   static student1 metho1(int sid,String sname)
	{
	   System.out.println("static student obj type method 2-args");
		student1 s=new student1();
		sid=3;
		sname="chenna";
		System.out.println(sid);
		System.out.println(sname);
		return s;  
	}
   public static void main(String args[]) {
		
		Exercise8_2 e =new Exercise8_2();
		student s=e.getmetho();
		//e.getmetho1(20,"umesh");
		//Exercise8_2.metho1();
		//Exercise8_2.metho1(22,"ram");
		 
	}

}
