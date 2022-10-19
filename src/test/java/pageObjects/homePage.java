package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class homePage extends TestBase {
	//Page Objects or Object Repositories 
	
	@FindBy(xpath="//h1[@class='title']")
	WebElement textDisplay;
	
	@FindBy(xpath="//a[@id='selenium143']")
	WebElement linkToPage;
	
	//Constructor
	public homePage(WebDriver driver) throws IOException {
		TestBase.driver = driver;
		//Initilizing Elements
		PageFactory.initElements(driver, this);
	}
	
	//Actions - methods
	public String ValidatingTitle(){
		return driver.getTitle();
	}
	public boolean verifyDisplay() {
		return textDisplay.isDisplayed();
	}
	public static void main(String[] args) {}

}
