package testset;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.BaseClass;
import model.OracleHomePage;

//Test class
public class TestLogin extends BaseClass {

//	 @Test
	public void openOracle() {

	}

	@Test(priority = 1, dataProvider = "userData")
	public void login(String un, String pwd) {
		OracleHomePage home = new OracleHomePage(driver);
		home.signIn(un, pwd);
		System.out.println("SignIn is successful");
	}

	@Test(priority = 2)
	public void getUsername() {
		OracleHomePage p = new OracleHomePage(driver);
		String name = p.getUserName();
		System.out.println("Username = " + name);
	}

	@Test(priority = 3)
	public void signOut() {
		OracleHomePage s = new OracleHomePage(driver);
		s.signOut();
		System.out.println("SignOut is successful");
	}

	@DataProvider(name = "userData")
	public Object[][] loginData() {
		Object[][] o = { { "lava@yopmail.com", "8888888800a@A" } };
		return o;

	}

	// @DataProvider(name = "names")
	// public Object [][] getnames() {
	// Object [][] obj = (Object [][]) new Object();
	// return obj;
	// }

}