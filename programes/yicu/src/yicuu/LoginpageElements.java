package yicuu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginpageElements

{

	public static WebElement element;
	 
	public static WebElement email(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("[formcontrolname='email']"));
	}
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("[formcontrolname='pass']"));
	}
	public static WebElement sec(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("div.wrp-log"));
	}
	public static WebElement Emailheader(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("p.head-name"));
		
	}

	public static WebElement passwordheader(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='head-name'])[2]"));
		
	}
	
	
	public static WebElement Loginbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@type='button']"));
		
	}

}
