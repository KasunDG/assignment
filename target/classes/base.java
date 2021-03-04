package resources;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class base {
	
	public WebDriver driver;
	
	
	public WebDriver InitializeDriver() throws IOException{
	
	
	Properties prop = new Properties();
	
	FileInputStream fis = new FileInputStream("/Users/eclipse-workspace4/AxitaDigitalLabs/src/main/java/resources/data.properties");
	
	prop.load(fis);
	
String browser =prop.getProperty("browser");
String url= prop.getProperty("url");



if (browser.equals("chrome"))
	

{
	System.setProperty("webdriver.chrome.driver", "/Users/Documents/Proffessional/Selenium/chromedriver");
	 driver = new ChromeDriver();
	 driver.get(url);
		driver.manage().window().maximize();
	
	}
	
else if(browser.equals("firefox"))
	
{
	System.setProperty("webdriver.gecko.driver", "/Users/Documents/Proffessional/Selenium/chromedriver");
	 driver = new FirefoxDriver();
	 driver.get(url);
		driver.manage().window().maximize();
		
}

if(browser.equals("ie"))


{
	System.setProperty("webdriver.ie.driver", "/Users/Documents/Proffessional/Selenium/chromedriver");
	 driver = new InternetExplorerDriver();
	 driver.get(url);
		driver.manage().window().maximize();
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

return driver;
	

	}
	

	
		
	}
	

