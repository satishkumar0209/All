package Login;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import name.LoginElements;

public class Adminequaltodoctor 
{
	@Test
	public void login() throws InterruptedException, AWTException
	{

	System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
	WebDriver driver=new ChromeDriver();
	driver.get("https://myswaastherp.sia.co.in/#/login");
	
	driver.manage().window().maximize();
	
	LoginElements.EmailId(driver).sendKeys("08@gmail.com");
	System.out.println("Enter user name successfully");
	
	LoginElements.Password(driver).sendKeys("123456");
	System.out.println("Enter password successfully");
	LoginElements.loginbutton(driver).click();
	
	System.out.println("Clicking on Signin button successfully");
	Thread.sleep(5000);
	
	
	driver.findElement(By.xpath(".//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	
	 driver.findElement(By.cssSelector("[placeholder='Enter registration no.']")).sendKeys("0864723159");
	
	 driver.findElement(By.xpath(".//*[@class='ng-pristine ng-invalid ui-inputtext ui-corner-all ui-state-default ui-widget ng-touched']")).sendKeys(" kumar");
	
	driver.findElement(By.xpath(".//*[@placeholder='Enter email address']")).sendKeys("kumar@gmail.com");
	
	driver.findElement(By.xpath(".//*[@class='ng-untouched ng-pristine ng-invalid ui-inputtext ui-corner-all ui-state-default ui-widget']")).sendKeys("2052005205");
	
	
	
}
}
