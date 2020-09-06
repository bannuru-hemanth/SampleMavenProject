package Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SelTest {
	
	
	
	public static WebDriver driver;
	static Properties properties;
	@BeforeSuite
	public void setUp() throws IOException
	{
		properties = new Properties();
		File f = new File(System.getProperty("user.dir") + "\\Parameter_user_data.properties");
		FileReader obj = new FileReader(f);
		properties.load(obj);

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// Entering the URL
		driver.get(properties.getProperty("URL"));
		// Log.info("Opening the URL");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void tearDown()
	{
		
		 driver.close();
		 driver.quit();
		
	}


}
