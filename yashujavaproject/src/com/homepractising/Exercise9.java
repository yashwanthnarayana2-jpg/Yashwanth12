package com.homepractising;
//constructors using this() & this
public class Exercise9 {
	int uid;
	String uname; 
	int usal;
	long uphone;
	Exercise9() {
		uid=12;
		uname="yashu";
		usal=20000;
		uphone=929396208987l;
       }
	Exercise9(int uid) {
		this();
		this.uid=uid;
	}
	Exercise9(int uid,String uname) {
		this();
	}
	public static void main(String[] args) {

	}

}
