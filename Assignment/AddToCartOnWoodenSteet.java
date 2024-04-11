package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartOnWoodenSteet {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.woodenstreet.com/");
		 
		for(;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			}catch (Exception e) {
				Thread.sleep(2000);
			}
		}
		driver.findElement(By.partialLinkText("Sofas")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='category-list']/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2[text()='Henry 3 Seater Sofa (Velvet, Chestnut Brown)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("button-cart-buy-now")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Living']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='top-list']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[text()='Osbert 3 Seater Curved Sofa with Brass Cladding (Cotton, Jade Ivory)'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-cart-buy-now")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Bedroom']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='top-list']/a[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[text()='Vespera Engineered Wood Four Door Wardrobe (Gothic Grey, Classic Oak Finish)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-cart-buy-now")).click();

	}

}
