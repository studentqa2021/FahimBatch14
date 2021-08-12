package com.smoke;

import org.testng.reporters.jq.Main;

public class PracticeArray {
	
	int[] a = {2,3,4,77,11,6};
	
	public void getArray() {
		int max = a[0];
		for (int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
		}
			
			System.out.println(max);
			
		}
		
	}
	
	public static void main(String[] args) {
	PracticeArray obj = new PracticeArray();
	obj.getArray();
		
	}

}
