package php.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhpBookElements {

	
	//FirstName
	@FindBy(name="firstname")
	public WebElement FirstName;
	
	//Lastname
	@FindBy(name="lastname")
	public WebElement LastName;
	
	//Email
	@FindBy(xpath ="//*[@id=\"guestform\"]/div[2]/div[1]/label/input")
	public WebElement Email;
	
	//ConfirmEmail
	@FindBy(name="confirmemail")
	public WebElement ConfirmEmail;

	//ContactNumber
	@FindBy(xpath="//*[@id=\"guestform\"]/div[3]/div/label/input")
	public WebElement ContactNumber;

	//Address
	@FindBy (xpath= "//*[@id=\"guestform\"]/div[4]/div/label/input")
	public WebElement Address;
	
//	//Country
//	@FindBy(className="chosen-search-input")
//	public WebElement Country;

//	//Guest 1 Name
//	@FindBy(name="passport[1][name]")
//	public WebElement Guest1Name;
//	
//	//Guest1PassportNo
//	@FindBy(xpath="//*[@id=\"bookingdetails\"]/div[7]/div/div/div/div[1]/div[2]/label/input")
//	public WebElement Guest1PassportNo;
//	
//	//Age
//	@FindBy(xpath="//*[@id=\"bookingdetails\"]/div[7]/div/div/div/div[1]/div[3]/label/input")
//	public WebElement Age;

	//BookingButton
//	@FindBy(xpath="//*[@id=\"bookingdetails\"]/div[9]/button")
//	public WebElement BookingButton;



	
	
	
}