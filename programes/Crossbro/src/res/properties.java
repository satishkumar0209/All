package res;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class properties {

	public static void main(String[] args) 
	{
		
		
		
	
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("");
		
		File f=new File("/home/aj/Pictures/programes/Crossbro/satish.properties");
		
		properties p=new properties();
		
	
	p.load(f);
	
	
	driver.findElement(By.xpath(p.getproperty("username"))).sendkeys("");
	
	
	
	
	
		
		
		
		
		
	}

}
