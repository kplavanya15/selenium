package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass extends Initialize {
	public WebDriver driver;
	
	@BeforeSuite                                                                              
	public void beforeSuite() {

	}

	@BeforeTest //launch browerser
	public void beforeTest() {
          driver = new ChromeDriver();
	}

	@BeforeClass //open application
	public void beforeClass() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.oracle.com/in/");
	}

	@BeforeMethod //login
	public void beforeMethod() {

	}

	@AfterMethod //logout
	public void afterMethod() {
			
	}

	@AfterClass
	public void afterClass() {
	}

	@AfterTest //close browser
	public void afterTest() {
		driver.quit();
	}

	@AfterSuite
	public void afterSuite() {

	}
}