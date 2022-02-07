package com.AmazonLoginPage.stepDefinitions;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonLoginPage.pageObjects.BaseClass;
import com.AmazonLoginPage.pageObjects.LoginPageObjects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitions extends BaseClass{
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "E:\\Guru99\\Amazon\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    //driver = new C
	    
	    lp= new LoginPageObjects(driver);
	    driver.manage().window().maximize();
	}

	@Given("User Launch Edge browser")
	public void user_launch_edge_browser() throws InterruptedException {
	    System.setProperty("webdriver.edge.driver", "E:\\Guru99\\Amazon\\Drivers\\msedgedriver.exe");
	    driver = new EdgeDriver();
	    
	    
	    lp= new LoginPageObjects(driver);
	    driver.manage().window().maximize();
	}
	
	@Given("User Launch Firefox browser")
	public void user_launch_firefox_browser() throws InterruptedException {
	    System.setProperty("webdriver.gecko.driver", "E:\\Guru99\\Amazon\\Drivers\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    
	    
	    lp= new LoginPageObjects(driver);
	    driver.manage().window().maximize();
	}
	
	
	
	@When("User Opens {string}")
	public void user_opens(String URL) {
		
		try {
			driver.get(URL);
		} catch (Exception e) {
			System.out.println("Unable to Launch the URL");
		}
	}

	@When("User enters {string}")
	public void user_enters(String USERID) {
			lp.enterAmazonUserID(USERID);
	}

	@When("Click on Continue button")
	public void click_on_continue_button() {
			lp.clickAmazonContinueButton();
	}

	@Then("Sign In Page {string} should be validated")
	public void sign_in_page_should_be_validated(String TITLE) {
			lp.titleValidateAmazonPasswordButton(TITLE);
	}

	@And ("User clicks Amazon Logo link and validated {string}")
	public void user_clicks_amazon_logo_link_and_validated (String page) throws Exception{
			lp.validateAmazonLogoPage(page);
	}
	
	@When("User validated  {string}")
	public void user_validated(String page1) {
			lp.validateAmazonHelpLink2(page1);
	}
    
    @And ("User clicks HelpLink2")
    public void user_clicks_helplink2 (){
    		lp.clickAmazonHelpLink2();
    }

	
	
	@And("Close the browser")
	public void close_the_browser() {
			lp.closeBrowser();
	}

}
