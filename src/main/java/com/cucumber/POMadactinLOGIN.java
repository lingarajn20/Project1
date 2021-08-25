package com.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMadactinLOGIN {
	
	static WebDriver driver;

	public POMadactinLOGIN(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginBut() {
		return loginBut;
	}

	@FindBy(id = "username")
	private WebElement Username;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[6]/td[2]/input")
	private WebElement loginBut;
	
	
}
