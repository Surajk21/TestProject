package testCases;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase3 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://stagenget.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.linkText("LOGIN")).click();
		
		driver.findElement(By.id("userId")).sendKeys("gcreddy7");
		driver.findElement(By.id("pwd")).sendKeys("gld938");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Captcha:");
		String Captcha=scan.nextLine();
		
		driver.findElement(By.id("captcha")).sendKeys(Captcha);
		driver.findElement(By.className("search_btn")).click();
		
		
		
		
		
		
		
		
		

	}

}
