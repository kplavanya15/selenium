package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class
public class OracleHomePage {
	@FindBy(id = "acctBtnLabel")
	private WebElement viewAccount;

	@FindBy(xpath = "//a[@data-lbl='profile:sign-in-account']")
	private WebElement signinButton;

	@FindBy(id = "sso_username")
	private WebElement username;

	@FindBy(id = "ssopassword")
	private WebElement password;

	@FindBy(id = "signin_button")
	private WebElement LoginButton;

	@FindBy(xpath = "//a[@data-lbl='profile:user-account']")
	private WebElement profileName;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOut;

	public OracleHomePage(WebDriver driver) {                     
		PageFactory.initElements(driver, this);
	}

	public void signIn(String un, String pwd) {
		viewAccount.click();
		signinButton.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginButton.click();
	}

	public String getUserName() {
		viewAccount.click();
		String name = profileName.getText();
		viewAccount.click();
		return name;
	}

	public void signOut() {
		viewAccount.click();
		signOut.click();
	}

}
