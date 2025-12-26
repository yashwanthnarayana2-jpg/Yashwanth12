package com.alltasks;

//same method with args (int,char)
public class Taska18 {
	int metho(int c1) {
		char c=(char)(c1);
	 System.out.println("Integer to Character:"+c);//  (char) (c1)
		//System.out.println(c);
		return 0;
	}

	char metho(char a) {
		int i=(a);
	
		System.out.println("Character to Integer:"+i);//(int)(a)
		return 'i';
	}

	void main(String[] args) {
		System.out.println("main started");
		
		metho(65);//A
		metho('A');//65
	}

}
