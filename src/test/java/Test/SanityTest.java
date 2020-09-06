package Test;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Modules.LoginPageAction;
import Pages.LoginPage;

public class SanityTest extends SelTest {
	static Properties properties;
		
	@Test(priority=1)
	public void CheckElementsforOP() throws InterruptedException
	{
		try
		{
			properties = new Properties();
			File f = new File(System.getProperty("user.dir") + "\\Parameter_user_data.properties");
			FileReader obj = new FileReader(f);
			properties.load(obj);
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		// Here I am calling the Page Locators
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, LoginPage.LoginPageDetails.class);

		
		try
		{
			LoginPageAction.executeEventsOnLoginPage();
			

		} catch (Exception e)
		{
			e.printStackTrace();

		}
	}
	
}
