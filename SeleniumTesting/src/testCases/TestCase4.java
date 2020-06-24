package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		driver.findElement(By.name("firstName")).sendKeys("Bahadur");
		driver.findElement(By.name("lastName")).sendKeys("Singh");
		driver.findElement(By.name("phone")).sendKeys("6984512121");
		driver.findElement(By.name("userName")).sendKeys("bsingh");
		
		driver.findElement(By.name("address1")).sendKeys("A223");
		driver.findElement(By.name("address2")).sendKeys("21stStreet");
		driver.findElement(By.name("city")).sendKeys("Toronto");
		driver.findElement(By.name("state")).sendKeys("Toronto");
		driver.findElement(By.name("postalCode")).sendKeys("12345");
		Select dropdown=new Select(driver.findElement(By.name("country")));
		dropdown.selectByValue("32");
		driver.findElement(By.name("email")).sendKeys("bsingh@testing.com");
		driver.findElement(By.name("password")).sendKeys("6984512121");
		driver.findElement(By.name("confirmPassword")).sendKeys("6984512121");
		
		driver.findElement(By.name("register")).click();
		
		String ConfirmationMessage=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
		if(ConfirmationMessage.contains("Thank you for registering."))
		{
			System.out.println("Account has been created");
		}
		else
		{
			System.out.println("Not Created");
		}
			

	}

}
