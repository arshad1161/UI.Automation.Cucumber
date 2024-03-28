package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\arshe\\git\\ui.automation.cucumber\\ui.automation.cucumber\\src\\test\\java\\feature\\Login.feature",
		glue = {"stepDefinitions","hooks"},
       	// tags = "@SmokeTest1",
		publish=true,
		monochrome = true,
		plugin={"pretty","html:target/CucumberReports/CucumberReport.html",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
       
public class runnerfile extends AbstractTestNGCucumberTests {

}
