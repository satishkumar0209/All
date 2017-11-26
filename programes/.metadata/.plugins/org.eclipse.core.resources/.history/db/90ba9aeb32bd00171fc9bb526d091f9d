package http;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class extension {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.out.println("Unsuccess");
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");		
		ChromeOptions chromeoption=new ChromeOptions();
		chromeoption.addExtensions(new File("/home/aj/Pictures/way2sms_v3.8.crx"));
		DesiredCapabilities desiredcapabilities=DesiredCapabilities.chrome();
		desiredcapabilities.setCapability(chromeoption.CAPABILITY, chromeoption);
		driver=new ChromeDriver(desiredcapabilities);
		driver.manage().window().maximize();
		driver.get("http://site24.way2sms.com/content/index.html?");
		driver.findElement(By.id("username")).sendKeys("9014316925");
		driver.findElement(By.id("password")).sendKeys("9014316925");
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("sendSMS")).click();
		driver.switchTo().frame("frame");
		driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys("9717111858");
		driver.findElement(By.id("message")).sendKeys("hello");
		driver.findElement(By.id("Send")).click();
		Thread.sleep(4000);
		
		                             
		
		
	}

}
