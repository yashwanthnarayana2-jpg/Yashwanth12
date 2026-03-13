package com.accessmodifier;

class Scope  {
	  protected class H{
		  {System.out.println("good");}
	  }
}
class ScopeOfClass extends Scope {
	class padhu extends H{
		 {System.out.println("evening");}
	}
public static void main(String args[]) {
	ScopeOfClass c=new ScopeOfClass();
	ScopeOfClass.padhu v= c.new padhu();
}
}
 