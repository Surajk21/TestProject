package seleniumFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetFunctions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		//String Title=driver.getTitle();
		//String PageSource=driver.getPageSource();
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.close();
	}

}
