package php.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import php.actions.PhpSignupActions;
import php.utilities.PhpDriverSetup;

public class PhpSignupStepDef {
	PhpSignupActions signupActions = new PhpSignupActions();
	
	@Given("^Php Register page is launched$")
	public void php_Register_page_is_launched()  {
		String actualTitle = signupActions.PhpSignupPage();
		// Assert.assertEquals(acttualTitle, expected);
		System.out.println(actualTitle);
	}

	@When("^I input my First Name \"([^\"]*)\"$")
	public void i_input_my_First_Name(String FirstName) throws InterruptedException  {
		signupActions.setFirstName(FirstName);
		Thread.sleep(3000);
		
	}

	@When("^I input my Last Name \"([^\"]*)\"$")
	public void i_input_my_Last_Name(String LastName) throws InterruptedException  {
		signupActions.setLastName(LastName);
		Thread.sleep(3000);
	}

	@When("^I input my Mobile Number \"([^\"]*)\"$")
	public void i_input_my_Mobile_Number(String MobileNumber) throws InterruptedException  {
		signupActions.setMobileNumber(MobileNumber);
		Thread.sleep(3000);
	}

	@When("^I input my Email Address \"([^\"]*)\"$")
	public void i_input_my_Email_Address(String Email) throws InterruptedException  {
		signupActions.setEmail(Email);
		Thread.sleep(3000);
	}

	@When("^I input my Password \"([^\"]*)\"$")
	public void i_input_my_Password(String Password) throws InterruptedException  {
		signupActions.setPassword(Password);
		Thread.sleep(3000);
	}

	@When("^I input my Confirm Password \"([^\"]*)\"$")
	public void i_input_my_Confirm_Password(String ConfirmPassword) throws InterruptedException  {
		signupActions.setConfirmPassword(ConfirmPassword);
		Thread.sleep(3000);
	}
	
	@Then("^I click on signup$")
	public void i_click_on_signup() throws InterruptedException  {
		 WebDriverWait wait=new WebDriverWait(PhpDriverSetup.getDriver(),5);
//		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")));
			signupActions.signupClick();
		    Thread.sleep(3000);
			}   
	}


