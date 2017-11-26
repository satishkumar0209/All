package selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class subdomain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://welcome.sia.co.in/");
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
	    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
	    driver.get("http://www.bing.com/");
	    System.out.println(driver.getTitle());
	    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
	    driver.get("http://www.yahoo.com/");
		
		//driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[1]")).click();
		Thread.sleep(2000);
		//Book appointment
		//driver.findElement(By.xpath("(//*[@class='doctor-name'])[1]")).click();
		//View all Timings
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,250)", "");
//		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[2]")).click();

//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("window.scrollBy(0,450)", "");
	driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[3]")).click();
	Thread.sleep(2000);
		String element=driver.findElement(By.xpath("//*[@class='doctor-name']")).getText();
		System.out.println(element);
		
		
		if(element.equals("Dr. Vishu"))
		{
			System.out.println("matching");
		}
		else
		{
			System.out.println("not");
		}
		driver.findElement(By.xpath("//*[@class='ui-inputtext ui-widget ui-state-default ui-corner-all']")).click();
		//driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("26")).click();
		Thread.sleep(2000);
		//Time
		
		driver.findElement(By.xpath("(//*[text()='7:00 PM'])[2]")).click();
		//Continue
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[2]")).click();
		
		//mobile
		driver.findElement(By.xpath("(//*[@class='ng-untouched ng-pristine ng-invalid ui-inputtext ui-corner-all ui-state-default ui-widget'])[1]")).sendKeys("9433141529");
		//patient name 
		driver.findElement(By.xpath("//*[@ng-reflect-name='patient_name']")).sendKeys("satish kumar");
		//email
		driver.findElement(By.xpath("//*[@class='ng-untouched ng-pristine ng-valid ui-inputtext ui-corner-all ui-state-default ui-widget']")).sendKeys("mss@msss.com");
		
		//gender
		driver.findElement(By.xpath("(//*[@class='ui-radiobutton-box ui-widget ui-state-default'])[1]")).click();
		System.out.println("start");
		//continue
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[2]")).click();
		System.out.println("End");
		//new tab
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		driver.get("https://apiv4.sia.co.in/mahaflox");
		
		
		//otp 
		
		
		
		driver.findElement(By.xpath("//*[@formcontrolname='otp']")).sendKeys("");
		
		
	}

}
