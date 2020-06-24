package seleniumFunctions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleButtonFunction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.findElement(By.name("proceed")).isEnabled());
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.findElement(By.name("proceed")).isDisplayed());
		System.out.println(driver.findElement(By.name("proceed")).isEnabled());
		System.out.println(driver.findElement(By.name("proceed")).getAttribute("type"));
		System.out.println(driver.findElement(By.name("proceed")).getAttribute("name"));
		System.out.println(driver.findElement(By.name("proceed")).getAttribute("value"));
		
		
		
		

	}

}
