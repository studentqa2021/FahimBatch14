package com.practice;

public interface Student {
	
// can handle ONLY ABSTRACT METHODS!	
// you CANNOT WRITE CODE!
	
// non-static + void method + abstract (abstract keyword + no body) ---> need to use only abstract class/interface 
	abstract void getSalary5(); // body missing
//----------------------------------------------
	
//abstract method get salary
	abstract void getSalary();
	// no code 
	
// java 8 new update
//added two new method with body/non-abstract
	
// static method & default
	
	static void getaway() {
		// code here
	}
	
	default void getincome() {
		// code here
	}
			

}
			

				




