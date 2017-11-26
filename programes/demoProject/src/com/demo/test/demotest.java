package com.demo.test;
import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class demotest {
	
	public static String baseURL ="https://myswaastherp.sia.co.in";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(baseURL);

		//driver.findElement(By.xpath(".//*[text()='Login']")).click();
		//driver.findElement(By.xpath("html/body/app-root/div/app-onboarding/div/div/app-main/div[1]/div/div[1]/div[4]/ul/li[4]/a")).click();
		driver.findElement(By.cssSelector("[ng-reflect-router-link='/login']")).click();
		//driver.findElement(By.cssSelector("body > app-root > div > app-onboarding > div > div > app-main > div.main > div > div.ui-g-12.ui-g-nopad > div.ui-g-9.ui-md-10.item > ul > li:nth-child(4) > a")).click();
		
		System.out.println("Please wait for some time");
		
		Thread.sleep(5000);
		
		driver.quit();
		// TODO Auto-generated method stub

	}

}
