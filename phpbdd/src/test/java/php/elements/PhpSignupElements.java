package php.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhpSignupElements {
	
	
		//FirstName
		@FindBy(name="firstname")
		public WebElement FirstName;

		//LastName
		@FindBy(name= "lastname")
		public WebElement LastName;
		
		//MobileNumber
		@FindBy(name = "phone")
		public WebElement MobileNumber;
		
		//Email
		@FindBy(xpath ="//input[@name='email']")
		public WebElement Email;
		
		//Password
		@FindBy(xpath = "//input[@name='password']")
		public WebElement Password;
		
		//ConfirmPassword
		@FindBy(name = "confirmpassword")
		public WebElement ConfirmPassword;
		
		//signup Button
		@FindBy(xpath = "//*[@id=\"headersignupform\"]/div[8]/button")
		public WebElement signupButton;

		

	}

