package com.AmazonLoginPage.utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandler {

	public WebDriver driver;
	//Constructor
	public WindowHandler (WebDriver driver)
	{
		this.driver=driver;
	}


	public void getTitleForSecondTab(String Title) 
	{
		
		String MainWindow = driver.getWindowHandle();
		//System.out.println("Main window handle is " + MainWindow);
		Set<String> s1 = driver.getWindowHandles();
		//System.out.println("Child window handle is" + s1);
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.getTitle().equals(Title);
				//System.out.println(elementchild);
			}
		}
	}

}
