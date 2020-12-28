package com.us.exceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utility.UtilityExcelDataPass;

public class ZooplaLoginWithExcelData {
	WebDriver driver;
	@Test
	public void passingdataFromExcel() throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();;
		driver.findElement(By.linkText("Sign in")).click();
		
		ArrayList<String>UserName=UtilityExcelDataPass.readExcelData(0);
		ArrayList<String>Password=UtilityExcelDataPass.readExcelData(1);
		for(int i=0;i<UserName.size();i++) {
		
		
		driver.findElement(By.id("signin_email")).sendKeys(UserName.get(i));
		driver.findElement(By.id("signin_password")).sendKeys(Password.get(i)); 
		driver.findElement(By.id("signin_submit")).click();
		}
	}


}
