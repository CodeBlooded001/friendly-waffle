package MetaGroupsDemo;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MetaGroupsDemoObjects.basicGroupObject;
import base.TestBase;

public class basicGroupTest extends TestBase {
    basicGroupObject groupObject;
	public basicGroupTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void launchingBrowser() throws IOException {
		initialization();
		groupObject = new basicGroupObject(driver);
	}
	/*both test methods will execute in one group named Chemistry.
	 *We can add a method or an entire class to a group by using 
	   groups parameter*/
	@Test(groups = {"Chemistry"})
	public void atom() {
		System.out.println("Atom Method");
	}
	@Test(groups = {"Chemistry"})
	public void electron() {
		System.out.println("Electron Method");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
