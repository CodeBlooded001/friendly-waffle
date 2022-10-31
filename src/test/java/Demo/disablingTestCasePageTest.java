package Demo;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DemoObjects.disablingTestCasePage;
import base.TestBase;

public class disablingTestCasePageTest extends TestBase {
	disablingTestCasePage disPage;
	public disablingTestCasePageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void launchingBrowser() throws IOException {
		initialization();
		disPage = new disablingTestCasePage(driver);
	}
	@Test(enabled = true)
	public void m1() {
		System.out.println("Hello");
	}
	/*
	 Disable the execution of a particular test or set of tests
	 Can use this at class level also*/
	@Test(enabled = false)
	public void m2() {
		System.out.println("Hi");
	}
	@Test
	public void m3() {
		System.out.println("Hello-Hi");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	/*Suppose a scenario where a serious bug exists in a 
	  certain test belonging to a certain scenario that
	  cannot be executed. As the issue has already been 
	  identified. Therefore, we may need to disable that 
	  certain test from being executed.*/

}
