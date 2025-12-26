package com.alltasks;
//different acc no with users & users name assigned ,user accno will different by increase count?

public class Task3 {
	  
	   static long  accountId=123467;
	  long ac=accountId;
	 
	 String username;
	 {
		  accountId+=1;
	 }
	 
	 public static void main(String[] args) {
		
		 Task3 t=new Task3();
		 t.username="umesh";
		 System.out.println("User Name="+t.username);
		 System.out.println("User ID="+t.ac);
		 
		 t.username="pradhyodh";
		 System.out.println("User Name="+t.username);
		 System.out.println("user ID"+accountId);
		  
		 Task3 t1=new Task3();
		 t1.username=" ram";
		 System.out.println("User Name="+t1.username);
		 System.out.println("User ID="+accountId);
		 
		 Task3 t2=new Task3();
		 t2.username=" sita";
		 System.out.println("User Name="+t2.username);
		 System.out.println("User ID="+accountId);

	}

}
