package com.accessmodifier;

public class AccessModifierdemo1 {
	int a,b,c;
	//default constructor
	AccessModifierdemo1 (){
	}
	//private constructor
	 private AccessModifierdemo1 (int a){
		 a=this.a;
	}
	//public constructor
	 public AccessModifierdemo1 (int a,int b){
		 a=this.a;
		 b=this.b;
	}
	//protected constructor
	 protected AccessModifierdemo1 (int a,int b,int c){
		 a=this.a;
		 b=this.b;
		 c=this.c;
	}
	public static void main(String[] args) {
		 
		 
	}

}
