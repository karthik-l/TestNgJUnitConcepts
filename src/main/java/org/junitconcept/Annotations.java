package org.junitconcept;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotations {

	@BeforeClass
	public static void enterUrl() {
		System.out.println("Enter Url");
	}

	@Before
	public void login() {
		System.out.println("Login");
	}

	@Test
	public void mobileSearch() {
		System.out.println("Mobile Search");
	}

	@After
	public void logout() {
		System.out.println("Logout");
	}

	@AfterClass
	public static void browserClose() {
		System.out.println("browser close");
	}

}
