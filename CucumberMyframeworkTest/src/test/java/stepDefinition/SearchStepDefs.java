package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchStepDefs extends Driver{
	@When("he entes search value")
	public void he_entes_search_value() {
	    searchpage.searchitem();
	}

	@When("Click on search")
	public void click_on_search() {
	    searchpage.clicksearch();
	}

	@Then("he must see search products")
	public void he_must_see_search_products() {
		String expected = "Computing and Internet";
		String actual = searchpage.TheText();
		Assert.assertEquals(expected, actual);
	}

}
