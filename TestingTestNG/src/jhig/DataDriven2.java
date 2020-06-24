package jhig;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven2 {
	public WebDriver driver;
	@Test(dataProvider = "testData")
	public void addition(String num1, String num2)
	{
		
		int a=Integer.parseInt(num1);
		
		int b=Integer.parseInt(num2);
		int result=a+b;
		
		System.out.println("The addition is: "+result);
	}
	
	

		
	@DataProvider(name="testData")
	public Object [][] readExcel() throws BiffException, IOException{

	File f=new File("D:/Suraj/Suraj1.xls");
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
