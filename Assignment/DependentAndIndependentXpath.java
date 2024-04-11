package Assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentAndIndependentXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Midnight, 128 GB)']")).click();
		String parentWindowId = driver.getWindowHandle();
		Set<String> WindowIds = driver.getWindowHandles();
		Iterator<String> iterator = WindowIds.iterator();
		while(iterator.hasNext()) {
			String childWindowId = iterator.next();
			if(!parentWindowId.equalsIgnoreCase(childWindowId)) {
				driver.switchTo().window(childWindowId);
				break;
			}
		}
	
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//button[text()='+']")).click();

	}

}
