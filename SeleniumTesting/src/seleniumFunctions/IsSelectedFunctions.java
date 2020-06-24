package seleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelectedFunctions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.easemytrip.com/visa/index");
		
		Boolean a= driver.findElement(By.id("privacyPolicy")).isSelected();
		System.out.println(a);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("privacyPolicy")).click();
		a= driver.findElement(By.id("privacyPolicy")).isSelected();
		
		System.out.println(a);
		
		

	}

}
