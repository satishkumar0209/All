package per;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class erp 
{

	public AppiumDriver driver;
	
	String Appath="/home/aj/Pictures/MySwaasth.apk";
	@Test
	public void createappium() throws MalformedURLException
	{
		try
		{
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability("version","4.4.4");
		cap.setCapability("app", Appath);
		
		cap.setCapability("newcommandTimeout", "8000");
		
		

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	}
	
	catch(Exception e)
	{
		System.out.println("Appium session is not created" + e);
	}
	

	driver.findElementById("id/loginTxt").click();
	
	
	
	}
	
	
	
	
	
}
