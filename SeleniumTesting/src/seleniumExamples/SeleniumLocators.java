package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Suraj/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en-GB&continue=https%3A%2F%2Fmail.google.com%2Fmail&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		//Whenever we want to operate on single value
		
		driver.findElement(By.id("identifierId")).sendKeys("suraj123@gmail.com");
		driver.findElement(By.id("identifierId")).clear();
		
		/*Whenever we want to operate on multiple values
		
		WebElement Email=driver.findElement(By.id("identifierId"));
		Email.sendKeys("London");
		Email.clear();   
		
		*/
	}

}
