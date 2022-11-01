package Demo;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DemoObjects.timeOutMethodLevel;
import base.TestBase;

public class timeOutMethodLevelPageTest extends TestBase{
	timeOutMethodLevel tPage;
	public timeOutMethodLevelPageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void launchingBrowser() throws IOException {
		initialization();
		tPage = new timeOutMethodLevel(driver);
	}
	/*This feature is useful for specifying the predefined
	  execution time limit for a specific method.
    */
	@Test(timeOut = 500)
	public void m1() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Test method one!");
	}
	@Test(timeOut = 500)
	public void m2() throws InterruptedException {
		Thread.sleep(400);
		System.out.println("Test Method two!");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	/* TestNG executed two tests and failed the 
	   first test because the first test has 
	   taken more time to complete execution 
	   than time specified in the timeOut 
	   attribute of Test annotation.
	*/
}
