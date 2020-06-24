package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Suraj/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.cssSelector("div.gb_h:nth-child(1) > a:nth-child(1)")).click();
		
	}

}
