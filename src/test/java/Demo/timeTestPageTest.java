package Demo;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DemoObjects.timeTestPage;
import base.TestBase;

public class timeTestPageTest extends TestBase {
    timeTestPage timePage;
	public timeTestPageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void launchingBrowser() throws IOException {
		initialization();
		timePage = new timeTestPage(driver);
	}
	/*
	 * specifies a time period to wait for a test for complete execution
	 *during running test, there can be cases where certain tests may 
	  take much more time than expected. in such case test case will be
	  failed.
	 *two ways :
	 	*At suite level
	 	*At each test method level
	 		(applicable for each test method)
	 		(it will override the time period if you
	 		configured it at the suite level)*/
	@Test
	public void m1() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Hello");
	}
	@Test
	public void m2() throws InterruptedException {
		Thread.sleep(400);
		System.out.println("Java");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	/*In the preceding testng.xml file, a suite tag
	  contains an attribute named time-out which has 
	  been set with a value 500. This attribute will 
	  set a time-out period for test methods in the 
	  whole suite.
	  
	  That means if any test method in this suite 
	  takes more time than the specified time period 
	  (in this case 500 milliseconds) for complete 
	  execution, it will be marked as failed.  
	*/
	
	

}
