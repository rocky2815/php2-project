package php.actions;

import org.openqa.selenium.support.PageFactory;


import php.elements.PhpSignupElements;
import php.utilities.PhpDriverSetup;

public class PhpSignupActions {
	PhpSignupElements signupTest;

	public PhpSignupActions() {
		this.signupTest = new PhpSignupElements();
		PageFactory.initElements(PhpDriverSetup.driver, signupTest);

	}

	public String PhpSignupPage() {
		PhpDriverSetup.driver.get("https://www.phptravels.net/register");
		String title = PhpDriverSetup.driver.getTitle();
		return title;

	}

	public void setFirstName(String FirstName) {
		signupTest.FirstName.sendKeys(FirstName);

	}

	public void setLastName(String LastName) {
		signupTest.LastName.sendKeys(LastName);

	}
	
	public void setMobileNumber(String MobileNumber) {
		signupTest.MobileNumber.sendKeys(MobileNumber);
	}
	public void setEmail(String Email) {
		signupTest.Email.sendKeys(Email);
	}	
	public void  setPassword(String Password) {
		signupTest.Password.sendKeys(Password);
	}
	public void setConfirmPassword(String ConfirmPassword) {
		signupTest.ConfirmPassword.sendKeys(ConfirmPassword);
	}
		public void signupClick() {
		signupTest.signupButton.click();
	}

	


}
