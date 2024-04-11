package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 */
public class FaceBookTestCase {

	public static void main(String[] args) {
		//Expected data
		String expectedLoginPageTitle="Facebook - Log in or sign up";
		String exceptedUserName="sagarika@gmail.com";
		String exceptedPassword="sagarika@123";
		
		//step:1
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser got lunched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser got lunched sucessfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//step:2
		
		driver.get("https://www.facebook.com/");
		String actualTitle = driver.getTitle();
		if(expectedLoginPageTitle.equals(actualTitle)) {
			System.out.println("Navigated successfully to login page");
		}
		else {
			System.out.println("Navigated failed to login page");
		}
		
		//step:3
		WebElement userName = driver.findElement(By.id("email"));
		userName.clear();
		userName.sendKeys(exceptedUserName);
		String actualuserName = userName.getAttribute("value");
		if(exceptedUserName.equals(actualuserName)) {
		System.out.println("UserNameTextfield accepted the data");
		}
		else {
			System.out.println("UserNameTextfield faild to accepted the data");
		}
		
		//step:4
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(exceptedPassword);
		String actualPassword = password.getAttribute("value");
		if(exceptedPassword.equals(actualPassword)) {
		System.out.println("PasswordTextfield  accepted data");
		}
		else {
			System.out.println("PasswordTextfield failed to accepted data");
		}
		
		//step:5
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		System.out.println("Navigated to home page successfully");
		
		//close the server
		System.out.println("Browser got close successfully");
		driver.quit();
		
	}

}
