package sa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dfdfg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/home/aj/Pictures/geckodriver");
		WebDriver wd=new FirefoxDriver();
		wd.manage().window().maximize();
		 wd.get("http://lottery1.sia.co.in/");
		 new Actions(wd).moveToElement(wd.findElement(By.id("imgg"))).build().perform();
	        new Actions(wd).moveToElement(wd.findElement(By.xpath("//app-root/div/div[4]/div/app-home/div/div/div[1]/div[1]/div"))).build().perform();
	        new Actions(wd).moveToElement(wd.findElement(By.cssSelector("marquee"))).build().perform();
	        new Actions(wd).moveToElement(wd.findElement(By.xpath("//ul[@class='links']//a[.='HELP']"))).build().perform();
	        new Actions(wd).moveToElement(wd.findElement(By.xpath("//div[@class='main-header']/div[1]/div[2]/form/div/div[2]/input"))).build().perform();
	        wd.findElement(By.xpath("//div[@class='main-header']/div[1]/div[2]/form/div/div[2]/input")).click();
	        wd.findElement(By.xpath("//div[@class='main-header']/div[1]/div[2]/form/div/div[2]/input")).clear();
	        wd.findElement(By.xpath("//div[@class='main-header']/div[1]/div[2]/form/div/div[2]/input")).sendKeys("priyanka");
	        new Actions(wd).moveToElement(wd.findElement(By.xpath("//div[@class='main-header']/div[1]/div[2]/form/div/div[2]"))).build().perform();
	        new Actions(wd).moveToElement(wd.findElement(By.xpath("//div[@class='main-header']/div[1]/div[2]/form/div/div[3]/input"))).build().perform();
	 
	        wd.findElement(By.xpath("//div[@class='main-header']/div[1]/div[2]/form/div/div[3]/input")).sendKeys("123456");
	       
	        wd.findElement(By.xpath("//div[@class='main-header']//button[.='Login']")).click();
	        new Actions(wd).moveToElement(wd.findElement(By.xpath("//div[@class='modal-content']/div[2]"))).build().perform();
	    new Actions(wd).moveToElement(wd.findElement(By.id("myModal"))).build().perform();
	        new Actions(wd).moveToElement(wd.findElement(By.cssSelector("html"))).build().perform();
	        new Actions(wd).moveToElement(wd.findElement(By.id("myModal"))).build().perform();
	        new Actions(wd).moveToElement(wd.findElement(By.cssSelector("html"))).build().perform();
	        new Actions(wd).moveToElement(wd.findElement(By.id("myModal"))).build().perform();
	       // new Actions(wd).moveToElement(wd.findElement(By.cssSelector("div.ui-g-12.fotter-row"))).build().perform();
	     //   new Actions(wd).moveToElement(wd.findElement(By.xpath("//div[@class='modal-content']//button[.='Agree']"))).build().perform();
	        wd.findElement(By.xpath("//div[@class='modal-content']//button[.='Agree']")).click();
	        new Actions(wd).moveToElement(wd.findElement(By.xpath("//app-root/div/div[4]/div/app-home/div/div/div[3]/div[4]/div/div[1]/img"))).build().perform();
	        new Actions(wd).moveToElement(wd.findElement(By.xpath("//app-root/div/div[4]/div/app-home/div/div/div[4]/div[2]/div/div[2]/div[3]"))).build().perform();
	        new Actions(wd).moveToElement(wd.findElement(By.xpath("//app-root/div/div[4]/div/app-home/div/div/div[2]"))).build().perform();
	        wd.quit();	}

}
