package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_005 extends BaseClass{
	String expectDigitalTitle="Demo Web Shop. Digital downloads";
	
	@Test
	public void toCheckDigitalDownloadPage() {
		WebElement digital = driver.findElement(By.partialLinkText("Digital downloads"));
		digital.click();
		String actualDigitalTitle = driver.getTitle();
		if(expectDigitalTitle.equals(actualDigitalTitle)) {
			Reporter.log("DigitalDownload page is displayed sucessfully",true);
		}
	}

}
