package com.homepractising;
//byte->short->int->float->double
public class ShapesMethodloadingEg {
	public double area(float s) {
		return s * s;
	}

	public double area(float l, double b) {
		return l * b;
	}

	public double area(double b, float l) {
		return l * b;
	}

	public double area(double r) {
		return Math.PI * r * r;
	}

	public double area(double h, double b) {
		return 0.5 * h * b;
	}

	public static void main(String[] args) {
		ShapesMethodloadingEg ml = new ShapesMethodloadingEg();
		System.out.println("Area of Square:" + ml.area(12));// int-> float (first)
		// name ambiguity float,double or double ,float->both are integer//
		// #System.out.println("Area of rectangle:"+ml.area(2,15));
		// name ambiguity float,double or double ,float->float,integer//
		// #System.out.println("Area of rectangle:"+ml.area(2.4f,15));
		// name ambiguity float,double or double ,float->both are float//
		// #System.out.println("Area of rectangle:"+ml.area(2.4f,1.5f));
		System.out.println("Area of rectangle:" + ml.area(2.4f, 15d));
		System.out.println("Area of rectangle:" + ml.area(2.4d, 15f));

		System.out.println("Area of circle:" + ml.area(12.9));//
		System.out.println("area of triangle:" + ml.area(1.2, 3));
	}

}
