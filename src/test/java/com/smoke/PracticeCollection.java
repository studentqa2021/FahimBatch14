package com.smoke;

import java.util.Arrays;

public class PracticeCollection {
	
	//collection = more than one/multiple value
	//Array, List, Set, Map --> Java Collection --> single/multiple
	//Array = sign ==> []
	
	static int [] a = {2, 3, 4, 5}; //single value
	//int [] b = {4,5};// [] = Array --> Java Collection
	static int [] b = {10, 20, 30, 40};
	static int [] []c = {{2,3,4}, {5,6,7}};
	
	public static void main(String[] args) {
		//System.out.println(a);
		System.out.println(Arrays.toString(a));//Array
		System.out.println(Arrays.toString(b));//Array
		System.out.println(Arrays.toString(c));//Array
	}

}
