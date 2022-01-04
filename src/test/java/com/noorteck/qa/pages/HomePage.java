package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{

	@FindBy(linkText = "Home")
	WebElement homeLinkButton;
	
	@FindBy(linkText = "Addresses")
	WebElement addressesButton;
	
	@FindBy(linkText = "Sign out")
	WebElement signoutButton;
	
	@FindBy(css = "div[class='text-center'] h1")
	WebElement welcometoAddressBookMessage;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectAddresses() {
		click(addressesButton);
	}
	
	public void getWelcomeMessage() {
		getText(welcometoAddressBookMessage);
	}
}
