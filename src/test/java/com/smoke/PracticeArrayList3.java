package com.smoke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeArrayList3 {
	
Set<Integer> myset = new HashSet<>(); //upcasting >> add 2,6,3,8,9
	
	public Set<Integer> getArrayValue() {
		myset.add(2);
		myset.add(6);
		myset.add(3);
		myset.add(8);
		myset.add(9);
		
		return myset;
		
	}
	
	public static void main(String[] args) {
		Set<Integer> value = new PracticeArrayList3().getArrayValue();
		System.out.println(value);
	}

}




