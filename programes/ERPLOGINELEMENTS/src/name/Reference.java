package name;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class Reference 
{
	public static WebDriver driver;
@Test
public void login() throws InterruptedException, AWTException
{
Robot robot=new Robot();

	System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://myswaastherp.sia.co.in/#/login");
	
	
	//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t"); 
	
	
	driver.manage().window().fullscreen();
	WebElement body = driver.findElement(By.cssSelector("body"));
			body.sendKeys(Keys.CONTROL + "t");

	/*driver.get("https://myswaastherp.sia.co.in/#/login");
	
	driver.manage().window().maximize();
	
	LoginElements.EmailId(driver).sendKeys("bingo@gmail.com	");
	
	LoginElements.Password(driver).sendKeys("123456789");
	
	LoginElements.loginbutton(driver).click();
	Thread.sleep(3000);
	
	
	
	driver.findElement(By.xpath("(.//*[@name='photo'])[1]")).click();
	
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);

	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
Thread.sleep(3000);
	
	
	
	driver.findElement(By.xpath("(.//*[@name='photo'])[2]")).click();
	
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);

	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	driver.get("https://myswaastherp.sia.co.in/#/home/profile/c/my-clinic/document-certificates");
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.id("image1_container"));
	element.click();
	
	Thread.sleep(3000);
	
	robot.keyPress(KeyEvent.VK_ALT);
	robot.keyPress(KeyEvent.VK_S);
	
	robot.keyRelease(KeyEvent.VK_ALT);
	robot.keyRelease(KeyEvent.VK_S);
	
	robot.keyPress(KeyEvent.VK_1);
	robot.keyRelease(KeyEvent.VK_1);
	
	robot.keyPress(KeyEvent.VK_DEAD_ABOVEDOT);
	
	

	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);

	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	

	
	
	
	
	Thread.sleep(10000);
	
	driver.findElement(By.id("image2_container")).click();
	Thread.sleep(3000);
	
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	Editprofile.profilecompletepercentage(driver).click();
	
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	ClinicDetails.Documentsandcertificates(driver).click();
	
	
	
	
*/	
	
	
}
}
