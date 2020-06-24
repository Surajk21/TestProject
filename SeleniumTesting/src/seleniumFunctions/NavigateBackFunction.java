package seleniumFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateBackFunction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().to("https://login.yahoo.com/");
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().back();
		URL=driver.getCurrentUrl();
		System.out.println(URL);

		//Back function mandatory to use Forward function for navigate
		
		driver.navigate().forward();
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		
	}

}
