package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageDisplay {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		boolean loginpage = driver.findElement(By.id("content")).isDisplayed();
		if(loginpage==true) {
			System.out.println("Login Page is displayed");
		}
		else {
			System.out.println("Login Page is not displayed");
		}

	}

}
