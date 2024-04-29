package resources;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	public static Logger logger;

	public AppiumDriver<MobileElement> driver;

	@Test
	public AppiumDriver<MobileElement> initialize_driver() {

		try {
			logger = Logger.getLogger("Spotify");
			PropertyConfigurator.configure("log4j.properties");
			
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.UDID, "B6NN6DSW5DAUCYW4");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Andriod");
			
			dc.setCapability("appPackage", "com.spotify.music");
			dc.setCapability("appActivity", "com.spotify.music.MainActivity");
			 dc.setCapability("noReset", true);
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, dc);
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		} catch (MalformedURLException exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		return driver;

	}

	@AfterSuite(enabled = false)
	public void tear_down() {
		driver.close();
		driver.quit();
	}

}



