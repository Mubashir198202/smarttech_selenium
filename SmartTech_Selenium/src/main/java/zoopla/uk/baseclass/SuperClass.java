package zoopla.uk.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperClass {
	
	public static WebDriver driver;
	
	
	public static void initialization() {
		
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");	
	driver = new ChromeDriver();	
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

}
