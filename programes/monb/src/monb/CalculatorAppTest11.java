package monb;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorAppTest11
{
	@AndroidFindBy(id = "app.kwc.math.totalcalc:id/simple_calc_btn")
	                   //app.kwc.math.totalcalc:id/simple_calc_btn
    private MobileElement simpleCalculator;
	
	@AndroidFindBy(id = "app.kwc.math.totalcalc:id/num4btn")
    private MobileElement buttonFour;
	
	@AndroidFindBy(id = "app.kwc.math.totalcalc:id/plusbtn")
    private MobileElement buttonPlus;
	
	@AndroidFindBy(id = "app.kwc.math.totalcalc:id/num3btn")
    private MobileElement buttonThree;
	
	@AndroidFindBy(id = "app.kwc.math.totalcalc:id/equalbtn")
    private MobileElement buttonEqual;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[2]")
    private MobileElement resultField;
	
	public AppiumDriver driver ;
	
	String AppPath = "/home/aj/Pictures/AppFile_Calculator/Total Calculator.apk";
		
	@BeforeMethod
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
	}
	
	@AfterMethod
	public void quitAppiumInstance() throws Exception
	{
		driver.quit();
	}
	
	@Test
	public void addOperationTest() throws Exception
	{
		//Tap on Simple Calculator
		simpleCalculator.click();
		Thread.sleep(2000);
		//Tap on Button Four
		buttonFour.click();
		Thread.sleep(2000);
		//Tap on Button Plus
		buttonPlus.click();
		Thread.sleep(2000);
		//Tap on Button Three
		buttonThree.click();
		Thread.sleep(2000);
		//Tap on Button Equal
		buttonEqual.click();
		Thread.sleep(2000);
		//Get Result
		String actualResult = resultField.getText();
		Thread.sleep(2000);
		//Print result on java console
		System.out.println(actualResult);
		Thread.sleep(2000);
		
	}
}
