package http;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://m.lottery1.sia.co.in/#/home");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-home/ion-content/div[2]/div/form/ion-grid/ion-row[1]/ion-col[2]/ion-input/input")).sendKeys("gsatishkumar0209@gmail.com");
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-home/ion-content/div[2]/div/form/ion-grid/ion-row[2]/ion-col[2]/ion-input/input")).sendKeys("143143");
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-home/ion-content/div[2]/div/form/ion-grid/button/span")).click();
		Thread.sleep(5000);
		WebElement s=driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-welcome/ion-content/div[2]/user-info/div/ion-row[2]/ion-col[3]/span"));
		System.out.println(s.getText());
		
		
		
		
//		driver.get("http://site24.way2sms.com/content/index.html?");
//		driver.findElement(By.id("username")).sendKeys("9014316925");
//		driver.findElement(By.id("password")).sendKeys("9014316925");
//		driver.findElement(By.id("loginBTN")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("sendSMS")).click();
//		
//		
//		driver.switchTo().frame("frame");
//		driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys("7065996703");
//		driver.findElement(By.id("message")).sendKeys("hello");
//		
//		
//
//		driver.findElement(By.id("Send")).click();
//		Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[@id='divExtnPopup']/a/img")).click();
		                             
		System.out.println("Unsuccess");																																																																																																																																																																																																																																																																																																																																																																																																																	
	
		
	}

}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		