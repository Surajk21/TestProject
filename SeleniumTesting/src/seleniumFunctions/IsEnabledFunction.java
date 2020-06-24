package seleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnabledFunction {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		Boolean a= driver.findElement(By.linkText("Gmail")).isEnabled();
		System.out.println(a);
		
		//It closes the current Browser opened by WebDriver only
		driver.close();
	}

}
