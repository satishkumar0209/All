package Lottery;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Bolakbalik {

	
	public void bbalik(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id='gameSection']/div/app-four-three-two-d/div/div[2]/div[1]/p[2]/span[3]")).click();
		driver.get("http://lottery1.sia.co.in/#/profile/4d-3d-2d/bolak-balik");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@formcontrolname='bet']")).sendKeys("2345");
		driver.findElement(By.xpath("//*[@formcontrolname='amount']")).sendKeys("1");
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[20]")).click();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		WebElement element = driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]"));

		je.executeScript("arguments[0].scrollIntoView(true);",element);
		
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[21]")).click();
		
		
		
		
		
		
	}
}
