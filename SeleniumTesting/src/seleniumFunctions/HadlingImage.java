package seleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HadlingImage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.findElement(By.id("hplogo")).isDisplayed());
		System.out.println(driver.findElement(By.id("hplogo")).getAttribute("title"));
		
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.name("login")).click();
		
		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a/img")).click();
		driver.close();
	}

}
