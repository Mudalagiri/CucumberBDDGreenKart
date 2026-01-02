package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.TestContextsetup;


public class landingPage {
	public WebDriver driver;
	//TestContextsetup testContextinstance;
	
	public landingPage(WebDriver driver) {
		
		this.driver=driver;
		
	}

	By search = By.cssSelector(".search-keyword");
	By productName = By.cssSelector("h4.product-name");
	By IncreaseCount = By.cssSelector(".increment");
	By addToCart = By.xpath("//button[text()='ADD TO CART']");
	By checkoutIcon = By.xpath("//img[@src=\"https://rahulshettyacademy.com/seleniumPractise/images/bag.png\"]");
	By checkoutButton = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName() {
		
		return driver.findElement(productName).getText();		
	}
	
	public void increaseCount() {
		for(int i=1;i<4;i++) {
		 driver.findElement(IncreaseCount).click();
		}
	}
	
	public void addToCart() {
		driver.findElement(addToCart).click();
	}
	
	public void clickonCheckoutIcon() {
		driver.findElement(checkoutIcon).click();
	}
	
	public void naviagteToCheckout() {
		driver.findElement(checkoutButton).click();
		
	}
	

}
