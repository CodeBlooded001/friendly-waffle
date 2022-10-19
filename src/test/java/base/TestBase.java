package base;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.TestUtils;

/*
 * 
 * 
 * File Input Stream - Java FileInputStream class obtains 
						input bytes from a file.
 
 * Properties - Properties class provides
                methods to get data from the 
                properties file and store data 
                into the properties file.
                Recompilation is not required 
                if the information is changed 
                from a properties file
 
                
*/public class TestBase {
	public static Properties props;
	public static WebDriver driver;
	public static TestUtils testUtils;
	String configFilePath = "E:\\WorkSpace\\Omayo_TestNg\\src\\test\\java\\config\\config.properties";
	public TestBase() throws IOException{
		try {
			 props = new Properties();
			 FileInputStream ip = new FileInputStream(configFilePath);
			 props.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = props.getProperty("browser");
		System.out.println(browserName); //chrome
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver();
			driver = new InternetExplorerDriver();
		}else if(browserName.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver();
			driver = new SafariDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get(props.getProperty("url"));
	}
	
}

