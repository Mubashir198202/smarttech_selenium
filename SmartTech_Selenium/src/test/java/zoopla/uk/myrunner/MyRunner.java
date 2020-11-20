package zoopla.uk.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		//with plugin we can generate the report  & we can specify the location or formet
		//plugin= {"pretty","json:target/cucumber-reports/cucumber.json"},
		
		plugin ={"pretty","html:target/cucumber-reports/cucumber.json", "json:target/cucumber.json"},
		
		monochrome = true,// more clearly can read the file
		
	features = "Cucumber_Feature",	// location of folder
	
	glue = "zoopla.uk.stepdefination"//location of step defination
	
	//tags = "@Test_1,@Test_2"
	
		)






public class MyRunner extends AbstractTestNGCucumberTests {

}
