package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public HomePage landingPage;

	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	
	
	public HomePage getLandingPage()
	{
	
	 landingPage= new HomePage(driver);
	 return landingPage;
	}
	
	
}
