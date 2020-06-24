package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void NewTest() {
	  	System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		
	  	WebDriver driver=new FirefoxDriver();
		

		driver.get("http://www.google.com/");
		
		String PageTitle=driver.getTitle();
		Assert.assertEquals("Google", PageTitle);
		driver.close();
  }
}
