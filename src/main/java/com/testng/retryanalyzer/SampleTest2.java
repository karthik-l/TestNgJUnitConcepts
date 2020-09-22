package com.testng.retryanalyzer;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SampleTest2 {


	@Test(retryAnalyzer = MyRetry.class)
	private void usernameValidation() {
	System.out.println("Testing started");
	assertEquals("karthik", "Karthik");
	}
	
	@Test(retryAnalyzer = MyRetry.class)
	private void homepageValidation() {
	System.out.println("Testing started");
	assertEquals("Google", "Google.com");
	}
}
