package pendingcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Casesrun.Homepagetable;
import POM.Cases;
import POM.Homepage;
import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Povertyincompany
{
	ATUTestRecorder recorder;
	@Test
	public void user() throws InterruptedException, ATUTestRecorderException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","Pending Poverty in company-",false);
		recorder.start();
		driver.get("http://designco.sia.co.in/");
		driver.manage().window().maximize();
		
		Login.username(driver).sendKeys("superadmin@gmail.com");
		System.out.println("Enter username successfully");
		
		Login.password(driver).sendKeys("password123");
		System.out.println("Enter password successfully");
		
		
		Login.loginbutton(driver).click();
		System.out.println("click login button successfully");
		
		Thread.sleep(9000);
		Homepage.cases(driver).click();
		System.out.println("successfully clicked cases button");
		
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println("Getting current url------"+url);
		Thread.sleep(3000);
		WebElement LangSection=Cases.wholeDiv(driver);
		List<WebElement> lang=LangSection.findElements(By.tagName("a"));

		for(int i=0; i< lang.size(); i++)

		{

		System.out.println(lang.get(i).getText());

		}
		driver.findElement(By.xpath("//*[@label='PENDING CASES']")).click();
		
		String currenturl=driver.getCurrentUrl();
		System.out.println("current url is:"+currenturl);
		
		List<WebElement> lang1=LangSection.findElements(By.tagName("a"));

		for(int i=0; i< lang1.size(); i++)

		{

		System.out.println(lang1.get(i).getText());

		}
		
		Cases.Choosesearchoption(driver).click();
		
		Cases.Searchinputfield(driver).sendKeys("poverty");
		
		Cases.ENERGYUSECHECKBOX(driver).click();
		
		
		Homepagetable.CHECKBOX(driver).click();
		
		
		List<WebElement>rows=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)"));
		System.out.println("Total no of rows="+rows.size());
		
		List<WebElement>cols=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr[1]/td)"));
		System.out.println("Total no of columns="+cols.size());
		
		for (int r=1;r<=rows.size();r++)
		{
			for(int c=1;c<=cols.size();c++)

		{
		try
		{
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)["+r+"]/td["+c+"]/span"));
		System.out.println(driver.findElement(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)["+r+"]/td["+c+"]/span")).getText()+"");
		}
		catch(Exception e)
		{
			
		}
			Thread.sleep(3000);
			System.out.println("\n");
		}
		}
		
		recorder.stop();
		driver.quit();
	}
}


	
	
	


