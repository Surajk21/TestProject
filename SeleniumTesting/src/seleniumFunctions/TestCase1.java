package seleniumFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase1 {
	
	public static WebDriver driver;
	public static int Browser;
	public static String BrowserName;	

	public static void main(String[] args) {

		for(Browser=1; Browser<=3;Browser++)
		{
			if(Browser==1)
			{
				System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
				driver=new FirefoxDriver();
				BrowserName="Mozilla Firefox Browser";
			}
			else if(Browser==2)
			{
				System.setProperty("webdriver.chrome.driver", "D:/Suraj/chromedriver_win32/chromedriver.exe");
				
				driver = new ChromeDriver();
				BrowserName="Chrome Browser";
			}
			else if(Browser==3)
			{
				System.setProperty("webdriver.ie.driver", "D:/Suraj/IEDriverServer_Win32_3.150.1/IEDriverServer.exe");
				
				driver = new InternetExplorerDriver();
				BrowserName="Internet Explorer Browser";
			}
			driver.get("https://www.google.com/");
			String PageTitle=driver.getTitle();
			
			if(PageTitle.equals("Google"))
				System.out.println(BrowserName+ " Launched - Passed");
			else
				System.out.println(BrowserName+ " Launched - Failed");
			
			driver.close();
			
		}
	}

}
