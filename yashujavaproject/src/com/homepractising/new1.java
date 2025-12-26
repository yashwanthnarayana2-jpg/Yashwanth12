package com.homepractising;

import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
         double a = sc.nextInt();
 
         char choice = sc.next().charAt(0);
         int b = sc.nextInt();

        switch (choice) {
            case '+':
                System.out.println((a + b));
                break;
 
            case '-':
                System.out.println( (a - b));
                break;

            case '*':
                System.out.println( (a * b));
                break;

            case '/':
                if (b != 0)
                    System.out.println((a / b));
                else
                    System.out.println("error");
                break;

            
        }

        sc.close();
    }
}

