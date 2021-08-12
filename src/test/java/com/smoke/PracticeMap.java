package com.smoke;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeMap {
	
	static Map<String, String> mymap = new LinkedHashMap<>();
	public static void main(String[] args) {
		
		mymap.put("Name", "Fahim");
		mymap.put("City", "Queens");
		
		System.out.println(mymap);
		
	}
	
	

}
