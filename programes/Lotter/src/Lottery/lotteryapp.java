package Lottery;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;

public class lotteryapp {

	public AppiumDriver driver;
	
	String AppPath = "/home/aj/Pictures/LAST.apk";
	
	@Test
	public void createAppiumInstance() throws MalformedURLException, InterruptedException 
	{
		
			//Set DesiredCapabilities
			DesiredCapabilities caps = new DesiredCapabilities();
			//device udid
			caps.setCapability("device ID", "SM-G920L");
			//device name
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S6");	
			//device version
			caps.setCapability("version", "7.0");
			caps.setCapability("app", AppPath);
			caps.setCapability("newCommandTimeout", "600");
			//Appium instancey
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"),caps);
			
			driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			
			
			
			//driver.findElementByName("JOIN").click();
			
			driver.findElement(By.name("JOIN")).click();
			
			
			
			//driver.findElement(By.xpath("//*[@name='User Name']")).sendKeys("satish");
			System.out.println("hello");
	//	WebElement a=driver.findElements(By.xpath("//android.widget.EditText[@text='User Name' and @index='0']"));

			

			
			//WebElement login=driver.findElement(By.xpath("//android.widget.Button[contains(text(),'User Name' and @index='0'])]"));
			//login.sendKeys("satish");
			//TextView[contains(text(),'All contacts')]
			//System.out.println("hello");
		
		//driver.findElement(By.name("JOIN ")).click();
//driver.findElementByName("JOIN ").click();
	//WebElement ele=driver.findElement(MobileBy.xpath("@class='android.widget.Button' and @index='0']"))	;
	//ele.click();
//	driver.findElementByClassName("android.widget.Button").sendKeys("sdfdsfsdfd");
//	driver.findElementByAccessibilityId("com.game.lottery").sendKeys("utfhtdffgd");
//	
	WebElement sal=driver.findElement(By.xpath("android.widget.Button[text='JOIN']"));
	sal.click();
		//driver.findElementByXPath("android.widget.EditText[@index='0']").sendKeys("satish");
		//driver.findElement(By.xpath("android.widget.EditText[@index='0']")).sendKeys("satish");
		
	}
}



