import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	static WebDriver driver;

	public static WebDriver browsernames(String name, String url) throws InterruptedException, IOException {

		if (name.equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("window-size-4000,1000");
			options.addArguments("headless");
			driver = new ChromeDriver(options);
			driver.get(url);
			System.out.println(url);
			driver.findElement(By.id("login")).sendKeys("testingmyswaasth@gmail.com");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath(".//*[@type='submit']")).click();
			driver.get("https://dribbble.com/shots");
			String imagexpath = "(//*[@class='dribbble-shot'])[";
			String actualimgxpath;
			for (int img = 1; img <= 10; img++) {
				actualimgxpath = imagexpath + img + "]";
				driver.findElement(By.xpath(actualimgxpath)).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath(".//*[@class='stats-label']")).click();
				Random rand = new Random();
				int Randomnumber = rand.nextInt(15);
				File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshotfile, new File("/home/aj/Desktop/Doctors/First" + Randomnumber + ".png"));
				String url11 = driver.getCurrentUrl();
				System.out.println("image url=" + url11);
				driver.navigate().back();

			}
			return driver;

		}
		return driver;
	}
}
