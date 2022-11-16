package apachePOIDemoTestPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import apachePOIDemoObject.ApachePOI;
import base.TestBase;

public class ApachePOITest extends TestBase {
    ApachePOI poi;
    FileInputStream fis;
    String filePath = "E:\\WorkSpace\\Omayo_TestNg\\src\\test\\resources\\testData\\Book1.xlsx";
	public ApachePOITest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		poi = new ApachePOI(driver);
		/*Create an object of file class to open xlsx file*/
		File file = new File(filePath);
		/*Create an object of FileInputStream class to read
		  excel file*/
		fis = new FileInputStream(file);
		/*Create an workbook instance that refers to 
		  .xls file*/
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		/*Create a sheet object using the sheet name*/
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		/*Create a row an object to retrieve row at index 1*/
		XSSFRow row1 = sheet.getRow(0);
		/*Create a cell object to retrive cell at index5*/
		XSSFCell cell = row1.getCell(0);
		/*Get the address in a variable*/
		String cellValue = cell.getStringCellValue();
		/*Printing the cell Value*/
		System.out.println("Cell Value is :"+cellValue);
	}
	@Test
	public void printAddress() {
		System.out.println("Successful!");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
