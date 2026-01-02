package stepdefinitions;

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
import pageObjects.dealPage;

import pageObjects.PageObjectsManager;


public class dealPageStepdefiniton {
public WebDriver driver;
public String LandingPageProductname ;
public String dealPageProductname;
TestContextsetup testinstance;
public PageObjectsManager PageObjectsManager;

public dealPageStepdefiniton(TestContextsetup testinstance) {
	
	this.testinstance=testinstance;
	
}
	
	
	//@Then("user seacrhes for same product {string} in deals page to check if product exists")

    @Then("^user seacrhes for same product (.+) in deals page to check if product exists$")
	public void user_seacrhes_for_same_product_in_deals_page_to_check_if_product_exists(String prodName) throws InterruptedException {
	    //System.out.println("Then step yet to cover");
		
		//dealPage dealpageobj = new dealPage(testinstance.driver);// this line can be called uding pageobjmanager class obj
		
		//PageObjectsManager = new PageObjectsManager(testinstance.driver); //but it stills creates obj, hence we now use testcontext class to create obj of pageobj manager there
		dealPage dealpageobj = testinstance.PageObjectsManager.getdealPageObjects(); 
		// using Testcontext class instance to call pageObjectManager object. con we have createv pageobjmanager obj in testcontext constructor
		
		//testinstance.driver.findElement(By.linkText("Top Deals")).click();
		dealpageobj.SelectTopdealsPage();
		
		testinstance.genericutils.switchToDealsPage();
		
		
	
		
	
		
		
		//testinstance.driver.findElement(By.id("search-field")).sendKeys(prodName);
		dealpageobj.searchdealPageProductName(prodName);
		Thread.sleep(2000);
		
		//dealPageProductname= testinstance.driver.findElement(By.xpath("//tr/td[1]")).getText();
		dealPageProductname =dealpageobj.getdelaPageProductname();
		System.out.println("Deal page product name is " +dealPageProductname );
		
	}
	
	@And("validate if landing page product name is same as deal page product name")
	public void validate() {
		//Assert.assertEquals(testinstance.LandingPageProductname, dealPageProductname);// gives reverse output -expected [No data] but found [Beetroot
		// coz syntax ->Assert.asserequals(actual,expected)
		Assert.assertEquals(dealPageProductname,testinstance.LandingPageProductname);
	}
	

}
