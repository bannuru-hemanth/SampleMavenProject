package Modules;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.LoginPage;

import Test.SelTest;

public class LoginPageAction extends SelTest {
		
	static Properties properties;

   	public static void executeEventsOnLoginPage() throws InterruptedException, IOException
   	
   	{
   		properties = new Properties();
   		File f = new File(System.getProperty("user.dir") + "\\Parameter_user_data.properties");
   		FileReader obj = new FileReader(f);
   		properties.load(obj);
   		try {
   		// Click to the Sign_in button
      LoginPage.LoginPageDetails.Signin.clear(); 
   	  LoginPage.LoginPageDetails.Signin.sendKeys(properties.getProperty("Email_id")); 
   	  Thread.sleep(2000); 
   	  LoginPage.LoginPageDetails.Password.clear();
   	  LoginPage.LoginPageDetails.Password.sendKeys(properties.getProperty("Password"));
   	  
   	  LoginPage.LoginPageDetails.Login.click();
   	  
   	  
   		}
   		catch(Exception e) {
   			
   		}



   	}
}
