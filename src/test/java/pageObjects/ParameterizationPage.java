package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ParameterizationPage extends TestBase{
    @FindBy(xpath="//input[@type='text']")
    WebElement Username;
    
    @FindBy(xpath="//input[@type='password']")
    WebElement Password;
    
	public ParameterizationPage(WebDriver driver) throws IOException {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String fillForm(String un , String pwd) {
		Username.sendKeys(un);
		Password.sendKeys(pwd);
		return null;
	}
	
}
