package php.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import php.utilities.PhpDriverSetup;

public class PhpContactElements {
		
	
		//Name
		@FindBy(name="contact_name")
		public WebElement Name;
		
		//Email
		@FindBy(id="form_email")
		public WebElement Email;
		
		//Subject
		@FindBy(id ="form_subject")
		public WebElement Subject;
		
		//Message
		@FindBy(id="form_message")
		public WebElement Message;
		
		//Submit Button
		@FindBy(xpath = "//input[name='guest'}")
		public WebElement submitButton;
		
}
		
