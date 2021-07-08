package com.smoke;

public class PracticeLooping {
	//Can you create a function that will swap any two value?10,20==> 20,10


		public void getSwap(int a,int b) {
			System.out.println("Before Swap  a value =" + a);
			System.out.println("Before Swap  b value =" + b);
			a = a + b;//30==> a=30
			b=a-b;//30-20=10 ==> b=10
			a= a-b;//30-10=20 ==> a=20
			System.out.println("After Swap  a value =" + a);
			System.out.println("After Swap  b value =" + b);
		}

		public static void main(String[] args) {

			new PracticeLooping().getSwap(100,200);
		}
	}


