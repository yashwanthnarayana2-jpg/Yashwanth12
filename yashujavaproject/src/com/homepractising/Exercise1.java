package com.homepractising;
//Arithmetic operations with BigInteger
import java.math.BigInteger;
 

public class Exercise1 {
	 
    long val=1214562728909090909L;
    BigInteger bi3= BigInteger.valueOf(val);
    
    int a=12145262;
    BigInteger bi4= BigInteger.valueOf(a);//valueOf
   
    
   BigInteger toBigIntegerexact() 
    { 
	   System.out.println(bi3.add(bi4));
		return bi4;// bi4 inplace of use null
    }
    
	BigInteger bi1 = new BigInteger("890008862131098778978978978797897979797973141541515616171178181271127228");
	BigInteger bi2 = new BigInteger("898989898980008862135464839202739303271515616171178181271127228");
	 
	 

	void main(String[] args) {
		toBigIntegerexact();
		System.out.println();
		BigInteger sum=bi1.add(bi2);
		BigInteger difference=bi1.subtract(bi2);
		BigInteger multiply =bi1.multiply(bi2);
		BigInteger division=bi1.divide(bi2);
		BigInteger modulus=bi1.remainder(bi2);
		
		System.out.println( "Add="+sum);
		System.out.println( "sub="+difference);
		System.out.println( "mul="+multiply);
		System.out.println( "div="+division);
		System.out.println( "mod="+modulus);
		System.out.println(bi1.divideAndRemainder(bi1));
	}

}
