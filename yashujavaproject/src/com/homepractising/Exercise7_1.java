package com.homepractising;

class UnionBank {
	 static float  balance;

	//static void UnionBank1(String s, long Accno, String ifsc, int balance) {
	 UnionBank (String s,long Accno,String ifsc,int balance){
		 this.balance=balance;
		System.out.println("Holder Name:" + s);
		System.out.println("accno:" + Accno);
		System.out.println("IFSC code:" + ifsc);
		System.out.println("inital bal:" +balance);
		deposist(50000);

	}

	static void deposist(int amount) {
		//int balance;
		  balance += amount;
		System.out.println("deposist cash:" +amount);
		System.out.println("updatedbal=" + amount);
		withdraw(5500);
	}

	static void withdraw(int amount) {
		 balance -= amount;
		System.out.println("withdraw cash:" + amount);
		checkbal();
	}

	static void checkbal() {
		System.out.println("currentbal=" + balance);
	}
}

public class Exercise7_1 {
	public static void main(String[] args) {
	UnionBank u=new UnionBank("umeshchandrao", 3425627226262L, "UNISC0078", 500);
	
		//UnionBank.UnionBank1("umeshchandrao", 3425627226262L, "UNISC0078", 500);
	}

}
