package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	
	
	public WebDriver driver;
	
	
	By lnk_Mobile = By.linkText("Mobile");
	By ele_lbl_HomePage = By.xpath("//h2[contains(text(),\"Latest Devices\")]");


	public Home(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement lnk_Mobile()
	{
		return driver.findElement(lnk_Mobile);
	}
	
	public WebElement ele_lbl_HomePage()
	{
		return driver.findElement(ele_lbl_HomePage);
	}



	
	
	


}
