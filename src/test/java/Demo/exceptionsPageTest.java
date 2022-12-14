package Demo;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DemoObjects.exceptionsPage;
import base.TestBase;

public class exceptionsPageTest extends TestBase {
	
	exceptionsPage excPage;
	public exceptionsPageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void launchingBrowser() throws IOException {
		initialization();
		excPage = new exceptionsPage(driver);
	}
	/*
	  specifies the type of exceptions that are expected
	  to be thrown by a test method during execution.
	*/
	@Test(expectedExceptions = IOException.class)
	public void exceptionTestOne() throws IOException {
		throw new IOException();
	}
	/*If the exception thrown by a test method does not 
	  match with the exception list entered by user, 
	  the test method will be marked as failed.
	  
	  TestNG also supports multiple expected exceptions 
	  for verification while executing a particular test.*/
	@Test(expectedExceptions = {IOException.class, 
			ArithmeticException.class})
	public void exceptionTestTwo() throws Exception {
		throw new Exception();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
