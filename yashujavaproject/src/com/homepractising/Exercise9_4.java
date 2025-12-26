package com.homepractising;
// ex-->this,super,(clsname(this))
class Dad{
	String name;
	//String name="harsha";;
	Dad(){
      name="harsha";
	}
}
class Mom extends Dad{
	String name;
	 //String name="Sirisha";
	Mom(){
		  name="Sirisha";
		}
}
public class Exercise9_4 extends Mom {
	String name="cutie & padhu";
	public static void main(String[] args) {
		 Exercise9_4 f=new Exercise9_4();
		 f.show();
	}
	void show() {
		System.out.println(((Dad)this).name);
		System.out.println(super.name);
		System.out.println(this.name);
		 
		 
	}
}
