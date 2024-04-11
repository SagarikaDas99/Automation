package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemoWebShop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/fiction");
		driver.findElement(By.partialLinkText("Books")).click();
		
		//identify webelement
	    WebElement dropdown = driver.findElement(By.id("products-orderby"));
	    //create select class
	    Select select=new Select(dropdown);
	    //call method
	    select.selectByVisibleText("Price: High to Low");
	    List<WebElement> option = select.getOptions();//staleElementRefenceException
	    for(WebElement ele:option) {
	    	System.out.println(ele.getText());
	    }

	}

}
