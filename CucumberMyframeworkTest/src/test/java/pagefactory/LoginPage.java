package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(linkText = "Log in")
	private WebElement login;
	
	@FindBy(id="Email")
	private WebElement Email;
	
	@FindBy(id="Password")
	private WebElement Password;
	
	@FindBy(xpath="//input[contains(@class,'button-1 login-button')]")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void getlogin() {
		login.click();
	}
	
	public void enter() {
		Email.sendKeys("Itest@test.com");
		Password.sendKeys("Itest@test");
	}
	
	public void clicklogin() {
		loginbtn.click();
	}
}
