package Erp;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import name.LoginElements;

public class crossbrowsing 

{

	@Test
	public void login() throws InterruptedException, AWTException
	{

	System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
	WebDriver driver=new ChromeDriver();
	driver.get("https://myswaastherp.sia.co.in/#/login");
	
	driver.manage().window().maximize();
	
	Login.LoginElements.EmailId(driver).sendKeys("08@gmail.com");
	
	System.out.println("Enter user name successfully");
	
	LoginElements.Password(driver).sendKeys("123456");
	System.out.println("Enter password successfully");
	LoginElements.loginbutton(driver).click();
	
	System.out.println("Clicking on Signin button successfully");
	Thread.sleep(5000);
	
	
}
}
