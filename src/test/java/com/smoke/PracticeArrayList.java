package com.smoke;

import java.util.ArrayList;
import java.util.List;

public class PracticeArrayList { //declaring array list
	
	List<Integer> mylist = new ArrayList<>(); //upcasting >> add 2,6,3,8,9
	
	public void getArrayValue() {
		mylist.add(2);
		mylist.add(6);
		mylist.add(3);
		mylist.add(8);
		mylist.add(9);
		
		System.out.println(mylist);
		
	}
	
	public static void main(String[] args) {
		new PracticeArrayList().getArrayValue(); 
	}

}