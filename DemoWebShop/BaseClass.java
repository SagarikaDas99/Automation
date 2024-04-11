package DemoWebShop;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
		public WebDriver driver;
		String expectLoginTitle = "Demo Web Shop. Login";
		//Create object of FileInputStream
		
//		FileInputStream fis=new FileInputStream("./TestData/Demo.xlsx");
//	
//		//call the WorkBookFactory
//		Workbook wb=WorkbookFactory.create(fis);
//		//call method
//		public String url=wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
//		public String email=wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
//		public String Pass=wb.GetSheet("Sheet1").getROw(0).getCell(0).toString();

		@BeforeClass
		public void beforeClass() {
			driver = new ChromeDriver();
			Reporter.log("Browser got lonched sucessfully", true);
			driver.manage().window().maximize();
			Reporter.log("Browser got maximized sucessfully", true);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}

		@BeforeMethod
		public void beforeMethod() {
			driver.get("https://demowebshop.tricentis.com/fiction");
			Reporter.log("welcome got displayed sucessfully", true);
			driver.findElement(By.linkText("Log in")).click();
			String actualLoginTitle = driver.getTitle();
			if (expectLoginTitle.equals(actualLoginTitle)) {
				Reporter.log("Navigate to Login page sucessfully", true);
			}
			 driver.findElement(By.id("Email")).sendKeys("subhankar12@gmail.com");
			 driver.findElement(By.id("Password")).sendKeys("Sagarika123");
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
				Reporter.log("Navigate to Home page sucessfully", true);
		}

		@AfterMethod
		public void afterMethod() {
			driver.findElement(By.linkText("Log out")).click();
			Reporter.log("Log Out sucessfully", true);
		}

		@AfterClass
		public void afterClass() {
			driver.quit();
			Reporter.log("Browser got closed sucessfully", true);
		}

	}


