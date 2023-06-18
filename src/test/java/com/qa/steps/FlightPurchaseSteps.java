package com.qa.steps;


import org.openqa.selenium.chrome.ChromeDriver;

import com.t3.qa.pages.FlightPurchase;
import com.t3.qa.pages.FlightPurchaseConfMessagePage;
import com.t3.qa.utils.ConstantsT3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightPurchaseSteps {
	
	//create object of both classes in PAGES packages
	FlightPurchase purchase;
	FlightPurchaseConfMessagePage messageConf;
	
	
	@Given("user navigates to purchase page {string}")
	public void userNavigatesToPurchasePage(String url) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ConstantsT3.driver = new ChromeDriver();
		Thread.sleep(2000);
		ConstantsT3.driver.manage().window().maximize();
		ConstantsT3.driver.get(url);
		Thread.sleep(2000);
		
		
		purchase = new FlightPurchase();
		messageConf = new FlightPurchaseConfMessagePage();
		
	}

	@When("user enters  Full Name {string}")
	public void userEntersFullName(String fullName) {
		purchase.enterName(fullName);
	}

	@When("user enters Address {string}")
	public void userEntersAddress(String address) {
		purchase.enterAddress(address);
	}

	@When("user enters City {string}")
	public void userEntersCity(String city) {
		purchase.enterCity(city);
	}

	@When("user enters State {string}")
	public void userEntersState(String state) {
		purchase.enterState(state);
	}

	@When("user enters ZipCode {string}")
	public void userEntersZipCode(String zipcode) {
		purchase.enterZipCode(zipcode);
	}

	@When("user selects Card Type {string}")
	public void userSelectsCardType(String cardType) {
		purchase.selectCardType(cardType);
	}

	@When("user enters Card Number {string}")
	public void userEntersCardNumber(String cardNumber) {
		purchase.enterCardNumber(cardNumber);
	}

	@When("user enters Card Month {string}")
	public void userEntersCardMonth(String cardMonth) {
		purchase.enterCardMonth(cardMonth);
	}

	@When("user enters Card Year {string}")
	public void userEntersCardYear(String cardYear) {
		purchase.enterCardYear(cardYear);
	}

	@When("user enters Name on the card {string}")
	public void userEntersNameOnTheCard(String nameOnCard) {
		purchase.enterNameOnCard(nameOnCard);
	}

	@When("user clicks on Remember me checkbox button")
	public void userClicksOnRememberMeCheckboxButton() {
		purchase.clickRememberMe();
	}

	@When("user clicks on Purchase Flight button")
	public void userClicksOnPurchaseFlightButton() {
		purchase.clickSubmitButton();
	}

	@Then("user verifies message confirmation {string}")
	public void userVerifiesMessageConfirmation(String message) throws InterruptedException {
		messageConf.verifyMessage(message);
		
		Thread.sleep(1000);
		ConstantsT3.driver.quit();
	}


}