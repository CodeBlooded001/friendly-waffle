package pageObjects;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utils.Log;

public class homePage extends TestBase {
	//Page Objects or Object Repositories 
	
	@FindBy(xpath="//h1[@class='title']")
	private WebElement textDisplay;
	
	@FindBy(xpath="//a[@id='selenium143']")
	private WebElement linkToPage;
	
	//Constructor
	public homePage(WebDriver driver) throws IOException {
		Log.startTestCase("Home Page Test");
		TestBase.driver = driver;
		//Initilizing Elements
		PageFactory.initElements(driver, this);
		Log.info("Initilization");
	}
	
	//Actions - methods
	public String ValidatingTitle(){
		Log.info("Validating the title");
		return driver.getTitle();
	}
	public boolean verifyDisplay() {
		Log.info("Verifying Title Display");
		return textDisplay.isDisplayed();
	}
	public static void main(String[] args) {}

}
