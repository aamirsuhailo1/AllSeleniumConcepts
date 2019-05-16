package com.qadevelopers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascriptAlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// add browser settings using chromeOptions
		ChromeOptions cop = new ChromeOptions();
		cop.addArguments("start-maximized");
		cop.addArguments("--incognito");
		cop.addArguments("--disable-extensions");
		
		//Launch Chrome
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		WebDriver driverCC = new ChromeDriver(cop);
		driverCC.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driverCC.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		Alert alert = driverCC.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("Text on alert is : "+alert.getText());
		alert.accept();
		Thread.sleep(3000);
		
		driverCC.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]")).click();
		Thread.sleep(3000);
		alert.dismiss();
		Thread.sleep(3000);
		
		driverCC.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
		Thread.sleep(3000);	
		alert.sendKeys("aamir");
		Thread.sleep(3000);
		alert.accept();
		
		driverCC.quit();
		

	}

}
