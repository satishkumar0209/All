package Agro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page 

{

	public static WebElement email(WebDriver driver)
	{
		return driver.findElement(By.id("username"));
	}
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.id("password"));
	}
	public static WebElement Loginbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@class='log-button allowed-cursor']"));
	}
	
}
