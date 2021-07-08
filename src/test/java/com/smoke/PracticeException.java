package com.smoke;

public class PracticeException {
	static int a;
	public static void main(String[] args) {
		System.out.println("Hi!");
		
		try {
		System.out.println(10/a); // runtime exception/ unchecked >> stop
		}catch (Exception e) {
			//e.printStackTrace();
		}
		
		
		try {
		Thread.sleep(5000);
		}catch (Exception e) {
			//e.printStackTrace();
		}
		System.out.println("Bye!");
		
	}

}
