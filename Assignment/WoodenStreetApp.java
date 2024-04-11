package Assignment;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenStreetApp {

	private static final String Brake = null;

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.woodenstreet.com/");
		
		//WebElement popup = null;
		
         // for(;;) {
			//try {
				driver.findElement(By.id("loginclose1")).click();
//				if (popup.isDisplayed()) {
//					popup.click();
//					System.out.println("pop up will be closed");
//					break;
//				}
				//break;
			//} catch (Exception e) {
				
				

			//}

         // }

	}

}
