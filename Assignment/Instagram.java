package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("sagarika");
		driver.findElement(By.name("password")).sendKeys("sagarika");

	}

}
