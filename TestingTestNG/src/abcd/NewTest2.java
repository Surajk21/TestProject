package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
	
	public static WebDriver driver;
  @Test(priority=1)
  public void launchBrowser() {
	 	  
	  System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
	 driver=new FirefoxDriver();	
	  driver.get("https://www.google.com/");
		
  }
  @Test(priority=2)
  public void verifyTitle()
  {
		String PageTitle=driver.getTitle();
		Assert.assertEquals("Google", PageTitle);
		
  }
  @Test(priority=3)
  public void closeBrowser()
  {
	  driver.close(); 
  }
  
  
  
  
}
