package org.testng.concepts;

import org.testng.annotations.Test;

public class ExceptionTest {

	
	@Test(expectedExceptions = ArithmeticException.class)
	private void divide() {
	System.out.println(10/0);
	}
}
