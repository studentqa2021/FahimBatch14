package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUSA implements BaseLogin{

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");  //for chrome
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.honda.com/");
	}
	

}
