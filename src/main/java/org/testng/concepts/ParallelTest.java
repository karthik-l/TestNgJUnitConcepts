package org.testng.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	private void amazonTest() {
	System.setProperty("webdriver.chrome.driver", "E:\\Course\\eclipse-workspace\\TestNgConcepts\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	}
	
	@Test
	private void flipkartTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Course\\eclipse-workspace\\TestNgConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	
}
