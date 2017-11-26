package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ONEDOCTOR {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kidsclinic.sia.co.in/");

		//First book appointment
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[1]")).click();
		//Pop-up book appointment
		driver.findElement(By.xpath("(//*[@class='doctor-name'])[1]")).click();
		//Doctor book appointment
		driver.findElement(By.xpath("//*[@label='BOOK APPOINTMENT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='ui-inputtext ui-widget ui-state-default ui-corner-all']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("26")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='1:30 PM'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[2]")).click();
		
		//mobile
		driver.findElement(By.xpath("(//*[@class='ng-untouched ng-pristine ng-invalid ui-inputtext ui-corner-all ui-state-default ui-widget'])[1]")).sendKeys("9433141529");
		//patient name 
		driver.findElement(By.xpath("//*[@ng-reflect-name='patient_name']")).sendKeys("satish kumar");
		//email
		driver.findElement(By.xpath("//*[@class='ng-untouched ng-pristine ng-valid ui-inputtext ui-corner-all ui-state-default ui-widget']")).sendKeys("mss@msss.com");
				
		
	}

}
