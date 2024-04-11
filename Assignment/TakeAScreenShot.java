package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeAScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=10343292635364730510&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062009&hvtargid=kwd-10573980&hydadcr=14453_2316415");
        Thread.sleep(4000);
        
        TakesScreenshot ts=(TakesScreenshot) driver;
        File temp = ts.getScreenshotAs(OutputType.FILE);
        File scr=new File("./errorShots/amazon.jpeg");
        FileHandler.copy(temp, scr);
	}

}
