package jhig;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class DataDriven {
	
	public static void main(String[] args)throws BiffException, IOException{
		
	//DataDriven 
		
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
	}
}