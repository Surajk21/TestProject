package seleniumFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleHTMLTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Suraj/Testing/HTMLTable.html");
		
		WebElement htmlTable=driver.findElement(By.id("Employee"));
		List<WebElement> rows=htmlTable.findElements(By.tagName("tr"));
		int r=rows.size();
		System.out.println(r);
		
		List<WebElement> cells=htmlTable.findElements(By.tagName("td"));
		int c=cells.size();
		System.out.println(c);
	}

}
