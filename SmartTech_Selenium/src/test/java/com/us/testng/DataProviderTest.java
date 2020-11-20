package com.us.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	WebDriver driver;
	
@DataProvider(name ="Authentication")	
public static Object []	[] credentials(){
	  return new Object[][] {{"Mubashir","marupon76@gmail.com"},{"Mubashir","Rupon123456"}};
	  
}
	
@Test(dataProvider = "Authentication")	
	
public void test(String Username, String Password) {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	// Initialize browser.
	WebDriver driver=new ChromeDriver();	//up casting
    driver.get("https://www.zoopla.co.uk/");
    driver.manage().window().maximize();
    
    
    
    driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("signin_email")).sendKeys("Username");
    driver.findElement(By.id("signin_password")).sendKeys("Password");
    driver.findElement(By.id("signin_submit")).click();
    System.out.println(driver.getTitle());
    driver.quit();	
	
	
	
}
}
