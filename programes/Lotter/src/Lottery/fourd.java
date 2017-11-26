package Lottery;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class fourd {

	
		public void fgame(WebDriver driver) throws InterruptedException {
			
			
//			Thread.sleep(5000);
//	        driver.findElement(By.xpath("//*[@id='myId']/app-root/div/div[2]/div/div/div/ul/li[5]")).click();        
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[6]")).click();
	        driver.get("");
	        Thread.sleep(5000);
	        driver.findElement(By.id("betcheckbox0")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.id("w0")).sendKeys("5");
	        driver.findElement(By.id("x0")).sendKeys("2");
	        driver.findElement(By.id("y0")).sendKeys("3");
	        driver.findElement(By.id("z0")).sendKeys("6");
	        driver.findElement(By.id("betTextBox0")).sendKeys("1000");
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,800)", "");
	        driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]")).click();
	        
			
			
		}
		
		
		public void second(WebDriver driver){
			
		}
		}
		

	


