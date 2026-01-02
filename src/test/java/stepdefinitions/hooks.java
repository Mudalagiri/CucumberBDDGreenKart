package stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;




import Utils.TestContextsetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class hooks {
	
	public TestContextsetup testcontextsetup;
	
	public hooks(TestContextsetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		
	}
	
	
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
	WebDriver driver = testcontextsetup.testbase.WebDriverManager();
	
	if(scenario.isFailed()) {
		
	//File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//byte[] filecontent=FileUtils.readFileToByteArray(source);
		
	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
	scenario.attach(screenshot, "image/png", "image"); //dont change names here only 'image' will work, not img or images
	}
		}
	
	
	
	
	 
	
	
	@After
	public void AfterScenario() throws IOException {
		testcontextsetup.testbase.WebDriverManager().quit();
		
	}
	

}
