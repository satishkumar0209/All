package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pageFoctory 
{

	static WebDriver driver;

	public static WebDriver startbrowser(String Browsername, String URL) 
	{

		if (Browsername.equals("Firefox")) 
		{

			driver = new FirefoxDriver();

		} 
		else if (Browsername.equals("chrome")) 
		{

			System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
			
			driver = new ChromeDriver();

		}
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		return driver;

	}
}
