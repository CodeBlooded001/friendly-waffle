package pageObjects;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SecHomePage extends TestBase {
     
	//Page Objects or Object Repository 
	
	@FindBy(id="selenium143")
	WebElement link;
	
	//initilization method
    public SecHomePage() throws IOException {
//		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
    //method
    public blogspotPage clickLink() throws IOException {
    	link.click();
    	return new blogspotPage();
    }
	
	
	


}
