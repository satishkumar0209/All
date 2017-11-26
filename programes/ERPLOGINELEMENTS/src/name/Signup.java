package name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup 
{
public static WebElement element;

public static WebElement fullname(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@placeholder='Your full name']"));
	
}
public static WebElement emailaddress(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@placeholder='Your email address']"));
	
}
public static WebElement mobilenumber(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@placeholder='Enter mobile number']"));
	
}
public static WebElement password(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@placeholder='Create password (minimum 6 character)']"));
	
}
public static WebElement Register(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@label='REGISTER']"));
	
}
public static WebElement OTP(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@formcontrolname='otp']"));
	
}
public static WebElement Verify(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@label='VERIFY']"));
	
}


public static WebElement Continue(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@label='continue']"));
	
}

public static WebElement Clinicname(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@placeholder='Enter clinic name']"));
	
}
public static WebElement EnterSpecialisation(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@placeholder='Enter Specialisation']"));
	
}
public static WebElement Autofillpsychiatry(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@class='ui-autocomplete-list-item ui-corner-all'])[2]"));
	
}
public static WebElement Autofillpediatrics(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@class='ui-autocomplete-list-item ui-corner-all'])[1]"));
	
}

public static WebElement AutofillAddress(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@placeholder='Enter your address']"));
	
}

public static WebElement place(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@placeholder='Enter your address']"));
	
}

public static WebElement photo1(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@name='photo'])[1]"));
	
}
public static WebElement photo2(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@name='photo'])[2]"));
	
}
public static WebElement photo3(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@name='photo'])[3]"));
	
}

public static WebElement Continue2(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@label='continue']"));
	
}

public static WebElement Clinicphonenumber(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@placeholder='Enter clinic phone number']"));
	
}

public static WebElement Continue1(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@label='continue']"));
	
}

public static WebElement Logout(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@label='Logout']"));
	
}


}
