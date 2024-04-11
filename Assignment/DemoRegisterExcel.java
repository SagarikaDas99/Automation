package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRegisterExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String expectedTitle="Demo Web Shop. Register";
		
        String expectedResult = "Your registration completed";
		//create object of FileInputStream
		FileInputStream fis=new FileInputStream("./TestData/DemoWebShopExcel.xlsx");
		
		//call the workbookFactory
		Workbook wb=WorkbookFactory.create(fis);
		
		//call the method
		String url = wb.getSheet("sheet1").getRow(0).getCell(0).toString();
		String gender = wb.getSheet("sheet1").getRow(1).getCell(0).toString();
		String firstname = wb.getSheet("sheet1").getRow(2).getCell(0).toString();
		String lastname = wb.getSheet("sheet1").getRow(3).getCell(0).toString();
		String email = wb.getSheet("sheet1").getRow(4).getCell(0).toString();
		String password = wb.getSheet("sheet1").getRow(5).getCell(0).toString();
		String conpassword = wb.getSheet("sheet1").getRow(6).getCell(0).toString();
		String reg = wb.getSheet("sheet1").getRow(6).getCell(0).toString();
		
		//automation code
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		String actualTitle = driver.getTitle();
		 if(expectedTitle.equals(actualTitle)) {
			 System.out.println("Navigate to Register page sucessfully");
		 }
		 WebElement gen = driver.findElement(By.id("gender-female"));
		 gen.sendKeys(gender);
		 gen.click();
		 driver.findElement(By.id("FirstName")).sendKeys(firstname);
		 driver.findElement(By.id("LastName")).sendKeys(lastname);
		 driver.findElement(By.id("Email")).sendKeys(email);
		 driver.findElement(By.id("Password")).sendKeys(password);
		 driver.findElement(By.id("ConfirmPassword")).sendKeys(conpassword);
		 WebElement register = driver.findElement(By.id("register-button"));
		 register.sendKeys(reg);
		 register.click();
		 
		 String actresult = driver.findElement(By.xpath("//div[@class='result']")).getText();
		 if(expectedResult.equals(actresult)) {
			 System.out.println("Registation successfully");
		 }

	}

}
