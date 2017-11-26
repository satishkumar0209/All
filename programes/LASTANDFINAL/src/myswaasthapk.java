import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class myswaasthapk 

{
	
public AppiumDriver driver = null;
	
	String AppPath = "/home/aj/Downloads/MYSWAASTH.apk";
		
	@Test
	public void createAppiumInstance() 
	{
		try
		{
			//Set DesiredCapabilities
			DesiredCapabilities caps = new DesiredCapabilities();
			//device udid
			//caps.setCapability("device ID", "ZX1B33JTTD");
			//device name
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");	
			//device version
			caps.setCapability("version", "4.4.4");
			caps.setCapability("app", AppPath);
			caps.setCapability("newCommandTimeout", "1500");
			//Appium instance
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"),caps);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		catch(Exception e)
		{
			System.out.println("Appium session is not created" + e);
		}
	
	
	driver.findElementById("com.myswaasthv2:id/btn_skip").click();
			

}
}
