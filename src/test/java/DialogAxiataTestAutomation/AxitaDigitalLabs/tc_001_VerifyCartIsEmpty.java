package DialogAxiataTestAutomation.AxitaDigitalLabs;

import org.testng.annotations.Test;


import pageObjects.Home;
import pageObjects.Mobile;
import pageObjects.Plan;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;


import resources.base;

public class tc_001_VerifyCartIsEmpty extends base {
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 @BeforeTest
	 //Initialize the driver
		public void initialize() throws IOException
		{
			driver=InitializeDriver();
			log.info("Initialize the driver successfully");
		}
		
	 
 @Test
		
		public void SelectPacakge() throws IOException
		{
		Home h=new Home(driver);
		
		//Verify home page
		
		
		
	//	Assert.assertEquals(h.ele_lbl_HomePage(), true);
		Assert.assertEquals(h.ele_lbl_HomePage(), true);
		
		
		//Select the mobile option in home screen
		h.lnk_Mobile().click();
		log.info("Click on mobile button sucessfully");
		
		
		Mobile m = new Mobile(driver);
		//Select the mobile package rates
		m.btn_MobileRates().click();
		log.info("Click on mobile rates button sucessfully");
		
		
		Plan p = new Plan(driver);
		
		p.btn_Plan().click();
		
		log.info("Select the mobile plan sucessfully");
		//Add to select package in to cart
		p.btn_AddToCart().click();
		
		log.info("Click on mobile button sucessfully");
		
		
						
		}

	 @AfterTest
		public void teardown()
		{
			driver.close();
			log.info("Closed the browser successfully");
			
		}
	 
//	// @DataProvider
//		
//		public Object[][] getData()
//		{
//			
//			Object[][] data = new Object[2][2];
//			data [0][0] = "";
//			data [0][1] = "";
//			data [1][0] = "";
//			data [1][1] = "";
//			
//			return data;
//			
//		}
		
	 
	 
}
