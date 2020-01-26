package php.actions;

import org.openqa.selenium.support.PageFactory;

import php.elements.PhpContactElements;
import php.utilities.PhpDriverSetup;

public class PhpContactActions {



	PhpContactElements contactTest;

	public PhpContactActions() {
		this.contactTest = new PhpContactElements();
		PageFactory.initElements(PhpDriverSetup.driver, contactTest);

	}

	public String PhpContactPage() {
		PhpDriverSetup.driver.get("https://www.phptravels.net/contact-us");
		String title = PhpDriverSetup.driver.getTitle();
		return title;

	}
	
	public void setName(String Name) {
	contactTest.Name.sendKeys(Name);	
	
	}
	
	public void setEmail(String Email) {
		contactTest.Email.sendKeys(Email);	
		
	}
	
	public void setSubject(String Subject) {
		contactTest.Subject.sendKeys(Subject);	
		
	}	
		
		
	public void setMessage(String Message) {
		contactTest.Message.sendKeys(Message);
	}
	
	public void submitButtonClick() {
		contactTest.submitButton.click();
	}
	
		
		
	}
