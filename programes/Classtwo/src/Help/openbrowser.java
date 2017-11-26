package Help;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import two.FactoryBrowser;

public class openbrowser

{
	WebDriver driver;

	@Test
	public void login()

	{

		FactoryBrowser.Browser("chrome", "https://dribbble.com/session/new");
		
		driver.findElement(By.id("login")).sendKeys("testingmyswaasth@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("123456");
		
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
		
		driver.get("https://dribbble.com/shots");

	}

}
