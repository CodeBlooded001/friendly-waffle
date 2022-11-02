package MetaGroupsDemo;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MetaGroupsDemoObjects.groupingTestMethodsObject;
import base.TestBase;

public class groupingTestMethodsTest extends TestBase{
    groupingTestMethodsObject gPage;
	public groupingTestMethodsTest() throws IOException {
		super();
	}
    @BeforeMethod
    public void launchingBrowser() throws IOException {
    	initialization();
    	gPage = new groupingTestMethodsObject(driver);
    }
    /*When we will run the above test in eclipse normally
     , we will notice in the output that test execution 
     has not considered the specified group for execution, 
     and test methods are not executed in a group.
    */
    @Test(groups= {"Car"})
    public void mahindar() {
    	System.out.println("CAR1:Mahindar");
    }
    @Test
    public void sedan() {
    	System.out.println("Sedan CAR");
    }
    @Test(groups = {"Car"})
    public void Bajaj() {
    	System.out.println("CAR2:Bajaj Alto");
    }
    @AfterMethod
    public void tearDown() {
    	driver.quit();
    }
}
