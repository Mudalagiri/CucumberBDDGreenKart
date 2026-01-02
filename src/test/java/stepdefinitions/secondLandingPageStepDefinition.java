package stepdefinitions;

import java.io.IOException;

import Utils.TestContextsetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.landingPage;

public class secondLandingPageStepDefinition {
	public TestContextsetup testContextinstance;
	//public String secondLandingPageProductname;
	
	public secondLandingPageStepDefinition(TestContextsetup testContextinstance) {
		this.testContextinstance=testContextinstance;
		
	}
	
	
	@And("user increases count of product and adds product to cart")
	public void increase_count_of_product() {
		
		testContextinstance.PageObjectsManager.getlandingPageObjects().increaseCount();
		testContextinstance.PageObjectsManager.getlandingPageObjects().addToCart();
	}
	
	@And("user clicks on checkout icon and proceedes to checkout page")
	public void user_proceeds_toCheckout_page() throws InterruptedException {
		
		testContextinstance.PageObjectsManager.getlandingPageObjects().clickonCheckoutIcon();
		Thread.sleep(2000);
		testContextinstance.PageObjectsManager.getlandingPageObjects().naviagteToCheckout();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
