package com.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Highlighter;
import com.util.ScreenShot;

public class BaseLoginPHPTravel {
	
	public void getLogin() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//ChromeOptions driver = new ChromeOptions(); alternative way
		driver.navigate().to("https://phptravels.com/");
		
		//screenshot = picture
		ScreenShot.getScreenShot(driver, "homePage");
		
		driver.manage().window().maximize();
		WebElement signinbtn = driver.findElement(By.xpath("//*[@class='lvl-0 sign-in btn btn-md btn-white-outline']"));
		
		Highlighter.addColor(signinbtn, driver);
		
		//screenshot = picture
		ScreenShot.getScreenShot(driver, "beforeLoginClick");
		
		signinbtn.click();
		
		//screenshot = picture
		ScreenShot.getScreenShot(driver, "afterLoginClick");
		
		}
		
		
	}



