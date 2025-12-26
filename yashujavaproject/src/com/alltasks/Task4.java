package com.alltasks;
import java.util.*;
public class Task4 {
	 static int useramount=450;
	 static int no_of_choco=10;
	 static int no_of_cookie=5;;
	 static  int choco=15;
	 static int cookie=10;
	 void product() {
		 System.out.println("user total money="+useramount+"/-");
		  int x=no_of_choco*choco;
		 System.out.println("user money choco="+x+"/-" );
		 int y=no_of_cookie*cookie;
		 System.out.println("user money cookie="+y+"/-");
		 int z= x+y;
	     int result=useramount-z;
	    System.out.println(" balance="+result+"/-");
	 }
	 
	public static void main(String[] args) {
		
		  Task4 t=new Task4();
		  t.product();
	}
}
