package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://myswaastherp.sia.co.in/login");
		//Here change the email id
		driver.findElement(By.id("username")).sendKeys("ms@ms.com");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@label='SIGN IN']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@label='continue']")).click();
		
	}

}
