package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.SignUpPage;
import utils.TestContextSetup;

public class teststepdefinitions  {
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	HomePage homePage;
	SignUpPage signUpPage;

	public teststepdefinitions(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.homePage =testContextSetup.pageObjectManager.getLandingPage();
	}


	
	@Given("I click on register button")
	public void clickRegister() throws IOException
	{
		testContextSetup.driver=testContextSetup.testBase.driver;
		homePage=new HomePage(testContextSetup.driver);
		homePage.clickRegisterLink();
	}

	@When("I enter mandatory details")
	public void enterDetails()
	{
		signUpPage=new SignUpPage(testContextSetup.driver);
		signUpPage.performRegistration();
	}
}
