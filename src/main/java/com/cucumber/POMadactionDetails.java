package com.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMadactionDetails {
	
	static WebDriver driver;

	public POMadactionDetails(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getLocationDetails() {
		return locationDetails;
	}

	public WebElement getHoteldetails() {
		return Hoteldetails;
	}

	public WebElement getRoomDetails() {
		return RoomDetails;
	}

	public WebElement getRoomNumberDetails() {
		return RoomNumberDetails;
	}

	public WebElement getCheckinDate() {
		return CheckinDate;
	}

	public WebElement getCheckoutDate() {
		return CheckoutDate;
	}

	public WebElement getAdultCount() {
		return AdultCount;
	}

	public WebElement getChildcount() {
		return Childcount;
	}

	@FindBy(xpath = "//select[@id='location']")
	private WebElement locationDetails;
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement Hoteldetails;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement RoomDetails;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement RoomNumberDetails;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement CheckinDate;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement CheckoutDate;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement AdultCount;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement Childcount;
	
	public WebElement getSearchBut() {
		return SearchBut;
	}


	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[10]/td[2]/input[1]")
	private WebElement SearchBut;
	
}
