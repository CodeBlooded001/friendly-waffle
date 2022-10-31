package DemoObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import base.TestBase;

public class dependsOnMethodTestAnnoPage extends TestBase {

	public dependsOnMethodTestAnnoPage(WebDriver driver) throws IOException {
		/*The super keyword in java is a reference variable that 
		is used to refer to parent class objects.
		*/
		super();
		TestBase.driver = driver;
		
	}

}
