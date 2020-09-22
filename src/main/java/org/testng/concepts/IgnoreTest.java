package org.testng.concepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {

	// method 1
	@Ignore
	@Test(invocationCount = 3)
	private void mobileSearch() {
		System.out.println("Mobile Test");
	}

	// method 2
	@Test(enabled = false)
	private void laptopSearch() {
		System.out.println("Laptop Test");
	}

	@Test()
	private void keySearch() {
		System.out.println("Key Test");
	}

	@Test()
	private void keySearchIgnore() {
		System.out.println("Key Test Ignored XML");
	}
	
}
