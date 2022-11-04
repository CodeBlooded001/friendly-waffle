package DemoObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class logCodeObject extends TestBase {
    @FindBy(xpath="//h1[@class = 'title']")
    WebElement title;
	public logCodeObject(WebDriver driver) throws IOException {
		super();
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String titleTest() {
		return driver.getTitle();
	}
    
}
