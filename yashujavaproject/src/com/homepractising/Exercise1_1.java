package com.homepractising;
//Arithmetic operations with BigDecimal

import java.math.BigDecimal;
 
public class Exercise1_1 {
	  BigDecimal bd1 = new BigDecimal("61.17171717171717171717171717171717171717171717171717272727272727272727272272727272727272727");
	  BigDecimal bd2 = new BigDecimal("9.9999999798787897878787171717171717171");

	float f = 7.80998123456789012345671223445566667778788899990007643233456789900f;
	BigDecimal bd4 = new BigDecimal(f);

	double d = 7.809988989978745653635365367777655432223334567890987654335363d;
	BigDecimal bd5 = BigDecimal.valueOf(d);
	


	 
	 
  void main(String[] args) {
		//Excercise1_1 t = new Excercise1_1();
		 
		
		System.out.println(bd1.add(bd2));
		System.out.println(bd1.subtract(bd2));
		System.out.println(bd1.multiply(bd2));
		System.out.println(bd1.divide(bd2,0));
		System.out.println(bd1.divideAndRemainder(bd1));
		 
		 

	}

}
