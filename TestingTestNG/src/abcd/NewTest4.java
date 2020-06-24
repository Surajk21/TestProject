package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest4 {

		public static WebDriver driver;
		
		@Test
		public void launchBrowser()
		{
		  System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		  driver=new FirefoxDriver();	
		}
		
		@Test(dependsOnMethods="verifyYahooTitle", alwaysRun=true)
		public void verifyGoogleTitle()
		{
			driver.get("https://www.google.com/");
			String PageTitle=driver.getTitle();
			Assert.assertEquals("Google", PageTitle);
			
		}

		@Test(dependsOnMethods="launchBrowser")
		public void verifyYahooTitle()
		{
			driver.get("https://in.yahoo.com/");
			String PageTitle=driver.getTitle();
			Assert.assertEquals("Yahoo India", PageTitle);
		}
		
		@Test(dependsOnMethods="verifyGoogleTitle")
		public void closeBrowser()
		{
		  driver.close(); 
		}

  }

