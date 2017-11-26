package Login;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	
	LoginElements.EmailId(driver).sendKeys("automation@gmail.com");
	
	System.out.println("Enter user name successfully");
	
	LoginElements.Password(driver).sendKeys("123456");
	System.out.println("Enter password successfully");
	LoginElements.loginbutton(driver).click();
	
	System.out.println("Clicking on Signin button successfully");
	Thread.sleep(5000);
	
	driver.get("https://myswaastherp.sia.co.in/#/home/profile");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	
	driver.findElement(By.xpath("(.//*[@class='ui-progressbar-label'])[3]")).getText();
	
	driver.findElement(By.xpath("(.//*[@class='ui-button-text ui-c'])[6]")).click();
	
	
	
	
}
}
