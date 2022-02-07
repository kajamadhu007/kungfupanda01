package com.AmazonLoginPage.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	public WebDriver driver;
	//Constructor
	public WaitHelper(WebDriver driver)
	{
		this.driver=driver;
	}
	//Wait till the WebElement is available on the page - For Explicit waits
	public void waitForElement(WebElement element, long timeOutInSeconds)
	{
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	//Implicit Wait
	public void waitForPageLoad (long timeout) throws InterruptedException
	{
		WebDriverWait wait1 = new WebDriverWait (driver, timeout);
		wait1.wait(1000);
	}


	
	
	
}
