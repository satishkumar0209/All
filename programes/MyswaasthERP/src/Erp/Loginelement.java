package Erp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginelement 
{
	@Test
	public void testPageTitle() {
		System.out.println("Launching Firefox browser..");
		
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("http://google.com");

				String expPageTitle = "Google";
		//boolean flag = true;
		if (driver.getTitle().equalsIgnoreCase(expPageTitle)) {
			
			
			System.out.println("Yeah... Page title matched");
		}
		//Assert.assertTrue(flag, "Page title is not matching with expected");
	}
}

