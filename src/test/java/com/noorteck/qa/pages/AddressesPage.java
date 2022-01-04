package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressesPage extends CommonUI {

	@FindBy(linkText = "New Address")
	WebElement newAddressLinkButton;

	@FindBy(name = "address[first_name]")
	WebElement firstNameField;

	@FindBy(name = "address[last_name]")
	WebElement lastNameField;

	@FindBy(name = "address[address1]")
	WebElement address1Field;

	@FindBy(name = "address[city]")
	WebElement cityField;

	@FindBy(name = "address[state]")
	WebElement dropDownState;
	
	@FindBy(css = "input[id='address_zip_code']")
	WebElement zipcodefield;

	@FindBy(xpath = "//*[@id=\'address_country_us\']")
	WebElement radioUSButton;

	@FindBy(name = "address[age]")
	WebElement ageTextBoxField;

	@FindBy(name = "address[website]")
	WebElement websiteField;

	@FindBy(name = "address[phone]")
	WebElement phonenumberField;

	@FindBy(xpath = "//*[@id=\'address_interest_dance\']")
	WebElement radioButtonDancing;

	@FindBy(xpath = "//*[@id=\'address_note\']")
	WebElement noteTextBoxField;

	@FindBy(name = "commit")
	WebElement createAddressButton;

	@FindBy(linkText = "List")
	WebElement listButton;

	@FindBy(css = "div[data-test='notice']")
	WebElement addresswasSuccesfullMessage;

	@FindBy(linkText = "Edit")
	WebElement editButton;

	@FindBy(css = "span[data-test='first_name']")
	WebElement firstnameVerification;

	@FindBy(css = "span[data-test='last_name']")
	WebElement lastnameVerification;

	@FindBy(css = "span[data-test='city']")
	WebElement cityVerification;

	@FindBy(css = "span[data-test='state']")
	WebElement stateVerification;

	public AddressesPage() {
		PageFactory.initElements(driver, this);
	}
	public void newaddressPageButton() {
		click(newAddressLinkButton);
	}

	public void enterFirstName(String firstName) {
		enter(firstNameField, firstName);
	}

	public void enterLastName(String lastName) {
		enter(lastNameField, lastName);
	}

	public void enterAddressField(String field1) {
		enter(address1Field, field1);
	}

	public void enterCityField(String city) {
		enter(cityField, city);
	}

	public void selectState() {
		click(dropDownState);
	}
	public void selectyourState(String myState, String indexTextValue) {
		selectFromDropdown(dropDownState, myState, indexTextValue);
	}
	public void enterzipcodeField(String value) {
		enter(zipcodefield, value);
	}

	public void selectradioButtonUS() {
		click(radioUSButton);
	}

	public void enterAgeField(String age) {
		enter(ageTextBoxField, age);
	}

	public void enterPhoneNumberField(String phoneNumber) {
		enter(phonenumberField, phoneNumber);
	}

	public void selectradioButtonDancing() {
		click(radioButtonDancing);
	}

	public void enterTextBoxField(String note) {
		enter(noteTextBoxField, note);
	}

	public void selectCreateAddress() {
		click(createAddressButton);
	}

	public void selectListButton() {
		click(listButton);
	}

	public void getfirstName() {
		getText(firstnameVerification);
	}

	public void getlastName() {
		getText(lastnameVerification);
	}

	public void getCity() {
		getText(cityVerification);
	}

	public void getState() {
		getText(stateVerification);
	}

}
