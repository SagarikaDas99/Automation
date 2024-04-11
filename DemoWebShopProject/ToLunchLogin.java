package DemoWebShopProject;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchLogin {
	String expectLoginTitle="Demo Web Shop. Login";
	String expectEmail="subhankar12@gmail.com";
	String expectPassword="Sagarika123";
	@Test
public void login(){
		WebDriver driver=new ChromeDriver();
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
		if(expectEmail.equals(actualEmail)&& expectPassword.equals(actualPassword)) {
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Reporter.log("Navigate to Home page sucessfully",true);
		}
		
	}

}
