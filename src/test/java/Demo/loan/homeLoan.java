package Demo.loan;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

public class homeLoan extends TestBase {
    homeLoanObj hloan;
	public homeLoan() throws IOException {
		super();
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		hloan = new homeLoanObj(driver);
	}
	@Test
	public void homeLoan1() {
		System.out.println("Home Loan");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
