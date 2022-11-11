package testPages;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.homePage;

public class homePageTest extends TestBase {
	homePage hp;
	public homePageTest() throws IOException {
		super();
	}

	/*
	 * The super keyword in Java is a reference variable 
	   which is used to refer immediate parent class object.
	 */
	@BeforeMethod
	public void browserLaunch() throws IOException {
		System.out.println("Before Method");
		//calling method from your TestBase
		initialization();
		hp = new homePage(driver);
	
	}
    @Test
    public void verifying_HomePageTitle() {
    	System.out.println("Home Page Tile - First Test");
    	String title = hp.ValidatingTitle();
    	Assert.assertEquals(title,"omayo (QAFox.com)");
    }
    @Test
    public void verifyDisplay() {
    	System.out.println("Verify Display - Second Test");
    	boolean Displaying_Text = hp.verifyDisplay();
    	Assert.assertTrue(Displaying_Text);
    }
    @AfterMethod
    public void tearDown() {
    	System.out.println("After Method");
    	driver.quit();
    }
}
