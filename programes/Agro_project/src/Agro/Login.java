package Agro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login 
{
	@Test()
	public void login()

	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://agrofront.sia.co.in/");
		
		driver.manage().window().maximize();
	
		WebElement username=Login_page.email(driver);
		Highlight.highLightElement(driver, username);
		username.sendKeys("admin@gmail.com");
		
		WebElement password=Login_page.password(driver);
		Highlight.highLightElement(driver, password);
		password.sendKeys("password");
		
		
		WebElement loginbutton=Login_page.Loginbutton(driver);
		Highlight.highLightElement(driver, loginbutton);
		loginbutton.click();
		
	}
	
}
