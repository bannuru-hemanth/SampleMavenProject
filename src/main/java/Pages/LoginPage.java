package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	
private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;

	}

	public static class LoginPageDetails
	{
		@FindBy(how = How.XPATH, using = "//input[@id='user_login']")
		public static WebElement Signin;

		@FindBy(how = How.XPATH, using = "//input[@id='user_pass']")
		public static WebElement Password;
		
		@FindBy(how = How.XPATH, using = "//input[@id='wp-submit']")
		public static WebElement Login;
		
	}
}
