package two;

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

public class ak {
	  

	WebDriver driver;
	String baseURL = "http://lottery1.sia.co.in/";
	
	
	String baseURL2 = "http://lottery1.sia.co.in/#/profile/4d-3d-2d/4d-set";
	
	String bolakbalik="http://lottery1.sia.co.in/#/profile/4d-3d-2d/bolak-balik";
	
	String fourd="http://lottery1.sia.co.in/#/profile/4d-3d-2d";
	
	String BBcampuran="http://lottery1.sia.co.in/#/profile/4d-3d-2d/BB-campuran";
	
	String fourDset="http://lottery1.sia.co.in/#/profile/4d-3d-2d/4d-set";
	
	String quickbet="http://lottery1.sia.co.in/#/profile/4d-3d-2d/quick-bet";
	
	String QuicktwoD="http://lottery1.sia.co.in/#/profile/4d-3d-2d/quick-2d";
	
	
	 String nodeURL = "http://192.168.1.5:5555/wd/hub";//gaurav
	
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
		JavascriptExecutor je = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.xpath("//*[@id='myModal']/div/div[3]/button[2]"));

		je.executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.cssSelector("#myModal > div > div.ui-g-12.fotter-row > button:nth-child(2)")).click();
		Thread.sleep(5000);
		System.out.println("4D game start");
		driver.get(baseURL2);      
//		driver.findElement(By.xpath("//*[@id='gameSection']/div/app-four-three-two-d/div/div[2]/div[1]/p[2]/span[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@formcontrolname='bet']")).sendKeys("2345");
		driver.findElement(By.xpath("//*[@formcontrolname='amount']")).sendKeys("1");
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[20]")).click();
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[20]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element1=driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]"));
		js.executeScript("arguments[0].scrollIntoView(true);", element1);
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]")).click();
		
		
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
		
		System.out.println("4D game start");
		driver.get(baseURL2);
		// driver.findElement(By.xpath("//*[@id='gameSection']/div/app-four-three-two-d/div/div[2]/div[1]/p[2]/span[1]")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@formcontrolname='bet']")).sendKeys("2345");
		driver.findElement(By.xpath("//*[@formcontrolname='amount']")).sendKeys("1");
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[20]")).click();
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[20]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]"));
		js.executeScript("arguments[0].scrollIntoView(true);", element1);
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]")).click();
		Thread.sleep(5000);
		
		
		
		
		driver.get(bolakbalik);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@formcontrolname='bet']")).sendKeys("2345");
		driver.findElement(By.xpath("//*[@formcontrolname='amount']")).sendKeys("1");
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[20]")).click();
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		
		WebElement element11 = driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]"));

		je1.executeScript("arguments[0].scrollIntoView(true);",element11);
		
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]")).click();
		
		
		driver.get(fourd);
		Thread.sleep(5000);
        driver.findElement(By.id("betcheckbox0")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("w0")).sendKeys("5");
        driver.findElement(By.id("x0")).sendKeys("2");
        driver.findElement(By.id("y0")).sendKeys("3");
        driver.findElement(By.id("z0")).sendKeys("6");
        driver.findElement(By.id("betTextBox0")).sendKeys("1000");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,800)", "");
        driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]")).click();
        
		
		
		driver.get(BBcampuran);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@formcontrolname='bet']")).sendKeys("2345");

		driver.findElement(By.xpath("//*[@formcontrolname='amount']")).sendKeys("1");
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[20]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[20]")).click();
		
		//check box
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
	//next
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[20]")).click();
		
		//2d continue
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[20]")).click();
		
		
		
		
		
		driver.get(quickbet);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@formcontrolname='bet']")).sendKeys("2345");

		driver.findElement(By.xpath("//*[@formcontrolname='amount']")).sendKeys("1");
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[20]")).click();
	
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]")).click();		
		
		
		
		
		
		
		driver.get(fourDset);      
//		driver.findElement(By.xpath("//*[@id='gameSection']/div/app-four-three-two-d/div/div[2]/div[1]/p[2]/span[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@formcontrolname='bet']")).sendKeys("2345");
		driver.findElement(By.xpath("//*[@formcontrolname='amount']")).sendKeys("1");
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[20]")).click();
		//driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[20]")).click();
		JavascriptExecutor js11=(JavascriptExecutor)driver;
		WebElement element111=driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]"));
		js11.executeScript("arguments[0].scrollIntoView(true);", element111);
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]")).click();
		
		System.out.println("seven games betting completed");
		
		driver.get(QuicktwoD);
		Thread.sleep(6000);
		JavascriptExecutor jsee = (JavascriptExecutor)driver;
		jsee.executeScript("window.scrollBy(0,-250)", "");
		//big
		driver.findElement(By.xpath("(//*[@type='radio'])[1]")).click();
		//Small
		//driver.findElement(By.xpath("(//*[@type='radio'])[2]")).click();
		//Odd
		//driver.findElement(By.xpath("(//*[@type='radio'])[3]")).click();
		//Even
		//driver.findElement(By.xpath("(//*[@type='radio'])[4]")).click();
		//Amount
		driver.findElement(By.xpath("//*[@formcontrolname='amount']")).sendKeys("1");
		//submit
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[20]")).click();
		JavascriptExecutor js111=(JavascriptExecutor)driver;
		WebElement element1111=driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]"));
		js111.executeScript("arguments[0].scrollIntoView(true);", element1111);
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]")).click();
		System.out.println("Done");
		
		
	        
	}
}

