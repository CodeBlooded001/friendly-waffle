package Demo.loan;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.TestBase;

public class personalLoan extends TestBase {
    personalLoanObj perLoanObj;
	public personalLoan() throws IOException {
		super();
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		perLoanObj = new personalLoanObj(driver);
	}
	@Test
	public void personalLoan1() {
		System.out.println("Personal Loan");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@BeforeSuite
	public void before_suit() {
		System.out.println("First Method");
	}
}
