package TestNGRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


public class failedCasesTestRunner {
	
	@CucumberOptions(features="@target/failed_scenarios.txt",glue="stepdefinitions",monochrome=true,
	plugin= {"html:target/report.html","json:target/report.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

	public class first extends AbstractTestNGCucumberTests{
		
		
		@Override
		@DataProvider(parallel=true)
		public Object[][] scenarios()
		{
			return super.scenarios(); //for parallel executions of scenarios
		}
		
		
	}


}
