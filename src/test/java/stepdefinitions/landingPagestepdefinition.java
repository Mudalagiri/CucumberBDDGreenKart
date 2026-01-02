package stepdefinitions;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.TestContextsetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.landingPage;

public class landingPagestepdefinition {
public WebDriver driver;
//public String prodName;
public String LandingPageProductname ;
TestContextsetup testContextinstance;

public landingPagestepdefinition(TestContextsetup testContextinstance){
	
	this.testContextinstance=testContextinstance;
	
}

	
	@Given("user lands on landing page")
	public void user_lands_on_landing_page() throws IOException {
		
		testContextinstance.testbase.WebDriverManager();
	}
	
	
	//@When("user searches for products {string} and extracts actual name of product")
	
	@When("^user searches for products (.+) and extracts actual name of product$")
	public void user_searches_for_products_and_extracts_actual_name_of_product(String prodName) throws InterruptedException {
		
		//landingPage landingPageObj = new landingPage(testContextinstance.driver);
		// here also we avoid creating object, we create pageobject obj in testcontext and call pageobj through testcontext class instance
		
		
		landingPage landingPageObj = testContextinstance.PageObjectsManager.getlandingPageObjects();
		
		
		landingPageObj.searchItem(prodName);
	
	    
		//testContextinstance.driver.findElement(By.cssSelector(".search-keyword")).sendKeys(prodName);
	    Thread.sleep(2000);
	    testContextinstance.LandingPageProductname = landingPageObj.getProductName().split("-")[0].trim();
	    System.out.println("Searched product in landing opage is" + testContextinstance.LandingPageProductname );
	}
	

}
