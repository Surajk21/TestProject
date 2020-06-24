package seleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("/html/body/div/ul/li[9]/a/span")).click();
		
		

	}

}
