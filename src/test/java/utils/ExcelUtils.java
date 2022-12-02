package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;

public class ExcelUtils {
	//Global test data excel file 
	private static final String testDataExcelFileName = "testdata.xlsx";
	//Main Directory of the project
	private static final String currentDir = System.getProperty("user.dir");
	//location of test data excel file
	private static String testDataExcelPath = null; 
	private static XSSFWorkbook excelWorkBook; //Excel WorkBook
	private static XSSFSheet excelSheet; // Excel Sheet
	private static XSSFCell cell; //Excel Cell
	private static XSSFRow row; //Excel Row
	public static int rowNumber; //Row Number 
	public static int columnNumber; // column Number
	
	/*This method has two parameters:
	 * Test data excel file name
	 * & Excel Sheet name
	 * 
	 * It Creates FileInputStream and set excel file and excel sheet 
	 * to excelWorkBook and excelSheet variables*/
	public static void setExcelFileSheet(String sheetName) throws IOException{
		//MAC or Windows Selection for excel path
		if(Platform.getCurrent().toString().equalsIgnoreCase("MAC")) {
			testDataExcelPath = currentDir+"/src/test/resources/";
		}else if (Platform.getCurrent().toString().contains("WIN")) {
			testDataExcelPath = currentDir+"\\src\\test\\resources\\";
		}
		//Open the Excel file
		FileInputStream ExcelFile = new FileInputStream(testDataExcelPath+testDataExcelFileName);
		excelWorkBook = new XSSFWorkbook(ExcelFile);
		excelSheet = excelWorkBook.getSheet(sheetName);	
	}
	/*This method reads the test data from the Excel cell.
	 * We are passing row number and column number as parameters.*/
	public static String getCellData(int RowNum, int ColNum) {
		cell = excelSheet.getRow(RowNum).getCell(ColNum);
		DataFormatter formatter = new DataFormatter();
		return formatter.formatCellValue(cell) ;
	}
	
	/*This method takes row number as a parameter 
	  and returns the data of given row.*/
	public static XSSFRow getRowData(int RowNum) {
		row = excelSheet.getRow(RowNum);
		return row;
	}
	
	/*This method gets excel file, row and column number 
	  and set a value to the that cell.*/
	public static void setCellData(String value, int RowNum, int ColNum) throws IOException{
		row = excelSheet.getRow(RowNum);
		cell = row.getCell(ColNum);
		if(cell==null) {
			cell = row.createCell(ColNum);
			cell.setCellValue(value);
		}else {
			cell.setCellValue(value);
		}
		//Constant variables Test Data Path and Test Data file name
		FileOutputStream fileOut = new FileOutputStream(testDataExcelPath + testDataExcelFileName);
		excelWorkBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
	
}
