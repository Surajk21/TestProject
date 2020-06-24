package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest6 {
public static WebDriver driver;
	
	@BeforeClass
	public void launchBrowser()
	{
	  System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
	  driver=new FirefoxDriver();	
	}
	
	@Test(priority=1)
	public void verifyGoogleTitle()
	{
		driver.get("https://www.google.com/");
		String PageTitle=driver.getTitle();
		Assert.assertEquals("Google", PageTitle);
		
	}

	@Test(priority=2)
	public void verifyYahooTitle()
	{
		driver.get("https://in.yahoo.com/");
		String PageTitle=driver.getTitle();
		Assert.assertEquals("Yahoo India | News, Finance, Cricket, Lifestyle and Entertainment", PageTitle);

	}
	
	@AfterClass
	public void closeBrowser()
	{
	  driver.close(); 
	}
}
