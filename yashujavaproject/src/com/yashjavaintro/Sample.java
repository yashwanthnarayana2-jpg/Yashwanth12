package com.yashjavaintro;

public class Sample {
	static void staticMethod() {
	System.out.println("Static method");
	//InstanceMethod();
	}
	 
    void InstanceMethod()
    {
	System.out.println("Instance method");
	}

	public static void main(String[] args) {
		 
    Sample s=new Sample();
    s.staticMethod();
	}
}
