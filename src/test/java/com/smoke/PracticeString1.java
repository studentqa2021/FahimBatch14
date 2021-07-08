package com.smoke;

import java.util.Arrays;

public class PracticeString1 {
	String countryName = "UNITED STATES OF AMERICA";// Global >>instance

	void getPieces() {
		
		String[] pieces = countryName.split(" ");// 4 pieces
		System.out.println(Arrays.toString(pieces));
	}

	public static void main(String[] args) {
		// can be done two ways
		
		//PracticeString1 obj = new PracticeString1();
		//obj.getPieces();
		
		new PracticeString1().getPieces();
	}

}
