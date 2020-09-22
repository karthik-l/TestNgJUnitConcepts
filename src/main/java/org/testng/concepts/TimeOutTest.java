package org.testng.concepts;

import org.testng.annotations.Test;

public class TimeOutTest {

	@Test(timeOut = 2000)
	private void mobileSearch() throws InterruptedException {
		System.out.println("Mobile Test Started");
		Thread.sleep(4000);
		System.out.println("Mobile Test Completed");
	}

	@Test
	private void laptopSearch() {
		System.out.println("Laptop Test");
	}
}
