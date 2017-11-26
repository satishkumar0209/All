package name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locationandphotos 
{
	public static WebElement element;


	public static WebElement Streetaddress(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@formcontrolname='about_clinic']"));
		
}
	public static WebElement updatebutton(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@label='UPDATE']"));
		
}
	
	public static WebElement Uploadimages(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@name='photo']"));
		
}
	
	
	
	
}

