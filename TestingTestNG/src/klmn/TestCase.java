package klmn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase {
	
	static WebDriver driver;
	
	Home_PG_POF HomePage;
	LogIn_PG_POF Login;
	
		@BeforeMethod
		public void beforeMethod(){
		
		//POM with PageFactory Example
		
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		HomePage=PageFactory.initElements(driver, Home_PG_POF.class);
		Login=PageFactory.initElements(driver, LogIn_PG_POF.class);
		}
		
		@Test
		public void test(){
			
			Login.LogIn_Action("mercury", "mercury");
			System.out.println("Login Successfully, now it is the time to Log Off buddy.");
		}
		
		@AfterMethod
		public void afterMethod(){
			driver.quit();
		}
	
	
	
}
