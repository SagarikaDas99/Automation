package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownFacebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/signup");
		//DAY
		driver.findElement(By.xpath("//select")).click();
		List<WebElement> allday = driver.findElements(By.xpath("//select[@id='day']/option"));
		String date="12";
		for(WebElement day:allday) {

			if(day.getText().equals(date)) {
				day.click();	
			}
		}
		
		//for month
		driver.findElement(By.xpath("//select")).click();
		List<WebElement> allmonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		String mon="nov";
		for(WebElement month:allmonth) {
			if(month.getText().equals(mon)) {
				month.click();
			}
		}
		
		//for year
		driver.findElement(By.xpath("//select")).click();
		List<WebElement> allyear = driver.findElements(By.xpath("//select[@id='year']/option"));
		String years="1999";
		for(WebElement year:allyear) {
			if(year.getText().equals(years)) {
				year.click();
			}
		}
	
	}

}
