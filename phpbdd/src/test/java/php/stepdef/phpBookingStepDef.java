package php.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import php.actions.PhpBookActions;
import php.utilities.PhpDriverSetup;

public class phpBookingStepDef {

	PhpBookActions bookActions = new PhpBookActions();
	
	@Given("^user navaigate on Php tour webpage$")
	public void user_navaigate_on_Php_tour_webpage() throws Throwable {
		String actualTitle = bookActions.PhpBookPage();
		

	}
	@Given("^user enters First Name \"([^\"]*)\"$")
	public void user_enters_First_Name(String FirstName) throws Throwable {
		bookActions.setFirstName(FirstName);
		Thread.sleep(3000);
	}

	@Given("^user enter Last Name  \"([^\"]*)\"$")
	public void user_enter_Last_Name(String LastName) throws Throwable {
		bookActions.setLastName(LastName);
		Thread.sleep(3000);
	}
	
	@Given("^User enters Email \"([^\"]*)\"$")
	public void user_enters_Email(String Email) throws Throwable {
		bookActions.setEmail(Email);
		Thread.sleep(3000);
	}
	
	@Given("^user enyters confirm email \"([^\"]*)\"$")
	public void user_enyters_confirm_email(String ConfirmEmail) throws Throwable {
		bookActions.setConfirmEmail(ConfirmEmail);
		Thread.sleep(3000);
	}

	@Given("^userenters contact number \"([^\"]*)\"$")
	public void userenters_contact_number(String ContactNumber) throws Throwable {
		bookActions.setContactNumber(ContactNumber);
		Thread.sleep(3000);
	}

	@Given("^user enters Address \"([^\"]*)\"$")
	public void user_enters_Address(String Address) throws Throwable {
		bookActions.setAddress(Address);
		Thread.sleep(3000);
	}

//	@Given("^User enters Country \"([^\"]*)\"$")
//	public void user_enters_Country(String Country) throws Throwable {
//		bookActions.setCountry(Country);
//		Thread.sleep(3000);
//	}

//	@Given("^user enters guest (\\d+) name \"([^\"]*)\"$")
//	public void user_enters_guest_name( String GuestName) throws Throwable {
//		bookActions.setGuestName(GuestName);
//		Thread.sleep(3000);
//	}
//
//	@Given("^user enters Guest (\\d+) passport \"([^\"]*)\"$")
//	public void user_enters_Guest_passport(String Guest1PassportNo) throws Throwable {
//		bookActions.setGuest1PassportNo(Guest1PassportNo);
//		Thread.sleep(3000);
//	}
//
//	@Given("^user enters guest (\\d+) age \"([^\"]*)\"$")
//	public void user_enters_guest_age( String Age) throws Throwable {
//		bookActions.setAge(Age);
//		Thread.sleep(3000);
//	
//	}
	
//	@Then("^User clicks on confirm this booking$")
//	public void user_clicks_on_confirm_this_booking() throws Throwable {
		WebDriverWait wait=new WebDriverWait(PhpDriverSetup.getDriver(),5);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id="bookingdetails"]/div[9]/button")));
//		bookActions.bookingButtonClick();
//	    Thread.sleep(3000);
	}

