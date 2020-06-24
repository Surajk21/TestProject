package jhig;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven1 {
	public WebDriver driver;
	@Test(dataProvider = "testData")
	public void login(String username, String password)
	{
		System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("login")).click();
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);	
		if(currentURL.contains("http://newtours.demoaut.com/mercurywelcome.php"))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failed");
		}
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
		
	@DataProvider(name="testData")
	public Object [][] readExcel() throws BiffException, IOException{

	File f=new File("D:/Suraj/Suraj.xls");
	Workbook w= Workbook.getWorkbook(f);
	Sheet s= w.getSheet("Sheet1");
	int columns=s.getColumns();
	int rows=s.getRows();
	//System.out.println(columns+","+rows);
	
	String inputData [] [] = new String [rows][columns];

	for (int i=0; i<rows; i++){
	for (int j=0; j<columns; j++){
	Cell c= s.getCell(j,i);
	inputData[i][j]=c.getContents();
	//System.out.println(inputData[i][j]);
	}
	}
	return inputData;
	}
	
}
