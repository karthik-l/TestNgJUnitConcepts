package com.testng.retryanalyzer;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SampleTest {


	@Test
	private void usernameValidation() {
	System.out.println("Testing started");
	assertEquals("karthik", "Karthik");
	}
	
	@Test
	private void homepageValidation() {
	System.out.println("Testing started");
	assertEquals("Google", "Google.com");
	}
}
