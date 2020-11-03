package zoopla.uk.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber-reports/cucumber.json"},	
	features = "Cucumber_Feature",	// location of folder
	glue = "zoopla.uk.stepdefination"//location of step defination
		
		)






public class MyRunner extends AbstractTestNGCucumberTests {

}
