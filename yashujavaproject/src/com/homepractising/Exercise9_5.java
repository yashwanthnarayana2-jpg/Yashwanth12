package com.homepractising;
//copy constructor
public class Exercise9_5 {
	String iname;
	String iaddress;
	String icourses;
	String itrainers;
	double budget;

	Exercise9_5(String iname, String iaddress) {
		this.iname = iname;
		this.iaddress = iaddress;
	}

	Exercise9_5(Exercise9_5 e, String icourses) {
		this.iname = e.iname;
		this.iaddress = e.iaddress;
		this.icourses = icourses;
	}

	Exercise9_5(Exercise9_5 e, String itrainers, double budget) {
		this.icourses = e.icourses;
		this.iname = e.iname;
		this.iaddress = e.iaddress;
		this.itrainers = itrainers;
		this.budget = budget;
	}

	void show() {
		System.out.println("name of inst:" + iname);
		System.out.println("adddress:" + iaddress);
		System.out.println("courses name:"+icourses);
		System.out.println("trainers name:"+itrainers);
		System.out.println("amount:"+budget);
	}

	public static void main(String[] args) {
		Exercise9_5 e=new Exercise9_5("vcube","kphb");
		Exercise9_5 e1=new Exercise9_5(e,"jfs");
		Exercise9_5 e2=new Exercise9_5(e1,"viswa,srikanth",2000000000);
		e2.show();
	}

}
