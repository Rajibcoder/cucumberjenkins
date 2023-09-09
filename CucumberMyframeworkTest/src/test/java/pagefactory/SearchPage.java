package pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	WebDriverWait wait;
	
	@FindBy(id="small-searchterms")
	private WebElement searchbar;
	
	@FindBy(xpath="//input[contains(@class,'button-1 search-box-button')]")
	private WebElement searchbtn;
	
	@FindBy(linkText = "Computing and Internet")
	private WebElement mytext;
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	public void searchitem() {
		searchbar.sendKeys("Computing and Internet");
	}
	
	public void clicksearch() {
		searchbtn.click();
	}
	
	public String TheText() {
		wait.until(ExpectedConditions.visibilityOf(mytext));
		return mytext.getText();
	}
}
