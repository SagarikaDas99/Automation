package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass {
	String expectComputerTitle="Demo Web Shop. Computers";
	
	@Test
	public void toCheckComputerPage() {
		WebElement computer = driver.findElement(By.partialLinkText("Computers"));
		computer.click();
		String actualComputerTitle = driver.getTitle();
		if(expectComputerTitle.equals(actualComputerTitle)) {
			Reporter.log("Computer page is displayed sucessfully",true);
		}
	}

}
