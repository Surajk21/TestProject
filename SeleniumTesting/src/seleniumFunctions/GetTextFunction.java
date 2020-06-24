package seleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFunction {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:/Suraj/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/AccountChooser?service=mail&continue=https://mail.google.com/mail/");
		
		//To Handle Text Area
		String s=driver.findElement(By.id("headingSubtext")).getText();
		System.out.println(s);
		
		}

}
