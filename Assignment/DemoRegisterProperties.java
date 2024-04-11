package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRegisterProperties {

	public static void main(String[] args) throws IOException {
		String expectedTitle="Demo Web Shop. Register";
	
        String expectedResult = "Your registration completed";

		
		//create the obje of fileInputStream
		FileInputStream fis=new FileInputStream("./TestData/DemoWebShopData.properties");
		//cterate the object of properties file
		Properties prop=new Properties();
		//call method
		prop.load(fis);
		String url = prop.getProperty("url");
		String gender = prop.getProperty("gender");
		String firstname = prop.getProperty("firstname");
		String lastname = prop.getProperty("lastname");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		String conpassword = prop.getProperty("conpassword");
		String reg = prop.getProperty("reg");
		

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
