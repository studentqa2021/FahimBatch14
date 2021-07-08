package com.test.run;

import com.smoke.BaseLogin;

public class TestRunner extends BaseLogin{
	
	public static void main(String[] args) {
		
	//basic java >> static >> classname.methodname
	//BaseLogin.GetLogin();
		
	//static with integer	
	//BaseLogin.GetLogin(); 
	//System.out.println(BaseLogin.a);
	
	//inheritance >> static >> methodname
	//GetLogin();
		
	//inheritance with integer	
	//GetLogin();
	//System.out.println(a);
	
	//---------------------Non-Static-------------------------
	
	//basic method >> non-static
	//BaseLogin obj = new BaseLogin();
	//obj.GetLogin();
	//inheritance
	//GetLogin();
	
	//inheritance >> child
	//TestRunner obj2 = new TestRunner();
	//obj2.GetLogin();
	
	//inheritance >> parent + child
	//BaseLogin obj3 = new TestRunner();
	//obj3.GetLogin();
		
	
	
		
	}
	

}
