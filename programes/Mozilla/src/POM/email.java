package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class email {
	public email(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="placeholder='Username'")
	public WebElement Email;

	@FindBy(css="placeholder='Password'")
	public WebElement password;

	@FindBy(xpath=".//*[@type= 'submit']")
	public WebElement button;
	public static WebDriver driver;
	
	
	public void usermain(String user3) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver");
		 driver=new ChromeDriver();	
		driver.get("http://designco.sia.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	public void validuser(String user)
	{
		Email.sendKeys("satishkumar@gmail.com");
		password.sendKeys("satish");
		button.click();		
	}
	public void invaliduser(String user2)
	{
		Email.sendKeys("kumar@gmail.com");
		password.sendKeys("satish");
		button.click();
			
	}

}