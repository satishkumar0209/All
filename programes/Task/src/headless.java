import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class headless

{
	WebDriver driver;

	public headless() {
		this.driver = driver;
	}

	public void Dribble() throws InterruptedException
	{
		driver.findElement(By.id("login")).sendKeys("testingmyswaasth@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
		Thread.sleep(5000);
		driver.get("https://dribbble.com/shots");
		String imagexpath = "(//*[@class='dribbble-shot'])[";
		String actualimgxpath;
		for (int img = 1; img <= 10; img++) {
			actualimgxpath = imagexpath + img + "]";
			driver.findElement(By.xpath(actualimgxpath)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@class='stats-label']")).click();
			String url = driver.getCurrentUrl();
			System.out.println("image url=" + url);
			driver.navigate().back();
		
		}
		
	}
}
