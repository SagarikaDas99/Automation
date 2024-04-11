package DemoWebShop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static  WebElement Email;
	public static WebElement pass;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/fiction");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Sagarika");
		driver.findElement(By.id("LastName")).sendKeys("Das");
		WebElement Email = driver.findElement(By.id("Email"));
		Email.sendKeys("sagarika1998@gmail.com");
		Email.getText();
		driver.findElement(By.id("Password")).sendKeys("Sagarika123");
		String pass = driver.findElement(By.id("Password")).getText();
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Sagarika123");
		String conpass = driver.findElement(By.id("ConfirmPassword")).getText();
		if(pass==conpass) {
		driver.findElement(By.id("register-button")).click();
		}
	
	}

}
