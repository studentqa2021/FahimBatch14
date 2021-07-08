package com.myprogram;

public class ActualTestCode {
	int f;//2
	int g;//3
	int h;//4
	public ActualTestCode(int y, int z, int m){//constructor special type of method
		f=y;
		g=z;
		h=m;
		}
	//ANYTHING INSIDE THE CLASS BUT OUTSIDE OF THE METHOD, IS KNOWN AS GLOBAL VARIABLE!(BLUE FONT)
	int e=20;	//STATIC GLOBAL VARIABLE >> HAS THE KEYWORD 'STATIC'
	static int x = 30;	//INSTANCE GLOBAL VARIABLE >> DOES NOT HAVE THE KEYWORD 'STATIC'
	
	public void GetSalary() {
	//ANYTHING INSIDE THE METHOD OR METHOD PARENTHESIS, IS KNOWN AS LOCAL VARIABLE!(GREY FONT)
		
		//System.out.println(2+2);
		//System.out.println(2/3);
		//System.out.println(3*8);
		//System.out.println(10-5);
		
		int a = 20; //(primitive)
		//int is datatype 
		//a is variable 
		//20 is the value 
		double b = 20.25; //(primitive)
		boolean c = true; //(primitive)
		String d = "Fahim"; //(non-primitive)
		
		//int a = 10;
		//int b = 20;
		//int c = a + b ;
		//int d = a*b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(a+b);
		System.out.println("this is the sum = "+(a+b));
		
		System.out.println(e); //Global Variable
		
	}
	
	public void GetIncome() {
		//int a = 10;
		//int b = 20;
		System.out.println(e);
		System.out.println(x);
	} 
	
	//public void GetSum(int f, int g, int h) {
		//System.out.println(f + g + h);
	//} 
	
	public void GetSum() {
		System.out.println(f + g + h);
	} // >> This version of code is used for constructor.
	
	//public void GetMultiplication() {
		//System.out.println(f*g*h);
	//}
	
	public void GetMultiplication() {
		System.out.println(f*g*h);
	} // >> This version of code is used for constructor.
		
	
	public static void GetMoney() {
		System.out.println("static");
		System.out.println("Fahim");
		//System.out.println(e); //non-static
		System.out.println(x);
	}

}
