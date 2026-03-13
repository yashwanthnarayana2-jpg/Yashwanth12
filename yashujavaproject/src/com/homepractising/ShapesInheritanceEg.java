package com.homepractising;
//Inheritance example with shapes
import java.util.Scanner;

   class Shapes {
	public double areaofcircle(double r) {
		return  Math.PI * r * r;
	}

	public double Perimeterofcircle(double r) {
		return 2* Math.PI * r;
	}

	public double areaofSquare(double s) {
		return s * s;
	}

	public double PerimeterofSquare(double s) {
		return 4 * s;
	}

	public double areaofRectangle(double l, double b) {
		return l * b;
	}
	 
	public double PerimeterofRectangle(double l, double b) {
		return 2 * (l + b);
	}

	public double areaofTriangle(double b, double h) {
		return 0.5 * b * h;
	}}
	
	public class ShapesInheritanceEg extends Shapes{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShapesInheritanceEg s = new ShapesInheritanceEg ();
		System.out.println("enter radius");
		int x = sc.nextInt();
		System.out.println("Area of circle:" + s.areaofcircle(x));
		System.out.println("Perimeter of circle:" + s.Perimeterofcircle(x));
		sc.close();
	}

}
