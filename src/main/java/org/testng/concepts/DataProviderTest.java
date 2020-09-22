package org.testng.concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "MyTestData")
	private void login(String username, String password) {
		System.out.println("Username:" + username + " Password:" + password );
	}

	@DataProvider(name = "MyTestData")
	private Object[][] loginTestData() {
		return new Object[][] { { "Karthik", "12345" }, { "Tony", "987654" }, { "stark", "465132" } };
	}

}
