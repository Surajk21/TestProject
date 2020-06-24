package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:/Suraj/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		try
		{
			if(driver.findElement(By.linkText("Gmail")).isDisplayed())
			{
				System.out.println("Gmail Link Provided");
			}
		}
		
		catch(NoSuchElementException e)
		{System.out.println("Gmail Link Not Provided");}
			
		
driver.close();
	}

}
