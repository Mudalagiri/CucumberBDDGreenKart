package stepdefinitions;

import org.testng.Assert;

import Utils.TestContextsetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.checkoutPage;

public class checkoutPageStepDefinition {
	TestContextsetup testcontextinstance;
	public checkoutPage checkoutpageobj;
	public String checkoutProdName;
	
	
	
	public checkoutPageStepDefinition(TestContextsetup testcontextinstance) {
		this.testcontextinstance=testcontextinstance;
	}
	
	
	
	@Then("user seacrhes for same product in checkout page to check if product exists")
	public void user_searches_checkoutpage_productname() {
		
		//testcontextinstance.PageObjectsManager.getcheckoutPageObjects();
		//testcontextinstance.checkoutProdName=checkoutpageobj.getcheckoutProductname().split("-")[0].trim();
		
		checkoutPage checkoutpageobj=testcontextinstance.PageObjectsManager.getcheckoutPageObjects();
		testcontextinstance.checkoutProdName = checkoutpageobj.getcheckoutProductname().split("-")[0].trim();
		System.out.println("checkout page product name is " + testcontextinstance.checkoutProdName);
		
		Assert.assertEquals(testcontextinstance.LandingPageProductname, testcontextinstance.checkoutProdName);
	}
	
	@And("user verrifies Apply and Placeorder buttons exists")
	public void user_verifies_apply_PlaceOrderbuttons() throws InterruptedException {
		//System.out.println("Now user needs to verfy..to..to.");
		Thread.sleep(2000);
		testcontextinstance.PageObjectsManager.getcheckoutPageObjects().checkApplybutton();
		testcontextinstance.PageObjectsManager.getcheckoutPageObjects().placeOrder();
		
		
	}

}
