package Run;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import name.LoginElements;

public class Loginerp
{
	@Test
	public void login() throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
	WebDriver driver=new ChromeDriver();
	driver.get("https://myswaastherp.sia.co.in/#/login");
	
	driver.manage().window().maximize();
	
	LoginElements.EmailId(driver).sendKeys("wiuk@gmail.com");
	System.out.println("Enter user name successfully");
	
	LoginElements.Password(driver).sendKeys("rahulyadav");
	
	System.out.println("Enter password successfully");
	
	LoginElements.loginbutton(driver).click();
	System.out.println("clicking login button successfully");
	Thread.sleep(4000);
	LoginElements.dropdown(driver).click();
	Thread.sleep(2000);
	LoginElements.clinicone(driver).click();
	Thread.sleep(2000);
	LoginElements.Gotoclinic(driver).click();
	
	

}
}

