package com.casestudy;

import java.util.Scanner;

public class CaseStudy5 {

	public static void main(String[] args) {
		System.out.println("main started");
        Scanner sc=new Scanner(System.in);
        Double TUC=0.0;
        //int days=30; 
        System.out.println("enter unit for consumption"); 
        long unit=sc.nextLong();
         double avg=0;
            for(int days=31;days>0;days--) 
            	  {   avg= (unit / days);
            	   
            	  System.out.println("average daily consumption:"+avg);
            	 }
            System.out.println("total units consumed:"+avg);
            if(avg>0 && avg<=100) {
            	avg*=3; System.out.println("total unit per charge:"+avg);
            	}
            else if(avg>100 && avg<=200) {
            	avg*=3.5; System.out.println("total unit per charge:"+avg);
            	}
           
      
           
	sc.close();
}
}
