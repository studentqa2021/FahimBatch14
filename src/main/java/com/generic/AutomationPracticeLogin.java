package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.master.pagefactory.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.ScreenShot;

public class AutomationPracticeLogin {
	
	public MasterPageFactory baseLogin(WebDriver driver) {
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
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.navigate().to("http://automationpractice.com/index.php");
		//driver.navigate().to(BaseConfig.getConfigValue("URL"));
		//driver.manage().window().maximize();
		
		MasterPageFactory obj = new MasterPageFactory(driver);
		Highlighter.addColor(obj.getSigninbtn(), driver);
		ScreenShot.getScreenShot(driver, "Homepage");
		obj.getSigninbtn().click();//1
		//obj.getEmail().sendKeys("sarowerny@gmail.com");
		Highlighter.addColor(obj.getEmail(), driver);
		obj.getEmail().sendKeys(BaseConfig.getConfigValue("Username"));
		//obj.getPass().sendKeys("student");
		Highlighter.addColor(obj.getPass(), driver);
		obj.getPass().sendKeys(BaseConfig.getConfigValue("Password"));
		Highlighter.addColor(obj.getLoginbtn(), driver);
		ScreenShot.getScreenShot(driver, "Login Page");
		obj.getLoginbtn().click();
		//boolean statusLogin = obj.getSignout().isDisplayed();
		
		//boolean loginStatus = false;
		//try {
			//loginStatus = obj.getSignout().isDisplayed();
		//} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		//java condition ==> if/else conditional statement
		
		//if(loginStatus) {//true
			//System.out.println("Login Passed");
			// run the code
		//} else {//false
			//System.out.println("Login Failed");
			// run code
		//}
			
		return obj;
		}

	public Object getSignout() {
		// TODO Auto-generated method stub
		return null;
	}
	
		
	}




