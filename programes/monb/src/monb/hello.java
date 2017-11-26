package monb;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class hello {
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
		
		
//	WebElement element=	driver.findElement(By.id("app.kwc.math.totalcalc:id/date_calc_btn"));
//	element.getText();
//	System.out.println("text="+element);
//	element.click();
	
	Thread.sleep(4000);
	
	//driver.findElement(By.id("app.kwc.math.totalcalc:id/num5btn")).click();
	//driver.findElement(By.id("app.kwc.math.totalcalc:id/num4btn")).click();
	
		 
	
		
	}
}



