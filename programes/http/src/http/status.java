package http;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class status {
	

	public void checkHttpCode(String url) throws InterruptedException {
		Response resp = given().get(url).then().extract().response();

		// System.out.println("status code="+resp.getStatusCode());
		int i = resp.getStatusCode();
		if (i == 200) {
			System.out.println("success");
		} else {
			System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
			ChromeOptions chromeoption = new ChromeOptions();
			chromeoption.addExtensions(new File("/home/aj/Pictures/way2sms_v3.8.crx"));
			DesiredCapabilities desiredcapabilities = DesiredCapabilities.chrome();
			desiredcapabilities.setCapability(chromeoption.CAPABILITY, chromeoption);
			WebDriver driver = new ChromeDriver(desiredcapabilities);
			driver.manage().window().maximize();
			driver.get("http://site24.way2sms.com/content/index.html?");
			driver.findElement(By.id("username")).sendKeys("9014316925");
			driver.findElement(By.id("password")).sendKeys("9014316925");
			driver.findElement(By.id("loginBTN")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("sendSMS")).click();
			driver.switchTo().frame("frame");
			driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys("9599933252");
			driver.findElement(By.id("message")).sendKeys("hello");
			driver.findElement(By.id("Send")).click();

		}
	}

	public static void main(String[] args) throws InterruptedException {

		new status().checkHttpCode("http://agro.sia.co.in/");

	}

}