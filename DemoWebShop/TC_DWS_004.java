package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_004 extends BaseClass{
	String expectShoesTitle="Demo Web Shop. Apparel & Shoes";
	@Test
	public void toCheckapperalAndShoesPage() {
		WebElement shoes = driver.findElement(By.partialLinkText("Apparel & Shoes"));
		shoes.click();
		String actualShoesTitle = driver.getTitle();
		if(expectShoesTitle.equals(actualShoesTitle)) {
			Reporter.log(" ApperalAndShoes page is displayed sucessfully",true);
		}
	}

}
