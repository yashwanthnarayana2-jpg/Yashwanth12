package com.homepractising;
//srikanth sir task
import java.util.Scanner;

public class Exercisea11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		if(a>0&&a<5) {
			System.out.println("you are kid");
		}
		else if(a>5&&a<11) {
			System.out.println("you are children");
		}
		else if(a>12&&a<17) {
			System.out.println("you are teen");
			
		}
		else if(a>18&&a<35) {
			System.out.println("you are younger");
			
		}
		else if(a>36&&a<60) {
			System.out.println("you are adult");
			
		}
		else if(a>61&&a<90) {
			System.out.println("you are senior citizen");
			
		}
		else {
			 
				System.out.println(" invalid");
				
			}
		}
	}


