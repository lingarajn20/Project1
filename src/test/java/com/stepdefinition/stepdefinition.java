package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.BaseClass;
import com.cucumber.POMadactinLOGIN;
import com.runnerTest.RunnerTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition extends BaseClass {

	public static WebDriver driver= RunnerTest.driver;
	
	POMadactinLOGIN login = new POMadactinLOGIN(driver);
	
	@Given("^user launched the application$")
	public void user_launched_the_application() throws Throwable {
		BrowserUrlLaunch("https://adactinhotelapp.com/index.php");
	}

	@When("^user enter the valid username in username field$")
	public void user_enter_the_valid_username_in_username_field() throws Throwable {
	    passtheValues(login.getUsername(), "Chandrasekar123");
	}

	@And("^user enter the valid password in password field$")
	public void user_enter_the_valid_password_in_password_field() throws Throwable {
	  passtheValues(login.getPassword(), "Sekar@234");
	}

	@Then("^click on the Login button and enter next page$")
	public void click_on_the_Login_button_and_enter_next_page() throws Throwable {
	   clickthelement(login.getLoginBut());
	}


}
