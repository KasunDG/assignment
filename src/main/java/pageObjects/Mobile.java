package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mobile {
	
	
	public WebDriver driver;
	
	
	By btn_MobileRates = By.xpath("//a[contains(text(),' Mobile Rate Plans')]");


	public Mobile(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement btn_MobileRates()
	{
		return driver.findElement(btn_MobileRates);
	}
	

}
