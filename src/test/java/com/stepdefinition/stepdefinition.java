package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Adactionhelper.FileReaderManager;
import com.cucumber.BaseClass;
import com.cucumber.POMadactinConfirm;
import com.cucumber.POMadactinLOGIN;
import com.cucumber.POMadactinPayment;
import com.cucumber.POMadactionDetails;
import com.google.common.eventbus.DeadEvent;
import com.runnerTest.RunnerTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition extends BaseClass {

	public static WebDriver driver= RunnerTest.driver;

	POMadactinLOGIN login = new POMadactinLOGIN(driver);
	POMadactionDetails details = new POMadactionDetails(driver);
	POMadactinPayment pay = new POMadactinPayment(driver);
	POMadactinConfirm confirm = new POMadactinConfirm(driver);
	
	@Given("^user launched the application$")
	public void user_launched_the_application() throws Throwable {
		String urL = FileReaderManager.getInstanceFR().getInstanceCR().getURL();
		BrowserUrlLaunch(urL);
	}

	@When("^user enter the valid username in username field$")
	public void user_enter_the_valid_username_in_username_field() throws Throwable {
	    passtheValues(login.getUsername(), "Chandrasekar123");
	}

	@When("^user enter the valid password in password field$")
	public void user_enter_the_valid_password_in_password_field() throws Throwable {
	    passtheValues(login.getPassword(), "Sekar@234");
	}

	@Then("^click on the Login button and enter next page$")
	public void click_on_the_Login_button_and_enter_next_page() throws Throwable {
	    clickthelement(login.getLoginBut());	
	    }

	@When("^user select the location from available list$")
	public void user_select_the_location_from_available_list() throws Throwable {
		DropDownBox(details.getLocationDetails(), "value", "London", 0);
	}

	@When("^user select the hotel from available list$")
	public void user_select_the_hotel_from_available_list() throws Throwable {
	    DropDownBox(details.getHoteldetails(), "value", "Hotel Cornice", 0);
	}

	@When("^user select the Room type from available list$")
	public void user_select_the_Room_type_from_available_list() throws Throwable {
	    DropDownBox(details.getRoomDetails(), "value", "Super Deluxe", 0);
	}

	@When("^user select the Number of rooms$")
	public void user_select_the_Number_of_rooms() throws Throwable {
	    DropDownBox(details.getRoomNumberDetails(), "value", "3", 0);;
	}

	@When("^clear the check in date$")
	public void clear_the_check_in_date() throws Throwable {
	    details.getCheckinDate().clear();
	}

	@When("^enter the check in date$")
	public void enter_the_check_in_date() throws Throwable {
	    passtheValues(details.getCheckinDate(), "29/08/2021");
	}

	@Then("^clear the check Out date$")
	public void clear_the_check_Out_date() throws Throwable {
	    details.getCheckoutDate().clear();
	}

	@Then("^enter the check Out date$")
	public void enter_the_check_Out_date() throws Throwable {
	   passtheValues(details.getCheckoutDate(), "31/08/2021");
	}

	@Then("^select the Adult count per room$")
	public void select_the_Adult_count_per_room() throws Throwable {
	    DropDownBox(details.getAdultCount(), "value", "3", 0);
	}

	@Then("^select the Child count per room$")
	public void select_the_Child_count_per_room() throws Throwable {
		 DropDownBox(details.getChildcount(), "value", "1", 0);
	}

	@Then("^Click the search button$")
	public void click_the_search_button() throws Throwable {
	    clickthelement(details.getSearchBut());
	}

	@When("^User select the checkbox$")
	public void user_select_the_checkbox() throws Throwable {
	    clickthelement(pay.getRadioBut());
	}

	@Then("^click on the Continue button$")
	public void click_on_the_Continue_button() throws Throwable {
	    clickthelement(pay.getContinueBut());
	}

	@When("^user enter the first name$")
	public void user_enter_the_first_name() throws Throwable {
	    passtheValues(pay.getFirstNamedetails(), "Chandra");
	}

	@When("^user enter the last name$")
	public void user_enter_the_last_name() throws Throwable {
	    passtheValues(pay.getLastnameDetails(), "Sekar");
	}

	@When("^user enter the address$")
	public void user_enter_the_address() throws Throwable {
	    passtheValues(pay.getAddressDetails(), "Door no.19 "
	    		+ "Kanagi street"
	    		+"Ramapuram-600089");
	}

	@When("^user enter the Card number$")
	public void user_enter_the_Card_number() throws Throwable {
	    String cardNumber = FileReaderManager.getInstanceFR().getInstanceCR().getCardNumber();
	    passtheValues(pay.getCardNoDetails(), cardNumber);
	}

	@When("^user select the Card type$")
	public void user_select_the_Card_type() throws Throwable {
	    DropDownBox(pay.getCardTypeDetails(), "value", "MAST", 0);
	}

	@Then("^user enter the expiry month of the card$")
	public void user_enter_the_expiry_month_of_the_card() throws Throwable {
	    DropDownBox(pay.getCardExpMonDetails(), "value", "2", 0);
	}

	@Then("^user enter the expiry year of the card$")
	public void user_enter_the_expiry_year_of_the_card() throws Throwable {
	    DropDownBox(pay.getCardExpYearDetails(), "value", "2022", 0);
	}

	@Then("^enter the CVV number$")
	public void enter_the_CVV_number() throws Throwable {
		String cvv = FileReaderManager.getInstanceFR().getInstanceCR().getCVV();
	    passtheValues(pay.getCVVdetails(), cvv);
	}

	@Then("^Click on the Book now button$")
	public void click_on_the_Book_now_button() throws Throwable {
	    clickthelement(confirm.getBookBut());
	    implicitWait(10);
	}

	@When("^User confirms the booking confirmation$")
	public void user_confirms_the_booking_confirmation() throws Throwable {
	    implicitWait(10);
	}

	@Then("^Logout of the page$")
	public void logout_of_the_page() throws Throwable {
		  clickthelement(confirm.getLogoutBut());
	}
	
	

}
