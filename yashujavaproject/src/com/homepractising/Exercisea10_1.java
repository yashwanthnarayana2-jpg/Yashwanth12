package com.homepractising;
//shallow  copy example
//copies the reference of an object, not the actual nested object.
//obj pointer same memory
class Certificate {
	String course;
	// final String course="JFs";

}

class Student {
	String name;
	//class name as data type
	final Certificate cert;

	Student(Certificate cert, String name) {
		this.cert = cert;
		this.name = name;
	}

	Student(Student s) {
		this.name = s.name;
		this.cert = s.cert;
		System.out.println(name);
	}
}
//---------------------------------------------------------------------------------------------------//
//deep copy example
//creates a new object for nested objects.
//Completely independent objects
class Certificate1 {
	String course1;
	 Certificate1(String course1){
		 this.course1=course1;
}
	 //copy constructor
	 Certificate1( Certificate1 t){
		 this.course1=t.course1;
	 }
}
class Student1 {
	String name1;
	//class name as data type
	final Certificate1 cert1;

	Student1(Certificate1 cert1, String name1) {
		this.cert1 = cert1;
		this.name1 = name1;
	}

	Student1(Student1 s1) {
		this.name1 = s1.name1;
		this.cert1= new Certificate1(s1.cert1);
		System.out.println(name1);
	}
}

 
public class Exercisea10_1 {

	public static void main(String[] args) {
//-----------------------------------------------------------------------------------------------//
		//shallow copy
		Certificate c = new Certificate();//no constructor in certificatec class
		c.course = "java full stack";
		System.out.println(c.course);

		Student s1 = new Student(c, "cutie");
		Student s2 = new Student(s1);// shallow copy
		// s2-ref obj of student class
		// cert-ref Variable of Certificate datatype,(from class name as dt)
		// course-variable name in Certificate cls
		String t = s2.cert.course = "java";
		System.out.println(t);
		
//---------------------------------------------------------------------------------------------------//
		// deep copy
		Certificate1 c1 = new Certificate1("python full stack");
		System.out.println("*************");
		Student1 s11 = new Student1(c1, "cutie");
		System.out.println( s11.cert1.course1);
		Student1 s22 = new Student1(s11);
		c1.course1="python";
		System.out.println(c1.course1);
		System.out.println(s22);
		 

		
	}

}
