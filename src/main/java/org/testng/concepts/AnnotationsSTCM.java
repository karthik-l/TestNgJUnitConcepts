package org.testng.concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsSTCM {

	@BeforeSuite
	private void setup() {
		System.out.println("setup");
	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}

	@BeforeClass
	private void enterUrl() {
		System.out.println("Enter Url");
	}

	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}

	@Test
	private void mobileSearch() {
		System.out.println("Mobile Search");
	}

	@Test
	private void laptopSearch() {
		System.out.println("Laptop search");
	}

	@AfterMethod
	private void logout() {
		System.out.println("Logout");
	}

	@AfterClass
	private void verifyHomepage() {
		System.out.println("Verify homepage");
	}

	@AfterTest
	private void browserClose() {
		System.out.println("browser close");
	}

	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete Cookies");
	}

}
