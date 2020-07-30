package com.way2a.base;

import org.openqa.selenium.WebDriver;
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
		
		
	}
	
	
	@AfterSuite
	public void teardown() {
		
	}

	
	
	
}
