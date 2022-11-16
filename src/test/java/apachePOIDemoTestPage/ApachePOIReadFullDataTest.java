package apachePOIDemoTestPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.helpers.XSSFRowShifter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import apachePOIDemoObject.ApachePOIReadFullData;
import base.TestBase;

public class ApachePOIReadFullDataTest extends TestBase {
	private static ApachePOIReadFullData poiFull;
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFCell cell;
	private static XSSFRow row;
	String filePath = "E:\\WorkSpace\\Omayo_TestNg\\src\\test\\resources\\testData\\Book1.xlsx";
	public ApachePOIReadFullDataTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		poiFull = new ApachePOIReadFullData(driver);
		File file = new File(filePath);
		FileInputStream ip = new FileInputStream(file);
		workbook = new XSSFWorkbook(ip);	
		sheet = workbook.getSheet("Sheet1");
		//get all the rows in the sheet
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		//iterate over all the row to print the data present in each cell
		for(int i=0;i<=rowCount;i++) {
			int cellCount = sheet.getRow(i).getLastCellNum();
			System.out.println("Row"+i+"data is :");
			for(int j=0;j<cellCount;j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()+",");
			}
			System.out.println();
		}
	}
	@Test
	public void justPrint() {
		System.out.println("Successful!");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
