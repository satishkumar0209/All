package name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginElements 
{
public static WebElement element;

public static WebElement EmailId(WebDriver driver)
{
	return driver.findElement(By.cssSelector("[placeholder='Enter Email Address']"));
	       	
}

public static WebElement Password(WebDriver driver )
{
	return driver.findElement(By.cssSelector("[placeholder=' Password']"));
	
}

public static WebElement loginbutton(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@type='submit']"));
	
}
public static WebElement dropdown(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@class='ui-dropdown-label ui-inputtext ui-corner-all'])[8]"));
	
}
public static WebElement Selectclinic(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@class='ui-helper-clearfix'])[1]"));
	
}
public static WebElement Createclinic(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@class='ui-helper-clearfix'])[2]"));
	
}
public static WebElement Completeprofile(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@class='ui-helper-clearfix'])[2]"));
	
}
public static WebElement clinicone(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@class='ui-helper-clearfix'])[2]"));
	
}

public static WebElement Gotoclinic(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@class='ui-button-text ui-c'])[21]"));
	
}

}
