package http;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class status {
	WebDriver driver;

	public void checkHttpCode(String url) throws InterruptedException {
		Response resp = given().get(url).then().extract().response();

		// System.out.println("status code="+resp.getStatusCode());
		int i = resp.getStatusCode();
		if (i == 200) {
			System.out.println("success");
		} else {
			System.out.println("Unsuccess");
			System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://site24.way2sms.com/content/index.html?");
			driver.findElement(By.id("username")).sendKeys("9014316925");
			driver.findElement(By.id("password")).sendKeys("9014316925");
			driver.findElement(By.id("loginBTN")).click();
		
			driver.findElement(By.id("sendSMS")).click();
			
			driver.switchTo().frame("frame");
			driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys("9014316925");
			driver.findElement(By.id("message")).sendKeys("server down please check your application");
			Thread.sleep(4000);
			driver.findElement(By.id("Send")).click();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		new status().checkHttpCode("http://agro.sia.co.in/");

	}

}