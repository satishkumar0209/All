package demo22;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		//window maximize
		
		driver.manage().window().maximize();
		
		//pass the url to browser in 2 ways
		
		
		driver.get("https://myswaasth.com/home/login");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@icon='fa fa-facebook']")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		 
		for(String handle : allWindowHandles)
		{
			//driver.switchTo().window(handle);
			System.out.println("Window handle - > " + handle);
			
			//driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("901431692s");
		}
	}

}
