package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage {
	public WebDriver driver;
	
	
	public checkoutPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By checkoutProductName = By.cssSelector(".product-name");
	By checkoutApplybutton = By.cssSelector(".promoBtn");
	By checkoutPlaceOrderButton = By.xpath("//button[text()='Place Order']");
	
	
	public String getcheckoutProductname() {
		return driver.findElement(checkoutProductName).getText();
	}
	
	public boolean checkApplybutton() {
		return driver.findElement(checkoutApplybutton).isDisplayed();
	}
	
	public void placeOrder() {
		driver.findElement(checkoutPlaceOrderButton).click();
	}

}
