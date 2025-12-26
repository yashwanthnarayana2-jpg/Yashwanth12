package com.alltasks;
//class name employee
public class Task9 {
	int empid=23;
	String empname="ram";
 double empsalary=40000;
	public static void main(String[] args) {
		Task9 t=new Task9();
		System.out.println("employee details");
		 System.out.println("employee name:"+t.empname);
		 System.out.println("employee ID:"+t.empid);
		 System.out.println("employee salary:"+t.empsalary);
		 System.out.println("employee salary with 10%inc:"+(t.empsalary*0.1+t.empsalary)  );

	}

}
