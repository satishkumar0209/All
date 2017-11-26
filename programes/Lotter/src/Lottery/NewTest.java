package Lottery;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest {
	  

	WebDriver driver;
	String baseURL = "http://lottery1.sia.co.in/";

	
	String nodeURL = "http://192.168.1.43:5555/wd/hub";
	
	// http://192.168.1.43:5555
	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException 
	{
        
		
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.LINUX);
		driver = new RemoteWebDriver(new URL(nodeURL),cap);
		System.out.println("hello");
		driver.get(baseURL);
		driver.findElement(By.xpath("(//*[@formcontrolname='username'])[1]")).sendKeys("priyanka");
		driver.findElement(By.xpath("(//*[@formcontrolname='password'])[1]")).sendKeys("123456");
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[4]")).click();
		Thread.sleep(5000);
		
	}
	
	@AfterTest
	public void aftertest()
	{
		
	}
	@Test
	public void SimpleTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/aj/Pictures/chromedriver");
		WebDriver driver = new ChromeDriver();
		// wd.manage().window().maximize();
		driver.get(baseURL);
		driver.findElement(By.xpath("(//*[@formcontrolname='username'])[1]")).sendKeys("priyanka");
		driver.findElement(By.xpath("(//*[@formcontrolname='password'])[1]")).sendKeys("123456");
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[4]")).click();
		Thread.sleep(5000);

		JavascriptExecutor je = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.xpath("//*[@id='myModal']/div/div[3]/button[2]"));

		je.executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.cssSelector("#myModal > div > div.ui-g-12.fotter-row > button:nth-child(2)")).click();
		Thread.sleep(5000);

		fourd game = new fourd();
		game.fgame(driver);

		quickbet qdets = new quickbet();
		qdets.qbet(driver);

		Bolakbalik bba = new Bolakbalik();
		bba.bbalik(driver);
	        
	}
}

