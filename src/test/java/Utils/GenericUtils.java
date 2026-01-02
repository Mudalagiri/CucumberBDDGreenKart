package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void switchToDealsPage(){
		Set<String> handles =driver.getWindowHandles();
		Iterator<String> handlesIT = handles.iterator();
		String parentId= handlesIT.next();
		String ChildId = handlesIT.next();
		driver.switchTo().window(ChildId);
		}

}
