package Login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import name.Clinicdetails;
import name.Editprofile;
import name.LoginElements;

public class Myclinic 
{

	public static WebDriver driver;
	@Test
	public void login() throws InterruptedException, AWTException
	{
	Robot robot=new Robot();

		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://myswaastherp.sia.co.in/#/login");
		
		driver.manage().window().maximize();
		
		LoginElements.EmailId(driver).sendKeys("satishkumar@innotical.com");
		System.out.println("Enter user name successfully");
		
		LoginElements.Password(driver).sendKeys("123456");
		System.out.println("Enter password successfully");
		
		LoginElements.loginbutton(driver).click();
		
		System.out.println("Clicking on Signin button successfully");
		Thread.sleep(3000);
		
		String url=driver.getCurrentUrl();
		System.out.println("url");
		
		Assert.assertEquals(url, "https://myswaastherp.sia.co.in/#/home/profile");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Editprofile.Completeprofile1(driver).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		
//		Clinicdetails.Logo(driver).click();
//		
//		Thread.sleep(3000);
//		
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		
//		
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//		Clinicdetails.clicnic(driver).clear();
//		
//		
//		Clinicdetails.clicnic(driver).sendKeys("d");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Clinicdetails.Clinicname(driver).click();
		
		Clinicdetails.Aboutclinic(driver).clear();
		
		Clinicdetails.Aboutclinic(driver).sendKeys("satish");
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}