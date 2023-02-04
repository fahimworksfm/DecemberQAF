package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "Feature",
		glue = "steps",
		tags = "google"
		
		)
public class testRunner extends AbstractTestNGCucumberTests{

}
