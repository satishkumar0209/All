package mav.mav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Demo 

{
	
	ExtentReports report;
	ExtentTest done;
	WebDriver driver;

	@Test
	public void verifytestt()
	{ 
		

report=new ExtentReports("/home/aj/Desktop/Adhitya/automation.html");

report.startTest("Getting url");

System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		report.endTest(done);
		report.flush();
		
		driver.get("/home/aj/Desktop/Adhitya/automation.html");
		
		
		
		
	}
}
