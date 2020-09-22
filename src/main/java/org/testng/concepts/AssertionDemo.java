package org.testng.concepts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {

	//Hard assert - Stop
	@Test
	private void sample1() {
		System.out.println("Test started");
		assertEquals("karthik", "Karthik");
		System.out.println("Validation completed");
		System.out.println("Test completed");
	}

	
	//Soft assert - Only Verify
	@Test
	private void sample2() {
		SoftAssert soft = new SoftAssert();
		System.out.println("Test2 started");
		soft.assertEquals("karthik", "Karthik");
		System.out.println("Validation2 completed");
		System.out.println("Test2 completed");
		soft.assertAll();
	}

}
