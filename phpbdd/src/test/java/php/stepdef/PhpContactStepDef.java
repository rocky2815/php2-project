package php.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import php.actions.PhpContactActions;
import php.utilities.PhpDriverSetup;

public class PhpContactStepDef {

	PhpContactActions contactActions = new PhpContactActions();
	
	@Given("^I navigate to php contact page$")
	public void i_navigate_to_php_contact_page() throws Throwable {
		String actualTitle = contactActions.PhpContactPage();
		// Assert.assertEquals(acttualTitle, expected);
		System.out.println(actualTitle);
	}

	@When("^I enter my name \"([^\"]*)\"$")
	public void i_enter_my_name(String Name) throws Throwable {
		contactActions.setName(Name);
		Thread.sleep(3000);
	}


@When("^I enter my Email \"([^\"]*)\"$")
public void i_enter_my_Email(String Email) throws Throwable {
	contactActions.setEmail(Email);
	Thread.sleep(3000);
}

@When("^I enter my subject \"([^\"]*)\"$")
public void i_enter_my_subject(String Subject) throws Throwable {
	contactActions.setSubject(Subject);
	Thread.sleep(3000);
}

@When("^I enter my message \"([^\"]*)\"$")
public void i_enter_my_message(String Message) throws Throwable {
	contactActions.setMessage(Message);
	Thread.sleep(3000);
}



	@Then("^I click submit button$")
	public void i_click_submit_button() throws Throwable {
		WebDriverWait wait=new WebDriverWait(PhpDriverSetup.getDriver(),5);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div/div/div[1]/form/div[2]/div[5]/div/input")));
		contactActions.submitButtonClick();
	    Thread.sleep(3000);
	}


}
