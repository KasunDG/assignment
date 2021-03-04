package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Plan {
	
	
	public WebDriver driver;
	
	
	By btn_Plan = By.xpath("//h3[contains(text(),'Rs. 600 Plan')]/../a");
	By btn_AddToCart = By.xpath("//input[@id=\"submitButtonId\"]");


	public Plan(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement btn_Plan()
	{
		return driver.findElement(btn_Plan);
	}
	
	public WebElement btn_AddToCart()
	{
		return driver.findElement(btn_AddToCart);
	}
	
	

}
