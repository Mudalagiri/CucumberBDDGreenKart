package pageObjects;

import org.openqa.selenium.WebDriver;



public class PageObjectsManager {
	public landingPage landingPage;
	public dealPage dealPage;
	public checkoutPage checkoutpage;
	public WebDriver driver;
	
	
	public PageObjectsManager(WebDriver driver){
		this.driver=driver;
		
	}
	
	public landingPage getlandingPageObjects() {
		landingPage landingPage = new landingPage(driver);
		return landingPage;
	}
	
	public dealPage getdealPageObjects() {
		dealPage= new dealPage(driver);
		return dealPage;
		
	}
	
	public checkoutPage getcheckoutPageObjects() {
		checkoutpage = new checkoutPage(driver);
		return checkoutpage;
	}

}
