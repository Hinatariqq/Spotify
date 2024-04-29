package page_objects;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Home_PO {
	public AppiumDriver<MobileElement> driver;

	// UAE Button
	By browse_all = By.xpath("(//android.widget.Button[@resource-id=\"com.spotify.music:id/card\"])[1]");
	

	// First Music
	//By click_on_ist_item = By.xpath("(//android.widget.ImageView[@resource-id=\"android:id/icon\"])[1]");

	
	
	public Home_PO(AppiumDriver<MobileElement> driver2) {
		this.driver = driver2;
	}
	//new element
	
	public MobileElement Togetyoustarted() {
		return driver.findElementByXPath("(//android.widget.ImageView[@resource-id=\"com.spotify.music:id/image\"])[1]");
	}
	
	public MobileElement Back_button() {
		return driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Back\"]");
	}
	
	public MobileElement Search_music() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"Select Music\"]");
	}

	public MobileElement Search_podcasts() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"Select Podcasts\"]");
	}

	public MobileElement Search_main() {
		return driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Search\"]");
	}

	public MobileElement Browse_all() {
		return driver.findElement(browse_all);
		
	}

	public MobileElement  Your_Library() {
		return driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Your Library\"]");
	}
	
	public MobileElement  Recents() {
		return driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Anirudh Ravichander, Artist, \"]");
	}

	public MobileElement  Play() {
		return driver.findElementByXPath("//android.widget.ImageView[@resource-id=\"com.spotify.music:id/button_play_and_pause\"]");
	}
	
	
	public MobileElement  Pause() {
		return driver.findElementByXPath("//android.widget.ImageView[@resource-id=\"com.spotify.music:id/button_play_and_pause\"]");
	}
	
	public MobileElement  home() {
		return driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Home\"]");
	}
	
	public MobileElement  profile() {
		return driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Profile\"]");
	}
	
	public MobileElement  setting_Privacy() {
		return driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.spotify.music:id/link_row_sidedrawer_title\" and @text=\"Settings and privacy\"]");
	}
	
	public MobileElement  Logout() {
		return driver.findElementByXPath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Log out\"]");
		
		
	}
}
