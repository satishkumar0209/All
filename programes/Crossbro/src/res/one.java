package res;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class one {
	 
	public WebDriver driver;
 
  @Parameters("browser")
 
  @BeforeClass
 
 
 
  public void beforeTest(String browser) 	
  {

 
	  if(browser.equalsIgnoreCase("firefox")) 
	  {
		  System.setProperty("webdriver.gecko.driver","/home/aj/Downloads/geckodriver"); 
			WebDriver driver=new ChromeDriver();
 
  			}
  				else if (browser.equalsIgnoreCase("chrome")) 
  					{ 
 
  						System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
  						WebDriver driver=new ChromeDriver();
  						} 
 
	  						driver.get("http://designco.sia.co.in/"); 
  							}
  
 
  
  
  @Test
  public void login() throws InterruptedException {
	  
	  driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("superadmin@gmail.com");
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("password123");
		driver.findElement(By.xpath(".//*[@type= 'submit']")).click();
		
  }
}





