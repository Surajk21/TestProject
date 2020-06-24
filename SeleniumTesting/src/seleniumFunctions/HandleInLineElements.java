package seleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInLineElements {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:/Suraj/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/?gl=IN&tab=w1");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[3]/div[2]/ytd-topbar-menu-button-renderer[2]/div/a/yt-icon-button/button/yt-icon")).click();
		driver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[2]/div[2]/ytd-compact-link-renderer[1]/a/paper-item/yt-formatted-string[1]")).click();
		driver.navigate().back();
		
		

	}

}
