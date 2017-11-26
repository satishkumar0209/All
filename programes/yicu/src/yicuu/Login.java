package yicuu;

import org.openqa.selenium.By;
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
	
	driver.get("http://yicuadmin.sia.co.in/login");
	
	driver.manage().window().maximize();
	
	WebElement element1=LoginpageElements.sec(driver);
	Highlight.highLightElement(driver, element1);
	System.out.println("Section is verified");
	
	WebElement element2=LoginpageElements.Emailheader(driver);
	Highlight.highLightElement(driver, element2);
	System.out.println("Email header is verified");
	
	WebElement element3=LoginpageElements.passwordheader(driver);
	Highlight.highLightElement(driver, element3);
	System.out.println("password header is verified");
	
	
	WebElement element4=LoginpageElements.Loginbutton(driver);
	Highlight.highLightElement(driver, element4);
	System.out.println("Logintbutton is verified");
	
	WebElement element=LoginpageElements.email(driver);
	Highlight.highLightElement(driver, element);
	//LoginpageElements.email(driver).sendKeys("123456");
	
	
	WebElement element6=LoginpageElements.password(driver);
	Highlight.highLightElement(driver, element6);
	//LoginpageElements.email(driver).sendKeys("123456");
	
	
	System.out.println(driver.getCurrentUrl());
	
	System.out.println(driver.getTitle());
	
	//System.out.println(driver.getPageSource());
	
	

}
}
