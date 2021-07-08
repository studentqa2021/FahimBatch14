package com.smoke;

public class PracticeException1 {

	public static void main(String[] args) {
		String name = "Fahim";
		// name = variable/literal
		String obj = new String(); //string as a class
		//obj = object == Heap
		
		System.out.println(name);
		String name2 = "Smart Tech";
		System.out.println(name2);
		name.concat(name2);
		
		System.out.println(name.concat(name2));
		System.out.println(name2);
		System.out.println(name);
		// no change after concate = immutable
		// change = mutable
		
		
	}
}
