package Demo;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DemoObjects.groupingPage;
import base.TestBase;

public class groupingPageTest extends TestBase {
    groupingPage gp;
	public groupingPageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void launchingBrowser() throws IOException {
		initialization();
		gp = new groupingPage(driver);
	}
	@Test(groups = "homePage")
	public void homePageTest() {
		System.out.println("Home Page Display Successfully");
	}
	@Test(groups = "transactionsPage")
	public void transactionsPageTest() {
		System.out.println("Transaction Page Displayed successfully");
	}
	@Test(groups = {"homePage","transactionsPage"})
	public void dependOnGroupTest1() {
		System.out.println("Dependency Tested Successfully!");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
