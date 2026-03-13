package com.projects;

import java.util.Scanner;

public class LibraryImpleLogicClass implements LibraryInterface {
	String book[]=new String[100];
	int count=0;
	boolean f;
	static Scanner sc=new Scanner(System.in);
	 
	LibraryPojoClass l=new LibraryPojoClass();
	public void memeberMang() {
		System.out.println("***Membership Card Account***");
		System.out.println("Enter your Name");
		String n=sc.next();
		l.setSname(n);
System.out.println("---------------------------------------------------");
		System.out.println("***Student library Card***");
		System.out.println("Name:"+l.getSname());
		System.out.println("Id:"+l.getSid());
	}
	public void bookAdd() { 
	
		System.out.println("Enter count of  books Add");
		int a=sc.nextInt();
		for(int i=0;i<a;i++) {
			System.out.println("Enter your  book name");
			String n=sc.next();
			l.setBname(n);
			count++;
			book[i]=l.getBname();
		}
		System.out.println("sucessfully books add");}
	public void bookSearch() {
		System.out.println("Enter your require book");
		 
		String r=sc.next();
		 f=false;
		for(int i=0;i<count;i++) {
			if(r.equalsIgnoreCase(book[i])) {
				System.out.println("your found book here!!");
				f=true;
				break;
			}
		}
		if(!f) {
			System.out.println("not found");
		}

	}
	 
	public void issueSystem() {
		
	}
	public void bookDelete() {
		if(f) {
			System.out.println("Enter count of book delete ");
			int b=sc.nextInt();
			for(int i=0;i<b;i++) {
			System.out.println("Enter book to pop from library");
			String d=sc.next();
		    book[i]=d;
			}
		}
	}

	 
	public void reports() {
			System.out.println("Available Books!!");
			for(int i=0;i<=count;i++) {
				System.out.print(book[i]+" ");
			}
			System.out.println();
	}

}
