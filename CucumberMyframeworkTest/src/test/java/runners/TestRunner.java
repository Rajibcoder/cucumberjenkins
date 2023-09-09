package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Login.feature","src/test/resources/Search.feature"},
		glue = "stepDefinition",
		plugin = {"json:target/cucumber-report.json"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}


