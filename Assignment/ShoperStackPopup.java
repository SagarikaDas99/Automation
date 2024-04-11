package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoperStackPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.shoppersstack.com/user-signin");

		driver.findElement(By.xpath("//a[text()='Swagger documentation']")).click();
		//handle js popup
		//1st popup
		Alert alertpopup = driver.switchTo().alert();
		alertpopup.accept();
		Thread.sleep(2000);
		//2nd popup
		Alert promptpopup1 = driver.switchTo().alert();
		promptpopup1.sendKeys("admin");
		Thread.sleep(1000);
		promptpopup1.accept();
		Thread.sleep(1000);
		//3rd popup
		Alert promptpopup2 = driver.switchTo().alert();
		promptpopup2.sendKeys("admin");
		Thread.sleep(1000);
		promptpopup2.accept();
		Thread.sleep(1000);
		//4th popup
		Alert alertpopup1 = driver.switchTo().alert();
		alertpopup1.accept();
	}

}
