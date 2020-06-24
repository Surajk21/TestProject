package seleniumFunctions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();

		Alert alert=driver.switchTo().alert();
		String error=alert.getText();
		System.out.println(error);
		
		//alert.dismiss(); For cancel button
		alert.accept(); //For OK button
		driver.findElement(By.id("login1")).sendKeys("surajk");

	}

}
