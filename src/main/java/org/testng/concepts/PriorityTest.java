package org.testng.concepts;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 1)
	private void getDriver() {
		System.out.println("Browser Launch");
	}

	@Test(priority = 5)
	private void Url() {
		System.out.println("Enter URL");
	}

	@Test
	private void alogin() {
		System.out.println("Login");
	}

	@Test(priority = 4)
	private void searchMobile() {
		System.out.println("Mobile Search");
	}

}
