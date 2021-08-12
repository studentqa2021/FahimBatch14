package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingCrossBrowser {
	
	public void getBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
	
	public static void main(String[] args) {
		new TestingCrossBrowser().getBrowser();
	}

}
