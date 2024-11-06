package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				glue={"stepdefinitions"},dryRun =false ,monochrome = true,
		features = "src/test/java/features/test.feature"
		)
public class TestRunnerwithExtentReports {
	
}

