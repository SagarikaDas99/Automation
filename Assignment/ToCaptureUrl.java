package Assignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrl {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().setPosition(new Point(800, 800));
		String urlOfwindow = driver.getCurrentUrl();
		System.out.println(urlOfwindow);
	}

}
