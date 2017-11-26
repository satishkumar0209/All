package monb;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class tre
{

public AppiumDriver driver ;
	
	
	String AppPath = "/home/aj/Downloads/MYSWAASTH.apk";
		
	@Test
	public void createAppiumInstance() throws InterruptedException 
	{
		try
		{
		
			DesiredCapabilities caps = new DesiredCapabilities();
			
			
			//platformName: 'Android'
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");	
			
			caps.setCapability("version", "4.4.4");
			
			caps.setCapability("app", AppPath);
			
			caps.setCapability("newCommandTimeout", "8000");
			
			//Appium instance

			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"),caps);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		catch(Exception e)
		{
			System.out.println("Appium session is not created" + e);
		}
	
		Thread.sleep(4000);
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@index='2']")).click();
		
		
	
		 
	
		
	}
}

