package com.casestudy;
class Address{
	String city;
	Address( String city){
		this.city=city;
	}
	Address(Address a){
		this.city=a.city;
	}
}

class HrMang {
	// employee details
    String ename;
	int age;
	int eid;
	char Gender;
	long phone;
	String dept;
	final Address address;

	HrMang(String ename, int age, int eid, char Gender, Address address) {
		this.ename = ename;
		this.age = age;
		this.eid = eid;
		this.Gender = Gender;
		this.address = address;

	}
//shallow copy
	HrMang(HrMang m, String dept) {
		this.ename = m.ename;
		this.age = m.age;
		this.eid = m.eid;
		this.Gender = m.Gender;
		this.address = m.address;
		this.dept = dept;
	}
//deep copy
	HrMang(HrMang m) {
		this.ename = m.ename;
		this.age = m.age;
		this.eid = m.eid;
		this.Gender = m.Gender;
		this.address = new Address(m.address);
		this.dept = m.dept;
	}

	void show() {
		System.out.println(ename);
		System.out.println(eid);
		System.out.println(age);
		System.out.println(Gender);
		System.out.println(address.city);
		System.out.println(dept);
	}

}

public class CaseStudy3 {

	public static void main(String[] args) {
		Address a=new Address("akp");
		HrMang h = new HrMang("yash", 23, 101, 'M',a);
	 
		HrMang h1 = new HrMang(h, "CSE");//shallow copy
		HrMang h2 = new HrMang(h1);//deep copy
		h1.show();
		h2.ename = "umesh";
		h2.dept = "ECE";
		h2.address.city = "KPHB,Kukatpally HYB";
		h2.show();
	}

}
