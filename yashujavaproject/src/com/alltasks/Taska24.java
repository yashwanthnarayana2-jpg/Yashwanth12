package com.alltasks;
class studentinfo{
	int sid;
	String sname;
	String sbranch;
	studentinfo(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
		 
	}
	studentinfo(studentinfo s, String sbranch){
		this.sid=s.sid+1;
		this.sname="ram";
		this.sbranch=sbranch;
	}
	 
	void show()
	{
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sbranch);
	}
}

public class Taska24  {
	public static void main(String[] args) {
		 studentinfo s1=new studentinfo(101,"umesh");
		 s1.show();
		 studentinfo s2=new studentinfo(s1,"cse");
		   s2.show();

	}

}
