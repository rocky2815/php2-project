package php.actions;

import php.utilities.PhpDriverSetup;

import org.openqa.selenium.support.PageFactory;

import php.elements.PhpLoginElements;

public class PhpLoginActions {

	PhpLoginElements loginTest;

	public PhpLoginActions() {
		this.loginTest = new PhpLoginElements();
		PageFactory.initElements(PhpDriverSetup.driver, loginTest);

	}

	public String PhpLoginPage() {
		PhpDriverSetup.driver.get("https://www.phptravels.net/login");
		String title = PhpDriverSetup.driver.getTitle();
		return title;

	}

	public void setEmail(String Email) {
		loginTest.Email.sendKeys(Email);

	}

	public void setPassword(String password) {
		loginTest.password.sendKeys(password);

	}

	public void loginClick() {
		loginTest.loginButton.click();
	}

	public boolean errorReadMsg() {
		return loginTest.errorMsg.isDisplayed();
	}
	

	
}