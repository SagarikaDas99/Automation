package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_008 extends BaseClass{
	String expectCartTitle="Demo Web Shop. Shopping Cart";
	String expectBookTitle="Demo Web Shop. Books";
	@Test
	public void toAddShoppingCart() {
		 WebElement book = driver.findElement(By.partialLinkText("Books"));
		 book.click();
		String actualBookTitle = driver.getTitle();
		if(expectBookTitle.equals(actualBookTitle)) {
			Reporter.log("Book page is displayed sucessfully",true);
		}
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input[@value='Add to cart']")).click();
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		String actualCartTitle = driver.getTitle();
		if(expectCartTitle.equals(actualCartTitle)) {
			Reporter.log("Navigate to Shopping Cart Page Sucessfully",true);
		}
		boolean bookname = driver.findElement(By.linkText("Computing and Internet")).isDisplayed();
		if(bookname==true) {
			Reporter.log("Book added sucessfully",true);
		}
	}

}
