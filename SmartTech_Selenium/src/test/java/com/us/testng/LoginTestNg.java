package com.us.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestNg {

	@BeforeMethod
	 public void getName() {
		
	System.out.println("Before method");	
		
}

@Test	

public void getAge() {
	System.out.println("My Age is 36 / test-1");
}
@Test
public void getSalary() {
	System.out.println("I want salary 10000 per month / test-2");
}
@Test
public void getBall() {
	System.out.println("Ball colour red / test-3");
}
@AfterMethod
public void getId() {
	System.out.println("After method");
}

}
