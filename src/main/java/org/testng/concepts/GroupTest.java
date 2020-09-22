package org.testng.concepts;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups = "Selenium Test")
	private void seleniumTest1() {
		System.out.println("Selenium Test 1");
	}

	@Test(groups = "Selenium Test")
	private void seleniumTest2() {
		System.out.println("Selenium Test 2");
	}

	@Test(groups = "API Test")
	private void APITest1() {
		System.out.println("API Test 1");
	}

	@Test(groups = "API Test")
	private void APITest2() {
		System.out.println("API Test 2");
	}

	//Group of group test
	@Test(groups = "group of group")
	private void gTest() {
		System.out.println("Group of group Test");
	}
	
}
