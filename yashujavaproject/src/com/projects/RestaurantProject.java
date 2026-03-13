package com.projects;

import java.util.Scanner;

//calender names
public class RestaurantProject {

	public static void main(String[] args) {
		System.out.println("welcome to Restaurant");
		System.out.println("New years offers 2026");
		Scanner sc = new Scanner(System.in);
		System.out.print(" veg || non veg:");
		String s = sc.next().toLowerCase();
		 double sum = 0;
		 boolean b;
		switch (s) {
		case "veg": {
			  b=false;
			System.out.println("menu list-|snacks||biriyani||curries");
			System.out.println("snack list-->samosa|pizza|burger|noodles|manchuria");
			do {

				System.out.print("choose your snacks: ");
				String snack = sc.next().toLowerCase();

				switch (snack) {
				case "samosa":
					System.out.println(" how many plates:");
					int p=sc.nextInt();
					sum += p*50;
					System.out.println("yummy samosa plate 50/");
					break;
				case "puff":
					sum += 79;
					System.out.println(" yummy samosa plate 79/");
					break;
				case "pizza":
					sum += 199;
					System.out.println(" yummy pizza plate 199/");
					break;
				case "burger":
					sum += 299;
					System.out.println(" yummy  burger plate 299/ ");
					break;
				case "noodles":
					sum += 99;
					System.out.println(" yummy  noodles plate 99/ ");
					break;
				case "manchuria":
					sum += 129;
					System.out.println(" yummy  manchuria plate 129/ ");
					break;
					
				default : {System.out.println("not available ");}}
				System.out.print("do you want snack from list again: ");
				b = sc.next().equalsIgnoreCase("Yes");
			//} while (b == true);
		} while (b);
			do {
				System.out.println("biriyani list--> paneer|mint|mushroom");

				System.out.println("choose your biriyani ");
				String biriyani = sc.next().toLowerCase();;
				switch (biriyani) {
				case "paneer" -> {
					sum += 350;
					System.out.println(" yummy biriyani 350/- ");
				}

				case "mushroom"-> {
					sum += 450;
					System.out.println(" yummy biriyani 450/- ");
				}
				case "mint" -> {
					sum += 150;
					System.out.println(" yummy biriyani 150/- ");
				}
				default ->{System.out.println("not available ");}
				}
				System.out.print("do you want any biriyani from list again: ");
				b = sc.next().equalsIgnoreCase("yes");
			} while (b);
			
			do {
				System.out.println("curries list--> cashew panner|fry panner|mushroom| poto fry|cabbg fry|cali fry");
				System.out.println("choose your curries ");
				String curries = sc.next().toLowerCase();
				switch (curries) {
				case "cashewpanner" -> {
					sum += 150;
					System.out.println(" yummy  curry 250/- ");
				}
				case "frypanner" -> {
					sum += 150;
					System.out.println(" yummy  curry 299/- ");
				}
				case "mushroom" -> {
					sum += 199;
					System.out.println(" yummy  curry 199/- ");
				}
				case "potofry" ,"cabbg fry" ,"cali fry" -> {
					sum += 59;
					System.out.println(" yummy  fries 59/- ");
				}
				default -> System.out.println("not available ");
				}
				System.out.print("do you want any curry from list again: ");
				b = sc.next().equalsIgnoreCase("yes");
			} while (b=true);
		}
		case"nonveg":
		{
			b=false;
			do {
			System.out.println("menu list-|snacks||biriyani||curries");
			System.out.println("snack list-->egg_samosa|chicken_pizza|chicken_burger|egg_noodles|egg_manchuria"
					+ "chicken_noodles|chicken_manchuria");
					 
					System.out.println("choose your snacks");
					String snacks = sc.next().toLowerCase();
					 
					switch(snacks) {
					
					 case "egg_samosa":
							System.out.println(" how many plates:");
							int p=sc.nextInt();
							sum += p*50;
							System.out.println("yummy samosa plate 50/");
							break;
						case "egg_puff":
							sum += 79;
							System.out.println(" yummy samosa plate 79/");
							break;
						case "chicken_pizza":
							sum += 199;
							System.out.println(" yummy pizza plate 199/");
							break;
						case "chicken_burger":
							sum += 299;
							System.out.println(" yummy  burger plate 299/ ");
							break;
						case "egg_noodles":
							sum += 129;
							System.out.println(" yummy  noodles plate 129/ ");
							break;
						case "egg_manchuria":
							sum += 159;
							System.out.println(" yummy  manchuria plate 159/ ");
							break;
							
						case "chicken_noodles":
							sum += 199;
							System.out.println(" yummy  noodles plate 199/ ");
							break;
						case "chicken_manchuria":
							sum += 199;
							System.out.println(" yummy  manchuria plate 129/ ");
							break;default : {System.out.println("not available ");}}
					System.out.print("do you want snack from list again: ");
					b = sc.next().equalsIgnoreCase("Yes");
				 
					}while (b=true);
					 }
		
	 
		System.out.println("total bill:" + sum);
		System.out.println("thank you visit again");

		sc.close();
	
}
}}
