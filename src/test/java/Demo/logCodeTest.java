package Demo;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DemoObjects.logCodeObject;
import base.TestBase;

public class logCodeTest extends TestBase {
    logCodeObject logObject;
    Logger log = Logger.getLogger(logCodeTest.class.getName());
	public logCodeTest() throws IOException {
		super();
		DOMConfigurator.configure("log4j.xml");
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		logObject = new logCodeObject(driver);
		log.info("Opening website");
	}
	@Test
	public void TestingTitle() {
		String x = logObject.titleTest();
		Assert.assertEquals(x,"omayo (QAFox.com)");
		log.info("Title matched");
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
