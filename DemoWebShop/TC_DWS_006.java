package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_006 extends BaseClass {
	String expectJewellaryTitle="Demo Web Shop. Jewelry";
	@Test
	public void tocheckJewellary() {
		WebElement jewellary = driver.findElement(By.partialLinkText("Jewelry"));
		jewellary.click();
		String actualjewellaryTitle = driver.getTitle();
		if(expectJewellaryTitle.equals(actualjewellaryTitle)) {
			Reporter.log("Jewellary page is displayed sucessfully",true);
		}	
	}
}
