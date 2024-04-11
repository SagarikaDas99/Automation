package DemoWebShopProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CategoriesCaptureOptions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='block block-category-navigation']/div[2]/ul"));
		for(WebElement option:options) {
			System.out.println(option.getText());
		}

	}

}
