package com.yashjavaintro;

 
public class Employee {
	int eid;
	String  ename;    
	
	static int  comid;
	static String comname;
	
	String name;
	int exp;
	 
	public static void main(String[] args) {
		
		 
	
		System. out.println("welcome to technology in india");
		System. out.println("******Employee-01 details******");
	
		 
		Employee em = new Employee();
		em.eid=21;
		em.ename="chenna";
		
		em.name="fhhshj";
		em.exp=17;
		
		comid= 349;
		comname="YashTechnology";
		
		System. out.println("Company ID:"+comid);
		System.out.println("Company Name:"+comname);
		
		System. out.println("Emoloyee id:"+em.eid);
		System. out.println("Employee name:"+em.ename);
	
		System. out.println("welcome:"+em.name);
		System. out.println("experience"+em.exp);
		
		System. out.println("******Employee-02 details******");
		 
		em.eid=11;
		em.ename="sekhar";
		
		
		System. out.println("Company ID:"+comid);
		System.out.println("Company Name:"+comname);
		
		System. out.println("Emoloyee id:"+em.eid);
		System. out.println("Employee name:"+em.ename);
		
		
		
		

	}
 
}
