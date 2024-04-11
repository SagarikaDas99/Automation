package Assignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToChangePosition {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cornerhouseicecreams.com/");
		String sessionid = driver.getWindowHandle();
		System.out.println(sessionid);
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		Point p=new Point(200,300);
		driver.manage().window().setPosition(p);

	}

}
