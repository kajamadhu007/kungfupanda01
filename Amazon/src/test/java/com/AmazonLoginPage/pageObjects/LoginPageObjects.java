package com.AmazonLoginPage.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.AmazonLoginPage.utilities.WaitHelper;
import com.AmazonLoginPage.utilities.WindowHandler;
import com.AmazonLoginPage.utilities.screenshot;

public class LoginPageObjects {

	WebDriver ldriver;
	WaitHelper waitHelper;
	WindowHandler windowHandler;
	screenshot screenshot; 

	public LoginPageObjects(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

		waitHelper=new com.AmazonLoginPage.utilities.WaitHelper(ldriver);

		windowHandler=new com.AmazonLoginPage.utilities.WindowHandler(ldriver);
		
		screenshot = new com.AmazonLoginPage.utilities.screenshot(ldriver);
	}

	@FindBy (how=How.XPATH, using="//a[@href='/ref=ap_frn_logo']")
	@CacheLookup
	WebElement amazonLogoLink;

	@FindBy (how=How.LINK_TEXT, using="Today's Deals")
	@CacheLookup
	WebElement amazonTodayDealsLink;	

	@FindBy (how=How.CLASS_NAME, using="a-spacing-small")
	@CacheLookup
	WebElement amazonSignInText;

	@FindBy (how=How.XPATH, using="//*[@for='ap_email']")
	@CacheLookup
	WebElement amazonEmailText;

	@FindBy (how=How.ID, using="ap_email")
	@CacheLookup
	WebElement amazonUserID;

	@FindBy (how=How.ID, using="continue")
	@CacheLookup
	WebElement amazonContinueButton;

	@FindBy (how=How.XPATH, using="//*[@for='ap_password']")
	@CacheLookup
	WebElement amazonPasswordTitle;

	@FindBy (how=How.ID, using="legalTextRow")
	@CacheLookup
	WebElement amazonlegalText;

	@FindBy (how=How.LINK_TEXT, using="Conditions of Use")
	@CacheLookup
	WebElement amazonConditionLink1;	

	@FindBy (how=How.XPATH, using="//*[@target='_blank'][1]")
	@CacheLookup
	WebElement amazonConditionLink2;

	@FindBy (how=How.CLASS_NAME, using="a-expander-prompt")
	@CacheLookup
	WebElement amazonNeedHelpLink;

	@FindBy (how=How.ID, using="auth-fpp-link-bottom")
	@CacheLookup
	WebElement amazonForgotPasswordLink;	

	@FindBy (how=How.ID, using="ap-other-signin-issues-link")
	@CacheLookup
	WebElement amazonOtherSignInIssuesLink;

	@FindBy (how=How.XPATH, using="//*[contains(text(),'New to Amazon?')]")
	@CacheLookup
	WebElement amazonNewToAmazonText;	

	@FindBy (how=How.ID, using="createAccountSubmit")
	@CacheLookup
	WebElement amazonCreateAccountButton;

	@FindBy (how=How.XPATH, using="//*[@target='_blank'][2]")
	@CacheLookup
	WebElement amazonPrivacyLink2;

	@FindBy (how=How.LINK_TEXT, using="Privacy Notice")
	@CacheLookup
	WebElement amazonPrivacyLink1;

	@FindBy (how=How.XPATH, using="//*[@target='_blank'][3]")
	@CacheLookup
	WebElement amazonHelpLink2;

	@FindBy (how=How.XPATH, using="//*[contains(text(),'Inc.')]")
	@CacheLookup
	WebElement amazonCopyRightsText;	

	public void clickAmazonLogoLink() throws Exception
	{
		try {
			waitHelper.waitForElement(amazonLogoLink, 10);
			amazonLogoLink.click();

		} catch (Exception e) {

			System.out.println("Expected element is not clickable");
			e.printStackTrace();
		}
	}	
	public void validateAmazonLogoPage(String page) throws Exception 
	{
		try{
			
			amazonLogoLink.click();
			waitHelper.waitForElement(amazonTodayDealsLink, 10);
			
			ldriver.getTitle().equals(page);
		} catch (Exception e) {

			System.out.println("Title of the page is not valid");
		}

	}	

	public void enterAmazonUserID(String USERID)
	{
		try {
			waitHelper.waitForElement(amazonUserID, 10);
			amazonUserID.sendKeys(USERID);
	
		} catch (Exception e) {
			System.out.println("Expected element is not clickable");
		}
	}

	public void clickAmazonContinueButton()
	{
		try {
			waitHelper.waitForElement(amazonContinueButton, 10);
			amazonContinueButton.click();
		} catch (Exception e) {
			System.out.println("Expected element is not clickable");
		}
	}

	public void titleValidateAmazonPasswordButton(String TITLE)
	{
		try {
			waitHelper.waitForElement(amazonPasswordTitle, 10);
	
			amazonPasswordTitle.getText().equals(TITLE);
		} catch (Exception e) {
			System.out.println("Expected Title is not visible");
		}
	}	

	public void validateAmazonSignInText(String SignIn)
	{
		try {
			waitHelper.waitForElement(amazonSignInText, 10);
			amazonSignInText.getText().equals("SignIn");
		} catch (Exception e) {
			System.out.println("Expected Text is not displayed");
		}
	}

	public void validateAmazonEmailText(String Email)
	{
		try {
			waitHelper.waitForElement(amazonEmailText, 10);
			amazonEmailText.getText().equals("Email or mobile phone number");
		} catch (Exception e) {
			System.out.println("Expected Text is not displayed");
		}
	}

	public void validateAmazonlegalText(String LegalText)
	{
		try {
			waitHelper.waitForElement(amazonlegalText, 10);
			amazonlegalText.getText().equals("By continuing, you agree to Amazon's Conditions of Use and Privacy Notice.");
		} catch (Exception e) {
			System.out.println("Expected Text is not displayed");
		}
	}

	public void clickAmazonConditionLink1()
	{
		try {
			waitHelper.waitForElement(amazonConditionLink1, 10);
			amazonConditionLink1.click();
		} catch (Exception e) {
			System.out.println("Unable to click on the Conditions of Use Link");
		}
	}

	public void validateAmazonConditionLink1Navigation()
	{
		try {
			waitHelper.waitForElement(amazonConditionLink1, 10);
			amazonConditionLink1.click();
		
			ldriver.getTitle().equals("Conditions of Use - Amazon Customer Service");
		} catch (Exception e) {
			System.out.println("Expected Page Title is not displayed");
		}
	}

	public void clickAmazonConditionLink2()
	{
		try {
			waitHelper.waitForElement(amazonConditionLink2, 10);
			amazonConditionLink2.click();
		} catch (Exception e) {
			System.out.println("Unable to click on the Conditions of Use second Link");
		}
	}

	public void validateAmazonConditionLink2Navigation()
	{
		try {
			waitHelper.waitForElement(amazonConditionLink2, 10);
			amazonConditionLink2.click();
			windowHandler.getTitleForSecondTab("Conditions of Use - Amazon Customer Service");
		
		} catch (Exception e) {
			System.out.println("Expected Page Title is not displayed in new tab");
		}
	}

	public void clickamazonNeedHelpLink()
	{
		try {
			waitHelper.waitForElement(amazonNeedHelpLink, 10);
			amazonNeedHelpLink.click();
		

		} catch (Exception e) {
			System.out.println("Unable to click Need Help Link");
		}
	}

	public void validateAmazonNeedHelpLinkIsClicked()
	{
		try {
			waitHelper.waitForElement(amazonNeedHelpLink, 10);
			amazonNeedHelpLink.click();
			amazonForgotPasswordLink.isDisplayed();
			amazonOtherSignInIssuesLink.isDisplayed();
	
		} catch (Exception e) {
			System.out.println("Unable to click Need Help Link");
		}
	}

	public void clickAmazonForgotPasswordLink()
	{
		try {
			waitHelper.waitForElement(amazonForgotPasswordLink, 10);
			amazonNeedHelpLink.click();
			amazonForgotPasswordLink.click();
		
			ldriver.getTitle().equals("Amazon Password Assistance");
		} catch (Exception e) {
			System.out.println("Unable to click Forgot Password Link");
		}
	}

	public void clickAmazonOtherSignInIssuesLink()
	{
		try {
			waitHelper.waitForElement(amazonOtherSignInIssuesLink, 10);
			amazonNeedHelpLink.click();
			amazonOtherSignInIssuesLink.click();
	
			ldriver.getTitle().equals("Amazon.in - Account & Login Issues");
		} catch (Exception e) {
			System.out.println("Unable to click Other Sign In Issues Link");
		}
	}	

	public void validateAmazonNewToAmazonText()
	{
		try {
			waitHelper.waitForElement(amazonNewToAmazonText, 10);
			amazonNewToAmazonText.getText().equals("New to Amazon?");
		} catch (Exception e) {
			System.out.println("Expected Text is not displayed");
		}
	}

	public void validateAmazonCreateAccountButton()
	{
		try {
			waitHelper.waitForElement(amazonCreateAccountButton, 10);
			amazonCreateAccountButton.click();
		
			ldriver.getTitle().equals("Amazon Registration");
		} catch (Exception e) {
			System.out.println("Unable to click Create Account Button");
		}
	}

	public void validateAmazonPrivacyLink2()
	{
		try {
			waitHelper.waitForElement(amazonPrivacyLink2, 10);
			amazonPrivacyLink2.click();
		
			windowHandler.getTitleForSecondTab("Amazon.in Privacy Notice - Amazon Customer Service");
		} catch (Exception e) {
			System.out.println("Unable to click on Privacy Notice");
		}
	}

	public void validateAmazonPrivacyLink1()
	{
		try {
			waitHelper.waitForElement(amazonPrivacyLink1, 10);
			amazonPrivacyLink1.click();
			ldriver.getTitle().equals("Amazon.in Privacy Notice - Amazon Customer Service");
		} catch (Exception e) {
			System.out.println("Unable to click on Privacy Notice");
		}
	}

	public void validateAmazonHelpLink2(String page1)
	{
		try {
			waitHelper.waitForElement(amazonHelpLink2, 10);
			amazonHelpLink2.click();
			//waitHelper.waitForElement(amazonTodayDealsLink, 10);
			windowHandler.getTitleForSecondTab(page1);
			
		} catch (Exception e) {
			System.out.println("Unable to validate the page title");
		}
	}

	public void clickAmazonHelpLink2()
	{
		try {
			waitHelper.waitForElement(amazonHelpLink2, 10);
			amazonHelpLink2.click();
			
		} catch (Exception e) {
			System.out.println("Unable to click on Help");
		}
	}
	
	public void validateAmazonCopyRightsText()
	{
		try {
			waitHelper.waitForElement(amazonCopyRightsText, 10);
			amazonCopyRightsText.getText().equals("� 1996-2021, Amazon.com, Inc. or its affiliates");
		} catch (Exception e) {
			System.out.println("Expected CopyRights text is not displayed");
		}
	}


	public void closeBrowser()
	{
		ldriver.quit();
	}



}
