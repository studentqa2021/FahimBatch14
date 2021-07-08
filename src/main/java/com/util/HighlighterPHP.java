package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighlighterPHP {
	
	public static void addColor(WebElement element, WebDriver driver) {
		
		JavascriptExecutor obj = (JavascriptExecutor)driver; //type casting
		obj.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: yellow; border: 2px solid red;");

	}

}
