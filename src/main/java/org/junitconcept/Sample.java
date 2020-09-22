package org.junitconcept;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	@Test
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Course\\eclipse-workspace\\TestNgConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
