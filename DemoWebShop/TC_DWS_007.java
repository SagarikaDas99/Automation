package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_007 extends BaseClass {
	 String expectGiftCardTitle="Demo Web Shop. Gift Cards";
	 @Test
	 public void toCheckGiftPage() {
		 WebElement gift = driver.findElement(By.partialLinkText("Gift Cards"));
			gift.click();
			String actualgiftTitle = driver.getTitle();
			if(expectGiftCardTitle.equals(actualgiftTitle)) {
				Reporter.log("GiftCard page is displayed sucessfully",true);
			}
	 }

}
