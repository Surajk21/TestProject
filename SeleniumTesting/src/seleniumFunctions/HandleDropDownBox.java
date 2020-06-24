package seleniumFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownBox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		Select dropdown=new Select(driver.findElement(By.id("country")));
		//dropdown.selectByIndex(5);
		//dropdown.selectByValue("5");
		List<WebElement> e=dropdown.getOptions();
		int itemsCount=e.size();
		System.out.println(itemsCount);
	}

}
