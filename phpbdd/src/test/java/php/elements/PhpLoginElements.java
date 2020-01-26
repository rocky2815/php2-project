package php.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhpLoginElements {

	//Email
	@FindBy(name="username")
	public WebElement Email;

	//Password
	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	
	//Login Button
	@FindBy(xpath = "//*[@id=\"loginfrm\"]/button")
	public WebElement loginButton;

	//Login Error Message
	@FindBy(xpath = "//*[@id=\"loginfrm\"]/div[1]/div")
	public WebElement errorMsg;
	
	
		
}