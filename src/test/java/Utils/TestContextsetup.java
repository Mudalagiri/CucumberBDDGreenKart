package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectsManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestContextsetup {
	
	public WebDriver driver;
	public String LandingPageProductname ;
	public PageObjectsManager PageObjectsManager;
	public TestBase testbase;
	public GenericUtils genericutils;
	
	public String secondLandingPageProductname;
	
	public String checkoutProdName;
	
	public TestContextsetup() throws IOException {
		testbase = new TestBase();
		PageObjectsManager = new PageObjectsManager(testbase.WebDriverManager());
		genericutils = new GenericUtils(testbase.WebDriverManager());
		
	}
	
	

	
	
}
