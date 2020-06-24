package seleniumFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToFunctions {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().to("https://login.yahoo.com/");
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().refresh();
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		Thread.sleep(2000);
		driver.close();
	}

}
