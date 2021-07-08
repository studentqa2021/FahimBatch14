package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Highlighter;

public class EUBrach implements BaseLogin{

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");  //for chrome
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		//driver.navigate().refresh();
		//driver.navigate().forward();
		//driver..navigate().back();
		driver.manage().window().maximize();
		
		JavascriptExecutor obj = (JavascriptExecutor)driver; //type casting
		
		//SIGN-IN
		//obj.executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(By.xpath("//*[@class='login']")), "color: yellow; border: 2px solid red;");
		//driver.findElement(By.xpath("//*[@class='login']")).click();
		
		WebElement signinbtn = driver.findElement(By.xpath("//*[@class='login']"));
		Highlighter.addColor(signinbtn, driver);
		signinbtn.click();
		
		//EMAIL
		//obj.executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(By.xpath("//*[@id='email']")), "color: yellow; border: 2px solid red;");
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sarowerny@gmail.com");
		
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		Highlighter.addColor(email, driver);
		email.sendKeys("sarowerny@gmail.com");
		
		//PASSWORD
		//obj.executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(By.xpath("//*[@id='passwd']")), "color: yellow; border: 2px solid red;");
		//driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("student");
		
		WebElement passwd = driver.findElement(By.xpath("//*[@id='passwd']"));
		Highlighter.addColor(passwd, driver);
		email.sendKeys("student");
		
		//SUBMIT
		//obj.executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(By.xpath("//*[@id='SubmitLogin']")), "color: yellow; border: 2px solid red;");
		//driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
		
		WebElement SubmitLogin = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
		Highlighter.addColor(SubmitLogin, driver);
		SubmitLogin.click();
		
		driver.quit();
		
}

}
