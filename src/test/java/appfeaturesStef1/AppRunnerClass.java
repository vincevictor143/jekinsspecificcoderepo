package appfeaturesStef1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.TestNG;

@CucumberOptions
(
		features={"classpath:appfeatures1"},
		glue={"appfeaturesStef1"},
		plugin={"pretty",
				"html:target/cucumber-reports/amazonreports.html",
				"json:target/cucumber-report.json",
				"rerun:target/failedrun.txt"}
)

public class AppRunnerClass extends AbstractTestNGCucumberTests 
{
	
}
