import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fb {

	public static void main(String[] args) throws InterruptedException {
		
		
	
		
		Map<String, Object> prefs = new HashMap<String, Object>();

		//Put this into prefs map to switch off browser notification
		prefs.put("profile.default_content_setting_values.notifications", 1);

		//Create chrome options to set this prefs
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		//Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("peloteando2@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("peloteando@123");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(4000);
		//Create prefs map to store all preferences 
		

	}

}
