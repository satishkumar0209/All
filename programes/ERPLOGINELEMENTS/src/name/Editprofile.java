package name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Editprofile 
{
public static WebElement element;


public static WebElement Completeprofile1(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//span[@class='ui-button-text ui-c'])[3]"));
	
}
public static WebElement Completeprofile(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//span[@class='ui-button-text ui-c'])[4]"));
	
}

public static WebElement account(WebDriver driver)
{
	return driver.findElement(By.id("logoutModal"));
}


public static WebElement Logout(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@class='ui-g-12 ui-lg-12 ui-md-12 link_section'])[3]"));
	
}

//(.//span[@class='ui-button-text ui-c'])[5]
}
