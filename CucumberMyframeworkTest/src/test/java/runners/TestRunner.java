package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Login.feature","src/test/resources/Search.feature"},
		glue = "stepDefinition"
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}


