package com.AmazonLoginPage.utilities;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import org.testng.annotations.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features",
		glue     = {"src/test/java/parallel"},
		plugin   = {//"pretty", 
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun   = false,
		monochrome= true
		
			
		)


public class myParallelRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = true)
	
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
	
	

}
