package com.way2a.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Testbase {
	public static WebDriver driver;
	
	/*
	 * Webdriver driver
	 * Properties
	 * log
	 * Extentreports
	 * DB
	 * Excel
	 * mail
	 */
	@BeforeSuite
	public void setup() {
		driver=new ChromeDriver();//opening chrome driver
		
	}
	
	
	@AfterSuite
	public void teardown() {
		
		driver.quit();
	}

	
	
	
}
