package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass {
    String expectBookTitle="Demo Web Shop. Books"; 
    
    @Test
    public void toCheckBookPage() {
    	WebElement book = driver.findElement(By.xpath("(//a[@href='/books'])[1]"));
		 book.click();
		String actualBookTitle = driver.getTitle();
		if(expectBookTitle.equals(actualBookTitle)) {
			Reporter.log("Book page is displayed sucessfully",true);
		}
    }

}
