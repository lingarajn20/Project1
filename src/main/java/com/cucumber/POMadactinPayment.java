package com.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMadactinPayment {
	
	static WebDriver driver;
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement RadioBut;
	
	public POMadactinPayment(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadioBut() {
		return RadioBut;
	}

	public WebElement getFirstNamedetails() {
		return firstNamedetails;
	}

	public WebElement getLastnameDetails() {
		return LastnameDetails;
	}

	public WebElement getAddressDetails() {
		return AddressDetails;
	}

	public WebElement getCardNoDetails() {
		return CardNoDetails;
	}

	public WebElement getCardTypeDetails() {
		return CardTypeDetails;
	}

	public WebElement getCardExpMonDetails() {
		return CardExpMonDetails;
	}

	public WebElement getCardExpYearDetails() {
		return cardExpYearDetails;
	}

	public WebElement getCVVdetails() {
		return CVVdetails;
	}

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstNamedetails;
	
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement LastnameDetails;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement AddressDetails;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement CardNoDetails;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement CardTypeDetails;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement CardExpMonDetails;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement cardExpYearDetails;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement CVVdetails;
	
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[3]/td/input[1]")
	private WebElement continueBut;

	public WebElement getContinueBut() {
		return continueBut;
	}


	
	
	
}
