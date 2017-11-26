package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:myswaastherp.sia.co.in");
		driver.findElement(By.xpath(".//*[@placeholder='Your full name']")).sendKeys("satish");
		driver.findElement(By.xpath(".//*[@placeholder='Your email address']")).sendKeys("ms@ms.com");
		driver.findElement(By.xpath(".//*[@placeholder='Your mobile number']")).sendKeys("0101010101");
		driver.findElement(By.xpath(".//*[@placeholder='Create password (minimum 6 character)']")).sendKeys("123456");
		driver.findElement(By.xpath("//span[text()='REGISTER']")).click();
		//ul/li[contains(text(), "Second")]//li[text()="Second"]
		driver.findElement(By.xpath(".//*[@placeholder='Create password (minimum 6 character)']")).sendKeys(Keys.ENTER);
		
		

	}

}
