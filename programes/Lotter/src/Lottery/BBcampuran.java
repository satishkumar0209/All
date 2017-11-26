package Lottery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BBcampuran {
	public void bb(WebDriver driver) throws InterruptedException{
		driver.get("http://lottery1.sia.co.in/#/profile/4d-3d-2d/BB-campuran");
		
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
		
		
		
	}

}
