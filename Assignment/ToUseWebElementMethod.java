package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseWebElementMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log in']")).submit();
		Thread.sleep(2000);
		WebElement error = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]"));
		System.out.println(error.getText());
		System.out.println(error.getCssValue("color"));

	}

}
