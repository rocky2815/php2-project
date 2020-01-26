package php.actions;



import org.openqa.selenium.support.PageFactory;

import php.elements.PhpBookElements;
import php.utilities.PhpDriverSetup;

public class PhpBookActions {

	PhpBookElements bookTest;

	public PhpBookActions() {
		this.bookTest = new PhpBookElements();
		PageFactory.initElements(PhpDriverSetup.driver, bookTest);

	}

	public String PhpBookPage() {
		PhpDriverSetup.driver.get("https://www.phptravels.net/tours/book/Old-and-New-Delhi-City-Tour?date=25%2F01%2F2020&adults=1&child=1&infant=1");
		String title = PhpDriverSetup.driver.getTitle();
		return title;

	}
	
	public void setFirstName(String FirstName) {
	bookTest.FirstName.sendKeys(FirstName);	
	
	}
	
	public void setLastName(String LastName) {
		bookTest.LastName.sendKeys(LastName);	
		
	}
	
	public void setEmail(String Email) {
		bookTest.Email.sendKeys(Email);	
		
	}	
		
		
	public void setConfirmEmail(String ConfirmEmail) {
		bookTest.ConfirmEmail.sendKeys(ConfirmEmail);

	}
	
	public void setContactNumber(String ContactNumber) {
	 bookTest.ContactNumber.sendKeys(ContactNumber);
	}
	
	public void setAddress(String Address) {
		bookTest.Address.sendKeys(Address);
	}
//	public void setCountry(String Country) {
//		bookTest.Country.sendKeys(Country);
//		
//	}
//	public void setGuestName(String GuestName) {
//		bookTest.Guest1Name.sendKeys(GuestName);
//	}
//	public void setGuest1PassportNo(String Guest1PassportNo) {
//		bookTest.Guest1PassportNo.sendKeys(Guest1PassportNo);
//	}
//	public void setAge(String Age) {
//		bookTest.Age.sendKeys(Age);
//	}
//	public void bookingButtonClick() {
//		bookTest.BookingButton.click();
	}
	
		
		
	

	