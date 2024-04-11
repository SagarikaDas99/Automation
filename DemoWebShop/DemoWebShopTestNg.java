package DemoWebShop;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoWebShopTestNg {
	String expectedTitle="Demo Web Shop. Register";
    String expectedResult = "Your registration completed";
    String expectLoginTitle="Demo Web Shop. Login";
    String expectEmail="subhankar12@gmail.com";
    String expectPassword="Sagarika123";
    String expectBookTitle="Demo Web Shop. Books";
    String expectComputerTitle="Demo Web Shop. Computers";
    String expectElectronicsTitle="Demo Web Shop. Electronics";
    String expectShoesTitle="Demo Web Shop. Apparel & Shoes";
    String expectDigitalTitle="Demo Web Shop. Digital downloads";
    String expectJewellaryTitle="Demo Web Shop. Jewelry";
    String expectGiftCardTitle="Demo Web Shop. Gift Cards";
    String expectCartTitle="Demo Web Shop. Shopping Cart";	
	
	WebDriver driver=new ChromeDriver();
	@Test(priority=1)
	public void login(){
		
		driver.get("https://demowebshop.tricentis.com/fiction");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Log in")).click();
		String actualLoginTitle = driver.getTitle();
		if(expectLoginTitle.equals(actualLoginTitle)) {
			Reporter.log("Navigate to Login page sucessfully",true);
		}
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("subhankar12@gmail.com");
		String actualEmail = email.getAttribute("class");
		WebElement pw = driver.findElement(By.id("Password"));
		pw.sendKeys("Sagarika123");
		String actualPassword = pw.getAttribute("class");
		driver.findElement(By.id("RememberMe")).click();
		if(expectEmail.equals(actualEmail)&& expectPassword.equals(actualPassword)) {
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Reporter.log("Navigate to Home page sucessfully",true);
		}
		
	}
	@Test(priority=2)
	public void bookAddToCart() {

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
	@Test(priority=3)
	public void book() {
		WebElement book = driver.findElement(By.xpath("(//a[@href='/books'])[1]"));
		 book.click();
		String actualBookTitle = driver.getTitle();
		if(expectBookTitle.equals(actualBookTitle)) {
			Reporter.log("Book page is displayed sucessfully",true);
		}
	}
	@Test(priority=4)
	public void computer() {
		WebElement computer = driver.findElement(By.partialLinkText("Computers"));
		computer.click();
		String actualComputerTitle = driver.getTitle();
		if(expectComputerTitle.equals(actualComputerTitle)) {
			Reporter.log("Computer page is displayed sucessfully",true);
		}
	}
	@Test(priority=5)
	public void electronics() {
		WebElement electronic = driver.findElement(By.partialLinkText("Electronics"));
		 electronic .click();
		String actualElectronicTitle = driver.getTitle();
		if(expectElectronicsTitle.equals(actualElectronicTitle )) {
			Reporter.log("Electronics  page is displayed sucessfully",true);
		}
	}
	@Test(priority=6)
	public void apperalAndShoes() {
		WebElement shoes = driver.findElement(By.partialLinkText("Apparel & Shoes"));
		shoes.click();
		String actualShoesTitle = driver.getTitle();
		if(expectShoesTitle.equals(actualShoesTitle)) {
			Reporter.log(" ApperalAndShoes page is displayed sucessfully",true);
		}
	}
	@Test(priority=7)
	public void digitalDownload() {
		WebElement digital = driver.findElement(By.partialLinkText("Digital downloads"));
		digital.click();
		String actualDigitalTitle = driver.getTitle();
		if(expectDigitalTitle.equals(actualDigitalTitle)) {
			Reporter.log("DigitalDownload page is displayed sucessfully",true);
		}
	}
	@Test(priority=8)
	public void jewellary() {
		WebElement jewellary = driver.findElement(By.partialLinkText("Jewelry"));
		jewellary.click();
		String actualjewellaryTitle = driver.getTitle();
		if(expectJewellaryTitle.equals(actualjewellaryTitle)) {
			Reporter.log("Jewellary page is displayed sucessfully",true);
		}
	}
	@Test(priority=9)
	public void giftCard() {
		WebElement gift = driver.findElement(By.partialLinkText("Gift Cards"));
		gift.click();
		String actualgiftTitle = driver.getTitle();
		if(expectGiftCardTitle.equals(actualgiftTitle)) {
			Reporter.log("GiftCard page is displayed sucessfully",true);
		}
		driver.quit();
	}

	
}
