 package com.smoke;

public class PracticeCollection1 {
	
	int[] a = {2,3,4,77,11,6};
	
	public int getArray() {
		int max = a[0];
		for (int i=0;i<a.length;i++) {
			
			if(a[i]>max) {//6 > 77 = false
				max=a[i];
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		//PracticeCollection1 obj = new PracticeCollection1();
		//int maxValue = obj.getArray();
		int maxValue = new PracticeCollection1().getArray();
		System.out.println(maxValue);//77
		//System.out.println(obj.getArray());//77
		
		
	}
}
