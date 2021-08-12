package com.smoke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeArrayList2 {
	
List<Integer> mylist = new ArrayList<>(); //upcasting >> add 2,6,3,8,9
	
	public String getArrayValue() {
		mylist.add(2);
		mylist.add(6);
		mylist.add(3);
		mylist.add(8);
		mylist.add(9);
		int max = Collections.max(mylist);//9
		int min = Collections.min(mylist);//2
		return max+"_"+min;
		
	}
	
	public static void main(String[] args) {
		String value = new PracticeArrayList2().getArrayValue();
		String max = value.split("_")[0];
		String min = value.split("_")[1];
		System.out.println(value);
		System.out.println("Max value = "+max);
		System.out.println("Min value = "+min);
	}

}


