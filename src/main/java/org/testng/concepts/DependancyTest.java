package org.testng.concepts;

import org.testng.annotations.Test;

public class DependancyTest {

	@Test
	private void browerLaunch() {
		System.out.println("Browser Launch");
	}

	@Test(dependsOnMethods = "browerLaunch")
	private void Url() {
		System.out.println("URL");
	}

	@Test(dependsOnMethods = "Url")
	private void mobileSearch() {
		System.out.println("Mobile Search");
	}

}
