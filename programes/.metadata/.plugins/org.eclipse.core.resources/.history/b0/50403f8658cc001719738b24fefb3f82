package Lottery;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public void login(WebDriver driver) throws InterruptedException{
		
		driver.findElement(By.xpath("(//*[@formcontrolname='username'])[1]")).sendKeys("priyanka");
		driver.findElement(By.xpath("(//*[@formcontrolname='password'])[1]")).sendKeys("123456");
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[4]")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		//Identify the WebElement which will appear after scrolling down
		WebElement element = driver.findElement(By.xpath("//*[@id='myModal']/div/div[3]/button[2]"));
		// now execute query which actually will scroll until that element is not appeared on page.
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		 driver.findElement(By.cssSelector("#myModal > div > div.ui-g-12.fotter-row > button:nth-child(2)")).click();
		driver.findElement(By.xpath("//*[@id='myModal']/div/div[3]/button[2]")).click();
		//driver.findElement(By.xpath("//*[@ng-reflect-label='Agree']")).click();
		
		
	}

}
