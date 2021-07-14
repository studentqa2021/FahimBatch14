package com.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.AutomationPracticeLogin;
import com.generic.DriverManager;
import com.master.pagefactory.MasterPageFactory;

public class SmokeTestExection {
	
	//public static void main(String[] args) {
		//DriverManager dm = new DriverManager();
		//WebDriver driver2 = dm.getDriver();
		//AutomationPracticeLogin obj = new AutomationPracticeLogin();
		//obj.baseLogin(driver2);
	
	WebDriver driver2;
	@BeforeTest // setup
	public void setup() {
		driver2 = new DriverManager().getDriver();
	}
	
	@Test // actual test
	public void loginTest() {
		MasterPageFactory obj = new AutomationPracticeLogin().baseLogin(driver2);
		
		Assert.assertTrue(obj.getSignout().isDisplayed(),"Login Passed");
	}
	
	@AfterTest // close/quit
	public void teardown() {
		driver2.quit();
	}
		
		

}
