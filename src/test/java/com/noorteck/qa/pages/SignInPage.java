package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI{

	@FindBy(xpath= "//*[@id=\'session_email\']")
	WebElement emailSignIn;
	
	@FindBy(xpath = "//*[@id=\'session_password\']")
	WebElement passwordSignIn;
	
	@FindBy(name = "commit")
	WebElement signInButton;
	
	@FindBy(linkText = "Sign up")
	WebElement signUpButton;
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailSignIn(String eSignIn) {
		enter(emailSignIn, eSignIn);
	}
	
	public void enterPasswordSignIn(String pSignIn) {
		enter(passwordSignIn,pSignIn );
	}
	public void signInButton() {
		click(signInButton);
	}
	
}
