package com.practice;

public class Child extends Parent {//inheritance, creating a relation between two classes!
	
	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.GetMoney();
		
		// kid wants some money
		Child obj2 = new Child(); //inheritance
		obj2.GetMoney();
		
		//kid(14) wants to buy a car
		Parent obj3 = new Child(); //inheritance
		obj3.GetMoney(); 
		
		//not possible, parent never depends on child
		//Child obj4 = new Parent();
		//obj4.GetMoney();
	}

}
