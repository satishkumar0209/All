package two;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FactoryBrowser 

{

	static WebDriver driver;
	@Test
	public static  WebDriver Browser(String name,String URL)
	{
		
		
		if (name.equalsIgnoreCase("firefox"))
		
		{

			driver = new FirefoxDriver();

		} 
		else if (name.equalsIgnoreCase("chrome")) 
		{

			System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
			
			driver = new ChromeDriver();

		}
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		return driver;
	}
	
}
