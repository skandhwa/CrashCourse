package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/java/resources/",
		glue= {"stepDefinition"},
		dryRun=false,
		monochrome=false,
		tags="@smoke",
		
		plugin= {"pretty","html:target/HtmlReport/index.html",
				"json:target/Cucumberreports/cucumber.json",
				
		    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        		
		
		
		
		)














public class TestRunner extends AbstractTestNGCucumberTests {

	
	
	
}
