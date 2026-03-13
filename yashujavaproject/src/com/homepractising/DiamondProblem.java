package com.homepractising;


 interface IA{
	public default void method() {
		System.out.println("hello IA");
	}
	
}
interface IB{
	public default void method() {
		System.out.println("hello IB");
	}
}
 
public class DiamondProblem implements IA,IB{
	public void method() {
		IA.super.method();
		IB.super.method();
	}
	 
	
	public static void main(String[] args) {
		DiamondProblem  d=new DiamondProblem ();
		d.method();

	}

}
