package TestNGRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepdefinitions",monochrome=true,tags="@firstFeature",
plugin= {"html:target/report.html","json:target/report.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"})

public class first extends AbstractTestNGCucumberTests{
	
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios(); //for parallel executions of scenarios
	}
	
	
}
