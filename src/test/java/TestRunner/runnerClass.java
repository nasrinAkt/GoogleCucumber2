package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resources/suggesFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefinition"	)//tags = {"@tag,@tag1"})
public class runnerClass extends AbstractTestNGCucumberTests{

}
