package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase5 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		
		driver.findElement(By.name("userName")).sendKeys("mercury ");
		driver.findElement(By.name("password")).sendKeys("mercury ");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);	
	
		
	}

}
