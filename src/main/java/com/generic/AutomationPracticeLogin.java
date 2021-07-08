package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.master.pagefactory.MasterPageFactory;
import com.util.BaseConfig;

public class AutomationPracticeLogin {
	
	public void baseLogin() {
		// a. open any browswer
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		// b. Go to URL
		//driver.navigate().to("http://automationpractice.com/index.php");
		//driver.manage().window().maximize();
		
		// c. Click login Button
		//WebElement signinbtn = driver.findElement(By.xpath("//*[@class='login']")); signinbtn.click();
		
		//d. Put email
		//WebElement email = driver.findElement(By.xpath("//*[@id='email']")); email.sendKeys("sarowerny@gmail.com");
		
		//e. Put Password
		//WebElement pass = driver.findElement(By.xpath("//*[@id='passwd']")); pass.sendKeys("student");
		
		//f. Click login button
		//WebElement loginbtn = driver.findElement(By.xpath("//*[@class='icon-lock left']"));loginbtn.click();
		
		//g. Check login pass or fail
		
		//upgraded code
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("http://automationpractice.com/index.php");
		driver.navigate().to(BaseConfig.getConfigValue("URL"));
		driver.manage().window().maximize();
		MasterPageFactory obj = new MasterPageFactory(driver);
		obj.getSigninbtn().click();//1
		//obj.getEmail().sendKeys("sarowerny@gmail.com");
		obj.getEmail().sendKeys(BaseConfig.getConfigValue("Username"));
		//obj.getPass().sendKeys("student");
		obj.getPass().sendKeys(BaseConfig.getConfigValue("Password"));
		obj.getLoginbtn().click();
		driver.quit();
	}



}
