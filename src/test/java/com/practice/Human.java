package com.practice;

public abstract class Human {
	
// can handle ANY METHODS!
// you CAN WRITE CODE IF IT IS NON-ABSTRACT!
// you CANNOT WRITE CODE IF IT IS ABSTRACT!
	
// static method 
	static void getSalary2() {//static void
		//code
	}
// non-void method >> return method/function/program
	static int getMoney3() { // static non-void
		//code
		return 10;
	}
// non-static + void method
	void getSalary1() {
		//code
	}
		
//non-static + non void method >> return method/function.program
	int getMoney1() {
		//code
		return 10;
	}
//----------------------------------------------------
		
// non-static + void method + abstract (abstract keyword + no body) ---> need to use only abstract class/interface 
	abstract void getSalary5(); // body missing
		
// main method
	public static void main(String[] args) { // run my code
			
	}
//----------------------------------------------------
	
//abstract method get salary
	abstract void getSalary();
	
// non-abstract
	void getMoney0() {
	}
	
	static void getMoney2() {
	}
	
	int getincome() {
		return 10;
	}
	
	static int getIncome1() {
		return 10;
	}
			
	
		
}
			

