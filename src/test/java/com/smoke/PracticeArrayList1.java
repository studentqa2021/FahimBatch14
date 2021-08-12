package com.smoke;

import java.util.ArrayList;
import java.util.List;

public class PracticeArrayList1 { // declaring array list (recommended way)
	
List<Integer> mylist = new ArrayList<>(); //upcasting >> add 2,6,3,8,9
	
	public List<Integer> getArrayValue() {
		mylist.add(2);
		mylist.add(6);
		mylist.add(3);
		mylist.add(8);
		mylist.add(9);
		
		return mylist;
		
	}
	
	public static void main(String[] args) {
		List<Integer> value = new PracticeArrayList1().getArrayValue();
		System.out.println(value);
	}

}