package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Suraj/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[1]/div[1]/a")).click();
	}

}
