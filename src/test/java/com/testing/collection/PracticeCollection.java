package com.testing.collection;

import java.util.Arrays;

public class PracticeCollection {
	
	//old java >> array length fixed
	//int a=10;
	
	//int [] a = new int [3]; //fixed length -2
	int [] b = {22, 44, 55, 11, 99};
	
	void getArrayValue() {
		
		//a[0]= 10;
		//a[1]= 20;
		//a[2]= 30;
		System.out.println(b); // no printing
		//System.out.println(Arrays.toString(b)); // good
	}
	
	public static void main(String[] args) {
		PracticeCollection obj = new PracticeCollection();
		obj.getArrayValue();//10,20
	}

}
