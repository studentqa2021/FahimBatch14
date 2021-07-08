package com.smoke;

public class PracticeString {
	
	static int a = 10;
	static int b = 20;
	public static void getSwap() {
		
		System.out.println("a value = "+a);//10
		System.out.println("b value = "+b);//20
		
		//add code >> swap the value (a=20,b=10)
		
		//a=b;
		//b=a;
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a value = "+a);
		System.out.println("b value = "+b);
	}
	
	public static void main(String[] args) {
		PracticeString.getSwap();
	}

	

}
