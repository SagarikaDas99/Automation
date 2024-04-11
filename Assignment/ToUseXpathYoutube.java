package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathYoutube {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		//driver.findElement(By.id("search")).sendKeys("aise kyun");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Kudiye Ni");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@aria-label,'Kudiye Ni Video Song')]")).click();

	}

}
