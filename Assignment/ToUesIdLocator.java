package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUesIdLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Try Free")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("FirstName")).sendKeys("Sagarika");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Das");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("dasasagarika1122@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Company")).sendKeys("Qspider");
		

	}

}
