package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("Sagarika");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("Das");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("dassagarika1122@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Sagarika123");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Sagarika123");
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		
		

	}

}
