package Demo.loan;

import java.io.IOException;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

public class carLoan extends TestBase {

	public carLoan() throws IOException {
		super();
	}
	carLoanObj cloan;

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		cloan = new carLoanObj(driver);
	}

	@Test
	public void carLoan1() {
		System.out.println("Car Loan");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
