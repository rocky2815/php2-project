package php.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import php.actions.PhpLoginActions;
import php.utilities.PhpDriverSetup;


public class PhpLoginStepDef {

PhpLoginActions loginActions = new PhpLoginActions();
	
	@Given("^Php login page is launched$")
	public void php_login_page_is_launched() {
	String actualTitle = loginActions.PhpLoginPage();
		// Assert.assertEquals(acttualTitle, expected);
		System.out.println(actualTitle);   
	}

	@When("^Userinput wrong \"([^\"]*)\" and wrong \"([^\"]*)\"$")
	public void userinput_wrong_and_wrong(String Email, String password) throws Exception {
		loginActions.setEmail(Email);
		Thread.sleep(3000);
		loginActions.setPassword(password);
		Thread.sleep(3000);
	
    }

	@When("^I click on login$")
    public void i_click_on_login() throws Exception {
    WebDriverWait wait=new WebDriverWait(PhpDriverSetup.getDriver(),50);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loginfrm\"]/button")));
	loginActions.loginClick();
    Thread.sleep(3000);
	}
	

		@Then("^I should receive an error message$")
		 public void i_should_receive_an_error_message() {
		Assert.assertEquals(loginActions.errorReadMsg(), true);
	 }

		@When("^Userinput right \"([^\"]*)\" and  \"([^\"]*)\"$")
		public void userinput_right_and(String Email, String password) throws Throwable {
			loginActions.setEmail(Email);
			loginActions.setPassword(password);
	
		}    
		@When("^User clicks my profile button$")
		public void user_clicks_my_profile_button() throws Throwable {
			 WebDriverWait wait=new WebDriverWait(PhpDriverSetup.getDriver(),50);
			    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loginfrm\"]/button")));
				loginActions.loginClick();
			    Thread.sleep(3000);
		}

	}
