package Test_Cases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_objects.Home_PO;
import resources.BaseClass;

public class Main_test_flow extends BaseClass {

	@BeforeTest
	public void initialize() {
		try {

			driver = initialize_driver();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 1, enabled = true)
	public void main_test() throws InterruptedException {
		logger.info("Successfully launched the Application");
		Home_PO home = new Home_PO(driver);
		
		home.Togetyoustarted().click();
		logger.info("Successfully clicked on to-get-you started Button");
		Thread.sleep(1500);
		
		home.Back_button().click();
		logger.info("Successfully clicked on back  Button");
		Thread.sleep(1500);  
		
		
		home.Search_music().click();
		logger.info("Successfully clicked on MUSIC Button");
		Thread.sleep(1500);
		

		home.Search_podcasts().click();
		logger.info("Successfully clicked on PODCAST Button");
		Thread.sleep(1500);
		
		home.Search_main().click();
		logger.info("Successfully clicked on search Button");
		Thread.sleep(1500);
		
		home.Browse_all().click();
		logger.info("Successfully clicked on browse all tab");
		Thread.sleep(1500);


		home.Your_Library().click();
		logger.info("Successfully clicked on Your Library tab");
		Thread.sleep(1500);
		
		
		home.Recents().click();
		logger.info("Successfully clicked on Recents ");
		Thread.sleep(1500);
		
		home.Play().click();
		logger.info("Successfully clicked on Play button ");
		Thread.sleep(1500);
		
		home.Pause().click();
		logger.info("Successfully clicked on pause button ");
		Thread.sleep(1500);
		
		home.home().click();
		logger.info("Successfully clicked on home button ");
		Thread.sleep(1500);
		
		home.profile().click();
		logger.info("Successfully clicked on profile icon ");
		Thread.sleep(1500);
		
		home.setting_Privacy().click();
		logger.info("Successfully clicked onsetting and privacy");
		Thread.sleep(1500);
		
		home.Logout().click();
		logger.info("Successfully clicked on Logout");
		Thread.sleep(1500);
	}

}