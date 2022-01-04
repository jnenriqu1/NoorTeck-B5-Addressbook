package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) {
		String url = "http://a.testaddressbook.com/sign_up";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		testCaseOne();
		CommonUI.quitBrowser();
		
		String urlTwo = "http://a.testaddressbook.com/sign_in";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(urlTwo);
		initializeClassObj();
		testCaseTwo();
		
		CommonUI.quitBrowser();
	}

	public static void testCaseOne() {
		signupObj.enterEmailSignUp("manchester@yahoo.com");
		signupObj.enterpasswordSignUp("united");
		signupObj.clickSignUpButton();
		homepageObj.getWelcomeMessage();		

	}
	
	public static void testCaseTwo() {
		signinObj.enterEmailSignIn("enriquez@gmail.com");//3
		signinObj.enterPasswordSignIn("P@ssword1");//4
		signinObj.signInButton();//5
		homepageObj.selectAddresses();//6
		addresspageObj.newaddressPageButton();//7
		addresspageObj.enterFirstName("John");//8
		addresspageObj.enterLastName("Enriquez");//9
		addresspageObj.enterAddressField("303 Flex Dr");//10
		addresspageObj.enterCityField("Wheaton");//11
		addresspageObj.selectyourState("text", "Maryland");//12
		addresspageObj.enterzipcodeField("12345");
		addresspageObj.selectradioButtonUS();//13
		addresspageObj.enterAgeField("22");//14
		addresspageObj.enterPhoneNumberField("444-444-4444");//15
		addresspageObj.selectradioButtonDancing();//16
		addresspageObj.enterTextBoxField("Automation is Fun");//18
		addresspageObj.selectCreateAddress();//19
		addresspageObj.getfirstName();//21
		addresspageObj.getlastName();//22
		addresspageObj.getCity();//23
		addresspageObj.getState();//24
		addresspageObj.selectListButton();//20
		
		
	}
	
}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/

