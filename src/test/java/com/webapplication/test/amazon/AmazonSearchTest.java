package com.webapplication.test.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class AmazonSearchTest {
	String siteUrl = "https://www.amazon.in/";
	String driverPath = "drivers//windows//chromedriver.exe";
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(siteUrl);
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@Test
	void testAmazonHomepage() {
		// step 5 : Evaluate a test
		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actual = driver.getTitle();
		assertEquals(expected, actual);
	}
	
	@Test
	void testHompageSource() {
		// step 5 : Evaluate a test
		assertEquals(siteUrl, driver.getCurrentUrl());
	}
}
