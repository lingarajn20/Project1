package com.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMadactinConfirm {
	static WebDriver driver;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[19]/td[2]/input[1]")
	private WebElement BookBut;

	public POMadactinConfirm(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getBookBut() {
		return BookBut;
	}
	
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement LogoutBut;

	public WebElement getLogoutBut() {
		return LogoutBut;
	}

	@FindBy(xpath = "//a[text()='Click here to login again']")
	private WebElement logAgainBut;

	public WebElement getLogAgainBut() {
		return logAgainBut;
	}
	
}
