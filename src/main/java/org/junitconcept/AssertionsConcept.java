package org.junitconcept;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionsConcept {

	@Test
	public void assertEqualsTest() {
		String expected = "Karthik";
		String actual = "Karthik";
		assertEquals(expected, actual);
		System.out.println("Assertion Equals completed");
	}

	@Test
	public void assertSameTest() {
		String expected = "Karthik";
		String actual = "Karthik";
		assertSame(expected, actual);
		System.out.println("Assertion Same completed");
	}

	@Test
	public void assertFalseTest() {
		assertFalse(5 > 10);
		System.out.println("Assertion False completed");
	}

	@Test
	public void assertNullTest() {
		String name = null;
		assertNull(name);
		System.out.println("Assertion Null completed");
	}

	@Test
	public void assertNotNullTest() {
		String name = "Karthik";
		assertNotNull(name);
		System.out.println("Assertion Not Null completed");
	}
}
