package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI{
	
	@FindBy(css = "input[placeholder='Email']")
	WebElement emailSignUp;
	
	@FindBy(css = "input[placeholder='Password']")
	WebElement signUpPassword;
	
	@FindBy(css = ".btn.btn-primary")
	WebElement signUpButton;
	
	@FindBy(linkText = "Sign in")
	WebElement signInButton;
	
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailSignUp(String esignUp) {
		enter(emailSignUp, esignUp);
	}
	public void enterpasswordSignUp(String pSignUp) {
		enter(signUpPassword, pSignUp);
	}
	
	public void clickSignUpButton() {
		click(signUpButton);
	}
	public void clicksignInButtonLink() {
		click(signInButton);
	}

}

