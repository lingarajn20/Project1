package com.runnerTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//Adactinfeature//com",
					glue="com.stepdefinition")

public class RunnerTest {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception {
		driver = BaseClass.BrowserLaunch("chrome");
		
	}
	
	@AfterClass
	public static void setdown() {
		driver.close();
	}
}
