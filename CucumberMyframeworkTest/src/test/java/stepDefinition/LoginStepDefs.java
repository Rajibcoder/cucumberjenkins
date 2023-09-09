package stepDefinition;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs extends Driver{

	@Given("a user is in the landing page")
	public void a_user_is_in_the_landing_page() {
	   assertTrue(driver.getTitle().equals("Demo Web Shop"));
	}

	@When("he clicks on Login")
	public void he_clicks_on_login() {
	   loginpage.getlogin();
	}

	@When("entes Email and Password")
	public void entes_email_and_password() {
	    loginpage.enter();
	}

	@When("Click on Login")
	public void click_on_login() {
		loginpage.clicklogin();
	}

	@Then("he must be login successfully")
	public void he_must_be_login_successfully() {
		String expected = "Log out";
		String actual = landing.TheText();
		Assert.assertEquals(expected, actual);
	}
}
