package com.smoke;

public class PracticeArray2 {
	
static int[] a = {2,3,4,77,11,6};
	
	public static String getArray() {
		int max = a[0];
		int min = a[0];
		for (int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
			
			if(a[i]<min) {
				min=a[i];
			}
			
	}
		
		return max+"_"+min;
		
	}
	
	public static void main(String[] args) {
	//PracticeArray2 obj = new PracticeArray2();
	//String maxValue = obj.getArray();
	//String minValue = obj.getArray();
	String value = PracticeArray2.getArray();//static
	////System.out.println(maxValue);
	//System.out.println(minValue);
	//System.out.println(obj.getArray());
	String max = value.split("_")[0]; //static
	String min = value.split("_")[1]; //static
	//System.out.println("Max & min value = "+value);
	System.out.println("Max value = "+max); //static
	System.out.println("Main value = "+min); //static
		
	}

}





