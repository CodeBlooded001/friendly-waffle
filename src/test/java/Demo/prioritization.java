package Demo;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.prioritizationPage;

public class prioritization extends TestBase {
	prioritizationPage pPage;
	public prioritization() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void browserLaunch() throws IOException {
		initialization();
		pPage = new prioritizationPage(driver);
	}
	/*	
	 * priority 
	 * priority - 0
	 * Method - a
	 * Method - b
	 * Method - c
	 * priority -1
	*/	
	@Test (priority = 1)
	public void CloseBrowser() {
		driver.quit();
		System.out.println("Closing Google Chrome Browser!");
	}
	@Test
	public void c() {
		System.out.println("Unprioritized-Two");
	}
	@Test
	public void a() {
		System.out.println("Unprioritized Method!");
	}
	@Test
	public void b() {
		System.out.println("Unprioritized-One");
	}
	@Test (priority = 0)
	public void OpenBrowser() {
		System.out.println("Launching the Google Chrome!");
		String url = props.getProperty("url");
		driver.get(url);
	}
	
}
