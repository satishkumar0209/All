package Login;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import name.Clinicdetails;
import name.Details;
import name.Editprofile;
import name.LoginElements;

public class Smoke 
{
	@Test
	public void login() throws InterruptedException, AWTException, IOException
	{

	System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
	WebDriver driver=new ChromeDriver();
	driver.get("https://myswaastherp.sia.co.in/#/login");
	
	driver.manage().window().maximize();
	
	LoginElements.EmailId(driver).sendKeys("gsatishkumar0209@gmail.com");
	System.out.println("Enter user name successfully");
	
	LoginElements.Password(driver).sendKeys("123456");
	System.out.println("Enter password successfully");
	LoginElements.loginbutton(driver).click();
	
	System.out.println("Clicking on Signin button successfully");
	Thread.sleep(7000);
	
	driver.get("https://myswaastherp.sia.co.in/#/home/profile");
	
	//Assert.assertEquals(url, "https://myswaastherp.sia.co.in/#/home/profile");
	
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	Editprofile.Completeprofile1(driver).click();
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrFile, new File("/home/aj/screenshot/Complete profile.png"));
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Details.Documentsandcertificates(driver).click();
	File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   
    FileUtils.copyFile(scrFile1, new File("/home/aj/screenshot/Documents and certificates.png"));
	
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    Details.Timings(driver).click();
    File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   
    FileUtils.copyFile(scrFile2, new File("/home/aj/screenshot/Timingspage.png"));
    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Details.Locationandphotos(driver).click();
    File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
    FileUtils.copyFile(scrFile3, new File("/home/aj/screenshot/Location and photos page.png"));
   
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Details.Doctors(driver).click();
    File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
    FileUtils.copyFile(scrFile4, new File("/home/aj/screenshot/Doctores page.png"));

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Details.Services(driver).click();
    File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
    FileUtils.copyFile(scrFile5, new File("/home/aj/screenshot/Services.png"));
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Details.Clinicandcontactdetails(driver).click();  
    File scrFile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
    FileUtils.copyFile(scrFile6, new File("/home/aj/screenshot/Clinic and contact details.png"));

}

	
	

	
}

