package utils;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class Common {

	public boolean click(WebDriver driver,WebElement ele,String elementName)
	{
		boolean flag=false;
		if(ele.isDisplayed())
		{
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].style.border='2px solid red'", ele);
			js.executeScript("arguments[0].style.background='yellow'", ele);
			ele.click();
			flag=true;
			ExtentCucumberAdapter.addTestStepLog("user clicked the <B>"+elementName+"</B>");
		}
		else
		{
			ExtentCucumberAdapter.addTestStepLog("user is not clicked the <B>"+elementName+"</B>");
		}
		return flag;
	}
		public boolean enterText(WebDriver driver,WebElement ele,String str,String elementName)
		{
			boolean flag=false;
			try
			{
				if(ele.isDisplayed())
				{
					JavascriptExecutor js =(JavascriptExecutor)driver;
	
					js.executeScript("arguments[0].style.border='2px solid red'", ele);
					js.executeScript("arguments[0].style.background='yellow'", ele);
	
					ele.sendKeys(str);
					
					flag=true;
				}
				ExtentCucumberAdapter.addTestStepLog("user should enter the <B>"+elementName+"</B> as <B>" +str);
			}
			catch(Exception e)
			{
				ExtentCucumberAdapter.addTestStepLog("user should enter the <B>"+elementName+"</B> as <B>" +str);
				
	
			}
			return flag;
		}
	public boolean selectDropdown(String str,List<WebElement> ele)
	{
		boolean flag=false;
		for(WebElement ele1:ele)
		{
			if(ele1.getText().equals(str))
			{
				ele1.click();
				flag = true;
			}
		}
		return flag;
	}
	}
