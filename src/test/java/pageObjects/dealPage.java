package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dealPage {
	public WebDriver driver;
	
	public dealPage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	
	public By Topdeals = By.linkText("Top Deals");
	public By searchDealPageProduct = By.id("search-field");
	public By dealProductName = By.xpath("//tr/td[1]");
	
	public void SelectTopdealsPage() {
		driver.findElement(By.linkText("Top Deals")).click();
	}
	public void searchdealPageProductName(String name) {
		driver.findElement(By.id("search-field")).sendKeys(name);
	}
	
	public String getdelaPageProductname() {
		return driver.findElement(dealProductName).getText();
		
	}
	

}
