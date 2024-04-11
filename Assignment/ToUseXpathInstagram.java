package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathInstagram {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("sagarikadas25");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("sagarika@1912");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@aria-label='Direct messaging - 1 new notification link']")).click();
	}

}

