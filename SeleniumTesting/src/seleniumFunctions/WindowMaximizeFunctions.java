package seleniumFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowMaximizeFunctions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.easemytrip.com/visa/index");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
