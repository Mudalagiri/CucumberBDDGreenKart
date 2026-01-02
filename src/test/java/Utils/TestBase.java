package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public  WebDriver driver;
	
	
	public WebDriver WebDriverManager() throws IOException {
		
		
	//FileInputStream file = new FileInputStream("/Users/iamchandan/eclipse-workspace/cucumberfirst/src/test/resources/global.properties");
		//Above line woks on local machine only, so below is the alternative
		//FileInputStream file = new FileInputStream(System.getProperty("User.dir"+"//src//test//resources//global.properties"));
		FileInputStream file = new FileInputStream(
			    System.getProperty("user.dir")
			    + "/src/test/resources/global.properties");
		Properties properties = new Properties();
		properties.load(file);
		
		String Url = properties.getProperty("QAUrl");
		
		if(driver == null) { //create a new driver only when there are no existing driver instance,
			//or else it will create new driver obj everytime any class calls this
			
			
		if(properties.getProperty("browser").equalsIgnoreCase("chrome")) {
			
		driver= new ChromeDriver();
		
		}
		
		
		if(properties.getProperty("browser").equalsIgnoreCase("firefox")) {
			
			//firefox browser launching
		}
		
		
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"); 
		
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(Url);
		}
		return driver;
		
		
		
	}

}
