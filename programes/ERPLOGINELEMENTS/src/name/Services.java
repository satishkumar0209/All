package name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Services
{
	public static WebElement element;


	public static WebElement Procedurename(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@placeholder='Sample Service'][1]"));
		
}
	
	public static WebElement Procedureamount(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@formcontrolname='amount']"));
		
}
public static WebElement Plusbutton(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@label='+']"));
	
}
public static WebElement profile(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='PROFILES']"));
	
}
}
