package http;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class extension {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

//		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
//		ChromeOptions chromeoption = new ChromeOptions();
//		chromeoption.addExtensions(new File("/home/aj/Pictures/way2sms_v3.8.crx"));
//		DesiredCapabilities desiredcapabilities = DesiredCapabilities.chrome();
//		desiredcapabilities.setCapability(chromeoption.CAPABILITY, chromeoption);
//		driver = new ChromeDriver(desiredcapabilities);
//		driver.manage().window().maximize();
//		driver.get("http://site24.way2sms.com/content/index.html?");
//		driver.findElement(By.id("username")).sendKeys("9014316925");
//		driver.findElement(By.id("password")).sendKeys("9014316925");
//		driver.findElement(By.id("loginBTN")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("sendSMS")).click();
//		driver.switchTo().frame("frame");
//		driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys("9717111858");
//		driver.findElement(By.id("message")).sendKeys("hello");
//		driver.findElement(By.id("Send")).click();
		ChromeDriver wd;
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
        wd = new ChromeDriver();
       // wd.manage().window().maximize();
        wd.get("http://lottery1.sia.co.in/");
        
        wd.findElement(By.xpath("//div[@class='main-header']/div[1]/div[2]/form/div/div[1]/input")).click();
        wd.findElement(By.xpath("//div[@class='main-header']/div[1]/div[2]/form/div/div[1]/input")).clear();
        wd.findElement(By.xpath("//div[@class='main-header']/div[1]/div[2]/form/div/div[1]/input")).sendKeys("gsatishkumar0209@gmail.com");
        wd.findElement(By.xpath("//div[@class='main-header']/div[1]/div[2]/form/div/div[2]/input")).click();
        wd.findElement(By.xpath("//div[@class='main-header']/div[1]/div[2]/form/div/div[2]/input")).clear();
        wd.findElement(By.xpath("//div[@class='main-header']/div[1]/div[2]/form/div/div[2]/input")).sendKeys("123456");
        wd.findElement(By.xpath("//div[@class='main-header']//button[.='Login']")).click();
        wd.findElement(By.xpath("//div[@class='modal-content']//button[.='Agree']")).click();
        wd.findElement(By.xpath("//ul[@class='links']//a[.='PROFILE']")).click();
        wd.findElement(By.cssSelector("p.changeI")).click();
        wd.findElement(By.id("photoLabel")).click();
        wd.findElement(By.id("fileId")).click();
        wd.findElement(By.xpath("//div[@id='gameSection']/div/app-profile/div/div[2]/div[3]")).click();
       
	}
    
   

	}

