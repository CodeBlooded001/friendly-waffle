package testPages;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.ParameterizationPage;

public class ParameterizationPageTest extends TestBase {
	ParameterizationPage paraPage;

	public ParameterizationPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void launchingBrowser() throws IOException {
		initialization();
		paraPage = new ParameterizationPage(driver);
	}

	@Test
	public void UserName() {
	paraPage.fillForm("yashu", "yashu12345");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
