package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_003 extends BaseClass {
	String expectElectronicsTitle="Demo Web Shop. Electronics";
	@Test
	public void toCheckElectronicPage() {
		WebElement electronic = driver.findElement(By.partialLinkText("Electronics"));
		 electronic .click();
		String actualElectronicTitle = driver.getTitle();
		if(expectElectronicsTitle.equals(actualElectronicTitle )) {
			Reporter.log("Electronics  page is displayed sucessfully",true);
		}
	}

}
