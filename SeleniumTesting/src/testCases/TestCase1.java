package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Suraj/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		
		driver.findElement(By.partialLinkText("Create account")).click();
		String currentURL=driver.getCurrentUrl();
		
		if(currentURL.contains("wikipedia.org"))
				System.out.println("It is an internal URL");
		else
			System.out.println("It is an external URL");
		
		driver.navigate().back();
		driver.findElement(By.partialLinkText("SeleniumHQ")).click();
		currentURL=driver.getCurrentUrl();
				
		if(!currentURL.contains("SeleniumHQ"))
			System.out.println("It is an internal URL");
		else
		System.out.println("It is an external URL");
		
		driver.close();
	
		
	}

}
