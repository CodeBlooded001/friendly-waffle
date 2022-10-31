package Demo;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DemoObjects.dependsOnMethodTestAnnoPage;
import base.TestBase;

public class dependsOnMethodTestAnnoPageTest extends TestBase {
    dependsOnMethodTestAnnoPage depPage;
	public dependsOnMethodTestAnnoPageTest() throws IOException {
		//a ref variable used to refer parent class object.
		super();
	}
	@BeforeMethod
	public void launchingBrowser() throws IOException {
		initialization();
		depPage = new dependsOnMethodTestAnnoPage(driver);
	}
	/*
	  enable attribute is used to disable the execution of a 
	  particular test or set of tests.
	 */
	@Test()
	public void m1() {
		System.out.println("Test Method One");
	}
	@Test(dependsOnMethods = "m1")
	public void m2() {
		System.out.println("Test Method Two");
	}
	/*
	  any of those methods which are dependent not
	  executed successfully,then this test method will 
	  not be run and will be flagged as a SKIP
	*/
	@Test
	public void m3() {
		Assert.fail();
		System.out.println("Test Method Three");
	}
	/* 
	   will run after executing all those methods on which 
	   this test method is dependent
	*/
	@Test(dependsOnMethods = {"m3","m1"},description = "Depending on m1 and m3")
	public void m4() {
		System.out.println("Test Method four");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
