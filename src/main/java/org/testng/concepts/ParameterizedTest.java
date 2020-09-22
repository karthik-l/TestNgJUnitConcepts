package org.testng.concepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Parameters({ "username", "password" })
	@Test
	private void login(String username, String password) {
		System.out.println("Enter the login details:\nUsername:" + username + "\nPassword:" + password);
	}
}
