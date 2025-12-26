package com.homepractising;

//stack over flow error by instance block
public class Exercise3_2 {
	{

		System.out.println("instance block");
	}

	public static void main(String[] args) {

		Exercise3_2 e = new Exercise3_2();
	}

	{
		Exercise3_2 e = new Exercise3_2();
		
	}

}
