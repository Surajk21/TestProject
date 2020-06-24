package seleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement RadioButton=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[24]/td[3]/input[2]"));
		
		boolean elementStatus=RadioButton.isDisplayed();	//true
		System.out.println(elementStatus);
	
		System.out.println(RadioButton.isEnabled());		//true
		
		System.out.println(RadioButton.isSelected());		//false
		RadioButton.click();
		System.out.println(RadioButton.isSelected());		//true
	}

}
