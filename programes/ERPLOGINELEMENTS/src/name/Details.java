package name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Details 
{
public static WebElement eleemnt;


public static WebElement Documentsandcertificates(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='DOCUMENTS & CERTIFICATES']"));
	                                   	
}

public static WebElement Timings(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='TIMINGS']"));
	                                   	
}

public static WebElement Locationandphotos(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='LOCATION & PHOTOS']"));
	                                   	
}

public static WebElement Doctors(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='DOCTORS']"));
	                                   	
}
public static WebElement Services(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='SERVICES']"));
	                                   	
}

public static WebElement Clinicandcontactdetails(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='CLINIC & CONTACT DETAILS']"));
	                                   	
}

}
