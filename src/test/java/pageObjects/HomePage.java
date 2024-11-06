package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Common;


public class HomePage extends Common {
	WebDriver driver;
	@FindBy(xpath="//*[text()='REGISTER']")
	public static WebElement RegisterButton;
	public static WebElement getRegisterButton() {
		return RegisterButton;
	}
	public HomePage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickRegisterLink()
	{
		click(driver, getRegisterButton(), "Register");
	}
}
