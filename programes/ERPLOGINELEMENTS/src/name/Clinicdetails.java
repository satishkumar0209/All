package name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clinicdetails
{
	public static WebElement Name(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@formcontrolname='clinic_name']"));
		                                   	
	}
	
	public static WebElement clicnic(WebDriver driver)
	{
		return driver.findElement(By.xpath("(.//*[@class='ui-inputtext ui-widget ui-state-default ui-corner-all'])[2]"));
		                                   	
	}
	
	public static WebElement Clinicname(WebDriver driver)
	{
		return driver.findElement(By.xpath("(.//*[@class='ui-autocomplete-list-item ui-corner-all'])[1]"));
		                                   	
	}
	
	public static WebElement Aboutclinic(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@formcontrolname='about_clinic']"));
		                                   	
	}
	
	public static WebElement Logo(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@formcontrolname='mobile']"));
		                                   	
	}
	
	public static WebElement contactnumber(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@formcontrolname='email']"));
		                                   	
	}
	
	
	public static WebElement logo(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@label='UPDATE']"));
		                                   	
	}
	
	
}
