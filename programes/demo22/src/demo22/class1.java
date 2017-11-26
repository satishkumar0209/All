package demo22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class class1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		//Open a chrome browser
	System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	//window maximize
	
	driver.manage().window().maximize();
	
	//pass the url to browser in 2 ways
	
	
	driver.get("https://www.facebook.com/");
	//driver.navigate().to("https://www.facebook.com/");
	
	
	
	Thread.sleep(9000);
	Select dropdown=new Select(driver.findElement(By.name("birthday_day")));
	dropdown.selectByValue("7");
	
	Select dropdown1=new Select(driver.findElement(By.id("month")));
	dropdown1.selectByVisibleText("Aug");
	
	Select dropdown2=new Select(driver.findElement(By.xpath(".//*[@title='Year']")));
	dropdown2.selectByIndex(2);
	}

}
