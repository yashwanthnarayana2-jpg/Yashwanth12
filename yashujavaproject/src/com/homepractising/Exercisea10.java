package com.homepractising;
//exam 20/12
//4
class demo{
int value;
demo(int v){
value=v;
System.out.println(value);
}}
 
//3
public class Exercisea10 {
	 
		private Exercisea10() {
			System.out.println("private constructor");
		}
	
	 
	public static void main(String[] args) {
		new demo(100);
		new Exercisea10();
		Exercisea10 e =new Exercisea10();
	System.out.println(e);
	}
}
