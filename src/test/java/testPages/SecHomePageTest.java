package testPages;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.SecHomePage;

import pageObjects.blogspotPage;

public class SecHomePageTest extends TestBase {
    SecHomePage shPage;
    blogspotPage bsPage;
	public SecHomePageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		shPage = new SecHomePage();
	}
	@Test
	public void clickLink() throws IOException {
		shPage.clickLink();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
