package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Common;

public class SignUpPage extends Common {
	WebDriver driver;
	@FindBy(name="firstName")
	public static WebElement firstName;
	
	@FindBy(name="lastName")
	public static WebElement lastName;

	public static WebElement getLastName() {
		return lastName;
	}
	public static WebElement getFirstName() {
		return firstName;
	}
	public SignUpPage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void performRegistration()
	{
		enterText(driver, getFirstName(), "Dinesh", "firstName");
		enterText(driver, getLastName(), "Munigadapa", "lastName");

		
	}
}
