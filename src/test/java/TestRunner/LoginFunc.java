package TestRunner;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginFunc {

	@Test(dataProvider = "credentials")
	public void successfulLogin(String username, String password) {

		System.out.println(username);
		System.out.println(password);
		
		// selenium
		// base.getdriver()
		// lp.enterusername lp.enterpassword lp.clicklogin()
	}

	// int[] numbers = {10, 20, 30 , 40};

	// int[][] numbers = { {1,2,3},{4,5,6},{7,8,9} };

	// 1,2,3
	// 4,5,6
	// 7,8,9

	// System.out.println(numbers[0][1]);

	// Assert.fail() to assert that test will fail
	// returns an multi-demension object array and will provide the data
	
	@DataProvider(name = "credentials")
	@Test(priority = 2)
	public Object[][] credentialsProvider() {

		Object[][] userData = { { "standard_user", "secret_sauce" }, { "problem_user", "secret_sauce" } };
		return userData;
	}
}
