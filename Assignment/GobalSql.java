package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GobalSql {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		//identify frame
		WebElement element = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(element);
		//identify image
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		//to identify trash
		WebElement trashBox = driver.findElement(By.id("trash"));
		//to identify gallary
		WebElement gallary = driver.findElement(By.id("gallery"));
		
		Actions action=new Actions(driver);
		
		//image move to trash
		action.dragAndDrop(image1, trashBox).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image2, trashBox).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image3, trashBox).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, trashBox).perform();
		Thread.sleep(3000);
		
		//image move to gallary
		action.dragAndDrop(image1, gallary).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image2, gallary).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image3, gallary).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, gallary).perform();
		Thread.sleep(2000);
		
		//ACCEPTED ELEMENT
		driver.switchTo().defaultContent();
		driver.findElement(By.id("Accepted Elements")).click();
		WebElement element1 = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
		driver.switchTo().frame(element1);
		
		WebElement photo = driver.findElement(By.id("draggable-nonvalid"));
		WebElement photo1 = driver.findElement(By.id("draggable"));
		WebElement box = driver.findElement(By.id("droppable"));
		//move photo to box
		action.dragAndDrop(photo, box).perform();
		Thread.sleep(2000);
		action.dragAndDrop(photo1, box).perform();
		
		//PROPAGRATION
		driver.switchTo().defaultContent();
		driver.findElement(By.id("Propagation")).click();
		WebElement propagation = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[3]"));
		driver.switchTo().frame(propagation);
		
		WebElement photo2 = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement box1 = driver.findElement(By.id("droppable2"));
		//move photo2 to box
		action.dragAndDrop(photo2, box1).perform();
		
		
		
		
		

	}

}
