package com.smoke;

public class PracticeArray1 {
	
int[] a = {2,3,4,77,11,6};
	
	public int getArray() {
		int max = a[0];
		for (int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
		}
			
	}
		
		return max;
		
	}
	
	public static void main(String[] args) {
	PracticeArray1 obj = new PracticeArray1();
	int maxValue = obj.getArray();
	System.out.println(maxValue);
	System.out.println(obj.getArray());
		
	}

}


