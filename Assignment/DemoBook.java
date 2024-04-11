package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBook {

	public static void main(String[] args) throws IOException {
		String expectTitle="Demo Web Shop";
		String expectTitle1="Demo Web Shop. Books";
		//create the object of FileInputStream
		FileInputStream fis=new FileInputStream("./TestData/DemoBookData.properties");
		//create the object of properties file
		Properties prop=new Properties();
		//call the method
		prop.load(fis);
		String url = prop.getProperty("url");
		String book = prop.getProperty("book");
		//Automation Script
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		String actualTitle = driver.getTitle();
		if(expectTitle.equals(actualTitle)) {
			System.out.println("Navigate to DemoWebShop Page Sucessfully");
		}
		WebElement booklink = driver.findElement(By.partialLinkText("Books"));
		booklink.sendKeys(book);
		booklink.click();
		String actualTitle1 = driver.getTitle();
		if(expectTitle1.equals(actualTitle1)) {
			System.out.println("Book page is displayed sucessfully");
		}
	}

}
