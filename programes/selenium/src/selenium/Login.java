package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://apiv4.sia.co.in/mahaflox");
		driver.findElement(By.id("id_username")).sendKeys("admin@innotical.com");
		driver.findElement(By.id("id_password")).sendKeys("admin_inno111");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		driver.get("https://apiv4.sia.co.in/mahaflox/authentication/account/");
		
		//Here you change email id
		driver.findElement(By.id("searchbar")).sendKeys("ms@ms.com");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.cssSelector("#result_list > tbody > tr > th > a")).click();
		driver.findElement(By.id("id_random")).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		driver.get("https://myswaastherp.sia.co.in/login");
		//Here change the email id
		driver.findElement(By.id("username")).sendKeys("ms@ms.com.com");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@label='SIGN IN']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/div/app-onboarding/div/div/app-main/div[1]/div/div[3]/otp-code/div/div/div/div/form/div[1]/input")).sendKeys(Keys.chord(Keys.CONTROL,"v"),"");
		driver.findElement(By.xpath("//*[@label='VERIFY']")).click();
		
		
		

	}

}
