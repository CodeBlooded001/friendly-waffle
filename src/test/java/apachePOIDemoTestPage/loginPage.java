package apachePOIDemoTestPage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import apachePOIDemoObject.loginObject;
import base.TestBase;
import utils.ExcelUtils;

public class loginPage extends TestBase {
	loginObject logObj;
	public loginPage() throws IOException {
		super();
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		logObj = new loginObject(driver);
		System.out.println("*****SetUp Test Level Data******");
		ExcelUtils.setExcelFileSheet("LoginData");
	}
	@Test
	public void m1() {
		System.out.println("Successful m1!");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
